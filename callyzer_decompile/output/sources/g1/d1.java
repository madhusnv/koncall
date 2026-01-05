package g1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ long f10960a;

    /* renamed from: b */
    public final /* synthetic */ int f10961b;

    /* renamed from: c */
    public final /* synthetic */ int f10962c;

    /* renamed from: d */
    public final /* synthetic */ t3.l0 f10963d;

    /* renamed from: e */
    public final /* synthetic */ t3.w0 f10964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, long j6, int i10, int i11, t3.l0 l0Var, t3.w0 w0Var) {
        super(1);
        this.f10960a = j6;
        this.f10961b = i10;
        this.f10962c = i11;
        this.f10963d = l0Var;
        this.f10964e = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        t3.v0 v0Var = (t3.v0) obj;
        long j6 = (this.f10961b << 32) | (this.f10962c & 4294967295L);
        EnumC6757m layoutDirection = this.f10963d.getLayoutDirection();
        long j10 = this.f10960a;
        float f6 = (((int) (j6 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f10 = (((int) (j6 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        float f11 = layoutDirection == EnumC6757m.Ltr ? -1.0f : (-1) * (-1.0f);
        float f12 = 1;
        float f13 = (f11 + f12) * f6;
        float f14 = (f12 - 1.0f) * f10;
        t3.v0.m13318f(v0Var, this.f10964e, (Math.round(f14) & 4294967295L) | (Math.round(f13) << 32));
        return qw.a0.f30746a;
    }
}
