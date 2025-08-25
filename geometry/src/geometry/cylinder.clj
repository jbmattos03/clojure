(ns geometry.cylinder)

;; Calculate volume of a cylinder
(defn volume-of-cylinder
    [radius height]
    (* Math/PI (Math/pow radius 2) height))

;; Calculate surface area of the base
(defn base-surface-area-of-cylinder
    [radius]
    (* Math/PI (Math/pow radius 2)))

;; Calculate lateral surface area of a cylinder
(defn lateral-surface-area-of-cylinder
    [radius height]
    (* 2 Math/PI radius height))

;; Calculate total surface area of a cylinder
(defn total-surface-area-of-cylinder
    [radius height]
    (+ (base-surface-area-of-cylinder radius)
       (lateral-surface-area-of-cylinder radius height)))