import DAO.AddressDAO;
import DAO.CarDAO;
import DAO.OwnerDAO;
import DAO.PhoneDAO;
import DAO.PrintTable;
import controller.InsertTratament;
import controller.dataTratament;

public class Main {

	public static void main(String[] args) {
		primaryMenu:
		while (true) {

			Integer cod = dataTratament.treatmentMenu(3, "firstMenu");

					
					while (cod == 1) {
						
						cod = dataTratament.treatmentMenu(5, "secondMenu");
						
						while (cod == 1) {
								
								cod = dataTratament.treatmentMenu(6, "thirdMenu");
								
								if (cod == 1) OwnerDAO.saveOwner(InsertTratament.InsertOwner("INSERT"));
								if (cod == 2) CarDAO.saveCar(InsertTratament.InsertCar("INSERT"));
								if (cod == 3) AddressDAO.saveAddress(InsertTratament.InsertAddress());
								if (cod == 4) PhoneDAO.savePhone(InsertTratament.InsertPhone("INSERT"));
								if (cod == 5) continue primaryMenu;
								if (cod == 6) {
									System.out.println("Application closed. Thanks!");
									System.exit(0);
								} 

								
							}
						
							while (cod == 2) {
								
								cod = dataTratament.treatmentMenu(6, "fourthMenu");
								
								if (cod == 1) OwnerDAO.deleteOwner(dataTratament.tratamentIdOwner());
								if (cod == 2) CarDAO.deleteCar(dataTratament.tratamentIdCar());
								if (cod == 3) AddressDAO.deleteAddress(dataTratament.tratamentIdOwner());
								if (cod == 4) PhoneDAO.deletePhone(dataTratament.tratamentIdPhone());
								if (cod == 5) break;
								if (cod == 6) {
									System.out.println("Application closed. Thanks!");
									System.exit(0);
								} 
							}
						

							while (cod == 3) {
								
								cod = dataTratament.treatmentMenu(6, "fifthMenu");
								
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
						
						if (cod == 4) break;
						if (cod == 5) {
							System.out.println("Application closed. Thanks!");
							System.exit(0);
						}
					}
					
					
					while (cod == 2) {
						
						cod = dataTratament.treatmentMenu(6, "sixthMenu");
						
						if (cod == 1) PrintTable.selectOwner(dataTratament.tratamentIdOwner());
						if (cod == 2) PrintTable.selectCarOwner(dataTratament.tratamentIdOwner());
						if (cod == 3) PrintTable.selectAddress(dataTratament.tratamentIdOwner());
						if (cod == 4) PrintTable.selectPhones(dataTratament.tratamentIdOwner());
						if (cod == 5) break;
						if (cod == 6) {
							System.out.println("Application closed. Thanks!");
							System.exit(0);
						} 
					}
					
				if (cod == 3) {
					System.out.println("Application closed. Thanks!");
					System.exit(0);
				} 
			}
	   	}
	}

