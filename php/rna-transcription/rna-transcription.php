<?php

function toRna(string $dnaStrand) : string {
    for ($letter = 0 ; $letter < strlen($dnaStrand); $letter++) {
        switch ($dnaStrand[$letter]) {
            case 'G':
                $dnaStrand[$letter] = 'C';
                break;
            case 'C':
                $dnaStrand[$letter] = 'G';
                break;
            case 'T':
                $dnaStrand[$letter] = 'A';
                break;
            case 'A':
                $dnaStrand[$letter] = 'U';
                break;
        }
    }
    return $dnaStrand;
}