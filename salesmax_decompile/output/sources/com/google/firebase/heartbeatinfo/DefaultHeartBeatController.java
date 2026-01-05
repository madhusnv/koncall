package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONObject;
import p001o.shi;

/* loaded from: classes5.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {
    private final Context applicationContext;
    private final Executor backgroundExecutor;
    private final Set<HeartBeatConsumer> consumers;
    private final Provider<HeartBeatInfoStorage> storageProvider;
    private final Provider<UserAgentPublisher> userAgentProvider;

    private DefaultHeartBeatController(final Context context, final String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider, Executor executor) {
        this((Provider<HeartBeatInfoStorage>) new Provider() { // from class: o.ge5
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return DefaultHeartBeatController.lambda$new$2(context, str);
            }
        }, set, executor, provider, context);
    }

    public static Component<DefaultHeartBeatController> component() {
        final Qualified qualified = Qualified.qualified(Background.class, Executor.class);
        return Component.builder(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.setOf((Class<?>) HeartBeatConsumer.class)).add(Dependency.requiredProvider((Class<?>) UserAgentPublisher.class)).add(Dependency.required((Qualified<?>) qualified)).factory(new ComponentFactory() { // from class: o.fe5
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultHeartBeatController.lambda$component$3(qualified, componentContainer);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DefaultHeartBeatController lambda$component$3(Qualified qualified, ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getPersistenceKey(), (Set<HeartBeatConsumer>) componentContainer.setOf(HeartBeatConsumer.class), (Provider<UserAgentPublisher>) componentContainer.getProvider(UserAgentPublisher.class), (Executor) componentContainer.get(qualified));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getHeartBeatsHeader$1() {
        String string;
        synchronized (this) {
            HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
            List<HeartBeatResult> allHeartBeats = heartBeatInfoStorage.getAllHeartBeats();
            heartBeatInfoStorage.deleteAllHeartBeats();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < allHeartBeats.size(); i++) {
                HeartBeatResult heartBeatResult = allHeartBeats.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", heartBeatResult.getUserAgent());
                jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.getUsedDates()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put(ClientCookie.VERSION_ATTR, "2");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes(HTTP.UTF_8));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    string = byteArrayOutputStream.toString(HTTP.UTF_8);
                } finally {
                }
            } finally {
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HeartBeatInfoStorage lambda$new$2(Context context, String str) {
        return new HeartBeatInfoStorage(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$registerHeartBeat$0() {
        synchronized (this) {
            this.storageProvider.get().storeHeartBeat(System.currentTimeMillis(), this.userAgentProvider.get().getUserAgent());
        }
        return null;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public synchronized HeartBeatInfo.HeartBeat getHeartBeatCode(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
        if (!heartBeatInfoStorage.shouldSendGlobalHeartBeat(jCurrentTimeMillis)) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        heartBeatInfoStorage.postHeartBeatCleanUp();
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> getHeartBeatsHeader() {
        return shi.m48357a(this.applicationContext) ^ true ? Tasks.forResult("") : Tasks.call(this.backgroundExecutor, new Callable() { // from class: o.de5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19633a.lambda$getHeartBeatsHeader$1();
            }
        });
    }

    public Task<Void> registerHeartBeat() {
        return this.consumers.size() <= 0 ? Tasks.forResult(null) : shi.m48357a(this.applicationContext) ^ true ? Tasks.forResult(null) : Tasks.call(this.backgroundExecutor, new Callable() { // from class: o.ee5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21480a.lambda$registerHeartBeat$0();
            }
        });
    }

    public DefaultHeartBeatController(Provider<HeartBeatInfoStorage> provider, Set<HeartBeatConsumer> set, Executor executor, Provider<UserAgentPublisher> provider2, Context context) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
        this.userAgentProvider = provider2;
        this.applicationContext = context;
    }
}
