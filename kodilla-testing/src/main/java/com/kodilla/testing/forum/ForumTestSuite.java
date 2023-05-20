package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Forum Test Suite")
class ForumTestSuite {

    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUsername should return correct name"
    )

    @Test
    void testCaseUsername() {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        String expectedResult = "theForumUser";


        Assertions.assertEquals(expectedResult, result);
    }
}