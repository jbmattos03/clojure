(ns geometry.cone)

;; Calculate volume of a cone
(defn volume-of-cone
    "Calculate volume of a cone based on its radius and height.
    Formula: V = 1/3*PI*(r^2)*h"
    [radius height]
    (* (/ 1 3) Math/PI (Math/pow radius 2) height))

;; Calculate base surface area of a cone
(defn base-area-of-cone
    "Calculate base area of a cone based on its radius.
    Formula: BA = PI*(r^2)"
    [radius]
    (* Math/PI (Math/pow radius 2)))

;; Calculate slant height of a cone
(defn slant-height-cone
    "Calculate slant height of a cone based on its radius and height.
    Formula: l = sqrt(r^2 + h^2)"
    [radius height]
    (Math/sqrt (+ (Math/pow radius 2) (Math/pow height 2))))

;; Calculate lateral surface area of a cone
(defn lateral-area-of-cone
    "Calculate lateral surface area of a cone based on its radius and slant height.
    Formula: LA = PI*r*l"
    [radius slant-height]
    (* Math/PI radius slant-height))

;; Calculate total surface area of a cone
(defn total-surface-area-of-cone
    "Calculate total surface area of a cone based on its radius and height.
    Formula: A = BA + LA"
    [radius height]
    (+ (base-area-of-cone radius)
       (lateral-area-of-cone radius (slant-height-cone radius height))))