package w8;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c9.C0914i;
import c9.C0915j;
import d9.AbstractC1670o;
import d9.C1677v;
import e9.InterfaceC1970a;
import fh.RunnableC2286a;
import java.util.ArrayList;
import java.util.Objects;
import k0.ExecutorC3896f;
import t8.C7056b;
import t8.C7062h;
import t8.C7077w;
import tb.C7105p;
import u8.C7356d;
import u8.C7368p;
import u8.InterfaceC7354b;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w8.h */
/* loaded from: classes.dex */
public final class C7957h implements InterfaceC7354b {

    /* renamed from: l */
    public static final /* synthetic */ int f38266l = 0;

    /* renamed from: a */
    public final Context f38267a;

    /* renamed from: b */
    public final InterfaceC1970a f38268b;

    /* renamed from: c */
    public final C1677v f38269c;

    /* renamed from: d */
    public final C7356d f38270d;

    /* renamed from: e */
    public final C7368p f38271e;

    /* renamed from: f */
    public final C7951b f38272f;

    /* renamed from: g */
    public final ArrayList f38273g;

    /* renamed from: h */
    public Intent f38274h;

    /* renamed from: j */
    public SystemAlarmService f38275j;

    /* renamed from: k */
    public final C8849i f38276k;

    static {
        C7077w.m13372b("SystemAlarmDispatcher");
    }

    public C7957h(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f38267a = applicationContext;
        C7105p c7105p = new C7105p(new C7062h(1));
        C7368p c7368pM13783g = C7368p.m13783g(systemAlarmService);
        C7056b c7056b = c7368pM13783g.f35044b;
        this.f38271e = c7368pM13783g;
        this.f38272f = new C7951b(applicationContext, c7056b.f34108d, c7105p);
        this.f38269c = new C1677v(c7056b.f34111g);
        C7356d c7356d = c7368pM13783g.f35048f;
        this.f38270d = c7356d;
        InterfaceC1970a interfaceC1970a = c7368pM13783g.f35046d;
        this.f38268b = interfaceC1970a;
        this.f38276k = new C8849i(c7356d, interfaceC1970a);
        c7356d.m13769a(this);
        this.f38273g = new ArrayList();
        this.f38274h = null;
    }

    /* renamed from: c */
    public static void m15135c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // u8.InterfaceC7354b
    /* renamed from: a */
    public final void mo1381a(C0915j c0915j, boolean z6) {
        ExecutorC3896f executorC3896f = (ExecutorC3896f) ((C0914i) this.f38268b).f5588d;
        int i10 = C7951b.f38238f;
        Intent intent = new Intent(this.f38267a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        C7951b.m15128d(intent, c0915j);
        executorC3896f.execute(new RunnableC2286a(this, intent, 0, 3));
    }

    /* renamed from: b */
    public final void m15136b(Intent intent, int i10) {
        C7077w c7077wM13371a = C7077w.m13371a();
        Objects.toString(intent);
        c7077wM13371a.getClass();
        m15135c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C7077w.m13371a().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m15135c();
            synchronized (this.f38273g) {
                try {
                    ArrayList arrayList = this.f38273g;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f38273g) {
            try {
                boolean zIsEmpty = this.f38273g.isEmpty();
                this.f38273g.add(intent);
                if (zIsEmpty) {
                    m15137d();
                }
            } finally {
            }
        }
    }

    /* renamed from: d */
    public final void m15137d() {
        m15135c();
        PowerManager.WakeLock wakeLockM5381a = AbstractC1670o.m5381a(this.f38267a, "ProcessCommand");
        try {
            wakeLockM5381a.acquire();
            this.f38271e.f35046d.m5712a(new RunnableC7956g(this, 0));
        } finally {
            wakeLockM5381a.release();
        }
    }
}
