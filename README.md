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
        <td><a href="https://vimeo.com/680161485/e181cb3ae4">Video Discussion</a> of my code versus the better submitted answer on Code Signal.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ShapeArea.java">7</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-2/2mxbGwLzvkTCKAJMG">Almost Increasing Sequence</a></td>
        <td><a href="https://vimeo.com/680173184/1b7ca06cde">Video Discussion</a> of my code versus the better submitted answer on Code Signal.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ShapeArea.java">8</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-2/xskq4ZxLyqQMCLshr">Matrix Elements Sum</a></td>
        <td><a href="https://vimeo.com/680179823/7565d2bbe8">Video Discussion</a> of my code versus the better submitted answer on Code Signal.</td>
    </tr>
    <tr>
        <td colspan="3" style="text-align:center; font-size:2em;"><b>Smooth Sailing</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AllLongestStrings.java">9</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL">All Longest Strings</a></td>
        <td>This one was a fun one. So it's O(N), going through once to find the greatest length string, then for the second go round it collects them via a stream into a new String array, filtering off the string's length then adding it to the array. There's also the mention of .toArray(String[]::new, and the first instance of the enhanced for loop. The enhanced for loop is less verbose, at the cost of no "i" to refer to, so there is a drawback if you need an "i".</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/CommonCharacterCount.java">10</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-3/JKKuHJknZNj4YGL32">Common Character Count</a></td>
        <td>My code is not the leanest, but I used individual HashMaps to track how many letters were in each String, then iterated through the first HashMap using the Map.entry<> entry : HashMap().entrySet, checking against the second Hashmap, and if there's a match, using Math.min() to tick up the final count. The other examples with their tighter code, created an int[] because char are interpreted as int. They subtract the value of char 'a' so the alphabet starts at 0, otherwise the english alphabet starts at 97.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/IsLucky.java">11</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ">Is Lucky</a></td>
        <td>A fun bit of work splitting the string into half, then adding them up, so there is plenty use of parsing ints and putting them to strings. Other examples got there faster by using the char values and checking that at the end the difference was 0, ie they were equal when all's said and done. Nice.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/SortByHeight.java">12</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM">Sort By Height</a></td>
        <td>Proud of this one; the highest rated answer to this is a brute force method. I took the tactic of gathering up the people, sorting them ascending, then redistributing them back between "the trees".</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ReverseInParentheses.java">13</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-3/9DgaPsE2a7M6M2Hu6">Reverse In Parentheses</a></td>
        <td>This one caught me up in that it wasn't always looking for the first and last matching parentheses and that there would be nested parentheses. So I used a Stack marking where the latest '(' was, then matching it with the next ')'. I do have an escape case if there is only "()" because they made that a thing which I feel is bad form because that's an only edge case, or if it's not, then they don't test for anything besides the happiest case, so definitely on them for all the downvotes on this test.</td>
    </tr>
    <tr>
        <td colspan="3" style="text-align:center; font-size:2em;"><b>Exploring The Waters</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AlternatingSums.java">14</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-4/cC5QuL9fqvZjXJsW9">Alternating Sums</a></td>
        <td><a href="https://vimeo.com/680235402/4ab4a0f461">Discussion</a> of a much more elegant solution code than mine.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AddBorder.java">15</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-4/ZCD7NQnED724bJtjN">Add Border</a></td>
        <td>Nothing fancy here, just make a border. StringBuilder() makes an appearance. Could have used String.repeat() to make the top and bottom borders. Next time improvement.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AreSimilar.java">16</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-4/xYXfzQmnhBvEKJwXP">Are Similar</a></td>
        <td>This one had a poor description against its examples; it could seem that you can only swap two neighboring numbers. Not the case. The numbers could be swapped anywhere in the array. The examples only showed the happiest happy case. So protrip, if you think it's going to take more than 5 minutes to get a first run algorithm in place check the tests to see if your algorithm should/could hold up.<br>My code works just fine seeing as it literally swaps the numbers. Not the fastest, it is brute force, but works. The most elegant answer on the leaderboards has it such that whenever the two ints match, a hit count increments, but then the special sauce is such that the algorithm has two variables that multiplies 1 times the mismatch for that mismatch. Then, if those two variables aren't equal at the end, then there were different ints in those indexes. I have a feeling there are edge cases that might trip this up, but the test cases don't bring any of those out. So it's much sharper code than mine albeit perhaps has edge cases it doesn't (can't?) account for.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ArrayChange.java">17</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-4/xvkRbxYkdHdHNCKjg">ArrayChange</a></td>
        <td>Wasn't my favorite, but not certain why it has double the down votes as up (as of 2022-02-21). There are numerous places for "off-by-one" errors because you have to be exclusive in some places and inclusive in others. But... I think I followed my advice and checked the test cases to get a better idea what they wanted, because the description is vague at best. So again, read <i>everything</i> they give you before you start if you have any doubts.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/PalindromeRearranging.java">18</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-4/Xfeo7r9SBSpo3Wico">Palindrome Rearranging</a></td>
        <td>The palindrome. This is a starter palindrome, but if you haven't hit a couple, you might think you have to build one or something. No, this is simply checking that each character has a pair with one exception allowed (that char would be in the middle).</td>
    </tr>
    <tr>
        <td colspan="3" style="text-align:center; font-size:2em;"><b>Island of Knowledge</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AreEquallyStrong.java">19</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-5/g6dc9KJyxmFjB98dL">Are Equally Strong</a></td>
        <td>People hated this one. Not certain why. You're checking for two truths, one way or swapped. I used a stack just to keep it straightforward, it's mostly about seeing if you can keep your &&s and ||s straight.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ArrayMaximalAdjacentDifference.java">20</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-5/EEJxjQ7oo7C5wAGjE">Array Maximal Adjacent Difference</a></td>
        <td>Fun one, involving Math.abs() and Math.max()</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/IsIPv4Address.java">21</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-5/veW5xJednTy4qcjso">Is IPv4 Address</a></td>
        <td>Say hello to regex. Hi!</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AvoidObstacles.java">22</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-5/XC9Q2DhRRKQrfLhb5">Avoid Obstacles</a></td>
        <td>I went the wrong way on this one. It asked for the lowest possible jump. For whatever reason my mind went to: lets start at the highest possible option and work down! It's as inefficient a happy path can get! :facepalm: Anyway, it's my code. The correct way would be to start at the lowest point, and at the first possible "jump", break. End of story. My code rolls through EVERY SINGLE AVAILABLE OPTION. The smart one finds the first answer (which is the correct one) and calls it a day. Idk what I was thinking.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/BoxBlur.java">23</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-5/5xPitc3yT3dqS7XkP">Box Blur</a></td>
        <td>Another fun one, needing to dial in targeting what ints to start and end with in your for loop. That and I was incorrectly casting the floats to ints too soon, making it problematically lossy. Protip: cast to int at the last possible instance, or at least be aware that casting it sooner than later will be a reason for different results</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/Minesweeper.java">24</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-5/ZMR5n7vJbexnLrgaM">Minesweeper</a></td>
        <td>It's a minesweeper board builder. For Java, I get the feeling that Minesweeper is a tough nut. My code isn't the concise, but I feel it's very legible, walking through the edge cases (literally, the edges), then getting to the meat of it, and it's correct. It's nothing fancy, just straightforward checking and edge cases.</td>
    </tr>
    <tr>
        <td colspan="3" style="text-align:center; font-size:2em;"><b>Rains of Reason</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ArrayReplace.java">25</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-6/mCkmbxdMsMTjBc3Bm">ArrayReplace</a></td>
        <td>I got to straight return an Arrays.stream() to a map, and that was that. Felt great!</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/EvenDigitsOnly.java">26</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-6/6cmcmszJQr6GQzRwW">Even Digits Only</a></td>
        <td>Another straightforward one, check that an integer's digits are all even. Lots of ways to solve this - regex, checking the char, modulo... all of them work, all of them are just a couple lines.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/VariableName.java">27</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-6/6Wv4WsrsMJ8Y2Fwno">Variable Name</a></td>
        <td>Regex! Okay, this one got me for a few more moments than I'd like to admit, for whatever reason the "_" threw me. Otherwise: regex! dsl!</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AlphabeticShift.java">28</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-6/PWLT8GBrv9xXy4Dui">Alphabetic Shift</a></td>
        <td>Alphabet shift. "a" = "b", b to c, etc. The only more elegant solution was to use the modulo operator + 'a' to find the next value, seeing as the module would find the remainder 0-25, and then it "adds" 'a' (because it's a char, it is read/interpreted as an int), and voila, you have shifted the character by one.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ChessBoardCellColor.java">29</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-6/t97bpjfrMDZH8GJhi">Chess Board Cell Color</a></td>
        <td>I was proud of this one, figuring out that being only two colors to check against = modulo can do it, just add the row value as well, and then you check if the other cell is correctly shifted to be the same color.</td>
    </tr>
    <tr>
        <td colspan="3" style="text-align:center; font-size:2em;"><b>Through The Fog</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/CircleOfNumbers.java">30</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-7/vExYvcGnFsEYSt8nQ">Circle of Numbers</a></td>
        <td>A fun bit of module work, with an off-by-one gotcha (two, in fact!) because 0 is a value on the circle.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/DepositProfit.java">31</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-7/8PxjMSncp9ApA4DAb">Deposit Profit</a></td>
        <td>This is a math problem, plan and simple. I'm not keen on math; I do the simple math for the interest, add it to the principal, increment counter, rinse and repeat. But if you know how to use log(), then it's just applying that and it will provide the answer straight away.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/AbsoluteValuesSumMinimization.java">32</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-7/ZFnQkq9RmMiyE6qtq">Absolute Values Sum Minimization</a></td>
        <td>This one has some mathematical principle in play that I see at work but can't put my finger on it. It's key that it comes <i>presorted</i>, and with that done, it's the int that is in the middle that will always be the closest when calculating its difference against everything else.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/StringsRearrangement.java">33</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-7/ZFnQkq9RmMiyE6qtq">Strings Rearrangement</a></td>
        <td>This was about finding a <a href="https://en.wikipedia.org/wiki/Hamiltonian_path_problem">"Hamiltonian Path"</a>. And it seems that a Hamiltonian Path can only be brute forced. So... besides recursion, there wasn't anything interesting in this challenge, and I admit I didn't ace this one, I got to 242/300 on my own before I called it quits and studied up on the others and thus learning I was trying to find something special to solve it. Nope. Answer is brute force. Did not like, down voted. This one was both significantly tougher, and more obtuse than all others.</td>
    </tr>
</table>