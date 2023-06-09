package com.github.cleyton_orocha.java_jdbc.src.DAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.github.cleyton_orocha.java_jdbc.src.connections.ClassConnector;

public class PrintTable extends Query {

	public static void selectOwner(Integer ID_Owner) {
	    try (var conn = ClassConnector.connectionToMysql();
	         var pstm = conn.prepareStatement(selectAllOwner + " WHERE IDOWNER = ?")) {

	        pstm.setInt(1, ID_Owner);
	        ResultSet rset = pstm.executeQuery();

	        // Get information about the ResultSet columns
	        ResultSetMetaData metaData = rset.getMetaData();
	        int columnCount = metaData.getColumnCount();

	        // Set fixed width for each column
	        int columnWidth = 15;

	        // Print table separator line
	        printTableSeparator(columnCount, columnWidth);

	        // Print table header
	        printTableRow(metaData, columnCount, columnWidth);

	        // Print header separator line
	        printTableSeparator(columnCount, columnWidth);

	        // Print data rows
	        while (rset.next()) {
	            printTableRow(rset, columnCount, columnWidth);
	        }

	        // Print bottom separator line
	        printTableSeparator(columnCount, columnWidth);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void selectCarOwner(Integer ID_Owner) {
	    try (var conn = ClassConnector.connectionToMysql();
	         var pstm = conn.prepareStatement(selectOwnerCar)) {

	        pstm.setInt(1, ID_Owner);
	        ResultSet rset = pstm.executeQuery();

	        // Get information about the ResultSet columns
	        ResultSetMetaData metaData = rset.getMetaData();
	        int columnCount = metaData.getColumnCount();

	        // Set fixed width for each column
	        int columnWidth = 15;

	        // Print table separator line
	        printTableSeparator(columnCount, columnWidth);

	        // Print table header
	        printTableRow(metaData, columnCount, columnWidth);

	        // Print header separator line
	        printTableSeparator(columnCount, columnWidth);

	        // Print data rows
	        while (rset.next()) {
	            printTableRow(rset, columnCount, columnWidth);
	        }

	        // Print bottom separator line
	        printTableSeparator(columnCount, columnWidth);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void selectAddress(Integer ID_Owner) {
	    try (var conn = ClassConnector.connectionToMysql();
	         var pstm = conn.prepareStatement(selectOwnerAddress)) {

	        pstm.setInt(1, ID_Owner);
	        ResultSet rset = pstm.executeQuery();

	        // Get information about the ResultSet columns
	        ResultSetMetaData metaData = rset.getMetaData();
	        int columnCount = metaData.getColumnCount();

	        // Set fixed width for each column
	        int columnWidth = 15;

	        // Print table separator line
	        printTableSeparator(columnCount, columnWidth);

	        // Print table header
	        printTableRow(metaData, columnCount, columnWidth);

	        // Print header separator line
	        printTableSeparator(columnCount, columnWidth);

	        // Print data rows
	        while (rset.next()) {
	            printTableRow(rset, columnCount, columnWidth);
	        }

	        // Print bottom separator line
	        printTableSeparator(columnCount, columnWidth);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void selectPhones(Integer ID_Owner) {
	    try (var conn = ClassConnector.connectionToMysql();
	         var pstm = conn.prepareStatement(selectOwnerPhone)) {

	        pstm.setInt(1, ID_Owner);
	        ResultSet rset = pstm.executeQuery();

	        // Get information about the ResultSet columns
	        ResultSetMetaData metaData = rset.getMetaData();
	        int columnCount = metaData.getColumnCount();

	        // Set fixed width for each column
	        int columnWidth = 15;

	        // Print table separator line
	        printTableSeparator(columnCount, columnWidth);

	        // Print table header
	        printTableRow(metaData, columnCount, columnWidth);

	        // Print header separator line
	        printTableSeparator(columnCount, columnWidth);

	        // Print data rows
	        while (rset.next()) {
	            printTableRow(rset, columnCount, columnWidth);
	        }

	        // Print bottom separator line
	        printTableSeparator(columnCount, columnWidth);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	private static void printTableRow(ResultSetMetaData metaData, int columnCount, int columnWidth) throws SQLException {
	    System.out.print("|");
	    for (int i = 1; i <= columnCount; i++) {
	        String columnName = metaData.getColumnName(i);
	        // Align the header with the fixed column width
	        System.out.printf(" %-" + columnWidth + "s |", columnName);
	    }
	    System.out.println();
	}

	private static void printTableRow(ResultSet rset, int columnCount, int columnWidth) throws SQLException {
	    System.out.print("|");
	    for (int i = 1; i <= columnCount; i++) {
	        String columnValue = rset.getString(i);
	        // Align the column values with the fixed width
	        System.out.printf(" %-" + columnWidth + "s |", columnValue);
	    }
	    System.out.println();
	}

	private static void printTableSeparator(int columnCount, int columnWidth) {
	    for (int i = 0; i < columnCount; i++) {
	        System.out.print("+");
	        for (int j = 0; j < columnWidth + 2; j++) {
	            System.out.print("-");
	        }
	    }
	    System.out.print("+");
	    System.out.println();
	}






}
