package p001o;

import android.net.Uri;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2213j;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001o.gq6;
import p001o.x4b;

/* loaded from: classes2.dex */
public final class nq6 implements x4b {

    /* renamed from: a */
    public final Uri f37157a;

    /* renamed from: b */
    public final sth f37158b;

    /* renamed from: c */
    public final byte[] f37159c;

    /* renamed from: d */
    public final AtomicBoolean f37160d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicReference f37161e = new AtomicReference();

    /* renamed from: f */
    public zfa f37162f;

    /* renamed from: o.nq6$a */
    public final class C15627a implements t0f {

        /* renamed from: a */
        public int f37163a = 0;

        public C15627a() {
        }

        @Override // p001o.t0f
        /* renamed from: a */
        public void mo26371a() throws IOException {
            Throwable th = (Throwable) nq6.this.f37161e.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // p001o.t0f
        /* renamed from: f */
        public int mo26373f(if7 if7Var, a85 a85Var, int i) {
            int i2 = this.f37163a;
            if (i2 == 2) {
                a85Var.m50147g(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                if7Var.f28594b = nq6.this.f37158b.m48914b(0).m45839a(0);
                this.f37163a = 1;
                return -5;
            }
            if (!nq6.this.f37160d.get()) {
                return -3;
            }
            int length = nq6.this.f37159c.length;
            a85Var.m50147g(1);
            a85Var.f14284f = 0L;
            if ((i & 4) == 0) {
                a85Var.m16676v(length);
                a85Var.f14282d.put(nq6.this.f37159c, 0, length);
            }
            if ((i & 1) == 0) {
                this.f37163a = 2;
            }
            return -4;
        }

        @Override // p001o.t0f
        public boolean isReady() {
            return nq6.this.f37160d.get();
        }

        @Override // p001o.t0f
        /* renamed from: p */
        public int mo26374p(long j) {
            return 0;
        }
    }

    public nq6(Uri uri, String str, gq6 gq6Var) {
        this.f37157a = uri;
        this.f37158b = new sth(new qth(new C2181a.b().o0(str).m6748K()));
        this.f37159c = uri.toString().getBytes(uh2.f48931c);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        return !this.f37160d.get();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        return !this.f37160d.get();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        return this.f37160d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // p001o.x4b
    /* renamed from: e */
    public long mo7005e(long j, abf abfVar) {
        return j;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        return this.f37160d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
    }

    @Override // p001o.x4b
    /* renamed from: i */
    public long mo7008i(long j) {
        return j;
    }

    @Override // p001o.x4b
    /* renamed from: j */
    public long mo7009j() {
        return -9223372036854775807L;
    }

    /* renamed from: m */
    public void m40917m() {
        zfa zfaVar = this.f37162f;
        if (zfaVar != null) {
            zfaVar.cancel(false);
        }
    }

    @Override // p001o.x4b
    /* renamed from: n */
    public void mo7011n() {
    }

    @Override // p001o.x4b
    /* renamed from: q */
    public void mo7013q(x4b.InterfaceC18049a interfaceC18049a, long j) {
        interfaceC18049a.mo7240f(this);
        new gq6.C13808a(this.f37157a);
        throw null;
    }

    @Override // p001o.x4b
    /* renamed from: s */
    public sth mo7014s() {
        return this.f37158b;
    }

    @Override // p001o.x4b
    /* renamed from: t */
    public void mo7015t(long j, boolean z) {
    }

    @Override // p001o.x4b
    /* renamed from: u */
    public long mo7016u(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < ko6VarArr.length; i++) {
            if (t0fVarArr[i] != null && (ko6VarArr[i] == null || !zArr[i])) {
                t0fVarArr[i] = null;
            }
            if (t0fVarArr[i] == null && ko6VarArr[i] != null) {
                t0fVarArr[i] = new C15627a();
                zArr2[i] = true;
            }
        }
        return j;
    }
}
