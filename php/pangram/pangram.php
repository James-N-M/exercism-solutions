<?php

function isPangram(string $sentence) : bool {

    if(empty($sentence)) {
        return false;
    }

    $characters = str_split(strtolower($sentence));

    $alphabet = range('a','z');

    $isMissingLetters = count(array_diff($alphabet, $characters)) === 0;

    return $isMissingLetters;
}
