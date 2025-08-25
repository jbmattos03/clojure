(ns geometry.sphere)

;; Calculate volume of a sphere
(defn volume-of-sphere
    "Calculate volume of a sphere based on its radius.
    Formula: V = 4/3*PI*(r^3)"
    [radius]
    (* (/ 4 3) Math/PI (Math/pow radius 3)))

;; Calculate total surface area of a sphere
(defn surface-area-of-sphere
    "Calculate total surface area of a sphere based on its radius.
    Formula: A = 4*PI(r^2)"
    [radius]
    (* 4 Math/PI (Math/pow radius 2)))