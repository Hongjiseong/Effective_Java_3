package effective.design.pattern.flyweight;

import effective.design.pattern.flyweight.attribute.Mesh;
import effective.design.pattern.flyweight.attribute.Texture;

public class TreeModel {
    Mesh mesh;
    Texture bark;
    Texture leaves;

    public TreeModel() {
        mesh = new Mesh();
        bark = new Texture("bark");
        leaves = new Texture("leaves");
    }
}
