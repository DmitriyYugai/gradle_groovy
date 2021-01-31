package com.dima

class Patient {
    def name, age
    static hospital = "Hospital №123"

    void set(name) {
        if (name == null) {
            throw new IllegalArgumentException("Enter the name of the patient");
        }
        this.name = name
    }

    static void displayHospital() {
        println(hospital);
    }
}

p1 = new Patient()
println p1.name + " " + p1.age

p2 = new Patient(name: "Dmitry", age: 23)
println p2.name + " " + p2.age

p3 = new Patient(name: "Petr", age:30)
p3.set("Ivan")
println p3.name + " " + p3.age

Patient.displayHospital();