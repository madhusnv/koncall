package p001o;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class dwf implements dp3, Iterable, sb9 {

    /* renamed from: b */
    public int f20602b;

    /* renamed from: d */
    public int f20604d;

    /* renamed from: e */
    public int f20605e;

    /* renamed from: f */
    public boolean f20606f;

    /* renamed from: g */
    public int f20607g;

    /* renamed from: a */
    public int[] f20601a = new int[0];

    /* renamed from: c */
    public Object[] f20603c = new Object[0];

    /* renamed from: h */
    public ArrayList f20608h = new ArrayList();

    /* renamed from: A */
    public final boolean m23899A() {
        return this.f20606f;
    }

    /* renamed from: B */
    public final boolean m23900B(int i, sc0 sc0Var) {
        sq8.m48649h(sc0Var, "anchor");
        if (!(!this.f20606f)) {
            go3.m29222v("Writer is active".toString());
            throw new qe9();
        }
        if (!(i >= 0 && i < this.f20602b)) {
            go3.m29222v("Invalid group index".toString());
            throw new qe9();
        }
        if (m23903I(sc0Var)) {
            int iM27614G = fwf.m27614G(this.f20601a, i) + i;
            int iM48144a = sc0Var.m48144a();
            if (i <= iM48144a && iM48144a < iM27614G) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public final cwf m23901F() {
        if (this.f20606f) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f20605e++;
        return new cwf(this);
    }

    /* renamed from: G */
    public final gwf m23902G() {
        if (!(!this.f20606f)) {
            go3.m29222v("Cannot start a writer when another writer is pending".toString());
            throw new qe9();
        }
        if (!(this.f20605e <= 0)) {
            go3.m29222v("Cannot start a writer when a reader is pending".toString());
            throw new qe9();
        }
        this.f20606f = true;
        this.f20607g++;
        return new gwf(this);
    }

    /* renamed from: I */
    public final boolean m23903I(sc0 sc0Var) {
        sq8.m48649h(sc0Var, "anchor");
        if (!sc0Var.m48145b()) {
            return false;
        }
        int iM27626S = fwf.m27626S(this.f20608h, sc0Var.m48144a(), this.f20602b);
        return iM27626S >= 0 && sq8.m48644c(this.f20608h.get(iM27626S), sc0Var);
    }

    /* renamed from: J */
    public final void m23904J(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList) {
        sq8.m48649h(iArr, "groups");
        sq8.m48649h(objArr, "slots");
        sq8.m48649h(arrayList, "anchors");
        this.f20601a = iArr;
        this.f20602b = i;
        this.f20603c = objArr;
        this.f20604d = i2;
        this.f20608h = arrayList;
    }

    /* renamed from: d */
    public final sc0 m23905d(int i) {
        if (!(!this.f20606f)) {
            go3.m29222v("use active SlotWriter to create an anchor location instead ".toString());
            throw new qe9();
        }
        boolean z = false;
        if (i >= 0 && i < this.f20602b) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ArrayList arrayList = this.f20608h;
        int iM27626S = fwf.m27626S(arrayList, i, this.f20602b);
        if (iM27626S < 0) {
            sc0 sc0Var = new sc0(i);
            arrayList.add(-(iM27626S + 1), sc0Var);
            return sc0Var;
        }
        Object obj = arrayList.get(iM27626S);
        sq8.m48648g(obj, "get(location)");
        return (sc0) obj;
    }

    /* renamed from: e */
    public final int m23906e(sc0 sc0Var) {
        sq8.m48649h(sc0Var, "anchor");
        if (!(!this.f20606f)) {
            go3.m29222v("Use active SlotWriter to determine anchor location instead".toString());
            throw new qe9();
        }
        if (sc0Var.m48145b()) {
            return sc0Var.m48144a();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    public boolean isEmpty() {
        return this.f20602b == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new kv7(this, 0, this.f20602b);
    }

    /* renamed from: j */
    public final void m23907j(cwf cwfVar) {
        sq8.m48649h(cwfVar, "reader");
        if (cwfVar.m21935u() == this && this.f20605e > 0) {
            this.f20605e--;
        } else {
            go3.m29222v("Unexpected reader close()".toString());
            throw new qe9();
        }
    }

    /* renamed from: n */
    public final void m23908n(gwf gwfVar, int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList) {
        sq8.m48649h(gwfVar, "writer");
        sq8.m48649h(iArr, "groups");
        sq8.m48649h(objArr, "slots");
        sq8.m48649h(arrayList, "anchors");
        if (!(gwfVar.m29602Y() == this && this.f20606f)) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        this.f20606f = false;
        m23904J(iArr, i, objArr, i2, arrayList);
    }

    /* renamed from: o */
    public final ArrayList m23909o() {
        return this.f20608h;
    }

    /* renamed from: p */
    public final int[] m23910p() {
        return this.f20601a;
    }

    /* renamed from: r */
    public final int m23911r() {
        return this.f20602b;
    }

    /* renamed from: v */
    public final Object[] m23912v() {
        return this.f20603c;
    }

    /* renamed from: w */
    public final int m23913w() {
        return this.f20604d;
    }

    /* renamed from: y */
    public final int m23914y() {
        return this.f20607g;
    }
}
