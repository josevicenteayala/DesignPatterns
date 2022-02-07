package co.com.personal.patterns.designpatterns.structural.decorator;

/**
 * @author Asus
 * Decorator pattern allows to modify an object dinamically
 * It is used when it's necesary to add functionality at run time 
 * It is more flexible than inheritance
 * The code is more simple, because you just need add functionality using simple clasess
 * Rather than rewrite the code, it is possible to extend new code
 */
public interface Car {
	void run();
}
