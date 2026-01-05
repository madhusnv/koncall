package au;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.o */
/* loaded from: classes3.dex */
public final class C0451o extends AbstractC0453q {

    /* renamed from: a */
    public final EnumC0455s f3251a;

    public C0451o(EnumC0455s mode) {
        AbstractC4154l.m8923f(mode, "mode");
        this.f3251a = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0451o) && this.f3251a == ((C0451o) obj).f3251a;
    }

    public final int hashCode() {
        return this.f3251a.hashCode();
    }

    public final String toString() {
        return "ChangeScreenMode(mode=" + this.f3251a + ")";
    }
}
