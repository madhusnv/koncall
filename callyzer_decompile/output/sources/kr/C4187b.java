package kr;

import androidx.compose.foundation.layout.AbstractC0242a;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2142f;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.o1;
import or.C5454q;
import sq.b1;
import w2.C7876o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4187b implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f21232a;

    /* renamed from: b */
    public final /* synthetic */ C5454q f21233b;

    public /* synthetic */ C4187b(C5454q c5454q, int i10) {
        this.f21232a = i10;
        this.f21233b = c5454q;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f21232a) {
            case 0:
                o1 CommonCheckBox = (o1) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(CommonCheckBox, "$this$CommonCheckBox");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C3966o) interfaceC3962k).m8614g(CommonCheckBox) ? 4 : 2;
                }
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
                    b1.m13113q(this.f21233b.f27491a, AbstractC0242a.m657k(CommonCheckBox.mo10364b(1.0f, C7876o.f37669a, true), 8, 5), 0L, null, null, 2, 1, 0L, null, null, c3966o, 1769472, 924);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                o1 CommonCheckBox2 = (o1) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(CommonCheckBox2, "$this$CommonCheckBox");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C3966o) interfaceC3962k2).m8614g(CommonCheckBox2) ? 4 : 2;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    b1.m13113q(this.f21233b.f27491a, AbstractC0242a.m658l(CommonCheckBox2.mo10364b(1.0f, C7876o.f37669a, true), DefinitionKt.NO_Float_VALUE, 10, 1), 0L, null, null, 0, 0, 0L, null, null, c3966o2, 0, 1020);
                } else {
                    c3966o2.m8601S();
                }
                break;
            default:
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f((o1) obj, "$this$CommonCheckBox");
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b1.m13113q(this.f21233b.f27491a, AbstractC0242a.m656j(C7876o.f37669a, 15), 0L, null, null, 0, 0, 0L, null, null, c3966o3, 48, 1020);
                } else {
                    c3966o3.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
