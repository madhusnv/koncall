package mq;

import android.content.Context;
import c9.C0908c;
import c9.C0910e;
import gm.C2635d;
import gm.C2643l;
import gm.C2644m;
import gm.C2645n;
import gm.C2651t;
import h6.C2856l;
import im.EnumC3321w;
import io.C3328c;
import jn.AbstractC3802a;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4490c;
import nn.C5113e;
import no.C5122i;
import pn.C5979e;
import qu.C6324e;
import tb.C7105p;
import tq.EnumC7202n;
import v0.C7622f;
import xm.s2;
import xm.y5;
import yv.C8803r;
import yv.C8805t;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.c */
/* loaded from: classes3.dex */
public final class C4835c implements d7.y0 {

    /* renamed from: a */
    public final /* synthetic */ int f24166a;

    /* renamed from: b */
    public final /* synthetic */ Object f24167b;

    /* renamed from: c */
    public final /* synthetic */ Enum f24168c;

    public /* synthetic */ C4835c(Object obj, Enum r22, int i10) {
        this.f24166a = i10;
        this.f24167b = obj;
        this.f24168c = r22;
    }

    @Override // d7.y0
    /* renamed from: b */
    public final d7.w0 mo1207b(Class cls) {
        switch (this.f24166a) {
            case 0:
                C2635d c2635d = (C2635d) this.f24167b;
                EnumC7202n enumC7202n = (EnumC7202n) this.f24168c;
                C2644m c2644m = c2635d.f14238a;
                C2651t c2651t = c2644m.f14255b;
                Context context = c2651t.f14305c.f15864a;
                C5979e c5979eM6613c = c2651t.m6613c();
                C2645n c2645n = (C2645n) c2644m.f14257d;
                C0910e c0910eM6610f = c2645n.m6610f();
                C5113e c5113eM6611a = c2651t.m6611a();
                C5122i c5122i = (C5122i) c2651t.f14301Y.get();
                rn.h0 h0Var = (rn.h0) c2651t.f14302Z.get();
                C2651t c2651t2 = c2645n.f14258a;
                return new h0(context, c5979eM6613c, c0910eM6610f, c5113eM6611a, c5122i, h0Var, new p020v.x0(c2651t2.f14305c.f15864a, (y5) c2651t2.f14281E.get(), c2651t2.m6614d(), (s2) c2651t2.f14300X.get(), c2651t2.m6633w(), AbstractC3802a.m8397a(c2651t2.f14307e)), new C7622f(c2651t2.m6633w()), new C7622f((y5) c2651t2.f14281E.get()), c2651t.m6628r(), new C0908c((y5) c2651t2.f14281E.get()), enumC7202n, c2651t.m6633w(), AbstractC3802a.m8397a(c2651t.f14307e));
            default:
                C2643l c2643l = (C2643l) this.f24167b;
                EnumC3321w enumC3321w = (EnumC3321w) this.f24168c;
                C2644m c2644m2 = c2643l.f14253a;
                C2651t c2651t3 = ((C2645n) c2644m2.f14257d).f14258a;
                C7105p c7105p = new C7105p((y5) c2651t3.f14281E.get(), c2651t3.m6626p());
                C9000c c9000cM6634x = c2651t3.m6634x();
                C0908c c0908c = new C0908c((y5) c2651t3.f14281E.get());
                C8803r networkMonitor = (C8803r) c2651t3.f14293Q.get();
                C8805t c8805tM6633w = c2651t3.m6633w();
                C4490c c4490cM6617g = c2651t3.m6617g();
                C5113e c5113eM6611a2 = c2651t3.m6611a();
                C2856l c2856lM6612b = c2651t3.m6612b();
                Context context2 = c2651t3.f14305c.f15864a;
                AbstractC4154l.m8923f(networkMonitor, "networkMonitor");
                C3328c c3328c = new C3328c();
                c3328c.f17609a = c7105p;
                c3328c.f17610b = c9000cM6634x;
                c3328c.f17611c = c0908c;
                c3328c.f17612d = networkMonitor;
                c3328c.f17613e = c8805tM6633w;
                c3328c.f17614f = c4490cM6617g;
                c3328c.f17615g = c5113eM6611a2;
                c3328c.f17616h = c2856lM6612b;
                c3328c.f17617i = context2;
                C2651t c2651t4 = c2644m2.f14255b;
                return new C6324e(c3328c, enumC3321w, c2651t4.f14305c.f15864a, c2651t4.m6633w());
        }
    }
}
