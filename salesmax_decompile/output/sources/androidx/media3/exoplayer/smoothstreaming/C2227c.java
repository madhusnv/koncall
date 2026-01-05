package androidx.media3.exoplayer.smoothstreaming;

import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2213j;
import androidx.media3.exoplayer.smoothstreaming.C2227c;
import androidx.media3.exoplayer.smoothstreaming.InterfaceC2226b;
import java.util.ArrayList;
import java.util.List;
import p001o.abf;
import p001o.d1g;
import p001o.e9b;
import p001o.fga;
import p001o.juh;
import p001o.ko6;
import p001o.lef;
import p001o.mz5;
import p001o.nf8;
import p001o.nz5;
import p001o.ob0;
import p001o.oe3;
import p001o.ol7;
import p001o.op0;
import p001o.p93;
import p001o.qo3;
import p001o.qth;
import p001o.sga;
import p001o.sth;
import p001o.t0f;
import p001o.x4b;
import p001o.zga;

/* renamed from: androidx.media3.exoplayer.smoothstreaming.c */
/* loaded from: classes2.dex */
public final class C2227c implements x4b, lef.InterfaceC15066a {

    /* renamed from: H */
    public p93[] f8555H = m7500p(0);

    /* renamed from: L */
    public lef f8556L;

    /* renamed from: a */
    public final InterfaceC2226b.a f8557a;

    /* renamed from: b */
    public final juh f8558b;

    /* renamed from: c */
    public final zga f8559c;

    /* renamed from: d */
    public final nz5 f8560d;

    /* renamed from: e */
    public final mz5.C15451a f8561e;

    /* renamed from: f */
    public final sga f8562f;

    /* renamed from: g */
    public final e9b.C13130a f8563g;

    /* renamed from: h */
    public final ob0 f8564h;

    /* renamed from: q */
    public final sth f8565q;

    /* renamed from: s */
    public final qo3 f8566s;

    /* renamed from: x */
    public x4b.InterfaceC18049a f8567x;

    /* renamed from: y */
    public d1g f8568y;

    public C2227c(d1g d1gVar, InterfaceC2226b.a aVar, juh juhVar, qo3 qo3Var, oe3 oe3Var, nz5 nz5Var, mz5.C15451a c15451a, sga sgaVar, e9b.C13130a c13130a, zga zgaVar, ob0 ob0Var) {
        this.f8568y = d1gVar;
        this.f8557a = aVar;
        this.f8558b = juhVar;
        this.f8559c = zgaVar;
        this.f8560d = nz5Var;
        this.f8561e = c15451a;
        this.f8562f = sgaVar;
        this.f8563g = c13130a;
        this.f8564h = ob0Var;
        this.f8566s = qo3Var;
        this.f8565q = m7498m(d1gVar, nz5Var, aVar);
        this.f8556L = qo3Var.mo20938c();
    }

    /* renamed from: m */
    public static sth m7498m(d1g d1gVar, nz5 nz5Var, InterfaceC2226b.a aVar) {
        qth[] qthVarArr = new qth[d1gVar.f18982f.length];
        int i = 0;
        while (true) {
            d1g.C12783b[] c12783bArr = d1gVar.f18982f;
            if (i >= c12783bArr.length) {
                return new sth(qthVarArr);
            }
            C2181a[] c2181aArr = c12783bArr[i].f18997j;
            C2181a[] c2181aArr2 = new C2181a[c2181aArr.length];
            for (int i2 = 0; i2 < c2181aArr.length; i2++) {
                C2181a c2181a = c2181aArr[i2];
                c2181aArr2[i2] = aVar.mo7493c(c2181a.m6707a().m6755R(nz5Var.mo41293d(c2181a)).m6748K());
            }
            qthVarArr[i] = new qth(Integer.toString(i), c2181aArr2);
            i++;
        }
    }

    /* renamed from: o */
    public static /* synthetic */ List m7499o(p93 p93Var) {
        return nf8.m40500F(Integer.valueOf(p93Var.f39650a));
    }

    /* renamed from: p */
    public static p93[] m7500p(int i) {
        return new p93[i];
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        return this.f8556L.mo7002b();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        return this.f8556L.mo7003c(c2213j);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        return this.f8556L.mo7004d();
    }

