package tr;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tr.d */
/* loaded from: classes3.dex */
public final class C7208d extends AbstractC7213i {

    /* renamed from: a */
    public final String f34500a;

    /* renamed from: b */
    public final boolean f34501b;

    public C7208d(String name, boolean z6) {
        AbstractC4154l.m8923f(name, "name");
        this.f34500a = name;
        this.f34501b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7208d)) {
            return false;
        }
        C7208d c7208d = (C7208d) obj;
        return AbstractC4154l.m8918a(this.f34500a, c7208d.f34500a) && this.f34501b == c7208d.f34501b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34501b) + (this.f34500a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateCheckBox(name=" + this.f34500a + ", checked=" + this.f34501b + ")";
    }
}
