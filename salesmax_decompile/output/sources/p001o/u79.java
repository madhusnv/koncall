package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class u79 {

    /* renamed from: a */
    public final boolean f48474a;

    /* renamed from: b */
    public final boolean f48475b;

    /* renamed from: c */
    public final boolean f48476c;

    /* renamed from: d */
    public final boolean f48477d;

    /* renamed from: e */
    public final boolean f48478e;

    /* renamed from: f */
    public final boolean f48479f;

    /* renamed from: g */
    public final String f48480g;

    /* renamed from: h */
    public final boolean f48481h;

    /* renamed from: i */
    public final boolean f48482i;

    /* renamed from: j */
    public final String f48483j;

    /* renamed from: k */
    public final boolean f48484k;

    /* renamed from: l */
    public final boolean f48485l;

    /* renamed from: m */
    public final v99 f48486m;

    /* renamed from: n */
    public final boolean f48487n;

    /* renamed from: o */
    public final boolean f48488o;

    /* renamed from: p */
    public ea3 f48489p;

    public u79(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, v99 v99Var, boolean z11, boolean z12, ea3 ea3Var) {
        sq8.m48649h(str, "prettyPrintIndent");
        sq8.m48649h(str2, "classDiscriminator");
        sq8.m48649h(ea3Var, "classDiscriminatorMode");
        this.f48474a = z;
        this.f48475b = z2;
        this.f48476c = z3;
        this.f48477d = z4;
        this.f48478e = z5;
        this.f48479f = z6;
        this.f48480g = str;
        this.f48481h = z7;
        this.f48482i = z8;
        this.f48483j = str2;
        this.f48484k = z9;
        this.f48485l = z10;
        this.f48486m = v99Var;
        this.f48487n = z11;
        this.f48488o = z12;
        this.f48489p = ea3Var;
    }

    /* renamed from: a */
    public final boolean m51124a() {
        return this.f48484k;
    }

    /* renamed from: b */
    public final boolean m51125b() {
        return this.f48477d;
    }

    /* renamed from: c */
    public final boolean m51126c() {
        return this.f48488o;
    }

    /* renamed from: d */
    public final String m51127d() {
        return this.f48483j;
    }

    /* renamed from: e */
    public final ea3 m51128e() {
        return this.f48489p;
    }

    /* renamed from: f */
    public final boolean m51129f() {
        return this.f48481h;
    }

    /* renamed from: g */
    public final boolean m51130g() {
        return this.f48487n;
    }

    /* renamed from: h */
    public final boolean m51131h() {
        return this.f48474a;
    }

    /* renamed from: i */
    public final boolean m51132i() {
        return this.f48479f;
    }

    /* renamed from: j */
    public final boolean m51133j() {
        return this.f48475b;
    }

    /* renamed from: k */
    public final v99 m51134k() {
        return this.f48486m;
    }

    /* renamed from: l */
    public final boolean m51135l() {
        return this.f48478e;
    }

    /* renamed from: m */
    public final String m51136m() {
        return this.f48480g;
    }

    /* renamed from: n */
    public final boolean m51137n() {
        return this.f48485l;
    }

    /* renamed from: o */
    public final boolean m51138o() {
        return this.f48482i;
    }

    /* renamed from: p */
    public final boolean m51139p() {
        return this.f48476c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f48474a + ", ignoreUnknownKeys=" + this.f48475b + ", isLenient=" + this.f48476c + ", allowStructuredMapKeys=" + this.f48477d + ", prettyPrint=" + this.f48478e + ", explicitNulls=" + this.f48479f + ", prettyPrintIndent='" + this.f48480g + "', coerceInputValues=" + this.f48481h + ", useArrayPolymorphism=" + this.f48482i + ", classDiscriminator='" + this.f48483j + "', allowSpecialFloatingPointValues=" + this.f48484k + ", useAlternativeNames=" + this.f48485l + ", namingStrategy=" + this.f48486m + ", decodeEnumsCaseInsensitive=" + this.f48487n + ", allowTrailingComma=" + this.f48488o + ", classDiscriminatorMode=" + this.f48489p + ')';
    }

    public /* synthetic */ u79(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, v99 v99Var, boolean z11, boolean z12, ea3 ea3Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & 1024) != 0 ? false : z9, (i & 2048) == 0 ? z10 : true, (i & 4096) != 0 ? null : v99Var, (i & 8192) != 0 ? false : z11, (i & Opcodes.ACC_ENUM) != 0 ? false : z12, (i & 32768) != 0 ? ea3.POLYMORPHIC : ea3Var);
    }
}
