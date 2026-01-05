package mw;

import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import rw.C6669s;
import s4.C6745a;
import t3.i0;
import t3.j0;
import t3.k0;
import t3.l0;
import t3.v0;
import t3.w0;
import wr.C8158n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mw.f */
/* loaded from: classes3.dex */
public final class C4898f implements j0 {

    /* renamed from: a */
    public final /* synthetic */ int f24428a;

    /* renamed from: b */
    public final Object f24429b;

    public /* synthetic */ C4898f(int i10, Object obj) {
        this.f24428a = i10;
        this.f24429b = obj;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final k0 mo16554measure3p2s80s(l0 Layout, List measurables, final long j6) {
        switch (this.f24428a) {
            case 0:
                AbstractC4154l.m8923f(Layout, "$this$Layout");
                AbstractC4154l.m8923f(measurables, "measurables");
                long jM12911b = C6745a.m12911b(j6, 0, 0, 0, 0, 10);
                final w0 w0VarMo13314z = ((i0) measurables.get(0)).mo13314z(jM12911b);
                w0 w0VarMo13314z2 = measurables.size() == 2 ? ((i0) measurables.get(1)).mo13314z(jM12911b) : null;
                int i10 = w0VarMo13314z.f34030a;
                int i11 = w0VarMo13314z.f34031b;
                final k2.w0 w0Var = (k2.w0) this.f24429b;
                final w0 w0Var2 = w0VarMo13314z2;
                return Layout.g0(i10, i11, C6669s.f31944a, new InterfaceC2139c() { // from class: mw.e
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) {
                        v0 layout = (v0) obj;
                        AbstractC4154l.m8923f(layout, "$this$layout");
                        layout.m13324d(w0VarMo13314z, 0, 0, DefinitionKt.NO_Float_VALUE);
                        w0 w0Var3 = w0Var2;
                        if (w0Var3 != null) {
                            k2.w0 w0Var4 = w0Var;
                            int iIntBitsToFloat = ((int) Float.intBitsToFloat((int) (((C0847b) w0Var4.getValue()).f5352a >> 32))) - (w0Var3.f34030a / 2);
                            int iM12918i = C6745a.m12918i(j6) - w0Var3.f34030a;
                            if (iIntBitsToFloat > iM12918i) {
                                iIntBitsToFloat = iM12918i;
                            }
                            if (iIntBitsToFloat < 0) {
                                iIntBitsToFloat = 0;
                            }
                            int iIntBitsToFloat2 = ((int) Float.intBitsToFloat((int) (((C0847b) w0Var4.getValue()).f5352a & 4294967295L))) - w0Var3.f34031b;
                            layout.m13324d(w0Var3, iIntBitsToFloat, iIntBitsToFloat2 >= 0 ? iIntBitsToFloat2 : 0, 1.0f);
                        }
                        return a0.f30746a;
                    }
                });
            default:
                return Layout.g0(C6745a.m12918i(j6), C6745a.m12917h(j6), C6669s.f31944a, new C8158n(measurables, this, 4));
        }
    }
}
