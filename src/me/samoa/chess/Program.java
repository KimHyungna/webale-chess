package me.samoa.chess;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import me.samoa.chess.view.GameWindow;
import me.samoa.chess.view.Window;

public class Program {

  public static Program getInstance() {
    if (instance == null) {
      instance = new Program();
    }
    return instance;
  }

  private static Program instance;

  private Window mainWindow;

  private Program() {
    mainWindow = new GameWindow();
  }

  public void run() {
    BufferedImage image;
    try {
      image = ImageIO.read(getClass().getResourceAsStream("/resources/Capoo.jpg"));
      int height = image.getHeight();
      int width = image.getWidth();
      System.out.println(String.format("Image: %d x %d", width, height));
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Pre-development testing...");
    mainWindow.open();
  }

}