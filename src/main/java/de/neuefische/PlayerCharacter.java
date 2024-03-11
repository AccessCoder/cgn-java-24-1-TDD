package de.neuefische;

public class PlayerCharacter {

      public static int x = 0;
      public static int y = 0;

        public static int getX(){
            return x;
        }

        public static int getY(){
            return y;
        }

    public static void move(String input) {
            String s = input.toLowerCase();
        if (s.equals("w")){
            y++;
        } else if (s.equals("s")) {
            y--;
        } else if (s.equals("a")) {
            x--;
        } else if (s.equals("d")) {
            x++;
        }
    }
}
