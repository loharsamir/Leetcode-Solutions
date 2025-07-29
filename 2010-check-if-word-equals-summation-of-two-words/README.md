<h2><a href="https://leetcode.com/problems/check-if-word-equals-summation-of-two-words">2010. Check if Word Equals Summation of Two Words</a></h2><h3>Easy</h3><hr><p>The <strong>letter value</strong> of a letter is its position in the alphabet <strong>starting from 0</strong> (i.e. <code>'a' -> 0</code>, <code>'b' -> 1</code>, <code>'c' -> 2</code>, etc.).</p>

<p>The <strong>numerical value</strong> of some string of lowercase English letters <code>s</code> is the <strong>concatenation</strong> of the <strong>letter values</strong> of each letter in <code>s</code>, which is then <strong>converted</strong> into an integer.</p>

<ul>
	<li>For example, if <code>s = "acb"</code>, we concatenate each letter's letter value, resulting in <code>"021"</code>. After converting it, we get <code>21</code>.</li>
</ul>

<p>You are given three strings <code>firstWord</code>, <code>secondWord</code>, and <code>targetWord</code>, each consisting of lowercase English letters <code>'a'</code> through <code>'j'</code> <strong>inclusive</strong>.</p>

<p>Return <code>true</code> <em>if the <strong>summation</strong> of the <strong>numerical values</strong> of </em><code>firstWord</code><em> and </em><code>secondWord</code><em> equals the <strong>numerical value</strong> of </em><code>targetWord</code><em>, or </em><code>false</code><em> otherwise.</em></p>

<p> </p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> firstWord = "acb", secondWord = "cba", targetWord = "cdb"
<strong>Output:</strong> true
<strong>Explanation:</strong>
The numerical value of firstWord is "acb" -> "021" -> 21.
The numerical value of secondWord is "cba" -> "210" -> 210.
The numerical value of targetWord is "cdb" -> "231" -> 231.
We return true because 21 + 210 == 231.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> firstWord = "aaa", secondWord = "a", targetWord = "aab"
<strong>Output:</strong> false
<strong>Explanation:</strong> 
The numerical value of firstWord is "aaa" -> "000" -> 0.
The numerical value of secondWord is "a" -> "0" -> 0.
The numerical value of targetWord is "aab" -> "001" -> 1.
We return false because 0 + 0 != 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> firstWord = "aaa", secondWord = "a", targetWord = "aaaa"
<strong>Output:</strong> true
<strong>Explanation:</strong> 
The numerical value of firstWord is "aaa" -> "000" -> 0.
The numerical value of secondWord is "a" -> "0" -> 0.
The numerical value of targetWord is "aaaa" -> "0000" -> 0.
We return true because 0 + 0 == 0.
</pre>

<p> </p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= firstWord.length, </code><code>secondWord.length, </code><code>targetWord.length <= 8</code></li>
	<li><code>firstWord</code>, <code>secondWord</code>, and <code>targetWord</code> consist of lowercase English letters from <code>'a'</code> to <code>'j'</code> <strong>inclusive</strong>.</li>
</ul>
