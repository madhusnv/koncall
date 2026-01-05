package mm;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.a */
/* loaded from: classes3.dex */
public final class C4790a {

    /* renamed from: a */
    public final String f23830a;

    /* renamed from: b */
    public final Long f23831b;

    public C4790a(String str, Long l9) {
        this.f23830a = str;
        this.f23831b = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4790a)) {
            return false;
        }
        C4790a c4790a = (C4790a) obj;
        return AbstractC4154l.m8918a(this.f23830a, c4790a.f23830a) && AbstractC4154l.m8918a(this.f23831b, c4790a.f23831b);
    }

    public final int hashCode() {
        String str = this.f23830a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l9 = this.f23831b;
        return iHashCode + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        return "AnalysisAnalyticsData(userName=" + this.f23830a + ", duration=" + this.f23831b + ")";
    }
}
