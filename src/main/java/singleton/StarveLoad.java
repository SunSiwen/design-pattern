package singleton;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:02
 */
public class StarveLoad {

    private static final StarveLoad INSTANCE = new StarveLoad();

    private StarveLoad(){

    }

    public static StarveLoad getInstance(){
        return INSTANCE;
    }
}
