package p001o;

/* loaded from: classes3.dex */
public abstract class m18 {
    public static final C15195c Companion = new C15195c(null);
    private final Long contentLength;
    private final boolean isDuplex;
    private final boolean isOneShot;

    /* renamed from: o.m18$a */
    public static abstract class AbstractC15193a extends m18 {

        /* renamed from: a */
        public final boolean f34630a;

        public AbstractC15193a() {
            super(null);
        }

        /* renamed from: a */
        public abstract byte[] mo38177a();

        @Override // p001o.m18
        public final boolean isOneShot() {
            return this.f34630a;
        }
    }

    /* renamed from: o.m18$b */
    public static abstract class AbstractC15194b extends m18 {
        public AbstractC15194b() {
            super(null);
        }

        public abstract y6f readFrom();
    }

    /* renamed from: o.m18$c */
    public static final class C15195c {
        public C15195c() {
        }

        public /* synthetic */ C15195c(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final m18 m38178a(byte[] bArr) {
            sq8.m48649h(bArr, "bytes");
            return new sp1(bArr);
        }
    }

    /* renamed from: o.m18$d */
    public static final class C15196d extends m18 {

        /* renamed from: a */
        public static final C15196d f34631a = new C15196d();

        /* renamed from: b */
        public static final boolean f34632b = false;

        /* renamed from: c */
        public static final long f34633c = 0;

        public C15196d() {
            super(null);
        }

        @Override // p001o.m18
        public boolean equals(Object obj) {
            if (obj instanceof m18) {
                Long contentLength = ((m18) obj).getContentLength();
                long jLongValue = getContentLength().longValue();
                if (contentLength != null && contentLength.longValue() == jLongValue) {
                    return true;
                }
            }
            return false;
        }

        @Override // p001o.m18
        public Long getContentLength() {
            return Long.valueOf(f34633c);
        }

        @Override // p001o.m18
        public final boolean isOneShot() {
            return f34632b;
        }
    }

    /* renamed from: o.m18$e */
    public static abstract class AbstractC15197e extends m18 {
        public AbstractC15197e() {
            super(null);
        }

        public abstract h8f readFrom();
    }

    public /* synthetic */ m18(id5 id5Var) {
        this();
    }

    public boolean equals(Object obj) {
        if (obj instanceof m18) {
            m18 m18Var = (m18) obj;
            if (sq8.m48644c(m18Var.getContentLength(), getContentLength()) && m18Var.isOneShot() == isOneShot() && m18Var.isDuplex() == isDuplex()) {
                return true;
            }
        }
        return false;
    }

    public abstract Long getContentLength();

    public boolean isDuplex() {
        return this.isDuplex;
    }

    public boolean isOneShot() {
        return this.isOneShot;
    }

    public m18() {
        this.isOneShot = true;
    }
}
