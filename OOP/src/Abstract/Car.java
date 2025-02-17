package Abstract;

public class Car extends Transport{
	@Override
	void start() {
		System.out.println("Машина едет");
	}
	@Override
	void stop() {
		System.out.println("Машина остановилась");
	}
}
