package ja;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.f */
/* loaded from: classes.dex */
public final class C3612f extends AbstractC3613g {

    /* renamed from: a */
    public final String f19247a;

    public C3612f(String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f19247a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3612f) && AbstractC4154l.m8918a(this.f19247a, ((C3612f) obj).f19247a);
    }

    public final int hashCode() {
        return this.f19247a.hashCode();
    }

    public final String toString() {
        return this.f19247a;
    }
}
