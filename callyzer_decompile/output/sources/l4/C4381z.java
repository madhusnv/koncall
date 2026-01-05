package l4;

import c9.C0917l;
import com.sun.mail.util.AbstractC1452a;
import g4.C2492h;
import g4.n0;
import kotlin.jvm.internal.AbstractC4154l;
import og.yf;
import t2.AbstractC7013l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.z */
/* loaded from: classes.dex */
public final class C4381z {

    /* renamed from: d */
    public static final C0917l f21944d;

    /* renamed from: a */
    public final C2492h f21945a;

    /* renamed from: b */
    public final long f21946b;

    /* renamed from: c */
    public final n0 f21947c;

    static {
        C4357b c4357b = C4357b.f21855d;
        C0917l c0917l = AbstractC7013l.f33949a;
        f21944d = new C0917l(16, C4380y.f21943a, c4357b);
    }

    public C4381z(C2492h c2492h, long j6, n0 n0Var) {
        n0 n0Var2;
        this.f21945a = c2492h;
        this.f21946b = yf.m11073b(c2492h.f13620b.length(), j6);
        if (n0Var != null) {
            n0Var2 = new n0(yf.m11073b(c2492h.f13620b.length(), n0Var.f13686a));
        } else {
            n0Var2 = null;
        }
        this.f21947c = n0Var2;
    }

    /* renamed from: a */
    public static C4381z m9153a(C4381z c4381z, C2492h c2492h, long j6, int i10) {
        if ((i10 & 1) != 0) {
            c2492h = c4381z.f21945a;
        }
        if ((i10 & 2) != 0) {
            j6 = c4381z.f21946b;
        }
        n0 n0Var = (i10 & 4) != 0 ? c4381z.f21947c : null;
        c4381z.getClass();
        return new C4381z(c2492h, j6, n0Var);
    }

    /* renamed from: b */
    public static C4381z m9154b(C4381z c4381z, String str, long j6, int i10) {
        if ((i10 & 2) != 0) {
            j6 = c4381z.f21946b;
        }
        n0 n0Var = c4381z.f21947c;
        c4381z.getClass();
        return new C4381z(new C2492h(str), j6, n0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4381z)) {
            return false;
        }
        C4381z c4381z = (C4381z) obj;
        return n0.m6454a(this.f21946b, c4381z.f21946b) && AbstractC4154l.m8918a(this.f21947c, c4381z.f21947c) && AbstractC4154l.m8918a(this.f21945a, c4381z.f21945a);
    }

    public final int hashCode() {
        int iHashCode = this.f21945a.hashCode() * 31;
        int i10 = n0.f13685c;
        int iM4557d = AbstractC1452a.m4557d(iHashCode, 31, this.f21946b);
        n0 n0Var = this.f21947c;
        return iM4557d + (n0Var != null ? Long.hashCode(n0Var.f13686a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f21945a) + "', selection=" + ((Object) n0.m6460g(this.f21946b)) + ", composition=" + this.f21947c + ')';
    }

    public C4381z(String str, int i10, long j6) {
        this(new C2492h((i10 & 1) != 0 ? "" : str), (i10 & 2) != 0 ? n0.f13684b : j6, (n0) null);
    }
}
