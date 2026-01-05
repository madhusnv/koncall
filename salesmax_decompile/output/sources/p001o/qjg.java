package p001o;

/* loaded from: classes2.dex */
public final class qjg {

    /* renamed from: e */
    public static final qjg f42075e;

    /* renamed from: f */
    public static final qjg f42076f;

    /* renamed from: g */
    public static final qjg f42077g;

    /* renamed from: h */
    public static final qjg f42078h;

    /* renamed from: i */
    public static final qjg f42079i;

    /* renamed from: j */
    public static final qjg f42080j;

    /* renamed from: a */
    public final float[] f42081a;

    /* renamed from: b */
    public final float[] f42082b;

    /* renamed from: c */
    public final float[] f42083c = new float[3];

    /* renamed from: d */
    public boolean f42084d = true;

    static {
        qjg qjgVar = new qjg();
        f42075e = qjgVar;
        m45554m(qjgVar);
        m45557p(qjgVar);
        qjg qjgVar2 = new qjg();
        f42076f = qjgVar2;
        m45556o(qjgVar2);
        m45557p(qjgVar2);
        qjg qjgVar3 = new qjg();
        f42077g = qjgVar3;
        m45553l(qjgVar3);
        m45557p(qjgVar3);
        qjg qjgVar4 = new qjg();
        f42078h = qjgVar4;
        m45554m(qjgVar4);
        m45555n(qjgVar4);
        qjg qjgVar5 = new qjg();
        f42079i = qjgVar5;
        m45556o(qjgVar5);
        m45555n(qjgVar5);
        qjg qjgVar6 = new qjg();
        f42080j = qjgVar6;
        m45553l(qjgVar6);
        m45555n(qjgVar6);
    }

    public qjg() {
        float[] fArr = new float[3];
        this.f42081a = fArr;
        float[] fArr2 = new float[3];
        this.f42082b = fArr2;
        m45558r(fArr);
        m45558r(fArr2);
        m45570q();
    }

    /* renamed from: l */
    public static void m45553l(qjg qjgVar) {
        float[] fArr = qjgVar.f42082b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: m */
    public static void m45554m(qjg qjgVar) {
        float[] fArr = qjgVar.f42082b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: n */
    public static void m45555n(qjg qjgVar) {
        float[] fArr = qjgVar.f42081a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: o */
    public static void m45556o(qjg qjgVar) {
        float[] fArr = qjgVar.f42082b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: p */
    public static void m45557p(qjg qjgVar) {
        float[] fArr = qjgVar.f42081a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: r */
    public static void m45558r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public float m45559a() {
        return this.f42083c[1];
    }

    /* renamed from: b */
    public float m45560b() {
        return this.f42082b[2];
    }

    /* renamed from: c */
    public float m45561c() {
        return this.f42081a[2];
    }

    /* renamed from: d */
    public float m45562d() {
        return this.f42082b[0];
    }

    /* renamed from: e */
    public float m45563e() {
        return this.f42081a[0];
    }

    /* renamed from: f */
    public float m45564f() {
        return this.f42083c[2];
    }

    /* renamed from: g */
    public float m45565g() {
        return this.f42083c[0];
    }

    /* renamed from: h */
    public float m45566h() {
        return this.f42082b[1];
    }

    /* renamed from: i */
    public float m45567i() {
        return this.f42081a[1];
    }

    /* renamed from: j */
    public boolean m45568j() {
        return this.f42084d;
    }

    /* renamed from: k */
    public void m45569k() {
        int length = this.f42083c.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.f42083c[i];
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length2 = this.f42083c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f42083c;
                float f3 = fArr[i2];
                if (f3 > 0.0f) {
                    fArr[i2] = f3 / f;
                }
            }
        }
    }

    /* renamed from: q */
    public final void m45570q() {
        float[] fArr = this.f42083c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
