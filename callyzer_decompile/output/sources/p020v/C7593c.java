package p020v;

import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.c */
/* loaded from: classes.dex */
public final class C7593c {

    /* renamed from: a */
    public final List f36484a;

    /* renamed from: b */
    public final List f36485b;

    /* renamed from: c */
    public final int f36486c;

    /* renamed from: d */
    public final int f36487d;

    /* renamed from: e */
    public final int f36488e;

    public C7593c(List list, List list2, int i10, int i11, int i12) {
        this.f36484a = list;
        this.f36485b = list2;
        this.f36486c = i10;
        this.f36487d = i11;
        this.f36488e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7593c) {
            C7593c c7593c = (C7593c) obj;
            List list = c7593c.f36485b;
            List list2 = c7593c.f36484a;
            List list3 = this.f36484a;
            if (list3 != null ? list3.equals(list2) : list2 == null) {
                List list4 = this.f36485b;
                if (list4 != null ? list4.equals(list) : list == null) {
                    if (this.f36486c == c7593c.f36486c && this.f36487d == c7593c.f36487d && this.f36488e == c7593c.f36488e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f36484a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List list2 = this.f36485b;
        return (((((((list2 != null ? list2.hashCode() : 0) ^ iHashCode) * 1000003) ^ this.f36486c) * 1000003) ^ this.f36487d) * 1000003) ^ this.f36488e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BestSizesAndMaxFpsForConfigs{bestSizes=");
        sb2.append(this.f36484a);
        sb2.append(", bestSizesForStreamUseCase=");
        sb2.append(this.f36485b);
        sb2.append(", maxFpsForBestSizes=");
        sb2.append(this.f36486c);
        sb2.append(", maxFpsForStreamUseCase=");
        sb2.append(this.f36487d);
        sb2.append(", maxFpsForAllSizes=");
        return AbstractC5601a.m11233d(this.f36488e, "}", sb2);
    }
}
