package study.pattern.strategy;

public class RubberDuck extends Duck{

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("고무오리입니닷");
	}
}
