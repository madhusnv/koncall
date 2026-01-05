package p001o;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import androidx.work.PeriodicWorkRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p001o.fz5;
import p001o.mz5;
import p001o.nz5;
import p001o.pd5;
import p001o.pm6;

/* loaded from: classes2.dex */
public class qd5 implements nz5 {

    /* renamed from: b */
    public final UUID f41640b;

    /* renamed from: c */
    public final pm6.InterfaceC16140c f41641c;

    /* renamed from: d */
    public final n2b f41642d;

    /* renamed from: e */
    public final HashMap f41643e;

    /* renamed from: f */
    public final boolean f41644f;

    /* renamed from: g */
    public final int[] f41645g;

    /* renamed from: h */
    public final boolean f41646h;

    /* renamed from: i */
    public final C16345g f41647i;

    /* renamed from: j */
    public final sga f41648j;

    /* renamed from: k */
    public final C16346h f41649k;

    /* renamed from: l */
    public final long f41650l;

    /* renamed from: m */
    public final List f41651m;

    /* renamed from: n */
    public final Set f41652n;

    /* renamed from: o */
    public final Set f41653o;

    /* renamed from: p */
    public int f41654p;

    /* renamed from: q */
    public pm6 f41655q;

    /* renamed from: r */
    public pd5 f41656r;

    /* renamed from: s */
    public pd5 f41657s;

    /* renamed from: t */
    public Looper f41658t;

    /* renamed from: u */
    public Handler f41659u;

    /* renamed from: v */
    public int f41660v;

    /* renamed from: w */
    public byte[] f41661w;

    /* renamed from: x */
    public jbd f41662x;

    /* renamed from: y */
    public volatile HandlerC16342d f41663y;

    /* renamed from: o.qd5$b */
    public static final class C16340b {

        /* renamed from: d */
        public boolean f41667d;

        /* renamed from: a */
        public final HashMap f41664a = new HashMap();

        /* renamed from: b */
        public UUID f41665b = dr1.f20426d;

        /* renamed from: c */
        public pm6.InterfaceC16140c f41666c = hk7.f27078d;

        /* renamed from: e */
        public int[] f41668e = new int[0];

        /* renamed from: f */
        public boolean f41669f = true;

        /* renamed from: g */
        public sga f41670g = new ue5();

        /* renamed from: h */
        public long f41671h = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;

        /* renamed from: a */
        public qd5 m45139a(n2b n2bVar) {
            return new qd5(this.f41665b, this.f41666c, n2bVar, this.f41664a, this.f41667d, this.f41668e, this.f41669f, this.f41670g, this.f41671h);
        }

        /* renamed from: b */
        public C16340b m45140b(sga sgaVar) {
            this.f41670g = (sga) op0.m42515e(sgaVar);
            return this;
        }

        /* renamed from: c */
        public C16340b m45141c(boolean z) {
            this.f41667d = z;
            return this;
        }

        /* renamed from: d */
        public C16340b m45142d(boolean z) {
            this.f41669f = z;
            return this;
        }

        /* renamed from: e */
        public C16340b m45143e(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                op0.m42511a(z);
            }
            this.f41668e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: f */
        public C16340b m45144f(UUID uuid, pm6.InterfaceC16140c interfaceC16140c) {
            this.f41665b = (UUID) op0.m42515e(uuid);
            this.f41666c = (pm6.InterfaceC16140c) op0.m42515e(interfaceC16140c);
            return this;
        }
    }

    /* renamed from: o.qd5$c */
    public class C16341c implements pm6.InterfaceC16139b {
        public C16341c() {
        }

