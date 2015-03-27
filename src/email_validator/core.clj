(ns email-validator.core)

(defn- match-regex?
  "Check if the string matches the regex"
  [v regex]
  (boolean (re-matches regex v)))

(defn is-email?
  "Check if input is a valid email address"
  [input]
  (if (nil? input)
    false
    (match-regex? input #"(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")))
