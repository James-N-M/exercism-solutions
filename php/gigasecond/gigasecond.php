<?php

function from(DateTime $date) : DateTime {
    $dateCopy = clone $date;
    return addGigaSecond($dateCopy);
}

function addGigaSecond(DateTime $date) : DateTime{
    $date->add(new DateInterval('PT1000000000S'));
    return $date;
}