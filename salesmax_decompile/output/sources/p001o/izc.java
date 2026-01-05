package p001o;

import java.util.List;
import p001o.gvf;
import p001o.sed;
import p001o.wkf;

/* loaded from: classes6.dex */
public final class izc {

    /* renamed from: a */
    public final int f29410a;

    /* renamed from: b */
    public final int f29411b;

    /* renamed from: c */
    public final float f29412c;

    /* renamed from: d */
    public final float f29413d;

    /* renamed from: e */
    public final float f29414e;

    /* renamed from: f */
    public final List f29415f;

    /* renamed from: g */
    public final List f29416g;

    /* renamed from: h */
    public final List f29417h;

    /* renamed from: i */
    public final long f29418i;

    /* renamed from: j */
    public final boolean f29419j;

    /* renamed from: k */
    public final sed f29420k;

    /* renamed from: l */
    public final int f29421l;

    /* renamed from: m */
    public final sue f29422m;

    /* renamed from: n */
    public final j56 f29423n;

    public izc(int i, int i2, float f, float f2, float f3, List list, List list2, List list3, long j, boolean z, sed sedVar, int i3, sue sueVar, j56 j56Var) {
        sq8.m48649h(list, "size");
        sq8.m48649h(list2, "colors");
        sq8.m48649h(list3, "shapes");
        sq8.m48649h(sedVar, "position");
        sq8.m48649h(sueVar, "rotation");
        sq8.m48649h(j56Var, "emitter");
        this.f29410a = i;
        this.f29411b = i2;
        this.f29412c = f;
        this.f29413d = f2;
        this.f29414e = f3;
        this.f29415f = list;
        this.f29416g = list2;
        this.f29417h = list3;
        this.f29418i = j;
        this.f29419j = z;
        this.f29420k = sedVar;
        this.f29421l = i3;
        this.f29422m = sueVar;
        this.f29423n = j56Var;
    }

    /* renamed from: a */
    public final izc m32935a(int i, int i2, float f, float f2, float f3, List list, List list2, List list3, long j, boolean z, sed sedVar, int i3, sue sueVar, j56 j56Var) {
        sq8.m48649h(list, "size");
        sq8.m48649h(list2, "colors");
        sq8.m48649h(list3, "shapes");
        sq8.m48649h(sedVar, "position");
        sq8.m48649h(sueVar, "rotation");
        sq8.m48649h(j56Var, "emitter");
        return new izc(i, i2, f, f2, f3, list, list2, list3, j, z, sedVar, i3, sueVar, j56Var);
    }

    /* renamed from: c */
    public final int m32936c() {
        return this.f29410a;
    }

    /* renamed from: d */
    public final List m32937d() {
        return this.f29416g;
    }

