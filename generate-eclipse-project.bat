@echo off
echo This will use Maven to generate an eclipse project
echo This will generate a .project, .classpath, META-INF/MANIFEST.MF, and lib/ with jar dependencies
echo This must be used when dependencies are added or modified
echo Do not manually edit the generated files
echo More info: http://felix.apache.org/site/apache-felix-maven-bundle-plugin-bnd.html

mvn clean package eclipse:eclipse -Declipse.pde install
