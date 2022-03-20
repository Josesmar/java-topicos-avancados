package java9.interfacecommetodosprivados;

public class TestEventos {
    public static void main(String[] args) {

        LogEventosI log = new LogEventosI() {};
        log.logError("Conexão falhou");

    }
}
