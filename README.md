# ArrayList
Question 1:

Write a method removeShorterOfTwo that takes an ArrayList of Strings as a parameter and that removes from each successive pair of values the shorter 
string in the pair. For example, suppose that an ArrayList called list contains the following values: {"four", "score", "and", "seven", "years", "ago"} 
In the first pair, "four" and "score", the shorter string is "four". In the second pair, "and" and "seven", the shorter string is "and". In the third pair,
"years" and "ago", the shorter string is "ago". Therefore, the call: removeShorterOfTwo(list); should remove these shorter strings, leaving the list
as follows: "score", "seven", "years". If there is a tie (both strings have the same length), your method should remove the first string in the pair. 
If there is an odd number of strings in the list, the final value should be kept in the list.

 

Questions 2:

Write a method duplicate that takes an ArrayList of Strings and an integer k as parameters and that replaces every string with k copies of that string. 
For example, if the list stores the values ["how", "are", "you?"] before the method is called and k is 4, it should store the values 
["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?", "you?"] after the method finishes executing. If k is 0 or negative,
the list should be empty after the call.
