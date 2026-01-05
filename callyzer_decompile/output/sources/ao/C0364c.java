package ao;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ao.c */
/* loaded from: classes3.dex */
public final class C0364c extends AbstractC0366e {

    /* renamed from: a */
    public final String f2920a;

    /* renamed from: b */
    public final String f2921b;

    /* renamed from: c */
    public final long f2922c;

    public C0364c(String str, String str2, long j6) {
        this.f2920a = str;
        this.f2921b = str2;
        this.f2922c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0364c)) {
            return false;
        }
        C0364c c0364c = (C0364c) obj;
        return AbstractC4154l.m8918a(this.f2920a, c0364c.f2920a) && AbstractC4154l.m8918a(this.f2921b, c0364c.f2921b) && this.f2922c == c0364c.f2922c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2922c) + AbstractC0030c.m113d(this.f2920a.hashCode() * 31, 31, this.f2921b);
    }

    public final String toString() {
        return AbstractC0030c.m116g(this.f2922c, ")", AbstractC0030c.m127r("NoDataFound(startDateTime=", this.f2920a, ", endDateTime=", this.f2921b, ", callLogId="));
    }
}
