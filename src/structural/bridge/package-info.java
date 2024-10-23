/**
 * Bridge pattern
 *
 * Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two
 * separate hierarchies—abstraction and implementation—which can be developed independently of each other.
 *
 * https://refactoring.guru/design-patterns/bridge
 *
 * <p>
 *   - there are two parts: the first part is the abstraction and the second part is the implementation;
 *   - providing a bridge betwen abstract class and implementation class - bridge interface;
 *   - allows the abstraction and implementation to be developed independently;
 *   - if you want to add a new implementation or if you want to remove any implementation, then it will not affect the Abstraction layer;
 *   - the client will only use the abstraction to save or delete the object;
 *
 * </p>
 *
 */
package structural.bridge;