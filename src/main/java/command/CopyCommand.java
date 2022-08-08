package command;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 12:30
 */
public class CopyCommand extends Command{
    Content c;
    public CopyCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.msg = c.msg + c.msg;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length()/2);
    }
}
