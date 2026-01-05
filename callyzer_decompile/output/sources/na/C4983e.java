package na;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: na.e */
/* loaded from: classes.dex */
public final class C4983e {

    /* renamed from: a */
    public final String f24719a;

    public C4983e(String str) {
        this.f24719a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4983e) && AbstractC4154l.m8918a(this.f24719a, ((C4983e) obj).f24719a);
    }

    public final int hashCode() {
        return this.f24719a.hashCode();
    }

    public final String toString() {
        return AbstractC4982d.m9897b("exec-env", this.f24719a, null);
    }
}
