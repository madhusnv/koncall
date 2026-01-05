package u0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import c0.a2;
import c0.b2;
import c0.e1;
import c0.k1;
import com.skydoves.balloon.internals.DefinitionKt;
import i0.b1;
import i0.d2;
import i0.e2;
import i0.g0;
import i0.g2;
import i0.v0;
import i0.w2;
import i0.z2;
import j0.AbstractC3506f;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import mk.C4764c;
import og.u1;
import og.y0;
import p013o.i2;
import pg.o7;
import q0.C6068i;
import q0.C6069j;
import q0.RunnableC6065f;
import s0.C6698b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u0.g */
/* loaded from: classes.dex */
public final class C7297g implements a2 {

    /* renamed from: a */
    public final HashSet f34807a;

    /* renamed from: e */
    public final z2 f34811e;

    /* renamed from: f */
    public final g0 f34812f;

    /* renamed from: g */
    public final g0 f34813g;

    /* renamed from: j */
    public final HashSet f34815j;

    /* renamed from: k */
    public final HashMap f34816k;

    /* renamed from: l */
    public final C7292b f34817l;

    /* renamed from: m */
    public final C7292b f34818m;

    /* renamed from: b */
    public final HashMap f34808b = new HashMap();

    /* renamed from: c */
    public final HashMap f34809c = new HashMap();

    /* renamed from: d */
    public final HashMap f34810d = new HashMap();

    /* renamed from: h */
    public final e1 f34814h = new e1(this);

    public C7297g(g0 g0Var, g0 g0Var2, HashSet hashSet, z2 z2Var, C4764c c4764c) {
        this.f34812f = g0Var;
        this.f34813g = g0Var2;
        this.f34811e = z2Var;
        this.f34807a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            b2 b2Var = (b2) it.next();
            map.put(b2Var, b2Var.m2163n(g0Var.mo7319q(), null, b2Var.mo2155f(true, z2Var)));
        }
        this.f34816k = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.f34815j = hashSet2;
        this.f34817l = new C7292b(g0Var, hashSet2);
        if (this.f34813g != null) {
            this.f34818m = new C7292b(this.f34813g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b2 b2Var2 = (b2) it2.next();
            this.f34810d.put(b2Var2, Boolean.FALSE);
            this.f34809c.put(b2Var2, new C7296f(g0Var, this, c4764c));
        }
    }

