<?php

const PLING = "Pling";
const PLANG = "Plang";
const PLONG = "Plong";

function raindrops(int $number) : string {

    $conversion = convertNumberToSounds($number, "");

    if( !empty($conversion) ) {
        return $conversion;
    }
    else {
        return $number;
    }
}

function convertNumberToSounds(int $number, $conversion) : string {

    if( ($number % 3) === 0 ) {
        $conversion .= PLING;
    }

    if( ($number % 5) === 0 ) {
        $conversion .= PLANG;
    }

    if( ($number % 7) === 0 ) {
        $conversion .= PLONG;
    }

    return $conversion;
}