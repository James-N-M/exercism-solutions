<?php

function sieve(int $limit) : array {
    if($limit < 2) {
        return [];
    }

    $primes = [];
    $range = createRange($limit); // range of marked values 2 -> limit [2 => 0, 3 => 0] ... etc

}

// Create a associative array of all values up to limit with markings
function createRange($limit) {
    $rangeOfKeys = range(2, $limit);
    $markings = array_fill(0, count($rangeOfKeys), 0);
    return array_combine($rangeOfKeys, $markings);
}