package Incapsulation;

public class Person {
	// Инкапсуляция в Java является механизмом обёртывания данных (переменных) и
	// кода, работающего с данными (методами), в одно целое. В инкапсуляции
	// переменные класса будут скрыты от других классов и доступ к ним может быть
	// получен только с помощью метода их текущего класса.

	String name;
	int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}