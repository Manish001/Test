/**
 @author chauhan.manish
 * @Date   19-Nov-2016
 * @Package Name iONCoreJava
 * @Project Testcoding
 */
package iONCoreJava;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *@author chauhan.manish
 * @FileName A.java
 * @Time 1:29:39 PM
 */
class  A implements Serializable{


    private B b ;
    protected  byte doStuff( byte byteValue) {
           return (byte) (byteValue * 2 );
    }

    public static void main(String[] args) throws Exception{
           A a = new A();
           a.setB( new B() );
           ObjectOutputStream os = new ObjectOutputStream(new ByteArrayOutputStream(5000));
           os.writeObject( a );
    }

    public B getB() {
           return b;
    }

    public void setB(B b) {
           this.b = b;
    }
}

class B {

    protected  byte doStuff( byte byteValue) {
        return (byte) (byteValue * 3 );
    }
}