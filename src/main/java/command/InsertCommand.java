package command;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 12:30
 */
public class InsertCommand extends Command {
    Content c;
    String strToInsert = "good bye...";
    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.msg = c.msg + strToInsert;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length()-strToInsert.length());
    }
}