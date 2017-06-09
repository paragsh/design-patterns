<?php

class paypalAdapter implements paymentInterface {

    private $paypal;

    public function __construct(PayPal $paypal) {
        $this->paypal = $paypal;
    }

    public function pay($amount) {
        $this->paypal->sendPayment1($amount);
    }
}

// Client Code
$paypal = new paypalAdapter(new PayPal());
$paypal->pay('2629');