<?php

// Simple Interface for each Adapter we create
interface paymentInterface
{
    public function pay($amount);
}