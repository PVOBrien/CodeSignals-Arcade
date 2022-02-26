package Intro;

import java.util.ArrayList;
import java.util.List;

public class FileNaming {

    Object solution(String[] names) { // https://app.codesignal.com/arcade/intro/level-12/sqZ9qDTFHXBNrQeLC/solutions?solutionId=sNEzgMvQsmSm9XNFG
        List<String> result = new ArrayList<>();
        for( String s : names ){
            if(result.contains(s)){
                int i = 1;
                for(; result.contains(s+"("+i+")") ;i++){

                }
                s+="("+i+")";
            }
            result.add(s);
        }
        return result.toArray(String[]::new);
    }

}
