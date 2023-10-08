package com.bp3.entity;

import com.bp3.Edge;

public class Edges implements Edge {
    private String from;
    private String to;

    public Edges() {
    }
    public Edges(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public void setFrom(String nodeId) {
        this.from = nodeId;
    }

    @Override
    public void setTo(String nodeId) {
        this.to = nodeId;
    }
}
