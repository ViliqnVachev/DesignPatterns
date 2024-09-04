/**
 * Memento pattern
 *
 * Memento is a behavioral design pattern that lets you save and restore the
 * previous state of an object without revealing the details of its implementation.
 * https://refactoring.guru/design-patterns/memento
 *
 * <p>
 *  - is used to restore an object to its previous state;
 *  - if you want to perform some kind of undo or rollback operation in your application then you need to use the Memento Design Pattern;
 *  - there are three important classes (Originator, Memento, and Caretaker);
 *  - Originator: It creates a memento containing a snapshot of its current internal state and uses the memento to restore its internal state;
 *  - Memento: It holds the internal state of an Originator;
 *  - Caretaker: It is responsible for keeping the mementos. Like maintaining save points and never operates on or examine the contents of a Memento;
 * </p>
 *
 */
package behavioral.memento;