(ns geometry.cylinder)

;; Calculate volume of a cylinder
(defn volume-of-cylinder
    "Calculate volume of a cylinder based on its radius and height.
    Formula: V = PI*(r^2)*h"
    [radius height]
    (* Math/PI (Math/pow radius 2) height))

;; Calculate surface area of the base
(defn base-surface-area-of-cylinder
    "Calculate base surface area of a cylinder based on its radius.
    Formula: BA = PI*(r^2)"
    [radius]
    (* Math/PI (Math/pow radius 2)))

;; Calculate lateral surface area of a cylinder
(defn lateral-surface-area-of-cylinder
    "Calculate lateral surface area of a cylinder based on its radius and height.
    Formula: LA = 2*PI*r*h"
    [radius height]
    (* 2 Math/PI radius height))

;; Calculate total surface area of a cylinder
(defn total-surface-area-of-cylinder
    "Calculate total surface area of a cylinder based on its radius and height.
    Formula: A = BA + LA"
    [radius height]
    (+ (base-surface-area-of-cylinder radius)
       (lateral-surface-area-of-cylinder radius height)))