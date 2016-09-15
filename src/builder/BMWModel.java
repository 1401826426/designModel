package builder;

public class BMWModel extends CarModel{
	@Override
	protected void start() {
		System.out.println("宝马是这样发动的");
	}

	@Override
	protected void stop() {
		System.out.println("宝马是这样停车的");
		
	}

	@Override
	protected void alarm() {
		System.out.println("宝马是这样响喇叭的");
		
	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马的引擎是这样响的");
	}

}
