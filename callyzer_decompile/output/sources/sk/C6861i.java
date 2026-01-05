package sk;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sk.i */
/* loaded from: classes.dex */
public final class C6861i implements Externalizable {

    /* renamed from: a */
    public boolean f32604a;

    /* renamed from: e */
    public boolean f32608e;

    /* renamed from: b */
    public String f32605b = "";

    /* renamed from: c */
    public final ArrayList f32606c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f32607d = new ArrayList();

    /* renamed from: f */
    public String f32609f = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f32604a = true;
            this.f32605b = utf;
        }
        int i10 = objectInput.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f32606c.add(Integer.valueOf(objectInput.readInt()));
        }
        int i12 = objectInput.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            this.f32607d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f32608e = true;
            this.f32609f = utf2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f32604a);
        if (this.f32604a) {
            objectOutput.writeUTF(this.f32605b);
        }
        ArrayList arrayList = this.f32606c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            objectOutput.writeInt(((Integer) arrayList.get(i10)).intValue());
        }
        ArrayList arrayList2 = this.f32607d;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            objectOutput.writeInt(((Integer) arrayList2.get(i11)).intValue());
        }
        objectOutput.writeBoolean(this.f32608e);
        if (this.f32608e) {
            objectOutput.writeUTF(this.f32609f);
        }
    }
}
