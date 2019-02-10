<?php

//
// This is only a SKELETON file for the "Hamming" exercise. It's been provided as a
// convenience to get you started writing code faster.
//

function distance(string $a, string $b) : int
{
    checkStrandLengths($a, $b);
    return calculateDistance($a,$b);
}

function checkStrandLengths(string $a, string $b) : void
{
    if(strlen($a) != strlen($b))
    {
        throw new InvalidArgumentException('DNA strands must be of equal length.');
    }
}

function calculateDistance(string $a, string $b) : int
{
    $distance = 0;

    for($i = 0; $i < strlen($a); $i++)
    {
        if($a[$i] != $b[$i])
        {
            $distance++;
        }
    }

    return $distance;
}