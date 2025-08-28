(ns date.date-calculator
  (:import [java.time LocalDate Period Duration]
           [java.time.format DateTimeFormatter])
  (:gen-class))

;; Function to calculate the difference between two dates
(defn calculate-date-difference
  [date-str1 date-str2 format-str]
  (if (or (clojure.string/blank? date-str1)
          (clojure.string/blank? date-str2))
    {:error "Both date strings must be non-empty."}
    (let [formatter (DateTimeFormatter/ofPattern format-str)
          dt1 (LocalDate/parse date-str1 formatter)
          dt2 (LocalDate/parse date-str2 formatter)]
      ;; Check which date is earlier and calculate the period accordingly
      (let [period (if (.isBefore dt1 dt2)
                     (Period/between dt1 dt2)
                     (Period/between dt2 dt1))]
        {:years   (.getYears period)
         :months  (.getMonths period)
         :days    (.getDays period)}))))