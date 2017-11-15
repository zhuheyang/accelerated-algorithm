/*
struct TreeNode {
  int val;
  struct TreeNode *left;
  struct TreeNode *right;
  TreeNode(int x) :
    val(x), left(NULL), right(NULL) {

    }
};
*/

class TreePrinter {
public:
  vector<vector<int>> printTree(TreeNode* root) {
    // write code here
      vector<vector<int> > result;
      if(root == NULL)return result;
      queue<TreeNode*>Q;
      Q.push(root);
      while (!Q.empty()) {
        int size = Q.size;
        vector<int> row;
        for(int i=0; i < size; i++) {
          TreeNode* cur = Q.front();
          Q.pop();
          row.push_back(cur->val);
          if (cur->left)Q.push(cur->left);
          if (cur->right)Q.push(cur->right);
        }
        result.push_back(row);
      }
    return result;
  }
};

// 题目要求:
// 设计一个算法层次打印这棵二叉树,给定二叉树的根节点root, 返回打印结果
// 结果按照每一层一个数组进行储存,所有数组的顺序按照层数从上往下,
// 且每一层的数组内元素按照从左往右排列,保证节点数小于等于500.