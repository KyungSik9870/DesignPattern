package study.pattern.strategy;

public class MuteQuack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("음소거..");
	}
}
