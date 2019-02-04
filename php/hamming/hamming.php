<?php

//
// This is only a SKELETON file for the "Hamming" exercise. It's been provided as a
// convenience to get you started writing code faster.
//

function distance($a, $b)
{
    checkStrandLengths($a, $b);
    return calculateDistance($a,$b);
}

function checkStrandLengths($a, $b)
{
    if(strlen($a) > strlen($b) || strlen($a) < strlen($b) )
    {
        throw new InvalidArgumentException('DNA strands must be of equal length.');
    }
}

function calculateDistance($a, $b)
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