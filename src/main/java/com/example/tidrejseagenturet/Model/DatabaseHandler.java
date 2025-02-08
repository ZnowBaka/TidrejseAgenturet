package com.example.tidrejseagenturet.Model;

import com.example.tidrejseagenturet.Utilities.DatabaseConnection;

import java.sql.*;

public class DatabaseHandler {

    //region Customer Queries
    public void createCustomer(Customer customer) throws SQLException {
        String SQL = "INSERT INTO customers(firstName, lastName, email, phoneNumber) VALUES(?,?,?,?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getEmail());
            preparedStatement.setString(4, customer.getPhone());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Customer " + customer.getFirstName() + " " + customer.getLastName() + " has been created successfully");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Customer readCustomer() throws SQLException {
        String sql = "SELECT * FROM customers WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            String email = resultSet.getString("email");
            String phoneNumber = resultSet.getString("phoneNumber");

            return new Customer(id, firstName, lastName, email, phoneNumber);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateCustomer(Customer customer, int DBIndex) throws SQLException {
        String sql = ("UPDATE customers SET firstName = ?, lastName = ?, email = ?, phoneNumber = ? WHERE itemID = " + DBIndex);
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getEmail());
            preparedStatement.setString(4, customer.getPhone());

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Customer with ID " + customer.getId() + " has been updated successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCustomer(Customer customer, int DBIndex) throws SQLException {
        String sql = ("DELETE FROM customers (WHERE id = ? VALUES(?)");
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, DBIndex);

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Customer with ID " + customer.getId() + " has been deleted successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //endregion

    //region TimeMachine Queries
    public void createTimeMachine(TimeMachine timeMachine) throws SQLException {
        String SQL = "INSERT INTO time_machines(name, capacity, operational_status, booked_status) VALUES(?,?,?,?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setString(1, timeMachine.getName());
            preparedStatement.setString(2, String.valueOf(timeMachine.getCapacity()));
            preparedStatement.setString(3, String.valueOf(timeMachine.isBookingStatus()));
            preparedStatement.setString(4, String.valueOf(timeMachine.isOperationalStatus()));

            int roswsInserted = preparedStatement.executeUpdate();
            if (roswsInserted > 0) {
                System.out.println("Time machine " + timeMachine.getName() + " has been created successfully");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public TimeMachine readTimeMachine(int DBIndex) throws SQLException {
        String sql = "SELECT * FROM time_machines WHERE id = " + DBIndex;

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int capacity = resultSet.getInt("capacity");
            boolean operationalStatus = resultSet.getBoolean("operational_status");
            boolean bookingStatus = resultSet.getBoolean("booked_status");

            return new TimeMachine(id, name, capacity, operationalStatus, bookingStatus);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateTimeMachine(TimeMachine timeMachine, int DBIndex) {
        String sql = ("UPDATE time_machines SET name = ?, capacity = ?, operational_status = ?, booked_status = ? WHERE itemID = " + DBIndex);
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, timeMachine.getName());
            preparedStatement.setString(2, String.valueOf(timeMachine.getCapacity()));
            preparedStatement.setString(3, String.valueOf(timeMachine.isBookingStatus()));
            preparedStatement.setString(4, String.valueOf(timeMachine.isOperationalStatus()));

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Time machine " + timeMachine.getName() + " has been updated successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteTimeMachine(TimeMachine timeMachine, int DBIndex) throws SQLException {
        String sql = ("DELETE FROM time_machines WHERE id = " + DBIndex);
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, timeMachine.getId());

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Time machine " + timeMachine.getName() + " has been deleted successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //endregion

    //region TimePeriod Queries
    public void createTimePeriod(TimePeriod timePeriod) throws SQLException {
        String SQL = "INSERT INTO time_periods(name, description) VALUES(?,?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setString(1, timePeriod.getTimeEra());
            preparedStatement.setString(2, timePeriod.getEraDescription());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Time period " + timePeriod.getTimeEra() + " has been created successfully");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public TimePeriod readTimePeriod(int DBIndex) throws SQLException {
        String sql = ("SELECT * FROM time_periods WHERE id = " + DBIndex);

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            int id = resultSet.getInt("id");
            String timeEra = resultSet.getString("name");
            String eraDescription = resultSet.getString("description");

            return new TimePeriod(id, timeEra, eraDescription);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateTimePeriod(TimePeriod timePeriod, int DBIndex) throws SQLException {
        String sql = ("UPDATE time_periods SET name = ?, description = ? WHERE itemID = " + DBIndex);
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, timePeriod.getTimeEra());
            preparedStatement.setString(2, timePeriod.getEraDescription());

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Time period " + timePeriod.getTimeEra() + " has been updated successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteTimePeriod(TimePeriod timePeriod, int DBIndex) throws SQLException {
        String sql = ("DELETE FROM time_periods WHERE id = " + DBIndex);
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, timePeriod.getId());

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Time period " + timePeriod.getTimeEra() + " has been deleted successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //endregion

    //region Guide Queries
    public void createGuide(Guide guide) throws SQLException {
        String SQL = "INSERT INTO guides(name, specialty) VALUES(?,?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setString(1, guide.getName());
            preparedStatement.setString(2, guide.getSpecialty());

            int roswsInserted = preparedStatement.executeUpdate();
            if (roswsInserted > 0) {
                System.out.println("Guide " + guide.getName() + " has been created successfully");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Guide readGuide(int DBIndex) throws SQLException {
        String sql = ("SELECT * FROM guides WHERE id = " + DBIndex);

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String specialty = resultSet.getString("specialty");

            return new Guide(id, name, specialty);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateGuide(Guide guide, int DBIndex) throws SQLException {
        String sql = ("UPDATE time_periods SET name = ?, specialty = ? WHERE itemID = " + DBIndex);
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, guide.getName());
            preparedStatement.setString(2, guide.getSpecialty());

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Guide " + guide.getName() + " has been updated successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteGuide(Guide guide, int DBIndex) throws SQLException {
        String sql = ("DELETE FROM time_periods WHERE id = " + DBIndex);
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, guide.getId());

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Guide " + guide.getName() + " has been deleted successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //endregion

    //region Booking Queries
    public void createBooking(Reservation reservation) throws SQLException {

        String SQL = "INSERT INTO bookings(customer_id, time_machine_id, time_period_id, guide_id) VALUES(?,?,?,?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setString(1, String.valueOf(reservation.getCustomerId()));
            preparedStatement.setString(2, String.valueOf(reservation.getTimeMachineId()));
            preparedStatement.setString(3, String.valueOf(reservation.getReservationId()));
            preparedStatement.setString(4, String.valueOf(reservation.getGuideId()));

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Booking for customer ID: " + reservation.getCustomerId() + " has been created successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Reservation readBooking(int DBIndex) throws SQLException {
        String sql = ("SELECT * FROM bookings WHERE id = " + DBIndex);

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            int id = resultSet.getInt("id");
            int customerId = resultSet.getInt("customer_id");
            int timeMachineId = resultSet.getInt("time_machine_id");
            int timePeriodId = resultSet.getInt("time_period_id");
            int guideId = resultSet.getInt("guide_id");

            return new Reservation(id, customerId, timeMachineId, timePeriodId, guideId);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateBooking(Reservation reservation, int DBIndex) throws SQLException {
        String sql = ("UPDATE bookings SET customer_id = ?, time_machine_id = ?, time_period_id = ?, guide_id = ? WHERE itemID = " + DBIndex);
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, String.valueOf(reservation.getCustomerId()));
            preparedStatement.setString(2, String.valueOf(reservation.getTimeMachineId()));
            preparedStatement.setString(3, String.valueOf(reservation.getReservationId()));
            preparedStatement.setString(4, String.valueOf(reservation.getGuideId()));

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Booking ID: " + reservation.getReservationId() + " has been updated successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBooking(Reservation reservation, int DBIndex) throws SQLException {
        String sql = ("DELETE FROM time_periods WHERE id = " + DBIndex);
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, reservation.getReservationId());

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Booking ID:  " + reservation.getReservationId() + " has been deleted successfully");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //endregion

}// DatabaseHandler End
