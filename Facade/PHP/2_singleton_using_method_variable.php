<?php
/**
 * Singleton class
 */
final class MySingletonClass {

    /**
     * Call this method to get singleton
     * @return MySingletonClass
     */
    public static function Instance() {
        static $inst = null;
        if ($inst === null) {
            $inst = new MySingletonClass();
        }
        return $inst;
    }

    /**
     * Private constructor so nobody else can instance it
     */
    private function __construct() {}
    
}

$fact = MySingletonClass::Instance();
$fact2 = MySingletonClass::Instance();

echo "[".($fact === $fact2)."]";
$fact = new MySingletonClass();


//http://stackoverflow.com/questions/203336/creating-the-singleton-design-pattern-in-php5