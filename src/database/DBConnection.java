public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/smartrail";
        String user = "root";
        String pass = "password";
        return DriverManager.getConnection(url, user, pass);
    }
}
