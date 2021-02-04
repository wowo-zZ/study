<?php
include "vendor/autoload.php";

use GuzzleHttp\Promise\Promise;

$promise = new Promise();
$promise->reject('foo');
// This will not throw an exception. It simply ensures the promise has
// been resolved.
$promise->wait();