package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1, "johnsmith1", 'M', LocalDate.of(1990, 5, 15), 10));
        forumUserList.add(new ForumUser(2, "emmanuale42", 'M', LocalDate.of(1985, 9, 3), 5));
        forumUserList.add(new ForumUser(3, "lisawalker7", 'F', LocalDate.of(1992, 12, 28), 20));
        forumUserList.add(new ForumUser(4, "davidjones2", 'M', LocalDate.of(1988, 6, 10), 15));
        forumUserList.add(new ForumUser(5, "sarahbrown3", 'F', LocalDate.of(1995, 2, 7), 8));
        forumUserList.add(new ForumUser(6, "michaeljohnson4", 'M', LocalDate.of(1987, 11, 19), 12));
        forumUserList.add(new ForumUser(7, "jessicasmith5", 'F', LocalDate.of(1993, 8, 25), 18));
        forumUserList.add(new ForumUser(8, "adamwilson6", 'M', LocalDate.of(1991, 3, 12), 3));
        forumUserList.add(new ForumUser(9, "mariagarcia8", 'F', LocalDate.of(1994, 7, 21), 6));
        forumUserList.add(new ForumUser(10, "robertthomas9", 'M', LocalDate.of(1997, 10, 30), 14));
        forumUserList.add(new ForumUser(11, "sophiajackson10", 'F', LocalDate.of(1989, 4, 5), 9));
        forumUserList.add(new ForumUser(12, "williamtaylor11", 'M', LocalDate.of(1996, 1, 17), 7));
        forumUserList.add(new ForumUser(13, "olivialopez12", 'F', LocalDate.of(1998, 11, 26), 11));
        forumUserList.add(new ForumUser(14, "danielmartinez13", 'M', LocalDate.of(1991, 6, 8), 16));
        forumUserList.add(new ForumUser(15, "mialong14", 'F', LocalDate.of(1994, 3, 2), 4));
        forumUserList.add(new ForumUser(16, "ethancarter15", 'M', LocalDate.of(1997, 8, 13), 17));
        forumUserList.add(new ForumUser(17, "ameliahill16", 'F', LocalDate.of(1990, 12, 24), 13));
        forumUserList.add(new ForumUser(18, "jacobroberts17", 'M', LocalDate.of(1995, 2, 6), 9));
        forumUserList.add(new ForumUser(19, "emilystewart18", 'F', LocalDate.of(1987, 10, 18), 5));
        forumUserList.add(new ForumUser(20, "matthewmorgan19", 'M', LocalDate.of(1993, 5, 31), 8));
        forumUserList.add(new ForumUser(21, "gracelee20", 'F', LocalDate.of(1996, 9, 9), 12));
        forumUserList.add(new ForumUser(22, "davidphillips21", 'M', LocalDate.of(1991, 1, 22), 10));
        forumUserList.add(new ForumUser(23, "victoriawalker22", 'F', LocalDate.of(1988, 4, 4), 15));
        forumUserList.add(new ForumUser(24, "jacksonharris23", 'M', LocalDate.of(1995, 7, 15), 6));
        forumUserList.add(new ForumUser(25, "sophieedwards24", 'F', LocalDate.of(1992, 11, 27), 11));
        forumUserList.add(new ForumUser(26, "andrewturner25", 'M', LocalDate.of(1997, 3, 9), 9));
        forumUserList.add(new ForumUser(27, "scarlettprice26", 'F', LocalDate.of(1990, 6, 21), 4));
        forumUserList.add(new ForumUser(28, "williamrobinson27", 'M', LocalDate.of(1993, 9, 3), 18));
        forumUserList.add(new ForumUser(29, "zoehoward28", 'F', LocalDate.of(1996, 12, 14), 7));
        forumUserList.add(new ForumUser(30, "dylanparker29", 'M', LocalDate.of(1991, 2, 26), 16));
        forumUserList.add(new ForumUser(31, "hannahcooper30", 'F', LocalDate.of(1989, 5, 9), 13));
        forumUserList.add(new ForumUser(32, "ethanjohnson31", 'M', LocalDate.of(1994, 8, 20), 5));
        forumUserList.add(new ForumUser(33, "oliviaedwards32", 'F', LocalDate.of(1997, 11, 1), 10));
        forumUserList.add(new ForumUser(34, "noahrodriguez33", 'M', LocalDate.of(1990, 4, 13), 8));
        forumUserList.add(new ForumUser(35, "avasanders34", 'F', LocalDate.of(1993, 7, 25), 14));
        forumUserList.add(new ForumUser(36, "liamhughes35", 'M', LocalDate.of(1996, 11, 6), 6));
        forumUserList.add(new ForumUser(37, "sophiaclark36", 'F', LocalDate.of(1991, 2, 17), 11));
        forumUserList.add(new ForumUser(38, "jamesstewart37", 'M', LocalDate.of(1988, 5, 31), 9));
        forumUserList.add(new ForumUser(39, "isabellahill38", 'F', LocalDate.of(1995, 9, 11), 5));
        forumUserList.add(new ForumUser(40, "masonmitchell39", 'M', LocalDate.of(1992, 12, 22), 7));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
