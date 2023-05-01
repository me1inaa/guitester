package edu.guilford;

public class Food {
    //add the attributes for food
    private String name;
    private String type;
    private String flavor;
    private String texture;

    //add the constructor with default data
    public Food() {
        name = "mango";
        type = "fruit";
        flavor = "sweet";
        texture = "soft";
    }

    //add the constructor
    public Food(String name, String type, String flavor, String texture) {
        this.name = name;
        this.type = type;
        this.flavor = flavor;
        this.texture = texture;
    }

    //add the getters and setters

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getTexture() {
        return texture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        if (type.equals("fruit") || type.equals("vegetable") || type.equals("grain") || type.equals("meat")) {
            this.type = type;
        } else {
            System.out.println("Invalid type");
        }
    }

    public void setFlavor(String flavor) {
        if (flavor.equals("sweet") || flavor.equals("salty") || flavor.equals("sour") || flavor.equals("bitter")) {
            this.flavor = flavor;
        } else {
            System.out.println("Invalid flavor");
        }
    }

    public void setTexture(String texture) {
        if (texture.equals("soft") || texture.equals("crunchy") || texture.equals("chewy") || texture.equals("smooth")) {
            this.texture = texture;
        } else {
            System.out.println("Invalid texture");
        }
    }

    //add the toString method
    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nFlavor: " + flavor + "\nTexture: " + texture;
    }




}
