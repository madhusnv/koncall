package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2213j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p001o.dz4;
import p001o.e9b;
import p001o.sga;
import p001o.x4b;
import p001o.xga;

/* loaded from: classes2.dex */
public final class suf implements x4b, xga.InterfaceC18150b {

    /* renamed from: H */
    public byte[] f45964H;

    /* renamed from: L */
    public int f45965L;

    /* renamed from: a */
    public final iz4 f45966a;

    /* renamed from: b */
    public final dz4.InterfaceC13064a f45967b;

    /* renamed from: c */
    public final juh f45968c;

    /* renamed from: d */
    public final sga f45969d;

    /* renamed from: e */
    public final e9b.C13130a f45970e;

    /* renamed from: f */
    public final sth f45971f;

    /* renamed from: h */
    public final long f45973h;

    /* renamed from: s */
    public final C2181a f45975s;

    /* renamed from: x */
    public final boolean f45976x;

    /* renamed from: y */
    public boolean f45977y;

    /* renamed from: g */
    public final ArrayList f45972g = new ArrayList();

    /* renamed from: q */
    public final xga f45974q = new xga("SingleSampleMediaPeriod");

    /* renamed from: o.suf$b */
    public final class C16918b implements t0f {

        /* renamed from: a */
        public int f45978a;

        /* renamed from: b */
        public boolean f45979b;

        public C16918b() {
        }

        @Override // p001o.t0f
        /* renamed from: a */
        public void mo26371a() throws IOException {
            suf sufVar = suf.this;
            if (sufVar.f45976x) {
                return;
            }
            sufVar.f45974q.mo6966a();
        }

        /* renamed from: b */
        public final void m48948b() {
            if (this.f45979b) {
                return;
            }
            suf.this.f45970e.m24552h(xeb.m56181i(suf.this.f45975s.f7943n), suf.this.f45975s, 0, null, 0L);
            this.f45979b = true;
        }

        /* renamed from: c */
        public void m48949c() {
            if (this.f45978a == 2) {
                this.f45978a = 1;
            }
        }

