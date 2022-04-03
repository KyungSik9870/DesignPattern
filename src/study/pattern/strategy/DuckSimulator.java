package study.pattern.strategy;

public class DuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();

		Duck readHead = new RedheadDuck();
		readHead.display();
		readHead.performFly();
		readHead.performQuack();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
	}
}
