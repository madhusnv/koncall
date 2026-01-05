package sk;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sk.h */
/* loaded from: classes.dex */
public class C6860h implements Externalizable {

    /* renamed from: C */
    public boolean f32564C;

    /* renamed from: E */
    public boolean f32566E;

    /* renamed from: G */
    public boolean f32568G;

    /* renamed from: I */
    public boolean f32570I;

    /* renamed from: L */
    public boolean f32572L;

    /* renamed from: V */
    public boolean f32577V;
    public boolean X0;

    /* renamed from: Y */
    public boolean f32579Y;
    public boolean Z0;

    /* renamed from: a */
    public boolean f32581a;

    /* renamed from: c */
    public boolean f32583c;

    /* renamed from: e */
    public boolean f32585e;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f44793f1;

    /* renamed from: g */
    public boolean f32587g;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f44795h0;

    /* renamed from: j */
    public boolean f32589j;

    /* renamed from: l */
    public boolean f32591l;

    /* renamed from: n */
    public boolean f32593n;

    /* renamed from: q */
    public boolean f32595q;

    /* renamed from: s */
    public boolean f32597s;

    /* renamed from: v */
    public boolean f32599v;

    /* renamed from: x */
    public boolean f32601x;

    /* renamed from: z */
    public boolean f32603z;

    /* renamed from: b */
    public C6861i f32582b = null;

    /* renamed from: d */
    public C6861i f32584d = null;

    /* renamed from: f */
    public C6861i f32586f = null;

    /* renamed from: h */
    public C6861i f32588h = null;

    /* renamed from: k */
    public C6861i f32590k = null;

    /* renamed from: m */
    public C6861i f32592m = null;

    /* renamed from: p */
    public C6861i f32594p = null;

    /* renamed from: r */
    public C6861i f32596r = null;

    /* renamed from: t */
    public C6861i f32598t = null;

    /* renamed from: w */
    public C6861i f32600w = null;

    /* renamed from: y */
    public C6861i f32602y = null;

    /* renamed from: B */
    public C6861i f32563B = null;

    /* renamed from: D */
    public C6861i f32565D = null;

    /* renamed from: F */
    public C6861i f32567F = null;

    /* renamed from: H */
    public C6861i f32569H = null;

    /* renamed from: K */
    public C6861i f32571K = null;

    /* renamed from: M */
    public C6861i f32573M = null;

    /* renamed from: N */
    public String f32574N = "";

    /* renamed from: O */
    public int f32575O = 0;

    /* renamed from: T */
    public String f32576T = "";

    /* renamed from: X */
    public String f32578X = "";

    /* renamed from: Z */
    public String f32580Z = "";

    /* renamed from: t0, reason: collision with root package name */
    public String f44797t0 = "";
    public String Y0 = "";

    /* renamed from: a1, reason: collision with root package name */
    public String f44788a1 = "";

    /* renamed from: b1, reason: collision with root package name */
    public boolean f44789b1 = false;

    /* renamed from: c1, reason: collision with root package name */
    public final ArrayList f44790c1 = new ArrayList();

    /* renamed from: d1, reason: collision with root package name */
    public final ArrayList f44791d1 = new ArrayList();

    /* renamed from: e1, reason: collision with root package name */
    public boolean f44792e1 = false;

    /* renamed from: g1, reason: collision with root package name */
    public String f44794g1 = "";

    /* renamed from: h1, reason: collision with root package name */
    public boolean f44796h1 = false;

    /* renamed from: a */
    public void mo13062a(String str) {
        this.f32574N = str;
    }

