package androidx.work.impl.foreground;

import a3.C0043b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import b9.C0629a;
import c9.C0914i;
import d7.AbstractServiceC1652x;
import d9.ExecutorC1668m;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4154l;
import l0.RunnableC4307g;
import og.rg;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import t8.C7077w;
import u8.C7368p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC1652x {

    /* renamed from: e */
    public static final /* synthetic */ int f2890e = 0;

    /* renamed from: b */
    public boolean f2891b;

    /* renamed from: c */
    public C0629a f2892c;

    /* renamed from: d */
    public NotificationManager f2893d;

    static {
        C7077w.m13372b("SystemFgService");
    }

    /* renamed from: a */
    public final void m1382a() {
        this.f2893d = (NotificationManager) getApplicationContext().getSystemService("notification");
        C0629a c0629a = new C0629a(getApplicationContext());
        this.f2892c = c0629a;
        if (c0629a.f4099j != null) {
            C7077w.m13371a().getClass();
        } else {
            c0629a.f4099j = this;
        }
    }

    @Override // d7.AbstractServiceC1652x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m1382a();
    }

    @Override // d7.AbstractServiceC1652x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2892c.m1790e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2891b) {
            C7077w.m13371a().getClass();
            this.f2892c.m1790e();
            m1382a();
            this.f2891b = false;
        }
        if (intent == null) {
            return 3;
        }
        C0629a c0629a = this.f2892c;
        c0629a.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C7077w c7077wM13371a = C7077w.m13371a();
            Objects.toString(intent);
            c7077wM13371a.getClass();
            c0629a.f4092b.m5712a(new RunnableC4307g(3, c0629a, intent.getStringExtra("KEY_WORKSPEC_ID"), false));
            c0629a.m1789d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c0629a.m1789d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            C7077w.m13371a().getClass();
            SystemForegroundService systemForegroundService = c0629a.f4099j;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f2891b = true;
            C7077w.m13371a().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        C7077w c7077wM13371a2 = C7077w.m13371a();
        Objects.toString(intent);
        c7077wM13371a2.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        C7368p c7368p = c0629a.f4091a;
        UUID id2 = UUID.fromString(stringExtra);
        c7368p.getClass();
        AbstractC4154l.m8923f(id2, "id");
        C7077w c7077w = c7368p.f35044b.f34116l;
        ExecutorC1668m executorC1668m = (ExecutorC1668m) ((C0914i) c7368p.f35046d).f5585a;
        AbstractC4154l.m8922e(executorC1668m, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        rg.m10883a(c7077w, "CancelWorkById", executorC1668m, new C0043b(4, c7368p, id2));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f2892c.m1791f(NewHope.SENDB_BYTES);
    }

    public final void onTimeout(int i10, int i11) {
        this.f2892c.m1791f(i11);
    }
}
