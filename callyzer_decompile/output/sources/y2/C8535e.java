package y2;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import ug.g1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y2.e */
/* loaded from: classes.dex */
public final class C8535e {

    /* renamed from: a */
    public final int f41477a;

    /* renamed from: b */
    public final long f41478b;

    /* renamed from: c */
    public final EnumC8536f f41479c;

    /* renamed from: d */
    public final g1 f41480d;

    public C8535e(int i10, long j6, EnumC8536f enumC8536f, g1 g1Var) {
        this.f41477a = i10;
        this.f41478b = j6;
        this.f41479c = enumC8536f;
        this.f41480d = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8535e)) {
            return false;
        }
        C8535e c8535e = (C8535e) obj;
        return this.f41477a == c8535e.f41477a && this.f41478b == c8535e.f41478b && this.f41479c == c8535e.f41479c && AbstractC4154l.m8918a(this.f41480d, c8535e.f41480d);
    }

    public final int hashCode() {
        int iHashCode = (this.f41479c.hashCode() + AbstractC1452a.m4557d(Integer.hashCode(this.f41477a) * 31, 31, this.f41478b)) * 31;
        g1 g1Var = this.f41480d;
        return iHashCode + (g1Var == null ? 0 : g1Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f41477a + ", timestamp=" + this.f41478b + ", type=" + this.f41479c + ", structureCompat=" + this.f41480d + ')';
    }
}
