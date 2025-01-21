import java.util.Random;

public class SurvivorLeader {
    private String transmission = "q2xf1t8r5w3t tm9c5i8l900d5n7heto 3g5t6hgw44y5e7bhty605rh8t5 85ml95ak2k5r7qw5ksp295e5t7p45 o5i3n 6z5n205 9soe5o8hhg5lygtt5dq7th 5 gf34s9o 35j7j5o45k99hg5kyqqcjg5mkpl20z5o629sle5k20sk5k9c5 gh73h qxp25vi8t5i3f2v1q 9x7z6t5l8r9j3o4v5l3l1w 9y5a4d6f7x2c9l5g h8s45ek6";
    private Shelter[] shelter;

    public static void main(String[] args) {
        SurvivorLeader myCode = new SurvivorLeader();
        System.out.println("Goodbye World! Good luck surviving the apocalypse!");
    }

    public void SurvivorLeader() {
        shelter = new Shelter[40];
        Random random = new Random();

        for (int i = 0; i < shelter.length; i++) {
            int defenseLevel = random.nextInt(99) + 1;
            int numberOfSupplies = random.nextInt(1000) + 0;
            shelter[i] = new Shelter(defenseLevel, numberOfSupplies);
        }

        displayShelters();
        boolean equalSupplies = checkSupplies();
        System.out.println(equalSupplies);
        decipher(transmission);
        newDefense();
        String openTransmission = decipher(transmission);
        System.out.println(openTransmission);
    }

    public void displayShelters() {
        for (Shelter shelter : shelter) {
            shelter.printInfo();
        }
    }

    public boolean checkSupplies() {
        for (int i = 0; i < shelter.length; i++) {
            for (int j = i + 1; j < shelter.length; j++) {
                if (shelter[i].getNumberOfSupplies() == shelter[j].getNumberOfSupplies()) {
                    return true;
                }
            }
        } return false;
    }

    public String decipher(String transmission) {
        StringBuilder parse = new StringBuilder();
        int n = 0;
        while (n < transmission.length() - 1) {
            if (transmission.charAt(n + 1) == '5') {
                parse.append(transmission.charAt(n));
            } n++;
        } return parse.toString();
    }

    public void newDefense() {
        for (int i = 0; i < shelter.length; i++) {
            for (int j = i + 1; j < shelter.length; j++) {
                if (shelter[i].getDefenseLevel() == shelter[j].getDefenseLevel()) {
                    break;
                }
            }
        }
    }

}