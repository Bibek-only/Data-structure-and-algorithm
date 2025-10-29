package ConstructGraph;
import java.util.*;

public class Graph {

    Map<String,ArrayList<String>> graph = new HashMap<>();

    public boolean addVertex(String vertex){
        if(graph.get(vertex) == null){
            graph.put(vertex,new ArrayList<>());
            return true;
        }else{
            return false;
        }
    }

    public void printGraph(){
        System.out.println("{");
        for(Map.Entry<String,ArrayList<String>> map:graph.entrySet()){
            String key = map.getKey();
            System.out.print(key+": ");
            ArrayList<String> edge = map.getValue();
            System.out.print("[ ");
            for(int i = 0; i<edge.size(); i++){
                System.out.print(edge.get(i));
                if(i != edge.size()-1){
                    System.out.print(",");
                }
            }
            System.out.print(" ]");
            System.out.println();
        }
        System.out.println("}");
    } 
    
}