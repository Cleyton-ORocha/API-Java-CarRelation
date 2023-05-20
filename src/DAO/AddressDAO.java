package DAO;

import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import connections.ClassConnector;
import entities.Address;

public class AddressDAO extends Query{
	
	@SuppressWarnings("unused")
	private static Boolean execution = null;

	public static List<Address> listAddress() {

		List<Address> listAddress = new ArrayList<>();

		try (var conn = ClassConnector.connectionToMysql();
			 var pstm = conn.prepareStatement(selectAllAddress);
			 var rset = (ResultSet) pstm.executeQuery();) {

			while (rset.next()) {
				
				Address address = new Address();
				
				address.setIDAddress(rset.getInt("IDAddress"));
				address.setstate(rset.getString("State"));
				address.setcity(rset.getString("City"));
				address.setdistrict(rset.getString("District"));
				address.setstreet(rset.getString("Street"));
				address.setID_Owner(rset.getInt("ID_Owner"));

				
				listAddress.add(address);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listAddress;

	}

	public static void saveAddress(Address address) {
		
		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(insertAddress)) {
			
			pstm.setString(1, address.getstate().name());
			pstm.setString(2, address.getcity());
			pstm.setString(3, address.getdistrict());
			pstm.setString(4, address.getstreet());
			pstm.setInt(5, address.getID_Owner());
	
			try {
				execution = pstm.execute();
				System.out.println("Insertion Completed!");
			} catch (SQLIntegrityConstraintViolationException sql) {
				System.out.println("Email do cliente já cadastrado. \nTente novamente!");
			}
			
			
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateAddress(Address address) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(updateAddress + "ID_Owner = ?")){
			
			pstm.setString(1, address.getstate().name());
			pstm.setString(2, address.getcity());
			pstm.setString(3, address.getdistrict());
			pstm.setString(4, address.getstreet());
			pstm.setInt(5, address.getID_Owner());
			pstm.setInt(6, address.getID_Owner());
			
			pstm.execute();
			
			System.out.println("Update Completed!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void deleteAddress(Integer IDOwner) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(deleteIDPhone + "ID_Owner = ?")) {
			
			pstm.setInt(1, IDOwner); 
			
			pstm.execute();
			
			System.out.println("Endereço apagado conforme o ID do dono");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
