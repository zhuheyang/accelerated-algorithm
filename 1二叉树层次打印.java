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
    vector<vector<int> >printTree(TreeNode* root) {
        int dep[550], head = 0, tail = 0;
        TreeNode *now, *q[550];
        q[tail++] = root; dep[root->val] = 0;
        while(head != tail) {
             now = q[head ++];
             if(now -> left) {
                 q[tail ++] = now -> left, dep[now -> left -> val] = dep[now -> val] + 1;
             }
             if(now -> right) {
                 q[tail ++] = now -> right, dep[now -> right -> val] = dep[now -> val] + 1;
             }
        }
        vecrot<vector<int> > ret;
        for(int j, i = 0;  i < tail; i = j) {
            vector<int> tmp;
            j = i;
            while(j < tail && dep[q[j] -> val] == dep[q[i] -> val]) {
                tmp.push_back(q[j] -> val);
                ++ j;
            }
            ret.push_back(temp);
        }
        return ret;
    }
};</int></vector<int></vector><int>


class TreePrinter2 {
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