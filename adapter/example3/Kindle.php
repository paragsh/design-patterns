<?php

/**
 * Kindle is a concrete electronic book.
 */
class Kindle implements EBookInterface
{
    /**
     * {@inheritdoc}
     */
    public function pressNext1()
    {
        echo "Pressed Started";
    }

    /**
     * {@inheritdoc}
     */
    public function pressStart()
    {
        echo "Pressed Started";
    }
}