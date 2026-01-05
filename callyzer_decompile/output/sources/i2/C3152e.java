package i2;

import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.i0;
import d3.l0;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.e */
/* loaded from: classes.dex */
public final class C3152e extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC3161n f17036a;

    /* renamed from: b */
    public final /* synthetic */ boolean f17037b;

    /* renamed from: c */
    public final /* synthetic */ float f17038c;

    /* renamed from: d */
    public final /* synthetic */ float f17039d;

    /* renamed from: e */
    public final /* synthetic */ l0 f17040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3152e(InterfaceC3161n interfaceC3161n, boolean z6, float f6, float f10, l0 l0Var) {
        super(1);
        this.f17036a = interfaceC3161n;
        this.f17037b = z6;
        this.f17038c = f6;
        this.f17039d = f10;
        this.f17040e = l0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        i0 i0Var = (i0) obj;
        C3163p c3163p = (C3163p) this.f17036a;
        float fFloatValue = ((Number) c3163p.f17078a.m6775d()).floatValue();
        float fMo155a = DefinitionKt.NO_Float_VALUE;
        boolean z6 = fFloatValue > DefinitionKt.NO_Float_VALUE || this.f17037b;
        i0Var.m5174y((((Number) c3163p.f17078a.m6775d()).floatValue() * i0Var.e0(this.f17038c)) - C0850e.m2291b(i0Var.f7773t));
        if (z6) {
            fMo155a = i0Var.f7774v.mo155a() * this.f17039d;
        }
        i0Var.m5169r(fMo155a);
        i0Var.m5170s(this.f17040e);
        i0Var.m5163d(true);
        return a0.f30746a;
    }
}
