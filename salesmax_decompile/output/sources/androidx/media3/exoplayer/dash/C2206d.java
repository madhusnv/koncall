package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p001o.byc;
import p001o.dr4;
import p001o.if7;
import p001o.jk6;
import p001o.k93;
import p001o.mdb;
import p001o.ob0;
import p001o.pu4;
import p001o.s0f;
import p001o.sqi;
import p001o.uth;
import p001o.zwc;

/* renamed from: androidx.media3.exoplayer.dash.d */
/* loaded from: classes2.dex */
public final class C2206d implements Handler.Callback {

    /* renamed from: a */
    public final ob0 f8273a;

    /* renamed from: b */
    public final b f8274b;

    /* renamed from: f */
    public dr4 f8278f;

    /* renamed from: g */
    public long f8279g;

    /* renamed from: h */
    public boolean f8280h;

    /* renamed from: q */
    public boolean f8281q;

    /* renamed from: s */
    public boolean f8282s;

    /* renamed from: e */
    public final TreeMap f8277e = new TreeMap();

    /* renamed from: d */
    public final Handler f8276d = sqi.m48696A(this);

    /* renamed from: c */
    public final jk6 f8275c = new jk6();

    /* renamed from: androidx.media3.exoplayer.dash.d$a */
    public static final class a {

        /* renamed from: a */
        public final long f8283a;

        /* renamed from: b */
        public final long f8284b;

