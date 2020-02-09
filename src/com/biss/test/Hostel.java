package com.biss.test;

import java.util.Arrays;

public class Hostel {
	private Integer roomNo;
	private String[] people;
	public Integer getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}
	public String[] getPeople() {
		return people;
	}
	public void setPeople(String[] people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "Hostel [roomNo=" + roomNo + ", people=" + Arrays.toString(people) + ", getRoomNo()=" + getRoomNo()
				+ ", getPeople()=" + Arrays.toString(getPeople()) + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
