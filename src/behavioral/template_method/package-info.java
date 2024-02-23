/**
 * Template method pattern
 *
 *  Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
 *  but lets subclasses override specific steps of the algorithm without changing its structure.
 *  https://refactoring.guru/design-patterns/template-method
 *
 *  <p>
 *  - defines a sequence of steps of an algorithm and allows the subclasses to override the steps but not allowed to change the sequence;
 *  - the Key to the Template Design Pattern is that we put the general logic in the abstract parent class and let the child classes define the specifics;
 *  </p>
 */
package behavioral.template_method;