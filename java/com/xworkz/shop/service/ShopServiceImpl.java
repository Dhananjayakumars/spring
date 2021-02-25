package com.xworkz.shop.service;

import com.xworkz.shop.Dao.ShopDAO;
import com.xworkz.shop.entity.ShopEntity;

public class ShopServiceImpl implements ShopService {
	private ShopDAO shopDAO;

	public ShopServiceImpl(ShopDAO shopDAO) {
		System.out.println("created" + this.getClass().getSimpleName());
		this.shopDAO = shopDAO;
	}

	@Override
	public boolean validation(ShopEntity shopEntity) {
		System.out.println("validation invoked");
		System.out.println("ShopEntity " + shopEntity);

		String shopName = shopEntity.getShopName();
		String shopLocation = shopEntity.getLocation();
		String ownerName = shopEntity.getOwnerName();
		boolean open = shopEntity.isOpen();

		boolean valid = false;
		
    	if (shopEntity != null) {
			if (shopName!= null && !shopName.isEmpty() && shopName.length() > 3 && shopName.length() <= 32) {
				System.out.println("shop name is valid");
				valid = true;
			} else {
				System.out.println(
						"shop name is invalid, please enter minimum 3 charecters or maximum 12charecters and it should not be empty");
				valid = false;
			}
			if (valid) {
				if (shopLocation != null && shopLocation.length()>3 && shopLocation.length()<=12) {
					System.out.println("shopLocation is valid");
					valid = true;

				} else {
					System.out.println("shopLocation is invalid, please enter min 3 chracters max 12");
					valid = false;
				}
				if (valid) {
					if (ownerName !=null  && ownerName.length()>4  && ownerName.length()<=12) {
						System.out.println("ownerName is valid");
						valid = true;
					} else {
						System.out.println("ownerName should be within 4to 12");
						valid = false;
					}
				
					}
				}

			else {
				System.out.println("create a shopdto properly");
			}if(valid) {
				System.out.println("shop is valid, can save");
				shopDAO.saveAndInsert(shopEntity);
			} else {
				System.out.println("Shop is invalid cant save");
			}

    	}		
	

			

return valid;
		
		
	}
	

}
