# clojure
Small Clojure projects.

# Requirements
1. [OpenJDK](https://openjdk.org/)
2. [Leiningen](https://leiningen.org/#install)

# Geometry
This is a simple project that calculates attributes such as volume and total surface area of a geometric shape given some parameters - such as radius, for a sphere.

## How to run
First, make sure you are in the `geometry` folder:
```bash
cd geometry
```

Replace `<shape>` with one of the [available shapes](#available-shapes) in the command below:
```bash
lein run <shape>
```

## Available shapes
+ Sphere
+ Cylinder
+ Cone

# Date
This is a simple project that uses Java's _time_ library to manipulate dates.

## How to run
First, make sure you are in the `date` folder:
```bash
cd date
```

Replace `<feature>` with one of the [available features](#available-features)
```bash
lein run <feature>
```

## Available features
+ Format: Formats a date/time in a format style provided by the user
+ Difference: Calculates the difference in years, months and days between two dates
