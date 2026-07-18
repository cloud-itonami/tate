(require 'clojure.test
         'tate.tests.test-case-actors
         'tate.tests.test-coverage
         'tate.tests.test-coverage-publish
         'tate.tests.test-kotoba
         'tate.tests.test-respond
         'tate.tests.test-site
         'tate.tests.test-terms)

(let [result (apply clojure.test/run-tests
                    '[tate.tests.test-case-actors
                      tate.tests.test-coverage
                      tate.tests.test-coverage-publish
                      tate.tests.test-kotoba
                      tate.tests.test-respond
                      tate.tests.test-site
                      tate.tests.test-terms])]
  (when-not (zero? (+ (:fail result) (:error result)))
    (throw (ex-info "tate tests failed" result))))
