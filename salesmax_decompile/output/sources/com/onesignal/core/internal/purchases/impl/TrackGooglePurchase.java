package com.onesignal.core.internal.purchases.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferencePlayerPurchasesKeys;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.core.internal.purchases.impl.TrackGooglePurchase;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.PurchaseInfo;
import com.onesignal.user.internal.operations.TrackPurchaseOperation;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class TrackGooglePurchase implements IStartableService, IApplicationLifecycleHandler {
    private static Class<?> iInAppBillingServiceClass;
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final IOperationRepo _operationRepo;
    private final IPreferencesService _prefs;
    private Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest;
    private Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting;
    private final List<String> purchaseTokens;
    public static final Companion Companion = new Companion(null);
    private static int iapEnabled = -99;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getAsInterfaceMethod(Class<?> cls) throws SecurityException {
            Method[] methods = cls.getMethods();
            sq8.m48648g(methods, "clazz.methods");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && sq8.m48644c(parameterTypes[0], IBinder.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetPurchasesMethod(Class<?> cls) throws SecurityException {
            sq8.m48646e(cls);
            Method[] methods = cls.getMethods();
            sq8.m48648g(methods, "clazz!!.methods");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 4 && sq8.m48644c(parameterTypes[0], Integer.TYPE) && sq8.m48644c(parameterTypes[1], String.class) && sq8.m48644c(parameterTypes[2], String.class) && sq8.m48644c(parameterTypes[3], String.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetSkuDetailsMethod(Class<?> cls) throws SecurityException {
            sq8.m48646e(cls);
            Method[] methods = cls.getMethods();
            sq8.m48648g(methods, "clazz!!.methods");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (parameterTypes.length == 4 && sq8.m48644c(parameterTypes[0], Integer.TYPE) && sq8.m48644c(parameterTypes[1], String.class) && sq8.m48644c(parameterTypes[2], String.class) && sq8.m48644c(parameterTypes[3], Bundle.class) && sq8.m48644c(returnType, Bundle.class)) {
                    return method;
                }
            }
            return null;
        }

        public final boolean canTrack(Context context) {
            sq8.m48649h(context, "context");
            if (TrackGooglePurchase.iapEnabled == -99) {
                TrackGooglePurchase.iapEnabled = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
            }
            try {
                if (TrackGooglePurchase.iapEnabled == 0) {
                    TrackGooglePurchase.iInAppBillingServiceClass = Class.forName("com.android.vending.billing.IInAppBillingService");
                }
                return TrackGooglePurchase.iapEnabled == 0;
            } catch (Throwable unused) {
                TrackGooglePurchase.iapEnabled = 0;
                return false;
            }
        }
    }

    public TrackGooglePurchase(IApplicationService iApplicationService, IPreferencesService iPreferencesService, IOperationRepo iOperationRepo, ConfigModelStore configModelStore, IdentityModelStore identityModelStore) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iPreferencesService, "_prefs");
        sq8.m48649h(iOperationRepo, "_operationRepo");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        this._applicationService = iApplicationService;
        this._prefs = iPreferencesService;
        this._operationRepo = iOperationRepo;
        this._configModelStore = configModelStore;
        this._identityModelStore = identityModelStore;
        this.purchaseTokens = new ArrayList();
        this.newAsExisting = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryBoughtItems() {
        if (this.isWaitingForPurchasesRequest) {
            return;
        }
        new Thread(new Runnable() { // from class: o.pth
            @Override // java.lang.Runnable
            public final void run() {
                TrackGooglePurchase.m68750queryBoughtItems$lambda0(this.f40558a);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: queryBoughtItems$lambda-0, reason: not valid java name */
    public static final void m68750queryBoughtItems$lambda0(TrackGooglePurchase trackGooglePurchase) {
        sq8.m48649h(trackGooglePurchase, "this$0");
        trackGooglePurchase.isWaitingForPurchasesRequest = true;
        try {
            if (trackGooglePurchase.getPurchasesMethod == null) {
                Method getPurchasesMethod = Companion.getGetPurchasesMethod(iInAppBillingServiceClass);
                trackGooglePurchase.getPurchasesMethod = getPurchasesMethod;
                sq8.m48646e(getPurchasesMethod);
                getPurchasesMethod.setAccessible(true);
            }
            Method method = trackGooglePurchase.getPurchasesMethod;
            sq8.m48646e(method);
            Object objInvoke = method.invoke(trackGooglePurchase.mIInAppBillingService, 3, trackGooglePurchase._applicationService.getAppContext().getPackageName(), "inapp", null);
            sq8.m48647f(objInvoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) objInvoke;
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                sq8.m48646e(stringArrayList2);
                int size = stringArrayList2.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList2.get(i);
                    sq8.m48646e(stringArrayList);
                    String str2 = stringArrayList.get(i);
                    String string = new JSONObject(str).getString("purchaseToken");
                    if (!trackGooglePurchase.purchaseTokens.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    trackGooglePurchase.sendPurchases(arrayList, arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    trackGooglePurchase.newAsExisting = false;
                    trackGooglePurchase._prefs.saveBool(PreferenceStores.PLAYER_PURCHASES, PreferencePlayerPurchasesKeys.PREFS_EXISTING_PURCHASES, Boolean.FALSE);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        trackGooglePurchase.isWaitingForPurchasesRequest = false;
    }

    private final void sendPurchases(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.getSkuDetailsMethod == null) {
                Method getSkuDetailsMethod = Companion.getGetSkuDetailsMethod(iInAppBillingServiceClass);
                this.getSkuDetailsMethod = getSkuDetailsMethod;
                sq8.m48646e(getSkuDetailsMethod);
                getSkuDetailsMethod.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Method method = this.getSkuDetailsMethod;
            sq8.m48646e(method);
            Object objInvoke = method.invoke(this.mIInAppBillingService, 3, this._applicationService.getAppContext().getPackageName(), "inapp", bundle);
            sq8.m48647f(objInvoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle2 = (Bundle) objInvoke;
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                sq8.m48646e(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    String string2 = jSONObject.getString("price_currency_code");
                    BigDecimal bigDecimalDivide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    sq8.m48648g(bigDecimalDivide, "price.divide(BigDecimal(1000000))");
                    sq8.m48648g(string, "sku");
                    sq8.m48648g(string2, "iso");
                    linkedHashMap.put(string, new PurchaseInfo(string, string2, bigDecimalDivide));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (linkedHashMap.containsKey(next)) {
                        Object obj = linkedHashMap.get(next);
                        sq8.m48646e(obj);
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    IOperationRepo.DefaultImpls.enqueue$default(this._operationRepo, new TrackPurchaseOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), this.newAsExisting, new BigDecimal(0), arrayList3), false, 2, null);
                    this.purchaseTokens.addAll(arrayList2);
                    this._prefs.saveString(PreferenceStores.PLAYER_PURCHASES, PreferencePlayerPurchasesKeys.PREFS_PURCHASE_TOKENS, this.purchaseTokens.toString());
                    this._prefs.saveBool(PreferenceStores.PLAYER_PURCHASES, PreferencePlayerPurchasesKeys.PREFS_EXISTING_PURCHASES, Boolean.TRUE);
                    this.newAsExisting = false;
                    this.isWaitingForPurchasesRequest = false;
                }
            }
        } catch (Throwable th) {
            Logging.warn("Failed to track IAP purchases", th);
        }
    }

    private final void trackIAP() {
        if (this.mServiceConn != null) {
            if (this.mIInAppBillingService != null) {
                queryBoughtItems();
            }
        } else {
            ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.onesignal.core.internal.purchases.impl.TrackGooglePurchase$trackIAP$serviceConn$1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    sq8.m48649h(componentName, "name");
                    sq8.m48649h(iBinder, "service");
                    try {
                        Class<?> cls = Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                        TrackGooglePurchase.Companion companion = TrackGooglePurchase.Companion;
                        sq8.m48648g(cls, "stubClass");
                        Method asInterfaceMethod = companion.getAsInterfaceMethod(cls);
                        sq8.m48646e(asInterfaceMethod);
                        asInterfaceMethod.setAccessible(true);
                        this.this$0.mIInAppBillingService = asInterfaceMethod.invoke(null, iBinder);
                        this.this$0.queryBoughtItems();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    sq8.m48649h(componentName, "name");
                    TrackGooglePurchase.iapEnabled = -99;
                    this.this$0.mIInAppBillingService = null;
                }
            };
            this.mServiceConn = serviceConnection;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this._applicationService.getAppContext().getApplicationContext().bindService(intent, serviceConnection, 1);
        }
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
        trackIAP();
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        if (Companion.canTrack(this._applicationService.getAppContext())) {
            try {
                JSONArray jSONArray = new JSONArray(this._prefs.getString(PreferenceStores.PLAYER_PURCHASES, PreferencePlayerPurchasesKeys.PREFS_PURCHASE_TOKENS, "[]"));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.purchaseTokens.add(jSONArray.get(i).toString());
                }
                boolean z = jSONArray.length() == 0;
                this.newAsExisting = z;
                if (z) {
                    Boolean bool = this._prefs.getBool(PreferenceStores.PLAYER_PURCHASES, PreferencePlayerPurchasesKeys.PREFS_EXISTING_PURCHASES, Boolean.TRUE);
                    sq8.m48646e(bool);
                    this.newAsExisting = bool.booleanValue();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this._applicationService.addApplicationLifecycleHandler(this);
            trackIAP();
        }
    }
}
