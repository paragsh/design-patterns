package example2;

public class AdapterDemo {

	public static void main(String[] args) {

		// class adapter
		System.out.println("class adapter test");
		TemperatureInfo tempInfo = new TemperatureClassAdapter();
		testTempInfo(tempInfo);

		// object adapter
		System.out.println("\nobject adapter test");
		tempInfo = new TemperatureObjectAdapter();
		testTempInfo(tempInfo);

	}

	public static void testTempInfo(TemperatureInfo tempInfo) {
		tempInfo.setTemperatureInC(0);
		System.out.println("temp in C:" + tempInfo.getTemperatureInC());
		System.out.println("temp in F:" + tempInfo.getTemperatureInF());

		tempInfo.setTemperatureInF(85);
		System.out.println("temp in C:" + tempInfo.getTemperatureInC());
		System.out.println("temp in F:" + tempInfo.getTemperatureInF());
	}

}