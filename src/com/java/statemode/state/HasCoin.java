package com.java.statemode.state;

public class HasCoin extends State {
	
	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("you can't insert another coin!");

	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("coin return!");
		mCandyMachine.setState(CandyMachine.mOnReadyState);
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("crank turn...!");
		mCandyMachine.setState(CandyMachine.mSoldState)  ; 
		
	}

	@Override
	public void dispense() {
	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***HasCoin***");

	}

}
