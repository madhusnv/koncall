package zp;

import im.EnumC3319u;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5416r;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.j */
/* loaded from: classes3.dex */
public final class C9010j {

    /* renamed from: a */
    public final C5416r f43404a;

    /* renamed from: b */
    public final EnumC3319u f43405b;

    /* renamed from: c */
    public final boolean f43406c;

    public C9010j(C5416r c5416r, EnumC3319u label, boolean z6) {
        AbstractC4154l.m8923f(label, "label");
        this.f43404a = c5416r;
        this.f43405b = label;
        this.f43406c = z6;
    }

    /* renamed from: a */
    public final boolean m16474a() {
        C5416r c5416r = this.f43404a;
        return (c5416r != null ? c5416r.f27214b : null) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9010j)) {
            return false;
        }
        C9010j c9010j = (C9010j) obj;
        return AbstractC4154l.m8918a(this.f43404a, c9010j.f43404a) && this.f43405b == c9010j.f43405b && this.f43406c == c9010j.f43406c;
    }

    public final int hashCode() {
        C5416r c5416r = this.f43404a;
        return Boolean.hashCode(this.f43406c) + ((this.f43405b.hashCode() + ((c5416r == null ? 0 : c5416r.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SummaryUiModel(analysisData=");
        sb2.append(this.f43404a);
        sb2.append(", label=");
        sb2.append(this.f43405b);
        sb2.append(", isLoader=");
        return AbstractC5601a.m11242m(sb2, this.f43406c, ")");
    }
}
