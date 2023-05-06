package edu.guilford;

import java.io.File;

import edu.guilford.Food.InvalidFlavorException;
import edu.guilford.Food.InvalidTextureException;
import edu.guilford.Food.InvalidTypeException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class FoodPane extends GridPane {
    private Food food;
    //add a textfield attribute for each of the attributes of food
    private TextField nameField;
    private TextField typeField;
    private TextField flavorField;
    private TextField textureField;

    //add an ImageView attribute
    private ImageView imageView;

    //add label attributes for the food attrbutes
    private Label nameLabel;
    private Label typeLabel;
    private Label flavorLabel;
    private Label textureLabel;

    //add a button attribute
    private Button rotateButton;
    private Button refreshButton;

    //**step 1: declare a slider attribute
    private Slider rotateSlider;


    //constructor for food
    public FoodPane(Food food) {
        //set the food attribute to the food paramenter
        this.food = food;

        //instantiate the textField attributes
        nameField = new TextField();
        typeField = new TextField();
        flavorField = new TextField();
        textureField = new TextField();

        //instantiate the ImageView attribute   
        File mango = new File(this.getClass().getResource("mangotree.jpeg").getPath());
        System.out.println(mango.toURI().toString());
        imageView = new ImageView(mango.toURI().toString());

        //instantiate the label attributes
        nameLabel = new Label("Name: " + food.getName());
        typeLabel = new Label("Type: " + food.getType());
        flavorLabel = new Label("Flavor: " + food.getFlavor());
        textureLabel = new Label("Texture: " + food.getTexture());

        //instantiate the button
        rotateButton = new Button("Rotate");
        refreshButton = new Button("Refresh");

        //**step 2: instantiate the slider
        rotateSlider = new Slider(0, 360, 0);

        //add the labels and textfields to the pane
        this.add(nameLabel, 0, 0);
        this.add(nameField, 1, 0);
        this.add(typeLabel, 0, 1);
        this.add(typeField, 1, 1);
        this.add(flavorLabel, 0, 2);
        this.add(flavorField, 1, 2);
        this.add(textureLabel, 0, 3);
        this.add(textureField, 1, 3);

        //add the button to the pane
        this.add(rotateButton, 0, 4);
        this.add(refreshButton, 1, 4);

        //**step 3: add the slider to the pane
        this.add(rotateSlider, 0, 5, 2, 1);

        //add the imageView to the pane
        this.add(imageView, 2, 0, 1, 4);

        //add a listener for the refresh button that updates the label text
        refreshButton.setOnAction(e -> {
            nameLabel.setText("Name: " + nameField.getText());
            typeLabel.setText("Type: " + typeField.getText());
            flavorLabel.setText("Flavor: " + flavorField.getText());
            textureLabel.setText("Texture: " + textureField.getText());
            //update the food attributes
            food.setName(nameField.getText());
            //update the food attributes if the exception is not thrown
            // food.setType(typeField.getText());
            try {
                food.setType(typeField.getText());
            } catch (InvalidTypeException e1) {
                this.add(new Label(e1.getMessage()), 0, 6, 2, 1);
            }

            //food.setFlavor(flavorField.getText());
            try {
                food.setFlavor(flavorField.getText());
            } catch (InvalidFlavorException e1) {
                this.add(new Label(e1.getMessage()), 0, 8, 2, 1);
            }
            
            //food.setTexture(textureField.getText());
            try {
                food.setTexture(textureField.getText());
            } catch (InvalidTextureException e1) {
                this.add(new Label(e1.getMessage()), 0, 10, 2, 1);
            }
        });

        //add a listener for the slider that rotates the image
        //**step 4: add the event listener
        rotateSlider.valueProperty().addListener(e -> {
            //**step 5: connect the component to the slider 
            imageView.setRotate(rotateSlider.getValue());
        });

         //add a listener for the button that rotates the image
         rotateButton.setOnAction(e2 -> {
            //rotate the image by 45 degrees
            imageView.setRotate(imageView.getRotate() + 45);
        });

        


        
        

    }





}
