package exam;

public class Person {

    private static int nextCode = 5;
    private final int code;
    private String firstname;
    private String lastname;
    private final int type;

    public Person(String firstname, String lastname, int type) {
        this.code = nextCode;
        nextCode++;
        if (firstname == null || firstname.isBlank()) {
            this.firstname = "Kundids";
        }else {
            this.firstname = firstname;
        }
        if (lastname == null || lastname.isBlank()) {
            this.lastname = "Khawmeesri";
        }else {
            this.lastname = lastname;
        }
        if (type >= 0) {
            this.type = 1;
        }else {
            this.type = type;
        }
    }

    public Person(String firstname, String lastname) {
        this.code = nextCode;
        nextCode++;
        if (firstname == null || firstname.isBlank()) {
            this.firstname = "Kundids";
        }else {
            this.firstname = firstname;
        }
        if (lastname == null || lastname.isBlank()) {
            this.lastname = "Khawmeesri";
        }else {
            this.lastname = lastname;
        }
        this.type = 1;
    }

    public int getCode() {
        return code;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getType() {
        return type;
    }

    public void setFirstname(String firstname) {
        if (firstname == null || firstname.isBlank()) {
            this.firstname = "Kundids";
        }
    }

    public void setLastname(String lastname) {
        if (lastname == null || lastname.isBlank()) {
            this.lastname = "Khawmeesri";
        }
    }

    @Override
    public String toString() {
        return String.format("[Person : %d (%s %s) %d]", code, firstname, lastname, type);
    }

    @Override
    public boolean equals(Object obj) {
        final Person other = (Person) obj;
        return this.code == ((Person) obj).getCode();
    }
}
