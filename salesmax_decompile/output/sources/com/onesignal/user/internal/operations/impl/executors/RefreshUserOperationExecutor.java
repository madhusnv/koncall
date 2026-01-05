package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.NetworkUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.MapModel;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.CreateUserResponse;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.bh3;
import p001o.id5;
import p001o.kh3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public final class RefreshUserOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String REFRESH_USER = "refresh-user";
    private final IRebuildUserService _buildUserService;
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final NewRecordsState _newRecordState;
    private final PropertiesModelStore _propertiesModelStore;
    private final SubscriptionModelStore _subscriptionsModelStore;
    private final IUserBackendService _userBackend;

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
            int[] iArr = new int[SubscriptionObjectType.values().length];
            iArr[SubscriptionObjectType.EMAIL.ordinal()] = 1;
            iArr[SubscriptionObjectType.SMS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NetworkUtils.ResponseStatusType.values().length];
            iArr2[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            iArr2[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            iArr2[NetworkUtils.ResponseStatusType.MISSING.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.RefreshUserOperationExecutor", m36648f = "RefreshUserOperationExecutor.kt", m36649l = {58}, m36650m = "getUser")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.RefreshUserOperationExecutor$getUser$1 */
    public static final class C118691 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118691(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RefreshUserOperationExecutor.this.getUser(null, this);
        }
    }

    public RefreshUserOperationExecutor(IUserBackendService iUserBackendService, IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore, SubscriptionModelStore subscriptionModelStore, ConfigModelStore configModelStore, IRebuildUserService iRebuildUserService, NewRecordsState newRecordsState) {
        sq8.m48649h(iUserBackendService, "_userBackend");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(propertiesModelStore, "_propertiesModelStore");
        sq8.m48649h(subscriptionModelStore, "_subscriptionsModelStore");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iRebuildUserService, "_buildUserService");
        sq8.m48649h(newRecordsState, "_newRecordState");
        this._userBackend = iUserBackendService;
        this._identityModelStore = identityModelStore;
        this._propertiesModelStore = propertiesModelStore;
        this._subscriptionsModelStore = subscriptionModelStore;
        this._configModelStore = configModelStore;
        this._buildUserService = iRebuildUserService;
        this._newRecordState = newRecordsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: BackendException -> 0x0038, TryCatch #2 {BackendException -> 0x0038, blocks: (B:12:0x0034, B:25:0x0063, B:27:0x007b, B:29:0x008a, B:30:0x009b, B:32:0x00a1, B:33:0x00b3, B:35:0x00c9, B:36:0x00d4, B:38:0x00de, B:39:0x00e9, B:41:0x00f3, B:42:0x0103, B:44:0x0109, B:46:0x0115, B:47:0x0128, B:49:0x0132, B:50:0x013d, B:51:0x014a, B:53:0x0150, B:57:0x016e, B:59:0x0179, B:61:0x0184, B:63:0x018a, B:64:0x018c, B:67:0x01a2, B:70:0x01aa, B:72:0x01b5, B:76:0x01c0, B:79:0x01ca, B:82:0x01d4, B:85:0x01de, B:89:0x01e9, B:91:0x01f4, B:68:0x01a5, B:69:0x01a8, B:60:0x017e, B:92:0x01f9, B:94:0x0207, B:96:0x0211, B:97:0x0214), top: B:128:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: BackendException -> 0x0038, TryCatch #2 {BackendException -> 0x0038, blocks: (B:12:0x0034, B:25:0x0063, B:27:0x007b, B:29:0x008a, B:30:0x009b, B:32:0x00a1, B:33:0x00b3, B:35:0x00c9, B:36:0x00d4, B:38:0x00de, B:39:0x00e9, B:41:0x00f3, B:42:0x0103, B:44:0x0109, B:46:0x0115, B:47:0x0128, B:49:0x0132, B:50:0x013d, B:51:0x014a, B:53:0x0150, B:57:0x016e, B:59:0x0179, B:61:0x0184, B:63:0x018a, B:64:0x018c, B:67:0x01a2, B:70:0x01aa, B:72:0x01b5, B:76:0x01c0, B:79:0x01ca, B:82:0x01d4, B:85:0x01de, B:89:0x01e9, B:91:0x01f4, B:68:0x01a5, B:69:0x01a8, B:60:0x017e, B:92:0x01f9, B:94:0x0207, B:96:0x0211, B:97:0x0214), top: B:128:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUser(RefreshUserOperation refreshUserOperation, n64 n64Var) {
        C118691 c118691;
        RefreshUserOperation refreshUserOperation2;
        RefreshUserOperationExecutor refreshUserOperationExecutor;
        RefreshUserOperation refreshUserOperation3;
        int i;
        SubscriptionModel subscriptionModel;
        if (n64Var instanceof C118691) {
            c118691 = (C118691) n64Var;
            int i2 = c118691.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c118691.label = i2 - Integer.MIN_VALUE;
            } else {
                c118691 = new C118691(n64Var);
            }
        }
        Object user = c118691.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c118691.label;
        if (i3 == 0) {
            wre.m54934b(user);
            try {
                IUserBackendService iUserBackendService = this._userBackend;
                String appId = refreshUserOperation.getAppId();
                String onesignalId = refreshUserOperation.getOnesignalId();
                c118691.L$0 = this;
                refreshUserOperation2 = refreshUserOperation;
                try {
                    c118691.L$1 = refreshUserOperation2;
                    c118691.label = 1;
                    user = iUserBackendService.getUser(appId, IdentityConstants.ONESIGNAL_ID, onesignalId, c118691);
                    if (user == objM51918f) {
                        return objM51918f;
                    }
                    refreshUserOperationExecutor = this;
                    refreshUserOperation3 = refreshUserOperation2;
                    CreateUserResponse createUserResponse = (CreateUserResponse) user;
                    if (sq8.m48644c(refreshUserOperation3.getOnesignalId(), refreshUserOperationExecutor._identityModelStore.getModel().getOnesignalId())) {
                    }
                } catch (BackendException e) {
                    e = e;
                    refreshUserOperationExecutor = this;
                    refreshUserOperation3 = refreshUserOperation2;
                    i = WhenMappings.$EnumSwitchMapping$1[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i != 1) {
                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i == 2) {
                        return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i != 3) {
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (e.getStatusCode() == 404 && refreshUserOperationExecutor._newRecordState.isInMissingRetryWindow(refreshUserOperation3.getOnesignalId())) {
                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    List<Operation> rebuildOperationsIfCurrentUser = refreshUserOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(refreshUserOperation3.getAppId(), refreshUserOperation3.getOnesignalId());
                    return rebuildOperationsIfCurrentUser == null ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                }
            } catch (BackendException e2) {
                e = e2;
                refreshUserOperation2 = refreshUserOperation;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            refreshUserOperation3 = (RefreshUserOperation) c118691.L$1;
            refreshUserOperationExecutor = (RefreshUserOperationExecutor) c118691.L$0;
            try {
                wre.m54934b(user);
                CreateUserResponse createUserResponse2 = (CreateUserResponse) user;
                if (sq8.m48644c(refreshUserOperation3.getOnesignalId(), refreshUserOperationExecutor._identityModelStore.getModel().getOnesignalId())) {
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
                IdentityModel identityModel = new IdentityModel();
                for (Map.Entry<String, String> entry : createUserResponse2.getIdentities().entrySet()) {
                    identityModel.put((IdentityModel) entry.getKey(), entry.getValue());
                }
                PropertiesModel propertiesModel = new PropertiesModel();
                propertiesModel.setOnesignalId(refreshUserOperation3.getOnesignalId());
                if (createUserResponse2.getProperties().getCountry() != null) {
                    propertiesModel.setCountry(createUserResponse2.getProperties().getCountry());
                }
                if (createUserResponse2.getProperties().getLanguage() != null) {
                    propertiesModel.setLanguage(createUserResponse2.getProperties().getLanguage());
                }
                if (createUserResponse2.getProperties().getTags() != null) {
                    for (Map.Entry<String, String> entry2 : createUserResponse2.getProperties().getTags().entrySet()) {
                        if (entry2.getValue() != null) {
                            MapModel<String> tags = propertiesModel.getTags();
                            String key = entry2.getKey();
                            String value = entry2.getValue();
                            sq8.m48646e(value);
                            tags.put((MapModel<String>) key, value);
                        }
                    }
                }
                if (createUserResponse2.getProperties().getTimezoneId() != null) {
                    propertiesModel.setTimezone(createUserResponse2.getProperties().getTimezoneId());
                }
                ArrayList arrayList = new ArrayList();
                for (SubscriptionObject subscriptionObject : createUserResponse2.getSubscriptions()) {
                    SubscriptionModel subscriptionModel2 = new SubscriptionModel();
                    String id = subscriptionObject.getId();
                    sq8.m48646e(id);
                    subscriptionModel2.setId(id);
                    String token = subscriptionObject.getToken();
                    String str = "";
                    if (token == null) {
                        token = "";
                    }
                    subscriptionModel2.setAddress(token);
                    SubscriptionStatus.Companion companion = SubscriptionStatus.Companion;
                    Integer notificationTypes = subscriptionObject.getNotificationTypes();
                    SubscriptionStatus subscriptionStatusFromInt = companion.fromInt(notificationTypes != null ? notificationTypes.intValue() : SubscriptionStatus.SUBSCRIBED.getValue());
                    if (subscriptionStatusFromInt == null) {
                        subscriptionStatusFromInt = SubscriptionStatus.SUBSCRIBED;
                    }
                    subscriptionModel2.setStatus(subscriptionStatusFromInt);
                    SubscriptionObjectType type2 = subscriptionObject.getType();
                    sq8.m48646e(type2);
                    int i4 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                    subscriptionModel2.setType(i4 != 1 ? i4 != 2 ? SubscriptionType.PUSH : SubscriptionType.SMS : SubscriptionType.EMAIL);
                    subscriptionModel2.setOptedIn((subscriptionModel2.getStatus() == SubscriptionStatus.UNSUBSCRIBE || subscriptionModel2.getStatus() == SubscriptionStatus.DISABLED_FROM_REST_API_DEFAULT_REASON) ? false : true);
                    String sdk = subscriptionObject.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    subscriptionModel2.setSdk(sdk);
                    String deviceOS = subscriptionObject.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    subscriptionModel2.setDeviceOS(deviceOS);
                    String carrier = subscriptionObject.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    subscriptionModel2.setCarrier(carrier);
                    String appVersion = subscriptionObject.getAppVersion();
                    if (appVersion != null) {
                        str = appVersion;
                    }
                    subscriptionModel2.setAppVersion(str);
                    if (subscriptionModel2.getType() != SubscriptionType.PUSH) {
                        arrayList.add(subscriptionModel2);
                    }
                }
                String pushSubscriptionId = refreshUserOperationExecutor._configModelStore.getModel().getPushSubscriptionId();
                if (pushSubscriptionId != null && (subscriptionModel = (SubscriptionModel) refreshUserOperationExecutor._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(subscriptionModel);
                }
                refreshUserOperationExecutor._identityModelStore.replace(identityModel, ModelChangeTags.HYDRATE);
                refreshUserOperationExecutor._propertiesModelStore.replace(propertiesModel, ModelChangeTags.HYDRATE);
                refreshUserOperationExecutor._subscriptionsModelStore.replaceAll(arrayList, ModelChangeTags.HYDRATE);
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            } catch (BackendException e3) {
                e = e3;
                i = WhenMappings.$EnumSwitchMapping$1[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                }
            }
        }
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, n64 n64Var) throws Exception {
        Logging.log(LogLevel.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(((Operation) it.next()) instanceof RefreshUserOperation)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
        }
        Operation operation = (Operation) kh3.f0(list);
        if (operation instanceof RefreshUserOperation) {
            return getUser((RefreshUserOperation) operation, n64Var);
        }
        throw new Exception("Unrecognized operation: " + operation);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return bh3.m18963e(REFRESH_USER);
    }
}
