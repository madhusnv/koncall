package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p001o.sq8;
import p001o.xca;

/* loaded from: classes2.dex */
public class LifecycleService extends Service implements xca {
    private final C2156y dispatcher = new C2156y(this);

    @Override // p001o.xca
    public AbstractC2139h getLifecycle() {
        return this.dispatcher.m6602a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        sq8.m48649h(intent, "intent");
        this.dispatcher.m6603b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.dispatcher.m6604c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.dispatcher.m6605d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.dispatcher.m6606e();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
