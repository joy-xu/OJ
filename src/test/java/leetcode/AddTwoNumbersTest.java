package leetcode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by xuliang.sxl on 2015/11/25.
 */
public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
        node11.next = node12;
        node12.next = node13;
        node21.next = node22;
        node22.next = node23;
        ListNode resultNode = atn.addTwoNumbers(node11, node21);
        assertThat(resultNode.val, is(7));
        assertThat(resultNode.next.val, is(0));
        assertThat(resultNode.next.next.val, is(8));

    }
}
