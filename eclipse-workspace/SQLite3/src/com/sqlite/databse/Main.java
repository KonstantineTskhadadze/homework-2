package com.sqlite.databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		final String url = "jdbc:sqlite:"
				.concat("C:\\Users\\ktskh\\eclipse-workspace\\SQLite3\\database\\test.db");
		final String insert = "INSERT INTO person(person_id, person_name, person_lastname) VALUES(%d, \"%s\", \"%s\");";
		try {
			final Connection connection = DriverManager.getConnection(url);
			final String sql = "SELECT * FROM person";
			final Statement statement = connection.createStatement();
			final ResultSet result = statement.executeQuery(sql);
			final Set<Integer> set = new HashSet<>();
			while(result.next()) {
				final Integer id = result.getInt("person_id");
				final String name = result.getString("person_name");
				final String lastname = result.getString("person_lastname");
				set.add(id);
				System.out.printf("%s | %s | %s\n", id, name, lastname);
			}
			int max = set.stream().max(Integer::compareTo).get() + 1;
			if(set.contains(max)) {
				statement.executeUpdate(String.format(insert, max, "Aleksandre", "Nizharadze"));
				set.add(max);
			}
			if(set.contains(max + 1)) {
				statement.executeUpdate(String.format(insert, max + 1, "Mamuka", "Gamkrelidze"));
				set.add(max + 1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
