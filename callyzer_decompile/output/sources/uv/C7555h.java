package uv;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uv.h */
/* loaded from: classes3.dex */
public final class C7555h {

    /* renamed from: a */
    public final long f36425a;

    /* renamed from: b */
    public final long f36426b;

    /* renamed from: c */
    public final long f36427c;

    public C7555h(long j6, long j10, long j11) {
        this.f36425a = j6;
        this.f36426b = j10;
        this.f36427c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7555h)) {
            return false;
        }
        C7555h c7555h = (C7555h) obj;
        return C1565s.m5187c(this.f36425a, c7555h.f36425a) && C1565s.m5187c(this.f36426b, c7555h.f36426b) && C1565s.m5187c(this.f36427c, c7555h.f36427c);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f36427c) + AbstractC1452a.m4557d(Long.hashCode(this.f36425a) * 31, 31, this.f36426b);
    }

    public final String toString() {
        String strM5193i = C1565s.m5193i(this.f36425a);
        String strM5193i2 = C1565s.m5193i(this.f36426b);
        return AbstractC1452a.m4564k(AbstractC0030c.m127r("TroubleshootIconColors(surfaceColor=", strM5193i, ", borderColor=", strM5193i2, ", iconTint="), C1565s.m5193i(this.f36427c), ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7555h() {
        long j6 = C1565s.f7817j;
        this(j6, j6, j6);
    }
}
