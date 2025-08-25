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
