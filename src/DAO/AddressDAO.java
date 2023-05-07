package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connections.ClassConnector;
import entities.Address;

public class AddressDAO extends Query{

	public static List<Address> listAddress(Address address) {

		List<Address> listAddress = new ArrayList<>();

		try (var conn = ClassConnector.connectionToMysql();
			 var pstm = conn.prepareStatement(selectAllAddress);
			 var rset = (ResultSet) pstm.executeQuery();) {

			while (rset.next()) {
				
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
	
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateAddress(Address address) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(updateAddress + "IDAddress = ?")){
			
			pstm.setString(1, address.getstate().name());
			pstm.setString(2, address.getcity());
			pstm.setString(3, address.getdistrict());
			pstm.setString(4, address.getstreet());
			pstm.setInt(5, address.getID_Owner());
			pstm.setInt(6, address.getIDAddress());

			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void deleteAddress(Address address) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(deleteIDPhone + "IDAddress = ?");) {
			
			pstm.setInt(1, address.getIDAddress()); 
			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
