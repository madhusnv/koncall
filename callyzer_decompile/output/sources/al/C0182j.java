package al;

import a1.C0005d;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b00.a0;
import c9.C0922q;
import cj.C0979e;
import com.google.firebase.messaging.FirebaseMessaging;
import id.AbstractC3243m;
import id.C3238h;
import id.C3239i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import jd.C3751a;
import ji.C3773g;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;
import nj.InterfaceC5077c;
import nx.AbstractC5178p;
import og.qe;
import p020v.RunnableC7606p;
import pg.i8;
import pg.l6;
import pg.w9;
import qi.C6229l;
import rw.AbstractC6663m;
import rw.C6661k;
import sf.AbstractC6840z;
import t8.C7059e;
import t8.C7064j;
import t8.C7077w;
import t8.C7079y;
import t8.EnumC7055a;
import t8.c0;
import t8.e0;
import ug.d1;
import w3.C7892j;
import xi.C8386d;
import yi.C8676e;
import z1.C8849i;
import zd.C8937a;
import zd.C8939c;
import zd.C8940d;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.j */
/* loaded from: classes.dex */
public final class C0182j {

    /* renamed from: a */
    public boolean f554a;

    /* renamed from: b */
    public Object f555b;

    /* renamed from: c */
    public Object f556c;

    /* renamed from: d */
    public Object f557d;

    public C0182j(int i10, boolean z6) {
        switch (i10) {
            case 3:
                this.f555b = new Object();
                this.f556c = new ArrayList();
                this.f557d = new ArrayList();
                this.f554a = true;
                break;
            default:
                this.f555b = new Object();
                this.f556c = new ArrayDeque();
                this.f557d = new AtomicReference();
                break;
        }
    }

    /* renamed from: a */
    public void m410a(String tag) {
        AbstractC4154l.m8923f(tag, "tag");
        ((Set) this.f557d).add(tag);
    }

