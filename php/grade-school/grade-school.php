<?php

class School {

    private $students = [];
    private $sortedStudents = [];

    public function add($name, $grade) : void
    {
        $this->students[$name] = $grade;
    }

    public function grade($grade) : array
    {
        return array_keys($this->students, $grade);
    }

    public function studentsByGradeAlphabetical() : array
    {
        $grades = array_unique(array_values($this->students));

        asort($grades);

        foreach($grades as $grade) {
            $students = $this->grade($grade);
            sort($students);
            $this->sortedStudents[$grade] = $students;
        }
        return $this->sortedStudents;
    }

}