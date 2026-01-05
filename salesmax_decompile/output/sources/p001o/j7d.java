package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class j7d implements Externalizable {

    /* renamed from: a */
    public List f29928a = new ArrayList();

    /* renamed from: a */
    public int m33379a() {
        return this.f29928a.size();
    }

    /* renamed from: b */
    public List m33380b() {
        return this.f29928a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            h7d h7dVar = new h7d();
            h7dVar.readExternal(objectInput);
            this.f29928a.add(h7dVar);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int iM33379a = m33379a();
        objectOutput.writeInt(iM33379a);
        for (int i = 0; i < iM33379a; i++) {
            ((h7d) this.f29928a.get(i)).writeExternal(objectOutput);
        }
    }
}
