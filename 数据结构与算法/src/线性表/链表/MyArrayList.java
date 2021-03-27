package 线性表.链表;

/**
 * MyArrayList:
 *
 * @author XvYanPeng
 * @date 2019/8/24 14:50
 */
public class MyArrayList {
    /**
     * 内部节点类
     */
    public class Node {
        Integer data;
        Node nextNode;

        public Node(Integer data) {
            this.data = data;
        }
    }

    Integer headData = null;
    Node nextNode = null;
    int myArrayListLength = 0;

    /**
     * @return void
     * @description 在头部插入元素
     * @params [data]
     * @date 2019/8/24
     */
    public void insertNodeAtFront(int data) {
        Node tempNode = new Node(data);
        tempNode.nextNode = this.nextNode;
        this.nextNode = tempNode;
        myArrayListLength++;
    }

    public int getMyArrayListLength() {
        return myArrayListLength;
    }

    /**
     * @return void
     * @description 在链表尾部插入元素
     * @params [data]
     * @date 2019/8/25
     */
    public void insertNodeAtRear(int data) {
        if (myArrayListLength == 0) {
            insertNodeAtFront(data);
        } else {
            Node tempNode = new Node(data);
            Node tempHref = this.nextNode;
            for (int i = 0; i < myArrayListLength - 1; i++) {
                tempHref = tempHref.nextNode;
            }
            tempHref.nextNode = tempNode;
            myArrayListLength++;
        }

    }

    /**
     * @return void
     * @description 在指定结点后插入结点
     * @params [location]
     * @date 2019/8/25
     */
    public void insertNodeAtCustomLocation(int location, int data) {
        if (location > myArrayListLength || location < 0) {
            System.out.println("请输入将要插入元素的正确位置");
        } else {
            if (location == 0) {
                this.insertNodeAtFront(data);
            } else {
                if (location == myArrayListLength) {
                    this.insertNodeAtRear(data);
                } else {
                    Node newNode = new Node(data);
                    newNode.nextNode = this.nextNode;
                    for (int i = 0; i < location; i++) {
                        newNode.nextNode = newNode.nextNode.nextNode;
                    }
                    Node tempNode = this.nextNode;
                    for (int i = 0; i < location - 1; i++) {
                        tempNode = tempNode.nextNode;
                    }
                    tempNode.nextNode = newNode;
                    myArrayListLength++;
                }
            }
        }
    }

    /**
     * @return void
     * @description 删除尾部节点
     * @params []
     * @date 2019/8/25
     */
    public void deleteRearNode() {
        if (myArrayListLength == 0) {
            System.out.println("链表长度已为0，无法再进行删除");
        } else {
            if (myArrayListLength == 1) {
                this.nextNode = null;
                myArrayListLength--;
            } else {
                Node tempNode = this.nextNode;
                for (int i = 0; i < myArrayListLength - 2; i++) {
                    tempNode = tempNode.nextNode;
                }
                tempNode.nextNode = null;
                myArrayListLength--;
            }
        }
    }

    /**
     * @return void
     * @description 删除头部节点
     * @params []
     * @date 2019/8/25
     */
    public void deleteFrontNode() {
        if (myArrayListLength == 0) {
            System.out.println("链表长度已为0，无法再进行删除");
        } else {
            if (myArrayListLength == 1) {
                this.nextNode = null;
                myArrayListLength--;
            } else {
                Node tempNode = this.nextNode.nextNode;
                this.nextNode = tempNode;
                myArrayListLength--;
            }
        }
    }

    /**
     * @return void
     * @description 删除指定位置结点
     * @params [location]
     * @date 2019/8/25
     */
    public void deletNodeAtCustomLocation(int location) {
        if (location <= 0 || location > myArrayListLength) {
            System.out.println("请输入要删除结点的正确位置");
        } else {
            if (location == 1) {
                this.deleteFrontNode();
            } else {
                if (location == myArrayListLength) {
                    this.deleteRearNode();
                } else {
                    Node frontNode = this.nextNode;
                    for (int i = 0; i < location - 2; i++) {
                        frontNode = frontNode.nextNode;
                    }
                    Node tempNode = this.nextNode;
                    for (int i = 0; i < location; i++) {
                        tempNode = tempNode.nextNode;
                    }
                    frontNode.nextNode = tempNode;
                    myArrayListLength--;
                }
            }
        }
    }

    /**
     * @return boolean
     * @description 判断链表是否为空
     * @params []
     * @date 2019/8/25
     */
    public boolean isEmpty() {
        if (myArrayListLength == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Node tempNode = this.nextNode;
        for (int i = 0; i < myArrayListLength; i++) {
            stringBuffer.append(tempNode.data + "->");
            tempNode = tempNode.nextNode;
        }
        return stringBuffer.toString();
    }
}
