package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class f7d implements Externalizable {

    /* renamed from: a */
    public boolean f22923a;

    /* renamed from: c */
    public boolean f22925c;

    /* renamed from: f */
    public boolean f22928f;

    /* renamed from: h */
    public boolean f22930h;

    /* renamed from: s */
    public boolean f22932s;

    /* renamed from: b */
    public String f22924b = "";

    /* renamed from: d */
    public String f22926d = "";

    /* renamed from: e */
    public List f22927e = new ArrayList();

    /* renamed from: g */
    public String f22929g = "";

    /* renamed from: q */
    public boolean f22931q = false;

    /* renamed from: x */
    public String f22933x = "";

    /* renamed from: a */
    public String m26244a() {
        return this.f22933x;
    }

    /* renamed from: b */
    public String m26245b() {
        return this.f22926d;
    }

    /* renamed from: c */
    public String m26246c(int i) {
        return (String) this.f22927e.get(i);
    }

    /* renamed from: d */
    public String m26247d() {
        return this.f22929g;
    }

    /* renamed from: e */
    public boolean m26248e() {
        return this.f22931q;
    }

    /* renamed from: f */
    public String m26249f() {
        return this.f22924b;
    }

    /* renamed from: g */
    public boolean m26250g() {
        return this.f22932s;
    }

    /* renamed from: h */
    public int m26251h() {
        return this.f22927e.size();
    }

    /* renamed from: i */
    public f7d m26252i(String str) {
        this.f22932s = true;
        this.f22933x = str;
        return this;
    }

    /* renamed from: j */
    public f7d m26253j(String str) {
        this.f22925c = true;
        this.f22926d = str;
        return this;
    }

    /* renamed from: k */
    public f7d m26254k(String str) {
        this.f22928f = true;
        this.f22929g = str;
        return this;
    }

    /* renamed from: l */
    public f7d m26255l(boolean z) {
        this.f22930h = true;
        this.f22931q = z;
        return this;
    }

    /* renamed from: m */
    public f7d m26256m(String str) {
        this.f22923a = true;
        this.f22924b = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        m26256m(objectInput.readUTF());
        m26253j(objectInput.readUTF());
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.f22927e.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m26254k(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m26252i(objectInput.readUTF());
        }
        m26255l(objectInput.readBoolean());
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f22924b);
        objectOutput.writeUTF(this.f22926d);
        int iM26251h = m26251h();
        objectOutput.writeInt(iM26251h);
        for (int i = 0; i < iM26251h; i++) {
            objectOutput.writeUTF((String) this.f22927e.get(i));
        }
        objectOutput.writeBoolean(this.f22928f);
        if (this.f22928f) {
            objectOutput.writeUTF(this.f22929g);
        }
        objectOutput.writeBoolean(this.f22932s);
        if (this.f22932s) {
            objectOutput.writeUTF(this.f22933x);
        }
        objectOutput.writeBoolean(this.f22931q);
    }
}
