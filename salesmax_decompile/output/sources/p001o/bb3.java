package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class bb3 {

    /* renamed from: e */
    public static final bb3 f15846e = new C12336a().m18528b();

    /* renamed from: a */
    public final imh f15847a;

    /* renamed from: b */
    public final List f15848b;

    /* renamed from: c */
    public final ht7 f15849c;

    /* renamed from: d */
    public final String f15850d;

    /* renamed from: o.bb3$a */
    public static final class C12336a {

        /* renamed from: a */
        public imh f15851a = null;

        /* renamed from: b */
        public List f15852b = new ArrayList();

        /* renamed from: c */
        public ht7 f15853c = null;

        /* renamed from: d */
        public String f15854d = "";

        /* renamed from: a */
        public C12336a m18527a(kja kjaVar) {
            this.f15852b.add(kjaVar);
            return this;
        }

        /* renamed from: b */
        public bb3 m18528b() {
            return new bb3(this.f15851a, Collections.unmodifiableList(this.f15852b), this.f15853c, this.f15854d);
        }

        /* renamed from: c */
        public C12336a m18529c(String str) {
            this.f15854d = str;
            return this;
        }

        /* renamed from: d */
        public C12336a m18530d(ht7 ht7Var) {
            this.f15853c = ht7Var;
            return this;
        }

        /* renamed from: e */
        public C12336a m18531e(imh imhVar) {
            this.f15851a = imhVar;
            return this;
        }
    }

    public bb3(imh imhVar, List list, ht7 ht7Var, String str) {
        this.f15847a = imhVar;
        this.f15848b = list;
        this.f15849c = ht7Var;
        this.f15850d = str;
    }

    /* renamed from: e */
    public static C12336a m18521e() {
        return new C12336a();
    }

    /* renamed from: a */
    public String m18522a() {
        return this.f15850d;
    }

    /* renamed from: b */
    public ht7 m18523b() {
        return this.f15849c;
    }

    /* renamed from: c */
    public List m18524c() {
        return this.f15848b;
    }

    /* renamed from: d */
    public imh m18525d() {
        return this.f15847a;
    }

    /* renamed from: f */
    public byte[] m18526f() {
        return s1e.m47449a(this);
    }
}
