<?php

/**
 * Book is a concrete and standard paper book.
 */
include ('PaperBookInterface.php');
include ('EBookAdapter.php');
include ('EBookInterface.php');
include ('Kindle.php');
class Book implements PaperBookInterface
{
    /**
     * {@inheritdoc}
     */
    public function open()
    {
        echo "Book opened.";
    }

    /**
     * {@inheritdoc}
     */
    public function turnPage()
    {
    }
}

$kindle = new EBookAdapter(new Kindle());
$kindle->open();