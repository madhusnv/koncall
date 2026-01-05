package g1;

import h1.C2772c;
import s4.C6756l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a */
    public final C2772c f10947a;

    /* renamed from: b */
    public long f10948b;

    public c1(C2772c c2772c, long j6) {
        this.f10947a = c2772c;
        this.f10948b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f10947a.equals(c1Var.f10947a) && C6756l.m12948a(this.f10948b, c1Var.f10948b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f10948b) + (this.f10947a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f10947a + ", startSize=" + ((Object) C6756l.m12949b(this.f10948b)) + ')';
    }
}
