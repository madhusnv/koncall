package b9;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import c9.C0915j;
import c9.C0922q;
import d9.RunnableC1669n;
import e9.InterfaceC1970a;
import j3.C3553g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import og.ja;
import t8.C7069o;
import t8.C7077w;
import tx.e1;
import u8.C7361i;
import u8.C7368p;
import u8.InterfaceC7354b;
import y8.AbstractC8594c;
import y8.C8593b;
import y8.InterfaceC8597f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b9.a */
/* loaded from: classes.dex */
public final class C0629a implements InterfaceC8597f, InterfaceC7354b {

    /* renamed from: k */
    public static final /* synthetic */ int f4090k = 0;

    /* renamed from: a */
    public final C7368p f4091a;

    /* renamed from: b */
    public final InterfaceC1970a f4092b;

    /* renamed from: c */
    public final Object f4093c = new Object();

    /* renamed from: d */
    public C0915j f4094d;

    /* renamed from: e */
    public final LinkedHashMap f4095e;

    /* renamed from: f */
    public final HashMap f4096f;

    /* renamed from: g */
    public final HashMap f4097g;

    /* renamed from: h */
    public final C3553g f4098h;

    /* renamed from: j */
    public SystemForegroundService f4099j;

    static {
        C7077w.m13372b("SystemFgDispatcher");
    }

    public C0629a(Context context) {
        C7368p c7368pM13783g = C7368p.m13783g(context);
        this.f4091a = c7368pM13783g;
        this.f4092b = c7368pM13783g.f35046d;
        this.f4094d = null;
        this.f4095e = new LinkedHashMap();
        this.f4097g = new HashMap();
        this.f4096f = new HashMap();
        this.f4098h = new C3553g(c7368pM13783g.f35052j);
        c7368pM13783g.f35048f.m13769a(this);
    }

    /* renamed from: c */
    public static Intent m1787c(Context context, C0915j c0915j, C7069o c7069o) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c0915j.f5589a);
        intent.putExtra("KEY_GENERATION", c0915j.f5590b);
        intent.putExtra("KEY_NOTIFICATION_ID", c7069o.f34164a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c7069o.f34165b);
        intent.putExtra("KEY_NOTIFICATION", c7069o.f34166c);
        return intent;
    }

    @Override // u8.InterfaceC7354b
    /* renamed from: a */
    public final void mo1381a(C0915j c0915j, boolean z6) {
        Map.Entry entry;
        synchronized (this.f4093c) {
            try {
                e1 e1Var = ((C0922q) this.f4096f.remove(c0915j)) != null ? (e1) this.f4097g.remove(c0915j) : null;
                if (e1Var != null) {
                    e1Var.mo13510j(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C7069o c7069o = (C7069o) this.f4095e.remove(c0915j);
        if (c0915j.equals(this.f4094d)) {
            if (this.f4095e.size() > 0) {
                Iterator it = this.f4095e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f4094d = (C0915j) entry.getKey();
                if (this.f4099j != null) {
                    C7069o c7069o2 = (C7069o) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f4099j;
                    int i10 = c7069o2.f34164a;
                    int i11 = c7069o2.f34165b;
                    Notification notification = c7069o2.f34166c;
                    systemForegroundService.getClass();
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 31) {
                        AbstractC0630b.m1805n(systemForegroundService, i10, notification, i11);
                    } else if (i12 >= 29) {
                        AbstractC0630b.m1803l(systemForegroundService, i10, notification, i11);
                    } else {
                        systemForegroundService.startForeground(i10, notification);
                    }
                    this.f4099j.f2893d.cancel(c7069o2.f34164a);
                }
            } else {
                this.f4094d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f4099j;
        if (c7069o == null || systemForegroundService2 == null) {
            return;
        }
        C7077w c7077wM13371a = C7077w.m13371a();
        c0915j.toString();
        c7077wM13371a.getClass();
        systemForegroundService2.f2893d.cancel(c7069o.f34164a);
    }

    @Override // y8.InterfaceC8597f
    /* renamed from: b */
    public final void mo1788b(C0922q c0922q, AbstractC8594c abstractC8594c) {
        if (abstractC8594c instanceof C8593b) {
            C7077w.m13371a().getClass();
            C0915j c0915jM10706a = ja.m10706a(c0922q);
            int i10 = ((C8593b) abstractC8594c).f41840a;
            C7368p c7368p = this.f4091a;
            c7368p.f35046d.m5712a(new RunnableC1669n(c7368p.f35048f, new C7361i(c0915jM10706a), true, i10));
        }
    }

    /* renamed from: d */
    public final void m1789d(Intent intent) {
        if (this.f4099j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        C0915j c0915j = new C0915j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C7077w.m13371a().getClass();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C7069o c7069o = new C7069o(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f4095e;
        linkedHashMap.put(c0915j, c7069o);
        C7069o c7069o2 = (C7069o) linkedHashMap.get(this.f4094d);
        if (c7069o2 == null) {
            this.f4094d = c0915j;
        } else {
            this.f4099j.f2893d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i10 |= ((C7069o) ((Map.Entry) it.next()).getValue()).f34165b;
                }
                c7069o = new C7069o(c7069o2.f34164a, c7069o2.f34166c, i10);
            } else {
                c7069o = c7069o2;
            }
        }
        SystemForegroundService systemForegroundService = this.f4099j;
        int i11 = c7069o.f34164a;
        int i12 = c7069o.f34165b;
        Notification notification2 = c7069o.f34166c;
        systemForegroundService.getClass();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            AbstractC0630b.m1805n(systemForegroundService, i11, notification2, i12);
        } else if (i13 >= 29) {
            AbstractC0630b.m1803l(systemForegroundService, i11, notification2, i12);
        } else {
            systemForegroundService.startForeground(i11, notification2);
        }
    }

    /* renamed from: e */
    public final void m1790e() {
        this.f4099j = null;
        synchronized (this.f4093c) {
            try {
                Iterator it = this.f4097g.values().iterator();
                while (it.hasNext()) {
                    ((e1) it.next()).mo13510j(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f4091a.f35048f.m13772e(this);
    }

    /* renamed from: f */
    public final void m1791f(int i10) {
        C7077w.m13371a().getClass();
        for (Map.Entry entry : this.f4095e.entrySet()) {
            if (((C7069o) entry.getValue()).f34165b == i10) {
                C0915j c0915j = (C0915j) entry.getKey();
                C7368p c7368p = this.f4091a;
                c7368p.f35046d.m5712a(new RunnableC1669n(c7368p.f35048f, new C7361i(c0915j), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f4099j;
        if (systemForegroundService != null) {
            systemForegroundService.f2891b = true;
            C7077w.m13371a().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
        }
    }
}
