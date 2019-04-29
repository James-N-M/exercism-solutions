<?php

class Robot
{
    public $position;
    public $direction;
    const DIRECTION_NORTH = 1, DIRECTION_EAST = 2, DIRECTION_SOUTH = 3, DIRECTION_WEST = 4;
    const LEFT = 'L', RIGHT = 'R', ADVANCE = 'A';
    const X_COORDINATE = 0, Y_COORDINATE = 1;

    public function __construct(array $position, $direction)
    {
        $this->position = $position;
        $this->direction = $direction;
    }

    public function turnRight() {
        if($this->direction == $this::DIRECTION_WEST) {
            $this->direction = $this::DIRECTION_NORTH;
        } else {
            $this->direction++;
        }
        return $this;
    }

    public function turnLeft() {
        if($this->direction == $this::DIRECTION_NORTH) {
            $this->direction = $this::DIRECTION_WEST;
        } else {
            $this->direction--;
        }
        return $this;
    }

    public function advance() {
        switch($this->direction) {
            case $this::DIRECTION_NORTH:
                $this->position[$this::Y_COORDINATE]++;
                break;
            case $this::DIRECTION_SOUTH:
                $this->position[$this::Y_COORDINATE]--;
                break;
            case $this::DIRECTION_EAST:
                $this->position[$this::X_COORDINATE]++;
                break;
            case $this::DIRECTION_WEST:
                $this->position[$this::X_COORDINATE]--;
                break;
        }
        return $this;
    }

    public function instructions(string $steps) : void {
        $steps = str_split($steps);

        if(array_diff($steps, [$this::LEFT, $this::RIGHT, $this::ADVANCE])) {
            throw new InvalidArgumentException("Input contains steps other than L R A");
        }

        foreach ($steps as $step) {
            switch ($step) {
                case $this::LEFT:
                    $this->turnLeft();
                    break;
                case $this::RIGHT:
                    $this->turnRight();
                    break;
                case $this::ADVANCE:
                    $this->advance();
                    break;
            }
        }
    }
}