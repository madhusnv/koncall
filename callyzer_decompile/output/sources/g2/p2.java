package g2;

import a2.C0034g;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c3.C0847b;
import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1592t;
import d4.AbstractC1594v;
import d4.C1583k;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import f3.C2196b;
import f3.InterfaceC2198d;
import i1.C3138q;
import java.util.List;
import k2.C3977z;
import kotlin.jvm.internal.AbstractC4155m;
import lx.InterfaceC4574m;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p2 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f12392a;

    /* renamed from: b */
    public final /* synthetic */ k2.w0 f12393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(k2.w0 w0Var, int i10) {
        super(1);
        this.f12392a = i10;
        this.f12393b = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f12392a;
        qw.a0 a0Var = qw.a0.f30746a;
        k2.w0 w0Var = this.f12393b;
        switch (i10) {
            case 0:
                InterfaceC1596x interfaceC1596x = (InterfaceC1596x) obj;
                if (!AbstractC5178p.m10101L((CharSequence) w0Var.getValue())) {
                    String str = (String) w0Var.getValue();
                    InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
                    ((C1583k) interfaceC1596x).m5202q(AbstractC1592t.f7913J, str);
                    break;
                }
                break;
            case 1:
                v3.i0 i0Var = (v3.i0) obj;
                i0Var.m14622b();
                float fMo8435T = i0Var.mo8435T(((C3138q) w0Var.getValue()).f16961a);
                C2196b c2196b = i0Var.f36917a;
                float fM2291b = C0850e.m2291b(c2196b.mo5913e()) - (fMo8435T / 2);
                InterfaceC2198d.m5912w(i0Var, ((C3138q) w0Var.getValue()).f16962b, og.a2.m10524a(DefinitionKt.NO_Float_VALUE, fM2291b), og.a2.m10524a(C0850e.m2293d(c2196b.mo5913e()), fM2291b), fMo8435T, DefinitionKt.NO_Float_VALUE, 496);
                break;
            case 2:
                break;
            case 3:
                Configuration configuration = new Configuration((Configuration) obj);
                C3977z c3977z = AndroidCompositionLocals_androidKt.f2133a;
                w0Var.setValue(configuration);
                break;
            case 4:
                C0034g c0034g = (C0034g) obj;
                w0Var.setValue(c0034g.f151c ? c0034g.f150b : c0034g.f149a);
                break;
            case 5:
                List list = (List) obj;
                if (w0Var != null) {
                    w0Var.setValue(list);
                    break;
                }
                break;
            default:
                ((InterfaceC2139c) w0Var.getValue()).invoke(new C0847b(((C0847b) obj).f5352a));
                break;
        }
        return a0Var;
    }
}
