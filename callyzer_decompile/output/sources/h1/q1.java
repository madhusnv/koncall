package h1;

import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import gx.AbstractC2747a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f15552a = 1;

    /* renamed from: b */
    public final /* synthetic */ float f15553b;

    /* renamed from: c */
    public final /* synthetic */ Object f15554c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(float f6, k2.w0 w0Var) {
        super(1);
        this.f15553b = f6;
        this.f15554c = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f15552a) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                s1 s1Var = (s1) this.f15554c;
                boolean zM6858g = s1Var.m6858g();
                k2.c1 c1Var = s1Var.f15594g;
                if (!zM6858g) {
                    if (c1Var.m8531f() == Long.MIN_VALUE) {
                        c1Var.m8532g(jLongValue);
                        ((k2.e1) s1Var.f15588a.f482a).setValue(Boolean.TRUE);
                    }
                    long jM8531f = jLongValue - c1Var.m8531f();
                    float f6 = this.f15553b;
                    if (f6 != DefinitionKt.NO_Float_VALUE) {
                        jM8531f = AbstractC2747a.m6748l(jM8531f / f6);
                    }
                    s1Var.m6865n(jM8531f);
                    s1Var.m6859h(f6 == DefinitionKt.NO_Float_VALUE, jM8531f);
                }
                break;
            default:
                long j6 = ((C0850e) obj).f5366a;
                float fM2293d = C0850e.m2293d(j6);
                float f10 = this.f15553b;
                float f11 = fM2293d * f10;
                float fM2291b = C0850e.m2291b(j6) * f10;
                k2.w0 w0Var = (k2.w0) this.f15554c;
                if (C0850e.m2293d(((C0850e) w0Var.getValue()).f5366a) != f11 || C0850e.m2291b(((C0850e) w0Var.getValue()).f5366a) != fM2291b) {
                    w0Var.setValue(new C0850e(og.d2.m10598a(f11, fM2291b)));
                }
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, float f6) {
        super(1);
        this.f15554c = s1Var;
        this.f15553b = f6;
    }
}
