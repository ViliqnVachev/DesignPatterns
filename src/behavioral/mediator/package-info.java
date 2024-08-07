/**
 * Mediator pattern
 *
 * Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
 * The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
 * https://refactoring.guru/design-patterns/mediator
 *
 * <p>
 *  - is used to reduce the communication complexity between multiple objects;
 *  - The Mediator object acts as the communication center for all objects and that mediator object normally handles all the communication complexities between different objects;
 *  - when an object needs to communicate to another object, then it does not call the other object directly, instead, it calls the mediator object;
 * </p>
 *
 */
package behavioral.mediator;