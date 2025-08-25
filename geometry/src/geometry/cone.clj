(ns geometry.cone)

;; Calculate volume of a cone
(defn volume-of-cone
    [radius height]
    (* (/ 1 3) Math/PI (Math/pow radius 2) height))

;; Calculate base surface area of a cone
(defn base-area-of-cone
    [radius]
    (* Math/PI (Math/pow radius 2)))

;; Calculate slant height of a cone
(defn slant-height-cone
    [radius height]
    (Math/sqrt (+ (Math/pow radius 2) (Math/pow height 2))))

;; Calculate lateral surface area of a cone
(defn lateral-area-of-cone
    [radius slant-height]
    (* Math/PI radius slant-height))

;; Calculate total surface area of a cone
(defn total-surface-area-of-cone
    [radius height]
    (+ (base-area-of-cone radius)
       (lateral-area-of-cone radius (slant-height-cone radius height))))