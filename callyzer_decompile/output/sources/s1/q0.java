package s1;

import aw.C0480t;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import n1.AbstractC4941a;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f32120a;

    /* renamed from: b */
    public final /* synthetic */ r0 f32121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, int i10) {
        super(1);
        this.f32120a = i10;
        this.f32121b = r0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f32120a) {
            case 0:
                InterfaceC6728w interfaceC6728w = (InterfaceC6728w) this.f32121b.f32123q.invoke();
                int iMo12101a = interfaceC6728w.mo12101a();
                int i10 = 0;
                while (true) {
                    if (i10 >= iMo12101a) {
                        i10 = -1;
                    } else if (!interfaceC6728w.mo12102b(i10).equals(obj)) {
                        i10++;
                    }
                }
                return Integer.valueOf(i10);
            default:
                int iIntValue = ((Number) obj).intValue();
                r0 r0Var = this.f32121b;
                InterfaceC6728w interfaceC6728w2 = (InterfaceC6728w) r0Var.f32123q.invoke();
                if (iIntValue < 0 || iIntValue >= interfaceC6728w2.mo12101a()) {
                    StringBuilder sbM4567n = AbstractC1452a.m4567n(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM4567n.append(interfaceC6728w2.mo12101a());
                    sbM4567n.append(')');
                    AbstractC4941a.m9884a(sbM4567n.toString());
                }
                tx.c0.m13502y(r0Var.z0(), null, null, new C0480t(r0Var, iIntValue, (InterfaceC7559c) null, 9), 3);
                return Boolean.TRUE;
        }
    }
}
