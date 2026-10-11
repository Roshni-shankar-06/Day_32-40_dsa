class Solution {
 public:
  void deleteNode(ListNode* node) {
    node->val = node->next->val;
