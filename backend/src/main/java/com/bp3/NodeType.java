package com.bp3;

import java.io.Serializable;

/**
 * The different types of {@link Node}s within a BPM process diagram.
 */
public enum NodeType {
    GATEWAY, END, HUMAN_TASK, SERVICE_TASK, START
}
