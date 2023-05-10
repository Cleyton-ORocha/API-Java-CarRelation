package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connections.ClassConnector;
import entities.Phone;

public class PhoneDAO extends Query {

	public static List<Phone> listPhone() {

		List<Phone> listPhone = new ArrayList<>();

		try (var conn = ClassConnector.connectionToMysql();
			 var pstm = conn.prepareStatement(selectPhones);
			 var rset = (ResultSet) pstm.executeQuery();) {

			while (rset.next()) {
				
				Phone phone = new Phone();
				
				phone.setPhone(rset.getInt("Phone"));
				phone.setIDPhone(rset.getInt("IDPhone"));
				phone.setID_Owner(rset.getInt("ID_OWNER"));

				
				listPhone.add(phone);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listPhone;

	}

	public static void savePhone(Phone phone) {


		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(insertPhone)) {

			pstm.setInt(1, phone.getPhone());
			pstm.setDouble(2, phone.getID_Owner());
	
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updatePhone(Phone phone) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(updatePhone + "IDPhone = ?")){
			
			pstm.setInt(1, phone.getPhone());
			pstm.setInt(2, phone.getID_Owner());
			pstm.setInt(3, phone.getIDPhone());

			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void deletePhone(Phone phone) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(deleteIDPhone + "IDPhone = ?");) {
			
			pstm.setInt(1, phone.getIDPhone()); 
			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
