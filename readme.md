#  Food Delivery Application (Java + Design Patterns)

##  Overview
This project is a basic **Food Delivery Application** built in Java to demonstrate the use of important **Object-Oriented Design Patterns**.  
It simulates core features of apps like Zomato/Swiggy while focusing on clean, scalable architecture.

---

##  Features
-  User creation using Factory Pattern  
-  Food customization using Decorator Pattern  
-  Multiple payment options using Strategy Pattern  
-  Real-time order status updates using Observer Pattern  

---

##  Design Patterns Used

###  Factory Pattern
Creates user objects (e.g., Customer) without exposing instantiation logic.

###  Strategy Pattern
Handles multiple payment methods like UPI and Card dynamically.

###  Decorator Pattern
Adds extra items (like Cheese) to food without modifying base classes.

###  Observer Pattern
Notifies users about order status updates (Preparing → Delivered).

---

##  Project Structure

```
food-delivery/
│
├── src/
│   ├── models/
│   ├── factory/
│   ├── strategy/
│   ├── decorator/
│   ├── observer/
│   ├── Main.java
```

---

##  UML Class Diagram

```
                +------------------+
                |      User        |
                +------------------+
                        ▲
                        |
                +------------------+
                |    Customer      |
                +------------------+

+---------------------+
|   UserFactory       |
+---------------------+

-----------------------------------

        Strategy Pattern
+------------------------+
|   PaymentStrategy      |
+------------------------+
      ▲            ▲
      |            |
+------------+  +-------------+
| UpiPayment |  | CardPayment |
+------------+  +-------------+

-----------------------------------

        Decorator Pattern
+----------------+
|     Food       |
+----------------+
        ▲
        |
    +--------+
    | Burger |
    +--------+
        ▲
        |
+---------------------+
| CheeseDecorator     |
+---------------------+

-----------------------------------

        Observer Pattern
+------------------+
|    Observer      |
+------------------+
        ▲
        |
+----------------------+
|   OrderObserver      |
+----------------------+

+------------------+
|      Order       |
+------------------+
| - observers      |
| - status         |
+------------------+
```

---

## ▶ How to Run

### 1. Open in VS Code  
### 2. Navigate to `src` folder  

### 3. Compile:
```
javac */*.java Main.java
```

### 4. Run:
```
java Main
```

---

##  Sample Output

```
Smriti is a Customer
Order: Burger + Cheese
Total Cost: ₹120
Paid ₹120 using UPI
Smriti notified: Order is Preparing
Smriti notified: Order is Out for Delivery
Smriti notified: Order is Delivered
```

---


## 👩‍💻 Author
**Smriti Jha**

---

## ⭐ Acknowledgement
This project is created for learning and practicing **Java Design Patterns** and building strong backend fundamentals.