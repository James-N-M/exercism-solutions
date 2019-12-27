<?php

function wordCount($words) : array {
    return array_count_values(
        preg_split(
            '/[\s,:!&@$%^]+/u',
            strtolower($words),
            -1,
            PREG_SPLIT_NO_EMPTY|PREG_SPLIT_DELIM_CAPTURE
        )
    );
}