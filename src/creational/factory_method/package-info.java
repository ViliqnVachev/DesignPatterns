/**
 * Factory Method:
 *
 * The Factory Method is a creation design pattern that provides an interface for creating objects
 * but allows subclasses to alter the type of object that will be created.
 *
 * If you have a creation method in base class and subclasses that extend it, you might be looking at the factory method.
 *
 * <p>
 *  - is used, when we need to create the object (i.e. instance of the Product class) without exposing the object creation logic to the client;
 *  - we will create an abstract class as the VehicleFactory class which will create and return the instance of the product,
 *    but it will let the subclasses(VWFactory, PeugeotFactory) decide which Product class (VWCaddy, VWPassat) to instantiate;
 * </p>
 *
 */
package creational.factory_method;