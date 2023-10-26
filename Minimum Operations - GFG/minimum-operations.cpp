//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
  public:
    int minOperation(int n)
    {
        //code here.
          int cnt=0;
       while(n!=0){
           if(n%2==0 || n==1){
               cnt+=1;
               n=n/2;
           }
           else if(n%2!=0 && n!=1){
               cnt+=2;
               n=n/2;
           }
       }
       return cnt;
    }
};

//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	    {
	        int n;
	        cin>>n;
	        Solution ob;
	        cout<<ob.minOperation(n)<<endl;
	    }
}
// } Driver Code Ends