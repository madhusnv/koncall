package sf;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import bk.RunnableC0683n;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import jf.C3758a;
import k4.C4001v;
import pf.C5902b;
import pf.C5904d;
import pf.C5906f;
import rf.C6511p;
import xf.C8373h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.e */
/* loaded from: classes.dex */
public abstract class AbstractC6819e {

    /* renamed from: B */
    public static final C5904d[] f32379B = new C5904d[0];

    /* renamed from: b */
    public C3758a f32381b;

    /* renamed from: c */
    public final Context f32382c;

    /* renamed from: d */
    public final k0 f32383d;

    /* renamed from: e */
    public final C5906f f32384e;

    /* renamed from: f */
    public final a0 f32385f;

    /* renamed from: j */
    public C6836v f32388j;

    /* renamed from: k */
    public InterfaceC6818d f32389k;

    /* renamed from: l */
    public IInterface f32390l;

    /* renamed from: n */
    public c0 f32392n;

    /* renamed from: q */
    public final InterfaceC6816b f32394q;

    /* renamed from: r */
    public final InterfaceC6817c f32395r;

    /* renamed from: s */
    public final int f32396s;

    /* renamed from: t */
    public final String f32397t;

    /* renamed from: v */
    public volatile String f32398v;

    /* renamed from: a */
    public volatile String f32380a = null;

    /* renamed from: g */
    public final Object f32386g = new Object();

    /* renamed from: h */
    public final Object f32387h = new Object();

    /* renamed from: m */
    public final ArrayList f32391m = new ArrayList();

    /* renamed from: p */
    public int f32393p = 1;

    /* renamed from: w */
    public C5902b f32399w = null;

    /* renamed from: x */
    public boolean f32400x = false;

    /* renamed from: y */
    public volatile f0 f32401y = null;

    /* renamed from: z */
    public final AtomicInteger f32402z = new AtomicInteger(0);

