package androidx.compose.ui.node;

import p001o.alb;
import p001o.bce;
import p001o.fqb;
import p001o.ilb;
import p001o.kf9;
import p001o.pv;
import p001o.qi3;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.compose.ui.node.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1940b {

    /* renamed from: a */
    public static final a f6317a;

    /* renamed from: androidx.compose.ui.node.b$a */
    public static final class a extends alb.AbstractC12216c {
        public String toString() {
            return "<Head>";
        }
    }

    /* renamed from: androidx.compose.ui.node.b$b */
    public static final class b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ fqb f6318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fqb fqbVar) {
            super(1);
            this.f6318a = fqbVar;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(alb.InterfaceC12215b interfaceC12215b) {
            sq8.m48649h(interfaceC12215b, "it");
            this.f6318a.m27344c(interfaceC12215b);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.m17369S(-1);
        f6317a = aVar;
    }

    /* renamed from: d */
    public static final int m5015d(alb.InterfaceC12215b interfaceC12215b, alb.InterfaceC12215b interfaceC12215b2) {
        sq8.m48649h(interfaceC12215b, "prev");
        sq8.m48649h(interfaceC12215b2, "next");
        if (sq8.m48644c(interfaceC12215b, interfaceC12215b2)) {
            return 2;
        }
        return (pv.m44234a(interfaceC12215b, interfaceC12215b2) || ((interfaceC12215b instanceof ForceUpdateElement) && pv.m44234a(((ForceUpdateElement) interfaceC12215b).m4970f(), interfaceC12215b2))) ? 1 : 0;
    }

    /* renamed from: e */
    public static final fqb m5016e(alb albVar, fqb fqbVar) {
        fqb fqbVar2 = new fqb(new alb[bce.m18601d(fqbVar.m27354o(), 16)], 0);
        fqbVar2.m27344c(albVar);
        while (fqbVar2.m27357r()) {
            alb albVar2 = (alb) fqbVar2.m27361v(fqbVar2.m27354o() - 1);
            if (albVar2 instanceof qi3) {
                qi3 qi3Var = (qi3) albVar2;
                fqbVar2.m27344c(qi3Var.m45508d());
                fqbVar2.m27344c(qi3Var.m45509e());
            } else if (albVar2 instanceof alb.InterfaceC12215b) {
                fqbVar.m27344c(albVar2);
            } else {
                albVar2.mo17349a(new b(fqbVar));
            }
        }
        return fqbVar;
    }

    /* renamed from: f */
    public static final void m5017f(ilb ilbVar, alb.AbstractC12216c abstractC12216c) {
        sq8.m48647f(abstractC12216c, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        ilbVar.mo4866e(abstractC12216c);
    }
}
