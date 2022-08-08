package command;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 12:30
 */
public class DeleteCommand extends Command {
    Content c;
    String deleted;
    public DeleteCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        deleted = c.msg.substring(0, 5);
        c.msg = c.msg.substring(5, c.msg.length());
    }

    @Override
    public void undo() {
        c.msg = deleted + c.msg;
    }
}
