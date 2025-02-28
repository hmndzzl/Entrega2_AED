(ns entrega2.core
  (:gen-class))

(defn -main
  [])

(def promedios [{:nombre "Àlgebra" :promedio 83}
                  {:nombre "Cálculo" :promedio 85}
                  {:nombre "Física" :promedio 78}])

  (defn promedio-materias [promedios]
    (let [notas (map :promedio promedios)]
      (/ (reduce + notas) (count notas))))

  (println "Promedio de notas:" (promedio-materias promedios))

