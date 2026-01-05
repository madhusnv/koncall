package sk;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sk.f */
/* loaded from: classes.dex */
public final class C6858f implements Externalizable {

    /* renamed from: d */
    public boolean f32558d;

    /* renamed from: g */
    public boolean f32561g;

    /* renamed from: a */
    public String f32555a = "";

    /* renamed from: b */
    public String f32556b = "";

    /* renamed from: c */
    public final ArrayList f32557c = new ArrayList();

    /* renamed from: e */
    public String f32559e = "";

    /* renamed from: f */
    public boolean f32560f = false;

    /* renamed from: h */
    public String f32562h = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.f32555a = objectInput.readUTF();
        this.f32556b = objectInput.readUTF();
        int i10 = objectInput.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f32557c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f32558d = true;
            this.f32559e = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f32561g = true;
            this.f32562h = utf2;
        }
        this.f32560f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f32555a);
        objectOutput.writeUTF(this.f32556b);
        ArrayList arrayList = this.f32557c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            objectOutput.writeUTF((String) arrayList.get(i10));
        }
        objectOutput.writeBoolean(this.f32558d);
        if (this.f32558d) {
            objectOutput.writeUTF(this.f32559e);
        }
        objectOutput.writeBoolean(this.f32561g);
        if (this.f32561g) {
            objectOutput.writeUTF(this.f32562h);
        }
        objectOutput.writeBoolean(this.f32560f);
    }
}
