package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* loaded from: classes6.dex */
public final class nff implements Externalizable {

    /* renamed from: b */
    public static final C15576a f36797b = new C15576a(null);

    /* renamed from: a */
    public Map f36798a;

    /* renamed from: o.nff$a */
    public static final class C15576a {
        public C15576a() {
        }

        public /* synthetic */ C15576a(id5 id5Var) {
            this();
        }
    }

    public nff(Map map) {
        sq8.m48649h(map, "map");
        this.f36798a = map;
    }

    private final Object readResolve() {
        return this.f36798a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        sq8.m48649h(objectInput, "input");
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + '.');
        }
        Map mapM31054d = hsa.m31054d(i);
        for (int i2 = 0; i2 < i; i2++) {
            mapM31054d.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f36798a = hsa.m31052b(mapM31054d);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        sq8.m48649h(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f36798a.size());
        for (Map.Entry entry : this.f36798a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
