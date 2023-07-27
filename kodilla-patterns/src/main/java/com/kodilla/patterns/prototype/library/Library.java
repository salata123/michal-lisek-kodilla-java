package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;


import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    final String name;
    private Set<Book> books = new HashSet<>();

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
        clonedLibrary.books = new HashSet<>();
        for (Book book : this.books) {
            clonedLibrary.getBooks().add(book);
        }
        return clonedLibrary;
    }
}