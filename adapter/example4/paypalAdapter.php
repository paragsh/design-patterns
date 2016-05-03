<?php

include ('paymentInterface.php');
include ('Paypal.php' );
include ('Paytm.php' );
class paymentAdapter
{
    private $adapter;
    public function __construct(paymentInterface1 $paypal)
    {
        $this->adapter = $paypal;
    }

    public function onlinePayment()
    {
        $this->adapter->neft();
    }
}

$obj = new paymentAdapter(new PayPal());
$obj->onlinePayment();

$obj1 = new paymentAdapter(new Paytm());
$obj1->onlinePayment();