/**
 * Proxy pattern
 *
 * Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
 * A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
 * https://refactoring.guru/design-patterns/proxy
 *
 * <p>
 *   - remember the example with ATM (proxy), client and bank;
 *   - the Proxy is the object which is being called by the client to access the real object behind the scene;
 *   - the client will call the method of the Proxy object and the proxy will be responsible to call the method of the Real Object;
 *   - could interface to anything such as a network connection, a large object in memory, a file, or some other resources that are expensive or                   impossible to duplicate;
 *   - The Proxy servers can drastically improve the performance of the application. This is because it saves the results of a request for a certain               period of time;
 *   - Virtual Proxy, Remote Proxy, Protection Proxy;
 * </p>
 *
 */
package structural.proxy;