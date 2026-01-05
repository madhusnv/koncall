package ai.salesmax.ui.call;

import ai.salesmax.health.HealthCheckHandler;
import ai.salesmax.ui.call.CallStateListenerAsync;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import p001o.sq8;

/* loaded from: classes.dex */
public final class CallStateListenerAsync extends BaseCallBroadcastReceiver {

    /* renamed from: b */
    public final HealthCheckHandler f464b;

    /* renamed from: c */
    public final C0309a f465c;

    /* renamed from: d */
    public final HandlerThread f466d;

    /* renamed from: e */
    public final Handler f467e;

    /* renamed from: f */
    public final String f468f;

    public CallStateListenerAsync(HealthCheckHandler healthCheckHandler) {
        sq8.m48649h(healthCheckHandler, "healthCheckHandler");
        this.f464b = healthCheckHandler;
        this.f465c = C0309a.f469b.m780c();
        HandlerThread handlerThread = new HandlerThread("CallStateHandlerThread");
        handlerThread.start();
        this.f466d = handlerThread;
        this.f467e = new Handler(handlerThread.getLooper());
        this.f468f = CallStateListenerAsync.class.getSimpleName();
    }

    /* renamed from: g */
    public static final void m769g(CallStateListenerAsync callStateListenerAsync, Context context, Intent intent) {
        sq8.m48649h(callStateListenerAsync, "this$0");
        sq8.m48649h(context, "$context");
        sq8.m48649h(intent, "$intent");
        callStateListenerAsync.m772h(context, intent);
    }

    /* renamed from: i */
    public static final void m770i(CallStateListenerAsync callStateListenerAsync, Intent intent) {
        sq8.m48649h(callStateListenerAsync, "this$0");
        sq8.m48649h(intent, "$intent");
        callStateListenerAsync.m773k(intent);
    }

    /* renamed from: j */
    public static final void m771j(CallStateListenerAsync callStateListenerAsync, Context context, Intent intent) {
        sq8.m48649h(callStateListenerAsync, "this$0");
        sq8.m48649h(context, "$context");
        sq8.m48649h(intent, "$intent");
        callStateListenerAsync.m740c(context, intent);
    }

    /* renamed from: h */
    public final void m772h(final Context context, final Intent intent) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.b02
            @Override // java.lang.Runnable
            public final void run() {
                CallStateListenerAsync.m770i(this.f15416a, intent);
            }
        });
        if (this.f464b.healthCheckAction().equals(intent.getAction())) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.c02
            @Override // java.lang.Runnable
            public final void run() {
                CallStateListenerAsync.m771j(this.f17039a, context, intent);
            }
        });
    }

    /* renamed from: k */
    public final void m773k(Intent intent) {
        if (this.f464b.healthCheckAction().equals(intent.getAction())) {
            this.f464b.updateHealthStatus(Boolean.TRUE);
            this.f464b.lastHealthStatusUpdatedAt(Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        this.f467e.post(new Runnable() { // from class: o.a02
            @Override // java.lang.Runnable
            public final void run() {
                CallStateListenerAsync.m769g(this.f13997a, context, intent);
            }
        });
    }
}
