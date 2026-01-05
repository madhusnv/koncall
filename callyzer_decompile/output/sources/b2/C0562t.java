package b2;

import com.google.android.gms.internal.measurement.j4;
import ex.InterfaceC2137a;
import g4.C2501q;
import kotlin.jvm.internal.AbstractC4155m;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.t */
/* loaded from: classes.dex */
public final class C0562t extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ C0558p f3829a;

    /* renamed from: b */
    public final /* synthetic */ int f3830b;

    /* renamed from: c */
    public final /* synthetic */ int f3831c;

    /* renamed from: d */
    public final /* synthetic */ j4 f3832d;

    /* renamed from: e */
    public final /* synthetic */ Object f3833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0562t(C0558p c0558p, int i10, int i11, j4 j4Var, InterfaceC6357g interfaceC6357g) {
        super(0);
        this.f3829a = c0558p;
        this.f3830b = i10;
        this.f3831c = i11;
        this.f3832d = j4Var;
        this.f3833e = interfaceC6357g;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qw.g] */
    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        C0558p c0558p = this.f3829a;
        g4.l0 l0Var = (g4.l0) c0558p.f3798e;
        int iIntValue = ((Number) this.f3833e.getValue()).intValue();
        j4 j4Var = this.f3832d;
        boolean z6 = j4Var.f6251b;
        boolean z10 = j4Var.m3396n() == EnumC0555m.CROSSED;
        int i10 = this.f3830b;
        long jM6452j = l0Var.m6452j(i10);
        C2501q c2501q = l0Var.f13671b;
        int i11 = g4.n0.f13685c;
        int iM6449g = (int) (jM6452j >> 32);
        int iM6471d = c2501q.m6471d(iM6449g);
        int i12 = c2501q.f13702f;
        if (iM6471d != iIntValue) {
            iM6449g = iIntValue >= i12 ? l0Var.m6449g(i12 - 1) : l0Var.m6449g(iIntValue);
        }
        int iM6470c = (int) (jM6452j & 4294967295L);
        if (c2501q.m6471d(iM6470c) != iIntValue) {
            iM6470c = iIntValue >= i12 ? c2501q.m6470c(i12 - 1, false) : c2501q.m6470c(iIntValue, false);
        }
        int i13 = this.f3831c;
        if (iM6449g == i13) {
            return c0558p.m1655c(iM6470c);
        }
        if (iM6470c == i13) {
            return c0558p.m1655c(iM6449g);
        }
        if (!(z6 ^ z10) ? i10 >= iM6449g : i10 > iM6470c) {
            iM6449g = iM6470c;
        }
        return c0558p.m1655c(iM6449g);
    }
}
