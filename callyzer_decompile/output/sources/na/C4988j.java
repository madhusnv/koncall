package na;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: na.j */
/* loaded from: classes.dex */
public final class C4988j {

    /* renamed from: a */
    public final String f24727a;

    public C4988j(String str) {
        this.f24727a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4988j) && this.f24727a.equals(((C4988j) obj).f24727a);
    }

    public final int hashCode() {
        return this.f24727a.hashCode() - 533068001;
    }

    public final String toString() {
        return AbstractC4982d.m9897b("aws-sdk-kotlin", this.f24727a, null);
    }
}
