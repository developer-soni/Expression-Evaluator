package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */



public class Operand {
    /**
     * construct operand from string token.
     */
    private String token;

    public Operand(String token) {
        this.token = token;
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.token = Integer.toString(value);
    }

    /**
     * return value of operand
     */
    public int getValue() {
        try {
            int value = Integer.parseInt(this.token);
            return value;
        } catch (NumberFormatException e) { return 0; }
    }

        /**
         * Check to see if given token is a valid
         * operand.
         */
        public static boolean check(String token)
        {
          // return token.matches("\\d+");

            try {
                double value = Double.parseDouble(token);
                return true;
            } catch (NumberFormatException e) { return false; }

          /* try {

                Integer.parseInt(token);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
         //   return true; */
        }
    }

