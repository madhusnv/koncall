package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class kff implements Externalizable {

    /* renamed from: c */
    public static final C14824a f32148c = new C14824a(null);

    /* renamed from: a */
    public Collection f32149a;

    /* renamed from: b */
    public final int f32150b;

    /* renamed from: o.kff$a */
    public static final class C14824a {
        public C14824a() {
        }

        public /* synthetic */ C14824a(id5 id5Var) {
            this();
        }
    }

    public kff(Collection collection, int i) {
        sq8.m48649h(collection, "collection");
        this.f32149a = collection;
        this.f32150b = i;
    }

    private final Object readResolve() {
        return this.f32149a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        Set setM18959a;
        sq8.m48649h(objectInput, "input");
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + '.');
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + '.');
        }
        int i3 = 0;
        if (i == 0) {
            List listM18962d = bh3.m18962d(i2);
            while (i3 < i2) {
                listM18962d.add(objectInput.readObject());
                i3++;
            }
            setM18959a = bh3.m18959a(listM18962d);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
            }
            Set setM39136c = mif.m39136c(i2);
            while (i3 < i2) {
                setM39136c.add(objectInput.readObject());
                i3++;
            }
            setM18959a = mif.m39134a(setM39136c);
        }
        this.f32149a = setM18959a;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        sq8.m48649h(objectOutput, "output");
        objectOutput.writeByte(this.f32150b);
        objectOutput.writeInt(this.f32149a.size());
        Iterator it = this.f32149a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
