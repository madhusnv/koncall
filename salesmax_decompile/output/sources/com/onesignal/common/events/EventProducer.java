package com.onesignal.common.events;

import com.google.firebase.messaging.Constants;
import com.onesignal.common.threading.ThreadUtilsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.eu5;
import p001o.h84;
import p001o.jgg;
import p001o.kh3;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.pm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public class EventProducer<THandler> implements IEventNotifier<THandler> {
    private final List<THandler> subscribers;

    @l75(m36647c = "com.onesignal.common.events.EventProducer$fireOnMain$1", m36648f = "EventProducer.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.common.events.EventProducer$fireOnMain$1 */
    public static final class C115771 extends jgg implements xk7 {
        final /* synthetic */ xk7 $callback;
        int label;
        final /* synthetic */ EventProducer<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115771(EventProducer<THandler> eventProducer, xk7 xk7Var, n64 n64Var) {
            super(1, n64Var);
            this.this$0 = eventProducer;
            this.$callback = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C115771(this.this$0, this.$callback, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            List listQ0;
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            List list = ((EventProducer) this.this$0).subscribers;
            EventProducer<THandler> eventProducer = this.this$0;
            synchronized (list) {
                listQ0 = kh3.Q0(((EventProducer) eventProducer).subscribers);
            }
            Iterator it = listQ0.iterator();
            while (it.hasNext()) {
                this.$callback.invoke(it.next());
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C115771) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.common.events.EventProducer", m36648f = "EventProducer.kt", m36649l = {Opcodes.IASTORE}, m36650m = "suspendingFire")
    /* renamed from: com.onesignal.common.events.EventProducer$suspendingFire$1 */
    public static final class C115781 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ EventProducer<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115781(EventProducer<THandler> eventProducer, n64 n64Var) {
            super(n64Var);
            this.this$0 = eventProducer;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.suspendingFire(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.common.events.EventProducer$suspendingFireOnMain$2", m36648f = "EventProducer.kt", m36649l = {Opcodes.DUP2_X1}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.common.events.EventProducer$suspendingFireOnMain$2 */
    public static final class C115792 extends jgg implements nl7 {
        final /* synthetic */ nl7 $callback;
        Object L$0;
        int label;
        final /* synthetic */ EventProducer<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115792(EventProducer<THandler> eventProducer, nl7 nl7Var, n64 n64Var) {
            super(2, n64Var);
            this.this$0 = eventProducer;
            this.$callback = nl7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C115792(this.this$0, this.$callback, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            List listQ0;
            Iterator it;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                List list = ((EventProducer) this.this$0).subscribers;
                EventProducer<THandler> eventProducer = this.this$0;
                synchronized (list) {
                    listQ0 = kh3.Q0(((EventProducer) eventProducer).subscribers);
                }
                it = listQ0.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                wre.m54934b(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                nl7 nl7Var = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (nl7Var.invoke(next, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C115792) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public EventProducer() {
        List<THandler> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        sq8.m48648g(listSynchronizedList, "synchronizedList(mutableListOf())");
        this.subscribers = listSynchronizedList;
    }

    public final void fire(xk7 xk7Var) {
        List listQ0;
        sq8.m48649h(xk7Var, "callback");
        synchronized (this.subscribers) {
            listQ0 = kh3.Q0(this.subscribers);
        }
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            xk7Var.invoke(it.next());
        }
    }

    public final void fireOnMain(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "callback");
        ThreadUtilsKt.suspendifyOnMain(new C115771(this, xk7Var, null));
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return kh3.m35705U(this.subscribers);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(THandler thandler) {
        synchronized (this.subscribers) {
            this.subscribers.add(thandler);
        }
    }

    public final void subscribeAll(EventProducer<THandler> eventProducer) {
        sq8.m48649h(eventProducer, Constants.MessagePayloadKeys.FROM);
        synchronized (this.subscribers) {
            Iterator<THandler> it = eventProducer.subscribers.iterator();
            while (it.hasNext()) {
                subscribe(it.next());
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendingFire(nl7 nl7Var, n64 n64Var) {
        C115781 c115781;
        List listQ0;
        nl7 nl7Var2;
        Iterator it;
        if (n64Var instanceof C115781) {
            c115781 = (C115781) n64Var;
            int i = c115781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c115781.label = i - Integer.MIN_VALUE;
            } else {
                c115781 = new C115781(this, n64Var);
            }
        }
        Object obj = c115781.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c115781.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            synchronized (this.subscribers) {
                listQ0 = kh3.Q0(this.subscribers);
            }
            nl7Var2 = nl7Var;
            it = listQ0.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c115781.L$1;
            nl7 nl7Var3 = (nl7) c115781.L$0;
            wre.m54934b(obj);
            nl7Var2 = nl7Var3;
        }
        while (it.hasNext()) {
            Object next = it.next();
            c115781.L$0 = nl7Var2;
            c115781.L$1 = it;
            c115781.label = 1;
            if (nl7Var2.invoke(next, c115781) == objM51918f) {
                return objM51918f;
            }
        }
        return y3i.f54824a;
    }

    public final Object suspendingFireOnMain(nl7 nl7Var, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25612c(), new C115792(this, nl7Var, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(THandler thandler) {
        synchronized (this.subscribers) {
            this.subscribers.remove(thandler);
        }
    }
}
