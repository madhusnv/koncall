package p001o;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.C1896a;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettingsLoader;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import p001o.ab2;
import p001o.d9i;
import p001o.fb2;
import p001o.g32;
import p001o.m92;
import p001o.q92;
import p001o.sse;

/* loaded from: classes2.dex */
public final class eb2 {

    /* renamed from: o */
    public static final Object f21267o = new Object();

    /* renamed from: p */
    public static final SparseArray f21268p = new SparseArray();

    /* renamed from: a */
    public final la2 f21269a;

    /* renamed from: b */
    public final Object f21270b;

    /* renamed from: c */
    public final fb2 f21271c;

    /* renamed from: d */
    public final Executor f21272d;

    /* renamed from: e */
    public final Handler f21273e;

    /* renamed from: f */
    public final HandlerThread f21274f;

    /* renamed from: g */
    public q92 f21275g;

    /* renamed from: h */
    public m92 f21276h;

    /* renamed from: i */
    public d9i f21277i;

    /* renamed from: j */
    public final sse f21278j;

    /* renamed from: k */
    public final zfa f21279k;

    /* renamed from: l */
    public EnumC13139a f21280l;

    /* renamed from: m */
    public zfa f21281m;

    /* renamed from: n */
    public final Integer f21282n;

    /* renamed from: o.eb2$a */
    public enum EnumC13139a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public eb2(Context context, fb2.InterfaceC13380b interfaceC13380b) {
        this(context, interfaceC13380b, new QuirkSettingsLoader());
    }

