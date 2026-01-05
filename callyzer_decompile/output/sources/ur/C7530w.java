package ur;

import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.w */
/* loaded from: classes3.dex */
public final class C7530w {

    /* renamed from: a */
    public final List f36269a;

    /* renamed from: b */
    public final int f36270b;

    /* renamed from: c */
    public final boolean f36271c;

    public C7530w(int i10, List list, boolean z6) {
        this.f36269a = list;
        this.f36270b = i10;
        this.f36271c = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* renamed from: a */
    public static C7530w m14295a(C7530w c7530w, ArrayList arrayList, int i10, int i11) {
        ArrayList filtersOptionsData = arrayList;
        if ((i11 & 1) != 0) {
            filtersOptionsData = c7530w.f36269a;
        }
        if ((i11 & 2) != 0) {
            i10 = c7530w.f36270b;
        }
        boolean z6 = (i11 & 4) != 0 ? c7530w.f36271c : true;
        c7530w.getClass();
        AbstractC4154l.m8923f(filtersOptionsData, "filtersOptionsData");
        return new C7530w(i10, filtersOptionsData, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7530w)) {
            return false;
        }
        C7530w c7530w = (C7530w) obj;
        return AbstractC4154l.m8918a(this.f36269a, c7530w.f36269a) && this.f36270b == c7530w.f36270b && this.f36271c == c7530w.f36271c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36271c) + AbstractC1452a.m4556c(this.f36270b, this.f36269a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommonFilters(filtersOptionsData=");
        sb2.append(this.f36269a);
        sb2.append(", selectedIndex=");
        sb2.append(this.f36270b);
        sb2.append(", isHighLite=");
        return AbstractC5601a.m11242m(sb2, this.f36271c, ")");
    }
}