    /* renamed from: t */
    public static void m13632t(C6069j c6069j, v0 v0Var, g2 g2Var) {
        c6069j.m12077d();
        try {
            o7.m11806a();
            c6069j.m12074a();
            C6068i c6068i = c6069j.f29604l;
            Objects.requireNonNull(c6068i);
            c6068i.m12073g(v0Var, new RunnableC6065f(c6068i, 0));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            d2 d2Var = g2Var.f16472f;
            if (d2Var != null) {
                d2Var.mo2191a(g2Var, e2.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    /* renamed from: u */
    public static v0 m13633u(b2 b2Var) {
        List listM7341b = b2Var instanceof c0.v0 ? b2Var.f5059n.m7341b() : Collections.unmodifiableList(b2Var.f5059n.f16473g.f16565a);
        y0.m11056f(null, listM7341b.size() <= 1);
        if (listM7341b.size() == 1) {
            return (v0) listM7341b.get(0);
        }
        return null;
    }

    @Override // c0.a2
    /* renamed from: d */
    public final void mo2143d(b2 b2Var) {
        o7.m11806a();
        if (m13636w(b2Var)) {
            return;
        }
        this.f34810d.put(b2Var, Boolean.TRUE);
        v0 v0VarM13633u = m13633u(b2Var);
        if (v0VarM13633u != null) {
            C6069j c6069j = (C6069j) this.f34808b.get(b2Var);
            Objects.requireNonNull(c6069j);
            m13632t(c6069j, v0VarM13633u, b2Var.f5059n);
        }
    }

    @Override // c0.a2
    /* renamed from: e */
    public final void mo2144e(b2 b2Var) {
        v0 v0VarM13633u;
        o7.m11806a();
        C6069j c6069j = (C6069j) this.f34808b.get(b2Var);
        Objects.requireNonNull(c6069j);
        if (m13636w(b2Var) && (v0VarM13633u = m13633u(b2Var)) != null) {
            m13632t(c6069j, v0VarM13633u, b2Var.f5059n);
        }
    }

    @Override // c0.a2
    /* renamed from: g */
    public final void mo2145g(b2 b2Var) {
        o7.m11806a();
        if (m13636w(b2Var)) {
            C6069j c6069j = (C6069j) this.f34808b.get(b2Var);
            Objects.requireNonNull(c6069j);
            v0 v0VarM13633u = m13633u(b2Var);
            if (v0VarM13633u != null) {
                m13632t(c6069j, v0VarM13633u, b2Var.f5059n);
                return;
            }
            o7.m11806a();
            c6069j.m12074a();
            c6069j.f29604l.mo7416a();
        }
    }

    @Override // c0.a2
    /* renamed from: r */
    public final void mo2146r(b2 b2Var) {
        o7.m11806a();
        if (m13636w(b2Var)) {
            this.f34810d.put(b2Var, Boolean.FALSE);
            C6069j c6069j = (C6069j) this.f34808b.get(b2Var);
            Objects.requireNonNull(c6069j);
            o7.m11806a();
            c6069j.m12074a();
            c6069j.f29604l.mo7416a();
        }
    }

    /* renamed from: s */
    public final C6698b m13634s(b2 b2Var, C7292b c7292b, g0 g0Var, C6069j c6069j, int i10, boolean z6) {
        int iMo7329l = g0Var.mo2207c().mo7329l(i10);
        Matrix matrix = c6069j.f29594b;
        RectF rectF = AbstractC3506f.f18377a;
        float[] fArr = {DefinitionKt.NO_Float_VALUE, 1.0f, 1.0f, DefinitionKt.NO_Float_VALUE};
        matrix.mapVectors(fArr);
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = (f10 * f12) + (f6 * f11);
        float f14 = (f6 * f12) - (f10 * f11);
        double dSqrt = Math.sqrt((f10 * f10) + (f6 * f6)) * Math.sqrt((f12 * f12) + (f11 * f11));
        boolean z10 = ((float) Math.toDegrees(Math.atan2(((double) f14) / dSqrt, ((double) f13) / dSqrt))) > DefinitionKt.NO_Float_VALUE;
        w2 w2Var = (w2) this.f34816k.get(b2Var);
        Objects.requireNonNull(w2Var);
        C7291a c7291aM13621b = c7292b.m13621b(w2Var, c6069j.f29596d, AbstractC3506f.m8067b(c6069j.f29594b), z6);
        Rect rect = c7291aM13621b.f34771a;
        Size size = c7291aM13621b.f34772b;
        int iMo7329l2 = this.f34812f.mo2207c().mo7329l(((b1) b2Var.f5052g).m7300C());
        C7296f c7296f = (C7296f) this.f34809c.get(b2Var);
        Objects.requireNonNull(c7296f);
        c7296f.f34805c.f34820c = iMo7329l2;
        int iM8072g = AbstractC3506f.m8072g((c6069j.f29601i + iMo7329l2) - iMo7329l);
        return new C6698b(UUID.randomUUID(), b2Var instanceof k1 ? 1 : b2Var instanceof c0.v0 ? 4 : 2, b2Var instanceof c0.v0 ? 256 : 34, rect, AbstractC3506f.m8071f(size, iM8072g), iM8072g, b2Var.m2162m(g0Var) ^ z10);
    }

    /* renamed from: v */
    public final HashMap m13635v(C6069j c6069j, boolean z6) {
        HashMap map = new HashMap();
        Iterator it = this.f34807a.iterator();
        while (it.hasNext()) {
            b2 b2Var = (b2) it.next();
            w2 w2Var = (w2) this.f34816k.get(b2Var);
            Objects.requireNonNull(w2Var);
            Size size = this.f34817l.m13621b(w2Var, c6069j.f29596d, AbstractC3506f.m8067b(c6069j.f29594b), z6).f34773c;
            map.put(b2Var, size);
            Objects.toString(size);
            Objects.toString(b2Var);
            u1.m10942a("VirtualCameraAdapter");
        }
        return map;
    }

    /* renamed from: w */
    public final boolean m13636w(b2 b2Var) {
        Boolean bool = (Boolean) this.f34810d.get(b2Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* renamed from: x */
    public final void m13637x(HashMap map, HashMap map2) {
        HashMap map3 = this.f34808b;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            b2 b2Var = (b2) entry.getKey();
            C6069j c6069j = (C6069j) entry.getValue();
            b2Var.mo2147A(c6069j.f29596d);
            b2Var.mo2175z(c6069j.f29594b);
            i2 i2VarM7363b = c6069j.f29599g.m7363b();
            Size size = (Size) map2.get(b2Var);
            if (size != null) {
                i2VarM7363b.f25539b = size;
            }
            b2Var.f5053h = b2Var.mo2173x(i2VarM7363b.m10246c(), null);
            b2Var.m2166q();
        }
    }
}
