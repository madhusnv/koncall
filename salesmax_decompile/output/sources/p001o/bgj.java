package p001o;

/* loaded from: classes6.dex */
public abstract class bgj {

    /* renamed from: o.bgj$a */
    public static final class C12392a extends xle {

        /* renamed from: b */
        public final /* synthetic */ y9b f16199b;

        /* renamed from: c */
        public final /* synthetic */ int f16200c;

        /* renamed from: d */
        public final /* synthetic */ byte[] f16201d;

        /* renamed from: e */
        public final /* synthetic */ int f16202e;

        public C12392a(y9b y9bVar, int i, byte[] bArr, int i2) {
            this.f16199b = y9bVar;
            this.f16200c = i;
            this.f16201d = bArr;
            this.f16202e = i2;
        }

        @Override // p001o.xle
        /* renamed from: a */
        public long mo18953a() {
            return this.f16200c;
        }

        @Override // p001o.xle
        /* renamed from: b */
        public y9b mo18954b() {
            return this.f16199b;
        }

        @Override // p001o.xle
        /* renamed from: i */
        public void mo18955i(gm1 gm1Var) {
            sq8.m48649h(gm1Var, "sink");
            gm1Var.write(this.f16201d, this.f16202e, this.f16200c);
        }
    }

    /* renamed from: a */
    public static final boolean m18950a(xle xleVar) {
        sq8.m48649h(xleVar, "<this>");
        return false;
    }

    /* renamed from: b */
    public static final boolean m18951b(xle xleVar) {
        sq8.m48649h(xleVar, "<this>");
        return false;
    }

    /* renamed from: c */
    public static final xle m18952c(byte[] bArr, y9b y9bVar, int i, int i2) {
        sq8.m48649h(bArr, "<this>");
        ggj.m28625e(bArr.length, i, i2);
        return new C12392a(y9bVar, i2, bArr, i);
    }
}
