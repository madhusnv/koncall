package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2213j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import p001o.x4b;

/* loaded from: classes2.dex */
public final class lbb implements x4b, x4b.InterfaceC18049a {

    /* renamed from: a */
    public final x4b[] f33549a;

    /* renamed from: c */
    public final qo3 f33551c;

    /* renamed from: f */
    public x4b.InterfaceC18049a f33554f;

    /* renamed from: g */
    public sth f33555g;

    /* renamed from: q */
    public lef f33557q;

    /* renamed from: d */
    public final ArrayList f33552d = new ArrayList();

    /* renamed from: e */
    public final HashMap f33553e = new HashMap();

    /* renamed from: b */
    public final IdentityHashMap f33550b = new IdentityHashMap();

    /* renamed from: h */
    public x4b[] f33556h = new x4b[0];

    /* renamed from: o.lbb$a */
    public static final class C15052a implements ko6 {

        /* renamed from: a */
        public final ko6 f33558a;

        /* renamed from: b */
        public final qth f33559b;

        public C15052a(ko6 ko6Var, qth qthVar) {
            this.f33558a = ko6Var;
            this.f33559b = qthVar;
        }

        @Override // p001o.ko6
        /* renamed from: a */
        public boolean mo22947a(int i, long j) {
            return this.f33558a.mo22947a(i, j);
        }

        @Override // p001o.wth
        /* renamed from: b */
        public int mo22948b(C2181a c2181a) {
            return this.f33558a.mo22952l(this.f33559b.m45840b(c2181a));
        }

        @Override // p001o.ko6
        /* renamed from: c */
        public boolean mo35979c(long j, k93 k93Var, List list) {
            return this.f33558a.mo35979c(j, k93Var, list);
        }

        @Override // p001o.ko6
        /* renamed from: d */
        public int mo16357d() {
            return this.f33558a.mo16357d();
        }

        @Override // p001o.ko6
        public void disable() {
            this.f33558a.disable();
        }

        @Override // p001o.wth
        /* renamed from: e */
        public C2181a mo22949e(int i) {
            return this.f33559b.m45839a(this.f33558a.mo22950f(i));
        }

