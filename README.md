# DSA_Repo
DSA coding questions asked in MAANG Companies interview.

sliding window concept
-----------------------
This technique is used when we need to find subarrays or substrings according to a given set of conditions.

Let’s take an example to understand this properly, say we have an array of size N and also an integer K.

Now, we have to calculate the maximum sum of a subarray having size exactly K. Now how should we approach this problem?

Take one K size subarray from 0 to K-1 index and calculate its sum now shift our range one by one along with the iterations and update the result, 

like in next iteration increase the left and right pointer and update the previous sum. 
