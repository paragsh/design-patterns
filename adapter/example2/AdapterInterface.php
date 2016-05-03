<?php

interface AdapterInterface {
    public function send($params);
    public function read($params);
}