/**
 * Chain of responsibility pattern
 *
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
 * Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
 * https://refactoring.guru/design-patterns/chain-of-responsibility
 *
 * <p>
 *  - the chain of responsibility design pattern creates a chain of receiver objects for a given request;
 *  - normally each receiver contains a reference to another receiver;
 *  - if one receiver cannot handle the request then it passes the same request to the next receiver and so on;
 *  - one receiver handles the request in the chain or one or more receivers handle the request;
 *  - remember the example with Developer, Team Leader, Project Leader and HR: only one receiver in the chain will handle the request and approve leave of the employee;
 * </p>
 *
 */
package behavioral.chain_of_responsibility;