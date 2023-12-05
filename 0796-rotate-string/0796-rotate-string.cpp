class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s.length()!=goal.length()) return false;

        if((s+s).find(goal)!=string::npos) //finding if goal is a substring in s+s using string stl function
        return true;
        
        return false;
    }
};