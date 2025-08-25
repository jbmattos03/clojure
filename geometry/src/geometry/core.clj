(ns geometry.core
  (:require [geometry.sphere :as sphere]
            [geometry.cylinder :as cylinder]
            [geometry.cone :as cone])
  (:gen-class))

(defn -main
  "Return shape calculations based on the shape provided on the argument."
  [shape]
  (case shape
    "sphere" (do
      (println "Insert radius of the sphere:")
      (let [radius (Double/parseDouble (read-line))
            volume-sphere (sphere/volume-of-sphere radius)
            area-sphere (sphere/surface-area-of-sphere radius)]
        (println "Radius: " radius)
        (println "Volume: " volume-sphere)
        (println "Area: " area-sphere)))
    "cylinder" (do
      (println "Insert radius of the base:")
      (let [radius (Double/parseDouble (read-line))]
        (println "Insert height of the cylinder:")
        (let [height (Double/parseDouble (read-line))
              volume-cylinder (cylinder/volume-of-cylinder radius height)
              total-area-cylinder (cylinder/total-surface-area-of-cylinder radius height)
              lateral-area-cylinder (cylinder/lateral-surface-area-of-cylinder radius height)
              base-area-cylinder (cylinder/base-surface-area-of-cylinder radius)]
          (println "Radius: " radius)
          (println "Height: " height)
          (println "Volume: " volume-cylinder)
          (println "Lateral Area: " lateral-area-cylinder)
          (println "Base Area: " base-area-cylinder)
          (println "Total Area: " total-area-cylinder))))
    "cone" (do
      (println "Insert radius of the base:")
      (let [radius (Double/parseDouble (read-line))]
        (println "Insert height of the cone:")
        (let [height (Double/parseDouble (read-line))
              volume-cone (cone/volume-of-cone radius height)
              base-area-cone (cone/base-area-of-cone radius)
              slant-height (cone/slant-height-cone radius height)
              lateral-area-cone (cone/lateral-area-of-cone radius slant-height)
              total-area-cone (cone/total-surface-area-of-cone radius height)]
          (println "Radius: " radius)
          (println "Height: " height)
          (println "Volume: " volume-cone)
          (println "Base Area: " base-area-cone)
          (println "Slant Height: " slant-height)
          (println "Lateral Area: " lateral-area-cone)
          (println "Total Area: " total-area-cone))))
    "Unknown shape" (println "Shape not recognized.")
  ))
