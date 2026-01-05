package ym;

import ay.C0496f;
import ay.ExecutorC0495e;
import iz.InterfaceC3392y;
import iz.k0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import oz.C5783f;
import p020v.x0;
import tx.c0;
import tx.m0;
import xm.e0;
import xm.g0;
import xm.r4;
import yv.C8800o;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.j */
/* loaded from: classes3.dex */
public final class C8699j implements InterfaceC3392y {

    /* renamed from: a */
    public final g0 f42071a;

    /* renamed from: b */
    public final C8805t f42072b;

    public C8699j(g0 g0Var, C8805t c8805t) {
        this.f42071a = g0Var;
        this.f42072b = c8805t;
    }

    @Override // iz.InterfaceC3392y
    /* renamed from: a */
    public final k0 mo7804a(C5783f c5783f) {
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        AbstractC4154l.m8922e(localDateTimeNow, "now(...)");
        C8800o.m16212u(localDateTimeNow);
        x0 x0Var = (x0) c5783f.f28358i;
        k0 k0VarM11332f = c5783f.m11332f(x0Var);
        try {
            if (k0VarM11332f.f17920d == 401) {
                m16099b();
                int i10 = 0;
                while (i10 < 3) {
                    i10++;
                    k0VarM11332f.close();
                    k0VarM11332f = c5783f.m11332f(x0Var);
                    if (k0VarM11332f.f17920d != 401) {
                        break;
                    }
                    m16099b();
                }
            }
            return k0VarM11332f;
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f42072b.m16235j(e2);
            return k0VarM11332f;
        }
    }

    /* renamed from: b */
    public final void m16099b() {
        C0496f c0496f = m0.f34659a;
        C8810d c8810dM13479b = c0.m13479b(ExecutorC0495e.f3538c);
        g0 g0Var = this.f42071a;
        c0.m13502y(c8810dM13479b, null, null, new e0(g0Var, null, 0), 3);
        g0Var.m15575b(r4.FromApi);
    }
}
