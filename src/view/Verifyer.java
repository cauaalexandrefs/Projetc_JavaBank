package view;

import view.User;
import view.PackageManager;
import java.io.IOException;
import java.util.ArrayList;

public class Verifyer {

    public double verifyNumber(String number) {
        if (number.matches("[+-]?\\d*(\\.\\d+)?")) {
            return Double.parseDouble(number);
        }
        return -1;
    }

    public User verifyUser(String cpf, String pass) {
        boolean isUser = false;
        PackageManager pm = new PackageManager();
        ArrayList<User> list = new ArrayList<>();
        try {
            list = (ArrayList<User>) pm.getObject();
            for (User element : list) {
                isUser = element.getCpf().equals(cpf) && element.getPassword().equals(pass);
                if (isUser) {
                    return element;
                }
            }
            if (!isUser) {
                return null;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }

    public int verifyAE(String ae) {
        if (ae.length() != 6) {
            return 2;
        } else if (!ae.matches("[+-]?\\d*(\\.\\d+)?")) {
            return 3;
        }
        return 1;
    }

    public boolean verifypass(String passworld) {

        if (passworld.length() < 4) {
            return false;
        }
        return true;
    }

    public boolean verifyage(String age) {
        
        try {
            Integer.parseInt(age);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public int verifyname(String name) {

        if (!name.matches("^[A-Za-zÀ-Üà-ü ]+$")) {
            return 2;
        }

        if (name.substring(0).equals(name.substring(0).toLowerCase())) {
            return 3;
        }
        return 1;
    }

    public double verifyWihtdraw(double number, User user) {
        if (number > 0.0 && number <= user.getBalance()) {
            return number;
        }

        return 0;
    }

    public boolean verifyCpf(String cpf) {
        if (cpf.length() != 14) {
            return false;
        } else {
            int countSameNumbers = 0;
            String cpf1 = cpf.replace(".", "").replace("-", "");
            for (int i = 0; i < cpf1.length() - 1; i++) {
                if (cpf1.substring(i, (i + 1)).equals(cpf1.substring(i + 1, (i + 2)))) {
                    countSameNumbers++;
                }
            }
            if (countSameNumbers >= 10) {
                return false;
            } else {
                String[] arrayString = cpf.replace(".", "").replace("-", "").split("");
                int[] NArryString = new int[arrayString.length];
                for (int i = 0; i < arrayString.length; i++) {
                    NArryString[i] = Integer.parseInt(arrayString[i]);
                }
                int soma1 = NArryString[0] * 1 + NArryString[1] * 2 + NArryString[2] * 3 + NArryString[3] * 4 + NArryString[4] * 5 + NArryString[5] * 6 + NArryString[6] * 7 + NArryString[7] * 8 + NArryString[8] * 9;
                int resto1 = soma1 % 11;
                if (resto1 == 10) {
                    resto1 = 0;
                }
                if (resto1 != NArryString[9]) {
                    return false;
                }

                int soma2 = NArryString[0] * 0 + NArryString[1] * 1 + NArryString[2] * 2 + NArryString[3] * 3 + NArryString[4] * 4 + NArryString[5] * 5 + NArryString[6] * 6 + NArryString[7] * 7 + NArryString[8] * 8 + resto1 * 9;
                int resto2 = soma2 % 11;
                if (resto2 == 10) {
                    resto2 = 0;
                }
                if (resto2 != NArryString[10]) {
                    return false;
                }

                return true;
            }
        }
    }
}
