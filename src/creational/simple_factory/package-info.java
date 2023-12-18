/**
 * Simple Factory pattern
 *
 * The Simple factory pattern describes a class that has one creation method with a large conditional that based on method parameters
 * chooses which product class to instantiate and then return.
 *
 * People usually confuse simple factories with a general factories or with one of the creational design patterns. *
 * In most cases, a simple factory is an intermediate step of introducing Factory Method or Abstract Factory patterns.
 *
 * A simple factory is usually represented by a single method in a single class.
 * Over time, this method might become too big, so you may decide to extract parts of the method to subclasses.
 * Once you do it several times, you might discover that the whole thing turned into the classic factory method pattern.
 * https://refactoring.guru/design-patterns/factory-comparison
 * <p>
 *  - remember the drawing with the factory, which accept paper (like input) and produces paper boxes; the client doesn't know and doesn't understand factory logic;
 *  - A factory is an object which is used for creating other objects;
 *  - static class Factory with method "CreateProduct"- accept the product type and return the whole product;
 *  - the basic principle behind the factory design pattern is that, at run time, we get an object of similar type based on the parameter we pass;
 * </p>
 *
 */
package creational.simple_factory;