package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";

        // When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

    @Test
    void testUpdateBestsellers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE books SET IS_BESTSELLER = 0";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        String checkRentsBeforeUpdate = "SELECT COUNT(DISTINCT book_id) AS HOW_MANY FROM rents GROUP BY book_id HAVING COUNT(*) > 2";
        ResultSet rsRentsBeforeUpdate = statement.executeQuery(checkRentsBeforeUpdate);
        int howManyRentedBestsellersBeforeUpdate = -1;
        if(rsRentsBeforeUpdate.next()) {
            howManyRentedBestsellersBeforeUpdate = rsRentsBeforeUpdate.getInt("HOW_MANY");
        }

        String sqlCheckBooksBeforeUpdate = "SELECT COUNT(DISTINCT book_id) AS HOW_MANY FROM books WHERE IS_BESTSELLER = 1";
        ResultSet rsBooksBeforeUpdate = statement.executeQuery(sqlCheckBooksBeforeUpdate);
        int bestsellerBooksBeforeUpdate = -1;
        if(rsBooksBeforeUpdate.next()) {
            bestsellerBooksBeforeUpdate = rsBooksBeforeUpdate.getInt("HOW_MANY");
        }

        // When
        String sqlUpdateBestsellers = "CALL UpdateBestsellers()";
        statement.execute(sqlUpdateBestsellers);

        String sqlCheckAfterUpdate = "SELECT COUNT(DISTINCT book_id) AS HOW_MANY FROM books WHERE IS_BESTSELLER = 1";
        ResultSet rsAfterUpdate = statement.executeQuery(sqlCheckAfterUpdate);
        int actualBestsellersAfterUpdate = -1;
        if(rsAfterUpdate.next()) {
            actualBestsellersAfterUpdate = rsAfterUpdate.getInt("HOW_MANY");
        }

        // Then
        assertEquals(0, bestsellerBooksBeforeUpdate);
        assertEquals(howManyRentedBestsellersBeforeUpdate, actualBestsellersAfterUpdate);

        rsBooksBeforeUpdate.close();
        rsRentsBeforeUpdate.close();
        rsAfterUpdate.close();
        statement.close();
    }
}