package com.flyweight.trees;

import java.awt.*;

/**
 * Contém estado único para cada árvore.
 * O objeto contextual contém a parte extrínseca do estado da
 * árvore. Uma aplicação pode criar bilhões desses estados, já
 * que são muito pequenos:
 * apenas dois números inteiros para coordenadas e um campo de
 * referência.
 */
public class Tree {

    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
