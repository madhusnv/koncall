package p001o;

import android.util.SparseArray;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class sbg implements vq6 {

    /* renamed from: a */
    public final vq6 f45158a;

    /* renamed from: b */
    public final qbg.InterfaceC16329a f45159b;

    /* renamed from: c */
    public final SparseArray f45160c = new SparseArray();

    public sbg(vq6 vq6Var, qbg.InterfaceC16329a interfaceC16329a) {
        this.f45158a = vq6Var;
        this.f45159b = interfaceC16329a;
    }

    /* renamed from: a */
    public void m48140a() {
        for (int i = 0; i < this.f45160c.size(); i++) {
            ((ubg) this.f45160c.valueAt(i)).m51356k();
        }
    }

    @Override // p001o.vq6
    /* renamed from: f */
    public uth mo32487f(int i, int i2) {
        if (i2 != 3) {
            return this.f45158a.mo32487f(i, i2);
        }
        ubg ubgVar = (ubg) this.f45160c.get(i);
        if (ubgVar != null) {
            return ubgVar;
        }
        ubg ubgVar2 = new ubg(this.f45158a.mo32487f(i, i2), this.f45159b);
        this.f45160c.put(i, ubgVar2);
        return ubgVar2;
    }

    @Override // p001o.vq6
    /* renamed from: p */
    public void mo32489p() {
        this.f45158a.mo32489p();
    }

    @Override // p001o.vq6
    /* renamed from: r */
    public void mo32490r(zaf zafVar) {
        this.f45158a.mo32490r(zafVar);
    }
}
