package Abstract;

public class Bus extends Transport{
	@Override
	void start() {
		System.out.println("Автобус едет");
	}
	@Override
	void stop() {
		System.out.println("Автобус остановился");
	}
}
