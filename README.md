3D Shape Polymorphism

Description

This Java project demonstrates the concept of polymorphism by creating an interface for 3D shapes and implementing it in three different shape classes: Sphere, Cylinder, and Cube. Each shape class implements the Shape3DInterface interface, providing methods to calculate the surface area and volume of the respective shapes.

How Polymorphism is Used
Polymorphism is a core concept in object-oriented programming (OOP) that allows objects of different classes to be treated as objects of a common superclass or interface. In this project, we use method overriding to implement polymorphism.

The interface Shape3DInterface defines two methods:
double surfaceArea(): Calculates the surface area of a 3D shape.
double volume(): Calculates the volume of a 3D shape.
Each shape class (Sphere, Cylinder, and Cube) implements the Shape3DInterface and overrides the surfaceArea() and volume() methods with formulas specific to the shape:
Sphere:
Surface Area: 4πr²
Volume: (4/3)πr³
Cylinder:
Surface Area: 2πr(r + h)
Volume: πr²h
Cube:
Surface Area: 6a²
Volume: a³
At runtime, the correct method for each shape is called dynamically, based on the actual object type (Sphere, Cylinder, or Cube) even though all objects are referenced through the Shape3DInterface. This is the key demonstration of polymorphism in action.

The program also generates random shapes with random dimensions and outputs their surface area and volume.

Project Structure
src/ - Contains the Java source code.
Shape3DInterface.java - Interface with methods for surface area and volume.
Sphere.java - Class implementing Shape3DInterface for a sphere.
Cylinder.java - Class implementing Shape3DInterface for a cylinder.
Cube.java - Class implementing Shape3DInterface for a cube.
ShapeDemo.java - Main class to demonstrate polymorphism and generate random shapes.
bin/ - Directory where compiled classes will be stored.
Sample Output
Here are some examples of the output generated when running the program. The surface area and volume are randomly calculated based on the dimensions of the shapes (radius, height, or side length).

<img width="926" alt="Screenshot 2024-12-08 at 13 30 11" src="https://github.com/user-attachments/assets/70bf34c1-2a72-44af-9758-8e79a9e5e6c6">

