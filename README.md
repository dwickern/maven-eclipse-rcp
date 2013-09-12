maven-eclipse-rcp
=================

Sample of a mavenized eclipse RCP plugin with eclipse IDE support

This project demonstrates how to develop an eclipse [Rich Client Platform](http://wiki.eclipse.org/index.php/Rich_Client_Platform) plugin using Maven for build and dependency management, _without_ giving up eclipse IDE support and _without_ using [Tycho](http://www.eclipse.org/tycho/) or [m2e](http://eclipse.org/m2e/).

Building with Maven
-------------------
Run `mvn install`. The resulting artifact is an eclipse plugin.

Building with Eclipse
---------------------
1. Generate Eclipse metadata:

        mvn clean package eclipse:eclipse -Declipse.pde install

1. Import the projects into Eclipse:

        File->Import->Existing Projects into Workspace
   
1. Run the `eclipse-plugin` project:

        Run As->Eclipse Application

1. Open the view:

        Window->Show View->Other->Test Category->Test View

Project Information
-------------------
* `eclipse-plugin`

    This project was generated using the `Plug-in with a view` eclipse template.
    It has been mavenized and modified to introduce some trivial dependencies.
    
* `eclipse-plugin-utils`

    Used by `eclipse-plugin` to demonstrate a dependency on another project in the same workspace.

Notes
-----
1. Maven vs. eclipse resource convention

    Maven conventionally wants resources in `src/main/resources` while eclipse wants all of its resources in the root.
    The solution was to place resources in the root and [include them](http://maven.apache.org/pom.html#Resources) using Maven
    (see [eclipse-plugin/pom.xml](https://github.com/dwickern/maven-eclipse-rcp/blob/master/eclipse-plugin/pom.xml)).
    
1. Eclipse Maven repository

    The latest maven repository in central dates back to eclipse version 3.3.
    The [m4e](http://wiki.eclipse.org/Maven_Tools_4_Eclipse) tool can be used to generate maven repositories
    from the latest eclipse, but for the sake of simplicity I am using version 3.3.

Resources
---------
Apache Felix `maven-bundle-plugin` article on eclipse integration:
* [Eclipse/PDE Integration](http://felix.apache.org/site/apache-felix-maven-bundle-plugin-bnd.html#ApacheFelixMavenBundlePlugin%28BND%29-Eclipse%2FPDEintegration)

Apache UIMA uses `maven-bundle-plugin`:
* [Source repositories](http://uima.apache.org/svn.html)
* [Building Eclipse Plugins with maven-bundle-plugin and friends](https://cwiki.apache.org/UIMA/building-eclipse-plugins-with-maven-bundle-plugin-and-friends.html])
