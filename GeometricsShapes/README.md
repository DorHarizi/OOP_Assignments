# Geometric Shapes Representation and GUI: Project Overview

## Description

In this project, a foundational infrastructure is developed for representing two-dimensional geometric shapes and collections of shapes, coupled with a Graphic User Interface (GUI).

## Phases of the Project

### Phase 1: Implementing Geometric Shape Classes

Implement classes for various geometric shapes such as Triangle2D, Segment2D, Circle2D, and Rect2D. Each of these classes implements the `GeoShape` interface, adhering to defined methods such as area calculation, perimeter calculation, shape movement, and others. 

### Phase 2: Testing the Geometric Shape Classes

Develop testing classes for each geometric shape to ensure that the implementations are correct and robust. The testing classes should be placed in the `ex4.tests` package.

### Phase 3: Implementing the ShapeGUI Class

Implement the `ShapeGUI` class, which should realize the `GUI_Shape` interface. This class should have constructors that ensure compatibility with the provided `Test_Ex4` class. Additionally, create a JUnit testing class to validate the functionality of the `ShapeGUI` class.

### Phase 4: Implementing the Shape Collection Class

Develop the `nShape_Collection` class, adhering to the `GUI_Shape_Collection` interface specifications. This class should facilitate the saving and loading of a collection of shapes to and from a text file, and allow for the sorting of shapes based on different order relations defined within the Comparator class.

### Phase 5: Implementing the Main Ex4 Class

The `Ex4` class should implement the `GUI_Ex4` interface. This class should facilitate the graphical display of a collection of shapes in a window, enabling a visual representation of the geometric shapes and their collection.

### Phase 6: Creating an Executable Jar File

Create an executable JAR file named `Ex4.jar`. This JAR file should accept parameters for filename and sorting method, enabling the execution and display of sorted shapes based on the received parameters.

## Key Interfaces and Classes

### GeoShape Interface

- **contains(Point2D ot):** Determines if a point is contained within a shape.
- **centerOfMass():** Calculates the center of mass of a shape.
- **area():** Computes the area of a shape.
- **perimeter():** Calculates the perimeter of a shape.
- **move(Point2D vec):** Moves the shape by a specified vector.
- **copy():** Creates a deep copy of the shape.

## How to Compile and Run

The project includes an executable JAR file, `Ex4.jar`, which can be executed with filename and sorting method parameters to display the geometric shapes graphically in a sorted order based on the provided sorting method.

