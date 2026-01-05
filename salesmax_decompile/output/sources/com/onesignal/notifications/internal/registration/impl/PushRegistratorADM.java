package com.onesignal.notifications.internal.registration.impl;

import com.amazon.device.messaging.ADM;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import p001o.gge;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.rmh;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class PushRegistratorADM implements IPushRegistrator, IPushRegistratorCallback {
    private final IApplicationService _applicationService;
    private WaiterWithValue<String> waiter;

    @l75(m36647c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorADM", m36648f = "PushRegistratorADM.kt", m36649l = {35}, m36650m = "registerForPush")
    /* renamed from: com.onesignal.notifications.internal.registration.impl.PushRegistratorADM$registerForPush$1 */
    public static final class C118051 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C118051(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PushRegistratorADM.this.registerForPush(this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorADM$registerForPush$2", m36648f = "PushRegistratorADM.kt", m36649l = {um5.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.registration.impl.PushRegistratorADM$registerForPush$2 */
    public static final class C118062 extends jgg implements nl7 {
        final /* synthetic */ gge $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ PushRegistratorADM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118062(gge ggeVar, PushRegistratorADM pushRegistratorADM, n64 n64Var) {
            super(2, n64Var);
            this.$registrationId = ggeVar;
            this.this$0 = pushRegistratorADM;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C118062(this.$registrationId, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            gge ggeVar;
            String str;
            gge ggeVar2;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                ggeVar = this.$registrationId;
                WaiterWithValue waiterWithValue = this.this$0.waiter;
                if (waiterWithValue == null) {
                    str = null;
                    ggeVar.f25106a = str;
                    return y3i.f54824a;
                }
                this.L$0 = ggeVar;
                this.label = 1;
                Object objWaitForWake = waiterWithValue.waitForWake(this);
                if (objWaitForWake == objM51918f) {
                    return objM51918f;
                }
                ggeVar2 = ggeVar;
                obj = objWaitForWake;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ggeVar2 = (gge) this.L$0;
                wre.m54934b(obj);
            }
            gge ggeVar3 = ggeVar2;
            str = (String) obj;
            ggeVar = ggeVar3;
            ggeVar.f25106a = str;
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118062) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public PushRegistratorADM(IApplicationService iApplicationService) {
        sq8.m48649h(iApplicationService, "_applicationService");
        this._applicationService = iApplicationService;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, n64 n64Var) {
        WaiterWithValue<String> waiterWithValue = this.waiter;
        if (waiterWithValue != null) {
            waiterWithValue.wake(str);
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(n64 n64Var) {
        C118051 c118051;
        gge ggeVar;
        if (n64Var instanceof C118051) {
            c118051 = (C118051) n64Var;
            int i = c118051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118051.label = i - Integer.MIN_VALUE;
            } else {
                c118051 = new C118051(n64Var);
            }
        }
        Object obj = c118051.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118051.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            this.waiter = new WaiterWithValue<>();
            ADM adm = new ADM(this._applicationService.getAppContext());
            gge ggeVar2 = new gge();
            String registrationId = adm.getRegistrationId();
            ggeVar2.f25106a = registrationId;
            if (registrationId != null) {
                Logging.debug$default("ADM Already registered with ID:" + ((String) ggeVar2.f25106a), null, 2, null);
                return new IPushRegistrator.RegisterResult((String) ggeVar2.f25106a, SubscriptionStatus.SUBSCRIBED);
            }
            adm.startRegister();
            C118062 c118062 = new C118062(ggeVar2, this, null);
            c118051.L$0 = ggeVar2;
            c118051.label = 1;
            if (rmh.m46984c(30000L, c118062, c118051) == objM51918f) {
                return objM51918f;
            }
            ggeVar = ggeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ggeVar = (gge) c118051.L$0;
            wre.m54934b(obj);
        }
        if (ggeVar.f25106a == null) {
            Logging.error$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
            return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.ERROR);
        }
        Logging.error$default("ADM registered with ID:" + ((String) ggeVar.f25106a), null, 2, null);
        return new IPushRegistrator.RegisterResult((String) ggeVar.f25106a, SubscriptionStatus.SUBSCRIBED);
    }
}
