package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class g7d implements Externalizable {

    /* renamed from: a */
    public boolean f24684a;

    /* renamed from: c */
    public boolean f24686c;

    /* renamed from: f */
    public boolean f24689f;

    /* renamed from: h */
    public boolean f24691h;

    /* renamed from: s */
    public boolean f24693s;

    /* renamed from: b */
    public String f24685b = "";

    /* renamed from: d */
    public String f24687d = "";

    /* renamed from: e */
    public List f24688e = new ArrayList();

    /* renamed from: g */
    public String f24690g = "";

    /* renamed from: q */
    public boolean f24692q = false;

    /* renamed from: x */
    public String f24694x = "";

    /* renamed from: a */
    public String m28142a() {
        return this.f24694x;
    }

    /* renamed from: b */
    public String m28143b() {
        return this.f24687d;
    }

    /* renamed from: c */
    public String m28144c(int i) {
        return (String) this.f24688e.get(i);
    }

    /* renamed from: d */
    public String m28145d() {
        return this.f24690g;
    }

    /* renamed from: e */
    public String m28146e() {
        return this.f24685b;
    }

    /* renamed from: f */
    public int m28147f() {
        return this.f24688e.size();
    }

    /* renamed from: g */
    public g7d m28148g(String str) {
        this.f24693s = true;
        this.f24694x = str;
        return this;
    }

    /* renamed from: h */
    public g7d m28149h(String str) {
        this.f24686c = true;
        this.f24687d = str;
        return this;
    }

    /* renamed from: i */
    public g7d m28150i(String str) {
        this.f24689f = true;
        this.f24690g = str;
        return this;
    }

    /* renamed from: j */
    public g7d m28151j(boolean z) {
        this.f24691h = true;
        this.f24692q = z;
        return this;
    }

    /* renamed from: k */
    public g7d m28152k(String str) {
        this.f24684a = true;
        this.f24685b = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        m28152k(objectInput.readUTF());
        m28149h(objectInput.readUTF());
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.f24688e.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m28150i(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m28148g(objectInput.readUTF());
        }
        m28151j(objectInput.readBoolean());
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f24685b);
        objectOutput.writeUTF(this.f24687d);
        int iM28147f = m28147f();
        objectOutput.writeInt(iM28147f);
        for (int i = 0; i < iM28147f; i++) {
            objectOutput.writeUTF((String) this.f24688e.get(i));
        }
        objectOutput.writeBoolean(this.f24689f);
        if (this.f24689f) {
            objectOutput.writeUTF(this.f24690g);
        }
        objectOutput.writeBoolean(this.f24693s);
        if (this.f24693s) {
            objectOutput.writeUTF(this.f24694x);
        }
        objectOutput.writeBoolean(this.f24692q);
    }
}
