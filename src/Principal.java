
import com.flyweight.Forest;
import java.awt.*;

public class Principal {

    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        //Instância a floresta    
        Forest forest = new Forest();
        //Adiciona as árvores a floresta
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " arvores desenhadas");
        System.out.println("---------------------");
        System.out.println("Memoria utilizada:");
        System.out.println("Tamanho arvore (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ Tamanho tipos de arvore tamanho(~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " 
                + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024)
                + "MB (ao inves de " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
