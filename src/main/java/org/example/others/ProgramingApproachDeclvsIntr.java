package org.example;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramingApproachDeclvsIntr{

    static class Person{

        private String name;
        private String gender;
        private int age;
        private long phoneNumber;
        
        
        
		public Person(String name, String gender, int age, long phoneNumber) {
			super();
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.phoneNumber = phoneNumber;
		}



		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", phoneNumber=" + phoneNumber
					+ "]";
		}

        
        
    }



    public static void main(String args[]){
       List<Person> person=List.of(new ProgramingApproachDeclvsIntr.Person("MALE","SAURAV",29,7755221155L),
                new ProgramingApproachDeclvsIntr.Person("FEMALE","SITA",2000,1111111111L),
                new ProgramingApproachDeclvsIntr.Person("FEMALE","RENU",30,7549851239L),
               new ProgramingApproachDeclvsIntr.Person("MALE","RAM",2001,2222222222L));


       //Imperative
        //loop to take out females from the list of persons
        List<Person> personfemale=new ArrayList<>();

        System.out.println("Imperative programing");
        for(Person p:person){ //
            if("FEMALE".equalsIgnoreCase(p.gender)) //
            personfemale.add(p);
        }
        //loop to print females stored
        for(Person p:personfemale){
            System.out.println(p);
        }


        //Declarative
        System.out.println("Declarative programing");
        person.stream().filter(i-> "FEMALE".equalsIgnoreCase(i.gender)).collect(Collectors.toList()).forEach(System.out::println);


    }
}


