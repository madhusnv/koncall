package mg;

import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 extends c1 {

    /* renamed from: a */
    public final boolean f23711a;

    public x0(boolean z6) {
        this.f23711a = z6;
    }

    @Override // mg.c1
    /* renamed from: a */
    public final int mo9597a() {
        return c1.m9616d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iMo9597a = c1Var.mo9597a();
        int iM9616d = c1.m9616d((byte) -32);
        if (iM9616d != iMo9597a) {
            return iM9616d - c1Var.mo9597a();
        }
        return (true != this.f23711a ? 20 : 21) - (true != ((x0) c1Var).f23711a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x0.class == obj.getClass() && this.f23711a == ((x0) obj).f23711a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.m9616d((byte) -32)), Boolean.valueOf(this.f23711a)});
    }

    public final String toString() {
        return Boolean.toString(this.f23711a);
    }
}
