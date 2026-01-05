package p001o;

import p001o.mq3;
import p001o.rd2;

/* loaded from: classes2.dex */
public class rd2 implements lce {

    /* renamed from: H */
    public final mq3 f43391H;

    /* renamed from: o.rd2$a */
    public static final class C16591a implements hp6 {

        /* renamed from: a */
        public final qpb f43392a = qpb.a0();

        /* renamed from: e */
        public static C16591a m46538e(final mq3 mq3Var) {
            final C16591a c16591a = new C16591a();
            mq3Var.mo36961g("camera2.captureRequest.option.", new mq3.InterfaceC15403b() { // from class: o.qd2
                @Override // p001o.mq3.InterfaceC15403b
                /* renamed from: a */
                public final boolean mo39509a(mq3.AbstractC15402a abstractC15402a) {
                    return rd2.C16591a.m46539f(this.f41637a, mq3Var, abstractC15402a);
                }
            });
            return c16591a;
        }

        /* renamed from: f */
        public static /* synthetic */ boolean m46539f(C16591a c16591a, mq3 mq3Var, mq3.AbstractC15402a abstractC15402a) {
            c16591a.mo17073a().mo45759C(abstractC15402a, mq3Var.mo36959e(abstractC15402a), mq3Var.mo36960f(abstractC15402a));
            return true;
        }

        @Override // p001o.hp6
        /* renamed from: a */
        public vob mo17073a() {
            return this.f43392a;
        }

        /* renamed from: d */
        public rd2 m46540d() {
            return new rd2(tec.m49792Y(this.f43392a));
        }
    }

    public rd2(mq3 mq3Var) {
        this.f43391H = mq3Var;
    }

    @Override // p001o.lce
    public mq3 getConfig() {
        return this.f43391H;
    }
}
