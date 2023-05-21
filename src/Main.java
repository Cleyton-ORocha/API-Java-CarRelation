


import DAO.AddressDAO;
import DAO.CarDAO;
import DAO.OwnerDAO;
import DAO.PhoneDAO;
import DAO.PrintTable;
import controller.InitialTreatment;
import controller.InsertTratament;

public class Main {

	public static void main(String[] args) {

		while (true) {

			Integer cod = InitialTreatment.treatmentMenu(3, "firstMenu");

				if (cod == 1) {

					while (true) {
						
						cod = InitialTreatment.treatmentMenu(5, "secondMenu");
						
						if (cod == 1) {
							
							while (true) {
								
								cod = InitialTreatment.treatmentMenu(6, "thirdMenu");
								
								if (cod == 1) OwnerDAO.saveOwner(InsertTratament.InsertOwner("INSERT"));
								if (cod == 2) CarDAO.saveCar(InsertTratament.InsertCar("INSERT"));
								if (cod == 3) AddressDAO.saveAddress(InsertTratament.InsertAddress());
								if (cod == 4) PhoneDAO.savePhone(InsertTratament.InsertPhone("INSERT"));
								if (cod == 5)
									break;
								if (cod == 6) {
									System.out.println("Application closed. Thanks!");
									System.exit(0);
								} 
							}
						}
						
					
						else if (cod == 2) {

							while (true) {
								
								cod = InitialTreatment.treatmentMenu(6, "fourthMenu");
								
								if (cod == 1) OwnerDAO.deleteOwner(InitialTreatment.tratamentIdOwner());
								if (cod == 2) CarDAO.deleteCar(InitialTreatment.tratamentIdCar());
								if (cod == 3) AddressDAO.deleteAddress(InitialTreatment.tratamentIdOwner());
								if (cod == 4) PhoneDAO.deletePhone(InitialTreatment.tratamentIdPhone());
								if (cod == 5) break;
								if (cod == 6) {
									System.out.println("Application closed. Thanks!");
									System.exit(0);
								} 
							}
						}
						
						else if (cod == 3) {

							while (true) {
								
								cod = InitialTreatment.treatmentMenu(6, "fifthMenu");
								
								if (cod == 1) OwnerDAO.updateOwner(InsertTratament.InsertOwner("UPDATE"));
								if (cod == 2) CarDAO.updateCar(InsertTratament.InsertCar("UPDATE"));
								if (cod == 3) AddressDAO.updateAddress(InsertTratament.InsertAddress());
								if (cod == 4) PhoneDAO.updatePhone(InsertTratament.InsertPhone("UPDATE"));
								if (cod == 5) break;
								if (cod == 6) {
									System.out.println("Application closed. Thanks!");
									System.exit(0);
								} 
							}
						}
						
						else if (cod == 4) break;
						else if (cod == 5) {
							System.out.println("Application closed. Thanks!");
							System.exit(0);
						}
					}
				}
				if (cod == 2) {
					
					while (true) {
						
						cod = InitialTreatment.treatmentMenu(6, "sixthMenu");
						
						if (cod == 1) PrintTable.selectOwner(InitialTreatment.tratamentIdOwner());
						if (cod == 2) PrintTable.selectCarOwner(InitialTreatment.tratamentIdOwner());
						if (cod == 3) PrintTable.selectAddress(InitialTreatment.tratamentIdOwner());
						if (cod == 4) PrintTable.selectPhones(InitialTreatment.tratamentIdOwner());
						if (cod == 5) break;
						if (cod == 6) {
							System.out.println("Application closed. Thanks!");
							System.exit(0);
						} 
					}
					
					
				}
				
				if (cod == 3) {
					System.out.println("Application closed. Thanks!");
					System.exit(0);
				} 
			}
	   	}
	}

