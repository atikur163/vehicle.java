# Software Design: 

---

## Topic 1: Design Fundamentals

1. What is software design? Distinguish between architectural design and detailed design.
2. What do you mean by modularity and decomposition? State two characteristics of a good split.
3. Define coupling and cohesion. List the types of each in order from high to low (or low to high) quality.
4. Differentiate between abstraction, encapsulation, and information hiding. What was Parnas's contribution?

## Topic 2: Design Quality and CK Metrics

5. Name and briefly explain two techniques for assessing software design quality.
6. For the `Controller` class below, calculate `CBO(Controller)` and `COF(Controller, Bell, Light)`.

   ```java
   class Controller {
       private boolean alarm;
       private Bell b;
       private Light l;

       public Controller(Bell ab, Light al) {
           alarm = false;
           b = ab;
           l = al;
       }

       public void alarmSignal() {
           alarm = true;
       }

       public void cancelAlarm() {
           alarm = false;
           System.out.println("False alarm !!");
       }

       public void confirmAlarm() {
           if (alarm == true) {
               if (b != null) b.ring();
               if (l != null) l.open();
               alarm = false;
           } else
               System.out.println("False alarm !!");
       }

       public void stopAlarm() {
           if (b != null) b.stop();
           if (l != null) l.close();
       }
   }
   ```

7. A `Rectangle` class has attributes `x`, `y`, `width`, `height` and the following methods: a constructor (uses all four attributes), `draw()` (uses x, y, width, height), and `calculateArea()` (uses width, height). Calculate LCOM, LCOM2, and LCOM3.
8. What do LCOM2 = 0 and LCOM2 = 1 indicate about a class? Why does LCOM3 > 1 indicate "dead attributes"?
9. For the `Controller` class in Question 6, calculate the McCabe version of WMC and the RFC. Also, define DIT and NOC, and explain how they relate to reuse vs. complexity.

## Topic 3: Software Architecture and Architectural Styles

10. Define software architecture according to Clements et al. What are its key elements?
11. Differentiate between an architectural style and a design pattern. At which design level is each used?
12. Explain the MVC architectural style. Why is it said that "UI = View + Controller"?
13. Compare the Event-Based, Blackboard/Repository, and Pipes and Filters styles with one real-life example of each.

## Topic 4: GoF Design Patterns

14. Classify GoF patterns into Creational, Structural, and Behavioral categories, with two examples of each.
15. Explain the Factory Method pattern: intent, participants, one benefit, and one liability. What is the Parameterized Factory variant?
16. Explain the Strategy pattern with its intent, a UML diagram (Navigator/RouteStrategy example), and its benefits and liabilities.
17. Explain the Template Method pattern using the StatisticCalculator example. How does it differ from Strategy?
18. Explain the Adapter pattern. Differentiate between Object Adapter and Class Adapter with UML diagrams.
19. Explain the Composite pattern using the Graphic/Panel example. What does the "design too general" liability mean?
20. Explain the Façade pattern using the Compiler example. What does "Façade can become a God class" mean?
21. Explain the participants of the Command pattern (Command, ConcreteCommand, Client, Invoker, Receiver) using the Menu/Document example.
22. Write the code for the Singleton pattern. State two liabilities and explain why Singleton complicates unit testing.

## Topic 5: Fowler's EAA Patterns

23. Describe the responsibilities of the three layers of an enterprise application (Presentation, Domain, Data Source).
24. What is the Domain Model pattern, and when should it be used? Why is the Service Layer pattern needed?
25. Explain the Data Mapper pattern. By what other names is it known, and what do in-memory objects know about the database when using it?
26. Explain Foreign Key Mapping for One-to-One, Many-to-One, and One-to-Many relationships (Route, Driver, Service, Stop). Where does the foreign key reside in each case?
27. Compare Single Table, Class Table, and Concrete Table Inheritance (using the Employee example), with one benefit and one liability of each.

## Topic 6: User Interface Design

28. List and briefly explain the seven UI design principles.
29. Differentiate between Direct Manipulation, Menu Selection, Form Fill-in, Command Language, and Natural Language UI modalities.
30. What are the guidelines for using color in UI information presentation? Why is "don't depend on color alone" important? Give a practical example.
