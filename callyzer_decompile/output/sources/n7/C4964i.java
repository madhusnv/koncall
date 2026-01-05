package n7;

import java.util.Iterator;
import java.util.List;
import k2.C3953b;
import k2.e1;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.d0;
import l7.m0;
import l7.n0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@m0("composable")
/* renamed from: n7.i */
/* loaded from: classes.dex */
public final class C4964i extends n0 {

    /* renamed from: c */
    public final e1 f24651c = C3953b.m8517t(Boolean.FALSE);

    @Override // l7.n0
    /* renamed from: a */
    public final AbstractC4422v mo9193a() {
        return new C4963h(this, AbstractC4958c.f24647a);
    }

    @Override // l7.n0
    /* renamed from: d */
    public final void mo9226d(List list, d0 d0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m9225b().m9223i((C4409i) it.next());
        }
        this.f24651c.setValue(Boolean.FALSE);
    }

    @Override // l7.n0
    /* renamed from: i */
    public final void mo9231i(C4409i c4409i, boolean z6) {
        m9225b().m9220f(c4409i, z6);
        this.f24651c.setValue(Boolean.TRUE);
    }
}
