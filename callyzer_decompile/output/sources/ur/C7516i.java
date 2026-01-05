package ur;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.i */
/* loaded from: classes3.dex */
public final class C7516i extends AbstractC7523p {

    /* renamed from: a */
    public final String f36221a;

    /* renamed from: b */
    public final C6361k f36222b;

    /* renamed from: c */
    public final boolean f36223c;

    public C7516i(String modelId, C6361k c6361k, boolean z6) {
        AbstractC4154l.m8923f(modelId, "modelId");
        this.f36221a = modelId;
        this.f36222b = c6361k;
        this.f36223c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7516i)) {
            return false;
        }
        C7516i c7516i = (C7516i) obj;
        return AbstractC4154l.m8918a(this.f36221a, c7516i.f36221a) && AbstractC4154l.m8918a(this.f36222b, c7516i.f36222b) && this.f36223c == c7516i.f36223c;
    }

    public final int hashCode() {
        int iHashCode = this.f36221a.hashCode() * 31;
        C6361k c6361k = this.f36222b;
        return Boolean.hashCode(this.f36223c) + ((iHashCode + (c6361k == null ? 0 : c6361k.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateDynamicDateValue(modelId=");
        sb2.append(this.f36221a);
        sb2.append(", newValue=");
        sb2.append(this.f36222b);
        sb2.append(", quickApply=");
        return AbstractC5601a.m11242m(sb2, this.f36223c, ")");
    }
}
