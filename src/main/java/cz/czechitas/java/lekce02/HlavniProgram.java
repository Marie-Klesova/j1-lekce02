package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void nakresliCtverecek() {
    for (int i = 0; i<4; i++){
      zofka.move(100);
      zofka.turnRight(90);
    }
  }

  public void start() {
    zofka = new Turtle();

    //TODO tady bude kód

    /*
    zofka.penDown();
    zofka.move(  100);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.penUp();
    zofka.move(200);
    zofka.penDown();
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(45);
    zofka.move(73);
    zofka.turnRight(90);
    zofka.move(73);
    zofka.penUp();
*/

    nakresliCtverecek();

    zofka.turnLeft(90);
    zofka.turnRight(45);
    zofka.move(71);
    zofka.turnRight(90);
    zofka.move(71);
    zofka.penUp();

    zofka.turnLeft(45);
    zofka.turnLeft(180);
    zofka.move(100);

    zofka.penDown();
    zofka.turnLeft(20);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(50);
    zofka.penDown();
    zofka.turnLeft(120);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(50);
    zofka.turnRight(50);
    zofka.move(100);

    zofka.penDown();
    zofka.turnRight(90);
    zofka.turnLeft(20);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(50);
    zofka.penDown();
    zofka.turnLeft(120);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penUp();
    zofka.turnLeft(45);











  }
}

