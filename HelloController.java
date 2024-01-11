package com.example.stickkyyheeerooo;
import javafx.animation.TranslateTransition;
import javafx.application.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import javafx.animation.PathTransition;

import javafx.animation.Interpolator;

import javafx.fxml.FXML;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Rectangle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.animation.RotateTransition;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import java.util.Random;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.event.ActionEvent;
import javafx.scene.shape.Circle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.ParallelTransition;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;


import javax.swing.*;

//Using Singleton DESIGN PATTERN to standardize that their can be only one hero
class Hero{
    private static Hero h1 = null;
    public static Hero getInstance(){
        if(h1 == null){
            h1 = new Hero();
        }
        return h1;
    }
    private Hero(){}
}
class rectangle{
    private int height;
    private int y;
    public rectangle(int height, int y){
        this.height = height;
        this.y = y;
    }

    public int gety() {
        return this.y;
    }
}
public class HelloController {
    @FXML
    private Label welcomeText;

    private Stage stage;
    private Scene scene;
    public double dif = 0;
    boolean gir_gayi = false;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public Button circularButton;

    public Rectangle aane_waala_rect;

    @FXML
    public Button flip_button;

    @FXML
    public Label score123;
    @FXML
    public ImageView Restart_image;

    @FXML
    private Rectangle rl;
    @FXML
    private Rectangle rr;
    @FXML
    public Button sb;
    @FXML
    public ImageView laura;

    public int sc = 0;
    @FXML
    public Text blink;

    public int ly = 0;

    @FXML
    private Pane painal;
    @FXML
    public Text blinker;

    @FXML
    public Text flip2;

    @FXML
    public Rectangle flip1;

    public int fli = 0;
    @FXML
    public Text fliptxt;

    @FXML
    public Rectangle flipbox;

    @FXML
    public Button flipbut;

    @FXML
    public Label score_page;
    public int widthy = 71;

    @FXML
    public Rectangle stick;

    @FXML
    public Text revive_text;

    @FXML
    public ImageView revive_image;

    @FXML
    public ImageView restart_image;

    @FXML
    public Rectangle left_waala = rl;

    int last_right_kaX= 0 ;

    private Timeline increaseTimeline;
    @FXML
    public Rectangle right_wala = rr;

    @FXML
    public Button play_button;

    @FXML
    public ImageView Cherry;

    @FXML
    public Text scored;

    @FXML
    public ImageView hero;
    public int score = 0;
    public int pa = 0;
    public int high_score = 0;
    public boolean flipped = false;

    @FXML
    public Rectangle bridge_stick;

    @FXML
    public Button restart_button;

    @FXML
    public Button revive_button;

    public boolean scoredd  = false;

    @FXML
    public Label Scorebata;
    @FXML
    public Label highsc;
    Random random = new Random();

    Hero heru = Hero.getInstance();

