# High-Quality Code
## Creational Design Patterns; Structural Design Patterns; Behavioral Design Patterns

### 1. Behavioral Design Pattern

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
- the company needs to notify all its shareholders of any decision they make. Here, Company is the Subject and Shareholders are Observers;
![Schema](/src/main/assets/images/observer.png)


#### b) **Strategy Pattern**
[For more info](https://www.freecodecamp.org/news/a-beginners-guide-to-the-strategy-design-pattern/)