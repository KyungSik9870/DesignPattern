package study.pattern.strategy;

public class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("날 수가 없어..");
	}
}
