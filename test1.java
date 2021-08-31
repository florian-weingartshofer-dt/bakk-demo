public class Person {
    public final UUID id;
    public final String name;
    public final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        id = UUID.randomUUID();
    }
}
