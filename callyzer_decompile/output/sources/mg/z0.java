package mg;

import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends c1 {

    /* renamed from: a */
    public final long f23723a;

    public z0(long j6) {
        this.f23723a = j6;
    }

    @Override // mg.c1
    /* renamed from: a */
    public final int mo9597a() {
        return c1.m9616d(this.f23723a >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        if (mo9597a() != c1Var.mo9597a()) {
            return mo9597a() - c1Var.mo9597a();
        }
        long jAbs = Math.abs(this.f23723a);
        long jAbs2 = Math.abs(((z0) c1Var).f23723a);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z0.class == obj.getClass() && this.f23723a == ((z0) obj).f23723a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo9597a()), Long.valueOf(this.f23723a)});
    }

    public final String toString() {
        return Long.toString(this.f23723a);
    }
}
