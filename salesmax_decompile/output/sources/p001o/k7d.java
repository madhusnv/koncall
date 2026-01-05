package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class k7d implements Externalizable {

    /* renamed from: a */
    public List f31579a = new ArrayList();

    /* renamed from: a */
    public int m35113a() {
        return this.f31579a.size();
    }

    /* renamed from: b */
    public List m35114b() {
        return this.f31579a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            i7d i7dVar = new i7d();
            i7dVar.readExternal(objectInput);
            this.f31579a.add(i7dVar);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int iM35113a = m35113a();
        objectOutput.writeInt(iM35113a);
        for (int i = 0; i < iM35113a; i++) {
            ((i7d) this.f31579a.get(i)).writeExternal(objectOutput);
        }
    }
}
