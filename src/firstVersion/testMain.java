package firstVersion;

import java.util.ArrayList;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Read the order
		int laptopsNum = Integer.parseInt(args[0]);
		int mouseNum = Integer.parseInt(args[1]);
		int desktopNum = Integer.parseInt(args[2]);
		int screenNum = Integer.parseInt(args[3]);	
		
//		Save the order in arrays or array lists
		
		ArrayList<String> products = new ArrayList<String>();
		products.add("Laptops");
		products.add("Mouse");
		products.add("Desktop");
		products.add("LCD screen");
//		String[] product = {"Laptops", "Mouse", "Desktop", "LCD screen"};
		
//		System.out.println(products.get(0));
//		ArrayList<Integer> goodsNum = new ArrayList<Integer>();
//		goodsNum.add(laptopsNum);
//		goodsNum.add(mouseNum);
//		goodsNum.add(desktopNum);
//		goodsNum.add(screenNum);
		int[] goodsNum = {laptopsNum, mouseNum, desktopNum, screenNum};
//		System.out.println(goodNum[0]);
		
		
//		Compute the total Volume of the Shipment
		
		double laptopVolPer = 0.6 * 0.5 * 0.5;
		double mouseVolPer = 0.3 * 0.3 * 0.2;
		double desktopVolPer = 1.0 * 1.5 * 0.5;
		double screenVolPer = 1.2 * 1.4 * 0.8;
		
		double laptopVol = 0.6 * 0.5 * 0.5 * goodsNum[0];
		double mouseVol = 0.3 * 0.3 * 0.2 * goodsNum[1];
		double desktopVol = 1.0 * 1.5 * 0.5 * goodsNum[2];
		double screenVol = 1.2 * 1.4 * 0.8 * goodsNum[3];
		double shipmentVol = laptopVol + mouseVol + desktopVol + screenVol;
//		System.out.print(shipmentVol);
//		System.out.println();
//		Compute the total weight of the Shipment
		double laptopWeight = 6.5 * goodsNum[0];
		double mouseWeight = 0.2 * goodsNum[1];
		double desktopWeight = 20 * goodsNum[2];
		double screenWeight = 2.6 * goodsNum[3];
		double shipmentWeight = laptopWeight + mouseWeight + desktopWeight + screenWeight;
//		System.out.print(shipmentWeight);
		
		
//		Compute the total Volume of both containers
		double smallConVol = 2.59 * 2.43 * 6.06;
		double bigConVol = 2.59 * 2.43 * 12.01;
		
//		System.out.println(1.4 * 0.39 *12 / mouseVolPer);
//		Select the type of container according to shipment volume
		
		double bigPricePerVol = 1800 / bigConVol;
		double smallPricePerVolLess50 = 1000 / smallConVol;
		double smallPricePerVolMore50 = 1200 / smallConVol;
//		System.out.println(bigPricePerVol);
//		System.out.println(smallPricePerVolLess50);
//		System.out.println(smallPricePerVolMore50);
		

//		double i;
//		double x, y, z;
//		int N = 1;
//		
		
//		for (double i = 0; desktopVol * N <= bigConVol; i++) {
//			
//		}
//		while (i < shipmentVol) {
//			
//		}
		
//		if 
		
//		As big containers are more cost-effective, Try to use more big containers
		double bigContainerNum = shipmentVol / bigConVol;
		double smallContainerNum = 0;
		
//		If there is a remainder, first use Math.floor to decide the least number of big Container
		if (bigContainerNum % 1 != 0) {
			bigContainerNum = Math.floor(bigContainerNum);
//			System.out.print(bigContainerNum);
		}
		
//		calculate the Volume of left shipment
		double shipmentVolLeft = shipmentVol - (bigConVol * bigContainerNum);
//		System.out.print(shipmentVolLeft);
		
//		Compare the suitable shipping methods
//		for (int i = 1; i  < bigContainerNum + 1; i--) {
//			for (int j = 0; j < Math.ceil(shipmentVol / smallConVol); j++) {
//				
//			}
//		}
		
		double price = 0;
		

		for (int i = 0; i < 2; i++) {
			switch (i) {
			case 0: 
				// Only Use Big Containers
				if (shipmentVolLeft >= smallConVol) {
					bigContainerNum += 1;
					price = 1800 * bigContainerNum;
					break;
				}
				
			case 1:
				// Only Use 1 small containers 
				if (shipmentVolLeft < smallConVol) {
					double laptopWeightPerVol = 6.5 / laptopVolPer; //43.3
				    double mouseWeightPerVol = 0.2 / mouseVolPer; //11.1
				    double desktopWeightPerVol = 20 / desktopVolPer; //26.7
				    double screenWeightPerVol = 2.6 / screenVolPer; //1.9
				    
					for (i = 0; i < 4; i++) {
						//Laptop, Mouse, Desktop, LCD screens
						Double[] itemLength = {0.6, 0.3, 1.0, 1.2};
						Double[] itemWeight = {0.5, 0.3, 1.5, 1.4};
						Double[] itemHeight = {0.5, 0.2, 0.5, 0.8};
//put items into bigcontainers in thisOrder: Desktop, laptop, LCD screens, Mouse
//						Double[] itemLength = {1.0, 0.6, 1.2, 0.3};
//						Double[] itemWeight = {1.5, 0.5, 1.4, 0.3};
//						Double[] itemHeight = {0.5, 0.5, 0.8, 0.2};
//						 if ()
					}
				}
				
					//Order: Desktop > Laptop > LCD screens > mouse
			
			}
		}
		

		// Sorry Professor, I'm stuck on solving this project, therefore I fail to finish iit.
		
		
		
		
		
		
		
		
	}

}
