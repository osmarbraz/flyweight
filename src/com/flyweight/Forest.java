package com.flyweight;

import com.flyweight.trees.TreeFactory;
import com.flyweight.trees.TreeType;
import com.flyweight.trees.Tree;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Floresta, que desenhamos.
 * As classes Tree (Árvore) e Forest (Floresta) são os clientes
 * flyweight. Você pode uni-las se não planeja desenvolver mais
 * a classe Tree.
 */
public class Forest extends JFrame {
    //Lista com as árvores da floresta
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        // Rcupera o tipo da árvore
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
