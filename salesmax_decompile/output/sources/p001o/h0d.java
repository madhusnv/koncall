package p001o;

import p001o.plb;
import p001o.q74;

/* loaded from: classes2.dex */
public final class h0d implements plb {

    /* renamed from: a */
    public final plb f26052a;

    /* renamed from: b */
    public final dh9 f26053b;

    /* renamed from: o.h0d$a */
    public static final class C13839a extends o64 {

        /* renamed from: a */
        public Object f26054a;

        /* renamed from: b */
        public Object f26055b;

        /* renamed from: c */
        public /* synthetic */ Object f26056c;

        /* renamed from: e */
        public int f26058e;

        public C13839a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26056c = obj;
            this.f26058e |= Integer.MIN_VALUE;
            return h0d.this.mo29725h(null, this);
        }
    }

    public h0d(plb plbVar) {
        sq8.m48649h(plbVar, "frameClock");
        this.f26052a = plbVar;
        this.f26053b = new dh9();
    }

    /* renamed from: b */
    public final void m29723b() {
        this.f26053b.m23094d();
    }

    /* renamed from: e */
    public final void m29724e() {
        this.f26053b.m23096f();
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        return plb.C16135a.m43844a(this, obj, nl7Var);
    }

    @Override // p001o.q74.InterfaceC16311b, p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        return plb.C16135a.m43845b(this, interfaceC16312c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.plb
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo29725h(xk7 xk7Var, n64 n64Var) {
        C13839a c13839a;
        h0d h0dVar;
        if (n64Var instanceof C13839a) {
            c13839a = (C13839a) n64Var;
            int i = c13839a.f26058e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13839a.f26058e = i - Integer.MIN_VALUE;
            } else {
                c13839a = new C13839a(n64Var);
            }
        }
        Object objMo29725h = c13839a.f26056c;
        Object objM51918f = uq8.m51918f();
        int i2 = c13839a.f26058e;
        if (i2 == 0) {
            wre.m54934b(objMo29725h);
            dh9 dh9Var = this.f26053b;
            c13839a.f26054a = this;
            c13839a.f26055b = xk7Var;
            c13839a.f26058e = 1;
            if (dh9Var.m23093c(c13839a) == objM51918f) {
                return objM51918f;
            }
            h0dVar = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(objMo29725h);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xk7Var = (xk7) c13839a.f26055b;
            h0dVar = (h0d) c13839a.f26054a;
            wre.m54934b(objMo29725h);
        }
        plb plbVar = h0dVar.f26052a;
        c13839a.f26054a = null;
        c13839a.f26055b = null;
        c13839a.f26058e = 2;
        objMo29725h = plbVar.mo29725h(xk7Var, c13839a);
        return objMo29725h == objM51918f ? objM51918f : objMo29725h;
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return plb.C16135a.m43846c(this, interfaceC16312c);
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return plb.C16135a.m43847d(this, q74Var);
    }
}
