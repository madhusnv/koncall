package sq;

import androidx.compose.foundation.layout.AbstractC0242a;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2142f;
import g2.p9;
import g2.pd;
import g2.rd;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.InterfaceC5262u;
import uv.AbstractC7548a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f32860a;

    /* renamed from: b */
    public final /* synthetic */ rd f32861b;

    public /* synthetic */ f2(rd rdVar, int i10) {
        this.f32860a = i10;
        this.f32861b = rdVar;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f32860a;
        InterfaceC5262u AlertDialogWithPositiveAndNegativeButton = (InterfaceC5262u) obj;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                AbstractC4154l.m8923f(AlertDialogWithPositiveAndNegativeButton, "$this$AlertDialogWithPositiveAndNegativeButton");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C3966o) interfaceC3962k).m8614g(AlertDialogWithPositiveAndNegativeButton) ? 4 : 2;
                }
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AlertDialogWithPositiveAndNegativeButton.mo10338b(C7876o.f37669a, C7864c.f37655p), DefinitionKt.NO_Float_VALUE, 20, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
                    long j6 = AbstractC7548a.f36349c;
                    pd.m6271g(this.f32861b, interfaceC7879rM660n, p9.m6257u(j6, j6, c3966o), 0, c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                AbstractC4154l.m8923f(AlertDialogWithPositiveAndNegativeButton, "$this$AlertDialogWithPositiveAndNegativeButton");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C3966o) interfaceC3962k).m8614g(AlertDialogWithPositiveAndNegativeButton) ? 4 : 2;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC7879r interfaceC7879rM660n2 = AbstractC0242a.m660n(AlertDialogWithPositiveAndNegativeButton.mo10338b(C7876o.f37669a, C7864c.f37655p), DefinitionKt.NO_Float_VALUE, 20, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
                    long j10 = AbstractC7548a.f36349c;
                    pd.m6271g(this.f32861b, interfaceC7879rM660n2, p9.m6257u(j10, j10, c3966o2), 0, c3966o2, 0);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
