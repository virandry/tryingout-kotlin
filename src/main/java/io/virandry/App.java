package io.virandry;

import io.virandry.ktmodel.Person;

public class App {

	public static void main(String[] args) {
		Person person = new Person("Jake Hill", 24, "Stephen's College","virandry@gmail.com");
		System.out.println(person.getName());
	}

}
