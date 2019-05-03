<?php

class Series
{
    private $series;
    private $largestSeriesProduct;
    private $spans;

    public function __construct($series) {
        $this->largestSeriesProduct = 1;
        $this->series = str_split($series);
        $this->spans = [];
    }

    function largestProduct(int $length) : int {

        $this->validate($length);

        for($i = 0; $i <= count($this->series) - $length; $i++) {
            $product = 1;
            for ($j = $i; $j < $i + $length; $j++) {
                if(is_numeric($this->series[$j])) {
                    $product *= $this->series[$j];
                } else {
                    $this->nonDigitEncountered();
                }
            }
            $this->setLargestSeriesProduct($product);
        }

        if($this->checkForAllZeroSpans()) {
            return 0;
        }

        return $this->largestSeriesProduct;
    }

    public function setLargestSeriesProduct($product) : void {
        if($this->largestSeriesProduct < $product) {
            $this->largestSeriesProduct = $product;
        }
        array_push($this->spans, $product);
    }

    private function validate(int $length) {
        if($length > count($this->series)) {
            throw new InvalidArgumentException('Span longer than string length');
        }

        if($length < 0) {
            throw new InvalidArgumentException('Negative span');
        }

        if($this->series[0] === "" && $length != 0) {
            throw new InvalidArgumentException('rejects empty string and non zero span');
        }
    }

    private function checkForAllZeroSpans() {
        return array_unique($this->spans) == [0];
    }

    private function nonDigitEncountered() {
        throw new InvalidArgumentException('rejects a string with a non digit');
    }
}