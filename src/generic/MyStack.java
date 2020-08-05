package generic;

class GStack<T> {
    int top;
    int max = 0;
    Object[] stck;

    public GStack(int max) {
        top = 0;
        this.max = max;
        stck = new Object[max];          //stack의 max를 정함
    }

    // stack 추가
    public void push(T item) {
        if (top == max) {
            return;
        }
        stck[top] = item;
        top++;
    }

    // LIFO 마지막 원소, 즉 top이 가리키는 원소 반환
    public T pop() {
        if (top == 0) {                  //stack이 비어 있어서 null 반환
            return null;
        }
        top--;
        return (T) stck[top];           // T 타입으로 캐스팅
    }


    public GStack<T> reverse(GStack<T> stc) {
        GStack<T> newStc = new GStack<T>(max);

        int nowStcSize = stc.top;
        // System.out.println(stc.push());
        for (int i = 0; i < nowStcSize; i++) {
            newStc.push(stc.pop());
        }
        return newStc;
    }


}


public class MyStack {

    public static void main(String[] args) {


        /* String Generic Step */
        GStack<String> strGStack = new GStack<String>(10);
        strGStack.push("서울");
        strGStack.push("부산");
        strGStack.push("대전");

        int stcNowSize = strGStack.top;
        //System.out.println(strGStack.top);        //check now stack size

        for (int i = 0; i < stcNowSize; i++) {
            System.out.println(strGStack.pop());
        }

        /* Integer Generic step */
        GStack<Integer> intGStack = new GStack<Integer>(10);
        intGStack.push(1);
        intGStack.push(2);
        intGStack.push(3);

//        stcNowSize = intGStack.top;
//
//        for (int i = 0; i < stcNowSize; i++) {
//            System.out.println(intGStack.pop());
//        }


        /* reverse step */
        stcNowSize = intGStack.top;
        intGStack = intGStack.reverse(intGStack);

        for (int i = 0; i < stcNowSize; i++) {
            System.out.println(intGStack.pop());
        }

    }

}
