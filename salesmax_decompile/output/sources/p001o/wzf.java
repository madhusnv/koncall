package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class wzf {

    /* renamed from: a */
    public final ehh f52947a;

    /* renamed from: b */
    public final long f52948b;

    /* renamed from: c */
    public final ac7 f52949c;

    /* renamed from: d */
    public final String f52950d;

    /* renamed from: e */
    public final long f52951e;

    /* renamed from: f */
    public final if1 f52952f;

    /* renamed from: g */
    public final ihh f52953g;

    /* renamed from: h */
    public final oha f52954h;

    /* renamed from: i */
    public final long f52955i;

    /* renamed from: j */
    public final qgh f52956j;

    /* renamed from: k */
    public final skf f52957k;

    public /* synthetic */ wzf(long j, long j2, ac7 ac7Var, yb7 yb7Var, zb7 zb7Var, lb7 lb7Var, String str, long j3, if1 if1Var, ihh ihhVar, oha ohaVar, long j4, qgh qghVar, skf skfVar, u9d u9dVar, by5 by5Var, id5 id5Var) {
        this(j, j2, ac7Var, yb7Var, zb7Var, lb7Var, str, j3, if1Var, ihhVar, ohaVar, j4, qghVar, skfVar, u9dVar, by5Var);
    }

    /* renamed from: b */
    public static /* synthetic */ wzf m55490b(wzf wzfVar, long j, long j2, ac7 ac7Var, yb7 yb7Var, zb7 zb7Var, lb7 lb7Var, String str, long j3, if1 if1Var, ihh ihhVar, oha ohaVar, long j4, qgh qghVar, skf skfVar, u9d u9dVar, by5 by5Var, int i, Object obj) {
        yb7 yb7Var2;
        zb7 zb7Var2;
        lb7 lb7Var2;
        u9d u9dVar2;
        by5 by5Var2;
        long jM55496g = (i & 1) != 0 ? wzfVar.m55496g() : j;
        long j5 = (i & 2) != 0 ? wzfVar.f52948b : j2;
        ac7 ac7Var2 = (i & 4) != 0 ? wzfVar.f52949c : ac7Var;
        if ((i & 8) != 0) {
            wzfVar.getClass();
            yb7Var2 = null;
        } else {
            yb7Var2 = yb7Var;
        }
        if ((i & 16) != 0) {
            wzfVar.getClass();
            zb7Var2 = null;
        } else {
            zb7Var2 = zb7Var;
        }
        if ((i & 32) != 0) {
            wzfVar.getClass();
            lb7Var2 = null;
        } else {
            lb7Var2 = lb7Var;
        }
        String str2 = (i & 64) != 0 ? wzfVar.f52950d : str;
        long j6 = (i & 128) != 0 ? wzfVar.f52951e : j3;
        if1 if1Var2 = (i & 256) != 0 ? wzfVar.f52952f : if1Var;
        ihh ihhVar2 = (i & 512) != 0 ? wzfVar.f52953g : ihhVar;
        oha ohaVar2 = (i & 1024) != 0 ? wzfVar.f52954h : ohaVar;
        if1 if1Var3 = if1Var2;
        ihh ihhVar3 = ihhVar2;
        long j7 = (i & 2048) != 0 ? wzfVar.f52955i : j4;
        qgh qghVar2 = (i & 4096) != 0 ? wzfVar.f52956j : qghVar;
        skf skfVar2 = (i & 8192) != 0 ? wzfVar.f52957k : skfVar;
        if ((i & Opcodes.ACC_ENUM) != 0) {
            wzfVar.getClass();
            u9dVar2 = null;
        } else {
            u9dVar2 = u9dVar;
        }
        if ((i & 32768) != 0) {
            wzfVar.getClass();
            by5Var2 = null;
        } else {
            by5Var2 = by5Var;
        }
        return wzfVar.m55491a(jM55496g, j5, ac7Var2, yb7Var2, zb7Var2, lb7Var2, str2, j6, if1Var3, ihhVar3, ohaVar2, j7, qghVar2, skfVar2, u9dVar2, by5Var2);
    }

    /* renamed from: a */
    public final wzf m55491a(long j, long j2, ac7 ac7Var, yb7 yb7Var, zb7 zb7Var, lb7 lb7Var, String str, long j3, if1 if1Var, ihh ihhVar, oha ohaVar, long j4, qgh qghVar, skf skfVar, u9d u9dVar, by5 by5Var) {
        return new wzf(lh3.m37200i(j, m55496g()) ? this.f52947a : ehh.f21711a.m25089a(j), j2, ac7Var, yb7Var, zb7Var, lb7Var, str, j3, if1Var, ihhVar, ohaVar, j4, qghVar, skfVar, u9dVar, by5Var, (id5) null);
    }

    /* renamed from: c */
    public final float m55492c() {
        return this.f52947a.mo25087b();
    }

    /* renamed from: d */
    public final long m55493d() {
        return this.f52955i;
    }

    /* renamed from: e */
    public final if1 m55494e() {
        return this.f52952f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzf)) {
            return false;
        }
        wzf wzfVar = (wzf) obj;
        return m55508s(wzfVar) && m55509t(wzfVar);
    }

    /* renamed from: f */
    public final ql1 m55495f() {
        this.f52947a.mo25088c();
        return null;
    }

    /* renamed from: g */
    public final long m55496g() {
        return this.f52947a.mo25086a();
    }

    /* renamed from: h */
    public final lb7 m55497h() {
        return null;
    }

    public int hashCode() {
        int iM37206o = lh3.m37206o(m55496g()) * 31;
        m55495f();
        int iHashCode = (((((iM37206o + 0) * 31) + Float.hashCode(m55492c())) * 31) + bjh.m19258i(this.f52948b)) * 31;
        ac7 ac7Var = this.f52949c;
        int iHashCode2 = (((((((iHashCode + (ac7Var != null ? ac7Var.hashCode() : 0)) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f52950d;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + bjh.m19258i(this.f52951e)) * 31;
        if1 if1Var = this.f52952f;
        int iM32002d = (iHashCode3 + (if1Var != null ? if1.m32002d(if1Var.m32004f()) : 0)) * 31;
        ihh ihhVar = this.f52953g;
        int iHashCode4 = (iM32002d + (ihhVar != null ? ihhVar.hashCode() : 0)) * 31;
        oha ohaVar = this.f52954h;
        int iHashCode5 = (((iHashCode4 + (ohaVar != null ? ohaVar.hashCode() : 0)) * 31) + lh3.m37206o(this.f52955i)) * 31;
        qgh qghVar = this.f52956j;
        int iHashCode6 = (iHashCode5 + (qghVar != null ? qghVar.hashCode() : 0)) * 31;
        skf skfVar = this.f52957k;
        return ((((iHashCode6 + (skfVar != null ? skfVar.hashCode() : 0)) * 31) + 0) * 31) + 0;
    }

    /* renamed from: i */
    public final String m55498i() {
        return this.f52950d;
    }

    /* renamed from: j */
    public final long m55499j() {
        return this.f52948b;
    }

    /* renamed from: k */
    public final yb7 m55500k() {
        return null;
    }

    /* renamed from: l */
    public final zb7 m55501l() {
        return null;
    }

    /* renamed from: m */
    public final ac7 m55502m() {
        return this.f52949c;
    }

    /* renamed from: n */
    public final long m55503n() {
        return this.f52951e;
    }

    /* renamed from: o */
    public final oha m55504o() {
        return this.f52954h;
    }

    /* renamed from: p */
    public final skf m55505p() {
        return this.f52957k;
    }

    /* renamed from: q */
    public final qgh m55506q() {
        return this.f52956j;
    }

    /* renamed from: r */
    public final ihh m55507r() {
        return this.f52953g;
    }

    /* renamed from: s */
    public final boolean m55508s(wzf wzfVar) {
        sq8.m48649h(wzfVar, "other");
        if (this == wzfVar) {
            return true;
        }
        return bjh.m19254e(this.f52948b, wzfVar.f52948b) && sq8.m48644c(this.f52949c, wzfVar.f52949c) && sq8.m48644c(null, null) && sq8.m48644c(null, null) && sq8.m48644c(null, null) && sq8.m48644c(this.f52950d, wzfVar.f52950d) && bjh.m19254e(this.f52951e, wzfVar.f52951e) && sq8.m48644c(this.f52952f, wzfVar.f52952f) && sq8.m48644c(this.f52953g, wzfVar.f52953g) && sq8.m48644c(this.f52954h, wzfVar.f52954h) && lh3.m37200i(this.f52955i, wzfVar.f52955i) && sq8.m48644c(null, null);
    }

    /* renamed from: t */
    public final boolean m55509t(wzf wzfVar) {
        sq8.m48649h(wzfVar, "other");
        return sq8.m48644c(this.f52947a, wzfVar.f52947a) && sq8.m48644c(this.f52956j, wzfVar.f52956j) && sq8.m48644c(this.f52957k, wzfVar.f52957k) && sq8.m48644c(null, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpanStyle(color=");
        sb.append((Object) lh3.m37207p(m55496g()));
        sb.append(", brush=");
        m55495f();
        sb.append((Object) null);
        sb.append(", alpha=");
        sb.append(m55492c());
        sb.append(", fontSize=");
        sb.append((Object) bjh.m19259j(this.f52948b));
        sb.append(", fontWeight=");
        sb.append(this.f52949c);
        sb.append(", fontStyle=");
        sb.append((Object) null);
        sb.append(", fontSynthesis=");
        sb.append((Object) null);
        sb.append(", fontFamily=");
        sb.append((Object) null);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f52950d);
        sb.append(", letterSpacing=");
        sb.append((Object) bjh.m19259j(this.f52951e));
        sb.append(", baselineShift=");
        sb.append(this.f52952f);
        sb.append(", textGeometricTransform=");
        sb.append(this.f52953g);
        sb.append(", localeList=");
        sb.append(this.f52954h);
        sb.append(", background=");
        sb.append((Object) lh3.m37207p(this.f52955i));
        sb.append(", textDecoration=");
        sb.append(this.f52956j);
        sb.append(", shadow=");
        sb.append(this.f52957k);
        sb.append(", platformStyle=");
        sb.append((Object) null);
        sb.append(", drawStyle=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ wzf(ehh ehhVar, long j, ac7 ac7Var, yb7 yb7Var, zb7 zb7Var, lb7 lb7Var, String str, long j2, if1 if1Var, ihh ihhVar, oha ohaVar, long j3, qgh qghVar, skf skfVar, u9d u9dVar, by5 by5Var, id5 id5Var) {
        this(ehhVar, j, ac7Var, yb7Var, zb7Var, lb7Var, str, j2, if1Var, ihhVar, ohaVar, j3, qghVar, skfVar, u9dVar, by5Var);
    }

    public wzf(ehh ehhVar, long j, ac7 ac7Var, yb7 yb7Var, zb7 zb7Var, lb7 lb7Var, String str, long j2, if1 if1Var, ihh ihhVar, oha ohaVar, long j3, qgh qghVar, skf skfVar, u9d u9dVar, by5 by5Var) {
        sq8.m48649h(ehhVar, "textForegroundStyle");
        this.f52947a = ehhVar;
        this.f52948b = j;
        this.f52949c = ac7Var;
        this.f52950d = str;
        this.f52951e = j2;
        this.f52952f = if1Var;
        this.f52953g = ihhVar;
        this.f52954h = ohaVar;
        this.f52955i = j3;
        this.f52956j = qghVar;
        this.f52957k = skfVar;
    }

    public /* synthetic */ wzf(long j, long j2, ac7 ac7Var, yb7 yb7Var, zb7 zb7Var, lb7 lb7Var, String str, long j3, if1 if1Var, ihh ihhVar, oha ohaVar, long j4, qgh qghVar, skf skfVar, u9d u9dVar, by5 by5Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? lh3.f33793b.m37212d() : j, (i & 2) != 0 ? bjh.f16444b.m19261a() : j2, (i & 4) != 0 ? null : ac7Var, (i & 8) != 0 ? null : yb7Var, (i & 16) != 0 ? null : zb7Var, (i & 32) != 0 ? null : lb7Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? bjh.f16444b.m19261a() : j3, (i & 256) != 0 ? null : if1Var, (i & 512) != 0 ? null : ihhVar, (i & 1024) != 0 ? null : ohaVar, (i & 2048) != 0 ? lh3.f33793b.m37212d() : j4, (i & 4096) != 0 ? null : qghVar, (i & 8192) != 0 ? null : skfVar, (i & Opcodes.ACC_ENUM) != 0 ? null : u9dVar, (i & 32768) != 0 ? null : by5Var, (id5) null);
    }

    public wzf(long j, long j2, ac7 ac7Var, yb7 yb7Var, zb7 zb7Var, lb7 lb7Var, String str, long j3, if1 if1Var, ihh ihhVar, oha ohaVar, long j4, qgh qghVar, skf skfVar, u9d u9dVar, by5 by5Var) {
        this(ehh.f21711a.m25089a(j), j2, ac7Var, yb7Var, zb7Var, lb7Var, str, j3, if1Var, ihhVar, ohaVar, j4, qghVar, skfVar, u9dVar, by5Var, (id5) null);
    }
}
