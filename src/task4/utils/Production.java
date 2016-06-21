package task4.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heat_wave on 6/9/16.
 */
public class Production {
    private List<Node> nodes = new ArrayList<>();
    private String javaCode = "";

    public String getAttrs() {
        return attrs;
    }

    public void setAttrs(String attrs) {
        this.attrs = attrs;
    }

    private String attrs = "";


    public void add(Node node) {
        nodes.add(node);
    }

    public String getJavaCode() {
        return javaCode;
    }

    public void setJavaCode(String code) {
        javaCode += code;
    }

    public int size() {
        return nodes.size();
    }

    public Node get(int i) {
        return nodes.get(i);
    }

    public List<Node> getNodes() {
        return nodes;
    }
}