package r0;

import a1.C0018q;
import a1.c0;
import a9.C0073l;
import android.content.Context;
import android.os.Trace;
import b0.C0515g;
import c0.C0825r;
import c0.C0829v;
import c0.b2;
import c0.d1;
import c0.h1;
import c0.j0;
import c0.k1;
import c0.m0;
import c9.C0917l;
import d7.InterfaceC1649u;
import ej.C2060e;
import i0.b1;
import i0.g0;
import i0.o1;
import i0.r1;
import i0.y0;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import k2.h2;
import kotlin.jvm.internal.AbstractC4154l;
import l0.RunnableC4302b;
import og.oa;
import p020v.C7600j;
import q0.C6069j;
import qv.C6334i;
import r5.AbstractC6468c;
import rw.AbstractC6662l;
import rw.C6668r;
import yt.C8770b;
import z0.C8840f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r0.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6415f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f30941a;

    /* renamed from: b */
    public final /* synthetic */ Object f30942b;

    /* renamed from: c */
    public final /* synthetic */ Object f30943c;

    /* renamed from: d */
    public final /* synthetic */ Object f30944d;

    /* renamed from: e */
    public final /* synthetic */ Object f30945e;

    /* renamed from: f */
    public final /* synthetic */ Object f30946f;

    /* renamed from: g */
    public final /* synthetic */ Object f30947g;

    public /* synthetic */ RunnableC6415f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f30941a = i10;
        this.f30942b = obj;
        this.f30943c = obj2;
        this.f30944d = obj3;
        this.f30945e = obj4;
        this.f30946f = obj5;
        this.f30947g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30941a) {
            case 0:
                ((C0073l) this.f30942b).m224p((g0) this.f30943c, (g0) this.f30944d, (C6069j) this.f30945e, (C6069j) this.f30946f, (Map.Entry) this.f30947g);
                return;
            default:
                RunnableC4302b runnableC4302b = (RunnableC4302b) this.f30942b;
                InterfaceC1649u lifecycleOwner = (InterfaceC1649u) this.f30943c;
                C0018q c0018q = (C0018q) this.f30944d;
                Context context = (Context) this.f30945e;
                h2 h2Var = (h2) this.f30946f;
                C8770b c8770b = (C8770b) this.f30947g;
                C8840f c8840f = (C8840f) runnableC4302b.get();
                int iM4b = 0;
                r1 r1Var = new r1(o1.m7399a(new h1(0).f5106b));
                b1.m7299K(r1Var);
                k1 k1Var = new k1(r1Var);
                k1Var.f5136q = k1.f5134x;
                k1Var.m2209E(c0018q.getSurfaceProvider());
                C0515g c0515g = new C0515g(1);
                c0515g.f3583b.m7352n(y0.f16615b, 0);
                c0515g.f3583b.m7352n(y0.f16620g, Boolean.TRUE);
                y0 y0Var = new y0(o1.m7399a(c0515g.f3583b));
                b1.m7299K(y0Var);
                j0 j0Var = new j0(y0Var);
                Executor executorM12452c = AbstractC6468c.m12452c(context);
                C0917l c0917l = new C0917l(new C6334i(13, h2Var, c8770b));
                synchronized (j0Var.f5117p) {
                    try {
                        m0 m0Var = j0Var.f5118q;
                        if (m0Var != null) {
                            c0 c0Var = new c0(3, c0917l);
                            synchronized (m0Var.f5176w) {
                                m0Var.f5157a = c0Var;
                                m0Var.f5163g = executorM12452c;
                            }
                        }
                        if (j0Var.f5120s == null) {
                            j0Var.m2164o();
                        }
                        j0Var.f5119r = executorM12452c;
                        j0Var.f5120s = c0917l;
                    } finally {
                    }
                }
                c8840f.f42555a.m5787f();
                C0825r DEFAULT_BACK_CAMERA = C0825r.f5203c;
                AbstractC4154l.m8922e(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
                AbstractC4154l.m8923f(lifecycleOwner, "lifecycleOwner");
                C2060e c2060e = c8840f.f42555a;
                b2[] useCases = (b2[]) Arrays.copyOf(new b2[]{k1Var, j0Var}, 2);
                AbstractC4154l.m8923f(useCases, "useCases");
                Trace.beginSection(oa.m10795e("CX:bindToLifecycle"));
                try {
                    C0829v c0829v = (C0829v) c2060e.f9655f;
                    if (c0829v != null) {
                        C7600j c7600j = c0829v.f5233g;
                        if (c7600j == null) {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                        iM4b = c7600j.f36596b.m4b();
                    }
                    if (iM4b == 2) {
                        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                    }
                    C2060e.m5784c(c2060e, 1);
                    C2060e.m5785d(c2060e, lifecycleOwner, DEFAULT_BACK_CAMERA, new d1(AbstractC6662l.m12729s(useCases), C6668r.f31943a));
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
