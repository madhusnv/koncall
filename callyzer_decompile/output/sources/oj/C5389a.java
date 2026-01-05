package oj;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oj.a */
/* loaded from: classes.dex */
public final class C5389a {

    /* renamed from: a */
    public final String f27069a;

    /* renamed from: b */
    public final ArrayList f27070b;

    public C5389a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f27069a = str;
        this.f27070b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5389a)) {
            return false;
        }
        C5389a c5389a = (C5389a) obj;
        return this.f27069a.equals(c5389a.f27069a) && this.f27070b.equals(c5389a.f27070b);
    }

    public final int hashCode() {
        return ((this.f27069a.hashCode() ^ 1000003) * 1000003) ^ this.f27070b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f27069a + ", usedDates=" + this.f27070b + "}";
    }
}
