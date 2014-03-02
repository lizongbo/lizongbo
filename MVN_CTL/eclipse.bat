@echo off
setlocal
cd /D %0\..\..
@rem mvn eclipse:configure-workspace -Declipse.workspace=D:\Users\Administrator\workspace
call mvn org.apache.maven.plugins:maven-eclipse-plugin:clean 
call mvn versions:use-releases versions:display-dependency-updates versions:display-plugin-updates
call mvn org.apache.maven.plugins:maven-eclipse-plugin:eclipse -DdownloadSources=true
pause
