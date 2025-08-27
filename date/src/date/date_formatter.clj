(ns date.date-formatter
  (:import [java.time LocalDateTime ZoneId ZonedDateTime]
           [java.time.format DateTimeFormatter])
  (:gen-class))

(defn format-current-date-time-zoned
  "Format the current date and time for the specified timezone in the specified format."
  [timezone format]
  (try
    (let [now (ZonedDateTime/now (ZoneId/of timezone))
        formatter (DateTimeFormatter/ofPattern format)]
    (.format now formatter))
    (catch Exception e
      (str "Error: " (.getMessage e)))))

(defn format-current-date-time
  "Format the current date and time in the specified format."
  [format]
  (try
    (let [now (LocalDateTime/now)
          formatter (DateTimeFormatter/ofPattern format)]
      (.format now formatter))
    (catch Exception e
      (str "Error: " (.getMessage e)))))