# High-Quality Code
## Creational Design Patterns; Structural Design Patterns; Behavioral Design Patterns

### 1. **Behavioral Design Pattern**

#### a) **Observer Pattern**
[For more info](https://refactoring.guru/design-patterns/observer)

The Observer Design pattern is a behavioral design pattern.
It lets you define a subscription mechanism to notify multiple
objects about any events that happen to the object they’re observing.
    
- define a one-to-many dependency between objects so that when one object changes state, 
all its dependents are notified and updated automatically;
- an object (called as Subject or Provider) maintains a list of its dependents (called as Observers) and notifies them automatically whenever any
state changes by calling one of their methods;
- once the observer gets the notification from the subject, it will call one of the methods of the subject to get the change state data;
- the other names of this pattern are Producer/Consumer, Publish/Subscribe.
- the company needs to notify all its shareholders of any decision they make. Here, Company is the Subject, and Shareholders are Observers;
![Schema](/src/main/assets/images/observer.png)


#### b) **Strategy Pattern**
[For more info](https://www.freecodecamp.org/news/a-beginners-guide-to-the-strategy-design-pattern/)

The Strategy Design Pattern is a behavioral design pattern.
It allows you to dynamically change the behavioral of an object by encapsulating it into different strategies.

- define a family of algorithms, encapsulate each one, and make them interchangeable;
- Strategy lets the algorithm vary independently of clients that use it;
- It is used when we have multiple algorithms (solutions) for a specific task,
and the client decides the actual implementation to be used at runtime;
![Schema](/src/main/assets/images/strategy.png)

### 2. **Creational Design Pattern**

#### a) **Factory Pattern**
[For more info](https://refactoring.guru/design-patterns/factory-comparison)

##### a.1) **Simple Factory Pattern**
The Simple factory pattern describes a class that has one creation method with a large conditional that based on met
chooses which product class to instantiate and then return.

People usually confuse simple factories with a general factories or with one of the creational design patterns. *
In most cases, a simple factory is an intermediate step of introducing Factory Method or Abstract Factory patterns.

A simple factory is usually represented by a single method in a single class.
Over time, this method might become too big, so you may decide to extract parts of the method to subclass.
Once you do it several times, you might discover that the whole thing turned into the classic factory method pattern

- Remember the drawing with the factory, which accepts paper (like input) and produces paper boxes; the client doesn't know and does not understand factory logic;
- A factory is an object that is used for creating other objects;
- Static class Factory with method "CreateProduct"- accept the product type and return the whole product;
- The basic principle behind the factory design pattern is that, at run time, we get an object of similar type based on the parameter we pass;

##### a.2) **Factory Method Pattern**
The Factory Method is a creation design pattern that provides an interface for creating objects
but allows subclasses to alter the type of object that will be created.

If you have a creation method in base class and subclasses that extend it, you might be looking at the factory method.

- It is used when we need to create the object (i.e., instance of the Product class) without exposing the object creation logic to the client;
- We will create an abstract class as the VehicleFactory class which will create and return the instance of the product,
but it will let the subclasses(VWFactory, PeugeotFactory) decide which Product class (VWCaddy, VWPassat) to instantiate;
![Schema](/src/main/assets/images/factory_method.png)

### 3. **Structural Design Pattern**

#### a) **Decorator Pattern**
[For more info](https://refactoring.guru/design-patterns/decorator)

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects
inside special wrapper objects that contain the behaviors.

- dynamically changes the functionality of an object at runtime without impacting the existing functionality of the objects;
- adds additional functionalities to the object by wrapping it;
- remember how to create a car with diesel engine and car with petrol engine, or pizza decorator;
![Schema](/src/main/assets/images/decorator.png)