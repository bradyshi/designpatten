package com.brady.designpatten.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {
    private Map<String, Drawable> images;

    public TileFactory() {
        images = new HashMap<>(8);
    }

    public Drawable getDrawable(String image) {
        if(!images.containsKey(image)){
            switch (image) {
                case "河流":
                    images.put(image, new River(image));
                    break;
                case "草地":
                    images.put(image, new Grass(image));
                    break;
                case "房子":
                    images.put(image, new Hourse(image));
                    break;
                case "道路":
                    images.put(image, new Road(image));
                    break;
            }
        }
        return images.get(image);
    }
}