    public AbstractC6819e(Context context, Looper looper, k0 k0Var, C5906f c5906f, int i10, InterfaceC6816b interfaceC6816b, InterfaceC6817c interfaceC6817c, String str) {
        AbstractC6840z.m13037h(context, "Context must not be null");
        this.f32382c = context;
        AbstractC6840z.m13037h(looper, "Looper must not be null");
        AbstractC6840z.m13037h(k0Var, "Supervisor must not be null");
        this.f32383d = k0Var;
        AbstractC6840z.m13037h(c5906f, "API availability must not be null");
        this.f32384e = c5906f;
        this.f32385f = new a0(this, looper);
        this.f32396s = i10;
        this.f32394q = interfaceC6816b;
        this.f32395r = interfaceC6817c;
        this.f32397t = str;
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m12995y(AbstractC6819e abstractC6819e, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC6819e.f32386g) {
            try {
                if (abstractC6819e.f32393p != i10) {
                    return false;
                }
                abstractC6819e.m13010z(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m12996b(String str) {
        this.f32380a = str;
        m12999e();
    }

    /* renamed from: c */
    public final boolean m12997c() {
        boolean z6;
        synchronized (this.f32386g) {
            int i10 = this.f32393p;
            z6 = true;
            if (i10 != 2 && i10 != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    /* renamed from: d */
    public final void m12998d() {
        if (!m13001g() || this.f32381b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* renamed from: e */
    public final void m12999e() {
        this.f32402z.incrementAndGet();
        synchronized (this.f32391m) {
            try {
                int size = this.f32391m.size();
                for (int i10 = 0; i10 < size; i10++) {
                    AbstractC6834t abstractC6834t = (AbstractC6834t) this.f32391m.get(i10);
                    synchronized (abstractC6834t) {
                        abstractC6834t.f32492a = null;
                    }
                }
                this.f32391m.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f32387h) {
            this.f32388j = null;
        }
        m13010z(1, null);
    }

    /* renamed from: f */
    public final void m13000f(InterfaceC6818d interfaceC6818d) {
        this.f32389k = interfaceC6818d;
        m13010z(2, null);
    }

    /* renamed from: g */
    public final boolean m13001g() {
        boolean z6;
        synchronized (this.f32386g) {
            z6 = this.f32393p == 4;
        }
        return z6;
    }

    /* renamed from: h */
    public final void m13002h(InterfaceC6823i interfaceC6823i, Set set) {
        Bundle bundleMo7591r = mo7591r();
        String str = Build.VERSION.SDK_INT < 31 ? this.f32398v : this.f32398v;
        int i10 = this.f32396s;
        int i11 = C5906f.f28747a;
        Scope[] scopeArr = C6821g.f32414q;
        Bundle bundle = new Bundle();
        C5904d[] c5904dArr = C6821g.f32415r;
        C6821g c6821g = new C6821g(6, i10, i11, null, null, scopeArr, bundle, null, c5904dArr, c5904dArr, true, 0, false, str);
        c6821g.f32419d = this.f32382c.getPackageName();
        c6821g.f32422g = bundleMo7591r;
        if (set != null) {
            c6821g.f32421f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo12221m()) {
            Account accountMo13007p = mo13007p();
            if (accountMo13007p == null) {
                accountMo13007p = new Account("<<default account>>", "com.google");
            }
            c6821g.f32423h = accountMo13007p;
            if (interfaceC6823i != null) {
                c6821g.f32420e = interfaceC6823i.asBinder();
            }
        }
        c6821g.f32424j = f32379B;
        c6821g.f32425k = mo7590q();
        if (mo7595x()) {
            c6821g.f32428n = true;
        }
        try {
            try {
                synchronized (this.f32387h) {
                    try {
                        C6836v c6836v = this.f32388j;
                        if (c6836v != null) {
                            c6836v.m13028d(new b0(this, this.f32402z.get()), c6821g);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i12 = this.f32402z.get();
                d0 d0Var = new d0(this, 8, null, null);
                a0 a0Var = this.f32385f;
                a0Var.sendMessage(a0Var.obtainMessage(1, i12, -1, d0Var));
            }
        } catch (DeadObjectException unused2) {
            int i13 = this.f32402z.get();
            a0 a0Var2 = this.f32385f;
            a0Var2.sendMessage(a0Var2.obtainMessage(6, i13, 3));
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    /* renamed from: i */
    public abstract int mo7588i();

    /* renamed from: j */
    public final void m13003j(C4001v c4001v) {
        ((C6511p) c4001v.f20704b).f31267q.f31236p.post(new RunnableC0683n(13, c4001v));
    }

    /* renamed from: k */
    public final C5904d[] m13004k() {
        f0 f0Var = this.f32401y;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f32411b;
    }

    /* renamed from: l */
    public final String m13005l() {
        return this.f32380a;
    }

    /* renamed from: m */
    public boolean mo12221m() {
        return false;
    }

    /* renamed from: n */
    public final void m13006n() throws PackageManager.NameNotFoundException {
        int iM11516c = this.f32384e.m11516c(this.f32382c, mo7588i());
        if (iM11516c == 0) {
            m13000f(new C6826l(this));
            return;
        }
        m13010z(1, null);
        this.f32389k = new C6826l(this);
        int i10 = this.f32402z.get();
        a0 a0Var = this.f32385f;
        a0Var.sendMessage(a0Var.obtainMessage(3, i10, iM11516c, null));
    }

    /* renamed from: o */
    public abstract IInterface mo7589o(IBinder iBinder);

    /* renamed from: p */
    public Account mo13007p() {
        return null;
    }

    /* renamed from: q */
    public C5904d[] mo7590q() {
        return f32379B;
    }

    /* renamed from: r */
    public Bundle mo7591r() {
        return new Bundle();
    }

    /* renamed from: s */
    public Set mo13008s() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: t */
    public final IInterface m13009t() {
        IInterface iInterface;
        synchronized (this.f32386g) {
            try {
                if (this.f32393p == 5) {
                    throw new DeadObjectException();
                }
                if (!m13001g()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.f32390l;
                AbstractC6840z.m13037h(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    /* renamed from: u */
    public abstract String mo7592u();

    /* renamed from: v */
    public abstract String mo7593v();

    /* renamed from: w */
    public boolean mo7594w() {
        return mo7588i() >= 211700000;
    }

    /* renamed from: x */
    public boolean mo7595x() {
        return this instanceof C8373h;
    }

    /* renamed from: z */
    public final void m13010z(int i10, IInterface iInterface) {
        C3758a c3758a;
        AbstractC6840z.m13031b((i10 == 4) == (iInterface != null));
        synchronized (this.f32386g) {
            try {
                this.f32393p = i10;
                this.f32390l = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    c0 c0Var = this.f32392n;
                    if (c0Var != null) {
                        k0 k0Var = this.f32383d;
                        String str = this.f32381b.f19626b;
                        AbstractC6840z.m13036g(str);
                        this.f32381b.getClass();
                        if (this.f32397t == null) {
                            this.f32382c.getClass();
                        }
                        k0Var.m13019c(str, c0Var, this.f32381b.f19627c);
                        this.f32392n = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    c0 c0Var2 = this.f32392n;
                    if (c0Var2 != null && (c3758a = this.f32381b) != null) {
                        String str2 = c3758a.f19626b;
                        k0 k0Var2 = this.f32383d;
                        AbstractC6840z.m13036g(str2);
                        this.f32381b.getClass();
                        if (this.f32397t == null) {
                            this.f32382c.getClass();
                        }
                        k0Var2.m13019c(str2, c0Var2, this.f32381b.f19627c);
                        this.f32402z.incrementAndGet();
                    }
                    c0 c0Var3 = new c0(this, this.f32402z.get());
                    this.f32392n = c0Var3;
                    String strMo7593v = mo7593v();
                    boolean zMo7594w = mo7594w();
                    this.f32381b = new C3758a(strMo7593v, zMo7594w, 1);
                    if (zMo7594w && mo7588i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f32381b.f19626b)));
                    }
                    k0 k0Var3 = this.f32383d;
                    String str3 = this.f32381b.f19626b;
                    AbstractC6840z.m13036g(str3);
                    this.f32381b.getClass();
                    String name = this.f32397t;
                    if (name == null) {
                        name = this.f32382c.getClass().getName();
                    }
                    C5902b c5902bM13018b = k0Var3.m13018b(new h0(str3, this.f32381b.f19627c), c0Var3, name, null);
                    int i11 = c5902bM13018b.f28736b;
                    if (!(i11 == 0)) {
                        String str4 = this.f32381b.f19626b;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (c5902bM13018b.f28737c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c5902bM13018b.f28737c);
                        }
                        int i12 = this.f32402z.get();
                        e0 e0Var = new e0(this, i11, bundle);
                        a0 a0Var = this.f32385f;
                        a0Var.sendMessage(a0Var.obtainMessage(7, i12, -1, e0Var));
                    }
                } else if (i10 == 4) {
                    AbstractC6840z.m13036g(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
