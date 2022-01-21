package com.tb.java14.record;

public class RecordImpl {
    public static void main(String[] args) {

        // All argument constructor
        EmployeeRecord employeeRecord = new EmployeeRecord(1, "John");

        // Public getters, matching the name of fields
        System.out.println(employeeRecord.id());
        System.out.println(employeeRecord.name());

        // equals method is generated
        System.out.println(new EmployeeRecord(1, "John").
                equals(new EmployeeRecord(1, "John"))); // true

        // hashCode method is generated
        System.out.println(new EmployeeRecord(1, "John").hashCode() ==
                new EmployeeRecord(1, "John").hashCode()); // true

        // toString method is generated
        System.out.println(employeeRecord.toString()); // EmployeeRecord[id=1, name=John]
    }
}
