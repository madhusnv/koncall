package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.IInfluenceManager;
import com.onesignal.session.internal.influence.Influence;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.jgg;
import p001o.kh3;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.x8g;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class OutcomeEventsController implements IOutcomeEventsController, IStartableService, ISessionLifecycleHandler {
    private final ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;
    private final IdentityModelStore _identityModelStore;
    private final IInfluenceManager _influenceManager;
    private final IOutcomeEventsBackendService _outcomeEventsBackend;
    private final IOutcomeEventsRepository _outcomeEventsCache;
    private final IOutcomeEventsPreferences _outcomeEventsPreferences;
    private final ISessionService _session;
    private final ISubscriptionManager _subscriptionManager;
    private final ITime _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InfluenceType.values().length];
            iArr[InfluenceType.DIRECT.ordinal()] = 1;
            iArr[InfluenceType.INDIRECT.ordinal()] = 2;
            iArr[InfluenceType.UNATTRIBUTED.ordinal()] = 3;
            iArr[InfluenceType.DISABLED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfluenceChannel.values().length];
            iArr2[InfluenceChannel.IAM.ordinal()] = 1;
            iArr2[InfluenceChannel.NOTIFICATION.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", m36648f = "OutcomeEventsController.kt", m36649l = {295}, m36650m = "getUniqueIds")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$getUniqueIds$1 */
    public static final class C118301 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118301(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OutcomeEventsController.this.getUniqueIds(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1", m36648f = "OutcomeEventsController.kt", m36649l = {276}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1 */
    public static final class C118311 extends jgg implements xk7 {
        final /* synthetic */ OutcomeEventParams $eventParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118311(OutcomeEventParams outcomeEventParams, n64 n64Var) {
            super(1, n64Var);
            this.$eventParams = outcomeEventParams;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return OutcomeEventsController.this.new C118311(this.$eventParams, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IOutcomeEventsRepository iOutcomeEventsRepository = OutcomeEventsController.this._outcomeEventsCache;
                OutcomeEventParams outcomeEventParams = this.$eventParams;
                this.label = 1;
                if (iOutcomeEventsRepository.saveUniqueOutcomeEventParams(outcomeEventParams, this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C118311) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", m36648f = "OutcomeEventsController.kt", m36649l = {216, 230}, m36650m = "sendAndCreateOutcomeEvent")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$sendAndCreateOutcomeEvent$1 */
    public static final class C118321 extends o64 {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C118321(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OutcomeEventsController.this.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", m36648f = "OutcomeEventsController.kt", m36649l = {TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT, 76}, m36650m = "sendSavedOutcomeEvent")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$sendSavedOutcomeEvent$1 */
    public static final class C118331 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118331(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OutcomeEventsController.this.sendSavedOutcomeEvent(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", m36648f = "OutcomeEventsController.kt", m36649l = {TypeReference.EXCEPTION_PARAMETER, TypeReference.NEW}, m36650m = "sendSavedOutcomes")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$sendSavedOutcomes$1 */
    public static final class C118341 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118341(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OutcomeEventsController.this.sendSavedOutcomes(this);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", m36648f = "OutcomeEventsController.kt", m36649l = {Opcodes.F2L, 153, Opcodes.RET}, m36650m = "sendUniqueOutcomeEvent")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$sendUniqueOutcomeEvent$2 */
    public static final class C118352 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C118352(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OutcomeEventsController.this.sendUniqueOutcomeEvent(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$start$1", m36648f = "OutcomeEventsController.kt", m36649l = {45, 46}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$start$1 */
    public static final class C118361 extends jgg implements xk7 {
        int label;

        public C118361(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return OutcomeEventsController.this.new C118361(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                OutcomeEventsController outcomeEventsController = OutcomeEventsController.this;
                this.label = 1;
                if (outcomeEventsController.sendSavedOutcomes(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            IOutcomeEventsRepository iOutcomeEventsRepository = OutcomeEventsController.this._outcomeEventsCache;
            this.label = 2;
            if (iOutcomeEventsRepository.cleanCachedUniqueOutcomeEventNotifications(this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C118361) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public OutcomeEventsController(ISessionService iSessionService, IInfluenceManager iInfluenceManager, IOutcomeEventsRepository iOutcomeEventsRepository, IOutcomeEventsPreferences iOutcomeEventsPreferences, IOutcomeEventsBackendService iOutcomeEventsBackendService, ConfigModelStore configModelStore, IdentityModelStore identityModelStore, ISubscriptionManager iSubscriptionManager, IDeviceService iDeviceService, ITime iTime) {
        Set<String> setU0;
        sq8.m48649h(iSessionService, "_session");
        sq8.m48649h(iInfluenceManager, "_influenceManager");
        sq8.m48649h(iOutcomeEventsRepository, "_outcomeEventsCache");
        sq8.m48649h(iOutcomeEventsPreferences, "_outcomeEventsPreferences");
        sq8.m48649h(iOutcomeEventsBackendService, "_outcomeEventsBackend");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(iSubscriptionManager, "_subscriptionManager");
        sq8.m48649h(iDeviceService, "_deviceService");
        sq8.m48649h(iTime, "_time");
        this._session = iSessionService;
        this._influenceManager = iInfluenceManager;
        this._outcomeEventsCache = iOutcomeEventsRepository;
        this._outcomeEventsPreferences = iOutcomeEventsPreferences;
        this._outcomeEventsBackend = iOutcomeEventsBackendService;
        this._configModelStore = configModelStore;
        this._identityModelStore = identityModelStore;
        this._subscriptionManager = iSubscriptionManager;
        this._deviceService = iDeviceService;
        this._time = iTime;
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        Set<String> unattributedUniqueOutcomeEventsSentByChannel = iOutcomeEventsPreferences.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.unattributedUniqueOutcomeEventsSentOnSession = (unattributedUniqueOutcomeEventsSentByChannel == null || (setU0 = kh3.U0(unattributedUniqueOutcomeEventsSentByChannel)) == null) ? new LinkedHashSet<>() : setU0;
        iSessionService.subscribe(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUniqueIds(String str, List<Influence> list, n64 n64Var) {
        C118301 c118301;
        if (n64Var instanceof C118301) {
            c118301 = (C118301) n64Var;
            int i = c118301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118301.label = i - Integer.MIN_VALUE;
            } else {
                c118301 = new C118301(n64Var);
            }
        }
        Object notCachedUniqueInfluencesForOutcome = c118301.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118301.label;
        if (i2 == 0) {
            wre.m54934b(notCachedUniqueInfluencesForOutcome);
            IOutcomeEventsRepository iOutcomeEventsRepository = this._outcomeEventsCache;
            c118301.label = 1;
            notCachedUniqueInfluencesForOutcome = iOutcomeEventsRepository.getNotCachedUniqueInfluencesForOutcome(str, list, c118301);
            if (notCachedUniqueInfluencesForOutcome == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(notCachedUniqueInfluencesForOutcome);
        }
        List list2 = (List) notCachedUniqueInfluencesForOutcome;
        if (list2.isEmpty()) {
            return null;
        }
        return list2;
    }

    private final List<Influence> removeDisabledInfluences(List<Influence> list) {
        List<Influence> listT0 = kh3.T0(list);
        for (Influence influence : list) {
            if (influence.getInfluenceType().isDisabled()) {
                Logging.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + influence.getInfluenceChannel(), null, 2, null);
                listT0.remove(influence);
            }
        }
        return listT0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(OutcomeEventParams outcomeEventParams, n64 n64Var) throws BackendException {
        String appId = this._configModelStore.getModel().getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = SubscriptionObjectType.Companion.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (!(id.length() == 0)) {
            if (!(value.length() == 0)) {
                OutcomeEvent outcomeEventFromOutcomeEventParamstoOutcomeEvent = OutcomeEvent.Companion.fromOutcomeEventParamstoOutcomeEvent(outcomeEventParams);
                int i = WhenMappings.$EnumSwitchMapping$0[outcomeEventFromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
                Object objSendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, this._identityModelStore.getModel().getOnesignalId(), id, value, i != 1 ? i != 2 ? null : ml1.m39301a(false) : ml1.m39301a(true), outcomeEventFromOutcomeEventParamstoOutcomeEvent, n64Var);
                return objSendOutcomeEvent == uq8.m51918f() ? objSendOutcomeEvent : y3i.f54824a;
            }
        }
        throw new BackendException(0, null, null, 6, null);
    }

    private final void saveAttributedUniqueOutcomeNotifications(OutcomeEventParams outcomeEventParams) {
        ThreadUtilsKt.suspendifyOnThread(10, new C118311(outcomeEventParams, null));
    }

    private final void saveUnattributedUniqueOutcomeEvents() {
        this._outcomeEventsPreferences.setUnattributedUniqueOutcomeEventsSentByChannel(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private final void saveUniqueOutcome(OutcomeEventParams outcomeEventParams) {
        if (outcomeEventParams.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(outcomeEventParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAndCreateOutcomeEvent(String str, float f, long j, List<Influence> list, n64 n64Var) {
        C118321 c118321;
        String str2;
        BackendException backendException;
        OutcomeEventsController outcomeEventsController;
        OutcomeEventParams outcomeEventParams;
        long j2;
        OutcomeEventsController outcomeEventsController2;
        String str3;
        IOutcomeEventsRepository iOutcomeEventsRepository;
        if (n64Var instanceof C118321) {
            c118321 = (C118321) n64Var;
            int i = c118321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118321.label = i - Integer.MIN_VALUE;
            } else {
                c118321 = new C118321(n64Var);
            }
        }
        Object obj = c118321.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118321.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
            boolean z = false;
            OutcomeSourceBody sourceChannelIds = null;
            OutcomeSourceBody sourceChannelIds2 = null;
            for (Influence influence : list) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[influence.getInfluenceType().ordinal()];
                if (i3 == 1) {
                    if (sourceChannelIds == null) {
                        sourceChannelIds = new OutcomeSourceBody(null, null, 3, null);
                    }
                    sourceChannelIds = setSourceChannelIds(influence, sourceChannelIds);
                } else if (i3 == 2) {
                    if (sourceChannelIds2 == null) {
                        sourceChannelIds2 = new OutcomeSourceBody(null, null, 3, null);
                    }
                    sourceChannelIds2 = setSourceChannelIds(influence, sourceChannelIds2);
                } else if (i3 == 3) {
                    z = true;
                } else if (i3 == 4) {
                    Logging.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + influence.getInfluenceChannel(), null, 2, null);
                }
            }
            if (sourceChannelIds == null && sourceChannelIds2 == null && !z) {
                Logging.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                return null;
            }
            OutcomeEventParams outcomeEventParams2 = new OutcomeEventParams(str, new OutcomeSource(sourceChannelIds, sourceChannelIds2), f, j, 0L);
            try {
                c118321.L$0 = this;
                str2 = str;
                try {
                    c118321.L$1 = str2;
                    c118321.L$2 = outcomeEventParams2;
                    c118321.J$0 = currentTimeMillis;
                    c118321.label = 1;
                    if (requestMeasureOutcomeEvent(outcomeEventParams2, c118321) == objM51918f) {
                        return objM51918f;
                    }
                    outcomeEventsController2 = this;
                    outcomeEventParams = outcomeEventParams2;
                    j2 = currentTimeMillis;
                    str3 = str2;
                } catch (BackendException e) {
                    e = e;
                    backendException = e;
                    outcomeEventsController = this;
                    outcomeEventParams = outcomeEventParams2;
                    j2 = currentTimeMillis;
                    Logging.warn$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + backendException.getStatusCode() + " and response: " + backendException.getResponse() + "\nOutcome event was cached and will be reattempted on app cold start", null, 2, null);
                    outcomeEventParams.setTimestamp(j2);
                    iOutcomeEventsRepository = outcomeEventsController._outcomeEventsCache;
                    c118321.L$0 = null;
                    c118321.L$1 = null;
                    c118321.L$2 = null;
                    c118321.label = 2;
                    if (iOutcomeEventsRepository.saveOutcomeEvent(outcomeEventParams, c118321) != objM51918f) {
                    }
                }
            } catch (BackendException e2) {
                e = e2;
                str2 = str;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return null;
            }
            j2 = c118321.J$0;
            outcomeEventParams = (OutcomeEventParams) c118321.L$2;
            str3 = (String) c118321.L$1;
            outcomeEventsController2 = (OutcomeEventsController) c118321.L$0;
            try {
                wre.m54934b(obj);
            } catch (BackendException e3) {
                String str4 = str3;
                backendException = e3;
                outcomeEventsController = outcomeEventsController2;
                str2 = str4;
                Logging.warn$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + backendException.getStatusCode() + " and response: " + backendException.getResponse() + "\nOutcome event was cached and will be reattempted on app cold start", null, 2, null);
                outcomeEventParams.setTimestamp(j2);
                iOutcomeEventsRepository = outcomeEventsController._outcomeEventsCache;
                c118321.L$0 = null;
                c118321.L$1 = null;
                c118321.L$2 = null;
                c118321.label = 2;
                if (iOutcomeEventsRepository.saveOutcomeEvent(outcomeEventParams, c118321) != objM51918f) {
                    return objM51918f;
                }
                return null;
            }
        }
        outcomeEventsController2.saveUniqueOutcome(outcomeEventParams);
        return OutcomeEvent.Companion.fromOutcomeEventParamstoOutcomeEvent(outcomeEventParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomeEvent(OutcomeEventParams outcomeEventParams, n64 n64Var) {
        C118331 c118331;
        OutcomeEventsController outcomeEventsController;
        if (n64Var instanceof C118331) {
            c118331 = (C118331) n64Var;
            int i = c118331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118331.label = i - Integer.MIN_VALUE;
            } else {
                c118331 = new C118331(n64Var);
            }
        }
        Object obj = c118331.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118331.label;
        try {
        } catch (BackendException e) {
            Logging.warn$default("OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: " + outcomeEventParams.getOutcomeId() + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse() + "\nOutcome event was cached and will be reattempted on app cold start", null, 2, null);
        }
        if (i2 == 0) {
            wre.m54934b(obj);
            c118331.L$0 = this;
            c118331.L$1 = outcomeEventParams;
            c118331.label = 1;
            if (requestMeasureOutcomeEvent(outcomeEventParams, c118331) == objM51918f) {
                return objM51918f;
            }
            outcomeEventsController = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return y3i.f54824a;
            }
            outcomeEventParams = (OutcomeEventParams) c118331.L$1;
            outcomeEventsController = (OutcomeEventsController) c118331.L$0;
            wre.m54934b(obj);
        }
        IOutcomeEventsRepository iOutcomeEventsRepository = outcomeEventsController._outcomeEventsCache;
        c118331.L$0 = outcomeEventParams;
        c118331.L$1 = null;
        c118331.label = 2;
        if (iOutcomeEventsRepository.deleteOldOutcomeEvent(outcomeEventParams, c118331) == objM51918f) {
            return objM51918f;
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomes(n64 n64Var) {
        C118341 c118341;
        OutcomeEventsController outcomeEventsController;
        OutcomeEventsController outcomeEventsController2;
        Iterator it;
        if (n64Var instanceof C118341) {
            c118341 = (C118341) n64Var;
            int i = c118341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118341.label = i - Integer.MIN_VALUE;
            } else {
                c118341 = new C118341(n64Var);
            }
        }
        Object allEventsToSend = c118341.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118341.label;
        if (i2 == 0) {
            wre.m54934b(allEventsToSend);
            IOutcomeEventsRepository iOutcomeEventsRepository = this._outcomeEventsCache;
            c118341.L$0 = this;
            c118341.label = 1;
            allEventsToSend = iOutcomeEventsRepository.getAllEventsToSend(c118341);
            if (allEventsToSend == objM51918f) {
                return objM51918f;
            }
            outcomeEventsController = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c118341.L$1;
                outcomeEventsController2 = (OutcomeEventsController) c118341.L$0;
                wre.m54934b(allEventsToSend);
                while (it.hasNext()) {
                    OutcomeEventParams outcomeEventParams = (OutcomeEventParams) it.next();
                    c118341.L$0 = outcomeEventsController2;
                    c118341.L$1 = it;
                    c118341.label = 2;
                    if (outcomeEventsController2.sendSavedOutcomeEvent(outcomeEventParams, c118341) == objM51918f) {
                        return objM51918f;
                    }
                }
                return y3i.f54824a;
            }
            outcomeEventsController = (OutcomeEventsController) c118341.L$0;
            wre.m54934b(allEventsToSend);
        }
        outcomeEventsController2 = outcomeEventsController;
        it = ((List) allEventsToSend).iterator();
        while (it.hasNext()) {
        }
        return y3i.f54824a;
    }

    private final OutcomeSourceBody setSourceChannelIds(Influence influence, OutcomeSourceBody outcomeSourceBody) {
        int i = WhenMappings.$EnumSwitchMapping$1[influence.getInfluenceChannel().ordinal()];
        if (i == 1) {
            outcomeSourceBody.setInAppMessagesIds(influence.getIds());
        } else if (i == 2) {
            outcomeSourceBody.setNotificationIds(influence.getIds());
        }
        return outcomeSourceBody;
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j) {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        Logging.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendOutcomeEvent(String str, n64 n64Var) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), n64Var);
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendOutcomeEventWithValue(String str, float f, n64 n64Var) {
        return sendAndCreateOutcomeEvent(str, f, 0L, this._influenceManager.getInfluences(), n64Var);
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendSessionEndOutcomeEvent(long j, n64 n64Var) {
        List<Influence> influences = this._influenceManager.getInfluences();
        Iterator<Influence> it = influences.iterator();
        while (it.hasNext()) {
            if (it.next().getIds() != null) {
                return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j, influences, n64Var);
            }
        }
        return null;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendUniqueOutcomeEvent(String str, n64 n64Var) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), n64Var);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        ThreadUtilsKt.suspendifyOnThread$default(0, new C118361(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendUniqueOutcomeEvent(String str, List<Influence> list, n64 n64Var) {
        C118352 c118352;
        boolean z;
        OutcomeEventsController outcomeEventsController;
        String str2;
        List<Influence> list2;
        List<Influence> list3;
        if (n64Var instanceof C118352) {
            c118352 = (C118352) n64Var;
            int i = c118352.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118352.label = i - Integer.MIN_VALUE;
            } else {
                c118352 = new C118352(n64Var);
            }
        }
        C118352 c1183522 = c118352;
        Object objSendAndCreateOutcomeEvent = c1183522.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1183522.label;
        if (i2 == 0) {
            wre.m54934b(objSendAndCreateOutcomeEvent);
            List<Influence> listRemoveDisabledInfluences = removeDisabledInfluences(list);
            if (listRemoveDisabledInfluences.isEmpty()) {
                Logging.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                return null;
            }
            Iterator<Influence> it = listRemoveDisabledInfluences.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (it.next().getInfluenceType().isAttributed()) {
                    z = true;
                    break;
                }
            }
            if (z) {
                c1183522.L$0 = this;
                c1183522.L$1 = str;
                c1183522.L$2 = listRemoveDisabledInfluences;
                c1183522.label = 1;
                objSendAndCreateOutcomeEvent = getUniqueIds(str, listRemoveDisabledInfluences, c1183522);
                if (objSendAndCreateOutcomeEvent == objM51918f) {
                    return objM51918f;
                }
                outcomeEventsController = this;
                str2 = str;
                list2 = listRemoveDisabledInfluences;
                list3 = (List) objSendAndCreateOutcomeEvent;
                if (list3 != null) {
                }
            } else {
                if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                    Logging.debug$default(x8g.m55850f("\n                    Measure endpoint will not send because unique outcome already sent for: \n                    Session: " + InfluenceType.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                    return null;
                }
                this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                c1183522.label = 3;
                objSendAndCreateOutcomeEvent = sendAndCreateOutcomeEvent(str, 0.0f, 0L, listRemoveDisabledInfluences, c1183522);
                return objSendAndCreateOutcomeEvent == objM51918f ? objM51918f : objSendAndCreateOutcomeEvent;
            }
        } else if (i2 == 1) {
            list2 = (List) c1183522.L$2;
            str2 = (String) c1183522.L$1;
            outcomeEventsController = (OutcomeEventsController) c1183522.L$0;
            wre.m54934b(objSendAndCreateOutcomeEvent);
            list3 = (List) objSendAndCreateOutcomeEvent;
            if (list3 != null) {
                Logging.debug$default(x8g.m55850f("\n                    Measure endpoint will not send because unique outcome already sent for: \n                    SessionInfluences: " + list2 + "\n                    Outcome name: " + str2 + "\n                    "), null, 2, null);
                return null;
            }
            c1183522.L$0 = null;
            c1183522.L$1 = null;
            c1183522.L$2 = null;
            c1183522.label = 2;
            objSendAndCreateOutcomeEvent = outcomeEventsController.sendAndCreateOutcomeEvent(str2, 0.0f, 0L, list3, c1183522);
            if (objSendAndCreateOutcomeEvent == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    wre.m54934b(objSendAndCreateOutcomeEvent);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objSendAndCreateOutcomeEvent);
        }
        return objSendAndCreateOutcomeEvent;
    }
}
