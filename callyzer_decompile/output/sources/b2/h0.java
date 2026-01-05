package b2;

import c3.C0847b;
import ex.InterfaceC2139c;
import h1.C2782m;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final h0 f3754b;

    /* renamed from: c */
    public static final h0 f3755c;

    /* renamed from: d */
    public static final h0 f3756d;

    /* renamed from: a */
    public final /* synthetic */ int f3757a;

    static {
        int i10 = 1;
        f3754b = new h0(i10, 0);
        f3755c = new h0(i10, 1);
        f3756d = new h0(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i10, int i11) {
        super(i10);
        this.f3757a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f3757a) {
            case 0:
                long j6 = ((C0847b) obj).f5352a;
                return (9223372034707292159L & j6) != 9205357640488583168L ? new C2782m(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L))) : l0.f3781a;
            case 1:
                C2782m c2782m = (C2782m) obj;
                return new C0847b((Float.floatToRawIntBits(c2782m.f15511a) << 32) | (Float.floatToRawIntBits(c2782m.f15512b) & 4294967295L));
            default:
                return qw.a0.f30746a;
        }
    }
}
