import by.gsu.mslab.Patient;

import java.util.Arrays;
import java.util.Comparator;



public class Runner {

    public static void main(String[] args) {
        Patient[] patients = {
                new Patient("Petrov", "MALE", 20),
                new Patient("Sidorov", "MALE", 25),
                new Patient("Ivanov", "MALE", 15),
                new Patient("Komyagin", "MALE", 88),
                new Patient("Drozdova", "FEMALE", 60),
                new Patient("Khvaschevskaya", "FEMALE", 30),
                new Patient("Sokolova", "FEMALE", 44),
        };

        for (Patient i : patients) {
            System.out.println(i);
        }

        System.out.println("\n");

        Arrays.sort(patients, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        int ageAvg = 0;
        for (Patient i : patients) {
            ageAvg += i.getAge();
        }

        System.out.println("Average age is "+ (double)ageAvg/patients.length);

        int femaleSum = 0;
        for (Patient i : patients) {
            if (i.getGender()=="FEMALE") {
                femaleSum++;
            }
        }

        System.out.println("Number of women is " +femaleSum);
    }
}
