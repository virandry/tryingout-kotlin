package app

import io.virandry.ktmodel.Person;

fun main(args: Array<String>) {
	println("hello" + "world")
	
	/*var jake = Person()
	jake.name = "andry m"
	jake.age = 24
	jake.college = "UTM"
	
	println(jake.name +" "+ jake.age + " " + jake.college)
	*/
	var person = Person("andry m", 17, "UTM","virandry@gmail.com")
	println(person.name +" "+ person.age + " " + person.college + " " + person.email + " " + person.isEligibleAge())
	println(person.isTeenager())
}

fun Person.isTeenager(): Boolean {
 
    // If age falls in the range
    // 13-19 return true
 
    return age in 13..19
}