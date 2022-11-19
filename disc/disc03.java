// public class SLList {
//     Node sentinel;
//
//     public SLList() {
//         this.sentinel = new Node();
//     }
//
//     private static class Node {
//         Item item;
//         Node next;
//     }
//
//     private static class Item {
//         // Implementation not shown
//         @Override
//         public boolean equals(Object o) {
//
//         }
//
//         // For formality's sake: we'll talk about this later in 61B! Implementation not shown
//         @Override
//         public int hashCode() {
//
//         }
//     }
//
//     public int findFirst(Item item) {
//         return findFirstHelper(item, 0, sentinel.next);
//     }
//
//     private int findFirstHelper(Item item, int index, Node curr) {
//         if (curr.next == null && curr.item != item) {
//             return -1;
//         }
//         if (curr.item == item) {
//             return index;
//         } else {
//             return findFirstHelper(item, index + 1, curr.next);
//         }
//     }
// }