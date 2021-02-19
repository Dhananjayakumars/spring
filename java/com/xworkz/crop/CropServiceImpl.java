package com.xworkz.crop;

import org.hibernate.engine.jdbc.spi.ResultSetReturn;

import net.bytebuddy.asm.Advice.Return;



public class CropServiceImpl implements CropService {
	private CropDAO cropDAO;
	 public CropServiceImpl(CropDAO cropDAO) {
		 System.out.println("created"+this.getClass().getSimpleName());
			this.cropDAO=cropDAO;
	}

	@Override
	public boolean validation(CropEntity cropEntity) {
		System.out.println("validation invoked");
		System.out.println("cropEntity " + cropEntity);

		String cropName = cropEntity.getName();
		CropType cropType = cropEntity.getType();
		double price = cropEntity.getPrice();
		CropSeason cropSeason = cropEntity.getSeason();
		boolean organic = cropEntity.isOrganic();
		int croplife = cropEntity.getLife();

		boolean valid = false;
		if (cropEntity != null) {
			if (cropName != null && !cropName.isEmpty() && cropName.length() > 3 && cropName.length() <= 15) {
				System.out.println("crop name is valid");
				valid = true;
			} else {
				System.out.println(
						"crop name is invalid, please enter minimum 3 charecters or maximum 15 charecters and it should not be empty");
				valid = false;
			}
			if (valid) {
				if (cropType != null) {
					System.out.println("crop type is valid");
					valid = true;

				} else {
					System.out.println("crop type can not be empty");
					valid = false;
				}
				if (valid) {
					if (price >= 2 && price <= 1000 && price != 0) {
						System.out.println("price is valid");
						valid = true;
					} else {
						System.out.println("price should be within 2 to 1000");
						valid = false;
					}
					if (valid) {
						if (cropSeason != null) {
							System.out.println("crop season is valid");
							valid = true;
						} else {
							System.out.println("crop season can not be null");
							valid = false;
						}
						if (valid) {
							if (croplife != 0 && croplife >= 0.5) {
								System.out.println("crop life is valid");
								valid = true;
							} else {
								System.out.println("crop life should be more than 0.5 ");
							}
						}
					}
				}

			}else {
				System.out.println("create a cropentity properly");
			}if(valid) {
				System.out.println("crop is valid, can save");
				cropDAO.saveCrop(cropEntity);
			} else {
				System.out.println("crop is invalid cant save");
			}

				
			}
			

		



		return valid;

	}
  
}
