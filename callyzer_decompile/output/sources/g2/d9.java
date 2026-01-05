package g2;

import c3.C0850e;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f3.C2202h;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d9 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2137a f11393a;

    /* renamed from: b */
    public final /* synthetic */ int f11394b;

    /* renamed from: c */
    public final /* synthetic */ float f11395c;

    /* renamed from: d */
    public final /* synthetic */ float f11396d;

    /* renamed from: e */
    public final /* synthetic */ long f11397e;

    /* renamed from: f */
    public final /* synthetic */ C2202h f11398f;

    /* renamed from: g */
    public final /* synthetic */ long f11399g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(InterfaceC2137a interfaceC2137a, int i10, float f6, float f10, long j6, C2202h c2202h, long j10) {
        super(1);
        this.f11393a = interfaceC2137a;
        this.f11394b = i10;
        this.f11395c = f6;
        this.f11396d = f10;
        this.f11397e = j6;
        this.f11398f = c2202h;
        this.f11399g = j10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
        float fFloatValue = ((Number) this.f11393a.invoke()).floatValue() * 360.0f;
        int i10 = this.f11394b;
        float f6 = this.f11395c;
        if (i10 != 0 && C0850e.m2291b(interfaceC2198d.mo5913e()) <= C0850e.m2293d(interfaceC2198d.mo5913e())) {
            f6 += this.f11396d;
        }
        float fMo8434J = (f6 / ((float) (interfaceC2198d.mo8434J(C0850e.m2293d(interfaceC2198d.mo5913e())) * 3.141592653589793d))) * 360.0f;
        float fMin = Math.min(fFloatValue, fMo8434J) + 270.0f + fFloatValue;
        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo8434J) * 2);
        long j6 = this.f11397e;
        C2202h c2202h = this.f11398f;
        k9.m6200e(interfaceC2198d, fMin, fMin2, j6, c2202h);
        k9.m6200e(interfaceC2198d, 270.0f, fFloatValue, this.f11399g, c2202h);
        return qw.a0.f30746a;
    }
}
