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

    public void setType(String type) throws InvalidTypeException{
        // if (type.equals("fruit") || type.equals("vegetable") || type.equals("grain") || type.equals("meat")) {
        //     this.type = type;
        // } else {
        //     System.out.println("Invalid type");
        // }
        if (type.equals("fruit") || type.equals("vegetable") || type.equals("grain") || type.equals("meat")) {
            this.type = type;
        } else {
            throw new InvalidTypeException("Invalid type");
        }
    }

    public void setFlavor(String flavor) throws InvalidFlavorException {
        // if (flavor.equals("sweet") || flavor.equals("salty") || flavor.equals("sour") || flavor.equals("bitter")) {
        //     this.flavor = flavor;
        // } else {
        //     System.out.println("Invalid flavor");
        // }
        if (flavor.equals("sweet") || flavor.equals("salty") || flavor.equals("sour") || flavor.equals("bitter")) {
            this.flavor = flavor;
        } else {
            throw new InvalidFlavorException("Invalid flavor");
        }
    }

    public void setTexture(String texture) throws InvalidTextureException{
        // if (texture.equals("soft") || texture.equals("crunchy") || texture.equals("chewy") || texture.equals("smooth")) {
        //     this.texture = texture;
        // } else {
        //     System.out.println("Invalid texture");
        // }
        if (texture.equals("soft") || texture.equals("crunchy") || texture.equals("chewy") || texture.equals("smooth")) {
            this.texture = texture;
        } else {
            throw new InvalidTextureException("Invalid texture");
        }
    }

    //add the toString method
    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nFlavor: " + flavor + "\nTexture: " + texture;
    }

    //creat an exception class that notifies the user that their
    //input for type is invalid
    public class InvalidTypeException extends Exception {
        public InvalidTypeException(String message) {
            super("This type is invalid: Food types can only be fruit, vegetable, grain, or meat.");
        }
    }

    //create an exception class that notifies the user that their 
    //input for flavor is invalid
    public class InvalidFlavorException extends Exception {
        public InvalidFlavorException(String message) {
            super("This flavor is invalid: Food flavors can only be sweet, salty, sour, or bitter.");
        }
    }

    //create an exception class that notifies the user that their
    //input for texture is invalid
    public class InvalidTextureException extends Exception {
        public InvalidTextureException(String message) {
            super("This texture is invalid: Food textures can only be soft, crunchy, chewy, or smooth.");
        }
    }




}
