<?php
include "vendor/autoload.php";

use GuzzleHttp\Promise\Promise;

$promise = new Promise();
echo 1;
$promise->then(
    // $onFulfilled
    function ($value) {
        echo 'The promise was fulfilled.';
    },
    // $onRejected
    function ($reason) {
        echo 'The promise was rejected.';
    }
);