    /* renamed from: b */
    public C7079y m411b() {
        if (this.f554a && ((C0922q) this.f556c).f5631j.f34132d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        C7079y c7079y = new C7079y((UUID) this.f555b, (C0922q) this.f556c, (Set) this.f557d);
        C7059e c7059e = ((C0922q) this.f556c).f5631j;
        boolean z6 = c7059e.m13352b() || c7059e.f34133e || c7059e.f34131c || c7059e.f34132d;
        C0922q c0922q = (C0922q) this.f556c;
        if (c0922q.f5638q) {
            if (z6) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (c0922q.f5628g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if (c0922q.f5645x == null) {
            List listM10112W = AbstractC5178p.m10112W(c0922q.f5624c, new String[]{"."}, 6);
            String strF0 = listM10112W.size() == 1 ? (String) listM10112W.get(0) : (String) AbstractC6663m.m12750N(listM10112W);
            if (strF0.length() > 127) {
                strF0 = AbstractC5178p.f0(127, strF0);
            }
            c0922q.f5645x = strF0;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC4154l.m8922e(uuidRandomUUID, "randomUUID()");
        this.f555b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        AbstractC4154l.m8922e(string, "id.toString()");
        C0922q other = (C0922q) this.f556c;
        AbstractC4154l.m8923f(other, "other");
        this.f556c = new C0922q(string, other.f5623b, other.f5624c, other.f5625d, new C7064j(other.f5626e), new C7064j(other.f5627f), other.f5628g, other.f5629h, other.f5630i, new C7059e(other.f5631j), other.f5632k, other.f5633l, other.f5634m, other.f5635n, other.f5636o, other.f5637p, other.f5638q, other.f5639r, other.f5640s, other.f5642u, other.f5643v, other.f5644w, other.f5645x, 524288);
        return c7079y;
    }

    /* renamed from: c */
    public void m412c(boolean z6) {
        C8940d c8940d = (C8940d) this.f557d;
        synchronized (c8940d) {
            try {
                if (this.f554a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC4154l.m8918a(((C8937a) this.f555b).f42919g, this)) {
                    C8940d.m16411h(c8940d, this, z6);
                }
                this.f554a = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m413d() {
        while (m419j() != null) {
        }
    }

    /* renamed from: e */
    public a0 m414e(int i10) {
        a0 a0Var;
        C8940d c8940d = (C8940d) this.f557d;
        synchronized (c8940d) {
            if (this.f554a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f556c)[i10] = true;
            Object obj = ((C8937a) this.f555b).f42916d.get(i10);
            C8939c c8939c = c8940d.f42942r;
            a0 a0Var2 = (a0) obj;
            if (!c8939c.m1623z(a0Var2)) {
                AbstractC4066g.m8840a(c8939c.mo1603R(a0Var2));
            }
            a0Var = (a0) obj;
        }
        return a0Var;
    }

    /* renamed from: f */
    public String m415f() {
        return ((C3238h) this.f555b).f17406b.toString();
    }

    /* renamed from: g */
    public synchronized void m416g() {
        try {
            if (this.f554a) {
                return;
            }
            Boolean boolM422m = m422m();
            this.f556c = boolM422m;
            if (boolM422m == null) {
                C7892j c7892j = new C7892j(6);
                C6229l c6229l = (C6229l) ((InterfaceC5077c) this.f555b);
                c6229l.m12248a(c6229l.f30243c, c7892j);
            }
            this.f554a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: h */
    public synchronized boolean m417h() {
        Boolean bool;
        try {
            m416g();
            bool = (Boolean) this.f556c;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f557d).f7161a.m8297g();
    }

    /* renamed from: i */
    public C0182j m418i() {
        C0182j c0182j = (C0182j) this.f557d;
        if (c0182j != null) {
            c0182j.m413d();
        }
        AbstractC3243m abstractC3243mM419j = m419j();
        while (abstractC3243mM419j != null && !(abstractC3243mM419j instanceof C3238h)) {
            abstractC3243mM419j = m419j();
        }
        C3238h c3238h = abstractC3243mM419j instanceof C3238h ? (C3238h) abstractC3243mM419j : null;
        C0182j c0182jM11758b = c3238h != null ? l6.m11758b(c3238h, (C0005d) this.f556c) : null;
        this.f557d = c0182jM11758b;
        return c0182jM11758b;
    }

    /* renamed from: j */
    public AbstractC3243m m419j() {
        C0005d c0005d = (C0005d) this.f556c;
        if (this.f554a) {
            return null;
        }
        C8849i c8849i = (C8849i) c0005d.f24b;
        C6661k c6661k = (C6661k) c0005d.f25c;
        while (1 > c6661k.f31941c && !((i8) c8849i.f42584c).equals(C3751a.f19610c)) {
            AbstractC3243m abstractC3243mM16325x = c8849i.m16325x();
            AbstractC4154l.m8920c(abstractC3243mM16325x);
            c6661k.addLast(abstractC3243mM16325x);
        }
        AbstractC3243m abstractC3243m = (AbstractC3243m) (c6661k.mo10411b() > 0 ? c6661k.get(0) : null);
        C3238h c3238h = (C3238h) this.f555b;
        if (abstractC3243m != null && (abstractC3243m instanceof C3239i)) {
            C3239i c3239i = (C3239i) abstractC3243m;
            if (c3239i.f17409a == c3238h.f17405a && c3239i.f17410b.equals(c3238h.f17406b)) {
                c0005d.m40G();
                this.f554a = true;
                return null;
            }
        }
        return c0005d.m40G();
    }

    /* renamed from: k */
    public boolean m420k(int[] tableIds) {
        AbstractC4154l.m8923f(tableIds, "tableIds");
        ReentrantLock reentrantLock = (ReentrantLock) this.f555b;
        reentrantLock.lock();
        try {
            boolean z6 = false;
            for (int i10 : tableIds) {
                long[] jArr = (long[]) this.f556c;
                long j6 = jArr[i10];
                jArr[i10] = 1 + j6;
                if (j6 == 0) {
                    z6 = true;
                    this.f554a = true;
                }
            }
            return z6;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: l */
    public boolean m421l(int[] tableIds) {
        AbstractC4154l.m8923f(tableIds, "tableIds");
        ReentrantLock reentrantLock = (ReentrantLock) this.f555b;
        reentrantLock.lock();
        try {
            boolean z6 = false;
            for (int i10 : tableIds) {
                long[] jArr = (long[]) this.f556c;
                long j6 = jArr[i10];
                jArr[i10] = j6 - 1;
                if (j6 == 1) {
                    z6 = true;
                    this.f554a = true;
                }
            }
            return z6;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public Boolean m422m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C3773g c3773g = ((FirebaseMessaging) this.f557d).f7161a;
        c3773g.m8293a();
        Context context = c3773g.f19662a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public void m423n(EnumC7055a backoffPolicy) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC4154l.m8923f(backoffPolicy, "backoffPolicy");
        AbstractC4154l.m8923f(timeUnit, "timeUnit");
        this.f554a = true;
        C0922q c0922q = (C0922q) this.f556c;
        c0922q.f5633l = backoffPolicy;
        long millis = timeUnit.toMillis(10000L);
        if (millis > 18000000) {
            C7077w.m13371a().getClass();
        }
        if (millis < 10000) {
            C7077w.m13371a().getClass();
        }
        c0922q.f5634m = w9.m11913d(millis, 10000L, 18000000L);
    }

    /* renamed from: o */
    public void m424o(long j6, TimeUnit timeUnit) {
        AbstractC4154l.m8923f(timeUnit, "timeUnit");
        ((C0922q) this.f556c).f5628g = timeUnit.toMillis(j6);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((C0922q) this.f556c).f5628g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    /* renamed from: p */
    public void m425p(C7064j inputData) {
        AbstractC4154l.m8923f(inputData, "inputData");
        ((C0922q) this.f556c).f5626e = inputData;
    }

    /* renamed from: q */
    public boolean m426q(String str, String str2) {
        synchronized (this) {
            try {
                if (!((C8676e) ((AtomicMarkableReference) this.f555b).getReference()).m16011b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f555b;
                atomicMarkableReference.set((C8676e) atomicMarkableReference.getReference(), true);
                RunnableC7606p runnableC7606p = new RunnableC7606p(11, this);
                AtomicReference atomicReference = (AtomicReference) this.f557d;
                while (!atomicReference.compareAndSet(null, runnableC7606p)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((C8386d) ((C0979e) this.f556c).f5804c).f40064b.m15551a(runnableC7606p);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public void m427r(Runnable runnable, Executor executor) {
        synchronized (this.f555b) {
            try {
                if (this.f554a) {
                    ((ArrayDeque) this.f556c).add(new C0190r(runnable, executor));
                } else {
                    this.f554a = true;
                    m431v(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s */
    public String m428s() {
        if (!this.f554a) {
            this.f554a = true;
            d1 d1Var = (d1) this.f557d;
            this.f556c = d1Var.m13861Q().getString((String) this.f555b, null);
        }
        return (String) this.f556c;
    }

    /* renamed from: t */
    public void m429t(String str) {
        SharedPreferences.Editor editorEdit = ((d1) this.f557d).m13861Q().edit();
        editorEdit.putString((String) this.f555b, str);
        editorEdit.apply();
        this.f556c = str;
    }

    /* renamed from: u */
    public void m430u() {
        synchronized (this.f555b) {
            try {
                if (((ArrayDeque) this.f556c).isEmpty()) {
                    this.f554a = false;
                    return;
                }
                C0190r c0190r = (C0190r) ((ArrayDeque) this.f556c).remove();
                m431v(c0190r.f574b, c0190r.f573a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: v */
    public void m431v(Runnable runnable, Executor executor) {
        try {
            executor.execute(new RunnableC8956c(2, this, runnable));
        } catch (RejectedExecutionException unused) {
            m430u();
        }
    }

    public C0182j(d1 d1Var, String str) {
        this.f557d = d1Var;
        AbstractC6840z.m13033d(str);
        this.f555b = str;
    }

    public C0182j(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC4154l.m8922e(uuidRandomUUID, "randomUUID()");
        this.f555b = uuidRandomUUID;
        String string = ((UUID) this.f555b).toString();
        AbstractC4154l.m8922e(string, "id.toString()");
        this.f556c = new C0922q(string, (e0) null, cls.getName(), (String) null, (C7064j) null, (C7064j) null, 0L, 0L, 0L, (C7059e) null, 0, (EnumC7055a) null, 0L, 0L, 0L, 0L, false, (c0) null, 0, 0L, 0, 0, (String) null, 16777210);
        this.f557d = qe.m10857c(cls.getName());
    }

    public C0182j(C0979e c0979e, boolean z6) {
        this.f556c = c0979e;
        this.f557d = new AtomicReference(null);
        this.f554a = z6;
        this.f555b = new AtomicMarkableReference(new C8676e(z6 ? 8192 : 1024), false);
    }

    public C0182j(C8940d c8940d, C8937a c8937a) {
        this.f557d = c8940d;
        this.f555b = c8937a;
        this.f556c = new boolean[2];
    }
}
