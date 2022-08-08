package chainOfResponsibility;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:29
 */
public class Msg {

    private String message;

    public Msg() {
    }

    public Msg(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "message='" + message + '\'' +
                '}';
    }
}

interface Filter {
    boolean doFilter(Msg msg);
}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        msg.setMessage(msg.getMessage().replace("<", "[").replace(">", "]"));
        return true;
    }
}

class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        msg.setMessage(msg.getMessage().replace("bad", "nice"));
        return false;
    }
}


class FilterChain implements Filter {
    @Override
    public boolean doFilter(Msg msg) {

        for (Filter filter : list) {
            if (!filter.doFilter(msg)) return false;
        }
        return true;
    }

    List<Filter> list;

    public FilterChain() {
        this.list = new LinkedList<>();
    }

    public Filter addFilter(Filter filter) {
        list.add(filter);
        return this;
    }
}