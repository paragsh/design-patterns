<?php

/*
 * Regular example
 *
 */

interface shape
{
    public function draw();
}

class position
{
}

class square implements shape
{
    private $position;

    public function __construct($pos)
    {
        $this->position = $pos;
    }

    public function draw()
    {
        echo "Hey inside square draw";
    }

}

// traditional way to create object
$square = new square(new position);
$square->draw();

/*
 * Factory example
 *
 */

class shapeFactory
{
    public function create($type)
    {
        if ($type === "square") {
            return new square(new position);
        }
    }
}

$factory = new shapeFactory;
$square = $factory->create('square');
$square->draw();


