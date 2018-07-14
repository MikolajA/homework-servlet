package com.isa.zadaniedomowe.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {

    private String name;
    private String surname;
    private String team;
    private LocalDateTime time;


    public Student (){

    }

    public Student(String name, String surname, String team, LocalDateTime time){
        this.name = name;
        this.surname = surname;
        this.team = team;
        this.time = time;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public LocalDateTime getTime() { return time; }

    public void setTime(LocalDateTime time) { this.time = time; }

    public String getTeam() { return team; }

    public void setTeam(String team) { this.team = team; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", team='" + team + '\'' +
                ", time=" + time +
                '}';
    }
}
