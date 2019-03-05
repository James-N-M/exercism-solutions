<?php

const PLING = "Pling";
const PLANG = "Plang";
const PLONG = "Plong";

function raindrops(int $number) : string {
    $conversion = "";

    if( ($number % 3) === 0 ) {
        $conversion .= PLING;
    }

    if( ($number % 5) === 0 ) {
        $conversion .= PLANG;
    }

    if( ($number % 7) === 0 ) {
        $conversion .= PLONG;
    }

    if( !empty($conversion) ) {
        return $conversion;
    }
    else {
        return $number;
    }

}