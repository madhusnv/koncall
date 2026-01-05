package u0;

import a1.C0027z;
import a1.RunnableC0024w;
import a1.RunnableC0025x;
import a9.C0073l;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import be.C0655j;
import c0.C0830w;
import c0.C0833z;
import c0.a0;
import c0.b2;
import i0.AbstractC3084o;
import i0.C3082m;
import i0.a1;
import i0.b1;
import i0.c2;
import i0.e0;
import i0.g0;
import i0.g2;
import i0.j1;
import i0.j2;
import i0.o1;
import i0.q0;
import i0.s0;
import i0.v2;
import i0.w2;
import i0.z2;
import j0.AbstractC3506f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import l4.C4367l;
import mk.C4764c;
import og.u1;
import og.y0;
import p013o.i2;
import pg.o7;
import q0.C6062c;
import q0.C6069j;
import q0.C6072m;
import q0.InterfaceC6071l;
import r0.C6410a;
import r0.C6411b;
import r0.C6414e;
import r0.RunnableC6415f;
import s0.C6698b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u0.d */
/* loaded from: classes.dex */
public final class C7294d extends b2 {

    /* renamed from: A */
    public i0.b2 f34788A;

    /* renamed from: B */
    public c2 f34789B;

    /* renamed from: p */
    public final C7295e f34790p;

    /* renamed from: q */
    public final C7297g f34791q;

    /* renamed from: r */
    public final C0833z f34792r;

    /* renamed from: s */
    public final C0833z f34793s;

    /* renamed from: t */
    public C4367l f34794t;

    /* renamed from: u */
    public C0073l f34795u;

    /* renamed from: v */
    public C6069j f34796v;

    /* renamed from: w */
    public C6069j f34797w;

    /* renamed from: x */
    public C6069j f34798x;

    /* renamed from: y */
    public C6069j f34799y;

    /* renamed from: z */
    public i0.b2 f34800z;

