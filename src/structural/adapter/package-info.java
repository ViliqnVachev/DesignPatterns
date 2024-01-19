/**
 * Adapter pattern
 *
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 * https://refactoring.guru/design-patterns/adapter
 *
 * <p>
 *   - adapter is responsible for communication between two independent or incompatible interfaces;
 *   - works as a bridge between two incompatible interfaces;
 *   - example is: HR System (Client) will send the employee information in the form of a String Array to the Adapter and it will read the employee
 *   information from the string array and put each employee object into the List<Employee> and then the Adapter will send the List<Employee> to the ProcessSalary method of Third Party Billing System.
 *   Then the ProcessSalary method calculates the Salary of each employee and deposits the salary into the Employee’s bank account;
 * </p>
 *
 */
package structural.adapter;