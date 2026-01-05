package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.RootToolsInternalMethods;
import com.onesignal.common.TimeUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.CreateUserResponse;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.DeleteSubscriptionOperation;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.operations.SetAliasOperation;
import com.onesignal.user.internal.operations.TransferSubscriptionOperation;
import com.onesignal.user.internal.operations.UpdateSubscriptionOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import p001o.bh3;
import p001o.dh3;
import p001o.hsa;
import p001o.hwc;
import p001o.id5;
import p001o.isa;
import p001o.kh3;
import p001o.ksa;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.vyh;
import p001o.wre;

/* loaded from: classes6.dex */
public final class LoginUserOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String LOGIN_USER = "login-user";
    private final IApplicationService _application;
    private final ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;
    private final IdentityModelStore _identityModelStore;
    private final IdentityOperationExecutor _identityOperationExecutor;
    private final ILanguageContext _languageContext;
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
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ExecutionResult.values().length];
            iArr[ExecutionResult.SUCCESS.ordinal()] = 1;
            iArr[ExecutionResult.FAIL_CONFLICT.ordinal()] = 2;
            iArr[ExecutionResult.FAIL_NORETRY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NetworkUtils.ResponseStatusType.values().length];
            iArr2[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            iArr2[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SubscriptionType.values().length];
            iArr3[SubscriptionType.SMS.ordinal()] = 1;
            iArr3[SubscriptionType.EMAIL.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.LoginUserOperationExecutor", m36648f = "LoginUserOperationExecutor.kt", m36649l = {Opcodes.TABLESWITCH}, m36650m = "createUser")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.LoginUserOperationExecutor$createUser$1 */
    public static final class C118671 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C118671(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoginUserOperationExecutor.this.createUser(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.LoginUserOperationExecutor", m36648f = "LoginUserOperationExecutor.kt", m36649l = {80, 86, Opcodes.LAND, Opcodes.I2F}, m36650m = "loginUser")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.LoginUserOperationExecutor$loginUser$1 */
    public static final class C118681 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C118681(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoginUserOperationExecutor.this.loginUser(null, null, this);
        }
    }

    public LoginUserOperationExecutor(IdentityOperationExecutor identityOperationExecutor, IApplicationService iApplicationService, IDeviceService iDeviceService, IUserBackendService iUserBackendService, IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore, SubscriptionModelStore subscriptionModelStore, ConfigModelStore configModelStore, ILanguageContext iLanguageContext) {
        sq8.m48649h(identityOperationExecutor, "_identityOperationExecutor");
        sq8.m48649h(iApplicationService, "_application");
        sq8.m48649h(iDeviceService, "_deviceService");
        sq8.m48649h(iUserBackendService, "_userBackend");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(propertiesModelStore, "_propertiesModelStore");
        sq8.m48649h(subscriptionModelStore, "_subscriptionsModelStore");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iLanguageContext, "_languageContext");
        this._identityOperationExecutor = identityOperationExecutor;
        this._application = iApplicationService;
        this._deviceService = iDeviceService;
        this._userBackend = iUserBackendService;
        this._identityModelStore = identityModelStore;
        this._propertiesModelStore = propertiesModelStore;
        this._subscriptionsModelStore = subscriptionModelStore;
        this._configModelStore = configModelStore;
        this._languageContext = iLanguageContext;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(TransferSubscriptionOperation transferSubscriptionOperation, Map<String, SubscriptionObject> map) {
        Map<String, SubscriptionObject> mapM32696w = isa.m32696w(map);
        if (mapM32696w.containsKey(transferSubscriptionOperation.getSubscriptionId())) {
            String subscriptionId = transferSubscriptionOperation.getSubscriptionId();
            String subscriptionId2 = transferSubscriptionOperation.getSubscriptionId();
            SubscriptionObject subscriptionObject = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject);
            SubscriptionObjectType type2 = subscriptionObject.getType();
            SubscriptionObject subscriptionObject2 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject2);
            String token = subscriptionObject2.getToken();
            SubscriptionObject subscriptionObject3 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject3);
            Boolean enabled = subscriptionObject3.getEnabled();
            SubscriptionObject subscriptionObject4 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject4);
            Integer notificationTypes = subscriptionObject4.getNotificationTypes();
            SubscriptionObject subscriptionObject5 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject5);
            String sdk = subscriptionObject5.getSdk();
            SubscriptionObject subscriptionObject6 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject6);
            String deviceModel = subscriptionObject6.getDeviceModel();
            SubscriptionObject subscriptionObject7 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject7);
            String deviceOS = subscriptionObject7.getDeviceOS();
            SubscriptionObject subscriptionObject8 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject8);
            Boolean rooted = subscriptionObject8.getRooted();
            SubscriptionObject subscriptionObject9 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject9);
            Integer netType = subscriptionObject9.getNetType();
            SubscriptionObject subscriptionObject10 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject10);
            String carrier = subscriptionObject10.getCarrier();
            SubscriptionObject subscriptionObject11 = map.get(transferSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject11);
            mapM32696w.put(subscriptionId, new SubscriptionObject(subscriptionId2, type2, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, subscriptionObject11.getAppVersion()));
        } else {
            mapM32696w.put(transferSubscriptionOperation.getSubscriptionId(), new SubscriptionObject(transferSubscriptionOperation.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
        }
        return mapM32696w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createUser(LoginUserOperation loginUserOperation, List<? extends Operation> list, n64 n64Var) throws Exception {
        C118671 c118671;
        ExecutionResponse executionResponse;
        LoginUserOperationExecutor loginUserOperationExecutor;
        List list2;
        LoginUserOperation loginUserOperation2;
        Map<String, String> map;
        if (n64Var instanceof C118671) {
            c118671 = (C118671) n64Var;
            int i = c118671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118671.label = i - Integer.MIN_VALUE;
            } else {
                c118671 = new C118671(n64Var);
            }
        }
        C118671 c1186712 = c118671;
        Object obj = c1186712.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1186712.label;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                Map<String, String> mapM32681h = isa.m32681h();
                Map<String, SubscriptionObject> mapM32681h2 = isa.m32681h();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String timeZoneId = TimeUtils.INSTANCE.getTimeZoneId();
                sq8.m48646e(timeZoneId);
                linkedHashMap.put("timezone_id", timeZoneId);
                linkedHashMap.put("language", this._languageContext.getLanguage());
                if (loginUserOperation.getExternalId() != null) {
                    mapM32681h = isa.m32696w(mapM32681h);
                    String externalId = loginUserOperation.getExternalId();
                    sq8.m48646e(externalId);
                    mapM32681h.put(IdentityConstants.EXTERNAL_ID, externalId);
                }
                for (Operation operation : list) {
                    if (operation instanceof CreateSubscriptionOperation) {
                        mapM32681h2 = createSubscriptionsFromOperation((CreateSubscriptionOperation) operation, mapM32681h2);
                    } else if (operation instanceof TransferSubscriptionOperation) {
                        mapM32681h2 = createSubscriptionsFromOperation((TransferSubscriptionOperation) operation, mapM32681h2);
                    } else if (operation instanceof UpdateSubscriptionOperation) {
                        mapM32681h2 = createSubscriptionsFromOperation((UpdateSubscriptionOperation) operation, mapM32681h2);
                    } else {
                        if (!(operation instanceof DeleteSubscriptionOperation)) {
                            throw new Exception("Unrecognized operation: " + operation);
                        }
                        mapM32681h2 = createSubscriptionsFromOperation((DeleteSubscriptionOperation) operation, mapM32681h2);
                    }
                }
                List listM36188y = ksa.m36188y(mapM32681h2);
                IUserBackendService iUserBackendService = this._userBackend;
                String appId = loginUserOperation.getAppId();
                ArrayList arrayList = new ArrayList(dh3.m23088v(listM36188y, 10));
                Iterator it = listM36188y.iterator();
                while (it.hasNext()) {
                    arrayList.add((SubscriptionObject) ((hwc) it.next()).m31230d());
                }
                c1186712.L$0 = this;
                c1186712.L$1 = loginUserOperation;
                c1186712.L$2 = mapM32681h;
                c1186712.L$3 = listM36188y;
                c1186712.label = 1;
                Object objCreateUser = iUserBackendService.createUser(appId, mapM32681h, arrayList, linkedHashMap, c1186712);
                if (objCreateUser == objM51918f) {
                    return objM51918f;
                }
                loginUserOperationExecutor = this;
                list2 = listM36188y;
                loginUserOperation2 = loginUserOperation;
                map = mapM32681h;
                obj = objCreateUser;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) c1186712.L$3;
                map = (Map) c1186712.L$2;
                loginUserOperation2 = (LoginUserOperation) c1186712.L$1;
                loginUserOperationExecutor = (LoginUserOperationExecutor) c1186712.L$0;
                wre.m54934b(obj);
            }
            CreateUserResponse createUserResponse = (CreateUserResponse) obj;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str = createUserResponse.getIdentities().get(IdentityConstants.ONESIGNAL_ID);
            sq8.m48646e(str);
            String str2 = str;
            linkedHashMap2.put(loginUserOperation2.getOnesignalId(), str2);
            IdentityModel model = loginUserOperationExecutor._identityModelStore.getModel();
            PropertiesModel model2 = loginUserOperationExecutor._propertiesModelStore.getModel();
            if (sq8.m48644c(model.getOnesignalId(), loginUserOperation2.getOnesignalId())) {
                Model.setStringProperty$default(model, IdentityConstants.ONESIGNAL_ID, str2, ModelChangeTags.HYDRATE, false, 8, null);
            }
            if (sq8.m48644c(model2.getOnesignalId(), loginUserOperation2.getOnesignalId())) {
                Model.setStringProperty$default(model2, "onesignalId", str2, ModelChangeTags.HYDRATE, false, 8, null);
            }
            int size = list2.size();
            for (int i3 = 0; i3 < size && i3 < createUserResponse.getSubscriptions().size(); i3++) {
                SubscriptionObject subscriptionObject = createUserResponse.getSubscriptions().get(i3);
                Object objM31229c = ((hwc) list2.get(i3)).m31229c();
                String id = subscriptionObject.getId();
                sq8.m48646e(id);
                linkedHashMap2.put(objM31229c, id);
                if (sq8.m48644c(loginUserOperationExecutor._configModelStore.getModel().getPushSubscriptionId(), ((hwc) list2.get(i3)).m31229c())) {
                    loginUserOperationExecutor._configModelStore.getModel().setPushSubscriptionId(subscriptionObject.getId());
                }
                SubscriptionModel subscriptionModel = (SubscriptionModel) loginUserOperationExecutor._subscriptionsModelStore.get((String) ((hwc) list2.get(i3)).m31229c());
                if (subscriptionModel != null) {
                    Model.setStringProperty$default(subscriptionModel, OutcomeConstants.OUTCOME_ID, subscriptionObject.getId(), ModelChangeTags.HYDRATE, false, 8, null);
                }
            }
            return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap2, map.isEmpty() ^ true ? bh3.m18963e(new RefreshUserOperation(loginUserOperation2.getAppId(), str2)) : null, null, 8, null);
        } catch (BackendException e) {
            int i4 = WhenMappings.$EnumSwitchMapping$1[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i4 == 1) {
                executionResponse = new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
            } else {
                if (i4 != 2) {
                    return new ExecutionResponse(ExecutionResult.FAIL_PAUSE_OPREPO, null, null, null, 14, null);
                }
                executionResponse = new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            return executionResponse;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(LoginUserOperation loginUserOperation, List<? extends Operation> list, n64 n64Var) throws Exception {
        C118681 c118681;
        LoginUserOperationExecutor loginUserOperationExecutor;
        int i;
        LoginUserOperation loginUserOperation2 = loginUserOperation;
        List<? extends Operation> list2 = list;
        if (n64Var instanceof C118681) {
            c118681 = (C118681) n64Var;
            int i2 = c118681.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c118681.label = i2 - Integer.MIN_VALUE;
            } else {
                c118681 = new C118681(n64Var);
            }
        }
        Object objCreateUser = c118681.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c118681.label;
        if (i3 != 0) {
            if (i3 == 1) {
                wre.m54934b(objCreateUser);
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    wre.m54934b(objCreateUser);
                }
                if (i3 == 4) {
                    wre.m54934b(objCreateUser);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<? extends Operation> list3 = (List) c118681.L$2;
            LoginUserOperation loginUserOperation3 = (LoginUserOperation) c118681.L$1;
            loginUserOperationExecutor = (LoginUserOperationExecutor) c118681.L$0;
            wre.m54934b(objCreateUser);
            list2 = list3;
            loginUserOperation2 = loginUserOperation3;
            ExecutionResponse executionResponse = (ExecutionResponse) objCreateUser;
            i = WhenMappings.$EnumSwitchMapping$0[executionResponse.getResult().ordinal()];
            if (i != 1) {
                String existingOnesignalId = loginUserOperation2.getExistingOnesignalId();
                sq8.m48646e(existingOnesignalId);
                if (sq8.m48644c(loginUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), loginUserOperation2.getOnesignalId())) {
                    Model.setStringProperty$default(loginUserOperationExecutor._identityModelStore.getModel(), IdentityConstants.ONESIGNAL_ID, existingOnesignalId, ModelChangeTags.HYDRATE, false, 8, null);
                }
                if (sq8.m48644c(loginUserOperationExecutor._propertiesModelStore.getModel().getOnesignalId(), loginUserOperation2.getOnesignalId())) {
                    Model.setStringProperty$default(loginUserOperationExecutor._propertiesModelStore.getModel(), "onesignalId", existingOnesignalId, ModelChangeTags.HYDRATE, false, 8, null);
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS_STARTING_ONLY, hsa.m31056f(vyh.m53620a(loginUserOperation2.getOnesignalId(), existingOnesignalId)), null, null, 12, null);
            }
            if (i == 2) {
                Logging.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + loginUserOperation2.getExternalId() + TokenParser.DQUOTE, null, 2, null);
                c118681.L$0 = null;
                c118681.L$1 = null;
                c118681.L$2 = null;
                c118681.label = 3;
                objCreateUser = loginUserOperationExecutor.createUser(loginUserOperation2, list2, c118681);
                return objCreateUser == objM51918f ? objM51918f : objCreateUser;
            }
            if (i != 3) {
                return new ExecutionResponse(executionResponse.getResult(), null, null, null, 14, null);
            }
            Logging.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + loginUserOperation2.getExternalId() + TokenParser.DQUOTE, null, 2, null);
            c118681.L$0 = null;
            c118681.L$1 = null;
            c118681.L$2 = null;
            c118681.label = 4;
            objCreateUser = loginUserOperationExecutor.createUser(loginUserOperation2, list2, c118681);
            return objCreateUser == objM51918f ? objM51918f : objCreateUser;
        }
        wre.m54934b(objCreateUser);
        boolean z = false;
        if (!(list2 instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Operation operation = (Operation) it.next();
                if ((operation instanceof CreateSubscriptionOperation) || (operation instanceof TransferSubscriptionOperation)) {
                    z = true;
                    break;
                }
            }
        }
        if (!z && loginUserOperation.getExternalId() == null) {
            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
        }
        if (loginUserOperation.getExistingOnesignalId() == null || loginUserOperation.getExternalId() == null) {
            c118681.label = 1;
            objCreateUser = createUser(loginUserOperation2, list2, c118681);
            return objCreateUser == objM51918f ? objM51918f : objCreateUser;
        }
        IdentityOperationExecutor identityOperationExecutor = this._identityOperationExecutor;
        String appId = loginUserOperation.getAppId();
        String existingOnesignalId2 = loginUserOperation.getExistingOnesignalId();
        sq8.m48646e(existingOnesignalId2);
        String externalId = loginUserOperation.getExternalId();
        sq8.m48646e(externalId);
        List<? extends Operation> listM18963e = bh3.m18963e(new SetAliasOperation(appId, existingOnesignalId2, IdentityConstants.EXTERNAL_ID, externalId));
        c118681.L$0 = this;
        c118681.L$1 = loginUserOperation2;
        c118681.L$2 = list2;
        c118681.label = 2;
        objCreateUser = identityOperationExecutor.execute(listM18963e, c118681);
        if (objCreateUser == objM51918f) {
            return objM51918f;
        }
        loginUserOperationExecutor = this;
        ExecutionResponse executionResponse2 = (ExecutionResponse) objCreateUser;
        i = WhenMappings.$EnumSwitchMapping$0[executionResponse2.getResult().ordinal()];
        if (i != 1) {
        }
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, n64 n64Var) throws Exception {
        Logging.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        Operation operation = (Operation) kh3.f0(list);
        if (operation instanceof LoginUserOperation) {
            return loginUser((LoginUserOperation) operation, kh3.m35709Y(list, 1), n64Var);
        }
        throw new Exception("Unrecognized operation: " + operation);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return bh3.m18963e(LOGIN_USER);
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(CreateSubscriptionOperation createSubscriptionOperation, Map<String, SubscriptionObject> map) {
        SubscriptionObjectType subscriptionObjectTypeFromDeviceType;
        Map<String, SubscriptionObject> mapM32696w = isa.m32696w(map);
        int i = WhenMappings.$EnumSwitchMapping$2[createSubscriptionOperation.getType().ordinal()];
        if (i == 1) {
            subscriptionObjectTypeFromDeviceType = SubscriptionObjectType.SMS;
        } else if (i != 2) {
            subscriptionObjectTypeFromDeviceType = SubscriptionObjectType.Companion.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            subscriptionObjectTypeFromDeviceType = SubscriptionObjectType.EMAIL;
        }
        SubscriptionObjectType subscriptionObjectType = subscriptionObjectTypeFromDeviceType;
        String subscriptionId = createSubscriptionOperation.getSubscriptionId();
        String address = createSubscriptionOperation.getAddress();
        Boolean boolValueOf = Boolean.valueOf(createSubscriptionOperation.getEnabled());
        Integer numValueOf = Integer.valueOf(createSubscriptionOperation.getStatus().getValue());
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean boolValueOf2 = Boolean.valueOf(RootToolsInternalMethods.INSTANCE.isRooted());
        DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
        mapM32696w.put(subscriptionId, new SubscriptionObject(null, subscriptionObjectType, address, boolValueOf, numValueOf, OneSignalUtils.SDK_VERSION, str, str2, boolValueOf2, deviceUtils.getNetType(this._application.getAppContext()), deviceUtils.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return mapM32696w;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(UpdateSubscriptionOperation updateSubscriptionOperation, Map<String, SubscriptionObject> map) {
        Map<String, SubscriptionObject> mapM32696w = isa.m32696w(map);
        if (mapM32696w.containsKey(updateSubscriptionOperation.getSubscriptionId())) {
            String subscriptionId = updateSubscriptionOperation.getSubscriptionId();
            SubscriptionObject subscriptionObject = map.get(updateSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject);
            String id = subscriptionObject.getId();
            SubscriptionObject subscriptionObject2 = map.get(updateSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject2);
            SubscriptionObjectType type2 = subscriptionObject2.getType();
            String address = updateSubscriptionOperation.getAddress();
            Boolean boolValueOf = Boolean.valueOf(updateSubscriptionOperation.getEnabled());
            Integer numValueOf = Integer.valueOf(updateSubscriptionOperation.getStatus().getValue());
            SubscriptionObject subscriptionObject3 = map.get(updateSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject3);
            String sdk = subscriptionObject3.getSdk();
            SubscriptionObject subscriptionObject4 = map.get(updateSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject4);
            String deviceModel = subscriptionObject4.getDeviceModel();
            SubscriptionObject subscriptionObject5 = map.get(updateSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject5);
            String deviceOS = subscriptionObject5.getDeviceOS();
            SubscriptionObject subscriptionObject6 = map.get(updateSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject6);
            Boolean rooted = subscriptionObject6.getRooted();
            SubscriptionObject subscriptionObject7 = map.get(updateSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject7);
            Integer netType = subscriptionObject7.getNetType();
            SubscriptionObject subscriptionObject8 = map.get(updateSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject8);
            String carrier = subscriptionObject8.getCarrier();
            SubscriptionObject subscriptionObject9 = map.get(updateSubscriptionOperation.getSubscriptionId());
            sq8.m48646e(subscriptionObject9);
            mapM32696w.put(subscriptionId, new SubscriptionObject(id, type2, address, boolValueOf, numValueOf, sdk, deviceModel, deviceOS, rooted, netType, carrier, subscriptionObject9.getAppVersion()));
        }
        return mapM32696w;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(DeleteSubscriptionOperation deleteSubscriptionOperation, Map<String, SubscriptionObject> map) {
        Map<String, SubscriptionObject> mapM32696w = isa.m32696w(map);
        mapM32696w.remove(deleteSubscriptionOperation.getSubscriptionId());
        return mapM32696w;
    }
}
