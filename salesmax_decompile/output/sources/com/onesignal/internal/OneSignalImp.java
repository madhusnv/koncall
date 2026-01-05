package com.onesignal.internal;

import android.content.Context;
import android.os.Build;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.IOneSignal;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.modeling.ISingletonModelStore;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.IServiceProvider;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.common.services.ServiceProvider;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.CoreModule;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.application.impl.ApplicationService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.preferences.PreferenceStoreFix;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.core.internal.startup.StartupService;
import com.onesignal.debug.IDebugManager;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.DebugManager;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.session.ISessionManager;
import com.onesignal.session.SessionModule;
import com.onesignal.session.internal.session.SessionModel;
import com.onesignal.session.internal.session.SessionModelStore;
import com.onesignal.user.IUserManager;
import com.onesignal.user.UserModule;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.LoginUserFromSubscriptionOperation;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.operations.TransferSubscriptionOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p001o.ch3;
import p001o.gge;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class OneSignalImp implements IOneSignal, IServiceProvider {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private ConfigModel configModel;
    private boolean isInitialized;
    private final List<String> listOfModules;
    private IOperationRepo operationRepo;
    private final ServiceProvider services;
    private SessionModel sessionModel;
    private final String sdkVersion = OneSignalUtils.SDK_VERSION;
    private final IDebugManager debug = new DebugManager();
    private final Object initLock = new Object();
    private final Object loginLock = new Object();

    @l75(m36647c = "com.onesignal.internal.OneSignalImp$login$2", m36648f = "OneSignalImp.kt", m36649l = {388}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.internal.OneSignalImp$login$2 */
    public static final class C117032 extends jgg implements xk7 {
        final /* synthetic */ gge $currentIdentityExternalId;
        final /* synthetic */ gge $currentIdentityOneSignalId;
        final /* synthetic */ String $externalId;
        final /* synthetic */ gge $newIdentityOneSignalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117032(gge ggeVar, String str, gge ggeVar2, gge ggeVar3, n64 n64Var) {
            super(1, n64Var);
            this.$newIdentityOneSignalId = ggeVar;
            this.$externalId = str;
            this.$currentIdentityExternalId = ggeVar2;
            this.$currentIdentityOneSignalId = ggeVar3;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return OneSignalImp.this.new C117032(this.$newIdentityOneSignalId, this.$externalId, this.$currentIdentityExternalId, this.$currentIdentityOneSignalId, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IOperationRepo iOperationRepo = OneSignalImp.this.operationRepo;
                sq8.m48646e(iOperationRepo);
                ConfigModel configModel = OneSignalImp.this.configModel;
                sq8.m48646e(configModel);
                LoginUserOperation loginUserOperation = new LoginUserOperation(configModel.getAppId(), (String) this.$newIdentityOneSignalId.f25106a, this.$externalId, this.$currentIdentityExternalId.f25106a == null ? (String) this.$currentIdentityOneSignalId.f25106a : null);
                this.label = 1;
                obj = IOperationRepo.DefaultImpls.enqueueAndWait$default(iOperationRepo, loginUserOperation, false, this, 2, null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                Logging.log(LogLevel.ERROR, "Could not login user");
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117032) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public OneSignalImp() throws IllegalAccessException, InstantiationException {
        List<String> listM21249n = ch3.m21249n("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = listM21249n;
        ServiceBuilder serviceBuilder = new ServiceBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = listM21249n.iterator();
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).newInstance();
                sq8.m48647f(objNewInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((IModule) objNewInstance);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((IModule) it2.next()).register(serviceBuilder);
        }
        this.services = serviceBuilder.build();
    }

    private final void createAndSwitchToNewUser(boolean z, nl7 nl7Var) {
        Object next;
        String strCreateLocalId;
        String address;
        SubscriptionStatus status;
        Logging.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String strCreateLocalId2 = IDManager.INSTANCE.createLocalId();
        IdentityModel identityModel = new IdentityModel();
        identityModel.setOnesignalId(strCreateLocalId2);
        PropertiesModel propertiesModel = new PropertiesModel();
        propertiesModel.setOnesignalId(strCreateLocalId2);
        if (nl7Var != null) {
            nl7Var.invoke(identityModel, propertiesModel);
        }
        ArrayList arrayList = new ArrayList();
        SubscriptionModelStore subscriptionModelStore = getSubscriptionModelStore();
        sq8.m48646e(subscriptionModelStore);
        Iterator it = subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String id = ((SubscriptionModel) next).getId();
            ConfigModel configModel = this.configModel;
            sq8.m48646e(configModel);
            if (sq8.m48644c(id, configModel.getPushSubscriptionId())) {
                break;
            }
        }
        SubscriptionModel subscriptionModel = (SubscriptionModel) next;
        SubscriptionModel subscriptionModel2 = new SubscriptionModel();
        if (subscriptionModel == null || (strCreateLocalId = subscriptionModel.getId()) == null) {
            strCreateLocalId = IDManager.INSTANCE.createLocalId();
        }
        subscriptionModel2.setId(strCreateLocalId);
        subscriptionModel2.setType(SubscriptionType.PUSH);
        subscriptionModel2.setOptedIn(subscriptionModel != null ? subscriptionModel.getOptedIn() : true);
        if (subscriptionModel == null || (address = subscriptionModel.getAddress()) == null) {
            address = "";
        }
        subscriptionModel2.setAddress(address);
        if (subscriptionModel == null || (status = subscriptionModel.getStatus()) == null) {
            status = SubscriptionStatus.NO_PERMISSION;
        }
        subscriptionModel2.setStatus(status);
        subscriptionModel2.setSdk(OneSignalUtils.SDK_VERSION);
        String str = Build.VERSION.RELEASE;
        sq8.m48648g(str, "RELEASE");
        subscriptionModel2.setDeviceOS(str);
        String carrierName = DeviceUtils.INSTANCE.getCarrierName(((IApplicationService) this.services.getService(IApplicationService.class)).getAppContext());
        if (carrierName == null) {
            carrierName = "";
        }
        subscriptionModel2.setCarrier(carrierName);
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(((IApplicationService) this.services.getService(IApplicationService.class)).getAppContext());
        subscriptionModel2.setAppVersion(appVersion != null ? appVersion : "");
        ConfigModel configModel2 = this.configModel;
        sq8.m48646e(configModel2);
        configModel2.setPushSubscriptionId(subscriptionModel2.getId());
        arrayList.add(subscriptionModel2);
        SubscriptionModelStore subscriptionModelStore2 = getSubscriptionModelStore();
        sq8.m48646e(subscriptionModelStore2);
        subscriptionModelStore2.clear(ModelChangeTags.NO_PROPOGATE);
        IdentityModelStore identityModelStore = getIdentityModelStore();
        sq8.m48646e(identityModelStore);
        ISingletonModelStore.DefaultImpls.replace$default(identityModelStore, identityModel, null, 2, null);
        PropertiesModelStore propertiesModelStore = getPropertiesModelStore();
        sq8.m48646e(propertiesModelStore);
        ISingletonModelStore.DefaultImpls.replace$default(propertiesModelStore, propertiesModel, null, 2, null);
        if (z) {
            SubscriptionModelStore subscriptionModelStore3 = getSubscriptionModelStore();
            sq8.m48646e(subscriptionModelStore3);
            subscriptionModelStore3.replaceAll(arrayList, ModelChangeTags.NO_PROPOGATE);
        } else {
            if (subscriptionModel == null) {
                SubscriptionModelStore subscriptionModelStore4 = getSubscriptionModelStore();
                sq8.m48646e(subscriptionModelStore4);
                IModelStore.DefaultImpls.replaceAll$default(subscriptionModelStore4, arrayList, null, 2, null);
                return;
            }
            IOperationRepo iOperationRepo = this.operationRepo;
            sq8.m48646e(iOperationRepo);
            ConfigModel configModel3 = this.configModel;
            sq8.m48646e(configModel3);
            IOperationRepo.DefaultImpls.enqueue$default(iOperationRepo, new TransferSubscriptionOperation(configModel3.getAppId(), subscriptionModel.getId(), strCreateLocalId2), false, 2, null);
            SubscriptionModelStore subscriptionModelStore5 = getSubscriptionModelStore();
            sq8.m48646e(subscriptionModelStore5);
            subscriptionModelStore5.replaceAll(arrayList, ModelChangeTags.NO_PROPOGATE);
        }
    }

    public static /* synthetic */ void createAndSwitchToNewUser$default(OneSignalImp oneSignalImp, boolean z, nl7 nl7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            nl7Var = null;
        }
        oneSignalImp.createAndSwitchToNewUser(z, nl7Var);
    }

    private final IdentityModelStore getIdentityModelStore() {
        return (IdentityModelStore) this.services.getService(IdentityModelStore.class);
    }

    private final String getLegacyAppId() {
        return IPreferencesService.DefaultImpls.getString$default(getPreferencesService(), PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_LEGACY_APP_ID, null, 4, null);
    }

    private final IPreferencesService getPreferencesService() {
        return (IPreferencesService) this.services.getService(IPreferencesService.class);
    }

    private final PropertiesModelStore getPropertiesModelStore() {
        return (PropertiesModelStore) this.services.getService(PropertiesModelStore.class);
    }

    private final SubscriptionModelStore getSubscriptionModelStore() {
        return (SubscriptionModelStore) this.services.getService(SubscriptionModelStore.class);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> List<T> getAllServices(Class<T> cls) {
        sq8.m48649h(cls, "c");
        return this.services.getAllServices(cls);
    }

    @Override // com.onesignal.IOneSignal
    public boolean getConsentGiven() {
        Boolean consentGiven;
        ConfigModel configModel = this.configModel;
        return (configModel == null || (consentGiven = configModel.getConsentGiven()) == null) ? sq8.m48644c(this._consentGiven, Boolean.TRUE) : consentGiven.booleanValue();
    }

    @Override // com.onesignal.IOneSignal
    public boolean getConsentRequired() {
        Boolean consentRequired;
        ConfigModel configModel = this.configModel;
        return (configModel == null || (consentRequired = configModel.getConsentRequired()) == null) ? sq8.m48644c(this._consentRequired, Boolean.TRUE) : consentRequired.booleanValue();
    }

    @Override // com.onesignal.IOneSignal
    public IDebugManager getDebug() {
        return this.debug;
    }

    @Override // com.onesignal.IOneSignal
    public boolean getDisableGMSMissingPrompt() {
        ConfigModel configModel = this.configModel;
        return configModel != null ? configModel.getDisableGMSMissingPrompt() : sq8.m48644c(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    @Override // com.onesignal.IOneSignal
    public IInAppMessagesManager getInAppMessages() throws Exception {
        if (isInitialized()) {
            return (IInAppMessagesManager) this.services.getService(IInAppMessagesManager.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // com.onesignal.IOneSignal
    public ILocationManager getLocation() throws Exception {
        if (isInitialized()) {
            return (ILocationManager) this.services.getService(ILocationManager.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // com.onesignal.IOneSignal
    public INotificationsManager getNotifications() throws Exception {
        if (isInitialized()) {
            return (INotificationsManager) this.services.getService(INotificationsManager.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // com.onesignal.IOneSignal
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getService(Class<T> cls) {
        sq8.m48649h(cls, "c");
        return (T) this.services.getService(cls);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getServiceOrNull(Class<T> cls) {
        sq8.m48649h(cls, "c");
        return (T) this.services.getServiceOrNull(cls);
    }

    @Override // com.onesignal.IOneSignal
    public ISessionManager getSession() throws Exception {
        if (isInitialized()) {
            return (ISessionManager) this.services.getService(ISessionManager.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // com.onesignal.IOneSignal
    public IUserManager getUser() throws Exception {
        if (isInitialized()) {
            return (IUserManager) this.services.getService(IUserManager.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> boolean hasService(Class<T> cls) {
        sq8.m48649h(cls, "c");
        return this.services.hasService(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186 A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:4:0x002b, B:6:0x0032, B:9:0x0039, B:11:0x0092, B:13:0x009f, B:15:0x00a5, B:18:0x00ac, B:21:0x00cd, B:23:0x00da, B:26:0x00ea, B:27:0x00f2, B:29:0x00f6, B:30:0x0103, B:32:0x0107, B:33:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0135, B:41:0x014b, B:79:0x02ec, B:42:0x0172, B:44:0x0186, B:45:0x01ce, B:47:0x01f6, B:52:0x021d, B:59:0x022f, B:62:0x023c, B:64:0x0241, B:68:0x024f, B:70:0x0258, B:73:0x027f, B:76:0x029a, B:78:0x02b4, B:69:0x0253, B:55:0x0226, B:50:0x0217), top: B:85:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ce A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:4:0x002b, B:6:0x0032, B:9:0x0039, B:11:0x0092, B:13:0x009f, B:15:0x00a5, B:18:0x00ac, B:21:0x00cd, B:23:0x00da, B:26:0x00ea, B:27:0x00f2, B:29:0x00f6, B:30:0x0103, B:32:0x0107, B:33:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0135, B:41:0x014b, B:79:0x02ec, B:42:0x0172, B:44:0x0186, B:45:0x01ce, B:47:0x01f6, B:52:0x021d, B:59:0x022f, B:62:0x023c, B:64:0x0241, B:68:0x024f, B:70:0x0258, B:73:0x027f, B:76:0x029a, B:78:0x02b4, B:69:0x0253, B:55:0x0226, B:50:0x0217), top: B:85:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0241 A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:4:0x002b, B:6:0x0032, B:9:0x0039, B:11:0x0092, B:13:0x009f, B:15:0x00a5, B:18:0x00ac, B:21:0x00cd, B:23:0x00da, B:26:0x00ea, B:27:0x00f2, B:29:0x00f6, B:30:0x0103, B:32:0x0107, B:33:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0135, B:41:0x014b, B:79:0x02ec, B:42:0x0172, B:44:0x0186, B:45:0x01ce, B:47:0x01f6, B:52:0x021d, B:59:0x022f, B:62:0x023c, B:64:0x0241, B:68:0x024f, B:70:0x0258, B:73:0x027f, B:76:0x029a, B:78:0x02b4, B:69:0x0253, B:55:0x0226, B:50:0x0217), top: B:85:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0253 A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:4:0x002b, B:6:0x0032, B:9:0x0039, B:11:0x0092, B:13:0x009f, B:15:0x00a5, B:18:0x00ac, B:21:0x00cd, B:23:0x00da, B:26:0x00ea, B:27:0x00f2, B:29:0x00f6, B:30:0x0103, B:32:0x0107, B:33:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0135, B:41:0x014b, B:79:0x02ec, B:42:0x0172, B:44:0x0186, B:45:0x01ce, B:47:0x01f6, B:52:0x021d, B:59:0x022f, B:62:0x023c, B:64:0x0241, B:68:0x024f, B:70:0x0258, B:73:0x027f, B:76:0x029a, B:78:0x02b4, B:69:0x0253, B:55:0x0226, B:50:0x0217), top: B:85:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0298  */
    @Override // com.onesignal.IOneSignal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean initWithContext(Context context, String str) {
        boolean z;
        String string$default;
        boolean z2;
        boolean z3;
        String strSafeString;
        String carrierName;
        String appVersion;
        sq8.m48649h(context, "context");
        LogLevel logLevel = LogLevel.DEBUG;
        Logging.log(logLevel, "initWithContext(context: " + context + ", appId: " + str + ')');
        synchronized (this.initLock) {
            if (isInitialized()) {
                Logging.log(logLevel, "initWithContext: SDK already initialized");
                return true;
            }
            Logging.log(logLevel, "initWithContext: SDK initializing");
            PreferenceStoreFix.INSTANCE.ensureNoObfuscatedPrefStore(context);
            IApplicationService iApplicationService = (IApplicationService) this.services.getService(IApplicationService.class);
            sq8.m48647f(iApplicationService, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((ApplicationService) iApplicationService).start(context);
            Logging.INSTANCE.setApplicationService(iApplicationService);
            this.configModel = ((ConfigModelStore) this.services.getService(ConfigModelStore.class)).getModel();
            this.sessionModel = ((SessionModelStore) this.services.getService(SessionModelStore.class)).getModel();
            this.operationRepo = (IOperationRepo) this.services.getService(IOperationRepo.class);
            if (str == null) {
                ConfigModel configModel = this.configModel;
                sq8.m48646e(configModel);
                if (configModel.hasProperty(RemoteConfigConstants.RequestFieldKey.APP_ID)) {
                    z = false;
                } else {
                    String legacyAppId = getLegacyAppId();
                    if (legacyAppId == null) {
                        Logging.warn$default("initWithContext called without providing appId, and no appId has been established!", null, 2, null);
                        return false;
                    }
                    Logging.debug$default("initWithContext: using cached legacy appId " + legacyAppId, null, 2, null);
                    ConfigModel configModel2 = this.configModel;
                    sq8.m48646e(configModel2);
                    configModel2.setAppId(legacyAppId);
                    z = true;
                }
            }
            if (str != null) {
                ConfigModel configModel3 = this.configModel;
                sq8.m48646e(configModel3);
                if (configModel3.hasProperty(RemoteConfigConstants.RequestFieldKey.APP_ID)) {
                    ConfigModel configModel4 = this.configModel;
                    sq8.m48646e(configModel4);
                    if (!sq8.m48644c(configModel4.getAppId(), str)) {
                        z = true;
                    }
                    ConfigModel configModel5 = this.configModel;
                    sq8.m48646e(configModel5);
                    configModel5.setAppId(str);
                }
            }
            if (this._consentRequired != null) {
                ConfigModel configModel6 = this.configModel;
                sq8.m48646e(configModel6);
                Boolean bool = this._consentRequired;
                sq8.m48646e(bool);
                configModel6.setConsentRequired(bool);
            }
            if (this._consentGiven != null) {
                ConfigModel configModel7 = this.configModel;
                sq8.m48646e(configModel7);
                Boolean bool2 = this._consentGiven;
                sq8.m48646e(bool2);
                configModel7.setConsentGiven(bool2);
            }
            if (this._disableGMSMissingPrompt != null) {
                ConfigModel configModel8 = this.configModel;
                sq8.m48646e(configModel8);
                Boolean bool3 = this._disableGMSMissingPrompt;
                sq8.m48646e(bool3);
                configModel8.setDisableGMSMissingPrompt(bool3.booleanValue());
            }
            StartupService startupService = new StartupService(this.services);
            startupService.bootstrap();
            if (z) {
                IPreferencesService preferencesService = getPreferencesService();
                sq8.m48646e(preferencesService);
                string$default = IPreferencesService.DefaultImpls.getString$default(preferencesService, PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID, null, 4, null);
                if (string$default != null) {
                }
            } else {
                IdentityModelStore identityModelStore = getIdentityModelStore();
                sq8.m48646e(identityModelStore);
                if (identityModelStore.getModel().hasProperty(IdentityConstants.ONESIGNAL_ID)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("initWithContext: using cached user ");
                    IdentityModelStore identityModelStore2 = getIdentityModelStore();
                    sq8.m48646e(identityModelStore2);
                    sb.append(identityModelStore2.getModel().getOnesignalId());
                    Logging.debug$default(sb.toString(), null, 2, null);
                } else {
                    IPreferencesService preferencesService2 = getPreferencesService();
                    sq8.m48646e(preferencesService2);
                    string$default = IPreferencesService.DefaultImpls.getString$default(preferencesService2, PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID, null, 4, null);
                    if (string$default != null) {
                        Logging.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                        createAndSwitchToNewUser$default(this, false, null, 3, null);
                        IOperationRepo iOperationRepo = this.operationRepo;
                        sq8.m48646e(iOperationRepo);
                        ConfigModel configModel9 = this.configModel;
                        sq8.m48646e(configModel9);
                        String appId = configModel9.getAppId();
                        IdentityModelStore identityModelStore3 = getIdentityModelStore();
                        sq8.m48646e(identityModelStore3);
                        String onesignalId = identityModelStore3.getModel().getOnesignalId();
                        IdentityModelStore identityModelStore4 = getIdentityModelStore();
                        sq8.m48646e(identityModelStore4);
                        IOperationRepo.DefaultImpls.enqueue$default(iOperationRepo, new LoginUserOperation(appId, onesignalId, identityModelStore4.getModel().getExternalId(), null, 8, null), false, 2, null);
                    } else {
                        Logging.debug$default("initWithContext: creating user linked to subscription " + string$default, null, 2, null);
                        IPreferencesService preferencesService3 = getPreferencesService();
                        sq8.m48646e(preferencesService3);
                        String string$default2 = IPreferencesService.DefaultImpls.getString$default(preferencesService3, PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_LEGACY_USER_SYNCVALUES, null, 4, null);
                        if (string$default2 != null) {
                            JSONObject jSONObject = new JSONObject(string$default2);
                            Integer numSafeInt = JSONObjectExtensionsKt.safeInt(jSONObject, "notification_types");
                            SubscriptionModel subscriptionModel = new SubscriptionModel();
                            subscriptionModel.setId(string$default);
                            subscriptionModel.setType(SubscriptionType.PUSH);
                            SubscriptionStatus subscriptionStatus = SubscriptionStatus.NO_PERMISSION;
                            int value = subscriptionStatus.getValue();
                            if (numSafeInt != null && numSafeInt.intValue() == value) {
                                z3 = false;
                                subscriptionModel.setOptedIn(z3);
                                strSafeString = JSONObjectExtensionsKt.safeString(jSONObject, "identifier");
                                if (strSafeString == null) {
                                    strSafeString = "";
                                }
                                subscriptionModel.setAddress(strSafeString);
                                if (numSafeInt == null) {
                                    SubscriptionStatus subscriptionStatusFromInt = SubscriptionStatus.Companion.fromInt(numSafeInt.intValue());
                                    if (subscriptionStatusFromInt != null) {
                                        subscriptionStatus = subscriptionStatusFromInt;
                                    }
                                    subscriptionModel.setStatus(subscriptionStatus);
                                } else {
                                    subscriptionModel.setStatus(SubscriptionStatus.SUBSCRIBED);
                                }
                                subscriptionModel.setSdk(OneSignalUtils.SDK_VERSION);
                                String str2 = Build.VERSION.RELEASE;
                                sq8.m48648g(str2, "RELEASE");
                                subscriptionModel.setDeviceOS(str2);
                                carrierName = DeviceUtils.INSTANCE.getCarrierName(((IApplicationService) this.services.getService(IApplicationService.class)).getAppContext());
                                if (carrierName == null) {
                                    carrierName = "";
                                }
                                subscriptionModel.setCarrier(carrierName);
                                appVersion = AndroidUtils.INSTANCE.getAppVersion(((IApplicationService) this.services.getService(IApplicationService.class)).getAppContext());
                                if (appVersion == null) {
                                    appVersion = "";
                                }
                                subscriptionModel.setAppVersion(appVersion);
                                ConfigModel configModel10 = this.configModel;
                                sq8.m48646e(configModel10);
                                configModel10.setPushSubscriptionId(string$default);
                                SubscriptionModelStore subscriptionModelStore = getSubscriptionModelStore();
                                sq8.m48646e(subscriptionModelStore);
                                subscriptionModelStore.add(subscriptionModel, ModelChangeTags.NO_PROPOGATE);
                                z2 = true;
                            } else {
                                int value2 = SubscriptionStatus.UNSUBSCRIBE.getValue();
                                if (numSafeInt == null || numSafeInt.intValue() != value2) {
                                    z3 = true;
                                }
                                subscriptionModel.setOptedIn(z3);
                                strSafeString = JSONObjectExtensionsKt.safeString(jSONObject, "identifier");
                                if (strSafeString == null) {
                                }
                                subscriptionModel.setAddress(strSafeString);
                                if (numSafeInt == null) {
                                }
                                subscriptionModel.setSdk(OneSignalUtils.SDK_VERSION);
                                String str22 = Build.VERSION.RELEASE;
                                sq8.m48648g(str22, "RELEASE");
                                subscriptionModel.setDeviceOS(str22);
                                carrierName = DeviceUtils.INSTANCE.getCarrierName(((IApplicationService) this.services.getService(IApplicationService.class)).getAppContext());
                                if (carrierName == null) {
                                }
                                subscriptionModel.setCarrier(carrierName);
                                appVersion = AndroidUtils.INSTANCE.getAppVersion(((IApplicationService) this.services.getService(IApplicationService.class)).getAppContext());
                                if (appVersion == null) {
                                }
                                subscriptionModel.setAppVersion(appVersion);
                                ConfigModel configModel102 = this.configModel;
                                sq8.m48646e(configModel102);
                                configModel102.setPushSubscriptionId(string$default);
                                SubscriptionModelStore subscriptionModelStore2 = getSubscriptionModelStore();
                                sq8.m48646e(subscriptionModelStore2);
                                subscriptionModelStore2.add(subscriptionModel, ModelChangeTags.NO_PROPOGATE);
                                z2 = true;
                            }
                        } else {
                            z2 = false;
                        }
                        createAndSwitchToNewUser$default(this, z2, null, 2, null);
                        IOperationRepo iOperationRepo2 = this.operationRepo;
                        sq8.m48646e(iOperationRepo2);
                        ConfigModel configModel11 = this.configModel;
                        sq8.m48646e(configModel11);
                        String appId2 = configModel11.getAppId();
                        IdentityModelStore identityModelStore5 = getIdentityModelStore();
                        sq8.m48646e(identityModelStore5);
                        IOperationRepo.DefaultImpls.enqueue$default(iOperationRepo2, new LoginUserFromSubscriptionOperation(appId2, identityModelStore5.getModel().getOnesignalId(), string$default), false, 2, null);
                        IPreferencesService preferencesService4 = getPreferencesService();
                        sq8.m48646e(preferencesService4);
                        preferencesService4.saveString(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_LEGACY_PLAYER_ID, null);
                    }
                }
            }
            startupService.scheduleStart();
            setInitialized(true);
            return true;
        }
    }

    @Override // com.onesignal.IOneSignal
    public boolean isInitialized() {
        return this.isInitialized;
    }

    @Override // com.onesignal.IOneSignal
    public void login(String str) {
        IOneSignal.DefaultImpls.login(this, str);
    }

    @Override // com.onesignal.IOneSignal
    public void logout() throws Exception {
        Logging.log(LogLevel.DEBUG, "logout()");
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'logout'");
        }
        synchronized (this.loginLock) {
            IdentityModelStore identityModelStore = getIdentityModelStore();
            sq8.m48646e(identityModelStore);
            if (identityModelStore.getModel().getExternalId() == null) {
                return;
            }
            createAndSwitchToNewUser$default(this, false, null, 3, null);
            IOperationRepo iOperationRepo = this.operationRepo;
            sq8.m48646e(iOperationRepo);
            ConfigModel configModel = this.configModel;
            sq8.m48646e(configModel);
            String appId = configModel.getAppId();
            IdentityModelStore identityModelStore2 = getIdentityModelStore();
            sq8.m48646e(identityModelStore2);
            String onesignalId = identityModelStore2.getModel().getOnesignalId();
            IdentityModelStore identityModelStore3 = getIdentityModelStore();
            sq8.m48646e(identityModelStore3);
            IOperationRepo.DefaultImpls.enqueue$default(iOperationRepo, new LoginUserOperation(appId, onesignalId, identityModelStore3.getModel().getExternalId(), null, 8, null), false, 2, null);
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // com.onesignal.IOneSignal
    public void setConsentGiven(boolean z) {
        IOperationRepo iOperationRepo;
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z);
        ConfigModel configModel = this.configModel;
        if (configModel != null) {
            configModel.setConsentGiven(Boolean.valueOf(z));
        }
        if (sq8.m48644c(bool, Boolean.valueOf(z)) || !z || (iOperationRepo = this.operationRepo) == null) {
            return;
        }
        iOperationRepo.forceExecuteOperations();
    }

    @Override // com.onesignal.IOneSignal
    public void setConsentRequired(boolean z) {
        this._consentRequired = Boolean.valueOf(z);
        ConfigModel configModel = this.configModel;
        if (configModel == null) {
            return;
        }
        configModel.setConsentRequired(Boolean.valueOf(z));
    }

    @Override // com.onesignal.IOneSignal
    public void setDisableGMSMissingPrompt(boolean z) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z);
        ConfigModel configModel = this.configModel;
        if (configModel == null) {
            return;
        }
        configModel.setDisableGMSMissingPrompt(z);
    }

    public void setInitialized(boolean z) {
        this.isInitialized = z;
    }

    @Override // com.onesignal.IOneSignal
    public void login(String str, String str2) throws Exception {
        sq8.m48649h(str, "externalId");
        Logging.log(LogLevel.DEBUG, "login(externalId: " + str + ", jwtBearerToken: " + str2 + ')');
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'login'");
        }
        gge ggeVar = new gge();
        gge ggeVar2 = new gge();
        gge ggeVar3 = new gge();
        ggeVar3.f25106a = "";
        synchronized (this.loginLock) {
            IdentityModelStore identityModelStore = getIdentityModelStore();
            sq8.m48646e(identityModelStore);
            ggeVar.f25106a = identityModelStore.getModel().getExternalId();
            IdentityModelStore identityModelStore2 = getIdentityModelStore();
            sq8.m48646e(identityModelStore2);
            ggeVar2.f25106a = identityModelStore2.getModel().getOnesignalId();
            if (sq8.m48644c(ggeVar.f25106a, str)) {
                return;
            }
            createAndSwitchToNewUser$default(this, false, new OneSignalImp$login$1$1(str), 1, null);
            IdentityModelStore identityModelStore3 = getIdentityModelStore();
            sq8.m48646e(identityModelStore3);
            ggeVar3.f25106a = identityModelStore3.getModel().getOnesignalId();
            y3i y3iVar = y3i.f54824a;
            ThreadUtilsKt.suspendifyOnThread$default(0, new C117032(ggeVar3, str, ggeVar, ggeVar2, null), 1, null);
        }
    }
}
