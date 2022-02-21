# Code Signal Arcade
## Intro

<link rel="stylesheet" href="style.css" />

<table>
    <tr>
        <th>#</th>
        <th>Code Challenge <br> Name</th>
        <th>Notes</th>
    </tr>
    <tr>
        <td colspan = "3" style="text-align:center; font-size:2em"><b>The Journey Begins</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/Add.java">1</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-1/jwr339Kq6e3LQTsfa">Add</a></td>
        <td>Add two numbers together. A simple test passing arguments and the addition operator.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/CenturyFromYear.java">2</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN">CenturyFromYear</a></td>
        <td>Using Math.ceil() and the division operator</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/CheckPalindrome.java">3</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ">Check Palindrome</a></td>
        <td>First instance using String.split() which in fact uses regex, not a char/charsequence to find that specific grouping. Which means, it can use "" (an empty string) to turn any string into a <b>String</b> (as opposed to a CharSequence[]). <br/> Also the first time a for loop is used. While the initializer is standard to make it extra, the conditional is not the usual < length(), but since it's checking the back to front (or vice versa), it only needs to go halfway. Otherwise they'd just cross each other and check the values from the other side.</td>
    </tr>
    <tr>
        <td colspan = "3" style="text-align:center; font-size:2em"><b>Edge of the Ocean</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AdjacentElementsProduct.java">4</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m">Adjacent Elements Product</a></td>
        <td>A fun one. Iterate over an array of ints and find the greatest product of two adjacent ints. Using Integer.max(int a, int b) to evaluate the current highest against the current product makes for quick work, and looks cleaner than an if-else statement or ternary.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ShapeArea.java">5</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-2/yuGuHvcCaFCKk56rJ">Shape Area</a></td>
        <td>I'm not a mathematician, but I believe this is a factorial. My solution is not so clean as that, instead taking the long way round using a for loop. It gets to the same place, but I haven't progressed yet to see the pattern here. That's the truth atm, and I show the code I wrote and comfortably understand.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/MakeArrayConsecutiveTwo.java">6</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC">Make Array Consecutive 2</a></td>
        <td><a href="https://vimeo.com/680161485/e181cb3ae4">Video Walkthrough</a> of my code versus the better submitted answer on Code Signal.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ShapeArea.java">7</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-2/2mxbGwLzvkTCKAJMG">Almost Increasing Sequence</a></td>
        <td><a href="https://vimeo.com/680173184/1b7ca06cde">Video Walkthrough</a> of my code versus the better submitted answer on Code Signal.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ShapeArea.java">8</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-2/xskq4ZxLyqQMCLshr">Matrix Elements Sum</a></td>
        <td><a href="https://vimeo.com/680179823/7565d2bbe8">Video Walkthrough</a> of my code versus the better submitted answer on Code Signal.</td>
    </tr>
    <tr>
        <td colspan="3" style="text-align:center; font-size:2em;"><b>Smooth Sailing</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AllLongestStrings.java">8</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL">All Longest Strings</a></td>
        <td>This one was a fun one. So it's O(N), going through once to find the greatest length string, then for the second go round it collects them via a stream into a new String array, filtering off the string's length then adding it to the array. There's also the mention of .toArray(String[]::new, and the first instance of the enhance for loop. The enhanced for loop is less verbose, at the cost of no "i" to refer to, so there is a drawback if you need an "i".</td>
    </tr>
</table>