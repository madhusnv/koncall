package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class l7d implements Externalizable {

    /* renamed from: a */
    public boolean f33366a;

    /* renamed from: e */
    public boolean f33370e;

    /* renamed from: b */
    public String f33367b = "";

    /* renamed from: c */
    public List f33368c = new ArrayList();

    /* renamed from: d */
    public List f33369d = new ArrayList();

    /* renamed from: f */
    public String f33371f = "";

    /* renamed from: a */
    public String m36657a() {
        return this.f33371f;
    }

    /* renamed from: b */
    public String m36658b() {
        return this.f33367b;
    }

    /* renamed from: c */
    public int m36659c(int i) {
        return ((Integer) this.f33368c.get(i)).intValue();
    }

    /* renamed from: d */
    public int m36660d() {
        return this.f33368c.size();
    }

    /* renamed from: e */
    public List m36661e() {
        return this.f33368c;
    }

    /* renamed from: f */
    public int m36662f() {
        return this.f33369d.size();
    }

    /* renamed from: g */
    public List m36663g() {
        return this.f33369d;
    }

    /* renamed from: h */
    public boolean m36664h() {
        return this.f33370e;
    }

    /* renamed from: i */
    public l7d m36665i(String str) {
        this.f33370e = true;
        this.f33371f = str;
        return this;
    }

    /* renamed from: j */
    public l7d m36666j(String str) {
        this.f33366a = true;
        this.f33367b = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            m36666j(objectInput.readUTF());
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.f33368c.add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f33369d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            m36665i(objectInput.readUTF());
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f33366a);
        if (this.f33366a) {
            objectOutput.writeUTF(this.f33367b);
        }
        int iM36660d = m36660d();
        objectOutput.writeInt(iM36660d);
        for (int i = 0; i < iM36660d; i++) {
            objectOutput.writeInt(((Integer) this.f33368c.get(i)).intValue());
        }
        int iM36662f = m36662f();
        objectOutput.writeInt(iM36662f);
        for (int i2 = 0; i2 < iM36662f; i2++) {
            objectOutput.writeInt(((Integer) this.f33369d.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.f33370e);
        if (this.f33370e) {
            objectOutput.writeUTF(this.f33371f);
        }
    }
}
