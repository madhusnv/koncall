package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.NetworkUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.ISubscriptionBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.LoginUserFromSubscriptionOperation;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import java.util.LinkedHashMap;
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
public final class LoginUserFromSubscriptionOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final IdentityModelStore _identityModelStore;
    private final PropertiesModelStore _propertiesModelStore;
    private final ISubscriptionBackendService _subscriptionBackend;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkUtils.ResponseStatusType.values().length];
            iArr[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            iArr[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.LoginUserFromSubscriptionOperationExecutor", m36648f = "LoginUserFromSubscriptionOperationExecutor.kt", m36649l = {46}, m36650m = "loginUser")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.LoginUserFromSubscriptionOperationExecutor$loginUser$1 */
    public static final class C118661 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118661(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoginUserFromSubscriptionOperationExecutor.this.loginUser(null, this);
        }
    }

    public LoginUserFromSubscriptionOperationExecutor(ISubscriptionBackendService iSubscriptionBackendService, IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore) {
        sq8.m48649h(iSubscriptionBackendService, "_subscriptionBackend");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(propertiesModelStore, "_propertiesModelStore");
        this._subscriptionBackend = iSubscriptionBackendService;
        this._identityModelStore = identityModelStore;
        this._propertiesModelStore = propertiesModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(LoginUserFromSubscriptionOperation loginUserFromSubscriptionOperation, n64 n64Var) {
        C118661 c118661;
        LoginUserFromSubscriptionOperationExecutor loginUserFromSubscriptionOperationExecutor;
        LoginUserFromSubscriptionOperation loginUserFromSubscriptionOperation2;
        if (n64Var instanceof C118661) {
            c118661 = (C118661) n64Var;
            int i = c118661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118661.label = i - Integer.MIN_VALUE;
            } else {
                c118661 = new C118661(n64Var);
            }
        }
        Object identityFromSubscription = c118661.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118661.label;
        try {
            if (i2 == 0) {
                wre.m54934b(identityFromSubscription);
                ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                String appId = loginUserFromSubscriptionOperation.getAppId();
                String subscriptionId = loginUserFromSubscriptionOperation.getSubscriptionId();
                c118661.L$0 = this;
                c118661.L$1 = loginUserFromSubscriptionOperation;
                c118661.label = 1;
                identityFromSubscription = iSubscriptionBackendService.getIdentityFromSubscription(appId, subscriptionId, c118661);
                if (identityFromSubscription == objM51918f) {
                    return objM51918f;
                }
                loginUserFromSubscriptionOperationExecutor = this;
                loginUserFromSubscriptionOperation2 = loginUserFromSubscriptionOperation;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                loginUserFromSubscriptionOperation2 = (LoginUserFromSubscriptionOperation) c118661.L$1;
                loginUserFromSubscriptionOperationExecutor = (LoginUserFromSubscriptionOperationExecutor) c118661.L$0;
                wre.m54934b(identityFromSubscription);
            }
            String str = (String) ((Map) identityFromSubscription).getOrDefault(IdentityConstants.ONESIGNAL_ID, null);
            if (str == null) {
                Logging.warn$default("Subscription " + loginUserFromSubscriptionOperation2.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(loginUserFromSubscriptionOperation2.getOnesignalId(), str);
            IdentityModel model = loginUserFromSubscriptionOperationExecutor._identityModelStore.getModel();
            PropertiesModel model2 = loginUserFromSubscriptionOperationExecutor._propertiesModelStore.getModel();
            if (sq8.m48644c(model.getOnesignalId(), loginUserFromSubscriptionOperation2.getOnesignalId())) {
                Model.setStringProperty$default(model, IdentityConstants.ONESIGNAL_ID, str, ModelChangeTags.HYDRATE, false, 8, null);
            }
            if (sq8.m48644c(model2.getOnesignalId(), loginUserFromSubscriptionOperation2.getOnesignalId())) {
                Model.setStringProperty$default(model2, "onesignalId", str, ModelChangeTags.HYDRATE, false, 8, null);
            }
            return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap, bh3.m18963e(new RefreshUserOperation(loginUserFromSubscriptionOperation2.getAppId(), str)), null, 8, null);
        } catch (BackendException e) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            return i3 != 1 ? i3 != 2 ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, null, 14, null);
        }
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, n64 n64Var) throws Exception {
        Logging.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        Operation operation = (Operation) kh3.f0(list);
        if (operation instanceof LoginUserFromSubscriptionOperation) {
            return loginUser((LoginUserFromSubscriptionOperation) operation, n64Var);
        }
        throw new Exception("Unrecognized operation: " + operation);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return bh3.m18963e(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
