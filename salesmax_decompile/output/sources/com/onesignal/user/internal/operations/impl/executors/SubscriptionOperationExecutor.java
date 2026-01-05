package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.RootToolsInternalMethods;
import com.onesignal.common.consistency.IamFetchReadyCondition;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.enums.IamFetchRywTokenKey;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.ISubscriptionBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.DeleteSubscriptionOperation;
import com.onesignal.user.internal.operations.TransferSubscriptionOperation;
import com.onesignal.user.internal.operations.UpdateSubscriptionOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.objectweb.asm.Opcodes;
import p001o.bh3;
import p001o.ch3;
import p001o.hsa;
import p001o.hwc;
import p001o.id5;
import p001o.kh3;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.szb;
import p001o.uq8;
import p001o.vyh;
import p001o.wre;

/* loaded from: classes6.dex */
public final class SubscriptionOperationExecutor implements IOperationExecutor {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final Companion Companion = new Companion(null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final IApplicationService _applicationService;
    private final IRebuildUserService _buildUserService;
    private final ConfigModelStore _configModelStore;
    private final IConsistencyManager _consistencyManager;
    private final IDeviceService _deviceService;
    private final NewRecordsState _newRecordState;
    private final ISubscriptionBackendService _subscriptionBackend;
    private final SubscriptionModelStore _subscriptionModelStore;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NetworkUtils.ResponseStatusType.values().length];
            iArr[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            iArr[NetworkUtils.ResponseStatusType.CONFLICT.ordinal()] = 2;
            iArr[NetworkUtils.ResponseStatusType.INVALID.ordinal()] = 3;
            iArr[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 4;
            iArr[NetworkUtils.ResponseStatusType.MISSING.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SubscriptionType.values().length];
            iArr2[SubscriptionType.SMS.ordinal()] = 1;
            iArr2[SubscriptionType.EMAIL.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", m36648f = "SubscriptionOperationExecutor.kt", m36649l = {Opcodes.LDIV, 120, 122}, m36650m = "createSubscription")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor$createSubscription$1 */
    public static final class C118701 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C118701(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionOperationExecutor.this.createSubscription(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", m36648f = "SubscriptionOperationExecutor.kt", m36649l = {277}, m36650m = "deleteSubscription")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor$deleteSubscription$1 */
    public static final class C118711 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118711(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionOperationExecutor.this.deleteSubscription(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", m36648f = "SubscriptionOperationExecutor.kt", m36649l = {241}, m36650m = "transferSubscription")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor$transferSubscription$1 */
    public static final class C118721 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118721(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionOperationExecutor.this.transferSubscription(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", m36648f = "SubscriptionOperationExecutor.kt", m36649l = {Opcodes.ATHROW, Opcodes.MONITORENTER, 196}, m36650m = "updateSubscription")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor$updateSubscription$1 */
    public static final class C118731 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C118731(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionOperationExecutor.this.updateSubscription(null, null, this);
        }
    }

    public SubscriptionOperationExecutor(ISubscriptionBackendService iSubscriptionBackendService, IDeviceService iDeviceService, IApplicationService iApplicationService, SubscriptionModelStore subscriptionModelStore, ConfigModelStore configModelStore, IRebuildUserService iRebuildUserService, NewRecordsState newRecordsState, IConsistencyManager iConsistencyManager) {
        sq8.m48649h(iSubscriptionBackendService, "_subscriptionBackend");
        sq8.m48649h(iDeviceService, "_deviceService");
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(subscriptionModelStore, "_subscriptionModelStore");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iRebuildUserService, "_buildUserService");
        sq8.m48649h(newRecordsState, "_newRecordState");
        sq8.m48649h(iConsistencyManager, "_consistencyManager");
        this._subscriptionBackend = iSubscriptionBackendService;
        this._deviceService = iDeviceService;
        this._applicationService = iApplicationService;
        this._subscriptionModelStore = subscriptionModelStore;
        this._configModelStore = configModelStore;
        this._buildUserService = iRebuildUserService;
        this._newRecordState = newRecordsState;
        this._consistencyManager = iConsistencyManager;
    }

    private final SubscriptionObjectType convert(SubscriptionType subscriptionType) {
        int i = WhenMappings.$EnumSwitchMapping$1[subscriptionType.ordinal()];
        return i != 1 ? i != 2 ? SubscriptionObjectType.Companion.fromDeviceType(this._deviceService.getDeviceType()) : SubscriptionObjectType.EMAIL : SubscriptionObjectType.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(9:13|126|17|83|(1:85)|86|(1:88)|89|90)(2:14|15))(4:21|131|22|23))(4:27|(5:32|(3:35|(2:137|37)(1:138)|33)|136|31|(2:39|40)(15:41|(2:42|(2:44|(1:134)(1:135))(2:133|47))|48|(1:50)(1:51)|(1:55)|56|(1:60)|124|61|(1:63)|64|65|129|66|(1:68)(1:69)))(2:31|(0)(0))|98|(1:(2:121|140)(2:102|(2:104|(2:106|(2:112|(2:114|115)(2:116|117))(2:110|111))(2:118|119))(2:120|139)))(2:122|123))|128|70|(2:72|73)(9:74|(2:76|(1:78))(2:80|(1:82))|79|83|(0)|86|(0)|89|90)) */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0209, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc A[Catch: BackendException -> 0x0057, TryCatch #1 {BackendException -> 0x0057, blocks: (B:17:0x0052, B:83:0x01ad, B:85:0x01bc, B:86:0x01cb, B:88:0x01e1, B:89:0x01ec), top: B:126:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e1 A[Catch: BackendException -> 0x0057, TryCatch #1 {BackendException -> 0x0057, blocks: (B:17:0x0052, B:83:0x01ad, B:85:0x01bc, B:86:0x01cb, B:88:0x01e1, B:89:0x01ec), top: B:126:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSubscription(CreateSubscriptionOperation createSubscriptionOperation, List<? extends Operation> list, n64 n64Var) {
        C118701 c118701;
        boolean z;
        Operation operationPrevious;
        String address;
        SubscriptionStatus status;
        CreateSubscriptionOperation createSubscriptionOperation2;
        SubscriptionOperationExecutor subscriptionOperationExecutor;
        SubscriptionObject subscriptionObject;
        ISubscriptionBackendService iSubscriptionBackendService;
        String appId;
        String onesignalId;
        Object objCreateSubscription;
        SubscriptionOperationExecutor subscriptionOperationExecutor2;
        String str;
        CreateSubscriptionOperation createSubscriptionOperation3;
        int i;
        SubscriptionModel subscriptionModel;
        if (n64Var instanceof C118701) {
            c118701 = (C118701) n64Var;
            int i2 = c118701.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c118701.label = i2 - Integer.MIN_VALUE;
            } else {
                c118701 = new C118701(n64Var);
            }
        }
        Object obj = c118701.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c118701.label;
        if (i3 == 0) {
            wre.m54934b(obj);
            if ((list instanceof Collection) && list.isEmpty()) {
                z = false;
                if (!z) {
                }
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Operation) it.next()) instanceof DeleteSubscriptionOperation) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (!z) {
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
                ListIterator<? extends Operation> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        operationPrevious = null;
                        break;
                    }
                    operationPrevious = listIterator.previous();
                    if (operationPrevious instanceof UpdateSubscriptionOperation) {
                        break;
                    }
                }
                UpdateSubscriptionOperation updateSubscriptionOperation = (UpdateSubscriptionOperation) operationPrevious;
                boolean enabled = updateSubscriptionOperation != null ? updateSubscriptionOperation.getEnabled() : createSubscriptionOperation.getEnabled();
                if (updateSubscriptionOperation == null || (address = updateSubscriptionOperation.getAddress()) == null) {
                    address = createSubscriptionOperation.getAddress();
                }
                String str2 = address;
                if (updateSubscriptionOperation == null || (status = updateSubscriptionOperation.getStatus()) == null) {
                    status = createSubscriptionOperation.getStatus();
                }
                try {
                    SubscriptionObjectType subscriptionObjectTypeConvert = convert(createSubscriptionOperation.getType());
                    Boolean boolM39301a = ml1.m39301a(enabled);
                    Integer numM39304d = ml1.m39304d(status.getValue());
                    String str3 = Build.MODEL;
                    String str4 = Build.VERSION.RELEASE;
                    Boolean boolM39301a2 = ml1.m39301a(RootToolsInternalMethods.INSTANCE.isRooted());
                    DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
                    subscriptionObject = new SubscriptionObject(null, subscriptionObjectTypeConvert, str2, boolM39301a, numM39304d, OneSignalUtils.SDK_VERSION, str3, str4, boolM39301a2, deviceUtils.getNetType(this._applicationService.getAppContext()), deviceUtils.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    iSubscriptionBackendService = this._subscriptionBackend;
                    appId = createSubscriptionOperation.getAppId();
                    onesignalId = createSubscriptionOperation.getOnesignalId();
                    c118701.L$0 = this;
                    createSubscriptionOperation2 = createSubscriptionOperation;
                } catch (BackendException e) {
                    e = e;
                    createSubscriptionOperation2 = createSubscriptionOperation;
                }
                try {
                    c118701.L$1 = createSubscriptionOperation2;
                    c118701.label = 1;
                    objCreateSubscription = iSubscriptionBackendService.createSubscription(appId, IdentityConstants.ONESIGNAL_ID, onesignalId, subscriptionObject, c118701);
                    if (objCreateSubscription == objM51918f) {
                        return objM51918f;
                    }
                    subscriptionOperationExecutor2 = this;
                } catch (BackendException e2) {
                    e = e2;
                    subscriptionOperationExecutor = this;
                    i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i != 1) {
                    }
                }
            }
            i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i != 1) {
                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            if (i == 2 || i == 3) {
                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
            }
            if (i == 4) {
                return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            if (i != 5) {
                throw new szb();
            }
            if (e.getStatusCode() == 404 && subscriptionOperationExecutor._newRecordState.isInMissingRetryWindow(createSubscriptionOperation2.getOnesignalId())) {
                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            List<Operation> rebuildOperationsIfCurrentUser = subscriptionOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(createSubscriptionOperation2.getAppId(), createSubscriptionOperation2.getOnesignalId());
            return rebuildOperationsIfCurrentUser == null ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
        }
        if (i3 == 1) {
            CreateSubscriptionOperation createSubscriptionOperation4 = (CreateSubscriptionOperation) c118701.L$1;
            subscriptionOperationExecutor2 = (SubscriptionOperationExecutor) c118701.L$0;
            try {
                wre.m54934b(obj);
                objCreateSubscription = obj;
                createSubscriptionOperation2 = createSubscriptionOperation4;
            } catch (BackendException e3) {
                e = e3;
                createSubscriptionOperation2 = createSubscriptionOperation4;
                subscriptionOperationExecutor = subscriptionOperationExecutor2;
                i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                }
            }
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c118701.L$2;
            createSubscriptionOperation3 = (CreateSubscriptionOperation) c118701.L$1;
            subscriptionOperationExecutor = (SubscriptionOperationExecutor) c118701.L$0;
            try {
                wre.m54934b(obj);
                subscriptionModel = (SubscriptionModel) subscriptionOperationExecutor._subscriptionModelStore.get(createSubscriptionOperation3.getSubscriptionId());
                if (subscriptionModel != null) {
                    Model.setStringProperty$default(subscriptionModel, OutcomeConstants.OUTCOME_ID, str, ModelChangeTags.HYDRATE, false, 8, null);
                }
                if (sq8.m48644c(subscriptionOperationExecutor._configModelStore.getModel().getPushSubscriptionId(), createSubscriptionOperation3.getSubscriptionId())) {
                    subscriptionOperationExecutor._configModelStore.getModel().setPushSubscriptionId(str);
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, hsa.m31056f(vyh.m53620a(createSubscriptionOperation3.getSubscriptionId(), str)), null, null, 12, null);
            } catch (BackendException e4) {
                e = e4;
                createSubscriptionOperation2 = createSubscriptionOperation3;
            }
        }
        hwc hwcVar = (hwc) objCreateSubscription;
        if (hwcVar == null) {
            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
        }
        String str5 = (String) hwcVar.m31229c();
        RywData rywData = (RywData) hwcVar.m31230d();
        if (rywData != null) {
            IConsistencyManager iConsistencyManager = subscriptionOperationExecutor2._consistencyManager;
            String onesignalId2 = createSubscriptionOperation2.getOnesignalId();
            IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.SUBSCRIPTION;
            c118701.L$0 = subscriptionOperationExecutor2;
            c118701.L$1 = createSubscriptionOperation2;
            c118701.L$2 = str5;
            c118701.label = 2;
            if (iConsistencyManager.setRywData(onesignalId2, iamFetchRywTokenKey, rywData, c118701) == objM51918f) {
                return objM51918f;
            }
        } else {
            IConsistencyManager iConsistencyManager2 = subscriptionOperationExecutor2._consistencyManager;
            c118701.L$0 = subscriptionOperationExecutor2;
            c118701.L$1 = createSubscriptionOperation2;
            c118701.L$2 = str5;
            c118701.label = 3;
            if (iConsistencyManager2.resolveConditionsWithID(IamFetchReadyCondition.ID, c118701) == objM51918f) {
                return objM51918f;
            }
        }
        str = str5;
        subscriptionOperationExecutor = subscriptionOperationExecutor2;
        createSubscriptionOperation3 = createSubscriptionOperation2;
        subscriptionModel = (SubscriptionModel) subscriptionOperationExecutor._subscriptionModelStore.get(createSubscriptionOperation3.getSubscriptionId());
        if (subscriptionModel != null) {
        }
        if (sq8.m48644c(subscriptionOperationExecutor._configModelStore.getModel().getPushSubscriptionId(), createSubscriptionOperation3.getSubscriptionId())) {
        }
        return new ExecutionResponse(ExecutionResult.SUCCESS, hsa.m31056f(vyh.m53620a(createSubscriptionOperation3.getSubscriptionId(), str)), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSubscription(DeleteSubscriptionOperation deleteSubscriptionOperation, n64 n64Var) {
        C118711 c118711;
        DeleteSubscriptionOperation deleteSubscriptionOperation2;
        SubscriptionOperationExecutor subscriptionOperationExecutor;
        DeleteSubscriptionOperation deleteSubscriptionOperation3;
        int i;
        if (n64Var instanceof C118711) {
            c118711 = (C118711) n64Var;
            int i2 = c118711.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c118711.label = i2 - Integer.MIN_VALUE;
            } else {
                c118711 = new C118711(n64Var);
            }
        }
        Object obj = c118711.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c118711.label;
        boolean z = true;
        if (i3 == 0) {
            wre.m54934b(obj);
            try {
                ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                String appId = deleteSubscriptionOperation.getAppId();
                String subscriptionId = deleteSubscriptionOperation.getSubscriptionId();
                c118711.L$0 = this;
                deleteSubscriptionOperation2 = deleteSubscriptionOperation;
                try {
                    c118711.L$1 = deleteSubscriptionOperation2;
                    c118711.label = 1;
                    if (iSubscriptionBackendService.deleteSubscription(appId, subscriptionId, c118711) == objM51918f) {
                        return objM51918f;
                    }
                    subscriptionOperationExecutor = this;
                    deleteSubscriptionOperation3 = deleteSubscriptionOperation2;
                } catch (BackendException e) {
                    e = e;
                    subscriptionOperationExecutor = this;
                    i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i != 1) {
                    }
                }
            } catch (BackendException e2) {
                e = e2;
                deleteSubscriptionOperation2 = deleteSubscriptionOperation;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deleteSubscriptionOperation3 = (DeleteSubscriptionOperation) c118711.L$1;
            subscriptionOperationExecutor = (SubscriptionOperationExecutor) c118711.L$0;
            try {
                wre.m54934b(obj);
            } catch (BackendException e3) {
                e = e3;
                deleteSubscriptionOperation2 = deleteSubscriptionOperation3;
                i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 5) {
                    return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (e.getStatusCode() == 404) {
                    List listM21249n = ch3.m21249n(deleteSubscriptionOperation2.getOnesignalId(), deleteSubscriptionOperation2.getSubscriptionId());
                    if ((listM21249n instanceof Collection) && listM21249n.isEmpty()) {
                        z = false;
                        if (z) {
                        }
                    } else {
                        Iterator it = listM21249n.iterator();
                        while (it.hasNext()) {
                            if (subscriptionOperationExecutor._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                break;
                            }
                        }
                        z = false;
                        if (z) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                    }
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        subscriptionOperationExecutor._subscriptionModelStore.remove(deleteSubscriptionOperation3.getSubscriptionId(), ModelChangeTags.HYDRATE);
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transferSubscription(TransferSubscriptionOperation transferSubscriptionOperation, n64 n64Var) {
        C118721 c118721;
        if (n64Var instanceof C118721) {
            c118721 = (C118721) n64Var;
            int i = c118721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118721.label = i - Integer.MIN_VALUE;
            } else {
                c118721 = new C118721(n64Var);
            }
        }
        C118721 c1187212 = c118721;
        Object obj = c1187212.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1187212.label;
        int i3 = 1;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                String appId = transferSubscriptionOperation.getAppId();
                String subscriptionId = transferSubscriptionOperation.getSubscriptionId();
                String onesignalId = transferSubscriptionOperation.getOnesignalId();
                c1187212.label = 1;
                if (iSubscriptionBackendService.transferSubscription(appId, subscriptionId, IdentityConstants.ONESIGNAL_ID, onesignalId, c1187212) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            i3 = 0;
            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
        } catch (BackendException e) {
            return WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()] == i3 ? new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0 A[Catch: BackendException -> 0x0061, TryCatch #1 {BackendException -> 0x0061, blocks: (B:22:0x005c, B:31:0x00eb, B:33:0x00f0, B:36:0x0107), top: B:68:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107 A[Catch: BackendException -> 0x0061, TRY_LEAVE, TryCatch #1 {BackendException -> 0x0061, blocks: (B:22:0x005c, B:31:0x00eb, B:33:0x00f0, B:36:0x0107), top: B:68:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSubscription(UpdateSubscriptionOperation updateSubscriptionOperation, List<? extends Operation> list, n64 n64Var) {
        C118731 c118731;
        UpdateSubscriptionOperation updateSubscriptionOperation2;
        SubscriptionOperationExecutor subscriptionOperationExecutor;
        UpdateSubscriptionOperation updateSubscriptionOperation3;
        SubscriptionOperationExecutor subscriptionOperationExecutor2;
        UpdateSubscriptionOperation updateSubscriptionOperation4;
        RywData rywData;
        if (n64Var instanceof C118731) {
            c118731 = (C118731) n64Var;
            int i = c118731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118731.label = i - Integer.MIN_VALUE;
            } else {
                c118731 = new C118731(n64Var);
            }
        }
        Object objUpdateSubscription = c118731.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118731.label;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                updateSubscriptionOperation2 = (UpdateSubscriptionOperation) c118731.L$2;
                updateSubscriptionOperation4 = (UpdateSubscriptionOperation) c118731.L$1;
                subscriptionOperationExecutor2 = (SubscriptionOperationExecutor) c118731.L$0;
                try {
                    wre.m54934b(objUpdateSubscription);
                    rywData = (RywData) objUpdateSubscription;
                    if (rywData == null) {
                        IConsistencyManager iConsistencyManager = subscriptionOperationExecutor2._consistencyManager;
                        String onesignalId = updateSubscriptionOperation4.getOnesignalId();
                        IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.SUBSCRIPTION;
                        c118731.L$0 = subscriptionOperationExecutor2;
                        c118731.L$1 = updateSubscriptionOperation2;
                        c118731.L$2 = null;
                        c118731.label = 2;
                        if (iConsistencyManager.setRywData(onesignalId, iamFetchRywTokenKey, rywData, c118731) == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        IConsistencyManager iConsistencyManager2 = subscriptionOperationExecutor2._consistencyManager;
                        c118731.L$0 = subscriptionOperationExecutor2;
                        c118731.L$1 = updateSubscriptionOperation2;
                        c118731.L$2 = null;
                        c118731.label = 3;
                        if (iConsistencyManager2.resolveConditionsWithID(IamFetchReadyCondition.ID, c118731) == objM51918f) {
                            return objM51918f;
                        }
                    }
                } catch (BackendException e) {
                    e = e;
                    updateSubscriptionOperation3 = updateSubscriptionOperation2;
                    subscriptionOperationExecutor = subscriptionOperationExecutor2;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                updateSubscriptionOperation3 = (UpdateSubscriptionOperation) c118731.L$1;
                subscriptionOperationExecutor = (SubscriptionOperationExecutor) c118731.L$0;
                try {
                    wre.m54934b(objUpdateSubscription);
                } catch (BackendException e2) {
                    e = e2;
                }
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i3 == 1) {
                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            if (i3 != 5) {
                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
            }
            if (e.getStatusCode() == 404) {
                List listM21249n = ch3.m21249n(updateSubscriptionOperation3.getOnesignalId(), updateSubscriptionOperation3.getSubscriptionId());
                if ((listM21249n instanceof Collection) && listM21249n.isEmpty()) {
                    z = false;
                    if (z) {
                    }
                } else {
                    Iterator it = listM21249n.iterator();
                    while (it.hasNext()) {
                        if (subscriptionOperationExecutor._newRecordState.isInMissingRetryWindow((String) it.next())) {
                            break;
                        }
                    }
                    z = false;
                    if (z) {
                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                }
            }
            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, bh3.m18963e(new CreateSubscriptionOperation(updateSubscriptionOperation3.getAppId(), updateSubscriptionOperation3.getOnesignalId(), updateSubscriptionOperation3.getSubscriptionId(), updateSubscriptionOperation3.getType(), updateSubscriptionOperation3.getEnabled(), updateSubscriptionOperation3.getAddress(), updateSubscriptionOperation3.getStatus())), null, 10, null);
        }
        wre.m54934b(objUpdateSubscription);
        Object objR0 = kh3.r0(list);
        sq8.m48647f(objR0, "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation");
        updateSubscriptionOperation2 = (UpdateSubscriptionOperation) objR0;
        try {
            SubscriptionObjectType subscriptionObjectTypeConvert = convert(updateSubscriptionOperation2.getType());
            String address = updateSubscriptionOperation2.getAddress();
            Boolean boolM39301a = ml1.m39301a(updateSubscriptionOperation2.getEnabled());
            Integer numM39304d = ml1.m39304d(updateSubscriptionOperation2.getStatus().getValue());
            String str = Build.MODEL;
            String str2 = Build.VERSION.RELEASE;
            Boolean boolM39301a2 = ml1.m39301a(RootToolsInternalMethods.INSTANCE.isRooted());
            DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
            SubscriptionObject subscriptionObject = new SubscriptionObject(null, subscriptionObjectTypeConvert, address, boolM39301a, numM39304d, OneSignalUtils.SDK_VERSION, str, str2, boolM39301a2, deviceUtils.getNetType(this._applicationService.getAppContext()), deviceUtils.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
            ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
            String appId = updateSubscriptionOperation2.getAppId();
            String subscriptionId = updateSubscriptionOperation2.getSubscriptionId();
            c118731.L$0 = this;
            c118731.L$1 = updateSubscriptionOperation;
            c118731.L$2 = updateSubscriptionOperation2;
            c118731.label = 1;
            objUpdateSubscription = iSubscriptionBackendService.updateSubscription(appId, subscriptionId, subscriptionObject, c118731);
            if (objUpdateSubscription == objM51918f) {
                return objM51918f;
            }
            subscriptionOperationExecutor2 = this;
            updateSubscriptionOperation4 = updateSubscriptionOperation;
            rywData = (RywData) objUpdateSubscription;
            if (rywData == null) {
            }
        } catch (BackendException e3) {
            e = e3;
            subscriptionOperationExecutor = this;
            updateSubscriptionOperation3 = updateSubscriptionOperation2;
        }
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, n64 n64Var) throws Exception {
        Logging.log(LogLevel.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        Operation operation = (Operation) kh3.f0(list);
        if (operation instanceof CreateSubscriptionOperation) {
            return createSubscription((CreateSubscriptionOperation) operation, list, n64Var);
        }
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Operation) it.next()) instanceof DeleteSubscriptionOperation) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            if (list.size() > 1) {
                throw new Exception("Only supports one operation! Attempted operations:\n" + list);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof DeleteSubscriptionOperation) {
                    arrayList.add(obj);
                }
            }
            return deleteSubscription((DeleteSubscriptionOperation) kh3.f0(arrayList), n64Var);
        }
        if (operation instanceof UpdateSubscriptionOperation) {
            return updateSubscription((UpdateSubscriptionOperation) operation, list, n64Var);
        }
        if (!(operation instanceof TransferSubscriptionOperation)) {
            throw new Exception("Unrecognized operation: " + operation);
        }
        if (list.size() <= 1) {
            return transferSubscription((TransferSubscriptionOperation) operation, n64Var);
        }
        throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return ch3.m21249n(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
