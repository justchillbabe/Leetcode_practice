class Solution {
public:
    int maxArea(vector<int>& height) {
        int mw = 0, lp = 0, rp = height.size()-1;
        while(lp<rp){
            int w = rp - lp;
            int h = min(height[lp],height[rp]);
            int currWater = w*h;
            mw = max(mw,currWater);
            height[lp]<height[rp]?lp++:rp--;
        }
    return mw;    
    }
};