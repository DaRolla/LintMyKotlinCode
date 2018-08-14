@ECHO OFF
gradlew lint createDebugCoverageReport jacocoTestReport sonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.login=32a05a6ed5e0e5cc84ff864fb41044798e135668

REM gradlew createDebugCoverageReport jacocoTestReport sonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.login=32a05a6ed5e0e5cc84ff864fb41044798e135668

REM 80.0% (Code Coverage nur MainActivity)
REM gradlew createDebugCoverageReport sonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.login=32a05a6ed5e0e5cc84ff864fb41044798e135668

REM 20.0 (Code Coverage nur Adding)
REM gradlew jacocoTestReport sonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.login=32a05a6ed5e0e5cc84ff864fb41044798e135668