    /* renamed from: e */
    public final float m32938e() {
        return this.f29414e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izc)) {
            return false;
        }
        izc izcVar = (izc) obj;
        return this.f29410a == izcVar.f29410a && this.f29411b == izcVar.f29411b && Float.compare(this.f29412c, izcVar.f29412c) == 0 && Float.compare(this.f29413d, izcVar.f29413d) == 0 && Float.compare(this.f29414e, izcVar.f29414e) == 0 && sq8.m48644c(this.f29415f, izcVar.f29415f) && sq8.m48644c(this.f29416g, izcVar.f29416g) && sq8.m48644c(this.f29417h, izcVar.f29417h) && this.f29418i == izcVar.f29418i && this.f29419j == izcVar.f29419j && sq8.m48644c(this.f29420k, izcVar.f29420k) && this.f29421l == izcVar.f29421l && sq8.m48644c(this.f29422m, izcVar.f29422m) && sq8.m48644c(this.f29423n, izcVar.f29423n);
    }

    /* renamed from: f */
    public final int m32939f() {
        return this.f29421l;
    }

    /* renamed from: g */
    public final j56 m32940g() {
        return this.f29423n;
    }

    /* renamed from: h */
    public final boolean m32941h() {
        return this.f29419j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((((((((((Integer.hashCode(this.f29410a) * 31) + Integer.hashCode(this.f29411b)) * 31) + Float.hashCode(this.f29412c)) * 31) + Float.hashCode(this.f29413d)) * 31) + Float.hashCode(this.f29414e)) * 31) + this.f29415f.hashCode()) * 31) + this.f29416g.hashCode()) * 31) + this.f29417h.hashCode()) * 31) + Long.hashCode(this.f29418i)) * 31;
        boolean z = this.f29419j;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((iHashCode + i) * 31) + this.f29420k.hashCode()) * 31) + Integer.hashCode(this.f29421l)) * 31) + this.f29422m.hashCode()) * 31) + this.f29423n.hashCode();
    }

    /* renamed from: i */
    public final float m32942i() {
        return this.f29413d;
    }

    /* renamed from: j */
    public final sed m32943j() {
        return this.f29420k;
    }

    /* renamed from: k */
    public final sue m32944k() {
        return this.f29422m;
    }

    /* renamed from: l */
    public final List m32945l() {
        return this.f29417h;
    }

    /* renamed from: m */
    public final List m32946m() {
        return this.f29415f;
    }

    /* renamed from: n */
    public final float m32947n() {
        return this.f29412c;
    }

    /* renamed from: o */
    public final int m32948o() {
        return this.f29411b;
    }

    /* renamed from: p */
    public final long m32949p() {
        return this.f29418i;
    }

    public String toString() {
        return "Party(angle=" + this.f29410a + ", spread=" + this.f29411b + ", speed=" + this.f29412c + ", maxSpeed=" + this.f29413d + ", damping=" + this.f29414e + ", size=" + this.f29415f + ", colors=" + this.f29416g + ", shapes=" + this.f29417h + ", timeToLive=" + this.f29418i + ", fadeOutEnabled=" + this.f29419j + ", position=" + this.f29420k + ", delay=" + this.f29421l + ", rotation=" + this.f29422m + ", emitter=" + this.f29423n + ")";
    }

    public /* synthetic */ izc(int i, int i2, float f, float f2, float f3, List list, List list2, List list3, long j, boolean z, sed sedVar, int i3, sue sueVar, j56 j56Var, int i4, id5 id5Var) {
        List listM21249n;
        boolean z2;
        sed c16820b;
        int i5 = (i4 & 1) != 0 ? 0 : i;
        int i6 = (i4 & 2) != 0 ? 360 : i2;
        float f4 = (i4 & 4) != 0 ? 30.0f : f;
        float f5 = (i4 & 8) != 0 ? 0.0f : f2;
        float f6 = (i4 & 16) != 0 ? 0.9f : f3;
        if ((i4 & 32) != 0) {
            gvf.C13826a c13826a = gvf.f25835d;
            listM21249n = ch3.m21249n(c13826a.m29547c(), c13826a.m29546b(), c13826a.m29545a());
        } else {
            listM21249n = list;
        }
        List listM21249n2 = (i4 & 64) != 0 ? ch3.m21249n(16572810, 16740973, 16003181, 11832815) : list2;
        List listM21249n3 = (i4 & 128) != 0 ? ch3.m21249n(wkf.C17923b.f52276a, wkf.C17922a.f52274a) : list3;
        long j2 = (i4 & 256) != 0 ? 2000L : j;
        boolean z3 = (i4 & 512) != 0 ? true : z;
        if ((i4 & 1024) != 0) {
            z2 = z3;
            c16820b = new sed.C16820b(0.5d, 0.5d);
        } else {
            z2 = z3;
            c16820b = sedVar;
        }
        this(i5, i6, f4, f5, f6, listM21249n, listM21249n2, listM21249n3, j2, z2, c16820b, (i4 & 2048) != 0 ? 0 : i3, (i4 & 4096) != 0 ? new sue(false, 0.0f, 0.0f, 0.0f, 0.0f, 31, null) : sueVar, j56Var);
    }
}
