package example;

import java.io.Serializable;

public class Chat implements Serializable {
    transient String currenID;
    String userName;
}
