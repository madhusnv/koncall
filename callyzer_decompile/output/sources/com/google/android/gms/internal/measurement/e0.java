package com.google.android.gms.internal.measurement;

import a1.C0005d;
import c9.C0914i;
import c9.C0919n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public final C0914i f6120a;

    /* renamed from: b */
    public C0919n f6121b;

    /* renamed from: c */
    public final C0005d f6122c;

    /* renamed from: d */
    public final C1304t f6123d;

    public e0() {
        C0914i c0914i = new C0914i(3);
        this.f6120a = c0914i;
        this.f6121b = ((C0919n) c0914i.f5586b).m2661g();
        this.f6122c = new C0005d(4);
        this.f6123d = new C1304t(3);
        final int i10 = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b */
            public final /* synthetic */ e0 f6049b;

            {
                this.f6049b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i10) {
                    case 0:
                        return new l4(this.f6049b.f6122c);
                    default:
                        return new l4(this.f6049b.f6123d);
                }
            }
        };
        v5 v5Var = (v5) c0914i.f5588d;
        ((HashMap) v5Var.f6423a).put("internal.registerCallback", callable);
        final int i11 = 0;
        ((HashMap) v5Var.f6423a).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b */
            public final /* synthetic */ e0 f6049b;

            {
                this.f6049b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i11) {
                    case 0:
                        return new l4(this.f6049b.f6122c);
                    default:
                        return new l4(this.f6049b.f6123d);
                }
            }
        });
    }

    /* renamed from: a */
    public final boolean m3231a(C1286b c1286b) throws zzd {
        C0005d c0005d = this.f6122c;
        try {
            c0005d.f25c = c1286b;
            c0005d.f26d = c1286b.clone();
            ((ArrayList) c0005d.f24b).clear();
            ((C0919n) this.f6120a.f5587c).m2664j("runtime.counter", new C1291g(Double.valueOf(0.0d)));
            this.f6123d.m3667d(this.f6121b.m2661g(), c0005d);
            if (((C1286b) c0005d.f26d).equals((C1286b) c0005d.f25c)) {
                return !((ArrayList) c0005d.f24b).isEmpty();
            }
            return true;
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    /* renamed from: b */
    public final void m3232b(x3 x3Var) {
        AbstractC1292h abstractC1292h;
        try {
            C0914i c0914i = this.f6120a;
            this.f6121b = ((C0919n) c0914i.f5586b).m2661g();
            if (c0914i.m2634o(this.f6121b, (y3[]) x3Var.m3771p().toArray(new y3[0])) instanceof C1290f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (w3 w3Var : x3Var.m3772q().m3725p()) {
                List listM3744q = w3Var.m3744q();
                String strM3743p = w3Var.m3743p();
                Iterator it = listM3744q.iterator();
                while (it.hasNext()) {
                    InterfaceC1298n interfaceC1298nM2634o = c0914i.m2634o(this.f6121b, (y3) it.next());
                    if (!(interfaceC1298nM2634o instanceof C1295k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C0919n c0919n = this.f6121b;
                    if (c0919n.m2662h(strM3743p)) {
                        InterfaceC1298n interfaceC1298nM2667m = c0919n.m2667m(strM3743p);
                        if (!(interfaceC1298nM2667m instanceof AbstractC1292h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strM3743p)));
                        }
                        abstractC1292h = (AbstractC1292h) interfaceC1298nM2667m;
                    } else {
                        abstractC1292h = null;
                    }
                    if (abstractC1292h == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strM3743p)));
                    }
                    abstractC1292h.mo3299d(this.f6121b, Collections.singletonList(interfaceC1298nM2634o));
                }
            }
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }
}
