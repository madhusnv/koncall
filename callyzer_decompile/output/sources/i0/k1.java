package i0;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4535g;
import m2.C4640e;
import w2.AbstractC7878q;
import w2.InterfaceC7877p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 implements n1 {

    /* renamed from: a */
    public int f16508a;

    /* renamed from: b */
    public boolean f16509b;

    /* renamed from: c */
    public Object f16510c;

    /* renamed from: d */
    public Object f16511d;

    /* renamed from: e */
    public Object f16512e;

    /* renamed from: f */
    public final Object f16513f;

    public k1(Object obj) {
        this.f16510c = new Object();
        this.f16508a = 0;
        this.f16509b = false;
        this.f16512e = new HashMap();
        this.f16513f = new CopyOnWriteArraySet();
        this.f16511d = new AtomicReference(obj);
    }

    @Override // i0.n1
    /* renamed from: a */
    public void mo2184a(Executor executor, m1 m1Var) {
        i2 i2Var;
        synchronized (this.f16510c) {
            i2 i2Var2 = (i2) ((HashMap) this.f16512e).remove(m1Var);
            if (i2Var2 != null) {
                i2Var2.f16494c.set(false);
                ((CopyOnWriteArraySet) this.f16513f).remove(i2Var2);
            }
            i2Var = new i2((AtomicReference) this.f16511d, executor, m1Var);
            ((HashMap) this.f16512e).put(m1Var, i2Var);
            ((CopyOnWriteArraySet) this.f16513f).add(i2Var);
        }
        i2Var.m7348a(0);
    }

    /* renamed from: b */
    public boolean m7354b(int i10, int i11) {
        C4640e c4640e = (C4640e) this.f16511d;
        int i12 = this.f16508a;
        InterfaceC7877p interfaceC7877p = (InterfaceC7877p) c4640e.f22884a[i10 + i12];
        InterfaceC7877p interfaceC7877p2 = (InterfaceC7877p) ((C4640e) this.f16512e).f22884a[i12 + i11];
        v3.c1 c1Var = v3.d1.f36794a;
        return AbstractC4154l.m8918a(interfaceC7877p, interfaceC7877p2) || interfaceC7877p.getClass() == interfaceC7877p2.getClass();
    }

    @Override // i0.n1
    /* renamed from: c */
    public void mo2185c(m1 m1Var) {
        synchronized (this.f16510c) {
            i2 i2Var = (i2) ((HashMap) this.f16512e).remove(m1Var);
            if (i2Var != null) {
                i2Var.f16494c.set(false);
                ((CopyOnWriteArraySet) this.f16513f).remove(i2Var);
            }
        }
    }

    public k1(C4535g c4535g, AbstractC7878q abstractC7878q, int i10, C4640e c4640e, C4640e c4640e2, boolean z6) {
        this.f16513f = c4535g;
        this.f16510c = abstractC7878q;
        this.f16508a = i10;
        this.f16511d = c4640e;
        this.f16512e = c4640e2;
        this.f16509b = z6;
    }
}
