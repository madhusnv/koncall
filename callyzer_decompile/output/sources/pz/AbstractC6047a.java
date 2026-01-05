package pz;

import b00.C0526k;
import b00.C0535t;
import b00.i0;
import b00.k0;
import iz.C3381n;
import iz.C3389v;
import iz.C3391x;
import iz.d0;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import oz.AbstractC5782e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pz.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6047a implements i0 {

    /* renamed from: a */
    public final C3391x f29522a;

    /* renamed from: b */
    public final C0535t f29523b;

    /* renamed from: c */
    public boolean f29524c;

    /* renamed from: d */
    public final /* synthetic */ C6053g f29525d;

    public AbstractC6047a(C6053g c6053g, C3391x url) {
        AbstractC4154l.m8923f(url, "url");
        this.f29525d = c6053g;
        this.f29522a = url;
        this.f29523b = new C0535t(c6053g.f29541c.mo1532f());
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return this.f29523b;
    }

    @Override // b00.i0
    public long g0(C0526k sink, long j6) throws IOException {
        C6053g c6053g = this.f29525d;
        AbstractC4154l.m8923f(sink, "sink");
        try {
            return c6053g.f29541c.g0(sink, j6);
        } catch (IOException e2) {
            c6053g.f29540b.mo10171f();
            m12058h(C6053g.f29538g);
            throw e2;
        }
    }

    /* renamed from: h */
    public final void m12058h(C3389v trailers) {
        d0 d0Var;
        C3381n c3381n;
        AbstractC4154l.m8923f(trailers, "trailers");
        C6053g c6053g = this.f29525d;
        int i10 = c6053g.f29543e;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + c6053g.f29543e);
        }
        C0535t c0535t = this.f29523b;
        k0 k0Var = c0535t.f3666e;
        c0535t.f3666e = k0.f3639d;
        k0Var.mo1596a();
        k0Var.mo1597b();
        c6053g.f29543e = 6;
        if (trailers.size() <= 0 || (d0Var = c6053g.f29539a) == null || (c3381n = d0Var.f17843j) == null) {
            return;
        }
        AbstractC5782e.m11325d(c3381n, this.f29522a, trailers);
    }
}
