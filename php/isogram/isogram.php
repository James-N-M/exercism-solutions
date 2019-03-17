<?php

function isIsogram(string $input) : bool
{
    $input = removeSpacesAndHyphens($input);
    $input = mb_strtolower($input);
    $characters = preg_split('//u', $input, -1, PREG_SPLIT_NO_EMPTY);
    $uniqueCharacters = [];

    foreach ($characters as $character ) {
        if(!in_array($character, $uniqueCharacters)) {
            array_push($uniqueCharacters, $character);
        }
    }

    return isEqualLength($characters, $uniqueCharacters);
}

function removeSpacesAndHyphens(string $input) : string
{
    return str_replace([' ', '-'], '', $input);
}

function isEqualLength($characters, $uniqueCharacters) : bool
{
    if(count($characters) === count($uniqueCharacters)) {
        return true;
    } else {
        return false;
    }
}