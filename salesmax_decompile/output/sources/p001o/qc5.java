package p001o;

import android.view.Choreographer;
import p001o.plb;
import p001o.q74;
import p001o.vre;

/* loaded from: classes2.dex */
public final class qc5 implements plb {

    /* renamed from: a */
    public static final qc5 f41612a = new qc5();

    /* renamed from: b */
    public static final Choreographer f41613b = (Choreographer) pm1.m43865e(eu5.m25612c().v0(), new C16333a(null));

    /* renamed from: o.qc5$a */
    public static final class C16333a extends jgg implements nl7 {

        /* renamed from: a */
        public int f41614a;

        public C16333a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C16333a(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f41614a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return Choreographer.getInstance();
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16333a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.qc5$b */
    public static final class C16334b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Choreographer.FrameCallback f41615a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16334b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f41615a = frameCallback;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            qc5.f41613b.removeFrameCallback(this.f41615a);
        }
    }

    /* renamed from: o.qc5$c */
    public static final class ChoreographerFrameCallbackC16335c implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final /* synthetic */ xb2 f41616a;

        /* renamed from: b */
        public final /* synthetic */ xk7 f41617b;

        public ChoreographerFrameCallbackC16335c(xb2 xb2Var, xk7 xk7Var) {
            this.f41616a = xb2Var;
            this.f41617b = xk7Var;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objM53351b;
            xb2 xb2Var = this.f41616a;
            qc5 qc5Var = qc5.f41612a;
            xk7 xk7Var = this.f41617b;
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
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        ChoreographerFrameCallbackC16335c choreographerFrameCallbackC16335c = new ChoreographerFrameCallbackC16335c(zb2Var, xk7Var);
        f41613b.postFrameCallback(choreographerFrameCallbackC16335c);
        zb2Var.mo48694y(new C16334b(choreographerFrameCallbackC16335c));
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
