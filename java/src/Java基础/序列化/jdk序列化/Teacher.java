package Java基础.序列化.jdk序列化;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Teacher:
 *
 * @Author XvYanpeng
 * @Date 2020/4/19 13:24
 */
public class Teacher implements Externalizable {
    private static final long serialVersionUID = -7904224325392869179L;
    //id仍然会被序列化
    transient int id;
    String name;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeChars(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.id = in.readInt();
        this.name = in.readLine();

    }
}
