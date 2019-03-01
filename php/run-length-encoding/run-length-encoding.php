<?php

function encode($input)
{
    if(empty($input)) {
        return '';
    }

    $encodedString = "";

    for($i = 0; $i < strlen($input); $i++)
    {
        $count = 1;
        while($i < (strlen($input) - 1 ) && $input[$i] == $input[$i + 1]) {
            $count++;
            $i++;
        }

        if($count > 1) {
            $encodedString .= $count . $input[$i];
        } else {
            $encodedString .= $input[$i];
        }

    }

    return $encodedString;
}

function decode($input)
{
    $inputArray = str_split($input); // splits the string into single chars
    $inputArrayLength = count ($inputArray); // get the length of the string array

    //Set initial values
    $decoded = '';
    $num = '';

    for ($i = 0; $i < $inputArrayLength; $i++) {
        $char = $inputArray[$i]; // The current character to process

        if (!ctype_digit($char)) { // Not a number so let's add to the decoded string
            if ($num) { // We have a repeated character substring so repeat the character that many times and reset the number
                $decoded .= str_repeat($char, intval( $num )); // intval() converts the integer to a string, str_repeat() repeats the char intval($num) times
                $num = ''; // reset the number
            } else {
                $decoded .= $char; //Just a single character
            }
        } else {
            $num .= $char; // Build the number string
        }
    }

    return $decoded;
}
