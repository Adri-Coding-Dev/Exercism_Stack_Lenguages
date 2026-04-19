import java.util.*;

public class Graph {
    private ArrayList<Node> nodos;
    private ArrayList<Edge> edges;
    private Map<String, String> allAttributes;

    public Graph() {
        this.nodos = new ArrayList<>();
        this.edges = new ArrayList<>();
        this.allAttributes = new HashMap<>();
    }

    public Graph(Map<String, String> attributes) {
        this.nodos = new ArrayList<>();
        this.edges = new ArrayList<>();
        this.allAttributes = attributes;
    }

    public Collection<Node> getNodes() {
        return this.nodos;
    }

    public Collection<Edge> getEdges() {
        return this.edges;
    }

    public Graph node(String name) {
        this.nodos.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        this.nodos.add(new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        this.edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        this.edges.add(new Edge(start, end, attributes));
        return this;
    }

    public Map<String, String> getAttributes() {
        return this.allAttributes;
    }
}
