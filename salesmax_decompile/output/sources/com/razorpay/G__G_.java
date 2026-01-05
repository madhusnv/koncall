package com.razorpay;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes6.dex */
final class G__G_ implements ServiceConnection {

    /* renamed from: a */
    private boolean f13621a;

    /* renamed from: b */
    private final LinkedBlockingQueue<IBinder> f13622b;

    private G__G_() {
        this.f13621a = false;
        this.f13622b = new LinkedBlockingQueue<>(1);
    }

    /* renamed from: a */
    public final IBinder m15987a() {
        if (!this.f13621a) {
            this.f13621a = true;
        }
        return this.f13622b.take();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
        try {
            this.f13622b.put(iBinder);
        } catch (Exception e) {
            AnalyticsUtil.reportError(G__G_.class.getName(), "S1", e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public /* synthetic */ G__G_(byte b) {
        this();
    }
}
