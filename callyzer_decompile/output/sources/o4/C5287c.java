package o4;

import android.view.ViewStructure;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import ex.InterfaceC2142f;
import ex.InterfaceC2143g;
import k2.C3966o;
import k2.InterfaceC3962k;
import k4.AbstractC3988i;
import k4.C3989j;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import k4.g0;
import k4.h0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4367l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o4.c */
/* loaded from: classes.dex */
public final class C5287c extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f25955a;

    /* renamed from: b */
    public final /* synthetic */ Object f25956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5287c(int i10, Object obj) {
        super(4);
        this.f25955a = i10;
        this.f25956b = obj;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f25955a) {
            case 0:
                int i10 = ((C3994o) obj3).f20689a;
                int i11 = ((C3995p) obj4).f20690a;
                C5288d c5288d = (C5288d) this.f25956b;
                h0 h0VarM8762b = ((C3989j) c5288d.f25961e).m8762b((AbstractC3988i) obj, (C3998s) obj2, i10, i11);
                if (!(h0VarM8762b instanceof g0)) {
                    C4367l c4367l = new C4367l(h0VarM8762b, c5288d.f25966k);
                    c5288d.f25966k = c4367l;
                    Object obj5 = c4367l.f21922c;
                    AbstractC4154l.m8921d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    break;
                } else {
                    Object obj6 = ((g0) h0VarM8762b).f20672a;
                    AbstractC4154l.m8921d(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    break;
                }
            case 1:
                InterfaceC0246a interfaceC0246a = (InterfaceC0246a) obj;
                ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C3966o) interfaceC3962k).m8614g(interfaceC0246a) ? 4 : 2;
                }
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 131) != 130)) {
                    ((InterfaceC2142f) this.f25956b).invoke(interfaceC0246a, c3966o, Integer.valueOf(iIntValue & 14));
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                int iIntValue3 = ((Number) obj2).intValue();
                ((ViewStructure) this.f25956b).setDimens(iIntValue2, iIntValue3, 0, 0, ((Number) obj3).intValue() - iIntValue2, ((Number) obj4).intValue() - iIntValue3);
                break;
        }
        return a0.f30746a;
    }
}
