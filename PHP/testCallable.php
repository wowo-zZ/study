<?php

function echoHello($name) {
    echo "hello " . $name;
}

$callable = "echoHello";

// $callable("wowo");

function addOne($callable) {
    // echo "one";
    return $callable;
}

function echoTwo() {
    echo "two";
}

// echo addOne('echoTwo')();

$testC = new testC;
$callableC = [$testC, "echoC"];
$callableC();

class testC {
    public function echoC() {
        echo "testC-C";
    }
}