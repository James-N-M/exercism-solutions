<?php

function isIsogram(string $input) : bool {

    // Remove the cases with hyphens and make it lowercase
    $input = str_replace([' ', '-'], '', $input);
    $input = strtolower($input);

    $uniqueCharacters = count_chars($input, 3);

    var_dump($input);
    var_dump($uniqueCharacters);

    // length isnt working for the german letters .. try an arr
    if(strlen($input) == strlen($uniqueCharacters)) {
        return true;
    } else return false;
}