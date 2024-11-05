import java.util.logging.Logger;

public class Chá extends Bebida {
    private static final Logger logger = Logger.getLogger(Chá.class.getName());

    @Override
    protected void adicionarIngrediente() {
        logger.info("Adicionando chá à água...");
    }
}
