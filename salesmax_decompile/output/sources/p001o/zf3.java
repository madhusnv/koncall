package p001o;

/* loaded from: classes3.dex */
public final class zf3 {

    /* renamed from: b */
    public static final C18628b f57121b = new C18628b(null);

    /* renamed from: a */
    public final String f57122a;

    /* renamed from: o.zf3$a */
    public static final class C18627a {

        /* renamed from: a */
        public String f57123a;

        /* renamed from: a */
        public final zf3 m59372a() {
            return new zf3(this, null);
        }

        /* renamed from: b */
        public final String m59373b() {
            return this.f57123a;
        }

        /* renamed from: c */
        public final void m59374c(String str) {
            this.f57123a = str;
        }
    }

    /* renamed from: o.zf3$b */
    public static final class C18628b {
        public C18628b() {
        }

        public /* synthetic */ C18628b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ zf3(C18627a c18627a, id5 id5Var) {
        this(c18627a);
    }

    /* renamed from: a */
    public final String m59371a() {
        return this.f57122a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zf3) && sq8.m48644c(this.f57122a, ((zf3) obj).f57122a);
    }

    public int hashCode() {
        String str = this.f57122a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CognitoIdentityAuthSchemeParameters(");
        sb.append("operationName=" + this.f57122a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public zf3(C18627a c18627a) {
        String strM59373b = c18627a.m59373b();
        if (strM59373b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f57122a = strM59373b;
    }
}