    public void restartApplication(ActionEvent a) {
        Platform.runLater(() -> {
            try {
                // Create a new instance of the application and start it
                new HelloApplication().start(new Stage());
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void fliplao(){
//        flipbox.setOpacity(1);
//        flipbut.setOpacity(1);
//        fliptxt.setOpacity(1);
    }


    public void Skore_badha(){
        score += 1;
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(1.2), scored);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);

        FadeTransition fadeOut = new FadeTransition(Duration.seconds(1.2), scored);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);

        SequentialTransition sequentialTransition = new SequentialTransition(fadeIn, fadeOut);
        sequentialTransition.setCycleCount(1);
        sequentialTransition.play();
    }

    public void show_score(){
        this.Scorebata = Scorebata;

        // Set up a Timeline to update the score every second
        Timeline scoreUpdater = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> {
                    updateScoreLabel();
                })
        );
        scoreUpdater.setCycleCount(Timeline.INDEFINITE);
        scoreUpdater.play();
    }
    public void updateScoreLabel() {
        Scorebata.setText(String.valueOf(score));
    }

    public void updatescore(int scor){
        score123.setText(String.valueOf((2)));
    }

    public void end_pe_score(Label scorePageLabel) {
        Timeline scoreUpdater = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> {
                    updateScorePageLabel(scorePageLabel);
                })
        );
        scoreUpdater.setCycleCount(Timeline.INDEFINITE);
        scoreUpdater.play();
    }

    public void updateScorePageLabel(Label scorePageLabel) {
        scorePageLabel.setText(String.valueOf(score));
    }

    public void show_highscore(){
        this.highsc = highsc;

        // Set up a Timeline to update the score every second
        Timeline scoreUpdater = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> {
                    updatehighScoreLabel();
                })
        );
        scoreUpdater.setCycleCount(Timeline.INDEFINITE);
        scoreUpdater.play();
    }


    public void movehero(int spacing){
        double step = 10; // Adjust the step size as needed
        double targetX = spacing + right_wala.getWidth() + right_wala.getWidth() - 64.5;

// Move the hero to the right
        Timeline aage = new Timeline(
                new KeyFrame(Duration.seconds(0.01), event12 ->{
                    if (hero.getX() <= targetX) {
                        hero.setX(hero.getX() + 3);
                        if (!scoredd){
                            if (hero.intersects(Cherry.getBoundsInLocal()) && flipped){
                                score+=5;
                                Cherry.setOpacity(0);
                                scoredd = true;
                            }
                        }
                    }
                })
                
        );
        scoredd = false;
        aage.setCycleCount(100);
        aage.play();

//        scoredd = false;


        Timeline chery_gaayab = new Timeline(
                new KeyFrame(Duration.seconds(1), event5 ->{
                    Cherry.setOpacity(0);
                } )
        );
        chery_gaayab.play();
    }
    public void updatehighScoreLabel() {
        highsc.setText("High Score: " + String.valueOf(high_score));
    }
    public void neeche_jaa(ActionEvent e){
        Cherry.setY(26);
        int score = 0;
        play_button.toFront();
        hero.toFront();
        flip_button.toFront();
        flip_button.setDisable(true);
        end_pe_score(score_page);
        show_highscore();
        show_score();
        TranslateTransition fuckyou = new TranslateTransition();
        TranslateTransition fy2 = new TranslateTransition();
        TranslateTransition fy3 = new TranslateTransition();
        fy2.setDuration(Duration.millis(1000));
        fuckyou.setDuration(Duration.millis(1000));
        fuckyou.setNode(rl);
        fuckyou.setFromY(0);
        fuckyou.setToY(140);
        fuckyou.play();
        fy2.setNode(rr);
        fy2.setToY(-127);
        fy2.setFromX(0);
        fy2.setToX(140);
        fy2.play();
        fy3.setDuration(Duration.millis(1000));
        fy3.setNode(hero);
        fy3.setFromY(0);
        fy3.setToY(140);
        fy3.play();
        sb.setDisable(true);
        play_button.setDisable(false);
        laura.setOpacity(0);
        blink.setOpacity(1);
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), blink);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0);
        fadeTransition.setCycleCount(4);
        fadeTransition.play();
        FadeTransition fadeTransitions = new FadeTransition(Duration.seconds(1), blinker);
        fadeTransitions.setFromValue(1.0);
        fadeTransitions.setToValue(0);
        fadeTransitions.setCycleCount(1);
        fadeTransitions.play();
        int spacing = random.nextInt(42,350-(36+widthy+28));//yeh change kara hai
        sc = spacing;
        Rectangle xyz = create_rectangle(spacing);
        TranslateTransition xxx = new TranslateTransition();
        xxx.setDuration(Duration.millis(1000));
        xxx.setNode(xyz);
        xxx.setFromX(0);
        xxx.setByX(-(514-36-widthy-42-spacing));
        xxx.play();
        aane_waala_rect = xyz;
        left_waala = rl;
        right_wala = xyz;
        last_right_kaX = (-(514-36-widthy-42-spacing));
        Timeline fliplo = new Timeline(
                new KeyFrame(Duration.seconds(2), event3 -> {
                    fliplao();
                })
        );
        fliplo.play();
        rectangle r1 = new rectangle(10,140);
        ly = r1.gety();
    }
    public int chal_khel(){
        play_button.toFront();
        hero.toFront();
        flip_button.toFront();
        if (rr!=null){
            painal.getChildren().remove((rr));
        }
        // Left wale ko screen se bahar phekega
        TranslateTransition betic = new TranslateTransition();
        betic.setDuration(Duration.millis(1000));
        betic.setNode(left_waala);
        betic.setFromX(36-(int)left_waala.getX());
        betic.setToX(-300-(int)left_waala.getX());
        betic.play();

        play_button.toFront();
        hero.toFront();
        flip_button.toFront();

        // Right wale ko left jagah pe daalega
        TranslateTransition PKMB = new TranslateTransition();
        PKMB.setDuration(Duration.millis(1000));
        PKMB.setNode(right_wala);
        int rx = (int)right_wala.getX();
        PKMB.setFromX(last_right_kaX);
        PKMB.setToX(36-rx);
        left_waala = right_wala;
        scoredd = false;
        hero.setX(left_waala.getWidth() - 94);
        PKMB.play();

        // Enters new Rect
        play_button.toFront();
        hero.toFront();
        flip_button.toFront();
        int spacing = random.nextInt(42,350-(36+widthy+28));//yeh change kara hai
        Rectangle xyz = create_rectangle(spacing);
        TranslateTransition xxx = new TranslateTransition();
        xxx.setDuration(Duration.millis(1000));
        xxx.setNode(xyz);
        xxx.setFromX(0);
        aane_waala_rect = xyz;
//        xxx.setToX(-(514+32-(36+widthy+28+spacing)));
        xxx.setByX(-(514-36-widthy-42-spacing));
        last_right_kaX = (-(514-36-widthy-42-spacing));
        xxx.play();
        right_wala = xyz;
        play();
        sc = spacing;
        create_cherry(-36-widthy-42-spacing,-36-left_waala.getWidth() );
        Timeline chalnalaude = new Timeline(
                new KeyFrame(Duration.seconds(1), event11 -> {
                    Cherry.setOpacity(1);
                })
        );
        chalnalaude.play();
        return spacing;
    }


    public void flip_kar(){
        hero.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.DOWN) {
                hero_flip();
            }
        });
        if (fli == 0){
            hero_flip();
            fli+=1;
        }
        else{
            hero.setRotate(0);
            hero.setY(0);
            fli-=1;
            flipped = false;
        }
    }
    public void play(){
        if (hero.getRotate()==0) {
            play_button.toFront();
            hero.toFront();
            flip_button.toFront();
            flip1.toFront();
            flip2.toFront();
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            bridge_stick.setX(left_waala.getWidth() - 2.5);
            bridge_stick.requestFocus();
            bridge_stick.setFocusTraversable(true);


            increaseTimeline = new Timeline(
                    new KeyFrame(Duration.millis(50), event -> {
                        increase_bridge_stick();
                    })
            );

            increaseTimeline.setCycleCount(Timeline.INDEFINITE);
            bridge_stick.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.SPACE) {
                    increaseTimeline.play();

                }
            });

            bridge_stick.setOnKeyReleased(event -> {
                if (event.getCode() == KeyCode.SPACE) {
                    increaseTimeline.stop();
                    play_button.toFront();
                    hero.toFront();
                    flip_button.toFront();
                    flip1.toFront();
                    flip2.toFront();
                    final Timeline[] rotatekaro = {new Timeline(
                            new KeyFrame(Duration.seconds(0.011), event2 -> {
                                rotate_the_stick();
                                //                            flipbut.setDisable(false);
                                //                            hero.setOnKeyPressed(event6 -> { if (event6.getCode() == KeyCode.DOWN) hero.setRotate(hero.getRotate() + 180); });
                            })
                    )};
                    rotatekaro[0].setCycleCount(90);
                    rotatekaro[0].play();
                    if (hero.getRotate()==0) {
                        if (check_collision()) {
                            if (score >= high_score) {
                                high_score = score;
                            }
                            final int[] i = {1};
                            Skore_badha();
                            Timeline movekarde = new Timeline(
                                    new KeyFrame(Duration.seconds(1), event4 -> {
                                        if (i[0] == 1) {
                                            if (hero.getRotate() == 0) {
                                                play_button.setDisable(true);
                                                flip_button.setDisable(false);
                                                movehero(sc);
                                                i[0]++;
                                            } else {
                                                updatescore(score);
                                                game_abhi_over();
                                            }
                                        }
                                        else {
                                            if (hero.getRotate() == 0) {
                                                play_button.setDisable(true);
                                                flip_button.setDisable(false);
                                                movehero(pa);
                                            } else {
                                                game_abhi_over();
                                            }
                                        }

                                    })
                            );
                            movekarde.play();
                            Timeline chalnalaude = new Timeline(
                                    new KeyFrame(Duration.seconds(3), event3 -> {
                                        pa = chal_khel();
                                        play_button.setDisable(false);
                                        flip_button.setDisable(true);
                                    })
                            );
                            chalnalaude.play();
                        } else {
                            if (score >= high_score) {
                                high_score = score;
                            }
                            game_over();
                        }
                    }
                    else {
                        game_abhi_over();
                    }

                }
            });
        }
        else{
            game_abhi_over();
        }
    }

    public void game_over(){
        Timeline chalnachamiye = new Timeline(
                new KeyFrame(Duration.seconds(1), event3 -> {
                    stickend();
                })
        );
        chalnachamiye.play();
        Timeline nichegir = new Timeline(
                new KeyFrame(Duration.seconds(2), event2 -> {
                    endseniche();
                })
        );
        nichegir.play();
        Timeline scorebata = new Timeline(
                new KeyFrame(Duration.seconds(3), event1 -> {
                    restart_image.toFront();
                    revive_image.toFront();
                    revive_text.toFront();
                    revive_button.toFront();
                    restart_button.toFront();

                    restart_image.setOpacity(1);
                    revive_image.setOpacity(1);
                    revive_text.setOpacity(1);

                    restart_button.setDisable(false);
                    revive_button.setDisable(false);
                })
        );
        scorebata.play();
    }

    public void revive(ActionEvent e){
        restart_image.setOpacity(0);
        revive_image.setOpacity(0);
        revive_text.setOpacity(0);

        restart_button.setDisable(true);
        revive_button.setDisable(true);

        TranslateTransition herobadha = new TranslateTransition(Duration.seconds(1));
        herobadha.setNode(hero);
        herobadha.setFromY(900);
        herobadha.setToY(140);
        herobadha.play();
        TranslateTransition herobadhaa = new TranslateTransition(Duration.seconds(1));
        herobadhaa.setNode(hero);
        herobadhaa.setFromX(94+bridge_stick.getHeight());
        herobadhaa.setToX(dif);
        herobadhaa.play();
        chal_khel();
    }


    public void game_abhi_over(){
        endseniche();
        Timeline scorebata = new Timeline(
                new KeyFrame(Duration.seconds(1), event6 -> {
                    revive_button.toFront();
                    restart_button.toFront();

                    restart_image.setOpacity(1);
                    revive_image.setOpacity(1);
                    revive_text.setOpacity(1);

                    restart_button.setOpacity(1);
                    revive_button.setOpacity(1);

                    restart_button.setDisable(false);
                    revive_button.setDisable(false);
                })
        );
        scorebata.play();
    }
    public void stickend(){
        play_button.toFront();
        hero.toFront();
        flip_button.toFront();
        TranslateTransition herobadha = new TranslateTransition(Duration.seconds(1));
        herobadha.setNode(hero);
        herobadha.setFromX(dif);
        herobadha.setToX(dif+bridge_stick.getHeight());
        herobadha.play();
    }

    public void endseniche(){
        play_button.toFront();
        hero.toFront();
        flip_button.toFront();
        TranslateTransition herobadha = new TranslateTransition(Duration.seconds(1));
        herobadha.setNode(hero);
        herobadha.setFromY(163);
        herobadha.setToY(900);
        herobadha.play();
    }

    public boolean check_collision(){
        play_button.toFront();
        hero.toFront();
        flip_button.toFront();
        int terimaki = 514-(last_right_kaX*-1);
        if ((33.5+left_waala.getWidth() + bridge_stick.getHeight() >= terimaki) && 33.5+left_waala.getWidth() + bridge_stick.getHeight() <= terimaki + right_wala.getWidth()){
            Timeline resetkar = new Timeline(
                    new KeyFrame(Duration.seconds(2), event -> {
                        reset_posi();
                    })
            );
            resetkar.play();
            return true;
        }
        else{
            Timeline resetkar = new Timeline(
                    new KeyFrame(Duration.seconds(2), event -> {
                        reset_posi();
                    })
            );
            resetkar.play();
            return false;
        }
    }

    public void reset_to_play(){
        score_page.setOpacity(0);
        circularButton.setDisable(true);
    }


    public void hero_flip(){
        flipped = true;
        hero.setY(29.5);
        hero.setRotate(180);
    }

    public void button_hover(){
        laura.setOpacity(0.5);
    }

    public void button_hover_exit(){
        laura.setOpacity(1);
    }


    public void increase_bridge_stick(){
        bridge_stick.setHeight(bridge_stick.getHeight()+5);
        bridge_stick.setY(bridge_stick.getY()-5);
    }


    public void reset_posi(){
        play_button.toFront();
        hero.toFront();
        flip_button.toFront();
        Rotate r1 = new Rotate();
        r1.setPivotX(bridge_stick.getX());
        r1.setPivotY(bridge_stick.getY()+bridge_stick.getHeight()-2.5);
        bridge_stick.getTransforms().add(r1);
        r1.setAngle(-90);

        bridge_stick.setY(0);
        bridge_stick.setX(left_waala.getWidth()-2.5);
        bridge_stick.setHeight(0);
    }


    public void rotate_the_stick(){
        play_button.toFront();
        hero.toFront();
        flip_button.toFront();
        // Create a RotateTransition
        Rotate r1 = new Rotate();
        r1.setPivotX(bridge_stick.getX());
        r1.setPivotY(bridge_stick.getY()+bridge_stick.getHeight()-2.5);
        bridge_stick.getTransforms().add(r1);
        r1.setAngle(1);
    }



    public void switch_start() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("nayihaiyaar.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace(); // Handle the exception appropriately
        }
    }

    public void switch_play() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PlayGame.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace(); // Handle the exception appropriately
        }
    }

    public void switch_score() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ForScore.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace(); // Handle the exception appropriately
        }
    }

    public Rectangle create_rectangle(int spacing){
        play_button.toFront();
        hero.toFront();
        flip_button.toFront();
        int w2 = random.nextInt(28, 482 - (36 + widthy + 28 + spacing) - 100);
        if (36 + widthy + w2 + 28 + spacing > 481) {
            w2 = 481 - (36 + widthy + 28 + spacing);
        }
        if (w2 >= 200) {
            w2 = 100;
        }
        widthy = w2;
        int layx = 514;
        Rectangle rectangle = new Rectangle(514, 606, w2, 253);
        rectangle.setFill(Color.web("#801c1c"));
        painal.getChildren().add(rectangle);
        return rectangle;
    }
    public void create_cherry(int spacing, double left){
        try{
            play_button.toFront();
            hero.toFront();
            flip_button.toFront();
            int ola = (int) left;
            int cheryposi = random.nextInt(-ola + 10, -spacing - 40);
            Cherry.setLayoutX(cheryposi);
        }
        catch (Exception e){
        }
    }
}