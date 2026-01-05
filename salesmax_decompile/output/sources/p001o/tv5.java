package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class tv5 {

    /* renamed from: b */
    public static final C17240b f47952b = new C17240b(null);

    /* renamed from: a */
    public final byte[] f47953a;

    /* renamed from: o.tv5$a */
    public static final class C17239a {

        /* renamed from: a */
        public byte[] f47954a;

        /* renamed from: a */
        public final tv5 m50706a() {
            return new tv5(this, null);
        }

        /* renamed from: b */
        public final byte[] m50707b() {
            return this.f47954a;
        }

        /* renamed from: c */
        public final sxe m50708c() {
            return null;
        }

        /* renamed from: d */
        public final void m50709d(byte[] bArr) {
            this.f47954a = bArr;
        }
    }

    /* renamed from: o.tv5$b */
    public static final class C17240b {
        public C17240b() {
        }

        public /* synthetic */ C17240b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final tv5 m50710a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C17239a c17239a = new C17239a();
            xk7Var.invoke(c17239a);
            return c17239a.m50706a();
        }
    }

    public /* synthetic */ tv5(C17239a c17239a, id5 id5Var) {
        this(c17239a);
    }

    /* renamed from: a */
    public final byte[] m50704a() {
        return this.f47953a;
    }

    /* renamed from: b */
    public final sxe m50705b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tv5.class != obj.getClass()) {
            return false;
        }
        tv5 tv5Var = (tv5) obj;
        byte[] bArr = this.f47953a;
        if (bArr != null) {
            byte[] bArr2 = tv5Var.f47953a;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (tv5Var.f47953a != null) {
            return false;
        }
        return sq8.m48644c(null, null);
    }

    public int hashCode() {
        byte[] bArr = this.f47953a;
        return ((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Document(");
        sb.append("bytes=" + this.f47953a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("s3Object=");
        sb2.append((Object) null);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public tv5(C17239a c17239a) {
        this.f47953a = c17239a.m50707b();
        c17239a.m50708c();
    }
}
