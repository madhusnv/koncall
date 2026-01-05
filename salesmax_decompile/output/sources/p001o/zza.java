package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class zza extends pdd {

    /* renamed from: d */
    public static final C18736b f57929d = new C18736b(null);

    /* renamed from: o.zza$a */
    public static final class C18735a {

        /* renamed from: a */
        public String f57930a;

        /* renamed from: a */
        public final zza m60149a() {
            return new zza(this, null);
        }

        /* renamed from: b */
        public final C18735a m60150b() {
            return this;
        }

        /* renamed from: c */
        public final String m60151c() {
            return this.f57930a;
        }

        /* renamed from: d */
        public final void m60152d(String str) {
            this.f57930a = str;
        }
    }

    /* renamed from: o.zza$b */
    public static final class C18736b {
        public C18736b() {
        }

        public /* synthetic */ C18736b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ zza(C18735a c18735a, id5 id5Var) {
        this(c18735a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zza.class == obj.getClass() && sq8.m48644c(getMessage(), ((zza) obj).getMessage());
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxLexemeLengthExceededException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public zza(C18735a c18735a) {
        super(c18735a.m60151c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
