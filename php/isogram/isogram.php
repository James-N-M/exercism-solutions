<?php

function isIsogram(string $input) : bool
{
    $input = removeSpacesAndHyphens($input);

    $input = mb_strtolower($input);

    $characters = preg_split('//u', $input, -1, PREG_SPLIT_NO_EMPTY);

    $uniqueCharacters = array_unique($characters);

    return isEqualLength($characters, $uniqueCharacters);
}

function removeSpacesAndHyphens(string $input) : string
{
    return str_replace([' ', '-'], '', $input);
}

function isEqualLength($characters, $uniqueCharacters) : bool
{
    return (count($characters) === count($uniqueCharacters));
}