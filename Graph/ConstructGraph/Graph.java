package ConstructGraph;

import java.util.*;

public class Graph {

    Map<String, ArrayList<String>> graph = new HashMap<>();

    public boolean addVertex(String vertex) { //this method create an vertex or add a vertex
        if (graph.get(vertex) == null) {
            graph.put(vertex, new ArrayList<>());
            return true;
        } else {
            return false;
        }
    }

    //add an edge
    public boolean addEdge(String vertex1, String vertex2){
        if(graph.get(vertex1)!= null && graph.get(vertex2)!= null){
            ArrayList<String> list1 = graph.get(vertex1); //get the edges of first vertex, or connectec vettex
            list1.add(vertex2); //add an edge tot he vetext2 by adding it to the first vertex's connected vertex

            //same operation for the 2nd vertex as with the first vertex

            ArrayList<String> list2 = graph.get(vertex2); //get the edges of first vertex, or connectec vettex
            list2.add(vertex1); //add an edge tot he vetext2 by adding it to the first vertex's connected vertex

            return true;
        }else{
            return false;
        }
    }

    //remove edge
    public boolean removeEdge(String vertex1, String vertex2){
        if(graph.get(vertex1) !=  null && graph.get(vertex2) !=null){
            ArrayList<String> list1 = graph.get(vertex1); //get the first vertex edges(connected vertexs)
            list1.remove(vertex2); //remove the edge or connected second verrex

            ArrayList<String> list2 = graph.get(vertex2); //get the second vertex edges(connected vetexs)
            list2.remove(vertex1); //remove the edge or connected first vertex
            return true;
        }else{
            return false;
        }
    }

    public void printGraph() { //print the list, which store the vertex and the edges , or connected vertex's
        System.out.println("{");
        for (Map.Entry<String, ArrayList<String>> map : graph.entrySet()) {
            String key = map.getKey();
            System.out.print("\""+key+"\" :");
            ArrayList<String> edge = map.getValue();
            System.out.print("[ ");
            for (int i = 0; i < edge.size(); i++) {
                System.out.print("\""+edge.get(i)+"\"");
                if (i != edge.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.print(" ]");
            System.out.println();
        }
        System.out.println("}");
    }

}