        @Override // p001o.pm6.InterfaceC16139b
        /* renamed from: a */
        public void mo43871a(pm6 pm6Var, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((HandlerC16342d) op0.m42515e(qd5.this.f41663y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* renamed from: o.qd5$d */
    public class HandlerC16342d extends Handler {
        public HandlerC16342d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (pd5 pd5Var : qd5.this.f41651m) {
                if (pd5Var.m43442u(bArr)) {
                    pd5Var.m43430C(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: o.qd5$e */
    public static final class C16343e extends Exception {
        public C16343e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: o.qd5$f */
    public class C16344f implements nz5.InterfaceC15682b {

        /* renamed from: b */
        public final mz5.C15451a f41674b;

        /* renamed from: c */
        public fz5 f41675c;

        /* renamed from: d */
        public boolean f41676d;

        public C16344f(mz5.C15451a c15451a) {
            this.f41674b = c15451a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m45147f(C2181a c2181a) {
            if (qd5.this.f41654p == 0 || this.f41676d) {
                return;
            }
            qd5 qd5Var = qd5.this;
            this.f41675c = qd5Var.m45134t((Looper) op0.m42515e(qd5Var.f41658t), this.f41674b, c2181a, false);
            qd5.this.f41652n.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m45148g() {
            if (this.f41676d) {
                return;
            }
            fz5 fz5Var = this.f41675c;
            if (fz5Var != null) {
                fz5Var.mo27781h(this.f41674b);
            }
            qd5.this.f41652n.remove(this);
            this.f41676d = true;
        }

        /* renamed from: e */
        public void m45149e(final C2181a c2181a) {
            ((Handler) op0.m42515e(qd5.this.f41659u)).post(new Runnable() { // from class: o.sd5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45236a.m45147f(c2181a);
                }
            });
        }

        @Override // p001o.nz5.InterfaceC15682b
        public void release() {
            sqi.W0((Handler) op0.m42515e(qd5.this.f41659u), new Runnable() { // from class: o.rd5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43395a.m45148g();
                }
            });
        }
    }

    /* renamed from: o.qd5$g */
    public class C16345g implements pd5.InterfaceC16066a {

        /* renamed from: a */
        public final Set f41678a = new HashSet();

        /* renamed from: b */
        public pd5 f41679b;

        public C16345g() {
        }

        @Override // p001o.pd5.InterfaceC16066a
        /* renamed from: a */
        public void mo43446a(Exception exc, boolean z) {
            this.f41679b = null;
            nf8 nf8VarM40511y = nf8.m40511y(this.f41678a);
            this.f41678a.clear();
            q4i it = nf8VarM40511y.iterator();
            while (it.hasNext()) {
                ((pd5) it.next()).m43432E(exc, z);
            }
        }

        @Override // p001o.pd5.InterfaceC16066a
        /* renamed from: b */
        public void mo43447b(pd5 pd5Var) {
            this.f41678a.add(pd5Var);
            if (this.f41679b != null) {
                return;
            }
            this.f41679b = pd5Var;
            pd5Var.m43436I();
        }

        @Override // p001o.pd5.InterfaceC16066a
        /* renamed from: c */
        public void mo43448c() {
            this.f41679b = null;
            nf8 nf8VarM40511y = nf8.m40511y(this.f41678a);
            this.f41678a.clear();
            q4i it = nf8VarM40511y.iterator();
            while (it.hasNext()) {
                ((pd5) it.next()).m43431D();
            }
        }

        /* renamed from: d */
        public void m45150d(pd5 pd5Var) {
            this.f41678a.remove(pd5Var);
            if (this.f41679b == pd5Var) {
                this.f41679b = null;
                if (this.f41678a.isEmpty()) {
                    return;
                }
                pd5 pd5Var2 = (pd5) this.f41678a.iterator().next();
                this.f41679b = pd5Var2;
                pd5Var2.m43436I();
            }
        }
    }

    /* renamed from: o.qd5$h */
    public class C16346h implements pd5.InterfaceC16067b {
        public C16346h() {
        }

        @Override // p001o.pd5.InterfaceC16067b
        /* renamed from: a */
        public void mo43449a(final pd5 pd5Var, int i) {
            if (i == 1 && qd5.this.f41654p > 0 && qd5.this.f41650l != -9223372036854775807L) {
                qd5.this.f41653o.add(pd5Var);
                ((Handler) op0.m42515e(qd5.this.f41659u)).postAtTime(new Runnable() { // from class: o.td5
                    @Override // java.lang.Runnable
                    public final void run() {
                        pd5Var.mo27781h(null);
                    }
                }, pd5Var, SystemClock.uptimeMillis() + qd5.this.f41650l);
            } else if (i == 0) {
                qd5.this.f41651m.remove(pd5Var);
                if (qd5.this.f41656r == pd5Var) {
                    qd5.this.f41656r = null;
                }
                if (qd5.this.f41657s == pd5Var) {
                    qd5.this.f41657s = null;
                }
                qd5.this.f41647i.m45150d(pd5Var);
                if (qd5.this.f41650l != -9223372036854775807L) {
                    ((Handler) op0.m42515e(qd5.this.f41659u)).removeCallbacksAndMessages(pd5Var);
                    qd5.this.f41653o.remove(pd5Var);
                }
            }
            qd5.this.m45128C();
        }

        @Override // p001o.pd5.InterfaceC16067b
        /* renamed from: b */
        public void mo43450b(pd5 pd5Var, int i) {
            if (qd5.this.f41650l != -9223372036854775807L) {
                qd5.this.f41653o.remove(pd5Var);
                ((Handler) op0.m42515e(qd5.this.f41659u)).removeCallbacksAndMessages(pd5Var);
            }
        }
    }

    /* renamed from: u */
    public static boolean m45124u(fz5 fz5Var) {
        if (fz5Var.getState() != 1) {
            return false;
        }
        Throwable cause = ((fz5.C13592a) op0.m42515e(fz5Var.mo27777c())).getCause();
        return (cause instanceof ResourceBusyException) || qz5.m45988c(cause);
    }

    /* renamed from: y */
    public static List m45125y(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f7890d);
        for (int i = 0; i < drmInitData.f7890d; i++) {
            DrmInitData.SchemeData schemeDataM6684e = drmInitData.m6684e(i);
            if ((schemeDataM6684e.m6688d(uuid) || (dr1.f20425c.equals(uuid) && schemeDataM6684e.m6688d(dr1.f20424b))) && (schemeDataM6684e.f7895e != null || z)) {
                arrayList.add(schemeDataM6684e);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final fz5 m45126A(int i, boolean z) {
        pm6 pm6Var = (pm6) op0.m42515e(this.f41655q);
        if ((pm6Var.mo29739g() == 2 && zj7.f57282d) || sqi.M0(this.f41645g, i) == -1 || pm6Var.mo29739g() == 1) {
            return null;
        }
        pd5 pd5Var = this.f41656r;
        if (pd5Var == null) {
            pd5 pd5VarM45137x = m45137x(nf8.m40499E(), true, null, z);
            this.f41651m.add(pd5VarM45137x);
            this.f41656r = pd5VarM45137x;
        } else {
            pd5Var.mo27779f(null);
        }
        return this.f41656r;
    }

    /* renamed from: B */
    public final void m45127B(Looper looper) {
        if (this.f41663y == null) {
            this.f41663y = new HandlerC16342d(looper);
        }
    }

    /* renamed from: C */
    public final void m45128C() {
        if (this.f41655q != null && this.f41654p == 0 && this.f41651m.isEmpty() && this.f41652n.isEmpty()) {
            ((pm6) op0.m42515e(this.f41655q)).release();
            this.f41655q = null;
        }
    }

    /* renamed from: D */
    public final void m45129D() {
        q4i it = pf8.m43582x(this.f41653o).iterator();
        while (it.hasNext()) {
            ((fz5) it.next()).mo27781h(null);
        }
    }

    /* renamed from: E */
    public final void m45130E() {
        q4i it = pf8.m43582x(this.f41652n).iterator();
        while (it.hasNext()) {
            ((C16344f) it.next()).release();
        }
    }

    /* renamed from: F */
    public void m45131F(int i, byte[] bArr) {
        op0.m42517g(this.f41651m.isEmpty());
        if (i == 1 || i == 3) {
            op0.m42515e(bArr);
        }
        this.f41660v = i;
        this.f41661w = bArr;
    }

    /* renamed from: G */
    public final void m45132G(fz5 fz5Var, mz5.C15451a c15451a) {
        fz5Var.mo27781h(c15451a);
        if (this.f41650l != -9223372036854775807L) {
            fz5Var.mo27781h(null);
        }
    }

    /* renamed from: H */
    public final void m45133H(boolean z) {
        if (z && this.f41658t == null) {
            ria.m46825i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) op0.m42515e(this.f41658t)).getThread()) {
            ria.m46825i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f41658t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p001o.nz5
    /* renamed from: a */
    public fz5 mo41290a(mz5.C15451a c15451a, C2181a c2181a) {
        m45133H(false);
        op0.m42517g(this.f41654p > 0);
        op0.m42519i(this.f41658t);
        return m45134t(this.f41658t, c15451a, c2181a, true);
    }

    @Override // p001o.nz5
    /* renamed from: b */
    public nz5.InterfaceC15682b mo41291b(mz5.C15451a c15451a, C2181a c2181a) {
        op0.m42517g(this.f41654p > 0);
        op0.m42519i(this.f41658t);
        C16344f c16344f = new C16344f(c15451a);
        c16344f.m45149e(c2181a);
        return c16344f;
    }

    @Override // p001o.nz5
    /* renamed from: c */
    public void mo41292c(Looper looper, jbd jbdVar) {
        m45138z(looper);
        this.f41662x = jbdVar;
    }

    @Override // p001o.nz5
    /* renamed from: d */
    public int mo41293d(C2181a c2181a) {
        m45133H(false);
        int iMo29739g = ((pm6) op0.m42515e(this.f41655q)).mo29739g();
        DrmInitData drmInitData = c2181a.f7947r;
        if (drmInitData != null) {
            if (m45135v(drmInitData)) {
                return iMo29739g;
            }
            return 1;
        }
        if (sqi.M0(this.f41645g, xeb.m56181i(c2181a.f7943n)) != -1) {
            return iMo29739g;
        }
        return 0;
    }

    @Override // p001o.nz5
    /* renamed from: f */
    public final void mo41294f() {
        m45133H(true);
        int i = this.f41654p;
        this.f41654p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f41655q == null) {
            pm6 pm6VarMo19289a = this.f41641c.mo19289a(this.f41640b);
            this.f41655q = pm6VarMo19289a;
            pm6VarMo19289a.mo29733a(new C16341c());
        } else if (this.f41650l != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.f41651m.size(); i2++) {
                ((pd5) this.f41651m.get(i2)).mo27779f(null);
            }
        }
    }

    @Override // p001o.nz5
    public final void release() {
        m45133H(true);
        int i = this.f41654p - 1;
        this.f41654p = i;
        if (i != 0) {
            return;
        }
        if (this.f41650l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f41651m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((pd5) arrayList.get(i2)).mo27781h(null);
            }
        }
        m45130E();
        m45128C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final fz5 m45134t(Looper looper, mz5.C15451a c15451a, C2181a c2181a, boolean z) {
        List listM45125y;
        m45127B(looper);
        DrmInitData drmInitData = c2181a.f7947r;
        if (drmInitData == null) {
            return m45126A(xeb.m56181i(c2181a.f7943n), z);
        }
        pd5 pd5VarM45137x = null;
        Object[] objArr = 0;
        if (this.f41661w == null) {
            listM45125y = m45125y((DrmInitData) op0.m42515e(drmInitData), this.f41640b, false);
            if (listM45125y.isEmpty()) {
                C16343e c16343e = new C16343e(this.f41640b);
                ria.m46820d("DefaultDrmSessionMgr", "DRM error", c16343e);
                if (c15451a != null) {
                    c15451a.m39907l(c16343e);
                }
                return new sj6(new fz5.C13592a(c16343e, 6003));
            }
        } else {
            listM45125y = null;
        }
        if (this.f41644f) {
            Iterator it = this.f41651m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pd5 pd5Var = (pd5) it.next();
                if (sqi.m48724c(pd5Var.f39864a, listM45125y)) {
                    pd5VarM45137x = pd5Var;
                    break;
                }
            }
        } else {
            pd5VarM45137x = this.f41657s;
        }
        if (pd5VarM45137x == null) {
            pd5VarM45137x = m45137x(listM45125y, false, c15451a, z);
            if (!this.f41644f) {
                this.f41657s = pd5VarM45137x;
            }
            this.f41651m.add(pd5VarM45137x);
        } else {
            pd5VarM45137x.mo27779f(c15451a);
        }
        return pd5VarM45137x;
    }

    /* renamed from: v */
    public final boolean m45135v(DrmInitData drmInitData) {
        if (this.f41661w != null) {
            return true;
        }
        if (m45125y(drmInitData, this.f41640b, true).isEmpty()) {
            if (drmInitData.f7890d != 1 || !drmInitData.m6684e(0).m6688d(dr1.f20424b)) {
                return false;
            }
            ria.m46824h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f41640b);
        }
        String str = drmInitData.f7889c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? sqi.f45790a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    /* renamed from: w */
    public final pd5 m45136w(List list, boolean z, mz5.C15451a c15451a) {
        op0.m42515e(this.f41655q);
        pd5 pd5Var = new pd5(this.f41640b, this.f41655q, this.f41647i, this.f41649k, list, this.f41660v, this.f41646h | z, z, this.f41661w, this.f41643e, this.f41642d, (Looper) op0.m42515e(this.f41658t), this.f41648j, (jbd) op0.m42515e(this.f41662x));
        pd5Var.mo27779f(c15451a);
        if (this.f41650l != -9223372036854775807L) {
            pd5Var.mo27779f(null);
        }
        return pd5Var;
    }

    /* renamed from: x */
    public final pd5 m45137x(List list, boolean z, mz5.C15451a c15451a, boolean z2) {
        pd5 pd5VarM45136w = m45136w(list, z, c15451a);
        if (m45124u(pd5VarM45136w) && !this.f41653o.isEmpty()) {
            m45129D();
            m45132G(pd5VarM45136w, c15451a);
            pd5VarM45136w = m45136w(list, z, c15451a);
        }
        if (!m45124u(pd5VarM45136w) || !z2 || this.f41652n.isEmpty()) {
            return pd5VarM45136w;
        }
        m45130E();
        if (!this.f41653o.isEmpty()) {
            m45129D();
        }
        m45132G(pd5VarM45136w, c15451a);
        return m45136w(list, z, c15451a);
    }

    /* renamed from: z */
    public final synchronized void m45138z(Looper looper) {
        Looper looper2 = this.f41658t;
        if (looper2 == null) {
            this.f41658t = looper;
            this.f41659u = new Handler(looper);
        } else {
            op0.m42517g(looper2 == looper);
            op0.m42515e(this.f41659u);
        }
    }

    public qd5(UUID uuid, pm6.InterfaceC16140c interfaceC16140c, n2b n2bVar, HashMap map, boolean z, int[] iArr, boolean z2, sga sgaVar, long j) {
        op0.m42515e(uuid);
        op0.m42512b(!dr1.f20424b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f41640b = uuid;
        this.f41641c = interfaceC16140c;
        this.f41642d = n2bVar;
        this.f41643e = map;
        this.f41644f = z;
        this.f41645g = iArr;
        this.f41646h = z2;
        this.f41648j = sgaVar;
        this.f41647i = new C16345g();
        this.f41649k = new C16346h();
        this.f41660v = 0;
        this.f41651m = new ArrayList();
        this.f41652n = lif.m37328h();
        this.f41653o = lif.m37328h();
        this.f41650l = j;
    }
}
