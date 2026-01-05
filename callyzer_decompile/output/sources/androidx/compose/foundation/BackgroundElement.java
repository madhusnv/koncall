package androidx.compose.foundation;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import d3.l0;
import i1.C3132k;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class BackgroundElement extends a1 {

    /* renamed from: a */
    public final long f1884a;

    /* renamed from: b */
    public final float f1885b = 1.0f;

    /* renamed from: c */
    public final l0 f1886c;

    public BackgroundElement(long j6, l0 l0Var) {
        this.f1884a = j6;
        this.f1886c = l0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C1565s.m5187c(this.f1884a, backgroundElement.f1884a) && this.f1885b == backgroundElement.f1885b && AbstractC4154l.m8918a(this.f1886c, backgroundElement.f1886c);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C3132k c3132k = new C3132k();
        c3132k.f16892q = this.f1884a;
        c3132k.f16893r = this.f1886c;
        c3132k.f16894s = 9205357640488583168L;
        return c3132k;
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return this.f1886c.hashCode() + AbstractC1452a.m4555b(this.f1885b, Long.hashCode(this.f1884a) * 961, 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C3132k c3132k = (C3132k) abstractC7878q;
        c3132k.f16892q = this.f1884a;
        c3132k.f16893r = this.f1886c;
    }
}
