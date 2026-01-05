package p001o;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p001o.zue;

/* loaded from: classes3.dex */
public abstract class bza {

    /* renamed from: a */
    public static final m74 f17001a = new m74(0.15f, 0.0f);

    /* renamed from: b */
    public static final m74 f17002b = new m74(0.2f, 0.0f);

    /* renamed from: c */
    public static final m74 f17003c = new m74(0.3f, 0.0f);

    /* renamed from: d */
    public static final m74 f17004d = new m74(0.5f, 0.0f);

    /* renamed from: e */
    public static final m74 f17005e = new m74(1.0f, 0.0f);

    /* renamed from: f */
    public static final zue f17006f = m19944P(m19959i(), true);

    /* renamed from: g */
    public static final zue f17007g = m19944P(m19939K(), true);

    /* renamed from: h */
    public static final zue f17008h = m19944P(m19936H(), true);

    /* renamed from: i */
    public static final zue f17009i = m19944P(m19954d(), true);

    /* renamed from: j */
    public static final zue f17010j = m19944P(m19969s(), true);

    /* renamed from: k */
    public static final zue f17011k = m19944P(m19955e(), true);

    /* renamed from: l */
    public static final zue f17012l = m19944P(m19935G(), true);

    /* renamed from: m */
    public static final zue f17013m = m19944P(m19976z(-45.0f), true);

    /* renamed from: n */
    public static final zue f17014n = m19944P(m19930B(), true);

    /* renamed from: o */
    public static final zue f17015o = m19944P(m19942N(-90.0f), true);

    /* renamed from: p */
    public static final zue f17016p = m19944P(m19968r(), true);

    /* renamed from: q */
    public static final zue f17017q = m19944P(m19960j(), true);

    /* renamed from: r */
    public static final zue f17018r = m19944P(m19929A(), true);

    /* renamed from: s */
    public static final zue f17019s = m19944P(m19972v(-90.0f), true);

    /* renamed from: t */
    public static final zue f17020t = m19944P(m19940L(), true);

    /* renamed from: u */
    public static final zue f17021u = m19944P(m19943O(), true);

    /* renamed from: v */
    public static final zue f17022v = m19944P(m19964n(), true);

    /* renamed from: w */
    public static final zue f17023w = m19944P(m19965o(), true);

    /* renamed from: x */
    public static final zue f17024x = m19944P(m19966p(), true);

    /* renamed from: y */
    public static final zue f17025y = m19944P(m19967q(), true);

    /* renamed from: z */
    public static final zue f17026z = m19944P(m19963m(), true);

    /* renamed from: A */
    public static final zue f16987A = m19944P(m19973w(), true);

    /* renamed from: B */
    public static final zue f16988B = m19944P(m19961k(), true);

    /* renamed from: C */
    public static final zue f16989C = m19944P(m19962l(), true);

    /* renamed from: D */
    public static final zue f16990D = m19944P(m19958h(), true);

    /* renamed from: E */
    public static final zue f16991E = m19944P(m19938J(), true);

    /* renamed from: F */
    public static final zue f16992F = m19944P(m19956f(), true);

    /* renamed from: G */
    public static final zue f16993G = m19944P(m19937I(), true);

    /* renamed from: H */
    public static final zue f16994H = m19944P(m19970t(), true);

    /* renamed from: I */
    public static final zue f16995I = m19944P(m19933E(), true);

    /* renamed from: J */
    public static final zue f16996J = m19944P(m19934F(), true);

    /* renamed from: K */
    public static final zue f16997K = m19944P(m19931C(), true);

    /* renamed from: L */
    public static final zue f16998L = m19944P(m19932D(), true);

    /* renamed from: M */
    public static final zue f16999M = m19944P(m19957g(), true);

    /* renamed from: N */
    public static final zue f17000N = m19944P(m19974x(), true);

