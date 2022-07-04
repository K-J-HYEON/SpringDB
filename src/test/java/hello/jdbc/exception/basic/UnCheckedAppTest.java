//package hello.jdbc.exception.basic;
//
//import org.testng.annotations.Test;
//
//import java.net.ConnectException;
//import java.sql.SQLException;
//
//public class UnCheckedAppTest {
//
//    @Test
//    void unchecked() {
//        Controller controller = new Controller();
//        Assertions.assertThatThrownBy(() -> controller.request())
//                .isInstanceOf(SQLException.class);
//    }
//
//    @Test
//    void printEx() {
//        Controller controller = new Controller();
//        try {
//            controller.request();
//        } catch (Exception e) {
////            e.printStackTrace();
//            log.info("ex", e);
//        }
//
//    }
//
//    static class Controller {
//        Service service = new Service();
//
//        public void request() {
//            service.logic();
//        }
//    }
//
//    static class Service {
//        Repository repository = new Repository();
//        NetworkClient networkClient = new NetworkClient();
//
//        public void logic() {
//            repository.call();
//            networkClient.call();
//        }
//
//    }
//    static class NetworkClient {
//        public void call() throws ConnectException {
//            throw new RuntimeConnectException("연결 실패");
//        }
//    }
//
//    static class Repository {
//        public void call() {
//            try {
//                runSQL();
//            } catch (SQLException e) {
//                throw new RuntimeSQLException(e);
//            }
//        }
//
//        public void runSQL () throws SQLException {
//            throw new SQLException("ex");
//        }
//    }
//
//    static class RuntimeConnectException extends RuntimeException {
//        public RuntimeConnectException(String message) {
//            super(message);
//        }
//    }
//
//    static class RuntimeSQLException extends RuntimeException {
//        public RuntimeSQLException() {
//        }
//
//        public RuntimeSQLException(Throwable cause) {
//            super(cause);
//        }
//    }
//}
