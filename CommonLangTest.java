package com.practise;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CommonLangTest {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object other) {
		return EqualsBuilder.reflectionEquals(this, other);
	}

	public static void main(String args[]) {
		CommonLangTest commonLangTestObj = new CommonLangTest();
		commonLangTestObj.setName("Mary");
		commonLangTestObj.setAge(40);

		System.out.println("Test Object 1: " + commonLangTestObj.toString());

		CommonLangTest commonLangTestObj2 = new CommonLangTest();
		commonLangTestObj2.setName("Mary");
		commonLangTestObj2.setAge(23);

		System.out.println("Test Object 2: " + commonLangTestObj2.toString());

		boolean equalsResult = commonLangTestObj.equals(commonLangTestObj2);
		System.out.println("Check if objects are equal: " + equalsResult);
	}
}
