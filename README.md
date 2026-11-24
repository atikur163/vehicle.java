

Software Engineering: 

Approach	Outcome-Based Education (OBE), Bloom's Taxonomy (Cognitive Domain), BNQF-aligned
Cognitive Levels	Knowledge (C1), Understanding (C2)

Course Outcomes (CO):

CO1	Explain the fundamental principles of software design (modularity, coupling, cohesion, abstraction, encapsulation and information hiding).

CO2	Describe how the quality of an object-oriented design is assessed using design reviews and software metrics (CK metrics).

CO3	Explain software architecture and common architectural styles.

CO4	Explain GoF design patterns and their role in object-oriented design.

CO5	Explain enterprise application architecture patterns (Fowler's EAA patterns).

CO6	Explain user interface design principles and interaction modalities.

Section A: Knowledge (C1), 10 Marks (5 x 2)

1. (a) Define software design. (b) Name the two basic steps of the design process. [2] (CO1, Knowledge (C1))

2. Define coupling and cohesion. [2] (CO1, Knowledge (C1))

3. Define software architecture according to Clements et al. [2] (CO3, Knowledge (C1))

4. Name the three categories of GoF design patterns and write one pattern from each category. [2] (CO4, Knowledge (C1))

5. List the three layers of an enterprise application architecture. [2] (CO5, Knowledge (C1))

Section B: Understanding (C2), 30 Marks (4 x 7)

6. (a) Differentiate between abstraction, encapsulation and information hiding. [2]
(b) Explain Parnas's contribution to the decomposition of systems into modules. [2]
[Total 4] (CO1, Understanding (C2))

7. Explain the CBO, LCOM and WMC metrics. What does a high value of each indicate about the quality of a design?
[Total 4] (CO2, Understanding (C2))

8. (a) Explain the Model-View-Controller (MVC) architectural style. [3]
(b) Why is it said that "UI = View + Controller"? [1]
[Total 4] (CO3, Understanding (C2))

9. Explain the Strategy pattern: its intent [1], its structure with the Navigator/RouteStrategy example [1], one benefit [1] and one liability [1].
[Total 4] (CO4, Understanding (C2))

10. (a) Explain the Data Mapper pattern and why it fits well with the Domain Model. [2]
(b) Describe how Foreign Key Mapping represents a One-to-Many relationship, using Route and Stop as the example. [2]
[Total 4] (CO5, Understanding (C2))

11. (a) Differentiate between the Direct Manipulation, Menu Selection and Form Fill-in UI modalities. [3]
(b) State any two guidelines for using color in UI information presentation. [1]
[Total 4] (CO6, Understanding (C2))

12. For the `Controller` class below, calculate `CBO(Controller)` and `COF(Controller, Bell, Light)`.[ Total 4]

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
(C02,understanding (C2))


