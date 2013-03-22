Overview
========
This project is intended to be a collection of some of my common library functions

Opening in Eclipse
==================
If you use Eclipse, the gradle scripts are nice enough to create your eclipse project and classpath files.

First time only
---------------
If you have gradle installed, run:
```
gradle eclipse
```

If you do not have gradle installed, run the gradle wrapper:
```
./g eclipse
```

Now you can import the project into eclipse.


Updating classpath files
------------------------
If you update dependencies, pull the new libs into your classpath:
```
gradle eclipseClasspath
```
