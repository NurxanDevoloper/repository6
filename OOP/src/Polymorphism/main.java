package Polymorphism;

public class main {

	public static void main(String[] args) {
		// Полиморфизм - греческое слово, обозначающее как poly- "много", morph -
		// "форма"
		// Способность объекта идентифицироваться как более чем один тип.

		// Это принцип программирования, который позволяет одному коду работать с
		// разными типами данных. Это значит, что мы можем использовать один и тот же
		// интерфейс или метод для разных объектов, и они будут вести себя по-разному в
		// зависимости от типа объекта.

		Car car = new Car();
		Bysicle bysicle = new Bysicle();
		Boat boat = new Boat();

		Vehicle[] racers = { car, bysicle, boat };

		car.go();
		bysicle.go();
		boat.go();

		for (Vehicle x : racers) {
			x.go();
		}

	}

}
