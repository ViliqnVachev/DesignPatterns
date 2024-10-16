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


#### c) **Command Pattern**
[For more info](https://refactoring.guru/design-patterns/command)

Command is a behavioral design pattern
that turns a request into a stand-alone object that contains all information about the request.
This transformation lets you pass requests as a method arguments, delay or queue a request’s execution,
and support undoable operations.

- is used to encapsulate a request as an object (i.e., a command) and pass to an invoker (remote control);
- the invoker does now know how to service the request but uses the encapsulated commands to perform an action;
- the command object also has the Execute method and Undoes;

 ![Schema](/src/main/assets/images/command.png)


#### d) **Template method Pattern**
[For more info](https://refactoring.guru/design-patterns/template-method)

Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
but lets subclasses override specific steps of the algorithm without changing its structure.

- defines a sequence of steps of an algorithm and allows the subclasses to override the steps but not allowed to change the sequence;
- the Key to the Template Design Pattern is that we put the general logic in the abstract parent class and let the child classes define the specifics;

![Schema](/src/main/assets/images/template_method.png)


#### e) **Iterator Pattern**
[For more info](https://refactoring.guru/design-patterns/iterator)

Iterator is a behavioral design pattern that lets you traverse elements of a collection
without exposing its underlying representation (list, stack, tree, etc.).
The main idea of the Iterator pattern is to extract the traversal behavior of a collection into a separate object called an iterator.

- the iterator pattern is a design pattern in which an iterator is used to traverse a container ( ist, Array List, Array, etc.)
  and access the elements of the container;
- allows sequential access of elements without exposing the inside logic;
- we can access the elements of a collection object in a sequential manner without any need to know its internal representations;

![Schema](/src/main/assets/images/iterator.png)


#### f) **State Pattern**
[For more info](https://refactoring.guru/design-patterns/state)

The State Design pattern is a behavioral design pattern.
It lets an object alter its behavior when its internal state changes.
It appears as if the object changed its class.

- allows an object to completely change its behavior depending upon its current internal state;
- ATM machine behavior is the best example of the State Design Pattern;
 
![Schema](/src/main/assets/images/state.png)


#### g) **Mediator Pattern**
[For more info](https://refactoring.guru/design-patterns/mediator)

Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

- is used to reduce the communication complexity between multiple objects;
- The Mediator object acts as the communication center for all objects and that mediator object normally handles all the communication complexities between different objects;
- when an object needs to communicate to another object, then it does not call the other object directly, instead, it calls the mediator object;

![Schema](/src/main/assets/images/mediator.png)


#### h) **Visitor Pattern**
[For more info](https://refactoring.guru/design-patterns/visitor)

Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.

- as per the Visitor Design Pattern, the element object (every kid in the school) has to accept the visitor object (doctor, salesman);
- the visitor object handles the operation on the element object;
![Schema](/src/main/assets/images/visitor.png)

#### i) **Memento Pattern**
[For more info](https://refactoring.guru/design-patterns/memento)

Memento is a behavioral design pattern that lets you save and restore the
previous state of an object without revealing the details of its implementation.

- is used to restore an object to its previous state;
- if you want to perform some kind of undo or rollback operation in your application then you need to use the Memento Design Pattern;
- there are three important classes (Originator, Memento, and Caretaker);
- Originator: It creates a memento containing a snapshot of its current internal state and uses the memento to restore its internal state;
- Memento: It holds the internal state of an Originator;
- Caretaker: It is responsible for keeping the mementos. Like maintaining save points and never operates on or examine the contents of a Memento;
![Schema](/src/main/assets/images/memento.png)

#### j) **Interpreter Pattern**
[For more info](https://www.baeldung.com/java-interpreter-pattern)

In short, the pattern defines the grammar of a particular language in an object-oriented way which can be evaluated by the interpreter itself.
Having that in mind, technically we could build our custom regular expression, a custom DSL interpreter or we could parse any of the human languages,
build abstract syntax trees and then run the interpretation.

- provides a way to evaluate language grammar or expression;
- is used in SQL parsing, symbol processing engine, etc.

#### k) **Chain of responsibility pattern**
[For more info](https://refactoring.guru/design-patterns/chain-of-responsibility)

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

- the chain of responsibility design pattern creates a chain of receiver objects for a given request;
- normally each receiver contains a reference to another receiver;
- if one receiver cannot handle the request then it passes the same request to the next receiver and so on;
- one receiver handles the request in the chain or one or more receivers handle the request;
- remember the example with Developer, Team Leader, Project Leader and HR: only one receiver in the chain will handle the request and approve leave of the employee;
![Schema](/src/main/assets/images/chain_of_responsesibility.png)

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


#### b) **Singleton Pattern**
[For more info](https://refactoring.guru/design-patterns/singleton)

[For more info](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)

Bill Pugh impl
[For more info](https://www.baeldung.com/java-bill-pugh-singleton-implementation)

Singleton is a creational design pattern that lets you ensure that a class has only one instance,
while providing a global access point to this instance.

- this pattern ensures that a class has only one instance and provides a global point of access to it;
- always is sealed class with: private static Singleton instance,
private constructor and one getter-public static Singleton GetInstance (see Standard Singleton);
- class could have methods, fields or properties;

![Schema](/src/main/assets/images/singleton.png)


#### c) **Builder Pattern**
[For more info](https://refactoring.guru/design-patterns/builder)

Builder is a creational design pattern that lets you construct complex objects step by step.
The pattern allows you to produce different types and representations of an object using the same construction code.

- avoiding multiply parameters in constructors;
- we need to use Builder Design Pattern when there is multiply constructor in the class or might be expand in the future;

![Schema](/src/main/assets/images/builder.png)


#### d) **Prototype Pattern**
[For more info](https://refactoring.guru/design-patterns/prototype)

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

- Gives us a way to create new objects from the existing instance of the object;
- Shallow copy: it will create the new object from the existing object and then copying the value type fields of the current object to the new
  object. But in the case of reference type, it will only copy the reference, not the referred object itself;
- Deep copy: it will create the new object from the existing object and then copying the fields of the current object to the newly created object. If
  the field is a value type, then a bit-by-bit copy of the field will be performed. If the field is a reference type, then a new copy of the referred object is created;

- ![Schema](/src/main/assets/images/prototype.png)

### 3. **Structural Design Pattern**

#### a) **Decorator Pattern**
[For more info](https://refactoring.guru/design-patterns/decorator)

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects
inside special wrapper objects that contain the behaviors.

- dynamically changes the functionality of an object at runtime without impacting the existing functionality of the objects;
- adds additional functionalities to the object by wrapping it;
- remember how to create a car with diesel engine and car with petrol engine, or pizza decorator;

![Schema](/src/main/assets/images/decorator.png)

#### b) **Adapter Pattern**
[For more info](https://refactoring.guru/design-patterns/adapter)

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

- adapter is responsible for communication between two independent or incompatible interfaces;
- works as a bridge between two incompatible interfaces;
- example is: HR System (Client) will send the employee information in the form of a String Array to the Adapter and it will read the employee
  information from the string array and put each employee object into the List<Employee> and then the Adapter will send the List<Employee> to the ProcessSalary method of Third Party Billing System.
  Then the ProcessSalary method calculates the Salary of each employee and deposits the salary into the Employee’s bank account;

#### Object Adapter
![Schema](/src/main/assets/images/objAdapter.png)

#### Class Adapter
![Schema](/src/main/assets/images/classAdapter.png)

#### c) **Facade Pattern**
[For more info](https://refactoring.guru/design-patterns/facade)

Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

- defines a higher-level interface that makes the subsystem easier to use;
- hides the complexities of the system; *

![Schema](/src/main/assets/images/facade.png)

#### d) **Proxy Pattern**
[For more info](https://refactoring.guru/design-patterns/proxy)

Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
a framework, or any other complex set of classes.

- remember the example with ATM (proxy), client and bank;
- the Proxy is the object which is being called by the client to access the real object behind the scene;
- the client will call the method of the Proxy object and the proxy will be responsible to call the method of the Real Object;
- could interface to anything such as a network connection, a large object in memory, a file, or some other resources that are expensive or                   impossible to duplicate;
- The Proxy servers can drastically improve the performance of the application. This is because it saves the results of a request for a certain               period of time;
- Virtual Proxy, Remote Proxy, Protection Proxy;
- 
![Schema](/src/main/assets/images/proxy.png)