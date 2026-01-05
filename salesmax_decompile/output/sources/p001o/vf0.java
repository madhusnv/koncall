package p001o;

import android.view.Choreographer;
import p001o.plb;
import p001o.q74;
import p001o.vre;

/* loaded from: classes2.dex */
public final class vf0 implements plb {

    /* renamed from: a */
    public final Choreographer f50256a;

    /* renamed from: b */
    public final tf0 f50257b;

    /* renamed from: o.vf0$a */
    public static final class C17566a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ tf0 f50258a;

        /* renamed from: b */
        public final /* synthetic */ Choreographer.FrameCallback f50259b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17566a(tf0 tf0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f50258a = tf0Var;
            this.f50259b = frameCallback;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            this.f50258a.P0(this.f50259b);
        }
    }

    /* renamed from: o.vf0$b */
    public static final class C17567b extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ Choreographer.FrameCallback f50261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17567b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f50261b = frameCallback;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            vf0.this.m52686b().removeFrameCallback(this.f50261b);
        }
    }

    /* renamed from: o.vf0$c */
    public static final class ChoreographerFrameCallbackC17568c implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final /* synthetic */ xb2 f50262a;

        /* renamed from: b */
        public final /* synthetic */ vf0 f50263b;

        /* renamed from: c */
        public final /* synthetic */ xk7 f50264c;

        public ChoreographerFrameCallbackC17568c(xb2 xb2Var, vf0 vf0Var, xk7 xk7Var) {
            this.f50262a = xb2Var;
            this.f50263b = vf0Var;
            this.f50264c = xk7Var;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objM53351b;
            xb2 xb2Var = this.f50262a;
            xk7 xk7Var = this.f50264c;
            try {
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(xk7Var.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            xb2Var.resumeWith(objM53351b);
        }
    }

    public vf0(Choreographer choreographer, tf0 tf0Var) {
        sq8.m48649h(choreographer, "choreographer");
        this.f50256a = choreographer;
        this.f50257b = tf0Var;
    }

    /* renamed from: b */
    public final Choreographer m52686b() {
        return this.f50256a;
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        return plb.C16135a.m43844a(this, obj, nl7Var);
    }

    @Override // p001o.q74.InterfaceC16311b, p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        return plb.C16135a.m43845b(this, interfaceC16312c);
    }

    @Override // p001o.plb
    /* renamed from: h */
    public Object mo29725h(xk7 xk7Var, n64 n64Var) {
        tf0 tf0Var = this.f50257b;
        if (tf0Var == null) {
            q74.InterfaceC16311b interfaceC16311b = n64Var.getContext().get(p64.f39391p);
            tf0Var = interfaceC16311b instanceof tf0 ? (tf0) interfaceC16311b : null;
        }
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        ChoreographerFrameCallbackC17568c choreographerFrameCallbackC17568c = new ChoreographerFrameCallbackC17568c(zb2Var, this, xk7Var);
        if (tf0Var == null || !sq8.m48644c(tf0Var.G0(), m52686b())) {
            m52686b().postFrameCallback(choreographerFrameCallbackC17568c);
            zb2Var.mo48694y(new C17567b(choreographerFrameCallbackC17568c));
        } else {
            tf0Var.O0(choreographerFrameCallbackC17568c);
            zb2Var.mo48694y(new C17566a(tf0Var, choreographerFrameCallbackC17568c));
        }
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
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