    /* renamed from: g */
    public static fb2.InterfaceC13380b m24672g(Context context) {
        ComponentCallbacks2 componentCallbacks2M33288b = j64.m33288b(context);
        if (componentCallbacks2M33288b instanceof fb2.InterfaceC13380b) {
            return (fb2.InterfaceC13380b) componentCallbacks2M33288b;
        }
        try {
            Context contextM33287a = j64.m33287a(context);
            Bundle bundle = contextM33287a.getPackageManager().getServiceInfo(new ComponentName(contextM33287a, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (fb2.InterfaceC13380b) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            wja.m54629c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            wja.m54630d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    /* renamed from: j */
    public static void m24673j(Integer num) {
        synchronized (f21267o) {
            if (num == null) {
                return;
            }
            fgd.m26659c(num.intValue(), 3, 6, "minLogLevel");
            SparseArray sparseArray = f21268p;
            sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
            m24677r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m24674m(Executor executor, long j, int i, Context context, g32.C13614a c13614a) {
        m24684k(executor, j, i + 1, context, c13614a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m24675n(Context context, final Executor executor, final int i, final g32.C13614a c13614a, final long j) {
        q92.InterfaceC16325a interfaceC16325aM26356Y;
        vsh.m53384a("CX:initAndRetryRecursively");
        final Context contextM33287a = j64.m33287a(context);
        try {
            try {
                interfaceC16325aM26356Y = this.f21271c.m26356Y(null);
            } finally {
                vsh.m53385b();
            }
        } catch (RuntimeException | ab2.C12130b | li8 e) {
            ia2 ia2Var = new ia2(j, i, e);
            sse.C16912c c16912cMo33437e = this.f21278j.mo33437e(ia2Var);
            m24687q(ia2Var);
            if (!c16912cMo33437e.m48887d() || i >= Integer.MAX_VALUE) {
                synchronized (this.f21270b) {
                    this.f21280l = EnumC13139a.INITIALIZING_ERROR;
                }
                if (c16912cMo33437e.m48886c()) {
                    m24686p();
                    c13614a.m28005c(null);
                } else if (e instanceof ab2.C12130b) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((ab2.C12130b) e).m16805a();
                    wja.m54630d("CameraX", str, e);
                    c13614a.m28008f(new li8(new va2(3, str)));
                } else if (e instanceof li8) {
                    c13614a.m28008f(e);
                } else {
                    c13614a.m28008f(new li8(e));
                }
            } else {
                wja.m54639m("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                lw7.m37995b(this.f21273e, new Runnable() { // from class: o.db2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19503a.m24674m(executor, j, i, contextM33287a, c13614a);
                    }
                }, "retry_token", c16912cMo33437e.m48885b());
            }
        }
        if (interfaceC16325aM26356Y == null) {
            throw new li8(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        }
        ua2 ua2VarM51271a = ua2.m51271a(this.f21272d, this.f21273e);
        oa2 oa2VarM26354W = this.f21271c.m26354W(null);
        this.f21275g = interfaceC16325aM26356Y.mo45031a(contextM33287a, ua2VarM51271a, oa2VarM26354W, this.f21271c.m26357Z());
        m92.InterfaceC15254a interfaceC15254aB0 = this.f21271c.b0(null);
        if (interfaceC15254aB0 == null) {
            throw new li8(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
        }
        this.f21276h = interfaceC15254aB0.mo38581a(contextM33287a, this.f21275g.mo42954c(), this.f21275g.mo42953b());
        d9i.InterfaceC12849c interfaceC12849cE0 = this.f21271c.e0(null);
        if (interfaceC12849cE0 == null) {
            throw new li8(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
        }
        this.f21277i = interfaceC12849cE0.mo16535a(contextM33287a);
        if (executor instanceof p92) {
            ((p92) executor).m43213c(this.f21275g);
        }
        this.f21269a.m36830b(this.f21275g);
        ab2.m16803a(contextM33287a, this.f21269a, oa2VarM26354W);
        if (i > 1) {
            m24687q(null);
        }
        m24686p();
        c13614a.m28005c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m24676o(Context context, g32.C13614a c13614a) {
        m24684k(this.f21272d, SystemClock.elapsedRealtime(), 1, context, c13614a);
        return "CameraX initInternal";
    }

    /* renamed from: r */
    public static void m24677r() {
        SparseArray sparseArray = f21268p;
        if (sparseArray.size() == 0) {
            wja.m54635i();
            return;
        }
        if (sparseArray.get(3) != null) {
            wja.m54636j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            wja.m54636j(4);
        } else if (sparseArray.get(5) != null) {
            wja.m54636j(5);
        } else if (sparseArray.get(6) != null) {
            wja.m54636j(6);
        }
    }

    /* renamed from: s */
    public static void m24678s(Context context, C1896a c1896a, zl7 zl7Var) {
        if (c1896a != null) {
            wja.m54627a("CameraX", "QuirkSettings from CameraXConfig: " + c1896a);
        } else {
            c1896a = (C1896a) zl7Var.apply(context);
            wja.m54627a("CameraX", "QuirkSettings from app metadata: " + c1896a);
        }
        if (c1896a == null) {
            c1896a = k5e.f31494b;
            wja.m54627a("CameraX", "QuirkSettings by default: " + c1896a);
        }
        k5e.m35009b().m35012d(c1896a);
    }

    /* renamed from: d */
    public m92 m24679d() {
        m92 m92Var = this.f21276h;
        if (m92Var != null) {
            return m92Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: e */
    public q92 m24680e() {
        q92 q92Var = this.f21275g;
        if (q92Var != null) {
            return q92Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: f */
    public la2 m24681f() {
        return this.f21269a;
    }

    /* renamed from: h */
    public d9i m24682h() {
        d9i d9iVar = this.f21277i;
        if (d9iVar != null) {
            return d9iVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: i */
    public zfa m24683i() {
        return this.f21279k;
    }

    /* renamed from: k */
    public final void m24684k(final Executor executor, final long j, final int i, final Context context, final g32.C13614a c13614a) {
        executor.execute(new Runnable() { // from class: o.cb2
            @Override // java.lang.Runnable
            public final void run() {
                this.f17664a.m24675n(context, executor, i, c13614a, j);
            }
        });
    }

    /* renamed from: l */
    public final zfa m24685l(final Context context) {
        zfa zfaVarM28002a;
        synchronized (this.f21270b) {
            fgd.m26666j(this.f21280l == EnumC13139a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f21280l = EnumC13139a.INITIALIZING;
            zfaVarM28002a = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.bb2
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f15844a.m24676o(context, c13614a);
                }
            });
        }
        return zfaVarM28002a;
    }

    /* renamed from: p */
    public final void m24686p() {
        synchronized (this.f21270b) {
            this.f21280l = EnumC13139a.INITIALIZED;
        }
    }

    /* renamed from: q */
    public final void m24687q(sse.InterfaceC16911b interfaceC16911b) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (vsh.m53387d()) {
            vsh.m53389f("CX:CameraProvider-RetryStatus", interfaceC16911b != null ? interfaceC16911b.getStatus() : -1);
        }
    }

    public eb2(Context context, fb2.InterfaceC13380b interfaceC13380b, zl7 zl7Var) {
        this.f21269a = new la2();
        this.f21270b = new Object();
        this.f21280l = EnumC13139a.UNINITIALIZED;
        this.f21281m = bn7.m19430p(null);
        if (interfaceC13380b != null) {
            this.f21271c = interfaceC13380b.getCameraXConfig();
        } else {
            fb2.InterfaceC13380b interfaceC13380bM24672g = m24672g(context);
            if (interfaceC13380bM24672g == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f21271c = interfaceC13380bM24672g.getCameraXConfig();
        }
        m24678s(context, this.f21271c.c0(), zl7Var);
        Executor executorM26355X = this.f21271c.m26355X(null);
        Handler handlerD0 = this.f21271c.d0(null);
        this.f21272d = executorM26355X == null ? new p92() : executorM26355X;
        if (handlerD0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f21274f = handlerThread;
            handlerThread.start();
            this.f21273e = lw7.m37994a(handlerThread.getLooper());
        } else {
            this.f21274f = null;
            this.f21273e = handlerD0;
        }
        Integer num = (Integer) this.f21271c.mo36958d(fb2.f23071N, null);
        this.f21282n = num;
        m24673j(num);
        this.f21278j = new sse.C16910a(this.f21271c.a0()).m48883a();
        this.f21279k = m24685l(context);
    }
}
