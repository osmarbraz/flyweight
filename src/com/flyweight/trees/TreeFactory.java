package com.flyweight.trees;

import com.flyweight.trees.TreeType;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Encapsula a complexidade da criação flyweight das árvores.
 */
public class TreeFactory {

    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
