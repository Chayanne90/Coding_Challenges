package data_structure;

import data_structure.stack.Stack;

public class app {
    public static void main(String[] args) {

        Stack st = new Stack(5);

        st.push(155);
        st.push(65);
        st.push(1);
        st.push(-2);

        System.out.println(st.getMin());






    }
}
