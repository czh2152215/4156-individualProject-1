 # 4156 Individual Project 1 

Zihao Cui zc2715

Because I had already fixed the bugs in Course.java before I ran PMD, the results from running PMD will be missing some of the results from Course.java.
## bug finder: PMD

## bug finder commands: pmd check -d D:\GitHub\4156-individualProject-1\IndividualProject -R rulesets/java/quickstart.xml -f text

## bug finder result:
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\Course.java:70:       MissingOverride:        The method 'toString()' is missing an @Override annotation.
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\Department.java:24:   LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\Department.java:55:   LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\Department.java:103:  MissingOverride:        The method 'toString()' is missing an @Override annotation.
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\Department.java:116:  LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\Department.java:117:  UnusedPrivateField:     Avoid unused private fields such as 'departmentChair'.
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\IndividualProjectApplication.java:38: LiteralsFirstInComparisons:     Position literals first in String comparisons
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\IndividualProjectApplication.java:83: LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\IndividualProjectApplication.java:93: LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\MyFileDatabase.java:35:       LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\MyFileDatabase.java:44:       LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\MyFileDatabase.java:54:       ReturnEmptyCollectionRatherThanNull:    Return an empty collection rather than null.
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\MyFileDatabase.java:76:       LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\MyFileDatabase.java:100:      LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:40:      UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:42:      LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:45:      UseLocaleWithCaseConversions:   When doing a String.toLowerCase()/toUpperCase() call, use a Locale
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:48:      UseLocaleWithCaseConversions:   When doing a String.toLowerCase()/toUpperCase() call, use a Locale
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:72:      UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:73:      UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:77:      LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:79:      LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:110:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:111:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:117:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:119:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:144:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:148:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:170:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:174:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:199:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:200:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:206:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:208:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:237:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:238:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:244:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:246:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:275:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:276:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:282:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:284:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:287:     UnusedLocalVariable:    Avoid unused local variables such as 'requestedCourse'.
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:308:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:312:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:335:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:339:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:364:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:365:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:371:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:373:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:404:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:405:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:406:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:412:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:414:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:441:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:442:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:443:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:449:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:451:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:479:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:480:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:481:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:487:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:489:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:516:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:517:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:518:     UnnecessaryAnnotationValueElement:      Avoid the use of value in annotations when its the only element
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:524:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
D:\GitHub\4156-individualProject-1\IndividualProject\src\main\java\dev\coms4156\project\individualproject\RouteController.java:526:     LooseCoupling:  Avoid using implementation types like 'HashMap'; use the interface instead
