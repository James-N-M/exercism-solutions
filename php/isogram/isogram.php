<?php

function isIsogram(string $input) : bool
{
    preg_match_all('//u',mb_strtolower($input), $characters);

    $uniqueCharacters = array_unique($characters);

    return (count($characters) === count($uniqueCharacters));
}