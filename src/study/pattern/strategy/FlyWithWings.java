package study.pattern.strategy;

public class FlyWithWings implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("난다~~");
	}
}
