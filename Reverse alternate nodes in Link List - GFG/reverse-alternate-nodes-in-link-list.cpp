//{ Driver Code Starts
#include<stdio.h>
#include<stdlib.h>
#include<iostream>
using namespace std;
/* A linked list node */


struct Node
{
    int data;
    struct Node *next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
    
};

struct Node *start = NULL;

/* Function to print nodes in a given linked list */
void printList(struct Node *node)
{
    while (node != NULL)
    {
        printf("%d ", node->data);
        node = node->next;
    }
    printf("\n");
    
}

void insert()
{
    int n,value;
    cin>>n;
    struct Node *temp;
    for(int i=0;i<n;i++)
    {
        cin>>value;
        if(i==0)
        {
            start = new Node(value);
            temp = start;
            continue;
        }
        else
        {
            temp->next = new Node(value);
            temp = temp->next;
        }
    }
}


// } Driver Code Ends
/*
  reverse alternate nodes and append at the end
  The input list will have at least one element  
  Node is defined as 
  struct Node
  {
      int data;
      struct Node *next;
    
      Node(int x){
        data = x;
        next = NULL;
      }
    
   };

*/
class Solution
{
    public:
    void rearrange(struct Node *head)
    {
        struct Node* head1=head;
        struct Node* head2=head->next;
        if(head==NULL || head->next==NULL || head->next->next==NULL)return;
        struct Node* temp=head2;
        while(temp->next!=NULL){
            head1->next = temp->next;
            head1 = head1->next;
            if(head1->next==NULL) break;
            temp->next = head1->next;
            temp = temp->next;
        }
        temp->next = head1->next = NULL;
        
        temp = head2;
        Node* prev=NULL;
        while(temp!=NULL){
            head2 = temp->next;
            temp->next = prev;
            prev = temp;
            temp = head2;
        }
        head1->next = prev;
        return;
        
         
    }
};



//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while (t--) {
        insert();
        Solution ob;
        ob.rearrange(start);
        printList(start);
    }
    return 0;
}

// } Driver Code Ends