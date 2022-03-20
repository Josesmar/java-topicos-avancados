package java9.interfacecommetodosprivados;

public interface LogEventosI {
    
    default void logInfo(String mensagem){
        log(mensagem, "INFO");
    }
    default void logWarn(String mensagem){
        log(mensagem, "WARN");
    }
    default void logError(String mensagem){
        log(mensagem, "ERRO");
    }
    default void logFatal(String mensagem){
        log(mensagem, "FATAL");
    }

    //new feature java 9
    private void log(String mensagem, String tipo){
        System.out.println("INICIO DA MENSAGEM");

        System.out.println(tipo + ": " + mensagem);

        System.out.println("FIM DA MENSAGEM");
    }

}
