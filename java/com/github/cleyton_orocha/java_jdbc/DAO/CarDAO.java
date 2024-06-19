package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connections.ClassConnector;
import entities.Car;

public class CarDAO extends Query{

	public static List<Car> listCar() {

		List<Car> listCar = new ArrayList<>();

		try (var conn = ClassConnector.connectionToMysql();
			 var pstm = conn.prepareStatement(selectAllOwner);
			 var rset = (ResultSet) pstm.executeQuery();) {

			while (rset.next()) {
				
				Car car = new Car();
				
				car.setYear(rset.getInt("Year"));
				car.setPrice(rset.getDouble("Price"));
				car.setColor(rset.getString("Color"));
				car.setBrand(rset.getString("Brand"));
				car.setFactoryName(rset.getString("FactoryName"));
				car.setIDOwner(rset.getInt("ID_Owner"));

				
				listCar.add(car);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listCar;

	}

	public static void saveCar(Car car) {


		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(insertCar)) {

			pstm.setInt(1, car.getYear());
			pstm.setDouble(2, car.getPrice());
			pstm.setString(3, car.getColor().name());
			pstm.setString(4, car.getBrand().name());
			pstm.setString(5, car.getFactoryName());
			pstm.setInt(6, car.getID_Owner());
			
			pstm.execute();
			
			System.out.println("Insertion Completed!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateCar(Car car) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(updateCar + "IDCar = ?")){
			
			pstm.setInt(1, car.getYear());
			pstm.setDouble(2, car.getPrice());
			pstm.setString(3, car.getColor().name());
			pstm.setString(4, car.getBrand().name());
			pstm.setString(5, car.getFactoryName());
			pstm.setInt(6, car.getID_Owner());
			pstm.setInt(7, car.getIDCar());
			
			pstm.execute();
			
			System.out.println("Update Completed!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void deleteCar(Integer IDOwner) {

		try (var conn = ClassConnector.connectionToMysql(); var pstm = conn.prepareStatement(deleteIDCar + "IDCar = ?");) {
			
			pstm.setInt(1, IDOwner); 
			
			pstm.execute();
			
			System.out.println("Carro apagado conforme o ID do dono");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
