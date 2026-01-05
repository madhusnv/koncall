package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import f3.C2202h;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f9 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ long f11585a;

    /* renamed from: b */
    public final /* synthetic */ C2202h f11586b;

    /* renamed from: c */
    public final /* synthetic */ k2.h2 f11587c;

    /* renamed from: d */
    public final /* synthetic */ k2.h2 f11588d;

    /* renamed from: e */
    public final /* synthetic */ k2.h2 f11589e;

    /* renamed from: f */
    public final /* synthetic */ k2.h2 f11590f;

    /* renamed from: g */
    public final /* synthetic */ float f11591g;

    /* renamed from: h */
    public final /* synthetic */ long f11592h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(long j6, C2202h c2202h, h1.e0 e0Var, h1.e0 e0Var2, h1.e0 e0Var3, h1.e0 e0Var4, float f6, long j10) {
        super(1);
        this.f11585a = j6;
        this.f11586b = c2202h;
        this.f11587c = e0Var;
        this.f11588d = e0Var2;
        this.f11589e = e0Var3;
        this.f11590f = e0Var4;
        this.f11591g = f6;
        this.f11592h = j10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        float f6;
        InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
        long j6 = this.f11585a;
        C2202h c2202h = this.f11586b;
        k9.m6200e(interfaceC2198d, DefinitionKt.NO_Float_VALUE, 360.0f, j6, c2202h);
        float fFloatValue = (((Number) this.f11587c.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.f11588d.getValue()).floatValue();
        k2.h2 h2Var = this.f11589e;
        float fAbs = Math.abs(fFloatValue2 - ((Number) h2Var.getValue()).floatValue());
        float fFloatValue3 = ((Number) h2Var.getValue()).floatValue() + ((Number) this.f11590f.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (c2202h.f10132c == 0) {
            f6 = DefinitionKt.NO_Float_VALUE;
        } else {
            f6 = ((this.f11591g / (k9.f11946e / 2)) * 57.29578f) / 2.0f;
        }
        k9.m6200e(interfaceC2198d, fFloatValue3 + f6, Math.max(fAbs, 0.1f), this.f11592h, c2202h);
        return qw.a0.f30746a;
    }
}
