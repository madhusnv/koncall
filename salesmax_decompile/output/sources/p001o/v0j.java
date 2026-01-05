package p001o;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p001o.h7g;

/* loaded from: classes2.dex */
public class v0j extends lf7 {

    /* renamed from: c */
    public final h7g.InterfaceC13892a f49736c;

    public v0j(z82 z82Var, h7g.InterfaceC13892a interfaceC13892a) {
        super(z82Var);
        this.f49736c = interfaceC13892a;
    }

    /* renamed from: o */
    public static /* synthetic */ zfa m52211o(zfa zfaVar, t72 t72Var) {
        return ((t72) zfaVar.get()).mo49347a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ zfa m52212p(List list, Void r4) {
        return this.f49736c.mo26260a(m52214m((cd2) list.get(0)), m52215n((cd2) list.get(0)));
    }

    /* renamed from: q */
    public static /* synthetic */ zfa m52213q(zfa zfaVar, Void r1) {
        return ((t72) zfaVar.get()).mo49348b();
    }

    @Override // p001o.lf7, p001o.z82
    /* renamed from: c */
    public zfa mo37111c(final List list, int i, int i2) {
        fgd.m26658b(list.size() == 1, "Only support one capture config.");
        final zfa zfaVarMo37116h = mo37116h(i, i2);
        return bn7.m19425k(Collections.singletonList(rm7.m46957a(zfaVarMo37116h).m46961e(new wr0() { // from class: o.s0j
            @Override // p001o.wr0
            public final zfa apply(Object obj) {
                return v0j.m52211o(zfaVarMo37116h, (t72) obj);
            }
        }, gb2.m28293a()).m46961e(new wr0() { // from class: o.t0j
            @Override // p001o.wr0
            public final zfa apply(Object obj) {
                return this.f46193a.m52212p(list, (Void) obj);
            }
        }, gb2.m28293a()).m46961e(new wr0() { // from class: o.u0j
            @Override // p001o.wr0
            public final zfa apply(Object obj) {
                return v0j.m52213q(zfaVarMo37116h, (Void) obj);
            }
        }, gb2.m28293a())));
    }

    /* renamed from: m */
    public final int m52214m(cd2 cd2Var) {
        Integer num = (Integer) cd2Var.m20885g().mo36958d(cd2.f17858j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: n */
    public final int m52215n(cd2 cd2Var) {
        Integer num = (Integer) cd2Var.m20885g().mo36958d(cd2.f17857i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
