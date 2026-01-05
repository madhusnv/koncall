package p001o;

import com.apollographql.apollo.api.ResponseField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.uef;

/* loaded from: classes6.dex */
public final class wef implements uef, js1 {

    /* renamed from: a */
    public final String f51861a;

    /* renamed from: b */
    public final bff f51862b;

    /* renamed from: c */
    public final int f51863c;

    /* renamed from: d */
    public final List f51864d;

    /* renamed from: e */
    public final Set f51865e;

    /* renamed from: f */
    public final String[] f51866f;

    /* renamed from: g */
    public final uef[] f51867g;

    /* renamed from: h */
    public final List[] f51868h;

    /* renamed from: i */
    public final boolean[] f51869i;

    /* renamed from: j */
    public final Map f51870j;

    /* renamed from: k */
    public final uef[] f51871k;

    /* renamed from: l */
    public final gi9 f51872l;

    /* renamed from: o.wef$a */
    public static final class C17830a extends kf9 implements uk7 {
        public C17830a() {
            super(0);
        }

        @Override // p001o.uk7
        public final Integer invoke() {
            wef wefVar = wef.this;
            return Integer.valueOf(vbd.m52508a(wefVar, wefVar.f51871k));
        }
    }

    /* renamed from: o.wef$b */
    public static final class C17831b extends kf9 implements xk7 {
        public C17831b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m54273a(int i) {
            return wef.this.mo16763e(i) + ": " + wef.this.mo16765g(i).mo16766h();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m54273a(((Number) obj).intValue());
        }
    }

    public wef(String str, bff bffVar, int i, List list, ga3 ga3Var) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(bffVar, ResponseField.VARIABLE_IDENTIFIER_KEY);
        sq8.m48649h(list, "typeParameters");
        sq8.m48649h(ga3Var, "builder");
        this.f51861a = str;
        this.f51862b = bffVar;
        this.f51863c = i;
        this.f51864d = ga3Var.m28279c();
        this.f51865e = kh3.O0(ga3Var.m28282f());
        String[] strArr = (String[]) ga3Var.m28282f().toArray(new String[0]);
        this.f51866f = strArr;
        this.f51867g = had.m30143b(ga3Var.m28281e());
        this.f51868h = (List[]) ga3Var.m28280d().toArray(new List[0]);
        this.f51869i = kh3.K0(ga3Var.m28283g());
        Iterable<yh8> iterableL0 = gp0.L0(strArr);
        ArrayList arrayList = new ArrayList(dh3.m23088v(iterableL0, 10));
        for (yh8 yh8Var : iterableL0) {
            arrayList.add(vyh.m53620a(yh8Var.m57817b(), Integer.valueOf(yh8Var.m57816a())));
        }
        this.f51870j = isa.m32691r(arrayList);
        this.f51871k = had.m30143b(list);
        this.f51872l = si9.m48360a(new C17830a());
    }

    @Override // p001o.js1
    /* renamed from: a */
    public Set mo34452a() {
        return this.f51865e;
    }

    @Override // p001o.uef
    /* renamed from: b */
    public boolean mo16760b() {
        return uef.C17369a.m51455c(this);
    }

    @Override // p001o.uef
    /* renamed from: c */
    public int mo16761c(String str) {
        sq8.m48649h(str, "name");
        Integer num = (Integer) this.f51870j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p001o.uef
    /* renamed from: d */
    public int mo16762d() {
        return this.f51863c;
    }

    @Override // p001o.uef
    /* renamed from: e */
    public String mo16763e(int i) {
        return this.f51866f[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wef) {
            uef uefVar = (uef) obj;
            if (sq8.m48644c(mo16766h(), uefVar.mo16766h()) && Arrays.equals(this.f51871k, ((wef) obj).f51871k) && mo16762d() == uefVar.mo16762d()) {
                int iMo16762d = mo16762d();
                for (int i = 0; i < iMo16762d; i++) {
                    if (sq8.m48644c(mo16765g(i).mo16766h(), uefVar.mo16765g(i).mo16766h()) && sq8.m48644c(mo16765g(i).getKind(), uefVar.mo16765g(i).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p001o.uef
    /* renamed from: f */
    public List mo16764f(int i) {
        return this.f51868h[i];
    }

    @Override // p001o.uef
    /* renamed from: g */
    public uef mo16765g(int i) {
        return this.f51867g[i];
    }

    @Override // p001o.uef
    public List getAnnotations() {
        return this.f51864d;
    }

    @Override // p001o.uef
    public bff getKind() {
        return this.f51862b;
    }

    @Override // p001o.uef
    /* renamed from: h */
    public String mo16766h() {
        return this.f51861a;
    }

    public int hashCode() {
        return m54272k();
    }

    @Override // p001o.uef
    /* renamed from: i */
    public boolean mo16767i(int i) {
        return this.f51869i[i];
    }

    @Override // p001o.uef
    public boolean isInline() {
        return uef.C17369a.m51454b(this);
    }

    /* renamed from: k */
    public final int m54272k() {
        return ((Number) this.f51872l.getValue()).intValue();
    }

    public String toString() {
        return kh3.p0(bce.m18616s(0, mo16762d()), ", ", mo16766h() + '(', ")", 0, null, new C17831b(), 24, null);
    }
}
