package h2;

import c9.C0925t;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import k2.a1;
import k2.e1;
import kotlin.jvm.internal.AbstractC4155m;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.h */
/* loaded from: classes.dex */
public final class C2803h extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f15714a;

    /* renamed from: b */
    public final /* synthetic */ C0925t f15715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2803h(C0925t c0925t, int i10) {
        super(0);
        this.f15714a = i10;
        this.f15715b = c0925t;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f15714a) {
            case 0:
                return this.f15715b.m2679h();
            case 1:
                C0925t c0925t = this.f15715b;
                return new C6361k(c0925t.m2679h(), ((k2.c0) c0925t.f5658h).getValue());
            case 2:
                C0925t c0925t2 = this.f15715b;
                Object value = ((e1) c0925t2.f5662l).getValue();
                if (value != null) {
                    return value;
                }
                float fM8490f = ((a1) c0925t2.f5660j).m8490f();
                e1 e1Var = (e1) c0925t2.f5657g;
                if (Float.isNaN(fM8490f)) {
                    return e1Var.getValue();
                }
                Object value2 = e1Var.getValue();
                d0 d0VarM2679h = c0925t2.m2679h();
                float fM6891d = d0VarM2679h.m6891d(value2);
                if (fM6891d != fM8490f && !Float.isNaN(fM6891d)) {
                    if (fM6891d < fM8490f) {
                        Object objM6889b = d0VarM2679h.m6889b(fM8490f, true);
                        if (objM6889b != null) {
                            return objM6889b;
                        }
                    } else {
                        Object objM6889b2 = d0VarM2679h.m6889b(fM8490f, false);
                        if (objM6889b2 != null) {
                            return objM6889b2;
                        }
                    }
                }
                return value2;
            case 3:
                C0925t c0925t3 = this.f15715b;
                float fM6891d2 = c0925t3.m2679h().m6891d(((e1) c0925t3.f5657g).getValue());
                float fM6891d3 = c0925t3.m2679h().m6891d(((k2.c0) c0925t3.f5659i).getValue()) - fM6891d2;
                float fAbs = Math.abs(fM6891d3);
                float f6 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fM2689r = (c0925t3.m2689r() - fM6891d2) / fM6891d3;
                    if (fM2689r < 1.0E-6f) {
                        f6 = DefinitionKt.NO_Float_VALUE;
                    } else if (fM2689r <= 0.999999f) {
                        f6 = fM2689r;
                    }
                }
                return Float.valueOf(f6);
            default:
                C0925t c0925t4 = this.f15715b;
                Object value3 = ((e1) c0925t4.f5662l).getValue();
                if (value3 != null) {
                    return value3;
                }
                float fM8490f2 = ((a1) c0925t4.f5660j).m8490f();
                e1 e1Var2 = (e1) c0925t4.f5657g;
                return !Float.isNaN(fM8490f2) ? c0925t4.m2676e(fM8490f2, DefinitionKt.NO_Float_VALUE, e1Var2.getValue()) : e1Var2.getValue();
        }
    }
}
