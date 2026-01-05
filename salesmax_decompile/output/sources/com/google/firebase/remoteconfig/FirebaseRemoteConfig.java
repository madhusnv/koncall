package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final ConfigCacheClient activatedConfigsCache;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigMetadataClient frcMetadata;
    private final ConfigGetParameterHandler getHandler;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcMetadata = configMetadataClient;
    }

    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    private static boolean isFetchedFresh(ConfigContainer configContainer, ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.getFetchTime().equals(configContainer2.getFetchTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$activate$2(Task task, Task task2, Task task3) {
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        ConfigContainer configContainer = (ConfigContainer) task.getResult();
        return (!task2.isSuccessful() || isFetchedFresh(configContainer, (ConfigContainer) task2.getResult())) ? this.activatedConfigsCache.put(configContainer).continueWith(this.executor, new Continuation() { // from class: o.p17
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return Boolean.valueOf(this.f39174a.processActivatePutTask(task4));
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseRemoteConfigInfo lambda$ensureInitialized$0(Task task, Task task2) {
        return (FirebaseRemoteConfigInfo) task.getResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetch$3(ConfigFetchHandler.FetchResponse fetchResponse) {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetch$4(ConfigFetchHandler.FetchResponse fetchResponse) {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchAndActivate$1(Void r1) {
        return activate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$reset$6() {
        this.activatedConfigsCache.clear();
        this.fetchedConfigsCache.clear();
        this.defaultConfigsCache.clear();
        this.frcMetadata.clear();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$setConfigSettingsAsync$5(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.frcMetadata.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$setDefaultsWithStringsMapAsync$7(ConfigContainer configContainer) {
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean processActivatePutTask(Task<ConfigContainer> task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.fetchedConfigsCache.clear();
        if (task.getResult() == null) {
            return true;
        }
        updateAbtWithActivatedExperiments(task.getResult().getAbtExperiments());
        return true;
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
        try {
            return this.defaultConfigsCache.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(new SuccessContinuation() { // from class: o.h17
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
                }
            });
        } catch (JSONException unused) {
            return Tasks.forResult(null);
        }
    }

    public static List<Map<String, String>> toExperimentInfoMaps(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public Task<Boolean> activate() {
        final Task<ConfigContainer> task = this.fetchedConfigsCache.get();
        final Task<ConfigContainer> task2 = this.activatedConfigsCache.get();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2}).continueWithTask(this.executor, new Continuation() { // from class: o.q17
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return this.f41085a.lambda$activate$2(task, task2, task3);
            }
        });
    }

    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.activatedConfigsCache.get();
        Task<ConfigContainer> task2 = this.defaultConfigsCache.get();
        Task<ConfigContainer> task3 = this.fetchedConfigsCache.get();
        final Task taskCall = Tasks.call(this.executor, new Callable() { // from class: o.l17
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f32986a.getInfo();
            }
        });
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2, task3, taskCall, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)}).continueWith(this.executor, new Continuation() { // from class: o.m17
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return FirebaseRemoteConfig.lambda$ensureInitialized$0(taskCall, task4);
            }
        });
    }

    public Task<Void> fetch() {
        return this.fetchHandler.fetch().onSuccessTask(new SuccessContinuation() { // from class: o.k17
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
            }
        });
    }

    public Task<Boolean> fetchAndActivate() {
        return fetch().onSuccessTask(this.executor, new SuccessContinuation() { // from class: o.o17
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f37524a.lambda$fetchAndActivate$1((Void) obj);
            }
        });
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.getHandler.getAll();
    }

    public boolean getBoolean(String str) {
        return this.getHandler.getBoolean(str);
    }

    public double getDouble(String str) {
        return this.getHandler.getDouble(str);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        return this.frcMetadata.getInfo();
    }

    public Set<String> getKeysByPrefix(String str) {
        return this.getHandler.getKeysByPrefix(str);
    }

    public long getLong(String str) {
        return this.getHandler.getLong(str);
    }

    public String getString(String str) {
        return this.getHandler.getString(str);
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        return this.getHandler.getValue(str);
    }

    public Task<Void> reset() {
        return Tasks.call(this.executor, new Callable() { // from class: o.j17
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f29537a.lambda$reset$6();
            }
        });
    }

    public Task<Void> setConfigSettingsAsync(final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.call(this.executor, new Callable() { // from class: o.n17
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f36214a.lambda$setConfigSettingsAsync$5(firebaseRemoteConfigSettings);
            }
        });
    }

    public Task<Void> setDefaultsAsync(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put(entry.getKey(), new String((byte[]) value));
            } else {
                map2.put(entry.getKey(), value.toString());
            }
        }
        return setDefaultsWithStringsMapAsync(map2);
    }

    public void startLoadingConfigsFromDisk() {
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
    }

    public void updateAbtWithActivatedExperiments(JSONArray jSONArray) {
        if (this.firebaseAbt == null) {
            return;
        }
        try {
            this.firebaseAbt.replaceAllExperiments(toExperimentInfoMaps(jSONArray));
        } catch (AbtException | JSONException unused) {
        }
    }

    public static FirebaseRemoteConfig getInstance(FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).getDefault();
    }

    public Task<Void> fetch(long j) {
        return this.fetchHandler.fetch(j).onSuccessTask(new SuccessContinuation() { // from class: o.i17
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
            }
        });
    }

    public Task<Void> setDefaultsAsync(int i) {
        return setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i));
    }
}
