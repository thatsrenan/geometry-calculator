# Geometry Calculator 📐  

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white&style=for-the-badge)  
![Platform](https://img.shields.io/badge/Platform-Linux%20%7C%20Windows-lightgrey?style=for-the-badge&logo=linux&logoColor=white&logo=windows)  
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)  
![Status](https://img.shields.io/badge/Status-Stable-brightgreen?style=for-the-badge)

A terminal-based application written in **Java** for calculating areas, perimeters, volumes, and surface areas of 2D and 3D geometric shapes.
I created this project to practice Object-Oriented Programming, Inheritance, Polymorphism, Interfaces, and Project Structure.

## 🙋‍♂️ Help Me
I'm still learning Java and OOP, so if you think there's something I can improve in my code, feel free to contribute!
Fork the repository, create a new branch, and submit a pull request.

## 🗂️ Project Structure

```text
src/
├── application/
│   ├── Main.java           # Main file; Controls program flow
│   ├── Menu.java           # Menu display and user interaction
│   └── ShapeCreator.java   # Factory for creating geometric shapes
└── geometry/
    └── shapes/
        ├── Shape.java              # Abstract base class 
        ├── FlatShape.java          # Interface for 2D shapes
        ├── ThreeDimensional.java   # Interface for 3D shapes
        ├── Circle.java             # Circle (2D)
        ├── Square.java             # Square (2D)
        ├── Rectangle.java          # Rectangle (2D)
        ├── Triangle.java           # Triangle (2D)
        ├── Cylinder.java           # Cylinder (3D)
        ├── Cube.java               # Cube (3D)
        ├── RectangularPrism.java   # Rectangular Prism (3D)
        └── Pyramid.java            # Pyramid (3D)
```


## ⚙️ Installation & Execution
🔧 **Compilation Prerequisites**: Java JDK 8 or higher

### Compile all files
```bash
javac -d bin src/application/*.java src/geometry/shapes/*.java
```

### Run the application
```bash
java -cp bin application.Main
```
▶️ Direct Execution (if using IDE)
```bash
java application.Main
```

## 🎯 Technical Features
- **Object-Oriented Programming:** inheritance, polymorphism, encapsulation
- **Interfaces:** FlatShape and ThreeDimensional for clear contracts
- **Modularity:** Code organized in logical packages
- **Factory Pattern:** ShapeCreator for centralized creation

## 📜 License
This project is open-source and released under the MIT License.
You are free to use, modify, and distribute the code, as long as the original copyright notice is included.
For the full license text, see the LICENSE file.

## 👨‍💻 Developed by Renan Castro
Educational project developed to practice Object-Oriented Programming concepts in Java.

## 🚀 Future
I'm willing to improve this application. With your help, I'll update this section.  
[ ] Better encapsulation  
[ ] Implement calculation persistence  
[ ] Graphical interface (JavaFX/Swing)  
[ ] Calculations with measurement units

## 🙏 THX for Reading!
