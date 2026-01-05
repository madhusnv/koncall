package p001o;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p001o.fz5;
import p001o.mz5;
import p001o.pm6;
import p001o.sga;

/* loaded from: classes2.dex */
public class pd5 implements fz5 {

    /* renamed from: a */
    public final List f39864a;

    /* renamed from: b */
    public final pm6 f39865b;

    /* renamed from: c */
    public final InterfaceC16066a f39866c;

    /* renamed from: d */
    public final InterfaceC16067b f39867d;

    /* renamed from: e */
    public final int f39868e;

    /* renamed from: f */
    public final boolean f39869f;

    /* renamed from: g */
    public final boolean f39870g;

    /* renamed from: h */
    public final HashMap f39871h;

    /* renamed from: i */
    public final h74 f39872i;

    /* renamed from: j */
    public final sga f39873j;

    /* renamed from: k */
    public final jbd f39874k;

    /* renamed from: l */
    public final n2b f39875l;

    /* renamed from: m */
    public final UUID f39876m;

    /* renamed from: n */
    public final Looper f39877n;

    /* renamed from: o */
    public final HandlerC16070e f39878o;

    /* renamed from: p */
    public int f39879p;

    /* renamed from: q */
    public int f39880q;

    /* renamed from: r */
    public HandlerThread f39881r;

    /* renamed from: s */
    public HandlerC16068c f39882s;

    /* renamed from: t */
    public vc4 f39883t;

    /* renamed from: u */
    public fz5.C13592a f39884u;

    /* renamed from: v */
    public byte[] f39885v;

    /* renamed from: w */
    public byte[] f39886w;

    /* renamed from: x */
    public pm6.C16138a f39887x;

    /* renamed from: y */
    public pm6.C16141d f39888y;

    /* renamed from: o.pd5$a */
    public interface InterfaceC16066a {
        /* renamed from: a */
        void mo43446a(Exception exc, boolean z);

        /* renamed from: b */
        void mo43447b(pd5 pd5Var);

        /* renamed from: c */
        void mo43448c();
    }

    /* renamed from: o.pd5$b */
    public interface InterfaceC16067b {
        /* renamed from: a */
        void mo43449a(pd5 pd5Var, int i);

        /* renamed from: b */
        void mo43450b(pd5 pd5Var, int i);
    }

    /* renamed from: o.pd5$c */
    public class HandlerC16068c extends Handler {

        /* renamed from: a */
        public boolean f39889a;

        public HandlerC16068c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final boolean m43451a(Message message, o2b o2bVar) {
            C16069d c16069d = (C16069d) message.obj;
            if (!c16069d.f39892b) {
                return false;
            }
            int i = c16069d.f39895e + 1;
            c16069d.f39895e = i;
            if (i > pd5.this.f39873j.mo48310a(3)) {
                return false;
            }
            long jMo48313d = pd5.this.f39873j.mo48313d(new sga.C16838c(new tga(c16069d.f39891a, o2bVar.f37550a, o2bVar.f37551b, o2bVar.f37552c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c16069d.f39893c, o2bVar.f37553d), new u2b(3), o2bVar.getCause() instanceof IOException ? (IOException) o2bVar.getCause() : new C16071f(o2bVar.getCause()), c16069d.f39895e));
            if (jMo48313d == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f39889a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jMo48313d);
                return true;
            }
        }

