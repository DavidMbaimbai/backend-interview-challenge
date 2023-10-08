package com.bp3.service;

import com.bp3.NodeType;
import com.bp3.entity.Diagram;
import com.bp3.entity.Edges;
import com.bp3.entity.Nodes;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class DiagramService {

    Logger logger = Logger.getLogger(DiagramService.class.getName());
    public void processAllFiles(String relativeFilePath) {
        File folder = new File(relativeFilePath);
        for (final File fileEntry : folder.listFiles()) {
            logger.info("Number of files " + folder.listFiles().length);
            processDiagram(fileEntry, fileEntry.getName());
        }
    }

    private void processDiagram(File file, String newFileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            Diagram diagram = objectMapper.readValue(file, Diagram.class);
            List<Nodes> humanTasks = diagram.getNodes().stream()
                    .filter(nodes ->
                            nodes.getType().equals(NodeType.START)
                                    || nodes.getType().equals(NodeType.HUMAN_TASK)
                                    || nodes.getType().equals(NodeType.END))
                    .collect(Collectors.toList());

            List<Edges> filteredEdges = new ArrayList<>();
            for (int i = 0, j = 1; i < (humanTasks.size() - 1); i++, j++) {
                filteredEdges.add(
                        new Edges(humanTasks.get(i).getId(), humanTasks.get(j).getId()));
            }

            Diagram filteredDiagram = new Diagram(humanTasks, filteredEdges);
            File file1 = new File("output/" + newFileName);
            logger.info(file1.getAbsolutePath());
            objectMapper.writeValue(file1, filteredDiagram);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