        @Override // p001o.t0f
        /* renamed from: f */
        public int mo26373f(if7 if7Var, a85 a85Var, int i) {
            m48948b();
            suf sufVar = suf.this;
            boolean z = sufVar.f45977y;
            if (z && sufVar.f45964H == null) {
                this.f45978a = 2;
            }
            int i2 = this.f45978a;
            if (i2 == 2) {
                a85Var.m50147g(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                if7Var.f28594b = sufVar.f45975s;
                this.f45978a = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            op0.m42515e(sufVar.f45964H);
            a85Var.m50147g(1);
            a85Var.f14284f = 0L;
            if ((i & 4) == 0) {
                a85Var.m16676v(suf.this.f45965L);
                ByteBuffer byteBuffer = a85Var.f14282d;
                suf sufVar2 = suf.this;
                byteBuffer.put(sufVar2.f45964H, 0, sufVar2.f45965L);
            }
            if ((i & 1) == 0) {
                this.f45978a = 2;
            }
            return -4;
        }

        @Override // p001o.t0f
        public boolean isReady() {
            return suf.this.f45977y;
        }

        @Override // p001o.t0f
        /* renamed from: p */
        public int mo26374p(long j) {
            m48948b();
            if (j <= 0 || this.f45978a == 2) {
                return 0;
            }
            this.f45978a = 2;
            return 1;
        }
    }

    /* renamed from: o.suf$c */
    public static final class C16919c implements xga.InterfaceC18153e {

        /* renamed from: a */
        public final long f45981a = tga.m49830a();

        /* renamed from: b */
        public final iz4 f45982b;

        /* renamed from: c */
        public final o5g f45983c;

        /* renamed from: d */
        public byte[] f45984d;

        public C16919c(iz4 iz4Var, dz4 dz4Var) {
            this.f45982b = iz4Var;
            this.f45983c = new o5g(dz4Var);
        }

        @Override // p001o.xga.InterfaceC18153e
        /* renamed from: b */
        public void mo22073b() {
        }

        @Override // p001o.xga.InterfaceC18153e
        public void load() {
            this.f45983c.m41630q();
            try {
                this.f45983c.mo23960e(this.f45982b);
                int i = 0;
                while (i != -1) {
                    int iM41627n = (int) this.f45983c.m41627n();
                    byte[] bArr = this.f45984d;
                    if (bArr == null) {
                        this.f45984d = new byte[1024];
                    } else if (iM41627n == bArr.length) {
                        this.f45984d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    o5g o5gVar = this.f45983c;
                    byte[] bArr2 = this.f45984d;
                    i = o5gVar.read(bArr2, iM41627n, bArr2.length - iM41627n);
                }
            } finally {
                hz4.m31298a(this.f45983c);
            }
        }
    }

    public suf(iz4 iz4Var, dz4.InterfaceC13064a interfaceC13064a, juh juhVar, C2181a c2181a, long j, sga sgaVar, e9b.C13130a c13130a, boolean z) {
        this.f45966a = iz4Var;
        this.f45967b = interfaceC13064a;
        this.f45968c = juhVar;
        this.f45975s = c2181a;
        this.f45973h = j;
        this.f45969d = sgaVar;
        this.f45970e = c13130a;
        this.f45976x = z;
        this.f45971f = new sth(new qth(c2181a));
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        return this.f45974q.m56266j();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        if (this.f45977y || this.f45974q.m56266j() || this.f45974q.m56265i()) {
            return false;
        }
        dz4 dz4VarMo23962a = this.f45967b.mo23962a();
        juh juhVar = this.f45968c;
        if (juhVar != null) {
            dz4VarMo23962a.mo23961j(juhVar);
        }
        C16919c c16919c = new C16919c(this.f45966a, dz4VarMo23962a);
        this.f45970e.m24564z(new tga(c16919c.f45981a, this.f45966a, this.f45974q.m56270n(c16919c, this, this.f45969d.mo48310a(1))), 1, -1, this.f45975s, 0, null, 0L, this.f45973h);
        return true;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        return (this.f45977y || this.f45974q.m56266j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p001o.x4b
    /* renamed from: e */
    public long mo7005e(long j, abf abfVar) {
        return j;
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo6964m(C16919c c16919c, long j, long j2, boolean z) {
        o5g o5gVar = c16919c.f45983c;
        tga tgaVar = new tga(c16919c.f45981a, c16919c.f45982b, o5gVar.m41628o(), o5gVar.m41629p(), j, j2, o5gVar.m41627n());
        this.f45969d.m48312c(c16919c.f45981a);
        this.f45970e.m24555q(tgaVar, 1, -1, null, 0, null, 0L, this.f45973h);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        return this.f45977y ? Long.MIN_VALUE : 0L;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
    }

    @Override // p001o.x4b
    /* renamed from: i */
    public long mo7008i(long j) {
        for (int i = 0; i < this.f45972g.size(); i++) {
            ((C16918b) this.f45972g.get(i)).m48949c();
        }
        return j;
    }

    @Override // p001o.x4b
    /* renamed from: j */
    public long mo7009j() {
        return -9223372036854775807L;
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo6963k(C16919c c16919c, long j, long j2) {
        this.f45965L = (int) c16919c.f45983c.m41627n();
        this.f45964H = (byte[]) op0.m42515e(c16919c.f45984d);
        this.f45977y = true;
        o5g o5gVar = c16919c.f45983c;
        tga tgaVar = new tga(c16919c.f45981a, c16919c.f45982b, o5gVar.m41628o(), o5gVar.m41629p(), j, j2, this.f45965L);
        this.f45969d.m48312c(c16919c.f45981a);
        this.f45970e.m24558t(tgaVar, 1, -1, this.f45975s, 0, null, 0L, this.f45973h);
    }

    @Override // p001o.x4b
    /* renamed from: n */
    public void mo7011n() {
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public xga.C18151c mo6965o(C16919c c16919c, long j, long j2, IOException iOException, int i) {
        xga.C18151c c18151cM56262h;
        o5g o5gVar = c16919c.f45983c;
        tga tgaVar = new tga(c16919c.f45981a, c16919c.f45982b, o5gVar.m41628o(), o5gVar.m41629p(), j, j2, o5gVar.m41627n());
        long jMo48313d = this.f45969d.mo48313d(new sga.C16838c(tgaVar, new u2b(1, -1, this.f45975s, 0, null, 0L, sqi.q1(this.f45973h)), iOException, i));
        boolean z = jMo48313d == -9223372036854775807L || i >= this.f45969d.mo48310a(1);
        if (this.f45976x && z) {
            ria.m46825i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f45977y = true;
            c18151cM56262h = xga.f53733f;
        } else {
            c18151cM56262h = jMo48313d != -9223372036854775807L ? xga.m56262h(false, jMo48313d) : xga.f53734g;
        }
        xga.C18151c c18151c = c18151cM56262h;
        boolean z2 = !c18151c.m56273c();
        this.f45970e.m24560v(tgaVar, 1, -1, this.f45975s, 0, null, 0L, this.f45973h, iOException, z2);
        if (z2) {
            this.f45969d.m48312c(c16919c.f45981a);
        }
        return c18151c;
    }

    @Override // p001o.x4b
    /* renamed from: q */
    public void mo7013q(x4b.InterfaceC18049a interfaceC18049a, long j) {
        interfaceC18049a.mo7240f(this);
    }

    /* renamed from: r */
    public void m48947r() {
        this.f45974q.m56268l();
    }

    @Override // p001o.x4b
    /* renamed from: s */
    public sth mo7014s() {
        return this.f45971f;
    }

    @Override // p001o.x4b
    /* renamed from: t */
    public void mo7015t(long j, boolean z) {
    }

    @Override // p001o.x4b
    /* renamed from: u */
    public long mo7016u(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < ko6VarArr.length; i++) {
            t0f t0fVar = t0fVarArr[i];
            if (t0fVar != null && (ko6VarArr[i] == null || !zArr[i])) {
                this.f45972g.remove(t0fVar);
                t0fVarArr[i] = null;
            }
            if (t0fVarArr[i] == null && ko6VarArr[i] != null) {
                C16918b c16918b = new C16918b();
                this.f45972g.add(c16918b);
                t0fVarArr[i] = c16918b;
                zArr2[i] = true;
            }
        }
        return j;
    }
}