    /* renamed from: b */
    public void mo13063b(String str) {
        this.f32576T = str;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            C6861i c6861i = new C6861i();
            c6861i.readExternal(objectInput);
            this.f32581a = true;
            this.f32582b = c6861i;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i2 = new C6861i();
            c6861i2.readExternal(objectInput);
            this.f32583c = true;
            this.f32584d = c6861i2;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i3 = new C6861i();
            c6861i3.readExternal(objectInput);
            this.f32585e = true;
            this.f32586f = c6861i3;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i4 = new C6861i();
            c6861i4.readExternal(objectInput);
            this.f32587g = true;
            this.f32588h = c6861i4;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i5 = new C6861i();
            c6861i5.readExternal(objectInput);
            this.f32589j = true;
            this.f32590k = c6861i5;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i6 = new C6861i();
            c6861i6.readExternal(objectInput);
            this.f32591l = true;
            this.f32592m = c6861i6;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i7 = new C6861i();
            c6861i7.readExternal(objectInput);
            this.f32593n = true;
            this.f32594p = c6861i7;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i8 = new C6861i();
            c6861i8.readExternal(objectInput);
            this.f32595q = true;
            this.f32596r = c6861i8;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i9 = new C6861i();
            c6861i9.readExternal(objectInput);
            this.f32597s = true;
            this.f32598t = c6861i9;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i10 = new C6861i();
            c6861i10.readExternal(objectInput);
            this.f32599v = true;
            this.f32600w = c6861i10;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i11 = new C6861i();
            c6861i11.readExternal(objectInput);
            this.f32601x = true;
            this.f32602y = c6861i11;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i12 = new C6861i();
            c6861i12.readExternal(objectInput);
            this.f32603z = true;
            this.f32563B = c6861i12;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i13 = new C6861i();
            c6861i13.readExternal(objectInput);
            this.f32564C = true;
            this.f32565D = c6861i13;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i14 = new C6861i();
            c6861i14.readExternal(objectInput);
            this.f32566E = true;
            this.f32567F = c6861i14;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i15 = new C6861i();
            c6861i15.readExternal(objectInput);
            this.f32568G = true;
            this.f32569H = c6861i15;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i16 = new C6861i();
            c6861i16.readExternal(objectInput);
            this.f32570I = true;
            this.f32571K = c6861i16;
        }
        if (objectInput.readBoolean()) {
            C6861i c6861i17 = new C6861i();
            c6861i17.readExternal(objectInput);
            this.f32572L = true;
            this.f32573M = c6861i17;
        }
        mo13062a(objectInput.readUTF());
        this.f32575O = objectInput.readInt();
        mo13063b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f32577V = true;
            this.f32578X = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f32579Y = true;
            this.f32580Z = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.f44795h0 = true;
            this.f44797t0 = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.X0 = true;
            this.Y0 = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.Z0 = true;
            this.f44788a1 = utf5;
        }
        this.f44789b1 = objectInput.readBoolean();
        int i10 = objectInput.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            C6858f c6858f = new C6858f();
            c6858f.readExternal(objectInput);
            this.f44790c1.add(c6858f);
        }
        int i12 = objectInput.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            C6858f c6858f2 = new C6858f();
            c6858f2.readExternal(objectInput);
            this.f44791d1.add(c6858f2);
        }
        this.f44792e1 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.f44793f1 = true;
            this.f44794g1 = utf6;
        }
        this.f44796h1 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f32581a);
        if (this.f32581a) {
            this.f32582b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32583c);
        if (this.f32583c) {
            this.f32584d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32585e);
        if (this.f32585e) {
            this.f32586f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32587g);
        if (this.f32587g) {
            this.f32588h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32589j);
        if (this.f32589j) {
            this.f32590k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32591l);
        if (this.f32591l) {
            this.f32592m.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32593n);
        if (this.f32593n) {
            this.f32594p.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32595q);
        if (this.f32595q) {
            this.f32596r.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32597s);
        if (this.f32597s) {
            this.f32598t.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32599v);
        if (this.f32599v) {
            this.f32600w.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32601x);
        if (this.f32601x) {
            this.f32602y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32603z);
        if (this.f32603z) {
            this.f32563B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32564C);
        if (this.f32564C) {
            this.f32565D.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32566E);
        if (this.f32566E) {
            this.f32567F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32568G);
        if (this.f32568G) {
            this.f32569H.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32570I);
        if (this.f32570I) {
            this.f32571K.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f32572L);
        if (this.f32572L) {
            this.f32573M.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.f32574N);
        objectOutput.writeInt(this.f32575O);
        objectOutput.writeUTF(this.f32576T);
        objectOutput.writeBoolean(this.f32577V);
        if (this.f32577V) {
            objectOutput.writeUTF(this.f32578X);
        }
        objectOutput.writeBoolean(this.f32579Y);
        if (this.f32579Y) {
            objectOutput.writeUTF(this.f32580Z);
        }
        objectOutput.writeBoolean(this.f44795h0);
        if (this.f44795h0) {
            objectOutput.writeUTF(this.f44797t0);
        }
        objectOutput.writeBoolean(this.X0);
        if (this.X0) {
            objectOutput.writeUTF(this.Y0);
        }
        objectOutput.writeBoolean(this.Z0);
        if (this.Z0) {
            objectOutput.writeUTF(this.f44788a1);
        }
        objectOutput.writeBoolean(this.f44789b1);
        ArrayList arrayList = this.f44790c1;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            ((C6858f) arrayList.get(i10)).writeExternal(objectOutput);
        }
        ArrayList arrayList2 = this.f44791d1;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            ((C6858f) arrayList2.get(i11)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f44792e1);
        objectOutput.writeBoolean(this.f44793f1);
        if (this.f44793f1) {
            objectOutput.writeUTF(this.f44794g1);
        }
        objectOutput.writeBoolean(this.f44796h1);
    }
}
