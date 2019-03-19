<?php

function isIsogram(string $input) : bool
{
    preg_match_all('/\p{L}/', mb_strtolower($input), $characters);

    $uniqueCharacters = array_unique($characters[0]);

    return (count($characters[0]) === count($uniqueCharacters));
}