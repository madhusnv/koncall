package w8;

import a9.C0073l;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c9.C0914i;
import c9.C0915j;
import c9.C0922q;
import d9.AbstractC1670o;
import d9.C1677v;
import d9.ExecutorC1668m;
import d9.InterfaceC1675t;
import d9.RunnableC1676u;
import fh.RunnableC2286a;
import j3.C3553g;
import java.util.Objects;
import k0.ExecutorC3896f;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import t8.C7077w;
import tx.AbstractC7262v;
import tx.s1;
import u8.C7356d;
import u8.C7361i;
import y8.AbstractC8594c;
import y8.AbstractC8600i;
import y8.C8592a;
import y8.InterfaceC8597f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w8.f */
/* loaded from: classes.dex */
public final class C7955f implements InterfaceC8597f, InterfaceC1675t {

    /* renamed from: a */
    public final Context f38250a;

    /* renamed from: b */
    public final int f38251b;

    /* renamed from: c */
    public final C0915j f38252c;

    /* renamed from: d */
    public final C7957h f38253d;

    /* renamed from: e */
    public final C3553g f38254e;

    /* renamed from: f */
    public final Object f38255f;

    /* renamed from: g */
    public int f38256g;

    /* renamed from: h */
    public final ExecutorC1668m f38257h;

    /* renamed from: j */
    public final ExecutorC3896f f38258j;

    /* renamed from: k */
    public PowerManager.WakeLock f38259k;

    /* renamed from: l */
    public boolean f38260l;

    /* renamed from: m */
    public final C7361i f38261m;

    /* renamed from: n */
    public final AbstractC7262v f38262n;

    /* renamed from: p */
    public volatile s1 f38263p;

    static {
        C7077w.m13372b("DelayMetCommandHandler");
    }

    public C7955f(Context context, int i10, C7957h c7957h, C7361i c7361i) {
        this.f38250a = context;
        this.f38251b = i10;
        this.f38253d = c7957h;
        this.f38252c = c7361i.f35021a;
        this.f38261m = c7361i;
        C0073l c0073l = c7957h.f38271e.f35052j;
        C0914i c0914i = (C0914i) c7957h.f38268b;
        this.f38257h = (ExecutorC1668m) c0914i.f5585a;
        this.f38258j = (ExecutorC3896f) c0914i.f5588d;
        this.f38262n = (AbstractC7262v) c0914i.f5586b;
        this.f38254e = new C3553g(c0073l);
        this.f38260l = false;
        this.f38256g = 0;
        this.f38255f = new Object();
    }

    /* renamed from: a */
    public static void m15130a(C7955f c7955f) {
        boolean z6;
        int i10 = c7955f.f38251b;
        ExecutorC3896f executorC3896f = c7955f.f38258j;
        Context context = c7955f.f38250a;
        C7957h c7957h = c7955f.f38253d;
        C0915j c0915j = c7955f.f38252c;
        String str = c0915j.f5589a;
        if (c7955f.f38256g >= 2) {
            C7077w.m13371a().getClass();
            return;
        }
        c7955f.f38256g = 2;
        C7077w.m13371a().getClass();
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        C7951b.m15128d(intent, c0915j);
        executorC3896f.execute(new RunnableC2286a(c7957h, intent, i10, 3));
        C7356d c7356d = c7957h.f38270d;
        String str2 = c0915j.f5589a;
        synchronized (c7356d.f35013k) {
            z6 = c7356d.m13771c(str2) != null;
        }
        if (!z6) {
            C7077w.m13371a().getClass();
            return;
        }
        C7077w.m13371a().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        C7951b.m15128d(intent2, c0915j);
        executorC3896f.execute(new RunnableC2286a(c7957h, intent2, i10, 3));
    }

