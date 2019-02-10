<?php

class Bob {

    public function respondTo($tomSays) {


        if(trim($tomSays) == '' || $tomSays == "\n\r \t\v  ") {
            return "Fine. Be that way!";
        }

        // Test stating something
        if($tomSays[strlen($tomSays) - 1] == '.') {
            return "Whatever.";
        }

        // try to remove all numbers and , only numbers test
        if(str_replace([' ', ',', '1', '2', '3'],'' , $tomSays) == "") {
            return "Whatever.";
        }

        // remove the possible ! and replace the possible ' ' with it
        if( ctype_upper(str_replace([' ', ',', '!', '1', '2', '3', '%', '^', '*', '@', '#', '$', '(', '|', 'Ä', 'Ü'],'' , trim($tomSays, '!'))) ) {
            return "Whoa, chill out!";
        }

        // Test Talking forcefully
        if($tomSays[strlen($tomSays) - 1] == '!') {
            return "Whatever.";
        }

        // Test Question or forceful question
        if($tomSays[strlen(trim($tomSays)) - 1] == '?') {
            if(ctype_upper(str_replace(' ','' , trim($tomSays, '?')))) {
                return "Calm down, I know what I'm doing!";
            } else return "Sure.";
        }

        if(rtrim($tomSays)) {
            return "Whatever.";
        }

    }
}