package 线性表.顺序表;

/**
 * SequenceList:
 * 顺序表，元素之间必须链接，中间不能有空位
 *
 * @author XvYanPeng
 * @date 2019/8/29 21:00
 */
public class SequenceList {
    int[] array;
    int maxLength;
    int currentLength = 0;

    public SequenceList(int maxLength) {
        array = new int[maxLength];
        this.maxLength = maxLength;
    }

    //清空顺序表
    public void clear() {
        //变为0这步可以不要
        for (int element : array) {
            element = 0;
        }
        currentLength = 0;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("SequenceList :");
        for (int i = 0; i < currentLength; i++) {
            stringBuffer.append("-" + array[i]);
        }
        return stringBuffer.toString();
    }

    //按顺序插入
    public void insert(int element) {
        if (currentLength >= maxLength) {
            System.out.println("数组已满，无法插入");
        } else {
            array[currentLength] = element;
            currentLength++;
        }
    }

    //指定位置插入
    public void insertAt(int location, int element) {
        if (currentLength >= maxLength) {
            System.out.println("数组已满，无法插入");
        } else if (location > currentLength || location < 0) {
            System.out.println("您插入的位置不合法");
        } else {
            for (int i = maxLength - 1; i > location; i--) {
                array[i] = array[i - 1];
            }
            array[location] = element;
            currentLength++;
        }
    }

    //删除指定位置元素
    public void deleteAt(int location) {
        if (currentLength == 0) {
            System.out.println("数组为空，无法删除");
        } else if (location >= currentLength || location < 0) {
            System.out.println("输入的位置不合法");
        } else {
            for (int i = location; i < maxLength - 1; i++) {
                array[i] = array[i + 1];
            }
            currentLength--;
        }
    }

    //获取某个位置的元素
    public int get(int location) throws Exception {
        if (location >= currentLength || location < 0) {
            throw new Exception("输入的位置不合法");
        } else {
            return array[location];
        }
    }

    public static void main(String[] args) throws Exception {
        SequenceList sequenceList = new SequenceList(6);
        sequenceList.insert(2);
        sequenceList.insert(4);
        sequenceList.insert(5);
        System.out.println(sequenceList.get(2));
        System.out.println(sequenceList.toString());
    }
}
