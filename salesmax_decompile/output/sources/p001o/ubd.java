package p001o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.p9g;
import p001o.uef;

/* loaded from: classes6.dex */
public class ubd implements uef, js1 {

    /* renamed from: a */
    public final String f48672a;

    /* renamed from: b */
    public final yn7 f48673b;

    /* renamed from: c */
    public final int f48674c;

    /* renamed from: d */
    public int f48675d;

    /* renamed from: e */
    public final String[] f48676e;

    /* renamed from: f */
    public final List[] f48677f;

    /* renamed from: g */
    public List f48678g;

    /* renamed from: h */
    public final boolean[] f48679h;

    /* renamed from: i */
    public Map f48680i;

    /* renamed from: j */
    public final gi9 f48681j;

    /* renamed from: k */
    public final gi9 f48682k;

    /* renamed from: l */
    public final gi9 f48683l;

    /* renamed from: o.ubd$a */
    public static final class C17348a extends kf9 implements uk7 {
        public C17348a() {
            super(0);
        }

        @Override // p001o.uk7
        public final Integer invoke() {
            ubd ubdVar = ubd.this;
            return Integer.valueOf(vbd.m52508a(ubdVar, ubdVar.m51341o()));
        }
    }

    /* renamed from: o.ubd$b */
    public static final class C17349b extends kf9 implements uk7 {
        public C17349b() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dc9[] invoke() {
            dc9[] dc9VarArrChildSerializers;
            yn7 yn7Var = ubd.this.f48673b;
            return (yn7Var == null || (dc9VarArrChildSerializers = yn7Var.childSerializers()) == null) ? wbd.f51731a : dc9VarArrChildSerializers;
        }
    }

    /* renamed from: o.ubd$c */
    public static final class C17350c extends kf9 implements xk7 {
        public C17350c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m51346a(int i) {
            return ubd.this.mo16763e(i) + ": " + ubd.this.mo16765g(i).mo16766h();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m51346a(((Number) obj).intValue());
        }
    }

    /* renamed from: o.ubd$d */
    public static final class C17351d extends kf9 implements uk7 {
        public C17351d() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uef[] invoke() {
            ArrayList arrayList;
            dc9[] dc9VarArrTypeParametersSerializers;
            yn7 yn7Var = ubd.this.f48673b;
            if (yn7Var == null || (dc9VarArrTypeParametersSerializers = yn7Var.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(dc9VarArrTypeParametersSerializers.length);
                for (dc9 dc9Var : dc9VarArrTypeParametersSerializers) {
                    arrayList.add(dc9Var.getDescriptor());
                }
            }
            return had.m30143b(arrayList);
        }
    }

    public ubd(String str, yn7 yn7Var, int i) {
        sq8.m48649h(str, "serialName");
        this.f48672a = str;
        this.f48673b = yn7Var;
        this.f48674c = i;
        this.f48675d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f48676e = strArr;
        int i3 = this.f48674c;
        this.f48677f = new List[i3];
        this.f48679h = new boolean[i3];
        this.f48680i = isa.m32681h();
        cj9 cj9Var = cj9.PUBLICATION;
        this.f48681j = si9.m48361b(cj9Var, new C17349b());
        this.f48682k = si9.m48361b(cj9Var, new C17351d());
        this.f48683l = si9.m48361b(cj9Var, new C17348a());
    }

    /* renamed from: l */
    public static /* synthetic */ void m51337l(ubd ubdVar, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        ubdVar.m51338k(str, z);
    }

    @Override // p001o.js1
    /* renamed from: a */
    public Set mo34452a() {
        return this.f48680i.keySet();
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
        Integer num = (Integer) this.f48680i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p001o.uef
    /* renamed from: d */
    public final int mo16762d() {
        return this.f48674c;
    }

    @Override // p001o.uef
    /* renamed from: e */
    public String mo16763e(int i) {
        return this.f48676e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ubd) {
            uef uefVar = (uef) obj;
            if (sq8.m48644c(mo16766h(), uefVar.mo16766h()) && Arrays.equals(m51341o(), ((ubd) obj).m51341o()) && mo16762d() == uefVar.mo16762d()) {
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
        List list = this.f48677f[i];
        return list == null ? ch3.m21246k() : list;
    }

    @Override // p001o.uef
    /* renamed from: g */
    public uef mo16765g(int i) {
        return m51340n()[i].getDescriptor();
    }

    @Override // p001o.uef
    public List getAnnotations() {
        List list = this.f48678g;
        return list == null ? ch3.m21246k() : list;
    }

    @Override // p001o.uef
    public bff getKind() {
        return p9g.C16037a.f39681a;
    }

    @Override // p001o.uef
    /* renamed from: h */
    public String mo16766h() {
        return this.f48672a;
    }

    public int hashCode() {
        return m51342p();
    }

    @Override // p001o.uef
    /* renamed from: i */
    public boolean mo16767i(int i) {
        return this.f48679h[i];
    }

    @Override // p001o.uef
    public boolean isInline() {
        return uef.C17369a.m51454b(this);
    }

    /* renamed from: k */
    public final void m51338k(String str, boolean z) {
        sq8.m48649h(str, "name");
        String[] strArr = this.f48676e;
        int i = this.f48675d + 1;
        this.f48675d = i;
        strArr[i] = str;
        this.f48679h[i] = z;
        this.f48677f[i] = null;
        if (i == this.f48674c - 1) {
            this.f48680i = m51339m();
        }
    }

    /* renamed from: m */
    public final Map m51339m() {
        HashMap map = new HashMap();
        int length = this.f48676e.length;
        for (int i = 0; i < length; i++) {
            map.put(this.f48676e[i], Integer.valueOf(i));
        }
        return map;
    }

    /* renamed from: n */
    public final dc9[] m51340n() {
        return (dc9[]) this.f48681j.getValue();
    }

    /* renamed from: o */
    public final uef[] m51341o() {
        return (uef[]) this.f48682k.getValue();
    }

    /* renamed from: p */
    public final int m51342p() {
        return ((Number) this.f48683l.getValue()).intValue();
    }

    /* renamed from: q */
    public final void m51343q(Annotation annotation) {
        sq8.m48649h(annotation, "annotation");
        List arrayList = this.f48677f[this.f48675d];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.f48677f[this.f48675d] = arrayList;
        }
        arrayList.add(annotation);
    }

    /* renamed from: r */
    public final void m51344r(Annotation annotation) {
        sq8.m48649h(annotation, "a");
        if (this.f48678g == null) {
            this.f48678g = new ArrayList(1);
        }
        List list = this.f48678g;
        sq8.m48646e(list);
        list.add(annotation);
    }

    public String toString() {
        return kh3.p0(bce.m18616s(0, this.f48674c), ", ", mo16766h() + '(', ")", 0, null, new C17350c(), 24, null);
    }

    public /* synthetic */ ubd(String str, yn7 yn7Var, int i, int i2, id5 id5Var) {
        this(str, (i2 & 2) != 0 ? null : yn7Var, i);
    }
}
