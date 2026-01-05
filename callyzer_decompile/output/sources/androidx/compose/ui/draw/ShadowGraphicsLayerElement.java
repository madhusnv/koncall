package androidx.compose.ui.draw;

import a3.C0045d;
import com.sun.mail.util.AbstractC1452a;
import d3.C1560n;
import d3.C1565s;
import d3.l0;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import s4.C6750f;
import v3.AbstractC7634f;
import v3.a1;
import v3.h1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends a1 {

    /* renamed from: a */
    public final float f2097a;

    /* renamed from: b */
    public final l0 f2098b;

    /* renamed from: c */
    public final boolean f2099c;

    /* renamed from: d */
    public final long f2100d;

    /* renamed from: e */
    public final long f2101e;

    public ShadowGraphicsLayerElement(float f6, l0 l0Var, boolean z6, long j6, long j10) {
        this.f2097a = f6;
        this.f2098b = l0Var;
        this.f2099c = z6;
        this.f2100d = j6;
        this.f2101e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return C6750f.m12935a(this.f2097a, shadowGraphicsLayerElement.f2097a) && AbstractC4154l.m8918a(this.f2098b, shadowGraphicsLayerElement.f2098b) && this.f2099c == shadowGraphicsLayerElement.f2099c && C1565s.m5187c(this.f2100d, shadowGraphicsLayerElement.f2100d) && C1565s.m5187c(this.f2101e, shadowGraphicsLayerElement.f2101e);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C1560n(new C0045d(1, this));
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e((this.f2098b.hashCode() + (Float.hashCode(this.f2097a) * 31)) * 31, 31, this.f2099c);
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f2101e) + AbstractC1452a.m4557d(iM4558e, 31, this.f2100d);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C1560n c1560n = (C1560n) abstractC7878q;
        c1560n.f7800q = new C0045d(1, this);
        h1 h1Var = AbstractC7634f.m14561v(c1560n, 2).f36903n;
        if (h1Var != null) {
            h1Var.p1(c1560n.f7800q, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb2.append((Object) C6750f.m12936b(this.f2097a));
        sb2.append(", shape=");
        sb2.append(this.f2098b);
        sb2.append(", clip=");
        sb2.append(this.f2099c);
        sb2.append(", ambientColor=");
        m0.m7391x(this.f2100d, ", spotColor=", sb2);
        sb2.append((Object) C1565s.m5193i(this.f2101e));
        sb2.append(')');
        return sb2.toString();
    }
}
