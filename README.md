<h1>Williams-Sonoma, Inc. Coding Challenge</h1>
<p>Author: Glenn Tolentino</p>
<p>Date: 03-27-2018</p>

<h2>Background</h2>
<p>Sometimes items cannot be shipped to certain zip codes, and the rules for these restrictions are stored as a series of ranges of 5 digit codes. For example if the ranges are:</p>
<p>[94133,94133] [94200,94299] [94600,94699]</p>
<p>Then the item can be shipped to zip code 94199, 94300, and 65532, but cannot be shipped to 94133, 94650, 94230, 94600, or 94299.</p>
<p>Any item might be restricted based on multiple sets of these ranges obtained from multiple sources.</p>

<h2>Problem</h2>
<p>Given a collection of 5-digit ZIP code ranges (each range includes both their upper and lower bounds), provide an algorithm that produces the minimum number of ranges required to represent the same restrictions as the input.</p>

<h2>Notes</h2>
<ul>
  <li>The ranges above are just examples, your implementation should work for any set of arbitrary ranges</li>
  <li>Ranges may be provided in arbitrary order</li>
  <li>Ranges may or may not overlap</li>
  <li>Your solution will be evaluated on the correctness and the approach taken, and adherence to coding standards and best practices</li>
</ul>
<h2>Examples</h2>
<p>If the input = [94133,94133] [94200,94299] [94600,94699]</p>
<p>Then the output should be = [94133,94133] [94200,94299] [94600,94699]</p>
<p>If the input = [94133,94133] [94200,94299] [94226,94399]</p>
<p>Then the output should be = [94133,94133] [94200,94399]</p>

<h2>Requirements</h2>
<p>In order to run the program you will need the following installed:</p>
<ul>
  <li>Java 8</li>
  <li>Maven 3</li>
</ul>

<h2>Running the Program</h2>
<p>To run the program from the command line type in the following in a terminal within the project's directory:</p>
<p><strong>mvn exec:java -Dexec.mainClass="com.glennt.wsi.codingchallenge.Main" -Dexec.args="[94133,94133] [94200,94299] [94226,94399]"</strong></p>
<p>The arguments are supplied to the -Dexec.args parameter as a string of zip code ranges of the following format: [#####,#####], separated by spaces.</p>
<p>If the zip code ranges are valid the reduced set of ranges will be printed to the console.</p>

<h2>Unit Tests</h2>
<p>Unit tests for all classes can be run from the command line by typing the following within the project's directory:</p>
<p><strong>mvn test</strong></p>