        public a(long j, long j2) {
            this.f8283a = j;
            this.f8284b = j2;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.d$b */
    public interface b {
        /* renamed from: a */
        void mo6956a(long j);

        /* renamed from: b */
        void mo6957b();
    }

    /* renamed from: androidx.media3.exoplayer.dash.d$c */
    public final class c implements uth {

        /* renamed from: a */
        public final s0f f8285a;

        /* renamed from: b */
        public final if7 f8286b = new if7();

        /* renamed from: c */
        public final mdb f8287c = new mdb();

        /* renamed from: d */
        public long f8288d = -9223372036854775807L;

        public c(ob0 ob0Var) {
            this.f8285a = s0f.m47396l(ob0Var);
        }

        @Override // p001o.uth
        /* renamed from: a */
        public void mo7071a(long j, int i, int i2, int i3, uth.C17452a c17452a) {
            this.f8285a.mo7071a(j, i, i2, i3, c17452a);
            m7080l();
        }

        @Override // p001o.uth
        /* renamed from: b */
        public void mo7072b(C2181a c2181a) {
            this.f8285a.mo7072b(c2181a);
        }

        @Override // p001o.uth
        /* renamed from: d */
        public int mo7073d(pu4 pu4Var, int i, boolean z, int i2) {
            return this.f8285a.m52026c(pu4Var, i, z);
        }

        @Override // p001o.uth
        /* renamed from: f */
        public void mo7074f(zwc zwcVar, int i, int i2) {
            this.f8285a.m52027e(zwcVar, i);
        }

        /* renamed from: g */
        public final mdb m7075g() {
            this.f8287c.mo16674h();
            if (this.f8285a.m47414S(this.f8286b, this.f8287c, 0, false) != -4) {
                return null;
            }
            this.f8287c.m16677w();
            return this.f8287c;
        }

        /* renamed from: h */
        public boolean m7076h(long j) {
            return C2206d.this.m7063j(j);
        }

        /* renamed from: i */
        public void m7077i(k93 k93Var) {
            long j = this.f8288d;
            if (j == -9223372036854775807L || k93Var.f31666h > j) {
                this.f8288d = k93Var.f31666h;
            }
            C2206d.this.m7066m(k93Var);
        }

        /* renamed from: j */
        public boolean m7078j(k93 k93Var) {
            long j = this.f8288d;
            return C2206d.this.m7067n(j != -9223372036854775807L && j < k93Var.f31665g);
        }

        /* renamed from: k */
        public final void m7079k(long j, long j2) {
            C2206d.this.f8276d.sendMessage(C2206d.this.f8276d.obtainMessage(1, new a(j, j2)));
        }

        /* renamed from: l */
        public final void m7080l() {
            while (this.f8285a.m47408L(false)) {
                mdb mdbVarM7075g = m7075g();
                if (mdbVarM7075g != null) {
                    long j = mdbVarM7075g.f14284f;
                    Metadata metadataMo28502a = C2206d.this.f8275c.mo28502a(mdbVarM7075g);
                    if (metadataMo28502a != null) {
                        EventMessage eventMessage = (EventMessage) metadataMo28502a.m6696d(0);
                        if (C2206d.m7059h(eventMessage.f8636a, eventMessage.f8637b)) {
                            m7081m(j, eventMessage);
                        }
                    }
                }
            }
            this.f8285a.m47431s();
        }

        /* renamed from: m */
        public final void m7081m(long j, EventMessage eventMessage) {
            long jM7058f = C2206d.m7058f(eventMessage);
            if (jM7058f == -9223372036854775807L) {
                return;
            }
            m7079k(j, jM7058f);
        }

        /* renamed from: n */
        public void m7082n() {
            this.f8285a.m47415T();
        }
    }

    public C2206d(dr4 dr4Var, b bVar, ob0 ob0Var) {
        this.f8278f = dr4Var;
        this.f8274b = bVar;
        this.f8273a = ob0Var;
    }

    /* renamed from: f */
    public static long m7058f(EventMessage eventMessage) {
        try {
            return sqi.U0(sqi.m48703H(eventMessage.f8640e));
        } catch (byc unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: h */
    public static boolean m7059h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    /* renamed from: e */
    public final Map.Entry m7060e(long j) {
        return this.f8277e.ceilingEntry(Long.valueOf(j));
    }

    /* renamed from: g */
    public final void m7061g(long j, long j2) {
        Long l = (Long) this.f8277e.get(Long.valueOf(j2));
        if (l == null) {
            this.f8277e.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f8277e.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f8282s) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        m7061g(aVar.f8283a, aVar.f8284b);
        return true;
    }

    /* renamed from: i */
    public final void m7062i() {
        if (this.f8280h) {
            this.f8281q = true;
            this.f8280h = false;
            this.f8274b.mo6957b();
        }
    }

    /* renamed from: j */
    public boolean m7063j(long j) {
        dr4 dr4Var = this.f8278f;
        boolean z = false;
        if (!dr4Var.f20433d) {
            return false;
        }
        if (this.f8281q) {
            return true;
        }
        Map.Entry entryM7060e = m7060e(dr4Var.f20437h);
        if (entryM7060e != null && ((Long) entryM7060e.getValue()).longValue() < j) {
            this.f8279g = ((Long) entryM7060e.getKey()).longValue();
            m7065l();
            z = true;
        }
        if (z) {
            m7062i();
        }
        return z;
    }

    /* renamed from: k */
    public c m7064k() {
        return new c(this.f8273a);
    }

    /* renamed from: l */
    public final void m7065l() {
        this.f8274b.mo6956a(this.f8279g);
    }

    /* renamed from: m */
    public void m7066m(k93 k93Var) {
        this.f8280h = true;
    }

    /* renamed from: n */
    public boolean m7067n(boolean z) {
        if (!this.f8278f.f20433d) {
            return false;
        }
        if (this.f8281q) {
            return true;
        }
        if (!z) {
            return false;
        }
        m7062i();
        return true;
    }

    /* renamed from: o */
    public void m7068o() {
        this.f8282s = true;
        this.f8276d.removeCallbacksAndMessages(null);
    }

    /* renamed from: p */
    public final void m7069p() {
        Iterator it = this.f8277e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f8278f.f20437h) {
                it.remove();
            }
        }
    }

    /* renamed from: q */
    public void m7070q(dr4 dr4Var) {
        this.f8281q = false;
        this.f8279g = -9223372036854775807L;
        this.f8278f = dr4Var;
        m7069p();
    }
}
