package com.flyweight.trees;

import com.flyweight.trees.TreeType;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Encapsula a complexidade da criação flyweight das árvores.
 * A fábrica flyweight decide se reutiliza o flyweight existente
 * ou cria um novo objeto.
 */
public class TreeFactory {
    
    //Mapa dos tipos de árvores já instancidas.
    static Map<String, TreeType> treeTypes = new HashMap<>();

    /**
     * Cria um novo tipo de árvore ou retorna um já existem.
     */
    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        //Procura o tipo da árvore
        TreeType result = treeTypes.get(name);
        //Se não existe
        if (result == null) {
            //Cria o novo tipo             
            result = new TreeType(name, color, otherTreeData);
            //Guarda no mapa
            treeTypes.put(name, result);
        }
        //Retorna o tipo
        return result;
    }
}
