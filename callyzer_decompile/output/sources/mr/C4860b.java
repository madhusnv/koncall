package mr;

import kotlin.jvm.internal.AbstractC4154l;
import or.C5454q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mr.b */
/* loaded from: classes3.dex */
public final class C4860b extends AbstractC4865g {

    /* renamed from: a */
    public final C5454q f24367a;

    /* renamed from: b */
    public final int f24368b;

    public C4860b(C5454q optionsUIModel, int i10) {
        AbstractC4154l.m8923f(optionsUIModel, "optionsUIModel");
        this.f24367a = optionsUIModel;
        this.f24368b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4860b)) {
            return false;
        }
        C4860b c4860b = (C4860b) obj;
        return AbstractC4154l.m8918a(this.f24367a, c4860b.f24367a) && this.f24368b == c4860b.f24368b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24368b) + (this.f24367a.hashCode() * 31);
    }

    public final String toString() {
        return "OnMultiOptionSelection(optionsUIModel=" + this.f24367a + ", mainIndex=" + this.f24368b + ")";
    }
}
