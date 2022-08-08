package command;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 12:29
 */
public abstract class Command {
    public abstract void doit(); //exec run
    public abstract void undo();
}
