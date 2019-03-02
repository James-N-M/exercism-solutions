<?php

function isPangram($sentence) {

    if(empty($sentence)) {
        return false;
    }

    $arrayOfCharacters = str_split(strtolower($sentence));

    $alphabetArray = range('a','z');

    $missingLettersArray = array_diff($alphabetArray, $arrayOfCharacters);

    return (count($missingLettersArray) == 0 ? true : false );
}
