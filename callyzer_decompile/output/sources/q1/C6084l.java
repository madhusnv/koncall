package q1;

import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4155m;
import rw.C6669s;
import s1.C6729x;
import s4.AbstractC6746b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.l */
/* loaded from: classes.dex */
public final class C6084l extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f29676a;

    /* renamed from: b */
    public final /* synthetic */ C6729x f29677b;

    /* renamed from: c */
    public final /* synthetic */ long f29678c;

    /* renamed from: d */
    public final /* synthetic */ int f29679d;

    /* renamed from: e */
    public final /* synthetic */ int f29680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6084l(C6729x c6729x, long j6, int i10, int i11, int i12) {
        super(3);
        this.f29676a = i12;
        this.f29677b = c6729x;
        this.f29678c = j6;
        this.f29679d = i10;
        this.f29680e = i11;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29676a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int i10 = iIntValue + this.f29679d;
                long j6 = this.f29678c;
                int iM12929g = AbstractC6746b.m12929g(i10, j6);
                int iM12928f = AbstractC6746b.m12928f(iIntValue2 + this.f29680e, j6);
                return this.f29677b.f32165b.g0(iM12929g, iM12928f, C6669s.f31944a, (InterfaceC2139c) obj3);
            case 1:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                int i11 = iIntValue3 + this.f29679d;
                long j10 = this.f29678c;
                int iM12929g2 = AbstractC6746b.m12929g(i11, j10);
                int iM12928f2 = AbstractC6746b.m12928f(iIntValue4 + this.f29680e, j10);
                return this.f29677b.f32165b.g0(iM12929g2, iM12928f2, C6669s.f31944a, (InterfaceC2139c) obj3);
            default:
                int iIntValue5 = ((Number) obj).intValue();
                int iIntValue6 = ((Number) obj2).intValue();
                int i12 = iIntValue5 + this.f29679d;
                long j11 = this.f29678c;
                int iM12929g3 = AbstractC6746b.m12929g(i12, j11);
                int iM12928f3 = AbstractC6746b.m12928f(iIntValue6 + this.f29680e, j11);
                return this.f29677b.f32165b.g0(iM12929g3, iM12928f3, C6669s.f31944a, (InterfaceC2139c) obj3);
        }
    }
}
