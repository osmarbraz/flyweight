package com.flyweight.trees;

import java.awt.*;

/**
 * Contém estado(Tipo da árvore) compartilhado por diversas árvores.
 * 
 * A classe flyweight contém uma parte do estado de uma árvore.
 * Esses campos armazenam valores que são únicos para cada
 * árvore em particular. Por exemplo, você não vai encontrar
 * coordenadas da árvore aqui. Já que esses dados geralmente são
 * GRANDES, você gastaria muita memória mantendo-os em cada
 * objeto árvore. Ao invés disso, nós podemos extrair a textura,
 * cor e outros dados repetitivos em um objeto separado os quais
 * muitas árvores individuais podem referenciar.
 */
public class TreeType {

    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
