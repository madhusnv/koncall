package rt;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rt.d */
/* loaded from: classes3.dex */
public final class C6620d {

    /* renamed from: a */
    public final boolean f31804a;

    /* renamed from: b */
    public final String f31805b;

    public C6620d(boolean z6, String tagName) {
        AbstractC4154l.m8923f(tagName, "tagName");
        this.f31804a = z6;
        this.f31805b = tagName;
    }

    /* renamed from: a */
    public static C6620d m12670a(C6620d c6620d, boolean z6) {
        String tagName = c6620d.f31805b;
        c6620d.getClass();
        AbstractC4154l.m8923f(tagName, "tagName");
        return new C6620d(z6, tagName);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6620d)) {
            return false;
        }
        C6620d c6620d = (C6620d) obj;
        return this.f31804a == c6620d.f31804a && AbstractC4154l.m8918a(this.f31805b, c6620d.f31805b);
    }

    public final int hashCode() {
        return this.f31805b.hashCode() + (Boolean.hashCode(this.f31804a) * 31);
    }

    public final String toString() {
        return "MessageTemplateTags(isSelected=" + this.f31804a + ", tagName=" + this.f31805b + ")";
    }
}
