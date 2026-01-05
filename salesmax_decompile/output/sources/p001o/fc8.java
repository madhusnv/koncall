package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class fc8 {

    /* renamed from: c */
    public static final C13400b f23129c = new C13400b(null);

    /* renamed from: a */
    public final byte[] f23130a;

    /* renamed from: b */
    public final rxe f23131b;

    /* renamed from: o.fc8$a */
    public static final class C13399a {

        /* renamed from: a */
        public byte[] f23132a;

        /* renamed from: b */
        public rxe f23133b;

        /* renamed from: a */
        public final fc8 m26445a() {
            return new fc8(this, null);
        }

        /* renamed from: b */
        public final byte[] m26446b() {
            return this.f23132a;
        }

        /* renamed from: c */
        public final rxe m26447c() {
            return this.f23133b;
        }

        /* renamed from: d */
        public final void m26448d(byte[] bArr) {
            this.f23132a = bArr;
        }

        /* renamed from: e */
        public final void m26449e(rxe rxeVar) {
            this.f23133b = rxeVar;
        }
    }

    /* renamed from: o.fc8$b */
    public static final class C13400b {
        public C13400b() {
        }

        public /* synthetic */ C13400b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final fc8 m26450a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C13399a c13399a = new C13399a();
            xk7Var.invoke(c13399a);
            return c13399a.m26445a();
        }
    }

    public /* synthetic */ fc8(C13399a c13399a, id5 id5Var) {
        this(c13399a);
    }

    /* renamed from: a */
    public final byte[] m26443a() {
        return this.f23130a;
    }

    /* renamed from: b */
    public final rxe m26444b() {
        return this.f23131b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fc8.class != obj.getClass()) {
            return false;
        }
        fc8 fc8Var = (fc8) obj;
        byte[] bArr = this.f23130a;
        if (bArr != null) {
            byte[] bArr2 = fc8Var.f23130a;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (fc8Var.f23130a != null) {
            return false;
        }
        return sq8.m48644c(this.f23131b, fc8Var.f23131b);
    }

    public int hashCode() {
        byte[] bArr = this.f23130a;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        rxe rxeVar = this.f23131b;
        return iHashCode + (rxeVar != null ? rxeVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Image(");
        sb.append("bytes=" + this.f23130a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("s3Object=");
        sb2.append(this.f23131b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fc8(C13399a c13399a) {
        this.f23130a = c13399a.m26446b();
        this.f23131b = c13399a.m26447c();
    }
}
