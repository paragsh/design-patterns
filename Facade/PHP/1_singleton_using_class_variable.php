<?php

class MySingletonClass
{
    ///Condition 1 - Presence of a static member variable
    private static $_instance = null;

    ///Condition 2 - Locked down the constructor
    private function  __construct() { } //Prevent any oustide instantiation of this class

    ///Condition 3 - Prevent any object or instance of that class to be cloned
    private function  __clone() { } //Prevent any copy of this object

    ///Condition 4 - Have a single globally accessible static method
    public static function getInstance() {
        if( !is_object(self::$_instance) )  //or if( is_null(self::$_instance) ) or if( self::$_instance == null )
            self::$_instance = new MySingletonClass();
        return self::$_instance;
    }

    ///Now we are all done, we can now proceed to have any other method logic we want

    //a simple method to echo something
    public function GreetMe() {
        echo '<br />Hello, this method is called by using a singleton object..';
    }
    
}//END Class

///Testing some calls to that class
$obj1 = MySingletonClass::getInstance();
$obj2 = MySingletonClass::getInstance();
$obj3 = MySingletonClass::getInstance();

$obj1->GreetMe();
$obj2->GreetMe();
$obj3->GreetMe();

// http://7php.com/how-to-code-a-singleton-design-pattern-in-php-5/