(ns veeva-vault-api-v25/1.specs.-vobjects-object-name-actions-merge-post-request-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def -vobjects-object-name-actions-merge-post-request-inner-data
  {
   (ds/opt :duplicate_record_id) string?
   (ds/opt :main_record_id) string?
   })

(def -vobjects-object-name-actions-merge-post-request-inner-spec
  (ds/spec
    {:name ::-vobjects-object-name-actions-merge-post-request-inner
     :spec -vobjects-object-name-actions-merge-post-request-inner-data}))
