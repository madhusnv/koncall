package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import d7.AbstractServiceC1652x;
import d9.AbstractC1670o;
import d9.C1671p;
import java.util.LinkedHashMap;
import java.util.Map;
import t8.C7077w;
import w8.C7957h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC1652x {

    /* renamed from: b */
    public C7957h f2883b;

    /* renamed from: c */
    public boolean f2884c;

    static {
        C7077w.m13372b("SystemAlarmService");
    }

    /* renamed from: a */
    public final void m1378a() {
        this.f2884c = true;
        C7077w.m13371a().getClass();
        int i10 = AbstractC1670o.f8199a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (C1671p.f8200a) {
            linkedHashMap.putAll(C1671p.f8201b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                C7077w.m13371a().getClass();
            }
        }
        stopSelf();
    }

    @Override // d7.AbstractServiceC1652x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C7957h c7957h = new C7957h(this);
        this.f2883b = c7957h;
        if (c7957h.f38275j != null) {
            C7077w.m13371a().getClass();
        } else {
            c7957h.f38275j = this;
        }
        this.f2884c = false;
    }

    @Override // d7.AbstractServiceC1652x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2884c = true;
        C7957h c7957h = this.f2883b;
        c7957h.getClass();
        C7077w.m13371a().getClass();
        c7957h.f38270d.m13772e(c7957h);
        c7957h.f38275j = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2884c) {
            C7077w.m13371a().getClass();
            C7957h c7957h = this.f2883b;
            c7957h.getClass();
            C7077w.m13371a().getClass();
            c7957h.f38270d.m13772e(c7957h);
            c7957h.f38275j = null;
            C7957h c7957h2 = new C7957h(this);
            this.f2883b = c7957h2;
            if (c7957h2.f38275j != null) {
                C7077w.m13371a().getClass();
            } else {
                c7957h2.f38275j = this;
            }
            this.f2884c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f2883b.m15136b(intent, i11);
        return 3;
    }
}
