set JAVA_HOME=C:\dev\jdk1.1.8
set Path=%JAVA_HOME%\bin;%Path%
set DEPLOY_HOME=C:\Project\RR0
set ARCHIVE=%DEPLOY_HOME%\Documents\Pratique\matrix.jar

del %ARCHIVE%
rem javac -d C:\Project\ufoathome\ufoathome\applets\classes org\rr0\is\presentation\view\report\KnownPhenomenonMatrixApplet.java
cd classes
jar cvfm %ARCHIVE% %DEPLOY_HOME%\MATRIX_MANIFEST.MF org
cd ..