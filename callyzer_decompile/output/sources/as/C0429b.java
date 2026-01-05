package as;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: as.b */
/* loaded from: classes3.dex */
public final class C0429b {

    /* renamed from: a */
    public final String f3151a;

    /* renamed from: b */
    public final boolean f3152b;

    public C0429b(String tagName, boolean z6) {
        AbstractC4154l.m8923f(tagName, "tagName");
        this.f3151a = tagName;
        this.f3152b = z6;
    }

    /* renamed from: a */
    public static C0429b m1452a(C0429b c0429b, boolean z6) {
        String tagName = c0429b.f3151a;
        c0429b.getClass();
        AbstractC4154l.m8923f(tagName, "tagName");
        return new C0429b(tagName, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0429b)) {
            return false;
        }
        C0429b c0429b = (C0429b) obj;
        return AbstractC4154l.m8918a(this.f3151a, c0429b.f3151a) && this.f3152b == c0429b.f3152b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3152b) + (this.f3151a.hashCode() * 31);
    }

    public final String toString() {
        return "TagUiModel(tagName=" + this.f3151a + ", isSelected=" + this.f3152b + ")";
    }
}
