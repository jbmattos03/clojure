(ns geometry.core
  (:require [geometry.sphere :as sphere]
            [geometry.cylinder :as cylinder])
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
    "Unknown shape" (println "Shape not recognized.")
  ))
