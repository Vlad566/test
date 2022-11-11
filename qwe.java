public class qwe {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 2;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 5;
        int numberOfrogouts = 0;

        if (isGreenLight == true) {

            if (speedOfPlayer1 != 0) {
                numberOfrogouts += 1;
            }
            if (speedOfPlayer2 != 0) {
                numberOfrogouts += 1;
            }
            if (speedOfPlayer3 != 0) {
                numberOfrogouts += 1;
            }
        } else {
            numberOfrogouts = 0;
            if (speedOfPlayer1 == 0) {
                numberOfrogouts += 1;
            }
            if (speedOfPlayer2 == 0) {
                numberOfrogouts += 1;
            }
            if (speedOfPlayer3 == 0) {
                numberOfrogouts += 1;
            }

            //System.out.println("Колличество выбывших: " + numberOfrogouts);
        }
        System.out.println("Колличество выбывших: " + numberOfrogouts);
    }

}