package mr;

import kotlin.jvm.internal.AbstractC4154l;
import or.C5454q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mr.c */
/* loaded from: classes3.dex */
public final class C4861c extends AbstractC4865g {

    /* renamed from: a */
    public final C5454q f24369a;

    /* renamed from: b */
    public final int f24370b;

    public C4861c(C5454q optionsUIModel, int i10) {
        AbstractC4154l.m8923f(optionsUIModel, "optionsUIModel");
        this.f24369a = optionsUIModel;
        this.f24370b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4861c)) {
            return false;
        }
        C4861c c4861c = (C4861c) obj;
        return AbstractC4154l.m8918a(this.f24369a, c4861c.f24369a) && this.f24370b == c4861c.f24370b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24370b) + (this.f24369a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSingleOptionSelection(optionsUIModel=" + this.f24369a + ", mainIndex=" + this.f24370b + ")";
    }
}
