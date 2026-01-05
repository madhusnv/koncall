package q0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import b6.InterfaceC0600a;
import c0.C0817j;
import c0.q1;
import c0.u1;
import c0.w1;
import c0.x1;
import i0.C3082m;
import i0.g0;
import i0.u0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import l0.AbstractC4308h;
import og.y0;
import pg.o7;
import pg.t8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q0.j */
/* loaded from: classes.dex */
public final class C6069j {

    /* renamed from: a */
    public final int f29593a;

    /* renamed from: b */
    public final Matrix f29594b;

    /* renamed from: c */
    public final boolean f29595c;

    /* renamed from: d */
    public final Rect f29596d;

    /* renamed from: e */
    public final boolean f29597e;

    /* renamed from: f */
    public final int f29598f;

    /* renamed from: g */
    public final C3082m f29599g;

    /* renamed from: h */
    public int f29600h;

    /* renamed from: i */
    public int f29601i;

    /* renamed from: k */
    public x1 f29603k;

    /* renamed from: l */
    public C6068i f29604l;

    /* renamed from: j */
    public boolean f29602j = false;

    /* renamed from: m */
    public final HashSet f29605m = new HashSet();

    /* renamed from: n */
    public boolean f29606n = false;

    /* renamed from: o */
    public final ArrayList f29607o = new ArrayList();

    public C6069j(int i10, int i11, C3082m c3082m, Matrix matrix, boolean z6, Rect rect, int i12, int i13, boolean z10) {
        this.f29598f = i10;
        this.f29593a = i11;
        this.f29599g = c3082m;
        this.f29594b = matrix;
        this.f29595c = z6;
        this.f29596d = rect;
        this.f29601i = i12;
        this.f29600h = i13;
        this.f29597e = z10;
        this.f29604l = new C6068i(c3082m.f16522a, i11);
    }

    /* renamed from: a */
    public final void m12074a() {
        y0.m11056f("Edge is already closed.", !this.f29606n);
    }

    /* renamed from: b */
    public final void m12075b() {
        o7.m11806a();
        this.f29604l.mo7416a();
        this.f29606n = true;
        this.f29607o.clear();
        this.f29605m.clear();
    }

    /* renamed from: c */
    public final x1 m12076c(g0 g0Var, boolean z6) {
        o7.m11806a();
        m12074a();
        C3082m c3082m = this.f29599g;
        x1 x1Var = new x1(c3082m.f16522a, g0Var, z6, c3082m.f16524c, new RunnableC6064e(this, 0));
        try {
            u1 u1Var = x1Var.f5268k;
            C6068i c6068i = this.f29604l;
            Objects.requireNonNull(c6068i);
            if (c6068i.m12073g(u1Var, new RunnableC6065f(c6068i, 0))) {
                AbstractC4308h.m9034d(c6068i.f16604e).mo9026a(new u0(u1Var, 1), t8.m11872a());
            }
            this.f29603k = x1Var;
            m12078e();
            return x1Var;
        } catch (DeferrableSurface$SurfaceClosedException e2) {
            throw new AssertionError("Surface is somehow already closed", e2);
        } catch (RuntimeException e10) {
            x1Var.m2238c();
            throw e10;
        }
    }

    /* renamed from: d */
    public final void m12077d() {
        boolean z6;
        o7.m11806a();
        m12074a();
        C6068i c6068i = this.f29604l;
        c6068i.getClass();
        o7.m11806a();
        if (c6068i.f29591q == null) {
            synchronized (c6068i.f16600a) {
                z6 = c6068i.f16602c;
            }
            if (!z6) {
                return;
            }
        }
        this.f29602j = false;
        this.f29604l.mo7416a();
        this.f29604l = new C6068i(this.f29599g.f16522a, this.f29593a);
        Iterator it = this.f29605m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* renamed from: e */
    public final void m12078e() {
        w1 w1Var;
        Executor executor;
        o7.m11806a();
        C0817j c0817j = new C0817j(this.f29596d, this.f29601i, this.f29600h, this.f29595c, this.f29594b, this.f29597e);
        x1 x1Var = this.f29603k;
        if (x1Var != null) {
            synchronized (x1Var.f5258a) {
                x1Var.f5269l = c0817j;
                w1Var = x1Var.f5270m;
                executor = x1Var.f5271n;
            }
            if (w1Var != null && executor != null) {
                executor.execute(new q1(w1Var, c0817j, 0));
            }
        }
        ArrayList arrayList = this.f29607o;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC0600a) obj).accept(c0817j);
        }
    }
}
