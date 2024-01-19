/**
 * Command pattern
 *
 * Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request.
 * This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.
 * https://refactoring.guru/design-patterns/command
 *
 * <p>
 *  - is used to encapsulate a request as an object (i.e. a command) and pass to an invoker (remote control);
 *  - the invoker does now knows how to service the request but uses the encapsulated commands to perform an action;
 *  - the command object also has the Execute method and Undo;
 * </p>
 *
 */
package behavioral.command;