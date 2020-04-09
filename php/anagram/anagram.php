<?php

function detectAnagrams(string $word, array $possibleAnagrams) : array
{
    $sublist = [];

    foreach($possibleAnagrams as $possibleAnagram) {
        if(isAnagram($word, $possibleAnagram)) {
            $sublist[] = $possibleAnagram;
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

function isSameWord($word, $possibleAnagram) {
    return strtolower($word) === strtolower($possibleAnagram);
}

function isAnagram($word, $possibleAnagram) {

    if(isSameWord($word, $possibleAnagram)) return false;

    $word = sortString(strtolower($word));
    $possibleAnagram = sortString(strtolower($possibleAnagram));
    return $word === $possibleAnagram;
}