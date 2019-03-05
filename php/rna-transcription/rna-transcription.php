<?php

function toRna(string $dnaStrand) : string {
    $compliments = array("G" => "C", "C" => "G", "T" => "A", "A" => "U");
    $rnaStrand = strtr($dnaStrand,$compliments);
    return $rnaStrand;
}