# ZeroMatrix
Exercise related with Arrays and Strings.

## Exercise Challenge
Write an algorithm such that if an element is an MxN matrix is 0, its entire row and column are set to 0.

### Solution
Basically, I created two boolean arrays that will keep track of which columns and rows have to be nullified. 
Then I iterate through the matrix and every time I see a zero, I set to true the column and row of this element in the corresponding arrays. 
That way, I have two arrays that tell me which columns and rows I have to set to zero. 
I do that by iterating the matrix again and every time I'm in an element whose column or row are have to be 0, I set that element to 0. 
This takes O(NxM) runtime, which is the BCR, so it can not be better. 
Although, the space complexity can be better, because it's O(N+M).