        @Override // p001o.ko6
        public void enable() {
            this.f33558a.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15052a)) {
                return false;
            }
            C15052a c15052a = (C15052a) obj;
            return this.f33558a.equals(c15052a.f33558a) && this.f33559b.equals(c15052a.f33559b);
        }

        @Override // p001o.wth
        /* renamed from: f */
        public int mo22950f(int i) {
            return this.f33558a.mo22950f(i);
        }

        @Override // p001o.ko6
        /* renamed from: g */
        public boolean mo22951g(int i, long j) {
            return this.f33558a.mo22951g(i, j);
        }

        @Override // p001o.ko6
        /* renamed from: h */
        public void mo19891h(float f) {
            this.f33558a.mo19891h(f);
        }

        public int hashCode() {
            return ((527 + this.f33559b.hashCode()) * 31) + this.f33558a.hashCode();
        }

        @Override // p001o.ko6
        /* renamed from: i */
        public Object mo16358i() {
            return this.f33558a.mo16358i();
        }

        @Override // p001o.ko6
        /* renamed from: j */
        public void mo35980j() {
            this.f33558a.mo35980j();
        }

        @Override // p001o.ko6
        /* renamed from: k */
        public void mo16359k(long j, long j2, long j3, List list, k1b[] k1bVarArr) {
            this.f33558a.mo16359k(j, j2, j3, list, k1bVarArr);
        }

        @Override // p001o.wth
        /* renamed from: l */
        public int mo22952l(int i) {
            return this.f33558a.mo22952l(i);
        }

        @Override // p001o.wth
        public int length() {
            return this.f33558a.length();
        }

        @Override // p001o.wth
        /* renamed from: m */
        public qth mo22953m() {
            return this.f33559b;
        }

        @Override // p001o.ko6
        /* renamed from: n */
        public void mo35981n(boolean z) {
            this.f33558a.mo35981n(z);
        }

        @Override // p001o.ko6
        /* renamed from: o */
        public int mo19892o(long j, List list) {
            return this.f33558a.mo19892o(j, list);
        }

        @Override // p001o.ko6
        /* renamed from: p */
        public int mo22954p() {
            return this.f33558a.mo22954p();
        }

        @Override // p001o.ko6
        /* renamed from: q */
        public C2181a mo22955q() {
            return this.f33559b.m45839a(this.f33558a.mo22954p());
        }

        @Override // p001o.ko6
        /* renamed from: r */
        public int mo16360r() {
            return this.f33558a.mo16360r();
        }

        @Override // p001o.ko6
        /* renamed from: s */
        public void mo35982s() {
            this.f33558a.mo35982s();
        }
    }

    public lbb(qo3 qo3Var, long[] jArr, x4b... x4bVarArr) {
        this.f33551c = qo3Var;
        this.f33549a = x4bVarArr;
        this.f33557q = qo3Var.mo20938c();
        for (int i = 0; i < x4bVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f33549a[i] = new ylh(x4bVarArr[i], j);
            }
        }
    }

    /* renamed from: m */
    public static /* synthetic */ List m36861m(x4b x4bVar) {
        return x4bVar.mo7014s().m48915c();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        return this.f33557q.mo7002b();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        if (this.f33552d.isEmpty()) {
            return this.f33557q.mo7003c(c2213j);
        }
        int size = this.f33552d.size();
        for (int i = 0; i < size; i++) {
            ((x4b) this.f33552d.get(i)).mo7003c(c2213j);
        }
        return false;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        return this.f33557q.mo7004d();
    }

    @Override // p001o.x4b
    /* renamed from: e */
    public long mo7005e(long j, abf abfVar) {
        x4b[] x4bVarArr = this.f33556h;
        return (x4bVarArr.length > 0 ? x4bVarArr[0] : this.f33549a[0]).mo7005e(j, abfVar);
    }

    @Override // p001o.x4b.InterfaceC18049a
    /* renamed from: f */
    public void mo7240f(x4b x4bVar) {
        this.f33552d.remove(x4bVar);
        if (!this.f33552d.isEmpty()) {
            return;
        }
        int i = 0;
        for (x4b x4bVar2 : this.f33549a) {
            i += x4bVar2.mo7014s().f45923a;
        }
        qth[] qthVarArr = new qth[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            x4b[] x4bVarArr = this.f33549a;
            if (i2 >= x4bVarArr.length) {
                this.f33555g = new sth(qthVarArr);
                ((x4b.InterfaceC18049a) op0.m42515e(this.f33554f)).mo7240f(this);
                return;
            }
            sth sthVarMo7014s = x4bVarArr[i2].mo7014s();
            int i4 = sthVarMo7014s.f45923a;
            int i5 = 0;
            while (i5 < i4) {
                qth qthVarM48914b = sthVarMo7014s.m48914b(i5);
                C2181a[] c2181aArr = new C2181a[qthVarM48914b.f42400a];
                for (int i6 = 0; i6 < qthVarM48914b.f42400a; i6++) {
                    C2181a c2181aM45839a = qthVarM48914b.m45839a(i6);
                    C2181a.b bVarM6707a = c2181aM45839a.m6707a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append(":");
                    String str = c2181aM45839a.f7930a;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    c2181aArr[i6] = bVarM6707a.a0(sb.toString()).m6748K();
                }
                qth qthVar = new qth(i2 + ":" + qthVarM48914b.f42401b, c2181aArr);
                this.f33553e.put(qthVar, qthVarM48914b);
                qthVarArr[i3] = qthVar;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        return this.f33557q.mo7006g();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
        this.f33557q.mo7007h(j);
    }

    @Override // p001o.x4b
    /* renamed from: i */
    public long mo7008i(long j) {
        long jMo7008i = this.f33556h[0].mo7008i(j);
        int i = 1;
        while (true) {
            x4b[] x4bVarArr = this.f33556h;
            if (i >= x4bVarArr.length) {
                return jMo7008i;
            }
            if (x4bVarArr[i].mo7008i(jMo7008i) != jMo7008i) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // p001o.x4b
    /* renamed from: j */
    public long mo7009j() {
        long j = -9223372036854775807L;
        for (x4b x4bVar : this.f33556h) {
            long jMo7009j = x4bVar.mo7009j();
            if (jMo7009j == -9223372036854775807L) {
                if (j != -9223372036854775807L && x4bVar.mo7008i(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (x4b x4bVar2 : this.f33556h) {
                    if (x4bVar2 == x4bVar) {
                        break;
                    }
                    if (x4bVar2.mo7008i(jMo7009j) != jMo7009j) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jMo7009j;
            } else if (jMo7009j != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    /* renamed from: l */
    public x4b m36862l(int i) {
        x4b x4bVar = this.f33549a[i];
        return x4bVar instanceof ylh ? ((ylh) x4bVar).m57988a() : x4bVar;
    }

    @Override // p001o.x4b
    /* renamed from: n */
    public void mo7011n() {
        for (x4b x4bVar : this.f33549a) {
            x4bVar.mo7011n();
        }
    }

    @Override // p001o.lef.InterfaceC15066a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo7010k(x4b x4bVar) {
        ((x4b.InterfaceC18049a) op0.m42515e(this.f33554f)).mo7010k(this);
    }

    @Override // p001o.x4b
    /* renamed from: q */
    public void mo7013q(x4b.InterfaceC18049a interfaceC18049a, long j) {
        this.f33554f = interfaceC18049a;
        Collections.addAll(this.f33552d, this.f33549a);
        for (x4b x4bVar : this.f33549a) {
            x4bVar.mo7013q(this, j);
        }
    }

    @Override // p001o.x4b
    /* renamed from: s */
    public sth mo7014s() {
        return (sth) op0.m42515e(this.f33555g);
    }

    @Override // p001o.x4b
    /* renamed from: t */
    public void mo7015t(long j, boolean z) {
        for (x4b x4bVar : this.f33556h) {
            x4bVar.mo7015t(j, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // p001o.x4b
    /* renamed from: u */
    public long mo7016u(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr, boolean[] zArr2, long j) {
        t0f t0fVar;
        int[] iArr = new int[ko6VarArr.length];
        int[] iArr2 = new int[ko6VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            t0fVar = null;
            if (i2 >= ko6VarArr.length) {
                break;
            }
            t0f t0fVar2 = t0fVarArr[i2];
            Integer num = t0fVar2 != null ? (Integer) this.f33550b.get(t0fVar2) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            ko6 ko6Var = ko6VarArr[i2];
            if (ko6Var != null) {
                String str = ko6Var.mo22953m().f42401b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.f33550b.clear();
        int length = ko6VarArr.length;
        t0f[] t0fVarArr2 = new t0f[length];
        t0f[] t0fVarArr3 = new t0f[ko6VarArr.length];
        ko6[] ko6VarArr2 = new ko6[ko6VarArr.length];
        ArrayList arrayList = new ArrayList(this.f33549a.length);
        long j2 = j;
        int i3 = 0;
        ko6[] ko6VarArr3 = ko6VarArr2;
        while (i3 < this.f33549a.length) {
            for (int i4 = i; i4 < ko6VarArr.length; i4++) {
                t0fVarArr3[i4] = iArr[i4] == i3 ? t0fVarArr[i4] : t0fVar;
                if (iArr2[i4] == i3) {
                    ko6 ko6Var2 = (ko6) op0.m42515e(ko6VarArr[i4]);
                    ko6VarArr3[i4] = new C15052a(ko6Var2, (qth) op0.m42515e((qth) this.f33553e.get(ko6Var2.mo22953m())));
                } else {
                    ko6VarArr3[i4] = t0fVar;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            ko6[] ko6VarArr4 = ko6VarArr3;
            long jMo7016u = this.f33549a[i3].mo7016u(ko6VarArr3, zArr, t0fVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jMo7016u;
            } else if (jMo7016u != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < ko6VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    t0f t0fVar3 = (t0f) op0.m42515e(t0fVarArr3[i6]);
                    t0fVarArr2[i6] = t0fVarArr3[i6];
                    this.f33550b.put(t0fVar3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    op0.m42517g(t0fVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f33549a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            ko6VarArr3 = ko6VarArr4;
            i = 0;
            t0fVar = null;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(t0fVarArr2, i7, t0fVarArr, i7, length);
        this.f33556h = (x4b[]) arrayList3.toArray(new x4b[i7]);
        this.f33557q = this.f33551c.mo20939d(arrayList3, fga.m26655k(arrayList3, new ol7() { // from class: o.kbb
            @Override // p001o.ol7
            public final Object apply(Object obj) {
                return lbb.m36861m((x4b) obj);
            }
        }));
        return j2;
    }
}
