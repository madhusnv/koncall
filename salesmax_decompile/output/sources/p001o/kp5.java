package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class kp5 {

    /* renamed from: b */
    public static final C14896b f32527b = new C14896b(null);

    /* renamed from: a */
    public final List f32528a;

    /* renamed from: o.kp5$a */
    public static final class C14895a {

        /* renamed from: a */
        public List f32529a;

        /* renamed from: a */
        public final kp5 m35999a() {
            return new kp5(this, null);
        }

        /* renamed from: b */
        public final C14895a m36000b() {
            return this;
        }

        /* renamed from: c */
        public final List m36001c() {
            return this.f32529a;
        }

        /* renamed from: d */
        public final void m36002d(List list) {
            this.f32529a = list;
        }
    }

    /* renamed from: o.kp5$b */
    public static final class C14896b {
        public C14896b() {
        }

        public /* synthetic */ C14896b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ kp5(C14895a c14895a, id5 id5Var) {
        this(c14895a);
    }

    /* renamed from: a */
    public final List m35998a() {
        return this.f32528a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kp5.class == obj.getClass() && sq8.m48644c(this.f32528a, ((kp5) obj).f32528a);
    }

    public int hashCode() {
        List list = this.f32528a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = "DetectSyntaxResponse(*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public kp5(C14895a c14895a) {
        this.f32528a = c14895a.m36001c();
    }
}
