package i00;

import a1.C0005d;
import a9.C0073l;
import b00.C0526k;
import b00.C0529n;
import c9.C0908c;
import c9.C0917l;
import com.amplifyframework.storage.ObjectMetadata;
import com.sun.mail.util.AbstractC1452a;
import eb.i3;
import iz.C3387t;
import iz.C3390w;
import iz.C3391x;
import iz.C3393z;
import iz.InterfaceC3371d;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import nz.C5205p;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.x0;
import pg.i7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.x */
/* loaded from: classes3.dex */
public final class C3119x implements InterfaceC3099d {

    /* renamed from: a */
    public final o0 f16763a;

    /* renamed from: b */
    public final Object f16764b;

    /* renamed from: c */
    public final Object[] f16765c;

    /* renamed from: d */
    public final InterfaceC3371d f16766d;

    /* renamed from: e */
    public final InterfaceC3106k f16767e;

    /* renamed from: f */
    public volatile boolean f16768f;

    /* renamed from: g */
    public C5205p f16769g;

    /* renamed from: h */
    public Throwable f16770h;

    /* renamed from: j */
    public boolean f16771j;

    public C3119x(o0 o0Var, Object obj, Object[] objArr, InterfaceC3371d interfaceC3371d, InterfaceC3106k interfaceC3106k) {
        this.f16763a = o0Var;
        this.f16764b = obj;
        this.f16765c = objArr;
        this.f16766d = interfaceC3371d;
        this.f16767e = interfaceC3106k;
    }

