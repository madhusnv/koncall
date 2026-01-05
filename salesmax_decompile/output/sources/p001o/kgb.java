package p001o;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRuntime;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;

/* loaded from: classes6.dex */
public class kgb {

    /* renamed from: b */
    public static final Object f32228b = new Object();

    /* renamed from: c */
    public static kgb f32229c;

    /* renamed from: a */
    public ComponentRuntime f32230a;

    /* renamed from: c */
    public static kgb m35683c() {
        kgb kgbVar;
        synchronized (f32228b) {
            Preconditions.checkState(f32229c != null, "MlKitContext has not been initialized");
            kgbVar = (kgb) Preconditions.checkNotNull(f32229c);
        }
        return kgbVar;
    }

    /* renamed from: d */
    public static kgb m35684d(Context context) {
        kgb kgbVar;
        synchronized (f32228b) {
            Preconditions.checkState(f32229c == null, "MlKitContext is already initialized");
            kgb kgbVar2 = new kgb();
            f32229c = kgbVar2;
            Context contextM35685e = m35685e(context);
            ComponentRuntime componentRuntimeBuild = ComponentRuntime.builder(TaskExecutors.MAIN_THREAD).addLazyComponentRegistrars(ComponentDiscovery.forContext(contextM35685e, MlKitComponentDiscoveryService.class).discoverLazy()).addComponent(Component.of(contextM35685e, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.of(kgbVar2, (Class<kgb>) kgb.class, (Class<? super kgb>[]) new Class[0])).build();
            kgbVar2.f32230a = componentRuntimeBuild;
            componentRuntimeBuild.initializeEagerComponents(true);
            kgbVar = f32229c;
        }
        return kgbVar;
    }

    /* renamed from: e */
    public static Context m35685e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public Object m35686a(Class cls) {
        Preconditions.checkState(f32229c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f32230a);
        return this.f32230a.get(cls);
    }

    /* renamed from: b */
    public Context m35687b() {
        return (Context) m35686a(Context.class);
    }
}
