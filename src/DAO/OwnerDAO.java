package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connections.ClassConnector;
import entities.Owner;

public class OwnerDAO extends Query {

	public static List<Owner> listOwner(Owner owner) {

		List<Owner> listOwner = new ArrayList<>();

		try (var conn = ClassConnector.connectionToMysql();
			 var pstm = conn.prepareStatement(selectAllOwner);
			 var rset = (ResultSet) pstm.executeQuery();) {

			while (rset.next()) {

				owner.setID(rset.getInt("IDOwner"));
				owner.setName(rset.getString("Name"));
				owner.setCpf(rset.getString("CPF"));
				owner.setGender(rset.getString("Gender"));

				listOwner.add(owner);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listOwner;

	}

	public static void saveOwner(Owner owner) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(insertOwner)) {

			pstm.setString(1, owner.getName());
			pstm.setString(2, owner.getCpf());
			pstm.setInt(3, owner.getAge());
			pstm.setString(4, owner.getGender().name());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateOwner(Owner owner) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(updateOwner + "IDOwner = ?")){
			
			pstm.setString(1, owner.getName());
			pstm.setString(2, owner.getCpf());
			pstm.setInt(3, owner.getAge());
			pstm.setString(4, owner.getGender().name());
			pstm.setInt(5, owner.getID());
			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void deleteOwner(Owner owner) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(deleteIDOwner + "IDOwner = ?");) {
			
			pstm.setInt(1, owner.getID()); 
			
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
