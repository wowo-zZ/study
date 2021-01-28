<?php
include "vendor/autoload.php";

use GuzzleHttp\Promise\Promise;

$promise = new Promise();
$promise
    ->then(function ($value) {
        // Return a value and don't break the chain
        return "Hello, " . $value;
    })
    // This then is executed after the first then and receives the value
    // returned from the first then.
    ->then(function ($value) {
        echo $value;
    });
// Resolving the promise triggers the $onFulfilled callbacks and outputs
// "Hello, reader."
$promise->resolve('reader.');
echo 1;echo "\n";