<?php

// Concrete Implementation of PayPal Class
class PayPal {

    public function __construct() {
        // Your Code here //
    }

    public function sendPayment1($amount) {
        // Paying via Paypal //
        echo "Paying via PayPal: ". $amount;

    }
}

//if Paypal changes the sendPayment method then API will not work for our class
//$paypal = new PayPal();
//$paypal->sendPayment('2629');