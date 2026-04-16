class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        vector<int> ans;
        unordered_set<int> set;
        int n = grid.size() , a , b, expSum = 0 , actSum = 0;

        for(int i =0;i<n; i++){
            for(int j =0;j<n;j++){
                actSum +=grid[i][j];

                if(set.find(grid[i][j]) != set.end()){
                    a = grid[i][j];
                    ans.push_back(a);
                }

                set.insert(grid[i][j]);
            }
        }

        expSum = ((n*n)*(n*n+1))/2;
        b = expSum +a - actSum;
        ans.push_back(b);

        return ans;
    }
};