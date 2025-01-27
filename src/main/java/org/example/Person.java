package org.example;

public class Person {

        String firstName;
        String lastName;
        int age;


        public Person(String firstName, String lastName, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(String lastName){
            this("", lastName, 0 );
        }

        public String getFirstName(){
            return this.firstName;
        }

        public String getLastName(){
            return this.lastName;
        }

        public int getAge(){
            return this.age;
        }

        public boolean  isTeen(){
            return this.age >= 13 && this.age <=19;
        }
    }

