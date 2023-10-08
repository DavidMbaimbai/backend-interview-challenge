package com.bp3.entity;

import com.bp3.Node;
import com.bp3.NodeType;

public class Nodes implements Node {
    private String id;
    private String name;
    private NodeType type;

    public Nodes() {
    }
    public Nodes(String id, String name, NodeType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public NodeType getType() {
        return type;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(NodeType type) {
        this.type = type;
    }
}
