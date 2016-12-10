package com.java.statemode.state;

public class SoldState extends State {
	
	
	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("please wait!we are giving you a candy!");

	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you haven't inserted a coin yet!");
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out
		.println("we are giving you a candy,turning another get nothing,!");

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
		mCandyMachine.releaseCandy();
		if (mCandyMachine.getCount() > 0) {
			mCandyMachine.setState(CandyMachine.mOnReadyState);
		} else {
			System.out.println("Oo,out of candies");
			mCandyMachine.setState(CandyMachine.mSoldOutState);
		}

	
	
	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***SoldState***");
		
	}

}
