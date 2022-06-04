package homework;

public class multiDimensionalArrays {

	public static void main(String[] args) {

		String[][] cities = new String[3][3];
		
		cities[0][0] = "Ankara";
		cities[0][1] = "Bursa";
		cities[0][2] = "Istanbul";
		cities[1][0] = "Yalova";
		cities[1][1] = "Antalya";
		cities[1][2] = "Adana";
		cities[2][0] = "Ardahan";
		cities[2][1] = "Konya";
		cities[2][2] = "Kütahya";
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println(cities[i][j]);
			}
		}

	}

}
