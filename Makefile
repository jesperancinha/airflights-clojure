coverage:
	lein cloverage --lcov
	lein omni-coveragereporter-lein
build:
	lein deps
	lein install
	lein test
update-local:
	rm -rf maven_repository
	mkdir -p maven_repository
	mkdir -p maven_repository/org
	mkdir -p maven_repository/org/jesperancinha
	cp -r ~/.m2/repository/org/jesperancinha/plugins maven_repository/org/jesperancinha
