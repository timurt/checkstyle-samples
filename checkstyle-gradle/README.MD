Checkstyle Gradle Example
===================

Sample project to demonstrate, how to use **Checkstyle** in **Gradle** project.

Read more at [Gradle Checkstyle Plugin](https://docs.gradle.org/current/userguide/checkstyle_plugin.html) page

----------
Technologies
-------------

- Gradle 4.2
- Checkstyle 8.8

----------
Usage
------------

Build gradle project
> $ gradle build

Use the following command to run checkstyle
> $ gradle clean check

Command will show violations in console and also
generate reports in XML and HTML formats. 

Reports are located inside _reports/checkstyle_ folder.

To open report 
> $ firefox reports/checkstyle/main.html


