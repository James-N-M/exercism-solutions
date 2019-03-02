<?php

function isPangram($sentence){

    // empty string cant be a pangram
    if( empty($sentence) ) {
        return false;
    }

    // split the string remove the special cases characters and all whitespace
    $sentence = strtr($sentence, "äåö", "aao");
    $arrayOfCharacters = str_split( str_replace(' ', '',$sentence) );

    $alphabetArray = [];

    // Loop through each character in array
    foreach ( $arrayOfCharacters as $character ) {
        // check if that char is a letter of the alphabet
        if( ctype_alpha($character) ) {
            $lowerCaseLetter = strtolower(utf8_encode($character));
            $alphabetArray[$lowerCaseLetter] = '1';
        }
    }
    return checkAlphabetCount($alphabetArray);
}

function checkAlphabetCount($alphabetArray) {
    if(count($alphabetArray) == 26) {
        return true;
    }
    else {
        return false;
    }
}
