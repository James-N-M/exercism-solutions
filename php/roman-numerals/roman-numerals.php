<?php

const NUMERALS = [
    'M' => 1000,
    'CM' => 900,
    'D' => 500,
    'CD' => 400,
    'C' => 100,
    'XC' => 90,
    'L' => 50,
    'XL' => 40,
    'X' => 10,
    'IX' => 9,
    'VIII' => 8,
    'VII' => 7,
    'VI' => 6,
    'V' => 5,
    'IV' => 4,
    'III' => 3,
    'II' => 2,
    'I' => 1,
];

function toRoman($number): string {

    $result = "";

    foreach (NUMERALS as $numeral => $value) {
        for (; $number >= $value; $number -= $value) {
            $result .= $numeral;
        }
    }

    return $result;
}