        /* renamed from: b */
        public void m43452b(int i, Object obj, boolean z) {
            obtainMessage(i, new C16069d(tga.m49830a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* renamed from: c */
        public synchronized void m43453c() {
            removeCallbacksAndMessages(null);
            this.f39889a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable thMo40022b;
            C16069d c16069d = (C16069d) message.obj;
            try {
                int i = message.what;
                if (i == 1) {
                    thMo40022b = pd5.this.f39875l.mo40022b(pd5.this.f39876m, (pm6.C16141d) c16069d.f39894d);
                } else {
                    if (i != 2) {
                        throw new RuntimeException();
                    }
                    thMo40022b = pd5.this.f39875l.mo40021a(pd5.this.f39876m, (pm6.C16138a) c16069d.f39894d);
                }
            } catch (o2b e) {
                boolean zM43451a = m43451a(message, e);
                thMo40022b = e;
                if (zM43451a) {
                    return;
                }
            } catch (Exception e2) {
                ria.m46825i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                thMo40022b = e2;
            }
            pd5.this.f39873j.m48312c(c16069d.f39891a);
            synchronized (this) {
                if (!this.f39889a) {
                    pd5.this.f39878o.obtainMessage(message.what, Pair.create(c16069d.f39894d, thMo40022b)).sendToTarget();
                }
            }
        }
    }

    /* renamed from: o.pd5$d */
    public static final class C16069d {

        /* renamed from: a */
        public final long f39891a;

        /* renamed from: b */
        public final boolean f39892b;

        /* renamed from: c */
        public final long f39893c;

        /* renamed from: d */
        public final Object f39894d;

        /* renamed from: e */
        public int f39895e;

        public C16069d(long j, boolean z, long j2, Object obj) {
            this.f39891a = j;
            this.f39892b = z;
            this.f39893c = j2;
            this.f39894d = obj;
        }
    }

    /* renamed from: o.pd5$e */
    public class HandlerC16070e extends Handler {
        public HandlerC16070e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 1) {
                pd5.this.m43433F(obj, obj2);
            } else {
                if (i != 2) {
                    return;
                }
                pd5.this.m43445z(obj, obj2);
            }
        }
    }

    /* renamed from: o.pd5$f */
    public static final class C16071f extends IOException {
        public C16071f(Throwable th) {
            super(th);
        }
    }

    public pd5(UUID uuid, pm6 pm6Var, InterfaceC16066a interfaceC16066a, InterfaceC16067b interfaceC16067b, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap map, n2b n2bVar, Looper looper, sga sgaVar, jbd jbdVar) {
        if (i == 1 || i == 3) {
            op0.m42515e(bArr);
        }
        this.f39876m = uuid;
        this.f39866c = interfaceC16066a;
        this.f39867d = interfaceC16067b;
        this.f39865b = pm6Var;
        this.f39868e = i;
        this.f39869f = z;
        this.f39870g = z2;
        if (bArr != null) {
            this.f39886w = bArr;
            this.f39864a = null;
        } else {
            this.f39864a = Collections.unmodifiableList((List) op0.m42515e(list));
        }
        this.f39871h = map;
        this.f39875l = n2bVar;
        this.f39872i = new h74();
        this.f39873j = sgaVar;
        this.f39874k = jbdVar;
        this.f39879p = 2;
        this.f39877n = looper;
        this.f39878o = new HandlerC16070e(looper);
    }

    /* renamed from: w */
    public static /* synthetic */ void m43426w(Throwable th, mz5.C15451a c15451a) {
        c15451a.m39907l((Exception) th);
    }

