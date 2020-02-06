package calculator;

public interface Operation {
	/*SOLID Principles
	 * S-single responsibility principle 
	 *   Here each and every class has only a single responsibility to perform its function
	 * O-open closed principle
	 *   Here extension is easily possible by simply implementing the Operation interface
	 * L-Liskov Substitution principle
	 *   objects in the program if replaced with its sub types doesn't effect the correctness  
	 * I-interface segregation principle
	 *   Here interface contains only a single method and all the classes performs a single operation so no class is forced 
	 *   to use unnecessary methods
	 * D-dependency inversion
	 *    Here low level modules like calculation ,calculator are dependent on add,subtract,multiplication,division(high level modules)
	 *    which are further dependent on operation interface but not vice versa
	 * KISS Principle
	 *    All the methods in the classes are simple as each and every class performs single operation  
	 * DRY Principle
	 *    No code is repeated 
	 * YAGNI Principle
	 *    basic requirements of calculator are add subtract multiplication division
	 *    no extra code which is not needed is not included
	 * */
public double operation(double a,double b);
}
