package rf;

import a2.AbstractC0030c;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import bg.AbstractC0656a;
import c9.C0927v;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.h0;
import e1.C1904f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import jg.AbstractC3765d;
import pf.C5902b;
import pf.C5905e;
import qf.AbstractC6206e;
import sf.C6826l;
import sf.C6827m;
import sf.C6828n;
import sf.k0;
import uf.C7428c;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.e */
/* loaded from: classes.dex */
public final class C6500e implements Handler.Callback {

    /* renamed from: r */
    public static final Status f31219r = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: s */
    public static final Status f31220s = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: t */
    public static final Object f31221t = new Object();

    /* renamed from: v */
    public static C6500e f31222v;

    /* renamed from: a */
    public long f31223a;

    /* renamed from: b */
    public boolean f31224b;

    /* renamed from: c */
    public C6828n f31225c;

    /* renamed from: d */
    public C7428c f31226d;

    /* renamed from: e */
    public final Context f31227e;

    /* renamed from: f */
    public final C5905e f31228f;

    /* renamed from: g */
    public final C0927v f31229g;

    /* renamed from: h */
    public final AtomicInteger f31230h;

    /* renamed from: j */
    public final AtomicInteger f31231j;

    /* renamed from: k */
    public final ConcurrentHashMap f31232k;

    /* renamed from: l */
    public DialogInterfaceOnCancelListenerC6508m f31233l;

    /* renamed from: m */
    public final C1904f f31234m;

    /* renamed from: n */
    public final C1904f f31235n;

    /* renamed from: p */
    public final h0 f31236p;

    /* renamed from: q */
    public volatile boolean f31237q;

    public C6500e(Context context, Looper looper) {
        C5905e c5905e = C5905e.f28746d;
        this.f31223a = 10000L;
        this.f31224b = false;
        this.f31230h = new AtomicInteger(1);
        this.f31231j = new AtomicInteger(0);
        this.f31232k = new ConcurrentHashMap(5, 0.75f, 1);
        this.f31233l = null;
        this.f31234m = new C1904f(0);
        this.f31235n = new C1904f(0);
        this.f31237q = true;
        this.f31227e = context;
        h0 h0Var = new h0(looper, this, 1);
        Looper.getMainLooper();
        this.f31236p = h0Var;
        this.f31228f = c5905e;
        this.f31229g = new C0927v(13);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC8947b.f42957f == null) {
            AbstractC8947b.f42957f = Boolean.valueOf(AbstractC8947b.m16428e() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC8947b.f42957f.booleanValue()) {
            this.f31237q = false;
        }
        h0Var.sendMessage(h0Var.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m12513a() {
        synchronized (f31221t) {
            try {
                C6500e c6500e = f31222v;
                if (c6500e != null) {
                    c6500e.f31231j.incrementAndGet();
                    h0 h0Var = c6500e.f31236p;
                    h0Var.sendMessageAtFrontOfQueue(h0Var.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static Status m12514e(C6496a c6496a, C5902b c5902b) {
        return new Status(17, AbstractC0030c.m121l("API: ", (String) c6496a.f31204b.f5580c, " is not available on this device. Connection failed with: ", String.valueOf(c5902b)), c5902b.f28737c, c5902b);
    }

    /* renamed from: g */
    public static C6500e m12515g(Context context) {
        C6500e c6500e;
        HandlerThread handlerThread;
        synchronized (f31221t) {
            if (f31222v == null) {
                synchronized (k0.f32456g) {
                    try {
                        handlerThread = k0.f32458i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            k0.f32458i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = k0.f32458i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = C5905e.f28745c;
                f31222v = new C6500e(applicationContext, looper);
            }
            c6500e = f31222v;
        }
        return c6500e;
    }

    /* renamed from: b */
    public final void m12516b(DialogInterfaceOnCancelListenerC6508m dialogInterfaceOnCancelListenerC6508m) {
        synchronized (f31221t) {
            try {
                if (this.f31233l != dialogInterfaceOnCancelListenerC6508m) {
                    this.f31233l = dialogInterfaceOnCancelListenerC6508m;
                    this.f31234m.clear();
                }
                this.f31234m.addAll(dialogInterfaceOnCancelListenerC6508m.f31250f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final boolean m12517c() {
        if (this.f31224b) {
            return false;
        }
        C6827m c6827m = (C6827m) C6826l.m13020b().f32467a;
        if (c6827m != null && !c6827m.f32470b) {
            return false;
        }
        int i10 = ((SparseIntArray) this.f31229g.f5668b).get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    /* renamed from: d */
    public final boolean m12518d(C5902b c5902b, int i10) throws Resources.NotFoundException {
        C5905e c5905e = this.f31228f;
        c5905e.getClass();
        Context context = this.f31227e;
        if (!AbstractC0656a.m1907p(context)) {
            int i11 = c5902b.f28736b;
            PendingIntent activity = c5902b.f28737c;
            if (!((i11 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentM11515b = c5905e.m11515b(i11, context, null);
                if (intentM11515b != null) {
                    activity = PendingIntent.getActivity(context, 0, intentM11515b, 201326592);
                }
            }
            if (activity != null) {
                int i12 = GoogleApiActivity.f5998b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                c5905e.m11512g(context, i11, PendingIntent.getActivity(context, 0, intent, AbstractC3765d.f19645a | 134217728));
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final C6511p m12519f(AbstractC6206e abstractC6206e) {
        C6496a c6496a = abstractC6206e.f30191e;
        ConcurrentHashMap concurrentHashMap = this.f31232k;
        C6511p c6511p = (C6511p) concurrentHashMap.get(c6496a);
        if (c6511p == null) {
            c6511p = new C6511p(this, abstractC6206e);
            concurrentHashMap.put(c6496a, c6511p);
        }
        if (c6511p.f31256f.mo12221m()) {
            this.f31235n.add(c6496a);
        }
        c6511p.m12538m();
        return c6511p;
    }

    /* renamed from: h */
    public final void m12520h(C5902b c5902b, int i10) {
        if (m12518d(c5902b, i10)) {
            return;
        }
        h0 h0Var = this.f31236p;
        h0Var.sendMessage(h0Var.obtainMessage(5, i10, 0, c5902b));
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x02dc  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.C6500e.handleMessage(android.os.Message):boolean");
    }
}
