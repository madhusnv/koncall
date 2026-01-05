package mm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.h */
/* loaded from: classes3.dex */
public final class C4797h {

    /* renamed from: a */
    public final C4792c f23875a;

    public C4797h(C4792c c4792c) {
        this.f23875a = c4792c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4797h) && this.f23875a.equals(((C4797h) obj).f23875a);
    }

    public final int hashCode() {
        return this.f23875a.hashCode() + (Integer.hashCode(0) * 31);
    }

    public final String toString() {
        return "FakeCallLog(id=0, callLogDetails=" + this.f23875a + ")";
    }
}
