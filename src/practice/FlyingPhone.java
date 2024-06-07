package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int flyingTime;
	
	public FlyingPhone(int time) {
		this.flyingTime = time;
	}
	
	
	@Override
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	@Override
	public void fly(){
		System.out.println(flyingTime + "分間、飛びます。");
	}
	
	@Override
	public void powerOff() {
		Flying.super.powerOff();
	}
}
