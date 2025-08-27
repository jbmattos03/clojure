(ns date.core
  (:require [date.date-formatter]
            [date.date-calculator])
  (:gen-class))

(defn -main
  "Chooses the date calculation to perform."
  [mode]
  (case mode
    "format" (do 
    (println "Insert timezone (e.g., 'America/New_York'):")
    (let [timezone (read-line)]
      (println "Insert format (e.g., 'yyyy-MM-dd HH:mm:ss'):")
      (let [format (read-line)]
        (println (date.date-formatter/format-current-date-time-zoned timezone format)))))
    "Unknown mode" (println "Mode not recognized.")))
