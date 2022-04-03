package study.pattern.strategy;

public class RedheadDuck extends Duck{

	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("나는 붉은머리 오리");
	}
}
