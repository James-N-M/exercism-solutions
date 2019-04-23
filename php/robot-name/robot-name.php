<?php
class Robot
{
    private static $names = [];
    private $name;

    public function __construct()
    {
        $this->name = $this->getUniqueName();
    }

    public function getName()
    {
        return $this->name;
    }

    public function reset()
    {
        $this->name = $this->getUniqueName();
    }

    private function getUniqueName()
    {
        $newName = $this->randomUpperCaseLetters() . $this->randomNumber();
        while(in_array($newName, Robot::$names))
        {
            $newName = $this->randomUpperCaseLetters() . $this->randomNumber();
        }
        array_push(Robot::$names, $newName);
        return $newName;
    }

    private function randomUpperCaseLetters()
    {
        return chr(rand(65,90)) . chr(rand(65,90));
    }

    private function randomNumber()
    {
        return mt_rand(0,999);
    }
}