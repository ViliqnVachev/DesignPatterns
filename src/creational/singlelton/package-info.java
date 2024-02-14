/**
 * Singleton Pattern:
 *
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
 * https://refactoring.guru/design-patterns/singleton
 * Bill Pugh impl
 * https://www.baeldung.com/java-bill-pugh-singleton-implementation
 * <p>
 *  - this pattern ensures that a class has only one instance and provides a global point of access to it;
 *  - always is sealed class with: private static Singleton instance, private constructor and one getter- public static Singleton GetInstance (see Standard Singleton);
 *  - class could have methods, fields or properties;
 * </p>
 *
 */
package creational.singlelton;