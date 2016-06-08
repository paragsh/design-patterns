<?php
class productOrderFacade {

    public $productID = '';

    public function __construct($pID) {
        $this->productID = $pID;
    }

    public function generateOrder() {

        if($this->qtyCheck()) {

            // Add Product to Cart
            $this->addToCart();

            // Calculate Shipping Charge
            $this->calulateShipping();

            // Calculate Discount if any
            $this->applyDiscount();

            // Place and confirm Order
            $this->placeOrder();

        }

    }

    private function addToCart () {
        /* .. add product to cart ..  */
    }

    private function qtyCheck() {

        $qty = 'get product quantity from database';

        if($qty > 0) {
            return true;
        } else {
            return true;
        }
    }


    private function calulateShipping() {
        $shipping = new shippingCharge();
        $shipping->calculateCharge();
    }

    private function applyDiscount() {
        $discount = new discount();
        $discount->applyDiscount();
    }

    private function placeOrder() {
        $order = new order();
        $order->generateOrder();
    }
}

$order = new productOrderFacade(10);
$order->generateOrder();


// http://code.tutsplus.com/tutorials/design-patterns-the-facade-pattern--cms-22238
