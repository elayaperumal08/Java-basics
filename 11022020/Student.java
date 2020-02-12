class Student {

	String name;
	int age;
        char gender;

	
	Student(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	String getWelcomeMsg() {
		return "Welcome, " + getTitle() + this.name;
	}

	String getTitle() {
		/* if(gender == 'm')
			return "Mr.";
		else 
			return "Ms."; */
		return gender == 'm' ? "Mr.":"Ms.";

	}

	
		
}