    /* renamed from: a */
    public final C5205p m7480a() {
        C3391x c3391xM7793a;
        o0 o0Var = this.f16763a;
        w0[] w0VarArr = o0Var.f16726k;
        Object[] objArr = this.f16765c;
        int length = objArr.length;
        if (length != w0VarArr.length) {
            throw new IllegalArgumentException(AbstractC5601a.m11233d(w0VarArr.length, ")", AbstractC1452a.m4567n(length, "Argument count (", ") doesn't match expected count (")));
        }
        m0 m0Var = new m0(o0Var.f16719d, o0Var.f16718c, o0Var.f16720e, o0Var.f16721f, o0Var.f16722g, o0Var.f16723h, o0Var.f16724i, o0Var.f16725j);
        if (o0Var.f16727l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            w0VarArr[i10].mo7438a(m0Var, objArr[i10]);
        }
        C3390w c3390w = m0Var.f16679d;
        if (c3390w != null) {
            c3391xM7793a = c3390w.m7793a();
        } else {
            String link = m0Var.f16678c;
            C3391x c3391x = m0Var.f16677b;
            c3391x.getClass();
            AbstractC4154l.m8923f(link, "link");
            C3390w c3390wM7801f = c3391x.m7801f(link);
            c3391xM7793a = c3390wM7801f != null ? c3390wM7801f.m7793a() : null;
            if (c3391xM7793a == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c3391x + ", Relative: " + m0Var.f16678c);
            }
        }
        iz.i0 l0Var = m0Var.f16686k;
        if (l0Var == null) {
            C0917l c0917l = m0Var.f16685j;
            if (c0917l != null) {
                l0Var = new C3387t((ArrayList) c0917l.f5594b, (ArrayList) c0917l.f5595c);
            } else {
                C0005d c0005d = m0Var.f16684i;
                if (c0005d != null) {
                    ArrayList arrayList2 = (ArrayList) c0005d.f24b;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    l0Var = new iz.b0((C0529n) c0005d.f25c, (C3393z) c0005d.f26d, AbstractC4299e.m9021j(arrayList2));
                } else if (m0Var.f16683h) {
                    int i11 = iz.i0.f17889a;
                    l0Var = i7.m11696a(0, new byte[0]);
                }
            }
        }
        C3393z c3393z = m0Var.f16682g;
        i3 i3Var = m0Var.f16681f;
        if (c3393z != null) {
            if (l0Var != null) {
                l0Var = new l0(l0Var, c3393z);
            } else {
                i3Var.m5723a(ObjectMetadata.CONTENT_TYPE, c3393z.f18002a);
            }
        }
        C0073l c0073l = m0Var.f16680e;
        c0073l.getClass();
        c0073l.f264a = c3391xM7793a;
        c0073l.f266c = i3Var.m5727e().m7789j();
        c0073l.m196E(m0Var.f16676a, l0Var);
        c0073l.m204N(C3113r.class, new C3113r(o0Var.f16716a, this.f16764b, o0Var.f16717b, arrayList));
        x0 x0Var = new x0(c0073l);
        iz.d0 d0Var = (iz.d0) this.f16766d;
        d0Var.getClass();
        return new C5205p(d0Var, x0Var);
    }

    /* renamed from: b */
    public final C5205p m7481b() throws IOException {
        C5205p c5205p = this.f16769g;
        if (c5205p != null) {
            return c5205p;
        }
        Throwable th2 = this.f16770h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            C5205p c5205pM7480a = m7480a();
            this.f16769g = c5205pM7480a;
            return c5205pM7480a;
        } catch (IOException | Error | RuntimeException e2) {
            w0.m7478q(e2);
            this.f16770h = e2;
            throw e2;
        }
    }

    /* renamed from: c */
    public final p0 m7482c(iz.k0 k0Var) throws IOException {
        iz.n0 n0Var = k0Var.f17923g;
        iz.j0 j0VarM7739h = k0Var.m7739h();
        j0VarM7739h.f17905g = new C3118w(n0Var.mo7461j(), n0Var.mo7460h());
        iz.k0 k0VarM7732a = j0VarM7739h.m7732a();
        int i10 = k0VarM7732a.f17920d;
        if (i10 < 200 || i10 >= 300) {
            try {
                C0526k c0526k = new C0526k();
                n0Var.mo7462n().l0(c0526k);
                C3393z c3393zMo7461j = n0Var.mo7461j();
                long jMo7460h = n0Var.mo7460h();
                iz.m0 m0Var = iz.n0.f17961b;
                iz.m0 m0Var2 = new iz.m0(c3393zMo7461j, jMo7460h, c0526k);
                if (k0VarM7732a.f17932r) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new p0(k0VarM7732a, null, m0Var2);
            } finally {
                n0Var.close();
            }
        }
        if (i10 == 204 || i10 == 205) {
            n0Var.close();
            return p0.m7458b(null, k0VarM7732a);
        }
        C3117v c3117v = new C3117v(n0Var);
        try {
            return p0.m7458b(this.f16767e.mo2700b(c3117v), k0VarM7732a);
        } catch (RuntimeException e2) {
            IOException iOException = c3117v.f16756e;
            if (iOException == null) {
                throw e2;
            }
            throw iOException;
        }
    }

    @Override // i00.InterfaceC3099d
    public final void cancel() {
        C5205p c5205p;
        this.f16768f = true;
        synchronized (this) {
            c5205p = this.f16769g;
        }
        if (c5205p != null) {
            c5205p.cancel();
        }
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: clone */
    public final InterfaceC3099d m16706clone() {
        return new C3119x(this.f16763a, this.f16764b, this.f16765c, this.f16766d, this.f16767e);
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: h */
    public final boolean mo7441h() {
        boolean z6 = true;
        if (this.f16768f) {
            return true;
        }
        synchronized (this) {
            try {
                C5205p c5205p = this.f16769g;
                if (c5205p == null || !c5205p.f25373q) {
                    z6 = false;
                }
            } finally {
            }
        }
        return z6;
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: j */
    public final void mo7442j(InterfaceC3102g interfaceC3102g) {
        C5205p c5205p;
        Throwable th2;
        synchronized (this) {
            try {
                if (this.f16771j) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f16771j = true;
                c5205p = this.f16769g;
                th2 = this.f16770h;
                if (c5205p == null && th2 == null) {
                    try {
                        C5205p c5205pM7480a = m7480a();
                        this.f16769g = c5205pM7480a;
                        c5205p = c5205pM7480a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        w0.m7478q(th2);
                        this.f16770h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            interfaceC3102g.mo5819L(this, th2);
            return;
        }
        if (this.f16768f) {
            c5205p.cancel();
        }
        c5205p.m10191b(new C0908c(7, this, interfaceC3102g));
    }

    @Override // i00.InterfaceC3099d
    /* renamed from: u */
    public final synchronized x0 mo7443u() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return m7481b().f25360b;
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m16692clone() {
        return new C3119x(this.f16763a, this.f16764b, this.f16765c, this.f16766d, this.f16767e);
    }
}
