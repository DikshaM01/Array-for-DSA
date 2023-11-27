# Array-for-DSA
1. Array contains alike(similar) type of data types.
2. int arr=new int[n] in java
3. Array are stored in contiguous memory allocation. for example if there are 5 elements in the array then if first element is in x then other elements will be in x+1,x+2,x+3,x+4,x+5....
4. we can access the array be indexing ..for example arr=[1,2,3]-> arr[0]=1
5. we can traverse through the array using loop.
BRUTE->BETTER->OPTIMAL



First question- Largest element in array
Brute force
->sort the given number and index of last element
 Arrays.sort(arr)
 print(arr[n-1]) -> time complexity ->O(nlogn)
                 -> space complexity -> O(1)

Optimal 
->assume that first element is largest 
->compare with all the remaining array and if greater element is there from the assume element then print it 
time complexity O(n)

Second Question- Second largest element without sorting
Brute-> sort  and traverse from back (duplicates may be there) 
       for(int i=n-2;i>=0;i--) //as i=n-1 is largest and our aim is to find second largest
{
if(arr[i]!=largest)
{
second=arr[i];
break;
}}-> worst case 0(n)
T.C -> N log n
Better solution
->find the first element
traverse from first element and initialize the secondlargest with -1 or 0 and compare with the elements of array and also compare if it is equal to largest element4
time complexity-> 0(2n)
Optimal
simultaneously compare largest and second largest
int largest=a[0]
int slargest=-1;
for(int i=0;i<n;i++)
{
if(a[i]>largest)
slargest=largest;
largest=a[i];}
else if(a[i]<largest && a[i]>slargest){
slargest=a[i];
}}
Time complexity-> 0(n)

third question->check if the array is sorted
for(int i=0;i<n-1;i++)
{
if(arr[i]<=arr[i+1])
{
return true;
else
return false;
}}
time complexity )(n)

fourth question-> remove duplicates from the sorted array
brute force
use hashset
time complexity nlogn+n
space->0(n)
2 pointer approach
