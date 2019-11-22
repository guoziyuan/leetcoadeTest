//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表



//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //创建一个头结点
        ListNode headNode = new ListNode(-1);
        //记录头结点，方便最后返回
        ListNode preNode = headNode;
        //通过循环，依次把两个链表的元素放入headNode代表的新链表
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                headNode.next = l1;
                l1 = l1.next;
            } else {
                headNode.next = l2;
                l2 = l2.next;
            }
            headNode = headNode.next;
        }
        // 把l1或者l2剩余的元素放在headNode链表中
        headNode.next = l1 == null ? l2 : l1;
        //preNode的next记录的链表的头指针位置
        return preNode.next;
    }
}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
