package p001o;

/* loaded from: classes5.dex */
public final class gna {

    /* renamed from: d */
    public static final C13794a f25558d = new C13794a(null);

    /* renamed from: a */
    public int[] f25559a;

    /* renamed from: b */
    public int f25560b;

    /* renamed from: c */
    public float[] f25561c;

    /* renamed from: o.gna$a */
    public static final class C13794a {
        public C13794a() {
        }

        public /* synthetic */ C13794a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final int m29156b(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i = iArr[0];
            dl8 it = new kl8(1, gp0.a0(iArr)).iterator();
            while (it.hasNext()) {
                i *= iArr[it.mo23412a()];
            }
            return i;
        }
    }

    public gna(int[] iArr) {
        sq8.m48649h(iArr, "shape");
        this.f25559a = iArr;
        int iM29156b = f25558d.m29156b(iArr);
        this.f25560b = iM29156b;
        this.f25561c = new float[iM29156b];
    }

    /* renamed from: a */
    public final float[] m29151a() {
        return this.f25561c;
    }

    /* renamed from: b */
    public final int m29152b(int i) {
        return this.f25559a[i];
    }

    /* renamed from: c */
    public final int m29153c() {
        return this.f25559a.length;
    }

    /* renamed from: d */
    public final void m29154d(int[] iArr) {
        sq8.m48649h(iArr, "shape");
        this.f25559a = iArr;
        int iM29156b = f25558d.m29156b(iArr);
        float[] fArr = new float[iM29156b];
        System.arraycopy(this.f25561c, 0, fArr, 0, Math.min(this.f25560b, iM29156b));
        this.f25561c = fArr;
        this.f25560b = iM29156b;
    }
}
