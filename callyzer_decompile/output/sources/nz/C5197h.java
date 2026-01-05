package nz;

import b00.AbstractC0517b;
import com.amplifyframework.storage.ObjectMetadata;
import iz.AbstractC3386s;
import iz.i0;
import iz.j0;
import iz.k0;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import oz.C5784g;
import oz.InterfaceC5780c;
import oz.InterfaceC5781d;
import p020v.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.h */
/* loaded from: classes3.dex */
public final class C5197h {

    /* renamed from: a */
    public final C5205p f25338a;

    /* renamed from: b */
    public final AbstractC3386s f25339b;

    /* renamed from: c */
    public final InterfaceC5198i f25340c;

    /* renamed from: d */
    public final InterfaceC5781d f25341d;

    /* renamed from: e */
    public boolean f25342e;

    /* renamed from: f */
    public boolean f25343f;

    public C5197h(C5205p c5205p, AbstractC3386s eventListener, InterfaceC5198i finder, InterfaceC5781d interfaceC5781d) {
        AbstractC4154l.m8923f(eventListener, "eventListener");
        AbstractC4154l.m8923f(finder, "finder");
        this.f25338a = c5205p;
        this.f25339b = eventListener;
        this.f25340c = finder;
        this.f25341d = interfaceC5781d;
    }

    /* renamed from: a */
    public static IOException m10181a(C5197h c5197h, long j6, IOException iOException, int i10) {
        boolean z6 = (i10 & 2) == 0;
        boolean z10 = (i10 & 4) == 0;
        AbstractC3386s abstractC3386s = c5197h.f25339b;
        C5205p c5205p = c5197h.f25338a;
        if (iOException != null) {
            c5197h.m10186f(iOException);
        }
        if (z10) {
            if (iOException != null) {
                abstractC3386s.mo7776r(c5205p, iOException);
            } else {
                abstractC3386s.mo7774p(c5205p, j6);
            }
        }
        if (z6) {
            if (iOException != null) {
                abstractC3386s.mo7781w(c5205p, iOException);
            } else {
                abstractC3386s.mo7779u(c5205p, j6);
            }
        }
        return c5205p.m10194e(c5197h, z10, z6, iOException);
    }

    /* renamed from: b */
    public final C5195f m10182b(x0 request, boolean z6) {
        AbstractC4154l.m8923f(request, "request");
        this.f25342e = z6;
        i0 i0Var = (i0) request.f36757e;
        AbstractC4154l.m8920c(i0Var);
        long jMo7445a = i0Var.mo7445a();
        this.f25339b.mo7775q(this.f25338a);
        return new C5195f(this, this.f25341d.mo11316d(request, jMo7445a), jMo7445a);
    }

    /* renamed from: c */
    public final C5206q m10183c() {
        InterfaceC5780c interfaceC5780cMo11320h = this.f25341d.mo11320h();
        C5206q c5206q = interfaceC5780cMo11320h instanceof C5206q ? (C5206q) interfaceC5780cMo11320h : null;
        if (c5206q != null) {
            return c5206q;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    /* renamed from: d */
    public final C5784g m10184d(k0 k0Var) throws IOException {
        InterfaceC5781d interfaceC5781d = this.f25341d;
        try {
            String strM7787b = k0Var.f17922f.m7787b(ObjectMetadata.CONTENT_TYPE);
            if (strM7787b == null) {
                strM7787b = null;
            }
            long jMo11313a = interfaceC5781d.mo11313a(k0Var);
            return new C5784g(strM7787b, jMo11313a, AbstractC0517b.m1524c(new C5196g(this, interfaceC5781d.mo11317e(k0Var), jMo11313a)));
        } catch (IOException e2) {
            this.f25339b.mo7781w(this.f25338a, e2);
            m10186f(e2);
            throw e2;
        }
    }

    /* renamed from: e */
    public final j0 m10185e(boolean z6) throws IOException {
        try {
            j0 j0VarMo11318f = this.f25341d.mo11318f(z6);
            if (j0VarMo11318f == null) {
                return j0VarMo11318f;
            }
            j0VarMo11318f.f17911m = this;
            return j0VarMo11318f;
        } catch (IOException e2) {
            this.f25339b.mo7781w(this.f25338a, e2);
            m10186f(e2);
            throw e2;
        }
    }

    /* renamed from: f */
    public final void m10186f(IOException iOException) {
        this.f25343f = true;
        this.f25341d.mo11320h().mo10167b(this.f25338a, iOException);
    }
}
