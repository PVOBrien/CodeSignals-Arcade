# Code Signal Arcade
## Intro

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
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-7/PTWhv2oWqd6p4AHB9">Strings Rearrangement</a></td>
        <td>This was about finding a <a href="https://en.wikipedia.org/wiki/Hamiltonian_path_problem">"Hamiltonian Path"</a>. And it seems that a Hamiltonian Path can only be brute forced. So... besides recursion, there wasn't anything interesting in this challenge, and I admit I didn't ace this one, I got to 242/300 on my own before I called it quits and studied up on the others and thus learning I was trying to find something special to solve it. Nope. Answer is brute force. Did not like, down voted. This one was both significantly tougher, and more obtuse than all others.</td>
    </tr>
    <tr>
        <td colspan="3" style="text-align:center; font-size:2em;"><b>Diving Deeper</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ExtractEachKth.java">34</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-8/3AgqcKrxbwFhd3Z3R">Extract Each Kth</a></td>
        <td>The matter of going through the array and in my case I took the ones that weren't being passed over into a new list, then returned the list as a new array. The more elegant solution was a Java lambda that streamed through the array but used filter to leave out the "extracted" then send it back.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/FirstDigit.java">35</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-8/rRGGbTtwZe2mA8Wov">First Digit</a></td>
        <td>Hello regex! Find the first digit (aka leftmost) and return it. I did feel it of notice that this was the first instance I felt chaining the whole regex Matcher-Pattern.compile(regex).matcher(input) together in the code refactor.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/DifferentSymbolsNaive.java">36</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-8/8N7p3MqzGQg5vFJfZ">Different Symbols Naive</a></td>
        <td>Find all the unique characters in a string. I tossed them into a hashset and returned the size. The better way is to stream the chars, put it through distinct and then return the count (being sure to cast it as an int). TIL you can stream a string by simply starting with .chars(). Nice!</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ArrayMaxConsecutiveSum.java">37</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-8/Rqvw3daffNE7sT7d5">Array Max Consecutive Sum</a></td>
        <td>Summing a range in an array.</td>
    </tr>
    <tr>
        <td colspan="3" style="text-align:center; font-size:2em;"><b>Dark Wilderness</b></td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/GrowingPlant.java">38</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-9/xHvruDnQCx7mYom3T">Growing Plant</a></td>
        <td>This was a good and fun one. A math problem to be sure - I did the slower step-by-step iterative approach. I need to learn to balance "getting to code" vs "<i>is</i> there a straightforward formula to do it via calculations"? A good one.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/KnapsackLight.java">39</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-9/r9azLYp2BDZPyzaG2">Knapsack Light</a></td>
        <td>This is an example of just code tedium, just a whole lot of if statements until you pass the test. Many disliked and downvoted it. I understand. It's more the takeaway to write good descriptions, and try to parse what is happening / will happen when you execute your code.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/LongestDigitsPrefix.java">40</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-9/AACpNbZANCkhHWNs3">Longest Digits Prefix</a></td>
        <td>Hello regex! Hello somewhat obscured description/problem domain. It asks for the longest digit <i>prefix</i>. Spoiler: there might not be a "prefix" by the definition that a prefix is the very very first thing to lead the string. Including white space. So yeah. I'm betting people put in the regex and then found that it needed to be at the front of the sentence. So they added ^, huffed a little, down voted (rightly) and moved on. I huffed, but no downvote.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/DigitDegree.java">41</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-9/hoLtYWbjdrD2PF6yo">Digit Degree</a></td>
        <td>I had fun creating a recursive solution, just slowing shaving off the numbers to distill it what it should be.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/BishopandPawn.java">42</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-9/6M57rMTFB9MeDeSWo">Bishop and Pawn</a></td>
        <td>Another fun one, after realizing/practicing that chars are ints, and since they just tick up and away anyhow you look at it, so long as everything adds up, it's in the Bishop's path.</td>
    </tr>
    <td colspan="3" style="text-align:center; font-size:2em;">Eruption of Light</td>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/IsBeautifulString.java">43</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-10/PHSQhLEw3K2CmhhXE">Is Beautiful String</a></td>
        <td>Other coders hated on this one. I'm not so sure why. Tally the char count, if x+1 is greater than x return false. I used a hashmap when I could've used an array so my code is verbose and probably uses significantly more space, but runs and tests fine.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/FindEmailDomain.java">44</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-10/TXFLopNcCNbJLQivP">Find Email Domain</a></td>
        <td>Find the @ symbol at the end, return what's ahead of it. Heck, Java has a "last index of" method on String that finds the last index position of that character, and then you can just substring to the end. I used a decrimenting for loop collecting each letter into a StringBuilder until breaking at the "@" symbol then reversing the collected letters. Works.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/BuildPalindrome.java">45</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-10/ppZ9zSufpjyzAsSEx">Build Palindrome</a></td>
        <td>My code is more verbose, but in line with the thinking of all the other answers: check if the string is a palindrome. If not, insert the next char into that "starting" end index until it is a palindrome.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ElectionsWinners.java">46</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-10/8RiRRM3yvbuAd3MNg">Elections Winners</a></td>
        <td>Seeing how many numbers can be higher than another number if given an additional sum. Nothing to write home about.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/IsMAC48Address.java">47</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-10/HJ2thsvjL25iCvvdm">Is MAC48 Address?</a></td>
        <td>It's regex. I found my regex solution <a href="https://stackoverflow.com/questions/4260467/what-is-a-regular-expression-for-a-mac-address">here</a>.</td>
    </tr>
    <tr>
    <td colspan="3" style="text-align:center; font-size:2em;">Rainbow of Clarity</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/IsDigit.java">48</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-11/Zr2XXEpkBPtYWqPJu">Is Digit?</a></td>
        <td>It's a one liner that reads exactly like the challenge title. Java has an isDigit() method for Characters. huzzah!</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/LineEncoding.java">49</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-11/o2uq6eTuvk7atGadR">Line Encoding</a></td>
        <td>Work through a string, if there's more than one "compress" it to the count+char. Least verbose way (at least, highest rated Java method) is regex checking for characters, one or more, then using those results to know the length of the group, the char, and a ternary to add the length as a character as needed. I just iterated through a for loop, which meant having a couple edge cases to code out. But, it runs!</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ChessKnight.java">50</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-11/pwRLrkrNpnsbgMndb">Chess Knight</a></td>
        <td>Math or subtraction of the edges. I intuited the math, but the edges route is appealing in its simplicity.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/DeleteDigit.java">51</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-11/vpfeqDwGZSzYNm2uX">Delete Digit</a></td>
        <td>A fun one. Pluck out a digit, evaluate if that number is the biggest number, move down the line. I'm looking at the <a href="https://app.codesignal.com/arcade/intro/level-11/vpfeqDwGZSzYNm2uX/solutions?solutionId=x5KwM2nEeqeEhaNKj">top Java solution</a> and it is pure math.</td>
    </tr>
    <tr>
    <td colspan="3" style="text-align:center; font-size:2em;">Land of Logic</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/LongestWord.java">52</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-12/s9qvXv4yTaWg8g4ma">Longest Word</a></td>
        <td>Hello regex! It's regex.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/ValidTime.java">53</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-12/ywMyCTspqGXPWRZx5">Valid Time</a></td>
        <td>Telling time. Oh the joys. It's relatively straightforward but there are the edge cases: 24:00 is not a thing which presents just a few quirks.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/SumUpNumbers.java">54</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-12/YqZwMJguZBY7Hz84T">Sum Up Numbers</a></td>
        <td>More regex fun! Then add the digits as you find them.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/DifferentSquares.java">55</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-12/fQpfgxiY6aGiGHLtv">Different Squares</a></td>
        <td>HashSet work, finding unique 2x2 squares in matrix. No edge cases in the tests at least; a nested for loop precludes any 1x1 squares sneaking in because the matrix has to have at least two indexes for it to iterate over. I did allow intelliJ to refactor my StringBuilder to a simple String and then concatenate with "+" since there's no additional manipulation of the resulting string, its final, and String is lighter than StringBuilder (I'm assuming, but I feel pretty good about the assumption). Will need to keep that in mind going forward.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/DigitsProduct.java">56</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-12/NJJhENpgheFRQbPRA">Digits Product</a></td>
        <td>Another challenge that was hated on. It's a mathematical brute force loop with a touch of string concatenation. It's boring, and what makes it worse, the description is <i>only just</i> a description. So yeah, just an annoying challenge, poorly presented.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/FileNaming.java">57</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-12/sqZ9qDTFHXBNrQeLC">File Naming</a></td>
        <td>This was a hard one. I eventually had to bow out and look up the answers, because it was spaghetti to me. I'll look at it closer, later.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/MessageFromBinaryCode.java">58</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-12/sCpwzJCyBy2tDSxKW">Message From Binary Code</a></td>
        <td>Using Integer.parseInt(value, 2) the 2 being the radix argument. Nice break in to binary.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/SpiralNumbers.java">59</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-12/uRWu6K8E7uLi3Qtvx">SpiralNumbers</a></td>
        <td>This was an interesting one. I dance around the answer for a long while, finally looking outside and realizing that my issue was not allowing the loops to <i>include the iterator value</i>. Usually it's not necessary, but in this case, it makes the difference. <b>Note:</b> I only added one test because testing for nested arrays is laborious, and they do pass.</td>
    </tr>
    <tr>
        <td style="text-align:center;"><a href="https://github.com/PVOBrien/CodeSignals-ArcadeIntro/blob/main/src/main/java/Intro/Sudoku.java">60</a></td>
        <td style="text-align:center;"><a href="https://app.codesignal.com/arcade/intro/level-12/tQgasP8b62JBeirMS">Sudoku</a></td>
        <td>This is a great challenge, the sudoku checker. I used hashset, and then check each row, column, and 3x3 segment and if each equal true, then it's a sudoku!</td>
    </tr>
</table>

## The Core

<table>
    <tr>
        <th>#</th>
        <th>Code Challenge <br> Name</th>
        <th>Notes</th>
    </tr>
<td colspan="3" style="text-align:center; font-size:2em;">The Core</td>
    <tr>
        <td>1</td>
        <td><a href="https://app.codesignal.com/arcade/code-arcade/intro-gates/wAGdN6FMPkx7WBq66">Add Two Digits</a></td>
    </tr>
</table>