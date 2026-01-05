package g2;

import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i9 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11809a;

    /* renamed from: b */
    public final /* synthetic */ float f11810b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f11811c;

    /* renamed from: d */
    public final /* synthetic */ long f11812d;

    /* renamed from: e */
    public final /* synthetic */ long f11813e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2139c f11814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(int i10, float f6, InterfaceC2137a interfaceC2137a, long j6, long j10, InterfaceC2139c interfaceC2139c) {
        super(1);
        this.f11809a = i10;
        this.f11810b = f6;
        this.f11811c = interfaceC2137a;
        this.f11812d = j6;
        this.f11813e = j10;
        this.f11814f = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
        float fM2291b = C0850e.m2291b(interfaceC2198d.mo5913e());
        int i10 = this.f11809a;
        float fMo8434J = this.f11810b;
        if (i10 != 0 && C0850e.m2291b(interfaceC2198d.mo5913e()) <= C0850e.m2293d(interfaceC2198d.mo5913e())) {
            fMo8434J += interfaceC2198d.mo8434J(fM2291b);
        }
        float fMo8434J2 = fMo8434J / interfaceC2198d.mo8434J(C0850e.m2293d(interfaceC2198d.mo5913e()));
        float fFloatValue = ((Number) this.f11811c.invoke()).floatValue();
        float fMin = Math.min(fFloatValue, fMo8434J2) + fFloatValue;
        if (fMin <= 1.0f) {
            k9.m6199d(interfaceC2198d, fMin, 1.0f, this.f11812d, fM2291b, this.f11809a);
        }
        k9.m6199d(interfaceC2198d, DefinitionKt.NO_Float_VALUE, fFloatValue, this.f11813e, fM2291b, this.f11809a);
        this.f11814f.invoke(interfaceC2198d);
        return qw.a0.f30746a;
    }
}
