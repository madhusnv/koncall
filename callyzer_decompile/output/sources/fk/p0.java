package fk;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 {
    public static final o0 Companion = new o0();

    /* renamed from: a */
    public final String f10467a;

    /* renamed from: b */
    public final String f10468b;

    /* renamed from: c */
    public final int f10469c;

    /* renamed from: d */
    public final long f10470d;

    public /* synthetic */ p0(int i10, String str, String str2, int i11, long j6) {
        if (15 != (i10 & 15)) {
            jy.n0.m8426g(i10, 15, n0.f10461a.getDescriptor());
            throw null;
        }
        this.f10467a = str;
        this.f10468b = str2;
        this.f10469c = i11;
        this.f10470d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return AbstractC4154l.m8918a(this.f10467a, p0Var.f10467a) && AbstractC4154l.m8918a(this.f10468b, p0Var.f10468b) && this.f10469c == p0Var.f10469c && this.f10470d == p0Var.f10470d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10470d) + AbstractC1452a.m4556c(this.f10469c, AbstractC0030c.m113d(this.f10467a.hashCode() * 31, 31, this.f10468b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f10467a + ", firstSessionId=" + this.f10468b + ", sessionIndex=" + this.f10469c + ", sessionStartTimestampUs=" + this.f10470d + ')';
    }

    public p0(String str, String str2, int i10, long j6) {
        this.f10467a = str;
        this.f10468b = str2;
        this.f10469c = i10;
        this.f10470d = j6;
    }
}
