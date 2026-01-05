package com.onesignal.common.events;

import com.onesignal.common.threading.ThreadUtilsKt;
import org.objectweb.asm.TypeReference;
import p001o.eu5;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.pm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public class CallbackProducer<THandler> implements ICallbackNotifier<THandler> {
    private THandler callback;

    @l75(m36647c = "com.onesignal.common.events.CallbackProducer$fireOnMain$1", m36648f = "CallbackProducer.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.common.events.CallbackProducer$fireOnMain$1 */
    public static final class C115751 extends jgg implements xk7 {
        final /* synthetic */ xk7 $callback;
        int label;
        final /* synthetic */ CallbackProducer<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115751(CallbackProducer<THandler> callbackProducer, xk7 xk7Var, n64 n64Var) {
            super(1, n64Var);
            this.this$0 = callbackProducer;
            this.$callback = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C115751(this.this$0, this.$callback, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            if (((CallbackProducer) this.this$0).callback != null) {
                xk7 xk7Var = this.$callback;
                Object obj2 = ((CallbackProducer) this.this$0).callback;
                sq8.m48646e(obj2);
                xk7Var.invoke(obj2);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C115751) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.common.events.CallbackProducer$suspendingFireOnMain$2", m36648f = "CallbackProducer.kt", m36649l = {TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.common.events.CallbackProducer$suspendingFireOnMain$2 */
    public static final class C115762 extends jgg implements nl7 {
        final /* synthetic */ nl7 $callback;
        int label;
        final /* synthetic */ CallbackProducer<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115762(nl7 nl7Var, CallbackProducer<THandler> callbackProducer, n64 n64Var) {
            super(2, n64Var);
            this.$callback = nl7Var;
            this.this$0 = callbackProducer;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C115762(this.$callback, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                nl7 nl7Var = this.$callback;
                Object obj2 = ((CallbackProducer) this.this$0).callback;
                sq8.m48646e(obj2);
                this.label = 1;
                if (nl7Var.invoke(obj2, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C115762) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public final void fire(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "callback");
        THandler thandler = this.callback;
        if (thandler != null) {
            sq8.m48646e(thandler);
            xk7Var.invoke(thandler);
        }
    }

    public final void fireOnMain(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "callback");
        ThreadUtilsKt.suspendifyOnMain(new C115751(this, xk7Var, null));
    }

    @Override // com.onesignal.common.events.ICallbackNotifier
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // com.onesignal.common.events.ICallbackNotifier
    public void set(THandler thandler) {
        this.callback = thandler;
    }

    public final Object suspendingFire(nl7 nl7Var, n64 n64Var) {
        THandler thandler = this.callback;
        if (thandler == null) {
            return y3i.f54824a;
        }
        sq8.m48646e(thandler);
        Object objInvoke = nl7Var.invoke(thandler, n64Var);
        return objInvoke == uq8.m51918f() ? objInvoke : y3i.f54824a;
    }

    public final Object suspendingFireOnMain(nl7 nl7Var, n64 n64Var) {
        if (this.callback == null) {
            return y3i.f54824a;
        }
        Object objM43867g = pm1.m43867g(eu5.m25612c(), new C115762(nl7Var, this, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }
}
