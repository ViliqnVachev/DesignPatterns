/**
 * Prototype pattern
 *
 * Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.
 * https://refactoring.guru/design-patterns/protorype
 *
 * <p>
 *  - Gives us a way to create new objects from the existing instance of the object;
 *  - Shallow copy: it will create the new object from the existing object and then copying the value type fields of the current object to the new
 *    object. But in the case of reference type, it will only copy the reference, not the referred object itself;
 *  - Deep copy: it will create the new object from the existing object and then copying the fields of the current object to the newly created object. If
 *    the field is a value type, then a bit-by-bit copy of the field will be performed. If the field is a reference type, then a new copy of the referred object is created;
 * </p>
 *
 */
package creational.prototype;