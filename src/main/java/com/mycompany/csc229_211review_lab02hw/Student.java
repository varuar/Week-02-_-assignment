package com.mycompany.csc229_211review_lab02hw;

// ToDo 1: Make this class a child of Person
public class Student extends Person {
	
	// ToDo 2: Fix the resulting errors

        // ToDo 3: Add a field for GPA and create setter and getter

        // Adding a variable for gpa
        private double gpa;

        // constructor of Student class
        public Student(String name, short age, String Address) {
	// Calling the constructor of the parent class using super
            super(name, age);
}

        // Getter method for gpa
        public double getGpa() {
                return gpa;
}

        // Setter method for gpa
        public void setGpa(double gpa) {
                this.gpa = gpa;
}

        // Overriding the toString method to print the details of the student
        @Override
        public String toString() {
            return "Student [name=" + getName() + ", age=" + getAge() + ", gpa=" + gpa + "]";
}

        // Abstract methods from Person class
        @Override
        public String getAddress() {
            return null;
}

        @Override
        public void setAddress(String address) {
}
}