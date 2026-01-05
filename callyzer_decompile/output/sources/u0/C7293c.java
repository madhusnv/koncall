package u0;

import c0.b2;
import i0.C3082m;
import i0.d2;
import i0.e2;
import i0.g2;
import i0.w2;
import java.util.Iterator;
import pg.o7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u0.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C7293c implements d2 {

    /* renamed from: a */
    public final /* synthetic */ C7294d f34782a;

    /* renamed from: b */
    public final /* synthetic */ String f34783b;

    /* renamed from: c */
    public final /* synthetic */ String f34784c;

    /* renamed from: d */
    public final /* synthetic */ w2 f34785d;

    /* renamed from: e */
    public final /* synthetic */ C3082m f34786e;

    /* renamed from: f */
    public final /* synthetic */ C3082m f34787f;

    public /* synthetic */ C7293c(C7294d c7294d, String str, String str2, w2 w2Var, C3082m c3082m, C3082m c3082m2) {
        this.f34782a = c7294d;
        this.f34783b = str;
        this.f34784c = str2;
        this.f34785d = w2Var;
        this.f34786e = c3082m;
        this.f34787f = c3082m2;
    }

    @Override // i0.d2
    /* renamed from: a */
    public final void mo2191a(g2 g2Var, e2 e2Var) {
        C7294d c7294d = this.f34782a;
        if (c7294d.m2152c() == null) {
            return;
        }
        c7294d.m13628D();
        c7294d.m2149C(c7294d.m13629E(this.f34783b, this.f34784c, this.f34785d, this.f34786e, this.f34787f));
        c7294d.m2165p();
        C7297g c7297g = c7294d.f34791q;
        c7297g.getClass();
        o7.m11806a();
        Iterator it = c7297g.f34807a.iterator();
        while (it.hasNext()) {
            c7297g.mo2144e((b2) it.next());
        }
    }
}
