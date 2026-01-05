package w3;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import fx.InterfaceC2395a;
import fx.InterfaceC2400f;
import java.util.Set;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.C3971t;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.AbstractC6740i;
import uw.InterfaceC7559c;
import v2.AbstractC7628b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f3 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f37786a;

    /* renamed from: b */
    public final /* synthetic */ g3 f37787b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2141e f37788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(g3 g3Var, InterfaceC2141e interfaceC2141e, int i10) {
        super(2);
        this.f37786a = i10;
        this.f37787b = g3Var;
        this.f37788c = interfaceC2141e;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37786a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Number) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.m725a(this.f37787b.f37798a, this.f37788c, c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g3 g3Var = this.f37787b;
                    C7904v c7904v = g3Var.f37798a;
                    Object tag = c7904v.getTag(R.id.inspection_slot_table_set);
                    InterfaceC7559c interfaceC7559c = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC2395a) && !(tag instanceof InterfaceC2400f))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = c7904v.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC2395a) && !(tag2 instanceof InterfaceC2400f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        C3971t c3971t = c3966o2.f20463Q;
                        if (c3971t == null) {
                            c3971t = new C3971t(c3966o2.f20470g);
                            c3966o2.f20463Q = c3971t;
                        }
                        set.add(c3971t);
                        c3966o2.f20479p = true;
                        c3966o2.f20448B = true;
                        c3966o2.f20466c.m8701h();
                        c3966o2.f20453G.m8701h();
                        k2.y1 y1Var = c3966o2.f20454H;
                        k2.v1 v1Var = y1Var.f20610a;
                        y1Var.f20614e = v1Var.f20602k;
                        y1Var.f20615f = v1Var.f20603l;
                    }
                    boolean zM8616i = c3966o2.m8616i(g3Var);
                    Object objM8596M = c3966o2.m8596M();
                    k2.s0 s0Var = C3961j.f20408a;
                    if (zM8616i || objM8596M == s0Var) {
                        objM8596M = new e3(g3Var, interfaceC7559c, 0);
                        c3966o2.j0(objM8596M);
                    }
                    C3953b.m8503f((InterfaceC2141e) objM8596M, c7904v, c3966o2);
                    boolean zM8616i2 = c3966o2.m8616i(g3Var);
                    Object objM8596M2 = c3966o2.m8596M();
                    if (zM8616i2 || objM8596M2 == s0Var) {
                        objM8596M2 = new e3(g3Var, interfaceC7559c, 1);
                        c3966o2.j0(objM8596M2);
                    }
                    C3953b.m8503f((InterfaceC2141e) objM8596M2, c7904v, c3966o2);
                    C3953b.m8498a(AbstractC7628b.f36786a.mo8541a(set), AbstractC6740i.m12902d(-1193460702, new f3(g3Var, this.f37788c, 0), c3966o2), c3966o2, 56);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