    /* renamed from: A */
    public final void m43428A(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || qz5.m45987b(th)) {
            this.f39866c.mo43447b(this);
        } else {
            m43444y(th, z ? 1 : 2);
        }
    }

    /* renamed from: B */
    public final void m43429B() {
        if (this.f39868e == 0 && this.f39879p == 4) {
            sqi.m48729h(this.f39885v);
            m43440s(false);
        }
    }

    /* renamed from: C */
    public void m43430C(int i) {
        if (i != 2) {
            return;
        }
        m43429B();
    }

    /* renamed from: D */
    public void m43431D() {
        if (m43434G()) {
            m43440s(true);
        }
    }

    /* renamed from: E */
    public void m43432E(Exception exc, boolean z) {
        m43444y(exc, z ? 1 : 3);
    }

    /* renamed from: F */
    public final void m43433F(Object obj, Object obj2) {
        if (obj == this.f39888y) {
            if (this.f39879p == 2 || m43443v()) {
                this.f39888y = null;
                if (obj2 instanceof Exception) {
                    this.f39866c.mo43446a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f39865b.mo29738f((byte[]) obj2);
                    this.f39866c.mo43448c();
                } catch (Exception e) {
                    this.f39866c.mo43446a(e, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m43434G() {
        if (m43443v()) {
            return true;
        }
        try {
            byte[] bArrMo29736d = this.f39865b.mo29736d();
            this.f39885v = bArrMo29736d;
            this.f39865b.mo30695i(bArrMo29736d, this.f39874k);
            this.f39883t = this.f39865b.mo29740h(this.f39885v);
            final int i = 3;
            this.f39879p = 3;
            m43439r(new fu3() { // from class: o.ld5
                @Override // p001o.fu3
                public final void accept(Object obj) {
                    ((mz5.C15451a) obj).m39906k(i);
                }
            });
            op0.m42515e(this.f39885v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f39866c.mo43447b(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (qz5.m45987b(e)) {
                m43444y(e, 1);
                return false;
            }
            this.f39866c.mo43447b(this);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (qz5.m45987b(e)) {
            }
        }
    }

    /* renamed from: H */
    public final void m43435H(byte[] bArr, int i, boolean z) {
        try {
            this.f39887x = this.f39865b.mo29744m(bArr, this.f39864a, i, this.f39871h);
            ((HandlerC16068c) sqi.m48729h(this.f39882s)).m43452b(2, op0.m42515e(this.f39887x), z);
        } catch (Exception | NoSuchMethodError e) {
            m43428A(e, true);
        }
    }

    /* renamed from: I */
    public void m43436I() {
        this.f39888y = this.f39865b.mo29735c();
        ((HandlerC16068c) sqi.m48729h(this.f39882s)).m43452b(1, op0.m42515e(this.f39888y), true);
    }

    /* renamed from: J */
    public final boolean m43437J() {
        try {
            this.f39865b.mo29737e(this.f39885v, this.f39886w);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            m43444y(e, 1);
            return false;
        }
    }

    /* renamed from: K */
    public final void m43438K() {
        if (Thread.currentThread() != this.f39877n.getThread()) {
            ria.m46825i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f39877n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p001o.fz5
    /* renamed from: a */
    public final UUID mo27775a() {
        m43438K();
        return this.f39876m;
    }

    @Override // p001o.fz5
    /* renamed from: b */
    public boolean mo27776b() {
        m43438K();
        return this.f39869f;
    }

    @Override // p001o.fz5
    /* renamed from: c */
    public final fz5.C13592a mo27777c() {
        m43438K();
        if (this.f39879p == 1) {
            return this.f39884u;
        }
        return null;
    }

    @Override // p001o.fz5
    /* renamed from: d */
    public final vc4 mo27778d() {
        m43438K();
        return this.f39883t;
    }

    @Override // p001o.fz5
    /* renamed from: f */
    public void mo27779f(mz5.C15451a c15451a) {
        m43438K();
        if (this.f39880q < 0) {
            ria.m46819c("DefaultDrmSession", "Session reference count less than zero: " + this.f39880q);
            this.f39880q = 0;
        }
        if (c15451a != null) {
            this.f39872i.m29869b(c15451a);
        }
        int i = this.f39880q + 1;
        this.f39880q = i;
        if (i == 1) {
            op0.m42517g(this.f39879p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f39881r = handlerThread;
            handlerThread.start();
            this.f39882s = new HandlerC16068c(this.f39881r.getLooper());
            if (m43434G()) {
                m43440s(true);
            }
        } else if (c15451a != null && m43443v() && this.f39872i.m29870d(c15451a) == 1) {
            c15451a.m39906k(this.f39879p);
        }
        this.f39867d.mo43450b(this, this.f39880q);
    }

    @Override // p001o.fz5
    /* renamed from: g */
    public Map mo27780g() {
        m43438K();
        byte[] bArr = this.f39885v;
        if (bArr == null) {
            return null;
        }
        return this.f39865b.mo29734b(bArr);
    }

    @Override // p001o.fz5
    public final int getState() {
        m43438K();
        return this.f39879p;
    }

    @Override // p001o.fz5
    /* renamed from: h */
    public void mo27781h(mz5.C15451a c15451a) {
        m43438K();
        int i = this.f39880q;
        if (i <= 0) {
            ria.m46819c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f39880q = i2;
        if (i2 == 0) {
            this.f39879p = 0;
            ((HandlerC16070e) sqi.m48729h(this.f39878o)).removeCallbacksAndMessages(null);
            ((HandlerC16068c) sqi.m48729h(this.f39882s)).m43453c();
            this.f39882s = null;
            ((HandlerThread) sqi.m48729h(this.f39881r)).quit();
            this.f39881r = null;
            this.f39883t = null;
            this.f39884u = null;
            this.f39887x = null;
            this.f39888y = null;
            byte[] bArr = this.f39885v;
            if (bArr != null) {
                this.f39865b.mo29742k(bArr);
                this.f39885v = null;
            }
        }
        if (c15451a != null) {
            this.f39872i.m29871e(c15451a);
            if (this.f39872i.m29870d(c15451a) == 0) {
                c15451a.m39908m();
            }
        }
        this.f39867d.mo43449a(this, this.f39880q);
    }

    @Override // p001o.fz5
    /* renamed from: i */
    public boolean mo27782i(String str) {
        m43438K();
        return this.f39865b.mo29741j((byte[]) op0.m42519i(this.f39885v), str);
    }

    /* renamed from: r */
    public final void m43439r(fu3 fu3Var) {
        Iterator it = this.f39872i.D1().iterator();
        while (it.hasNext()) {
            fu3Var.accept((mz5.C15451a) it.next());
        }
    }

    /* renamed from: s */
    public final void m43440s(boolean z) {
        if (this.f39870g) {
            return;
        }
        byte[] bArr = (byte[]) sqi.m48729h(this.f39885v);
        int i = this.f39868e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.f39886w == null || m43437J()) {
                    m43435H(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            op0.m42515e(this.f39886w);
            op0.m42515e(this.f39885v);
            m43435H(this.f39886w, 3, z);
            return;
        }
        if (this.f39886w == null) {
            m43435H(bArr, 1, z);
            return;
        }
        if (this.f39879p == 4 || m43437J()) {
            long jM43441t = m43441t();
            if (this.f39868e != 0 || jM43441t > 60) {
                if (jM43441t <= 0) {
                    m43444y(new wd9(), 2);
                    return;
                } else {
                    this.f39879p = 4;
                    m43439r(new fu3() { // from class: o.md5
                        @Override // p001o.fu3
                        public final void accept(Object obj) {
                            ((mz5.C15451a) obj).m39905j();
                        }
                    });
                    return;
                }
            }
            ria.m46818b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jM43441t);
            m43435H(bArr, 2, z);
        }
    }

    /* renamed from: t */
    public final long m43441t() {
        if (!dr1.f20426d.equals(this.f39876m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) op0.m42515e(n8j.m40252b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: u */
    public boolean m43442u(byte[] bArr) {
        m43438K();
        return Arrays.equals(this.f39885v, bArr);
    }

    /* renamed from: v */
    public final boolean m43443v() {
        int i = this.f39879p;
        return i == 3 || i == 4;
    }

    /* renamed from: y */
    public final void m43444y(final Throwable th, int i) {
        this.f39884u = new fz5.C13592a(th, qz5.m45986a(th, i));
        ria.m46820d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            m43439r(new fu3() { // from class: o.kd5
                @Override // p001o.fu3
                public final void accept(Object obj) {
                    pd5.m43426w(th, (mz5.C15451a) obj);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!qz5.m45988c(th) && !qz5.m45987b(th)) {
                throw ((Error) th);
            }
        }
        if (this.f39879p != 4) {
            this.f39879p = 1;
        }
    }

    /* renamed from: z */
    public final void m43445z(Object obj, Object obj2) {
        if (obj == this.f39887x && m43443v()) {
            this.f39887x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                m43428A((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f39868e == 3) {
                    this.f39865b.mo29743l((byte[]) sqi.m48729h(this.f39886w), bArr);
                    m43439r(new fu3() { // from class: o.nd5
                        @Override // p001o.fu3
                        public final void accept(Object obj3) {
                            ((mz5.C15451a) obj3).m39904i();
                        }
                    });
                    return;
                }
                byte[] bArrMo29743l = this.f39865b.mo29743l(this.f39885v, bArr);
                int i = this.f39868e;
                if ((i == 2 || (i == 0 && this.f39886w != null)) && bArrMo29743l != null && bArrMo29743l.length != 0) {
                    this.f39886w = bArrMo29743l;
                }
                this.f39879p = 4;
                m43439r(new fu3() { // from class: o.od5
                    @Override // p001o.fu3
                    public final void accept(Object obj3) {
                        ((mz5.C15451a) obj3).m39903h();
                    }
                });
            } catch (Exception | NoSuchMethodError e) {
                m43428A(e, true);
            }
        }
    }
}