    /* renamed from: A */
    public static zue m19929A() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, -0.009f), new m74(0.172f, 0.0f)));
        return m19953c(arrayList, 5, 0.5f, 0.5f, false);
    }

    /* renamed from: B */
    public static zue m19930B() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.961f, 0.039f), new m74(0.426f, 0.0f)));
        arrayList.add(new C12519b(new PointF(1.001f, 0.428f)));
        arrayList.add(new C12519b(new PointF(1.0f, 0.609f), f17005e));
        return m19953c(arrayList, 2, 0.5f, 0.5f, true);
    }

    /* renamed from: C */
    public static zue m19931C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.704f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.704f, 0.065f)));
        arrayList.add(new C12519b(new PointF(0.843f, 0.065f)));
        arrayList.add(new C12519b(new PointF(0.843f, 0.148f)));
        arrayList.add(new C12519b(new PointF(0.926f, 0.148f)));
        arrayList.add(new C12519b(new PointF(0.926f, 0.296f)));
        arrayList.add(new C12519b(new PointF(1.0f, 0.296f)));
        return m19953c(arrayList, 2, 0.5f, 0.5f, true);
    }

    /* renamed from: D */
    public static zue m19932D() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.11f, 0.5f)));
        arrayList.add(new C12519b(new PointF(0.113f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.287f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.287f, 0.087f)));
        arrayList.add(new C12519b(new PointF(0.421f, 0.087f)));
        arrayList.add(new C12519b(new PointF(0.421f, 0.17f)));
        arrayList.add(new C12519b(new PointF(0.56f, 0.17f)));
        arrayList.add(new C12519b(new PointF(0.56f, 0.265f)));
        arrayList.add(new C12519b(new PointF(0.674f, 0.265f)));
        arrayList.add(new C12519b(new PointF(0.675f, 0.344f)));
        arrayList.add(new C12519b(new PointF(0.789f, 0.344f)));
        arrayList.add(new C12519b(new PointF(0.789f, 0.439f)));
        arrayList.add(new C12519b(new PointF(0.888f, 0.439f)));
        return m19953c(arrayList, 1, 0.5f, 0.5f, true);
    }

    /* renamed from: E */
    public static zue m19933E() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, 0.053f)));
        arrayList.add(new C12519b(new PointF(0.545f, -0.04f), new m74(0.405f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.67f, -0.035f), new m74(0.426f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.717f, 0.066f), new m74(0.574f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.722f, 0.128f)));
        arrayList.add(new C12519b(new PointF(0.777f, 0.002f), new m74(0.36f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.914f, 0.149f), new m74(0.66f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.926f, 0.289f), new m74(0.66f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.881f, 0.346f)));
        arrayList.add(new C12519b(new PointF(0.94f, 0.344f), new m74(0.126f, 0.0f)));
        arrayList.add(new C12519b(new PointF(1.003f, 0.437f), new m74(0.255f, 0.0f)));
        return wlf.m54689c(m19953c(arrayList, 2, 0.5f, 0.5f, true), m19952b(1.0f, 0.742f));
    }

    /* renamed from: F */
    public static zue m19934F() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.87f, 0.13f), new m74(0.146f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.818f, 0.357f)));
        arrayList.add(new C12519b(new PointF(1.0f, 0.332f), new m74(0.853f, 0.0f)));
        return m19953c(arrayList, 4, 0.5f, 0.5f, true);
    }

    /* renamed from: G */
    public static zue m19935G() {
        zue.C18710a c18710a = zue.f57721e;
        m74 m74Var = m74.f34920d;
        m74 m74Var2 = f17002b;
        m74 m74Var3 = f17005e;
        return vlf.m52953e(c18710a, 1.6f, 1.0f, m74Var, Arrays.asList(m74Var2, m74Var2, m74Var3, m74Var3), 0.0f, 0.0f);
    }

    /* renamed from: H */
    public static zue m19936H() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.926f, 0.97f), new m74(0.189f, 0.811f)));
        arrayList.add(new C12519b(new PointF(-0.021f, 0.967f), new m74(0.187f, 0.057f)));
        return m19953c(arrayList, 2, 0.5f, 0.5f, false);
    }

    /* renamed from: I */
    public static zue m19937I() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.733f, 0.454f)));
        arrayList.add(new C12519b(new PointF(0.839f, 0.437f), new m74(0.532f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.949f, 0.449f), new m74(0.439f, 1.0f)));
        arrayList.add(new C12519b(new PointF(0.998f, 0.478f), new m74(0.174f, 0.0f)));
        return m19953c(arrayList, 16, 0.5f, 0.5f, true);
    }

    /* renamed from: J */
    public static zue m19938J() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.193f, 0.277f), new m74(0.053f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.176f, 0.055f), new m74(0.053f, 0.0f)));
        return m19953c(arrayList, 10, 0.5f, 0.5f, false);
    }

    /* renamed from: K */
    public static zue m19939K() {
        return vlf.m52953e(zue.f57721e, 1.0f, 1.0f, f17003c, null, 0.0f, 0.0f);
    }

    /* renamed from: L */
    public static zue m19940L() {
        return vlf.m52954f(zue.f57721e, 8, 1.0f, 0.8f, f17001a);
    }

    /* renamed from: M */
    public static zue m19941M() {
        return ave.m17875a(3, 1.0f, 0.0f, 0.0f, f17002b);
    }

    /* renamed from: N */
    public static zue m19942N(float f) {
        return wlf.m54689c(m19941M(), m19951a(f));
    }

    /* renamed from: O */
    public static zue m19943O() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, 1.08f), new m74(0.085f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.358f, 0.843f), new m74(0.085f, 0.0f)));
        return m19953c(arrayList, 8, 0.5f, 0.5f, false);
    }

    /* renamed from: P */
    public static zue m19944P(zue zueVar, boolean z) {
        return m19945Q(zueVar, z, new RectF(0.0f, 0.0f, 1.0f, 1.0f));
    }

    /* renamed from: Q */
    public static zue m19945Q(zue zueVar, boolean z, RectF rectF) {
        float[] fArr = new float[4];
        if (z) {
            zueVar.m59947d(fArr);
        } else {
            zueVar.m59945a(fArr);
        }
        RectF rectF2 = new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
        float fMin = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        Matrix matrixM19952b = m19952b(fMin, fMin);
        matrixM19952b.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrixM19952b.postTranslate(rectF.centerX(), rectF.centerY());
        return wlf.m54689c(zueVar, matrixM19952b);
    }

    /* renamed from: R */
    public static void m19946R(List list, List list2, int i, float f, float f2, boolean z) {
        list2.clear();
        m19948T(list, f, f2);
        float f3 = (float) (6.283185307179586d / i);
        if (z) {
            int i2 = i * 2;
            float f4 = f3 / 2.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < list.size(); i4++) {
                    boolean z2 = i3 % 2 != 0;
                    int size = z2 ? (list.size() - 1) - i4 : i4;
                    C12519b c12519b = (C12519b) list.get(size);
                    if (size > 0 || !z2) {
                        list2.add(new C12519b(new PointF((i3 * f4) + (z2 ? (f4 - c12519b.f17027a.x) + (((C12519b) list.get(0)).f17027a.x * 2.0f) : c12519b.f17027a.x), c12519b.f17027a.y), c12519b.f17028b));
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < i; i5++) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C12519b c12519b2 = (C12519b) it.next();
                    list2.add(new C12519b(new PointF((i5 * f3) + c12519b2.f17027a.x, c12519b2.f17027a.y), c12519b2.f17028b));
                }
            }
        }
        m19947S(list2, f, f2);
    }

    /* renamed from: S */
    public static void m19947S(List list, float f, float f2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C12519b) it.next()).m19981e(f, f2);
        }
    }

    /* renamed from: T */
    public static void m19948T(List list, float f, float f2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C12519b) it.next()).m19982f(f, f2);
        }
    }

    /* renamed from: U */
    public static List m19949U(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(((C12519b) list.get(i)).f17028b);
        }
        return arrayList;
    }

    /* renamed from: V */
    public static float[] m19950V(List list) {
        float[] fArr = new float[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            int i2 = i * 2;
            fArr[i2] = ((C12519b) list.get(i)).f17027a.x;
            fArr[i2 + 1] = ((C12519b) list.get(i)).f17027a.y;
        }
        return fArr;
    }

    /* renamed from: a */
    public static Matrix m19951a(float f) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f);
        return matrix;
    }

    /* renamed from: b */
    public static Matrix m19952b(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        return matrix;
    }

    /* renamed from: c */
    public static zue m19953c(List list, int i, float f, float f2, boolean z) {
        ArrayList arrayList = new ArrayList();
        m19946R(list, arrayList, i, f, f2, z);
        return ave.m17877c(m19950V(arrayList), m74.f34920d, m19949U(arrayList), f, f2);
    }

    /* renamed from: d */
    public static zue m19954d() {
        m74 m74Var = m74.f34920d;
        m74 m74Var2 = f17005e;
        m74 m74Var3 = f17002b;
        return wlf.m54689c(ave.m17876b(4, 1.0f, 0.0f, 0.0f, m74Var, Arrays.asList(m74Var2, m74Var2, m74Var3, m74Var3)), m19951a(-135.0f));
    }

    /* renamed from: e */
    public static zue m19955e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, 0.892f), new m74(0.313f, 0.0f)));
        arrayList.add(new C12519b(new PointF(-0.216f, 1.05f), new m74(0.207f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.499f, -0.16f), new m74(0.215f, 1.0f)));
        arrayList.add(new C12519b(new PointF(1.225f, 1.06f), new m74(0.211f, 0.0f)));
        return m19953c(arrayList, 1, 0.5f, 0.5f, false);
    }

    /* renamed from: f */
    public static zue m19956f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.457f, 0.296f), new m74(0.007f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.5f, -0.051f), new m74(0.007f, 0.0f)));
        return m19953c(arrayList, 15, 0.5f, 0.5f, false);
    }

    /* renamed from: g */
    public static zue m19957g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.796f, 0.5f)));
        PointF pointF = new PointF(0.853f, 0.518f);
        m74 m74Var = f17005e;
        arrayList.add(new C12519b(pointF, m74Var));
        arrayList.add(new C12519b(new PointF(0.992f, 0.631f), m74Var));
        arrayList.add(new C12519b(new PointF(0.968f, 1.0f), m74Var));
        return m19953c(arrayList, 2, 0.5f, 0.5f, true);
    }

    /* renamed from: h */
    public static zue m19958h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, -0.006f), new m74(0.006f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.592f, 0.158f), new m74(0.006f, 0.0f)));
        return m19953c(arrayList, 12, 0.5f, 0.5f, false);
    }

    /* renamed from: i */
    public static zue m19959i() {
        return vlf.m52950b(zue.f57721e, 10);
    }

    /* renamed from: j */
    public static zue m19960j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.171f, 0.841f), new m74(0.159f, 0.0f)));
        arrayList.add(new C12519b(new PointF(-0.02f, 0.5f), new m74(0.14f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.17f, 0.159f), new m74(0.159f, 0.0f)));
        return m19953c(arrayList, 2, 0.5f, 0.5f, false);
    }

    /* renamed from: k */
    public static zue m19961k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, 0.074f)));
        arrayList.add(new C12519b(new PointF(0.725f, -0.099f), new m74(0.476f, 0.0f)));
        return m19953c(arrayList, 4, 0.5f, 0.5f, true);
    }

    /* renamed from: l */
    public static zue m19962l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, 0.036f)));
        arrayList.add(new C12519b(new PointF(0.758f, -0.101f), new m74(0.209f, 0.0f)));
        return m19953c(arrayList, 8, 0.5f, 0.5f, false);
    }

    /* renamed from: m */
    public static zue m19963m() {
        return wlf.m54689c(vlf.m52954f(zue.f57721e, 12, 1.0f, 0.8f, f17004d), m19951a(-90.0f));
    }

    /* renamed from: n */
    public static zue m19964n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(1.237f, 1.236f), new m74(0.258f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.5f, 0.918f), new m74(0.233f, 0.0f)));
        return m19953c(arrayList, 4, 0.5f, 0.5f, false);
    }

    /* renamed from: o */
    public static zue m19965o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.723f, 0.884f), new m74(0.394f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.5f, 1.099f), new m74(0.398f, 0.0f)));
        return m19953c(arrayList, 6, 0.5f, 0.5f, false);
    }

    /* renamed from: p */
    public static zue m19966p() {
        return wlf.m54689c(vlf.m52954f(zue.f57721e, 7, 1.0f, 0.75f, f17004d), m19951a(-90.0f));
    }

    /* renamed from: q */
    public static zue m19967q() {
        return wlf.m54689c(vlf.m52954f(zue.f57721e, 9, 1.0f, 0.8f, f17004d), m19951a(-90.0f));
    }

    /* renamed from: r */
    public static zue m19968r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, 1.096f), new m74(0.151f, 0.524f)));
        arrayList.add(new C12519b(new PointF(0.04f, 0.5f), new m74(0.159f, 0.0f)));
        return m19953c(arrayList, 2, 0.5f, 0.5f, false);
    }

    /* renamed from: s */
    public static zue m19969s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(1.0f, 1.0f), new m74(0.148f, 0.417f)));
        arrayList.add(new C12519b(new PointF(0.0f, 1.0f), new m74(0.151f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.0f, 0.0f), new m74(0.148f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.978f, 0.02f), new m74(0.803f, 0.0f)));
        return m19953c(arrayList, 1, 0.5f, 0.5f, false);
    }

    /* renamed from: t */
    public static zue m19970t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.37f, 0.187f)));
        arrayList.add(new C12519b(new PointF(0.416f, 0.049f), new m74(0.381f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.479f, 0.0f), new m74(0.095f, 0.0f)));
        return m19953c(arrayList, 8, 0.5f, 0.5f, true);
    }

    /* renamed from: u */
    public static zue m19971u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.499f, 1.023f), new m74(0.241f, 0.778f)));
        arrayList.add(new C12519b(new PointF(-0.005f, 0.792f), new m74(0.208f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.073f, 0.258f), new m74(0.228f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.433f, -0.0f), new m74(0.491f, 0.0f)));
        return m19953c(arrayList, 1, 0.5f, 0.5f, true);
    }

    /* renamed from: v */
    public static zue m19972v(float f) {
        return wlf.m54689c(m19971u(), m19951a(f));
    }

    /* renamed from: w */
    public static zue m19973w() {
        ArrayList arrayList = new ArrayList();
        PointF pointF = new PointF(0.5f, 0.0f);
        m74 m74Var = f17005e;
        arrayList.add(new C12519b(pointF, m74Var));
        arrayList.add(new C12519b(new PointF(1.0f, 0.0f), m74Var));
        arrayList.add(new C12519b(new PointF(1.0f, 1.14f), new m74(0.254f, 0.106f)));
        arrayList.add(new C12519b(new PointF(0.575f, 0.906f), new m74(0.253f, 0.0f)));
        return m19953c(arrayList, 1, 0.5f, 0.5f, true);
    }

    /* renamed from: x */
    public static zue m19974x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12519b(new PointF(0.5f, 0.268f), new m74(0.016f, 0.0f)));
        arrayList.add(new C12519b(new PointF(0.792f, -0.066f), new m74(0.958f, 0.0f)));
        arrayList.add(new C12519b(new PointF(1.064f, 0.276f), f17005e));
        arrayList.add(new C12519b(new PointF(0.501f, 0.946f), new m74(0.129f, 0.0f)));
        return m19953c(arrayList, 1, 0.5f, 0.5f, true);
    }

    /* renamed from: y */
    public static zue m19975y() {
        return wlf.m54689c(vlf.m52949a(zue.f57721e), m19952b(1.0f, 0.64f));
    }

    /* renamed from: z */
    public static zue m19976z(float f) {
        return wlf.m54689c(m19975y(), m19951a(f));
    }

    /* renamed from: o.bza$b */
    public static class C12519b {

        /* renamed from: a */
        public PointF f17027a;

        /* renamed from: b */
        public m74 f17028b;

        /* renamed from: e */
        public final void m19981e(float f, float f2) {
            PointF pointF = this.f17027a;
            float fCos = (float) ((pointF.y * Math.cos(pointF.x)) + f);
            PointF pointF2 = this.f17027a;
            float fSin = (float) ((pointF2.y * Math.sin(pointF2.x)) + f2);
            PointF pointF3 = this.f17027a;
            pointF3.x = fCos;
            pointF3.y = fSin;
        }

        /* renamed from: f */
        public final void m19982f(float f, float f2) {
            this.f17027a.offset(-f, -f2);
            PointF pointF = this.f17027a;
            float fAtan2 = (float) Math.atan2(pointF.y, pointF.x);
            PointF pointF2 = this.f17027a;
            float fHypot = (float) Math.hypot(pointF2.x, pointF2.y);
            PointF pointF3 = this.f17027a;
            pointF3.x = fAtan2;
            pointF3.y = fHypot;
        }

        public C12519b(PointF pointF) {
            this(pointF, m74.f34920d);
        }

        public C12519b(PointF pointF, m74 m74Var) {
            this.f17027a = pointF;
            this.f17028b = m74Var;
        }
    }
}
