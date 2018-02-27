Checkstyle Maven Example
===================

Sample project to demonstrate, how to use **Checkstyle** in **Maven** project.

Read more at [Maven Checkstyle Plugin](https://maven.apache.org/plugins/maven-checkstyle-plugin/index.html
) page

----------
Technologies
-------------

- Maven 3.2.5
- Checkstyle 8.8

----------
Usage
------------

To run checkstyle and see violations in console, 
type the following command
> $ mvn clean verify

To generate report you should run the following command
> $ mvn site

Resulting report will be placed inside _target/site_ folder

To open report 
> $ firefox target/site/checkstyle.html


