<?php

class client {

    public $adapter;

    public function __construct($adapter)
    {
        try{

            if (!$adapter instanceof AdapterInterface) {
                throw new RuntimeException('Invalid adapter');
            }

            $this->adapter = $adapter;

        }catch (RuntimeException $e){
            //log your error $e->getMessage();
        }
    }

    public function send($params)
    {
        $this->adapter->send($params);
    }

    public function read($params)
    {
        $this->adapter->read($params);
    }

}

//Send an email via Gmail
$client = new client(new Gmail());
$client->send(array(
    'email' => 'brucelampson@gmail.com',
    'message' => 'Hello world',
));

//Send an email via Hotmail
$client = new client(new Hotmail());
$client->send(array(
    'email' => 'brucelampson@hotmail.com',
    'message' => 'Hello world',
));