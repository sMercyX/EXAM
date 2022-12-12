package exam;

import java.util.Arrays;

public class Department {

    private static int nextCode = 400;
    private int code;
    private final String title;
    private Person[] staff;
    private int count;

    public Department(String title) {
        this.code = nextCode;
        nextCode++;
        if (title == null || title.isBlank()) {
            this.title = "Debsirin";
        }else {
            this.title = title;
        }
        staff = new Person[24];
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public boolean addStaff(String firstname, String lastname, int type) {
        if (count == staff.length || firstname == null || firstname.isBlank() || lastname == null || lastname.isBlank()) {
            return false;
        }else {
            staff[count] = new Person(firstname, lastname, type);
            count++;
            return true;
        }
    }

    public int getTypeCount(int type) {
        int gtc = 0;
        for (int i = 0; i < count; i++) {
            if (staff[i].getType() == type) {
                gtc++;
            }
        }
        return gtc;
    }

    public int[] getAllCodes() {
        int[] gac = new int[count];
        for (int i = 0; i < count; i++) {
            gac[i] = staff[i].getCode();
        }
        return gac;
    }

    public Person getStaff(int code) {
        for (int i = 0; i < count; i++) {
            if (staff[i].getCode() == code) {
                return staff[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("[Department : %d (%s) %d]", this.code, this.title, this.count);
    }

    public int[] getAllTypes() {
        int at = 0;
        int[] gat = new int[count];
        for (int i = 0; i < count; i++) {
            int c = 0;
            for (int j = 0; j < count; j++) {
                if (staff[i].getType() == gat[j]) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                gat[at] = staff[i].getType();
                at++;
            }
        }
        return Arrays.copyOf(gat, at);
    }
}