    public C7294d(g0 g0Var, g0 g0Var2, C0833z c0833z, C0833z c0833z2, HashSet hashSet, z2 z2Var) {
        super(m13627I(hashSet));
        this.f34790p = m13627I(hashSet);
        this.f34792r = c0833z;
        this.f34793s = c0833z2;
        this.f34791q = new C7297g(g0Var, g0Var2, hashSet, z2Var, new C4764c(14));
        HashSet hashSet2 = ((b2) hashSet.iterator().next()).f5051f;
        this.f5051f = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    /* renamed from: H */
    public static ArrayList m13626H(b2 b2Var) {
        ArrayList arrayList = new ArrayList();
        if (!(b2Var instanceof C7294d)) {
            arrayList.add(b2Var.f5052g.mo7421E());
            return arrayList;
        }
        Iterator it = ((C7294d) b2Var).f34791q.f34807a.iterator();
        while (it.hasNext()) {
            arrayList.add(((b2) it.next()).f5052g.mo7421E());
        }
        return arrayList;
    }

    /* renamed from: I */
    public static C7295e m13627I(HashSet hashSet) {
        j1 j1VarM7349b = j1.m7349b();
        new C0830w(j1VarM7349b);
        j1VarM7349b.m7352n(a1.f44329d0, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            b2 b2Var = (b2) it.next();
            if (b2Var.f5052g.mo7404i(w2.C0)) {
                arrayList.add(b2Var.f5052g.mo7421E());
            }
        }
        j1VarM7349b.m7352n(C7295e.f34801b, arrayList);
        j1VarM7349b.m7352n(b1.f44335k0, 2);
        j1VarM7349b.m7352n(w2.G0, j2.PREVIEW_VIDEO_STILL);
        return new C7295e(o1.m7399a(j1VarM7349b));
    }

    /* renamed from: D */
    public final void m13628D() {
        c2 c2Var = this.f34789B;
        if (c2Var != null) {
            c2Var.m7307b();
            this.f34789B = null;
        }
        C6069j c6069j = this.f34796v;
        if (c6069j != null) {
            c6069j.m12075b();
            this.f34796v = null;
        }
        C6069j c6069j2 = this.f34797w;
        if (c6069j2 != null) {
            c6069j2.m12075b();
            this.f34797w = null;
        }
        C6069j c6069j3 = this.f34798x;
        if (c6069j3 != null) {
            c6069j3.m12075b();
            this.f34798x = null;
        }
        C6069j c6069j4 = this.f34799y;
        if (c6069j4 != null) {
            c6069j4.m12075b();
            this.f34799y = null;
        }
        C4367l c4367l = this.f34794t;
        if (c4367l != null) {
            ((C6062c) c4367l.f21921b).mo12065a();
            o7.m11809d(new RunnableC0024w(26, c4367l));
            this.f34794t = null;
        }
        C0073l c0073l = this.f34795u;
        if (c0073l != null) {
            ((InterfaceC6071l) c0073l.f264a).mo12065a();
            o7.m11809d(new RunnableC0024w(28, c0073l));
            this.f34795u = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public final List m13629E(String str, String str2, w2 w2Var, C3082m c3082m, C3082m c3082m2) {
        boolean z6;
        String str3 = "DualSurfaceProcessorNode";
        a0 a0Var = c3082m.f16524c;
        o7.m11806a();
        C7297g c7297g = this.f34791q;
        if (c3082m2 == null) {
            m13630F(str, str2, w2Var, c3082m, null);
            g0 g0VarM2152c = m2152c();
            Objects.requireNonNull(g0VarM2152c);
            this.f34794t = new C4367l(g0VarM2152c, new C6062c(a0Var));
            boolean z10 = this.f5055j != null;
            C6069j c6069j = this.f34798x;
            int iM7300C = ((b1) this.f5052g).m7300C();
            c7297g.getClass();
            HashMap map = new HashMap();
            Iterator it = c7297g.f34807a.iterator();
            while (it.hasNext()) {
                b2 b2Var = (b2) it.next();
                C7292b c7292b = c7297g.f34817l;
                g0 g0Var = c7297g.f34812f;
                C7297g c7297g2 = c7297g;
                boolean z11 = z10;
                map.put(b2Var, c7297g2.m13634s(b2Var, c7292b, g0Var, c6069j, iM7300C, z11));
                z10 = z11;
                c7297g = c7297g2;
            }
            C7297g c7297g3 = c7297g;
            boolean z12 = z10;
            C4367l c4367l = this.f34794t;
            C6069j c6069j2 = this.f34798x;
            ArrayList arrayList = new ArrayList(map.values());
            if (c6069j2 == null) {
                throw new NullPointerException("Null surfaceEdge");
            }
            c4367l.getClass();
            o7.m11806a();
            c4367l.f21923d = new C6072m();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                int i11 = i10 + 1;
                C6698b c6698b = (C6698b) obj;
                C6072m c6072m = (C6072m) c4367l.f21923d;
                Rect rect = c6698b.f32012d;
                int i12 = c6698b.f32014f;
                boolean z13 = c6698b.f32015g;
                Matrix matrix = new Matrix(c6069j2.f29594b);
                RectF rectF = new RectF(rect);
                ArrayList arrayList2 = arrayList;
                Size size2 = c6698b.f32013e;
                RectF rectF2 = AbstractC3506f.f18377a;
                int i13 = size;
                HashMap map2 = map;
                float f6 = 0;
                matrix.postConcat(AbstractC3506f.m8066a(rectF, new RectF(f6, f6, size2.getWidth(), size2.getHeight()), i12, z13));
                y0.m11052b(AbstractC3506f.m8069d(AbstractC3506f.m8071f(AbstractC3506f.m8070e(rect), i12), false, size2));
                Rect rect2 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
                i2 i2VarM7363b = c6069j2.f29599g.m7363b();
                i2VarM7363b.f25538a = size2;
                c6072m.put(c6698b, new C6069j(c6698b.f32010b, c6698b.f32011c, i2VarM7363b.m10246c(), matrix, false, rect2, c6069j2.f29601i - i12, -1, c6069j2.f29597e != z13));
                arrayList = arrayList2;
                size = i13;
                i10 = i11;
                map = map2;
            }
            HashMap map3 = map;
            try {
                ((C6062c) c4367l.f21921b).mo12066b(c6069j2.m12076c((g0) c4367l.f21922c, true));
            } catch (ProcessingException unused) {
                u1.m10944c("SurfaceProcessorNode");
            }
            for (Map.Entry entry : ((C6072m) c4367l.f21923d).entrySet()) {
                c4367l.m9131e(c6069j2, entry);
                C6069j c6069j3 = (C6069j) entry.getValue();
                RunnableC0025x runnableC0025x = new RunnableC0025x(16, c4367l, c6069j2, entry);
                c6069j3.getClass();
                o7.m11806a();
                c6069j3.m12074a();
                c6069j3.f29605m.add(runnableC0025x);
            }
            c6069j2.f29607o.add(new C0027z(3, (C6072m) c4367l.f21923d));
            C6072m c6072m2 = (C6072m) c4367l.f21923d;
            HashMap map4 = new HashMap();
            for (Map.Entry entry2 : map3.entrySet()) {
                map4.put((b2) entry2.getKey(), (C6069j) c6072m2.get(entry2.getValue()));
            }
            c7297g3.m13637x(map4, c7297g3.m13635v(this.f34798x, z12));
            Object[] objArr = {this.f34800z.m7305d()};
            ArrayList arrayList3 = new ArrayList(1);
            Object obj2 = objArr[0];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
            return Collections.unmodifiableList(arrayList3);
        }
        m13630F(str, str2, w2Var, c3082m, c3082m2);
        Matrix matrix2 = this.f5056k;
        g0 g0VarM2158i = m2158i();
        Objects.requireNonNull(g0VarM2158i);
        boolean zMo7317o = g0VarM2158i.mo7317o();
        Size size3 = c3082m2.f16522a;
        Rect rect3 = this.f5055j;
        if (rect3 != null) {
            z6 = false;
        } else {
            z6 = false;
            rect3 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
        }
        Rect rect4 = rect3;
        g0 g0VarM2158i2 = m2158i();
        Objects.requireNonNull(g0VarM2158i2);
        int iM2157h = m2157h(g0VarM2158i2, z6);
        g0 g0VarM2158i3 = m2158i();
        Objects.requireNonNull(g0VarM2158i3);
        C6069j c6069j4 = new C6069j(3, 34, c3082m2, matrix2, zMo7317o, rect4, iM2157h, -1, m2162m(g0VarM2158i3));
        this.f34797w = c6069j4;
        Objects.requireNonNull(m2158i());
        this.f34799y = c6069j4;
        i0.b2 b2VarM13631G = m13631G(this.f34797w, w2Var, c3082m2);
        this.f34788A = b2VarM13631G;
        c2 c2Var = this.f34789B;
        if (c2Var != null) {
            c2Var.m7307b();
        }
        c2 c2Var2 = new c2(new C7293c(this, str, str2, w2Var, c3082m, c3082m2));
        this.f34789B = c2Var2;
        b2VarM13631G.f16429f = c2Var2;
        g0 g0VarM2152c2 = m2152c();
        g0 g0VarM2158i4 = m2158i();
        C6414e c6414e = new C6414e(a0Var, this.f34792r, this.f34793s);
        C0073l c0073l = new C0073l();
        c0073l.f265b = g0VarM2152c2;
        c0073l.f266c = g0VarM2158i4;
        c0073l.f264a = c6414e;
        this.f34795u = c0073l;
        boolean z14 = this.f5055j != null;
        C6069j c6069j5 = this.f34798x;
        C6069j c6069j6 = this.f34799y;
        int iM7300C2 = ((b1) this.f5052g).m7300C();
        c7297g.getClass();
        HashMap map5 = new HashMap();
        Iterator it2 = c7297g.f34807a.iterator();
        while (it2.hasNext()) {
            b2 b2Var2 = (b2) it2.next();
            C6698b c6698bM13634s = c7297g.m13634s(b2Var2, c7297g.f34817l, c7297g.f34812f, c6069j5, iM7300C2, z14);
            C7292b c7292b2 = c7297g.f34818m;
            Objects.requireNonNull(c7292b2);
            g0 g0Var2 = c7297g.f34813g;
            Objects.requireNonNull(g0Var2);
            map5.put(b2Var2, new C6410a(c6698bM13634s, c7297g.m13634s(b2Var2, c7292b2, g0Var2, c6069j6, iM7300C2, z14)));
            c6069j5 = c6069j5;
        }
        C0073l c0073l2 = this.f34795u;
        C6411b c6411b = new C6411b(this.f34798x, this.f34799y, new ArrayList(map5.values()));
        c0073l2.getClass();
        InterfaceC6071l interfaceC6071l = (InterfaceC6071l) c0073l2.f264a;
        o7.m11806a();
        c0073l2.f268e = c6411b;
        c0073l2.f267d = new C6072m();
        C6411b c6411b2 = (C6411b) c0073l2.f268e;
        C6069j c6069j7 = c6411b2.f30921a;
        C6069j c6069j8 = c6411b2.f30922b;
        ArrayList arrayList4 = c6411b2.f30923c;
        int size4 = arrayList4.size();
        int i14 = 0;
        while (i14 < size4) {
            Object obj3 = arrayList4.get(i14);
            int i15 = i14 + 1;
            C6410a c6410a = (C6410a) obj3;
            C6072m c6072m3 = (C6072m) c0073l2.f267d;
            C6698b c6698b2 = c6410a.f30919a;
            Rect rect5 = c6698b2.f32012d;
            ArrayList arrayList5 = arrayList4;
            int i16 = c6698b2.f32014f;
            int i17 = size4;
            boolean z15 = c6698b2.f32015g;
            Matrix matrix3 = new Matrix();
            Size sizeM8071f = AbstractC3506f.m8071f(AbstractC3506f.m8070e(rect5), i16);
            Size size5 = c6698b2.f32013e;
            y0.m11052b(AbstractC3506f.m8069d(sizeM8071f, false, size5));
            HashMap map6 = map5;
            String str4 = str3;
            Rect rect6 = new Rect(0, 0, size5.getWidth(), size5.getHeight());
            i2 i2VarM7363b2 = c6069j7.f29599g.m7363b();
            i2VarM7363b2.f25538a = size5;
            c6072m3.put(c6410a, new C6069j(c6698b2.f32010b, c6698b2.f32011c, i2VarM7363b2.m10246c(), matrix3, false, rect6, c6069j7.f29601i - i16, -1, c6069j7.f29597e != z15));
            size4 = i17;
            i14 = i15;
            map5 = map6;
            arrayList4 = arrayList5;
            str3 = str4;
        }
        HashMap map7 = map5;
        String str5 = str3;
        try {
            interfaceC6071l.mo12066b(c6069j7.m12076c((g0) c0073l2.f265b, true));
        } catch (ProcessingException unused2) {
            u1.m10944c(str5);
        }
        try {
            interfaceC6071l.mo12066b(c6069j8.m12076c((g0) c0073l2.f266c, false));
        } catch (ProcessingException unused3) {
            u1.m10944c(str5);
        }
        g0 g0Var3 = (g0) c0073l2.f265b;
        g0 g0Var4 = (g0) c0073l2.f266c;
        for (Map.Entry entry3 : ((C6072m) c0073l2.f267d).entrySet()) {
            C6069j c6069j9 = c6069j7;
            C6069j c6069j10 = c6069j8;
            c0073l2.m224p(g0Var3, g0Var4, c6069j9, c6069j10, entry3);
            C6069j c6069j11 = (C6069j) entry3.getValue();
            g0 g0Var5 = g0Var4;
            g0 g0Var6 = g0Var3;
            C0073l c0073l3 = c0073l2;
            RunnableC6415f runnableC6415f = new RunnableC6415f(c0073l3, g0Var6, g0Var5, c6069j9, c6069j10, entry3, 0);
            c0073l2 = c0073l3;
            g0Var3 = g0Var6;
            g0Var4 = g0Var5;
            c6069j11.getClass();
            o7.m11806a();
            c6069j11.m12074a();
            c6069j11.f29605m.add(runnableC6415f);
            c6069j7 = c6069j9;
            c6069j8 = c6069j10;
        }
        C6072m c6072m4 = (C6072m) c0073l2.f267d;
        HashMap map8 = new HashMap();
        for (Map.Entry entry4 : map7.entrySet()) {
            map8.put((b2) entry4.getKey(), (C6069j) c6072m4.get(entry4.getValue()));
        }
        c7297g.m13637x(map8, c7297g.m13635v(this.f34798x, z14));
        Object[] objArr2 = {this.f34800z.m7305d(), this.f34788A.m7305d()};
        ArrayList arrayList6 = new ArrayList(2);
        for (int i18 = 0; i18 < 2; i18++) {
            Object obj4 = objArr2[i18];
            Objects.requireNonNull(obj4);
            arrayList6.add(obj4);
        }
        return Collections.unmodifiableList(arrayList6);
    }

    /* renamed from: F */
    public final void m13630F(String str, String str2, w2 w2Var, C3082m c3082m, C3082m c3082m2) {
        Matrix matrix = this.f5056k;
        g0 g0VarM2152c = m2152c();
        Objects.requireNonNull(g0VarM2152c);
        boolean zMo7317o = g0VarM2152c.mo7317o();
        Size size = c3082m.f16522a;
        Rect rect = this.f5055j;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        g0 g0VarM2152c2 = m2152c();
        Objects.requireNonNull(g0VarM2152c2);
        int iM2157h = m2157h(g0VarM2152c2, false);
        g0 g0VarM2152c3 = m2152c();
        Objects.requireNonNull(g0VarM2152c3);
        C6069j c6069j = new C6069j(3, 34, c3082m, matrix, zMo7317o, rect, iM2157h, -1, m2162m(g0VarM2152c3));
        this.f34796v = c6069j;
        Objects.requireNonNull(m2152c());
        this.f34798x = c6069j;
        i0.b2 b2VarM13631G = m13631G(this.f34796v, w2Var, c3082m);
        this.f34800z = b2VarM13631G;
        c2 c2Var = this.f34789B;
        if (c2Var != null) {
            c2Var.m7307b();
        }
        c2 c2Var2 = new c2(new C7293c(this, str, str2, w2Var, c3082m, c3082m2));
        this.f34789B = c2Var2;
        b2VarM13631G.f16429f = c2Var2;
    }

    /* renamed from: G */
    public final i0.b2 m13631G(C6069j c6069j, w2 w2Var, C3082m c3082m) {
        i0.b2 b2VarM7301e = i0.b2.m7301e(w2Var, c3082m.f16522a);
        C0655j c0655j = b2VarM7301e.f16425b;
        C7297g c7297g = this.f34791q;
        Iterator it = c7297g.f34807a.iterator();
        int i10 = -1;
        while (it.hasNext()) {
            int i11 = ((g2) ((b2) it.next()).f5052g.mo7406k(w2.f44343r0)).f16473g.f16567c;
            List list = g2.f16466j;
            if (list.indexOf(Integer.valueOf(i10)) < list.indexOf(Integer.valueOf(i11))) {
                i10 = i11;
            }
        }
        if (i10 != -1) {
            c0655j.f4191a = i10;
        }
        Size size = c3082m.f16522a;
        Iterator it2 = c7297g.f34807a.iterator();
        while (it2.hasNext()) {
            g2 g2VarM7305d = i0.b2.m7301e(((b2) it2.next()).f5052g, size).m7305d();
            q0 q0Var = g2VarM7305d.f16473g;
            c0655j.m1873c(q0Var.f16568d);
            List<AbstractC3084o> list2 = g2VarM7305d.f16471e;
            ArrayList arrayList = b2VarM7301e.f16428e;
            for (AbstractC3084o abstractC3084o : list2) {
                c0655j.m1874d(abstractC3084o);
                if (!arrayList.contains(abstractC3084o)) {
                    arrayList.add(abstractC3084o);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : g2VarM7305d.f16470d) {
                ArrayList arrayList2 = b2VarM7301e.f16427d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : g2VarM7305d.f16469c) {
                ArrayList arrayList3 = b2VarM7301e.f16426c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            c0655j.m1875e(q0Var.f16566b);
        }
        c6069j.getClass();
        o7.m11806a();
        c6069j.m12074a();
        y0.m11056f("Consumer can only be linked once.", !c6069j.f29602j);
        c6069j.f29602j = true;
        b2VarM7301e.m7304c(c6069j.f29604l, c3082m.f16524c, -1);
        c0655j.m1874d(c7297g.f34814h);
        s0 s0Var = c3082m.f16527f;
        if (s0Var != null) {
            c0655j.m1875e(s0Var);
        }
        b2VarM7301e.f16431h = c3082m.f16525d;
        m2150a(b2VarM7301e, c3082m);
        return b2VarM7301e;
    }

    @Override // c0.b2
    /* renamed from: f */
    public final w2 mo2155f(boolean z6, z2 z2Var) {
        C7295e c7295e = this.f34790p;
        s0 s0VarMo7431a = z2Var.mo7431a(c7295e.mo7421E(), 1);
        if (z6) {
            s0VarMo7431a = s0.m7414Q(s0VarMo7431a, c7295e.f34802a);
        }
        if (s0VarMo7431a == null) {
            return null;
        }
        return ((C0830w) mo2161l(s0VarMo7431a)).mo1514b();
    }

    @Override // c0.b2
    /* renamed from: j */
    public final Set mo2159j(e0 e0Var) {
        HashSet hashSet = this.f34791q.f34807a;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set setMo2159j = ((b2) it.next()).mo2159j(e0Var);
            if (setMo2159j != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setMo2159j);
                } else {
                    hashSet2.retainAll(setMo2159j);
                }
            }
        }
        return hashSet2;
    }

    @Override // c0.b2
    /* renamed from: k */
    public final Set mo2160k() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // c0.b2
    /* renamed from: l */
    public final v2 mo2161l(s0 s0Var) {
        return new C0830w(j1.m7350g(s0Var));
    }

    @Override // c0.b2
    /* renamed from: r */
    public final void mo2167r() {
        C7297g c7297g = this.f34791q;
        Iterator it = c7297g.f34807a.iterator();
        while (it.hasNext()) {
            b2 b2Var = (b2) it.next();
            C7296f c7296f = (C7296f) c7297g.f34809c.get(b2Var);
            Objects.requireNonNull(c7296f);
            b2Var.m2151b(c7296f, null, null, b2Var.mo2155f(true, c7297g.f34811e));
        }
    }

    @Override // c0.b2
    /* renamed from: s */
    public final void mo2168s() {
        Iterator it = this.f34791q.f34807a.iterator();
        while (it.hasNext()) {
            ((b2) it.next()).mo2168s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    @Override // c0.b2
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i0.w2 mo2169t(i0.e0 r17, i0.v2 r18) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C7294d.mo2169t(i0.e0, i0.v2):i0.w2");
    }

    @Override // c0.b2
    /* renamed from: u */
    public final void mo2170u() {
        Iterator it = this.f34791q.f34807a.iterator();
        while (it.hasNext()) {
            ((b2) it.next()).mo2170u();
        }
    }

    @Override // c0.b2
    /* renamed from: v */
    public final void mo2171v() {
        Iterator it = this.f34791q.f34807a.iterator();
        while (it.hasNext()) {
            ((b2) it.next()).mo2171v();
        }
    }

    @Override // c0.b2
    /* renamed from: w */
    public final C3082m mo2172w(s0 s0Var) {
        this.f34800z.m7303b(s0Var);
        Object[] objArr = {this.f34800z.m7305d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2149C(Collections.unmodifiableList(arrayList));
        i2 i2VarM7363b = this.f5053h.m7363b();
        i2VarM7363b.f25543f = s0Var;
        return i2VarM7363b.m10246c();
    }

    @Override // c0.b2
    /* renamed from: x */
    public final C3082m mo2173x(C3082m c3082m, C3082m c3082m2) {
        c3082m.toString();
        Objects.toString(c3082m2);
        u1.m10942a("StreamSharing");
        m2149C(m13629E(m2154e(), m2158i() == null ? null : m2158i().mo7319q().mo7323e(), this.f5052g, c3082m, c3082m2));
        m2164o();
        return c3082m;
    }

    @Override // c0.b2
    /* renamed from: y */
    public final void mo2174y() {
        m13628D();
        C7297g c7297g = this.f34791q;
        Iterator it = c7297g.f34807a.iterator();
        while (it.hasNext()) {
            b2 b2Var = (b2) it.next();
            C7296f c7296f = (C7296f) c7297g.f34809c.get(b2Var);
            Objects.requireNonNull(c7296f);
            b2Var.m2148B(c7296f);
        }
    }
}
