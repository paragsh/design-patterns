<?php

class Library_Facade
{
    public function returnBooks() {
        // previous implementation by calling necessary classes
    }

    public function borrowBooks() {
    }

    public function searchBooks() {
    }

    public function reserveBooks() {
    }
}


class User
{
    public function borrowBook() {
        $libraryFacade = new Library_Facade();
        $libraryFacade->borrowBook();
    }
}

// http://code.tutsplus.com/tutorials/design-patterns-the-facade-pattern--cms-22238
