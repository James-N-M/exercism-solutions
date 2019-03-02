<?php

function isPangram($sentence) {

    if(empty($sentence)) {
        return false;
    }

    $arrayOfCharacters = str_split(strtolower($sentence));

    $alphabetArray = range('a','z');

    $newArray = array_diff($alphabetArray, $arrayOfCharacters);

    return (count($newArray) == 0 ? true : false );
}
