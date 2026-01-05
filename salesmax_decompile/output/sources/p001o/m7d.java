package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class m7d implements Externalizable {

    /* renamed from: a */
    public boolean f34930a;

    /* renamed from: e */
    public boolean f34934e;

    /* renamed from: b */
    public String f34931b = "";

    /* renamed from: c */
    public List f34932c = new ArrayList();

    /* renamed from: d */
    public List f34933d = new ArrayList();

    /* renamed from: f */
    public String f34935f = "";

    /* renamed from: a */
    public String m38484a() {
        return this.f34931b;
    }

    /* renamed from: b */
    public int m38485b(int i) {
        return ((Integer) this.f34932c.get(i)).intValue();
    }

    /* renamed from: c */
    public int m38486c() {
        return this.f34932c.size();
    }

    /* renamed from: d */
    public List m38487d() {
        return this.f34932c;
    }

    /* renamed from: e */
    public int m38488e() {
        return this.f34933d.size();
    }

    /* renamed from: f */
    public List m38489f() {
        return this.f34933d;
    }

    /* renamed from: g */
    public m7d m38490g(String str) {
        this.f34934e = true;
        this.f34935f = str;
        return this;
    }

    /* renamed from: h */
    public m7d m38491h(String str) {
        this.f34930a = true;
        this.f34931b = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            m38491h(objectInput.readUTF());
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.f34932c.add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f34933d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            m38490g(objectInput.readUTF());
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f34930a);
        if (this.f34930a) {
            objectOutput.writeUTF(this.f34931b);
        }
        int iM38486c = m38486c();
        objectOutput.writeInt(iM38486c);
        for (int i = 0; i < iM38486c; i++) {
            objectOutput.writeInt(((Integer) this.f34932c.get(i)).intValue());
        }
        int iM38488e = m38488e();
        objectOutput.writeInt(iM38488e);
        for (int i2 = 0; i2 < iM38488e; i2++) {
            objectOutput.writeInt(((Integer) this.f34933d.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.f34934e);
        if (this.f34934e) {
            objectOutput.writeUTF(this.f34935f);
        }
    }
}
