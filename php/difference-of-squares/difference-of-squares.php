<?php
define('POWER_OF_TWO', 2);

function difference(int $number) : int
{
    return squareOfSum($number) - sumOfSquares($number);
}

function squareOfSum(int $number) : int
{
    return squared(array_sum(range(1,$number)));
}

function sumOfSquares(int $number) : int
{
    return array_sum(array_map("squared", range(1, $number)));
}

function squared(int $number) : int
{
    return $number ** POWER_OF_TWO;
}