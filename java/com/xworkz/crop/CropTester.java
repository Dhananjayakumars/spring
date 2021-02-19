package com.xworkz.crop;

public class CropTester {
	public static void main(String[] args) {
		
		CropEntity cropEntity=new CropEntity("ragi", CropType.RABI, 50, CropSeason.SUMMER, true, 4);
		CropDAO cropDAO= new CropDAOImpl();
		cropDAO.saveCrop(cropEntity);
	}

}
