package com.bp3.entity;

import java.io.Serializable;
import java.util.List;

public class Diagram implements Serializable {
    private List<Nodes> nodes;
    private List<Edges> edges;

    public Diagram() {
    }
    public Diagram(List<Nodes> nodes, List<Edges> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<Nodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<Nodes> nodes) {
        this.nodes = nodes;
    }

    public List<Edges> getEdges() {
        return edges;
    }

    public void setEdges(List<Edges> edges) {
        this.edges = edges;
    }
}
