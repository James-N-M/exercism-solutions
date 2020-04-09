<?php

function detectAnagrams(string $word, array $possibleAnagrams) : array
{
    $sublist = [];

    foreach($possibleAnagrams as $possibleAnagram) {
        if(validate($word, $possibleAnagram)) {
            if(sortString(strtolower($word)) === sortString(strtolower($possibleAnagram))) {
                $sublist[] = $possibleAnagram;
            }
        }
    }
    return $sublist;
}

function sortString(string $string): string
{
    $arr = str_split($string);
    sort($arr);
    return implode($arr);
}

function validate($word, $possibleAnagram) {
    return strtolower($word )!== strtolower($possibleAnagram);
}