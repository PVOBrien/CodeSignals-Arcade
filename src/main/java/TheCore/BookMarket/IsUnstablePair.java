package TheCore.BookMarket;

public class IsUnstablePair { // https://app.codesignal.com/arcade/code-arcade/book-market/Ky2mjgmxnWLi6KNPp/solutions?solutionId=2wFZN3nZ7tgir2gfn

    boolean solution(String filename1, String filename2) {
        System.out.println("Just comparing: " + filename1.compareTo(filename2));
        System.out.println("Comparing lowercased: " + (filename1.toLowerCase()).compareTo(filename2.toLowerCase()));
        System.out.println("Comparison multiplied: " + filename1.compareTo(filename2) * (filename1.toLowerCase()).compareTo(filename2.toLowerCase()));
        return (filename1.compareTo(filename2) * ((filename1.toLowerCase()).compareTo(filename2.toLowerCase())) < 0);
    }
}

//        int loopLength = Math.min(fn1.length(), fn2.length());
//
//        for (int i = 0; i < loopLength; i++) {
//            char fn1Char = fn1.charAt(i);
//            char fn2Char = fn2.charAt(i);
//            if (fn1.charAt(i) != fn2.charAt(i)) {
//                System.out.println(fn1.codePointAt(i));
//                System.out.println(fn2.codePointAt(i));
//                return (!(Character.isLowerCase(fn1Char) && Character.isLowerCase(fn2Char)) ||
//                        !(Character.isUpperCase(fn1Char) && Character.isUpperCase(fn2Char)));
//                    return fn1.charAt(i) > fn2.charAt(i);

//                    {
//                    return true;
//            }
//            if (fn1Char == fn2Char && fn1.charAt(i) < fn2.charAt(i)) return true;
//            }
//        }
//        return true;
//    }