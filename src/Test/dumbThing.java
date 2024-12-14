package Test;

import java.math.BigInteger;

import static java.io.IO.println;

class dumbThing {
    String numString(String num1, String num2) {
        return new BigInteger(num1).add(new BigInteger(num2)).toString();
    }

    void main(){
        dumbThing obj = new dumbThing();
        println(obj.numString("10000000000000000000000000000000000000000000000000000000000000", "81323134332106760984098756293400000009750002340002310007410000"));
    }
}
