//optimal
int arr[]={1,2,3};
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
    if(max<arr[i])
    {
        max=arr[i];
    }
}
System.out.println(max);