    /* renamed from: c */
    public static void m15131c(C7955f c7955f) {
        if (c7955f.f38256g != 0) {
            C7077w c7077wM13371a = C7077w.m13371a();
            Objects.toString(c7955f.f38252c);
            c7077wM13371a.getClass();
            return;
        }
        c7955f.f38256g = 1;
        C7077w c7077wM13371a2 = C7077w.m13371a();
        Objects.toString(c7955f.f38252c);
        c7077wM13371a2.getClass();
        if (!c7955f.f38253d.f38270d.m13774g(c7955f.f38261m, null)) {
            c7955f.m15132d();
            return;
        }
        C1677v c1677v = c7955f.f38253d.f38269c;
        C0915j c0915j = c7955f.f38252c;
        synchronized (c1677v.f8213d) {
            C7077w c7077wM13371a3 = C7077w.m13371a();
            Objects.toString(c0915j);
            c7077wM13371a3.getClass();
            c1677v.m5382a(c0915j);
            RunnableC1676u runnableC1676u = new RunnableC1676u(c1677v, c0915j);
            c1677v.f8211b.put(c0915j, runnableC1676u);
            c1677v.f8212c.put(c0915j, c7955f);
            ((Handler) c1677v.f8210a.f20704b).postDelayed(runnableC1676u, 600000L);
        }
    }

    @Override // y8.InterfaceC8597f
    /* renamed from: b */
    public final void mo1788b(C0922q c0922q, AbstractC8594c abstractC8594c) {
        boolean z6 = abstractC8594c instanceof C8592a;
        ExecutorC1668m executorC1668m = this.f38257h;
        if (z6) {
            executorC1668m.execute(new RunnableC7954e(this, 1));
        } else {
            executorC1668m.execute(new RunnableC7954e(this, 0));
        }
    }

    /* renamed from: d */
    public final void m15132d() {
        synchronized (this.f38255f) {
            try {
                if (this.f38263p != null) {
                    this.f38263p.mo13510j(null);
                }
                this.f38253d.f38269c.m5382a(this.f38252c);
                PowerManager.WakeLock wakeLock = this.f38259k;
                if (wakeLock != null && wakeLock.isHeld()) {
                    C7077w c7077wM13371a = C7077w.m13371a();
                    Objects.toString(this.f38259k);
                    Objects.toString(this.f38252c);
                    c7077wM13371a.getClass();
                    this.f38259k.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m15133e() throws Throwable {
        String str = this.f38252c.f5589a;
        Context context = this.f38250a;
        StringBuilder sbM11245p = AbstractC5601a.m11245p(str, " (");
        sbM11245p.append(this.f38251b);
        sbM11245p.append(")");
        this.f38259k = AbstractC1670o.m5381a(context, sbM11245p.toString());
        C7077w c7077wM13371a = C7077w.m13371a();
        Objects.toString(this.f38259k);
        c7077wM13371a.getClass();
        this.f38259k.acquire();
        C0922q c0922qM2685n = this.f38253d.f38271e.f35045c.mo1368C().m2685n(str);
        if (c0922qM2685n == null) {
            this.f38257h.execute(new RunnableC7954e(this, 0));
            return;
        }
        boolean zM2670c = c0922qM2685n.m2670c();
        this.f38260l = zM2670c;
        if (zM2670c) {
            this.f38263p = AbstractC8600i.m15954a(this.f38254e, c0922qM2685n, this.f38262n, this);
        } else {
            C7077w.m13371a().getClass();
            this.f38257h.execute(new RunnableC7954e(this, 1));
        }
    }

    /* renamed from: f */
    public final void m15134f(boolean z6) {
        C7077w c7077wM13371a = C7077w.m13371a();
        C0915j c0915j = this.f38252c;
        Objects.toString(c0915j);
        c7077wM13371a.getClass();
        m15132d();
        int i10 = this.f38251b;
        C7957h c7957h = this.f38253d;
        ExecutorC3896f executorC3896f = this.f38258j;
        Context context = this.f38250a;
        if (z6) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C7951b.m15128d(intent, c0915j);
            executorC3896f.execute(new RunnableC2286a(c7957h, intent, i10, 3));
        }
        if (this.f38260l) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executorC3896f.execute(new RunnableC2286a(c7957h, intent2, i10, 3));
        }
    }
}