    @Override // p001o.x4b
    /* renamed from: e */
    public long mo7005e(long j, abf abfVar) {
        for (p93 p93Var : this.f8555H) {
            if (p93Var.f39650a == 2) {
                return p93Var.m43239e(j, abfVar);
            }
        }
        return j;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        return this.f8556L.mo7006g();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
        this.f8556L.mo7007h(j);
    }

    @Override // p001o.x4b
    /* renamed from: i */
    public long mo7008i(long j) {
        for (p93 p93Var : this.f8555H) {
            p93Var.m43237R(j);
        }
        return j;
    }

    @Override // p001o.x4b
    /* renamed from: j */
    public long mo7009j() {
        return -9223372036854775807L;
    }

    /* renamed from: l */
    public final p93 m7501l(ko6 ko6Var, long j) {
        int iM48916d = this.f8565q.m48916d(ko6Var.mo22953m());
        return new p93(this.f8568y.f18982f[iM48916d].f18988a, null, null, this.f8557a.mo7494d(this.f8559c, this.f8568y, iM48916d, ko6Var, this.f8558b, null), this, this.f8564h, j, this.f8560d, this.f8561e, this.f8562f, this.f8563g);
    }

    @Override // p001o.x4b
    /* renamed from: n */
    public void mo7011n() {
        this.f8559c.mo6966a();
    }

    @Override // p001o.x4b
    /* renamed from: q */
    public void mo7013q(x4b.InterfaceC18049a interfaceC18049a, long j) {
        this.f8567x = interfaceC18049a;
        interfaceC18049a.mo7240f(this);
    }

    @Override // p001o.lef.InterfaceC15066a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo7010k(p93 p93Var) {
        ((x4b.InterfaceC18049a) op0.m42515e(this.f8567x)).mo7010k(this);
    }

    @Override // p001o.x4b
    /* renamed from: s */
    public sth mo7014s() {
        return this.f8565q;
    }

    @Override // p001o.x4b
    /* renamed from: t */
    public void mo7015t(long j, boolean z) {
        for (p93 p93Var : this.f8555H) {
            p93Var.m43240t(j, z);
        }
    }

    @Override // p001o.x4b
    /* renamed from: u */
    public long mo7016u(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr, boolean[] zArr2, long j) {
        ko6 ko6Var;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ko6VarArr.length; i++) {
            t0f t0fVar = t0fVarArr[i];
            if (t0fVar != null) {
                p93 p93Var = (p93) t0fVar;
                if (ko6VarArr[i] == null || !zArr[i]) {
                    p93Var.m43234O();
                    t0fVarArr[i] = null;
                } else {
                    ((InterfaceC2226b) p93Var.m43223D()).mo7488b((ko6) op0.m42515e(ko6VarArr[i]));
                    arrayList.add(p93Var);
                }
            }
            if (t0fVarArr[i] == null && (ko6Var = ko6VarArr[i]) != null) {
                p93 p93VarM7501l = m7501l(ko6Var, j);
                arrayList.add(p93VarM7501l);
                t0fVarArr[i] = p93VarM7501l;
                zArr2[i] = true;
            }
        }
        p93[] p93VarArrM7500p = m7500p(arrayList.size());
        this.f8555H = p93VarArrM7500p;
        arrayList.toArray(p93VarArrM7500p);
        this.f8556L = this.f8566s.mo20939d(arrayList, fga.m26655k(arrayList, new ol7() { // from class: o.f1g
            @Override // p001o.ol7
            public final Object apply(Object obj) {
                return C2227c.m7499o((p93) obj);
            }
        }));
        return j;
    }

    /* renamed from: v */
    public void m7503v() {
        for (p93 p93Var : this.f8555H) {
            p93Var.m43234O();
        }
        this.f8567x = null;
    }

    /* renamed from: w */
    public void m7504w(d1g d1gVar) {
        this.f8568y = d1gVar;
        for (p93 p93Var : this.f8555H) {
            ((InterfaceC2226b) p93Var.m43223D()).mo7489d(d1gVar);
        }
        ((x4b.InterfaceC18049a) op0.m42515e(this.f8567x)).mo7010k(this);
    }
}
