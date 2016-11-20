/**
 @author chauhan.manish
 * @Date   19-Nov-2016
 * @Package Name iONCoreJava
 * @Project Testcoding
 */
package iONCoreJava;

/**
 *@author chauhan.manish
 * @FileName SuperClass.java
 * @Time 1:02:21 PM
 */
class  SuperClass{
    protected  byte doStuff( byte byteValue) throws NumberFormatException{
     return (byte) (byteValue * 2 );

    }

    public static void main(String[] args) throws Exception{
           SuperClass s = new SubClass();
           System.out.println("Value Printed is "+ s.doStuff((byte) 2));
    }
}

class SubClass extends SuperClass{
    protected  byte doStuff( byte byteValue) throws Exception{
    return (byte) (byteValue * 3 );
    }
}