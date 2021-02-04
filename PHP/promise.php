<?php
$promise = new Promise(function () {
    return 1;
});

class Promise {

    private $value;

    private $callbacks = [];

    public function __construct($fun)
    {
        if (!empty($this->value = $fun())) {
            $this->fullfill($this->value);
        } else {
            $this->reject($this->value);
        }
    }

    private function fullfill($value) {
        echo 'the promise has been fullfilled:' . $value . "\n";
    }

    private function reject($value) {
        echo 'the promise has been rejected:' . $value . "\n";
    }
}