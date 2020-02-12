class MainApp {
	MainApp() {
	}
	public static void main(String args[]) {

		System.out.println("Running MainApp");
		Student elaya = new Student("ElayaPerumal", 30, 'm');
		System.out.println(elaya.name);
		System.out.println(elaya.age);
                System.out.println(elaya.gender);

		System.out.println(elaya.getWelcomeMsg());
		Student jags = new Student("Jagathees", 31, 'm');
		System.out.println(jags.name);
		System.out.println(jags.age);
System.out.println(jags.gender);
		System.out.println(jags.getWelcomeMsg());
       Student VV = new Student("Vaigundan", 31, 'm' );
		System.out.println(VV.name);
		System.out.println(VV.age);
System.out.println(VV.gender);
Student rani = new Student("Rani", 30, 'f');
		System.out.println(rani.name);
		System.out.println(rani.age);
                System.out.println(rani.gender);

		System.out.println(rani.getWelcomeMsg());




	}
}

