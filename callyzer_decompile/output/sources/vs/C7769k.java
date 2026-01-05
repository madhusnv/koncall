package vs;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vs.k */
/* loaded from: classes3.dex */
public final class C7769k {

    /* renamed from: a */
    public final int f37431a;

    /* renamed from: b */
    public final String f37432b;

    /* renamed from: c */
    public final long f37433c;

    public C7769k(String str, int i10, long j6) {
        this.f37431a = i10;
        this.f37432b = str;
        this.f37433c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7769k)) {
            return false;
        }
        C7769k c7769k = (C7769k) obj;
        return this.f37431a == c7769k.f37431a && this.f37432b.equals(c7769k.f37432b) && C1565s.m5187c(this.f37433c, c7769k.f37433c);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(Integer.hashCode(this.f37431a) * 31, 31, this.f37432b);
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f37433c) + iM113d;
    }

    public final String toString() {
        return AbstractC1452a.m4564k(a1.m14337q(this.f37431a, "TextWithIcon(icon=", ", name=", this.f37432b, ", color="), C1565s.m5193i(this.f37433c), ")");
    }
}
