package p001o;

import p001o.dx7;

/* loaded from: classes3.dex */
public final class ah5 implements zrf {

    /* renamed from: b */
    public final uk7 f14708b;

    /* renamed from: o.ah5$a */
    public /* synthetic */ class C12170a extends dm7 implements uk7 {

        /* renamed from: a */
        public static final C12170a f14709a = new C12170a();

        public C12170a() {
            super(0, okf.class, "<init>", "<init>()V", 0);
        }

        @Override // p001o.uk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final okf invoke() {
            return new okf();
        }
    }

    /* renamed from: o.ah5$b */
    public /* synthetic */ class C12171b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14710a;

        static {
            int[] iArr = new int[t81.values().length];
            try {
                iArr[t81.HTTP_REQUEST_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14710a = iArr;
        }
    }

    public ah5(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "sha256Provider");
        this.f14708b = uk7Var;
    }

    /* renamed from: f */
    public static final byte[] m17049f(ah5 ah5Var, byte[] bArr, String str) {
        return zy7.m60082a(bArr, e9g.m24603u(str), ah5Var.f14708b);
    }

    @Override // p001o.zrf
    /* renamed from: a */
    public String mo17050a(byte[] bArr, String str) {
        sq8.m48649h(bArr, "signingKey");
        sq8.m48649h(str, "stringToSign");
        return gy7.m29642b(zy7.m60082a(bArr, e9g.m24603u(str), this.f14708b));
    }

    @Override // p001o.zrf
    /* renamed from: b */
    public String mo17051b(byte[] bArr, byte[] bArr2, z81 z81Var) {
        sq8.m48649h(bArr, "trailingHeaders");
        sq8.m48649h(bArr2, "prevSignature");
        sq8.m48649h(z81Var, "config");
        StringBuilder sb = new StringBuilder();
        sb.append("AWS4-HMAC-SHA256-TRAILER");
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(z81Var.m58892m().m28951d(vmh.ISO_8601_CONDENSED));
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(cc5.m20836b(z81Var));
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(e9g.m24600r(bArr2));
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(gy7.m29642b(bx7.m19910b(bArr, this.f14708b)));
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    @Override // p001o.zrf
    /* renamed from: c */
    public byte[] mo17052c(z81 z81Var) {
        sq8.m48649h(z81Var, "config");
        return m17049f(this, m17049f(this, m17049f(this, m17049f(this, e9g.m24603u("AWS4" + z81Var.m58881b().mo31896a()), z81Var.m58892m().m28951d(vmh.ISO_8601_CONDENSED_DATE)), z81Var.m58887h()), z81Var.m58888i()), "aws4_request");
    }

    @Override // p001o.zrf
    /* renamed from: d */
    public String mo17053d(byte[] bArr, byte[] bArr2, z81 z81Var) {
        sq8.m48649h(bArr, "chunkBody");
        sq8.m48649h(bArr2, "prevSignature");
        sq8.m48649h(z81Var, "config");
        StringBuilder sb = new StringBuilder();
        sb.append("AWS4-HMAC-SHA256-PAYLOAD");
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(z81Var.m58892m().m28951d(vmh.ISO_8601_CONDENSED));
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(cc5.m20836b(z81Var));
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(e9g.m24600r(bArr2));
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(C12171b.f14710a[z81Var.m58890k().ordinal()] == 1 ? asf.m17767b(z81Var.m58892m()) : dx7.C13051b.f20621b.m23921a());
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(gy7.m29642b(bx7.m19910b(bArr, this.f14708b)));
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    @Override // p001o.zrf
    /* renamed from: e */
    public String mo17054e(String str, z81 z81Var) {
        sq8.m48649h(str, "canonicalRequest");
        sq8.m48649h(z81Var, "config");
        StringBuilder sb = new StringBuilder();
        sb.append("AWS4-HMAC-SHA256");
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(z81Var.m58892m().m28951d(vmh.ISO_8601_CONDENSED));
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(cc5.m20836b(z81Var));
        sq8.m48648g(sb, "append(...)");
        sb.append('\n');
        sq8.m48648g(sb, "append(...)");
        sb.append(gy7.m29642b(bx7.m19910b(e9g.m24603u(str), this.f14708b)));
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public /* synthetic */ ah5(uk7 uk7Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? C12170a.f14709a : uk7Var);
    }
}
