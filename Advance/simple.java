import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person {
  protected String name;
  protected int age;
  public String description;

  public Person(String x, int a) {
    this.name = x;
    this.age = a;
    description = "N/A";
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }
}

class ComparisonProvider {

  // Method 1
  // To compare with name
  public int compareByName(Person a, Person b) {
    return a.getName().compareTo(b.getName());
  }

  // Method 2
  // To compare with age
  public int compareByAge(Person a, Person b) {
    return a.getAge().compareTo(b.getAge());
  }
}

public class simple {
  public static void main(String[] args) {
    List<Person> ll = new ArrayList<>();
    ll.add(new Person("nam1", 45));
    ll.add(new Person("nam13", 5));
    ll.add(new Person("nam2", 35));
    ll.add(new Person("nam0", 95));

    ll.forEach(n -> {
      System.out.println(n.getName() + " | " + n.getAge() + " | " + n.description);
    });
    ComparisonProvider comparator = new ComparisonProvider();
    Collections.sort(ll, comparator::compareByName);
    System.out.println();
    ll.forEach(n -> {
      System.out.println(n.getName() + " | " + n.getAge() + " | " + n.description);
    });

    System.out.println();

    ll
        .stream()
        .filter(m -> m.getAge() > 5)
        .forEach(n -> {
          System.out.println(n.getName() + " | " + n.getAge() + " | " + n.description);
      });
    // ll.stream().map(m -> m.getAge()).forEach(System.out::println);

    List<String> personList = new ArrayList<>();

    // Adding elements to above object of List
    // using add() method
    personList.add("vicky");
    personList.add("poonam");
    personList.add("sachin");

    Collections.sort(personList, String::compareToIgnoreCase);

  }
}
