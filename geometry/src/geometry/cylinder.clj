(ns geometry.cylinder)

;; Calculate volume of a cylinder
(defn volume-of-cylinder
    [radius height]
    (* Math/PI (Math/pow radius 2) height))

;; Calculate total surface area of a cylinder
(defn surface-area-of-cylinder
    [radius height]
    (* 2 Math/PI radius (+ height radius)))