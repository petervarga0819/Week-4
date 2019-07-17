package Sum;

import java.util.List;

class sum {

    public int sum (List<Integer> listOfIntegers){
        int sumOfElements = 0;
        for (int i = 0; i <= listOfIntegers.size() - 1; i++) {
            sumOfElements += listOfIntegers.get(i);
        }
        return sumOfElements;
    }
}