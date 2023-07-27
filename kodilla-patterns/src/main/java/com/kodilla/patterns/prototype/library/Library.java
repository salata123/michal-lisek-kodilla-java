package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    final String name;
    final Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        for (Book book : clonedLibrary.getBooks()) {
            clonedLibrary.getBooks().add(book);
        }
        return clonedLibrary;
    }
}