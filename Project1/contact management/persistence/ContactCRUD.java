package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Contact;

public class ContactCRUD {
    ConnectionPool connectionPool;
    public ContactCRUD() {
	connectionPool = new ConnectionPool();
    }
    public void addContact (Contact contact) throws SQLException {
	Connection connection = connectionPool.getConnection();
	String insertStatement = "INSERT INTO CONTACT (NAME, PHONE_NUMBER) VALUES (?, ?)";
	try(PreparedStatement statement = connection.prepareStatement(insertStatement)){
	    statement.setString(1, contact.getName());
	    statement.setString(2, contact.getPhoneNumber());
	    statement.executeUpdate();
	}
    }
    public List<Contact> searchContact (String word) throws SQLException{
	Connection connection = connectionPool.getConnection();
	String selectStatement = "SELECT NAME, PHONE_NUMBER, ID FROM CONTACT WHERE NAME LIKE ?";
	try(PreparedStatement statement = connection.prepareStatement(selectStatement)){
	    statement.setString(1, word+ "%");
	    ResultSet result = statement.executeQuery();
	    List<Contact> contacts = new ArrayList<>();
	    while(result.next()) {
		Contact contact = new Contact();
		contact.setName(result.getString(1));
		contact.setPhoneNumber(result.getString(2));
		contact.setId(result.getInt(3));
		contacts.add(contact);
	    }
	    return contacts;
	}
    }
    public void updateContact (Contact contact) throws SQLException {
	Connection connection = connectionPool.getConnection();
	String updateStatement = "UPDATE CONTACT SET NAME = ?, PHONE_NUMBER = ? WHERE ID = ?";
	try(PreparedStatement statement = connection.prepareStatement(updateStatement)){
	    statement.setString(1, contact.getName());
	    statement.setString(2, contact.getPhoneNumber());
	    statement.setInt(3, contact.getId());
	    statement.executeUpdate();
	}
    }
    public void updatePhoneNumber (Contact contact) throws SQLException {
	Connection connection = connectionPool.getConnection();
	String updateStatement = "UPDATE CONTACT SET PHONE_NUMBER = ? WHERE ID = ?";
	try(PreparedStatement statement = connection.prepareStatement(updateStatement)){
	    statement.setString(1, contact.getPhoneNumber());
	    statement.setInt(2, contact.getId());
	    statement.executeUpdate();
	}
    }
    public void updateName (Contact contact) throws SQLException {
	Connection connection = connectionPool.getConnection();
	String updateStatement = "UPDATE CONTACT SET NAME = ? WHERE ID = ?";
	try(PreparedStatement statement = connection.prepareStatement(updateStatement)){
	    statement.setString(1, contact.getName());
	    statement.setInt(2, contact.getId());
	    statement.executeUpdate();
	}
    }
    public void deleteContact (Integer id) throws SQLException {
	Connection connection = connectionPool.getConnection();
	String deleteStatement = "DELETE FROM CONTACT WHERE ID = ?";
	try(PreparedStatement statement = connection.prepareStatement(deleteStatement)){
	    statement.setInt(1, id);
	    statement.executeUpdate();
	}
    }
    
}
