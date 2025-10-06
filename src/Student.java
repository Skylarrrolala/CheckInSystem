public class Student {
    private String id;    // E001, E002 ...
    private String name;  // Alice, Bob ...
    private String pin;   // "1234" (optional, for extra security)

    // constructor + getters
    public Student(String id, String name, String pin) {
        this.id = id;
        this.name = name;
        this.pin = pin;
    }

    // Getter
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public String getPin() {
        return pin;
    }
}

