package lw;

import a2.AbstractC0030c;
import c3.C0847b;
import com.sun.mail.util.AbstractC1452a;
import mw.C4896d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lw.g */
/* loaded from: classes3.dex */
public final class C4542g implements InterfaceC4544i {

    /* renamed from: a */
    public final long f22582a;

    /* renamed from: b */
    public final long f22583b;

    /* renamed from: c */
    public final C4896d f22584c;

    public C4542g(long j6, long j10, C4896d c4896d) {
        this.f22582a = j6;
        this.f22583b = j10;
        this.f22584c = c4896d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4542g)) {
            return false;
        }
        C4542g c4542g = (C4542g) obj;
        return C0847b.m2271b(this.f22582a, c4542g.f22582a) && C0847b.m2271b(this.f22583b, c4542g.f22583b) && this.f22584c.equals(c4542g.f22584c);
    }

    public final int hashCode() {
        return Double.hashCode(this.f22584c.f24423a) + AbstractC1452a.m4557d(Long.hashCode(this.f22582a) * 31, 31, this.f22583b);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("ExternalLabelPosition(position=", C0847b.m2278i(this.f22582a), ", anchorPoint=", C0847b.m2278i(this.f22583b), ", anchorAngle=");
        sbM127r.append(this.f22584c);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
