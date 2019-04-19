<?php

function isValid(string $number) : bool {

    $number = preg_replace('/\s/', '',$number);
    $numbers = str_split($number);
    $numbers = stringToIntegerArray(array_reverse($numbers));

    if(count($numbers) == 1) {
        return false;
    }

    $numbers = doubleSecondNumbers($numbers);
    $sum = array_sum($numbers);

    return isSumDivisibleBy10($sum);
}

function isSumDivisibleBy10(int $sum): bool {
    if($sum % 10 == 0) {
        return true;
    }
    else {
        return false;
    }
}
function doubleSecondNumbers($numbers) {
    $counter = 1;
    for($i = 0; $i < count($numbers); $i++)
    {
        if($counter == 2) {
            $numbers[$i] = $numbers[$i] * 2;
            if($numbers[$i] > 9) {
                $numbers[$i] = $numbers[$i] - 9;
            }
            $counter = 1;
        } else {
            $counter++;
        }
    }
    return $numbers;
}

function stringToIntegerArray($numbers) {
    return array_map('intval', $numbers);
}