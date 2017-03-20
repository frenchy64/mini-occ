#!/bin/sh

echo 'Disabling :lang on mini-occ.core\n'
perl -pi -e 's/:lang :core.typed/;:lang :core.typed/g' src/mini_occ/core.clj
lein test :only mini-occ.test-with-specs
perl -pi -e 's/;:lang :core.typed/:lang :core.typed/g' src/mini_occ/core.clj
