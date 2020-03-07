package com.company;

/*

1309 Everything that moves
1. Create a Movable interface with the speed method.
2. The speed method should return a value of type Double and should not accept anything as arguments.
3. Create and inherit the Flyable interface from the Movable interface.
4. Add the speed method to the Flyable interface.
5. The speed method should return a value of type Double and accept one parameter of type Flyable.

Requirements:
1. The Movable interface must be declared in the Solution class.
2. The Flyable interface must be declared in the Solution class.
3. The Flyable interface must inherit from the Movable interface.
4. In the Movable interface, the speed method must be declared without parameters and with the return type of Double.
5. In the Flyable interface, the speed method must be declared with one argument of type Flyable and with the return
type of Double.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    }
    interface Movable {
        Double speed();
    }

    interface Flyable extends Movable {
        Double speed(Flyable flyable);
    }
}
