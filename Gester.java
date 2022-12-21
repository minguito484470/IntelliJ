import javax.swing.*;

public class Gester {
    static String name, address, names;
    static int order = 0;
    static double runningTotal = 0;
    static double[] orderPrice = {210.00, 255.00, 220.00, 200.00, 130.00, 150.00, 225.00, 210.00, 140.00, 180.00};
    static String[] menuOption = {
            "Blonde Café Latte for " + (String.format("%.2f", orderPrice[0])) + " Php",
            "Caramel Macchiato for " + (String.format("%.2f", orderPrice[1])) + " Php",
            "Skinny Mocha for " + (String.format("%.2f", orderPrice[2])) + " Php",
            "Hot Coffee for " + (String.format("%.2f", orderPrice[3])) + " Php",
            "Café Americano for " + (String.format("%.2f", orderPrice[4])) + " Php",
            "Café Latte for " + (String.format("%.2f", orderPrice[5])) + " Php",
            "Cappuccino for " + (String.format("%.2f", orderPrice[6])) + " Php",
            "Dolce Latten for " + (String.format("%.2f", orderPrice[7])) + " Php",
            "Creamy Iced Coffee for " + (String.format("%.2f", orderPrice[8])) + " Php",
            "Iced Latte for " + (String.format("%.2f", orderPrice[9])) + " Php"
    };

    public static void information(String name, String address) {
        JOptionPane.showMessageDialog(null,
                "============================\n" +
                        "Name: " + name + "\n" +
                        "Address: " + address +
                        "\n============================\n");
    }

    public static double calculate(double orders) {

        int numOfCups = Integer.parseInt(JOptionPane.showInputDialog("How many cups you want to order: "));
        double totalAmount = runningTotal * numOfCups;
        while (true) {

            String cashBody =
                            "Ordered Item: " + menuOption[order - 1] + "\n" +
                            "Number of Cups: " + numOfCups + "\n" +
                            "Total amout Due: " + (String.format("%.2f",totalAmount)) + "\n" +
                            "Enter Cash:";
            double cash = Double.parseDouble(JOptionPane.showInputDialog(cashBody));
            double change = cash - totalAmount;
            if (cash < totalAmount) {
                JOptionPane.showMessageDialog(null, "NOT ENOUGH CASH!", null, JOptionPane.ERROR_MESSAGE);
                continue;
            } else {
                String body =
                                "Customer's Name: " + name + "\n" +
                                "Ordered Item: " + menuOption[order - 1] + "\n" +
                                "Number of Cups: " + numOfCups + "\n" +
                                "Total Amount: " + (String.format("%.2f", totalAmount)) + "\n" +
                                "Cash Received: " + (String.format("%.2f", cash)) + "\n" +
                                "Change: " + (String.format("%.2f", change));
                JOptionPane.showMessageDialog(null, body, "Your Order", JOptionPane.PLAIN_MESSAGE);
                break;
            }
        }
        if (JOptionPane.showConfirmDialog(null, "Do you want to buy again?") == 1) {
            JOptionPane.showMessageDialog(null, "Thank for your purchasing from Deja Brew Coffee Shop!");
            System.exit(0);
        }
        return runningTotal;
    }


    public static void main(String[] args) {
        boolean flop = true;

        // Getting the customer information
        while (true) {
            name = JOptionPane.showInputDialog("Enter your Full Name");
            if (name.matches(".*\\d.*") || name.equals("") || name.equals(" ")) {
                JOptionPane.showMessageDialog(null, "Please enter customer's name properly!");
                continue;
            } else {
                break;
            }
        }

        do {
            address = JOptionPane.showInputDialog("Enter your Address");
        } while (address.equals("") || address.equals(" "));
        information(name, address);

        // Menu
        try {
            do {
                order = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "COLD\n" +
                                "1 = " + menuOption[0] + "\n\n" +
                                "2 = " + menuOption[1] + "\n\n" +
                                "3 = " + menuOption[2] + "\n\n" +
                                "4 = " + menuOption[3] + '\n' +
                                "\nESPRESSO" + "\n\n5 = " + menuOption[4] + "\n\n" +
                                "6 = " + menuOption[5] + "\n\n" +
                                "7 = " + menuOption[6] + "\n\n" +
                                "8 = " + menuOption[7] + "\n\n" +
                                "COLD" + "\n\n" +
                                "9 = " + menuOption[8] + "\n\n" +
                                "10 = " + menuOption[9] + "\n\n",
                        "Deja Brew MENU",
                        JOptionPane.PLAIN_MESSAGE));

                // This area i used switch case because in my Calculations(method) my
                // runningTotal variable doesn't have any value so i used switch
                // to put value on every index and to make my calculations work.
                switch (order) {
                    case 1:
                        runningTotal = orderPrice[0];
                        calculate(runningTotal);
                        break;
                    case 2:
                        runningTotal = orderPrice[1];
                        calculate(runningTotal);
                        break;
                    case 3:
                        runningTotal = orderPrice[2];
                        calculate(runningTotal);
                        break;
                    case 4:
                        runningTotal = orderPrice[3];
                        calculate(runningTotal);
                        break;
                    case 5:
                        runningTotal = orderPrice[4];
                        calculate(runningTotal);
                        break;
                    case 6:
                        runningTotal = orderPrice[5];
                        calculate(runningTotal);
                        break;
                    case 7:
                        runningTotal = orderPrice[6];
                        calculate(runningTotal);
                        break;
                    case 8:
                        runningTotal = orderPrice[7];
                        calculate(runningTotal);
                        break;
                    case 9:
                        runningTotal = orderPrice[8];
                        calculate(runningTotal);
                        break;
                    case 10:
                        runningTotal = orderPrice[9];
                        calculate(runningTotal);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Please select your order according to the menu!");
                        break;
                }
            } while (flop);
        } catch (Exception E) {
            //
        }
    }
}

