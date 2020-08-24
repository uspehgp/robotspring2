package com.uspehgp.robotspring.impls.robot;

import com.uspehgp.robotspring.interfaces.Hand;
import com.uspehgp.robotspring.interfaces.Head;
import com.uspehgp.robotspring.interfaces.Leg;
import com.uspehgp.robotspring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hand hand;
	private Leg leg;
	private Head head;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Hand getHand() {
		return hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public Head getHead() {
		return head;
	}

	@Override
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

}
