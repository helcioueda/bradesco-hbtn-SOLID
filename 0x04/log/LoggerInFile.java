import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) {
        try {
            // Cria instância do Logger.
            Logger logger = Logger.getLogger(LoggerInFile.class.getName());

            // Cria um manipulador de arquivo para escrever os logs em 'logs.txt'.
            FileHandler fileHandler = new FileHandler("logs.txt");

            // Define o formatador.
            fileHandler.setFormatter(new SimpleFormatter());

            // Adiciona o handler de log.
            logger.addHandler(fileHandler);

            // Loga mensagens.
            logger.info("Teste de Log");
            logger.info("Olá, eu sou o teste da classe principal");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}