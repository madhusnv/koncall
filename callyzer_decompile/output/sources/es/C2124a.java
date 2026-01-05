package es;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: es.a */
/* loaded from: classes3.dex */
public final class C2124a {

    /* renamed from: a */
    public final boolean f9924a;

    /* renamed from: b */
    public final int f9925b;

    public C2124a(boolean z6, int i10) {
        this.f9924a = z6;
        this.f9925b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2124a)) {
            return false;
        }
        C2124a c2124a = (C2124a) obj;
        return this.f9924a == c2124a.f9924a && this.f9925b == c2124a.f9925b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9925b) + (Boolean.hashCode(this.f9924a) * 31);
    }

    public final String toString() {
        return "ConnectedSIMData(onDualSIM=" + this.f9924a + ", connectedSIMNumber=" + this.f9925b + ")";
    }
}
