package androidx.lifecycle;

import androidx.lifecycle.AbstractC2139h;
import p001o.a79;
import p001o.eu5;
import p001o.h84;
import p001o.jgg;
import p001o.n64;
import p001o.nl7;
import p001o.q74;
import p001o.rm1;
import p001o.sq8;
import p001o.tca;
import p001o.uq8;
import p001o.wre;
import p001o.xca;
import p001o.y3i;

/* renamed from: androidx.lifecycle.i */
/* loaded from: classes2.dex */
public final class C2140i extends tca implements InterfaceC2142k {

    /* renamed from: a */
    public final AbstractC2139h f7675a;

    /* renamed from: b */
    public final q74 f7676b;

    /* renamed from: androidx.lifecycle.i$a */
    public static final class a extends jgg implements nl7 {

        /* renamed from: a */
        public int f7677a;

        /* renamed from: b */
        public /* synthetic */ Object f7678b;

        public a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            a aVar = C2140i.this.new a(n64Var);
            aVar.f7678b = obj;
            return aVar;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f7677a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            h84 h84Var = (h84) this.f7678b;
            if (C2140i.this.m6530a().mo6522b().compareTo(AbstractC2139h.b.INITIALIZED) >= 0) {
                C2140i.this.m6530a().mo6521a(C2140i.this);
            } else {
                a79.m16547e(h84Var.mo6529D(), null, 1, null);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public C2140i(AbstractC2139h abstractC2139h, q74 q74Var) {
        sq8.m48649h(abstractC2139h, "lifecycle");
        sq8.m48649h(q74Var, "coroutineContext");
        this.f7675a = abstractC2139h;
        this.f7676b = q74Var;
        if (m6530a().mo6522b() == AbstractC2139h.b.DESTROYED) {
            a79.m16547e(mo6529D(), null, 1, null);
        }
    }

    @Override // p001o.h84
    /* renamed from: D */
    public q74 mo6529D() {
        return this.f7676b;
    }

    /* renamed from: a */
    public AbstractC2139h m6530a() {
        return this.f7675a;
    }

    /* renamed from: b */
    public final void m6531b() {
        rm1.m46952d(this, eu5.m25612c().v0(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.InterfaceC2142k
    /* renamed from: o */
    public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
        sq8.m48649h(xcaVar, "source");
        sq8.m48649h(aVar, "event");
        if (m6530a().mo6522b().compareTo(AbstractC2139h.b.DESTROYED) <= 0) {
            m6530a().mo6524d(this);
            a79.m16547e(mo6529D(), null, 1, null);
        }
    }
}
