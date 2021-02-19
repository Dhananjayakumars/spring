package com.xworkz.crop;

public class ServiceTester {

	public static void main(String[] args) {
		CropEntity cropEntity=new CropEntity();
		
		cropEntity.setName("banana");
		cropEntity.setSeason(CropSeason.RAINY);
		cropEntity.setLife(2);
		cropEntity.setOrganic(true);
		cropEntity.setPrice(30);
        cropEntity.setType(CropType.ZAID);
		
//		CropService cropService=new CropServiceImpl();
//		 boolean validation = cropService.validation(cropEntity);
//		 System.out.println(validation);
//		 System.out.println("data is ready to save");
		 
	}

}
