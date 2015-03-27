(ns email-validator.core-test
  (:require [clojure.test :refer :all]
            [email-validator.core :refer :all]))

(deftest test-is-email?
  (is (= false
         (is-email? nil)))
  (is (= false
         (is-email? "")))
  (is (= true
         (is-email? "xpto@abc.com")))
  (is (= true
         (is-email? "xp123o@abc.com")))
  (is (= true
         (is-email? "xpo@a123bc.com")))
  (is (= true
         (is-email? "xpo@abc.c123m")))
  (is (= true
         (is-email? "XPTO@ABC.DEF")))
  (is (= false
         (is-email? "@xpto.com")))
  (is (= false
         (is-email? "xpto@abc")))
  (is (= true
         (is-email? "xp'to@mail.com")))
  (is (= true
         (is-email? "xp/to@mail.com")))
  (is (= false
         (is-email? "xpto@abc.")))
  (is (= true
         (is-email? "xpt+o@abc.com")))
  (is (= false
         (is-email? "xpto")))
  (is (= false
         (is-email? "xpto@.com"))))
