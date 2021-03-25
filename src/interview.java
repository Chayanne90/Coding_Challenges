import java.util.List;

class Graph {
    
    public List<Vertices> V;
}

class Vertices {
    
    public int data;
    public List<Vertices> V;
}

/*
public static Graph diffGraph (Graph graph) {

    Vertices newVertices = new Vertices();
    Graph newGraph = new Graph();
    for (int i = 0; i < graph.V.size(); i++) {
        //newVertices.data = graph.get(i);
        newVertices.data = graph.V.get(i).data;
        newGraph.add(newVertices);
    }
    return newGraph;
}
*/



public class interview {
    
    
}
