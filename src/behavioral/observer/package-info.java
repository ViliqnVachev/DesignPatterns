/**
 * Observer pattern
 *
 * The Observer Design pattern is a behavioral design pattern.
 * It lets you define a subscription mechanism to notify multiple
 * objects about any events that happen to the object they’re observing.
 * https://refactoring.guru/design-patterns/observer
 *
 * <p>
 *  - define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically;
 *  - an object (called as Subject or Provider) maintains a list of its dependents (called as Observers) and notifies them automatically whenever any
 *    state changes by calling one of their methods;
 *  - once the observer gets the notification from the subject, it will call one of the methods of the subject to get the change state data;
 *  - the other names of this pattern are Producer/Consumer, Publish/Subscribe.
 *  - the company needs to notify all its shareholders of any decision they make. Here, Company is the Subject and Shareholders are Observers;
 * </p>
 *
 */
package behavioral.observer;