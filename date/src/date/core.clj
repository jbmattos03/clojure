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
    "difference" (do
    (println "Insert format (e.g., 'dd-MM-yyyy'):")
    (let [format (read-line)]
      (println "Insert start date (e.g., '2023-10-01'):")
      (let [start-date (read-line)]
        (println "Insert end date (e.g., '2023-10-31'):")
        (let [end-date (read-line)]
          (let [date-diff (date.date-calculator/calculate-date-difference start-date end-date format)]
            (println "Date Difference:" date-diff))))))
    "Unknown mode" (println "Mode not recognized.")))
