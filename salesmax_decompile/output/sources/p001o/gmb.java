package p001o;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.C2004a;
import androidx.constraintlayout.widget.C2005b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p001o.hzi;
import p001o.ozi;
import p001o.uxi;

/* loaded from: classes2.dex */
public class gmb {

    /* renamed from: B */
    public HashMap f25465B;

    /* renamed from: C */
    public HashMap f25466C;

    /* renamed from: D */
    public HashMap f25467D;

    /* renamed from: E */
    public kd9[] f25468E;

    /* renamed from: F */
    public int f25469F;

    /* renamed from: G */
    public int f25470G;

    /* renamed from: H */
    public View f25471H;

    /* renamed from: I */
    public int f25472I;

    /* renamed from: J */
    public float f25473J;

    /* renamed from: K */
    public Interpolator f25474K;

    /* renamed from: L */
    public boolean f25475L;

    /* renamed from: b */
    public View f25477b;

    /* renamed from: c */
    public int f25478c;

    /* renamed from: e */
    public String f25480e;

    /* renamed from: k */
    public rd4[] f25486k;

    /* renamed from: l */
    public rd4 f25487l;

    /* renamed from: p */
    public float f25491p;

    /* renamed from: q */
    public float f25492q;

    /* renamed from: r */
    public int[] f25493r;

    /* renamed from: s */
    public double[] f25494s;

    /* renamed from: t */
    public double[] f25495t;

    /* renamed from: u */
    public String[] f25496u;

    /* renamed from: v */
    public int[] f25497v;

    /* renamed from: a */
    public Rect f25476a = new Rect();

    /* renamed from: d */
    public boolean f25479d = false;

    /* renamed from: f */
    public int f25481f = -1;

    /* renamed from: g */
    public qmb f25482g = new qmb();

    /* renamed from: h */
    public qmb f25483h = new qmb();

    /* renamed from: i */
    public fmb f25484i = new fmb();

    /* renamed from: j */
    public fmb f25485j = new fmb();

    /* renamed from: m */
    public float f25488m = Float.NaN;

    /* renamed from: n */
    public float f25489n = 0.0f;

    /* renamed from: o */
    public float f25490o = 1.0f;

    /* renamed from: w */
    public int f25498w = 4;

    /* renamed from: x */
    public float[] f25499x = new float[4];

    /* renamed from: y */
    public ArrayList f25500y = new ArrayList();

    /* renamed from: z */
    public float[] f25501z = new float[1];

    /* renamed from: A */
    public ArrayList f25464A = new ArrayList();

    /* renamed from: o.gmb$a */
    public class InterpolatorC13780a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ q26 f25502a;

        public InterpolatorC13780a(q26 q26Var) {
            this.f25502a = q26Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f25502a.mo20345a(f);
        }
    }

    public gmb(View view) {
        int i = hc9.f26654f;
        this.f25469F = i;
        this.f25470G = i;
        this.f25471H = null;
        this.f25472I = i;
        this.f25473J = Float.NaN;
        this.f25474K = null;
        this.f25475L = false;
        m29061H(view);
    }

    /* renamed from: p */
    public static Interpolator m29053p(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            return new InterpolatorC13780a(q26.m44740c(str));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    /* renamed from: A */
    public void m29054A(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((i6 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    /* renamed from: B */
    public void m29055B(View view) {
        qmb qmbVar = this.f25482g;
        qmbVar.f42163c = 0.0f;
        qmbVar.f42164d = 0.0f;
        this.f25475L = true;
        qmbVar.m45673x(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f25483h.m45673x(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f25484i.m27085n(view);
        this.f25485j.m27085n(view);
    }

    /* renamed from: C */
    public void m29056C(Rect rect, C2005b c2005b, int i, int i2) {
        int i3 = c2005b.f6963e;
        if (i3 != 0) {
            m29054A(rect, this.f25476a, i3, i, i2);
            rect = this.f25476a;
        }
        qmb qmbVar = this.f25483h;
        qmbVar.f42163c = 1.0f;
        qmbVar.f42164d = 1.0f;
        m29087y(qmbVar);
        this.f25483h.m45673x(rect.left, rect.top, rect.width(), rect.height());
        this.f25483h.m45657a(c2005b.m5693z(this.f25478c));
        this.f25485j.m27084m(rect, c2005b, i3, this.f25478c);
    }

    /* renamed from: D */
    public void m29057D(int i) {
        this.f25469F = i;
    }

    /* renamed from: E */
    public void m29058E(View view) {
        qmb qmbVar = this.f25482g;
        qmbVar.f42163c = 0.0f;
        qmbVar.f42164d = 0.0f;
        qmbVar.m45673x(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f25484i.m27085n(view);
    }

    /* renamed from: F */
    public void m29059F(Rect rect, C2005b c2005b, int i, int i2) {
        int i3 = c2005b.f6963e;
        if (i3 != 0) {
            m29054A(rect, this.f25476a, i3, i, i2);
        }
        qmb qmbVar = this.f25482g;
        qmbVar.f42163c = 0.0f;
        qmbVar.f42164d = 0.0f;
        m29087y(qmbVar);
        this.f25482g.m45673x(rect.left, rect.top, rect.width(), rect.height());
        C2005b.a aVarM5693z = c2005b.m5693z(this.f25478c);
        this.f25482g.m45657a(aVarM5693z);
        this.f25488m = aVarM5693z.f6970d.f7046g;
        this.f25484i.m27084m(rect, c2005b, i3, this.f25478c);
        this.f25470G = aVarM5693z.f6972f.f7068i;
        C2005b.c cVar = aVarM5693z.f6970d;
        this.f25472I = cVar.f7050k;
        this.f25473J = cVar.f7049j;
        Context context = this.f25477b.getContext();
        C2005b.c cVar2 = aVarM5693z.f6970d;
        this.f25474K = m29053p(context, cVar2.f7052m, cVar2.f7051l, cVar2.f7053n);
    }

    /* renamed from: G */
    public void m29060G(izi iziVar, View view, int i, int i2, int i3) {
        qmb qmbVar = this.f25482g;
        qmbVar.f42163c = 0.0f;
        qmbVar.f42164d = 0.0f;
        Rect rect = new Rect();
        if (i == 1 || i == 2) {
            throw null;
        }
        this.f25482g.m45673x(rect.left, rect.top, rect.width(), rect.height());
        throw null;
    }

    /* renamed from: H */
    public void m29061H(View view) {
        this.f25477b = view;
        this.f25478c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f25480e = ((ConstraintLayout.LayoutParams) layoutParams).m5622a();
        }
    }

    /* renamed from: I */
    public void m29062I(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        C2004a c2004a;
        ozi oziVarM42824h;
        C2004a c2004a2;
        Integer num;
        hzi hziVarM31329g;
        C2004a c2004a3;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap map = new HashMap();
        int i3 = this.f25469F;
        if (i3 != hc9.f26654f) {
            this.f25482g.f42171x = i3;
        }
        this.f25484i.m27082h(this.f25485j, hashSet2);
        ArrayList arrayList2 = this.f25464A;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                hc9 hc9Var = (hc9) it.next();
                if (hc9Var instanceof ed9) {
                    ed9 ed9Var = (ed9) hc9Var;
                    m29085w(new qmb(i, i2, ed9Var, this.f25482g, this.f25483h));
                    int i4 = ed9Var.f23153g;
                    if (i4 != hc9.f26654f) {
                        this.f25481f = i4;
                    }
                } else if (hc9Var instanceof lc9) {
                    hc9Var.mo26461d(hashSet3);
                } else if (hc9Var instanceof jd9) {
                    hc9Var.mo26461d(hashSet);
                } else if (hc9Var instanceof kd9) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((kd9) hc9Var);
                } else {
                    hc9Var.mo30225h(map);
                    hc9Var.mo26461d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i5 = 0;
        if (arrayList != null) {
            this.f25468E = (kd9[]) arrayList.toArray(new kd9[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.f25466C = new HashMap();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator it3 = this.f25464A.iterator();
                    while (it3.hasNext()) {
                        hc9 hc9Var2 = (hc9) it3.next();
                        HashMap map2 = hc9Var2.f26659e;
                        if (map2 != null && (c2004a3 = (C2004a) map2.get(str2)) != null) {
                            sparseArray.append(hc9Var2.f26655a, c2004a3);
                        }
                    }
                    hziVarM31329g = hzi.m31328f(str, sparseArray);
                } else {
                    hziVarM31329g = hzi.m31329g(str);
                }
                if (hziVarM31329g != null) {
                    hziVarM31329g.m52204d(str);
                    this.f25466C.put(str, hziVarM31329g);
                }
            }
            ArrayList arrayList3 = this.f25464A;
            if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    hc9 hc9Var3 = (hc9) it4.next();
                    if (hc9Var3 instanceof jc9) {
                        hc9Var3.mo24787a(this.f25466C);
                    }
                }
            }
            this.f25484i.m27077a(this.f25466C, 0);
            this.f25485j.m27077a(this.f25466C, 100);
            for (String str3 : this.f25466C.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = (Integer) map.get(str3)) == null) ? 0 : num.intValue();
                v0g v0gVar = (v0g) this.f25466C.get(str3);
                if (v0gVar != null) {
                    v0gVar.mo31332e(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f25465B == null) {
                this.f25465B = new HashMap();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str4 = (String) it5.next();
                if (!this.f25465B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        Iterator it6 = this.f25464A.iterator();
                        while (it6.hasNext()) {
                            hc9 hc9Var4 = (hc9) it6.next();
                            HashMap map3 = hc9Var4.f26659e;
                            if (map3 != null && (c2004a2 = (C2004a) map3.get(str5)) != null) {
                                sparseArray2.append(hc9Var4.f26655a, c2004a2);
                            }
                        }
                        oziVarM42824h = ozi.m42823g(str4, sparseArray2);
                    } else {
                        oziVarM42824h = ozi.m42824h(str4, j);
                    }
                    if (oziVarM42824h != null) {
                        oziVarM42824h.m50177d(str4);
                        this.f25465B.put(str4, oziVarM42824h);
                    }
                }
            }
            ArrayList arrayList4 = this.f25464A;
            if (arrayList4 != null) {
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    hc9 hc9Var5 = (hc9) it7.next();
                    if (hc9Var5 instanceof jd9) {
                        ((jd9) hc9Var5).m33599U(this.f25465B);
                    }
                }
            }
            for (String str6 : this.f25465B.keySet()) {
                ((ozi) this.f25465B.get(str6)).mo42828e(map.containsKey(str6) ? ((Integer) map.get(str6)).intValue() : 0);
            }
        }
        int size = this.f25500y.size() + 2;
        qmb[] qmbVarArr = new qmb[size];
        qmbVarArr[0] = this.f25482g;
        qmbVarArr[size - 1] = this.f25483h;
        if (this.f25500y.size() > 0 && this.f25481f == -1) {
            this.f25481f = 0;
        }
        Iterator it8 = this.f25500y.iterator();
        int i6 = 1;
        while (it8.hasNext()) {
            qmbVarArr[i6] = (qmb) it8.next();
            i6++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f25483h.f42156M.keySet()) {
            if (this.f25482g.f42156M.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f25496u = strArr2;
        this.f25497v = new int[strArr2.length];
        int i7 = 0;
        while (true) {
            strArr = this.f25496u;
            if (i7 >= strArr.length) {
                break;
            }
            String str8 = strArr[i7];
            this.f25497v[i7] = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                if (qmbVarArr[i8].f42156M.containsKey(str8) && (c2004a = (C2004a) qmbVarArr[i8].f42156M.get(str8)) != null) {
                    int[] iArr = this.f25497v;
                    iArr[i7] = iArr[i7] + c2004a.m5645h();
                    break;
                }
                i8++;
            }
            i7++;
        }
        boolean z = qmbVarArr[0].f42171x != hc9.f26654f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < size; i9++) {
            qmbVarArr[i9].m45660e(qmbVarArr[i9 - 1], zArr, this.f25496u, z);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        this.f25493r = new int[i10];
        int iMax = Math.max(2, i10);
        this.f25494s = new double[iMax];
        this.f25495t = new double[iMax];
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                this.f25493r[i12] = i13;
                i12++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, this.f25493r.length);
        double[] dArr2 = new double[size];
        for (int i14 = 0; i14 < size; i14++) {
            qmbVarArr[i14].m45661g(dArr[i14], this.f25493r);
            dArr2[i14] = qmbVarArr[i14].f42163c;
        }
        int i15 = 0;
        while (true) {
            int[] iArr2 = this.f25493r;
            if (i15 >= iArr2.length) {
                break;
            }
            if (iArr2[i15] < qmb.h0.length) {
                String str9 = qmb.h0[this.f25493r[i15]] + " [";
                for (int i16 = 0; i16 < size; i16++) {
                    str9 = str9 + dArr[i16][i15];
                }
            }
            i15++;
        }
        this.f25486k = new rd4[this.f25496u.length + 1];
        int i17 = 0;
        while (true) {
            String[] strArr3 = this.f25496u;
            if (i17 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i17];
            int i18 = i5;
            int i19 = i18;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i18 < size) {
                if (qmbVarArr[i18].m45667r(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, qmbVarArr[i18].m45665n(str10));
                    }
                    qmb qmbVar = qmbVarArr[i18];
                    dArr3[i19] = qmbVar.f42163c;
                    qmbVar.m45664m(str10, dArr4[i19], 0);
                    i19++;
                }
                i18++;
            }
            i17++;
            this.f25486k[i17] = rd4.m46542a(this.f25481f, Arrays.copyOf(dArr3, i19), (double[][]) Arrays.copyOf(dArr4, i19));
            i5 = 0;
        }
        this.f25486k[0] = rd4.m46542a(this.f25481f, dArr2, dArr);
        if (qmbVarArr[0].f42171x != hc9.f26654f) {
            int[] iArr3 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
            for (int i20 = 0; i20 < size; i20++) {
                iArr3[i20] = qmbVarArr[i20].f42171x;
                dArr5[i20] = r8.f42163c;
                double[] dArr7 = dArr6[i20];
                dArr7[0] = r8.f42165e;
                dArr7[1] = r8.f42166f;
            }
            this.f25487l = rd4.m46543b(iArr3, dArr5, dArr6);
        }
        this.f25467D = new HashMap();
        if (this.f25464A != null) {
            Iterator it9 = hashSet3.iterator();
            float fM29081s = Float.NaN;
            while (it9.hasNext()) {
                String str11 = (String) it9.next();
                uxi uxiVarM52120i = uxi.m52120i(str11);
                if (uxiVarM52120i != null) {
                    if (uxiVarM52120i.m38734h() && Float.isNaN(fM29081s)) {
                        fM29081s = m29081s();
                    }
                    uxiVarM52120i.m38732f(str11);
                    this.f25467D.put(str11, uxiVarM52120i);
                }
            }
            Iterator it10 = this.f25464A.iterator();
            while (it10.hasNext()) {
                hc9 hc9Var6 = (hc9) it10.next();
                if (hc9Var6 instanceof lc9) {
                    ((lc9) hc9Var6).m36939Y(this.f25467D);
                }
            }
            Iterator it11 = this.f25467D.values().iterator();
            while (it11.hasNext()) {
                ((uxi) it11.next()).m38733g(fM29081s);
            }
        }
    }

    /* renamed from: J */
    public void m29063J(gmb gmbVar) {
        this.f25482g.m45656A(gmbVar, gmbVar.f25482g);
        this.f25483h.m45656A(gmbVar, gmbVar.f25483h);
    }

    /* renamed from: a */
    public void m29064a(hc9 hc9Var) {
        this.f25464A.add(hc9Var);
    }

    /* renamed from: b */
    public void m29065b(ArrayList arrayList) {
        this.f25464A.addAll(arrayList);
    }

    /* renamed from: c */
    public int m29066c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo19478h = this.f25486k[0].mo19478h();
        if (iArr != null) {
            Iterator it = this.f25500y.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((qmb) it.next()).f42157Q;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < dArrMo19478h.length; i3++) {
            this.f25486k[0].mo19474d(dArrMo19478h[i3], this.f25494s);
            this.f25482g.m45662h(dArrMo19478h[i3], this.f25493r, this.f25494s, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: d */
    public void m29067d(float[] fArr, int i) {
        double dMo20345a;
        float f = 1.0f;
        float f2 = 1.0f / (i - 1);
        HashMap map = this.f25466C;
        v0g v0gVar = map == null ? null : (v0g) map.get("translationX");
        HashMap map2 = this.f25466C;
        v0g v0gVar2 = map2 == null ? null : (v0g) map2.get("translationY");
        HashMap map3 = this.f25467D;
        uxi uxiVar = map3 == null ? null : (uxi) map3.get("translationX");
        HashMap map4 = this.f25467D;
        uxi uxiVar2 = map4 != null ? (uxi) map4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float fMin = i2 * f2;
            float f3 = this.f25490o;
            float f4 = 0.0f;
            if (f3 != f) {
                float f5 = this.f25489n;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, f);
                }
            }
            float f6 = fMin;
            double d = f6;
            q26 q26Var = this.f25482g.f42161a;
            Iterator it = this.f25500y.iterator();
            float f7 = Float.NaN;
            while (it.hasNext()) {
                qmb qmbVar = (qmb) it.next();
                q26 q26Var2 = qmbVar.f42161a;
                double d2 = d;
                if (q26Var2 != null) {
                    float f8 = qmbVar.f42163c;
                    if (f8 < f6) {
                        f4 = f8;
                        q26Var = q26Var2;
                    } else if (Float.isNaN(f7)) {
                        f7 = qmbVar.f42163c;
                    }
                }
                d = d2;
            }
            double d3 = d;
            if (q26Var != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                dMo20345a = (((float) q26Var.mo20345a((f6 - f4) / r16)) * (f7 - f4)) + f4;
            } else {
                dMo20345a = d3;
            }
            this.f25486k[0].mo19474d(dMo20345a, this.f25494s);
            rd4 rd4Var = this.f25487l;
            if (rd4Var != null) {
                double[] dArr = this.f25494s;
                if (dArr.length > 0) {
                    rd4Var.mo19474d(dMo20345a, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.f25482g.m45662h(dMo20345a, this.f25493r, this.f25494s, fArr, i3);
            if (uxiVar != null) {
                fArr[i3] = fArr[i3] + uxiVar.m38727a(f6);
            } else if (v0gVar != null) {
                fArr[i3] = fArr[i3] + v0gVar.m52202a(f6);
            }
            if (uxiVar2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + uxiVar2.m38727a(f6);
            } else if (v0gVar2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + v0gVar2.m52202a(f6);
            }
            i2 = i4 + 1;
            f = 1.0f;
        }
    }

    /* renamed from: e */
    public void m29068e(float f, float[] fArr, int i) {
        this.f25486k[0].mo19474d(m29070g(f, null), this.f25494s);
        this.f25482g.m45666o(this.f25493r, this.f25494s, fArr, i);
    }

    /* renamed from: f */
    public void m29069f(boolean z) {
        if (!"button".equals(k75.m35105d(this.f25477b)) || this.f25468E == null) {
            return;
        }
        int i = 0;
        while (true) {
            kd9[] kd9VarArr = this.f25468E;
            if (i >= kd9VarArr.length) {
                return;
            }
            kd9VarArr[i].m35440y(z ? -100.0f : 100.0f, this.f25477b);
            i++;
        }
    }

    /* renamed from: g */
    public final float m29070g(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f25490o;
            if (f3 != 1.0d) {
                float f4 = this.f25489n;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        q26 q26Var = this.f25482g.f42161a;
        Iterator it = this.f25500y.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            qmb qmbVar = (qmb) it.next();
            q26 q26Var2 = qmbVar.f42161a;
            if (q26Var2 != null) {
                float f6 = qmbVar.f42163c;
                if (f6 < f) {
                    q26Var = q26Var2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = qmbVar.f42163c;
                }
            }
        }
        if (q26Var != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) q26Var.mo20345a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) q26Var.mo20346b(d);
            }
        }
        return f;
    }

    /* renamed from: h */
    public int m29071h() {
        return this.f25482g.f42172y;
    }

    /* renamed from: i */
    public void m29072i(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f25486k[0].mo19474d(d, dArr);
        this.f25486k[0].mo19477g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f25482g.m45663j(d, this.f25493r, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: j */
    public float m29073j() {
        return this.f25491p;
    }

    /* renamed from: k */
    public float m29074k() {
        return this.f25492q;
    }

    /* renamed from: l */
    public void m29075l(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float fM29070g = m29070g(f, this.f25501z);
        rd4[] rd4VarArr = this.f25486k;
        int i = 0;
        if (rd4VarArr == null) {
            qmb qmbVar = this.f25483h;
            float f4 = qmbVar.f42165e;
            qmb qmbVar2 = this.f25482g;
            float f5 = f4 - qmbVar2.f42165e;
            float f6 = qmbVar.f42166f - qmbVar2.f42166f;
            float f7 = (qmbVar.f42167g - qmbVar2.f42167g) + f5;
            float f8 = (qmbVar.f42168h - qmbVar2.f42168h) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            return;
        }
        double d = fM29070g;
        rd4VarArr[0].mo19477g(d, this.f25495t);
        this.f25486k[0].mo19474d(d, this.f25494s);
        float f9 = this.f25501z[0];
        while (true) {
            dArr = this.f25495t;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * f9;
            i++;
        }
        rd4 rd4Var = this.f25487l;
        if (rd4Var == null) {
            this.f25482g.m45674y(f2, f3, fArr, this.f25493r, dArr, this.f25494s);
            return;
        }
        double[] dArr2 = this.f25494s;
        if (dArr2.length > 0) {
            rd4Var.mo19474d(d, dArr2);
            this.f25487l.mo19477g(d, this.f25495t);
            this.f25482g.m45674y(f2, f3, fArr, this.f25493r, this.f25495t, this.f25494s);
        }
    }

    /* renamed from: m */
    public int m29076m() {
        int iMax = this.f25482g.f42162b;
        Iterator it = this.f25500y.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((qmb) it.next()).f42162b);
        }
        return Math.max(iMax, this.f25483h.f42162b);
    }

    /* renamed from: n */
    public float m29077n() {
        return this.f25483h.f42165e;
    }

    /* renamed from: o */
    public float m29078o() {
        return this.f25483h.f42166f;
    }

    /* renamed from: q */
    public qmb m29079q(int i) {
        return (qmb) this.f25500y.get(i);
    }

    /* renamed from: r */
    public void m29080r(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float fM29070g = m29070g(f, this.f25501z);
        HashMap map = this.f25466C;
        v0g v0gVar = map == null ? null : (v0g) map.get("translationX");
        HashMap map2 = this.f25466C;
        v0g v0gVar2 = map2 == null ? null : (v0g) map2.get("translationY");
        HashMap map3 = this.f25466C;
        v0g v0gVar3 = map3 == null ? null : (v0g) map3.get("rotation");
        HashMap map4 = this.f25466C;
        v0g v0gVar4 = map4 == null ? null : (v0g) map4.get("scaleX");
        HashMap map5 = this.f25466C;
        v0g v0gVar5 = map5 == null ? null : (v0g) map5.get("scaleY");
        HashMap map6 = this.f25467D;
        uxi uxiVar = map6 == null ? null : (uxi) map6.get("translationX");
        HashMap map7 = this.f25467D;
        uxi uxiVar2 = map7 == null ? null : (uxi) map7.get("translationY");
        HashMap map8 = this.f25467D;
        uxi uxiVar3 = map8 == null ? null : (uxi) map8.get("rotation");
        HashMap map9 = this.f25467D;
        uxi uxiVar4 = map9 == null ? null : (uxi) map9.get("scaleX");
        HashMap map10 = this.f25467D;
        uxi uxiVar5 = map10 != null ? (uxi) map10.get("scaleY") : null;
        lsi lsiVar = new lsi();
        lsiVar.m37864b();
        lsiVar.m37866d(v0gVar3, fM29070g);
        lsiVar.m37870h(v0gVar, v0gVar2, fM29070g);
        lsiVar.m37868f(v0gVar4, v0gVar5, fM29070g);
        lsiVar.m37865c(uxiVar3, fM29070g);
        lsiVar.m37869g(uxiVar, uxiVar2, fM29070g);
        lsiVar.m37867e(uxiVar4, uxiVar5, fM29070g);
        rd4 rd4Var = this.f25487l;
        if (rd4Var != null) {
            double[] dArr = this.f25494s;
            if (dArr.length > 0) {
                double d = fM29070g;
                rd4Var.mo19474d(d, dArr);
                this.f25487l.mo19477g(d, this.f25495t);
                this.f25482g.m45674y(f2, f3, fArr, this.f25493r, this.f25495t, this.f25494s);
            }
            lsiVar.m37863a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f25486k == null) {
            qmb qmbVar = this.f25483h;
            float f4 = qmbVar.f42165e;
            qmb qmbVar2 = this.f25482g;
            float f5 = f4 - qmbVar2.f42165e;
            uxi uxiVar6 = uxiVar5;
            float f6 = qmbVar.f42166f - qmbVar2.f42166f;
            uxi uxiVar7 = uxiVar4;
            float f7 = (qmbVar.f42167g - qmbVar2.f42167g) + f5;
            float f8 = (qmbVar.f42168h - qmbVar2.f42168h) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            lsiVar.m37864b();
            lsiVar.m37866d(v0gVar3, fM29070g);
            lsiVar.m37870h(v0gVar, v0gVar2, fM29070g);
            lsiVar.m37868f(v0gVar4, v0gVar5, fM29070g);
            lsiVar.m37865c(uxiVar3, fM29070g);
            lsiVar.m37869g(uxiVar, uxiVar2, fM29070g);
            lsiVar.m37867e(uxiVar7, uxiVar6, fM29070g);
            lsiVar.m37863a(f2, f3, i, i2, fArr);
            return;
        }
        double dM29070g = m29070g(fM29070g, this.f25501z);
        this.f25486k[0].mo19477g(dM29070g, this.f25495t);
        this.f25486k[0].mo19474d(dM29070g, this.f25494s);
        float f9 = this.f25501z[0];
        while (true) {
            double[] dArr2 = this.f25495t;
            if (i3 >= dArr2.length) {
                this.f25482g.m45674y(f2, f3, fArr, this.f25493r, dArr2, this.f25494s);
                lsiVar.m37863a(f2, f3, i, i2, fArr);
                return;
            } else {
                dArr2[i3] = dArr2[i3] * f9;
                i3++;
            }
        }
    }

    /* renamed from: s */
    public final float m29081s() {
        char c;
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f2 = i * f;
            double dMo20345a = f2;
            q26 q26Var = this.f25482g.f42161a;
            Iterator it = this.f25500y.iterator();
            float f3 = Float.NaN;
            float f4 = 0.0f;
            while (it.hasNext()) {
                qmb qmbVar = (qmb) it.next();
                q26 q26Var2 = qmbVar.f42161a;
                if (q26Var2 != null) {
                    float f5 = qmbVar.f42163c;
                    if (f5 < f2) {
                        q26Var = q26Var2;
                        f4 = f5;
                    } else if (Float.isNaN(f3)) {
                        f3 = qmbVar.f42163c;
                    }
                }
            }
            if (q26Var != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                dMo20345a = (((float) q26Var.mo20345a((f2 - f4) / r7)) * (f3 - f4)) + f4;
            }
            this.f25486k[0].mo19474d(dMo20345a, this.f25494s);
            int i2 = i;
            this.f25482g.m45662h(dMo20345a, this.f25493r, this.f25494s, fArr, 0);
            if (i2 > 0) {
                c = 0;
                fHypot += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            } else {
                c = 0;
            }
            d = fArr[c];
            i = i2 + 1;
            d2 = fArr[1];
        }
        return fHypot;
    }

    /* renamed from: t */
    public float m29082t() {
        return this.f25482g.f42165e;
    }

    public String toString() {
        return " start: x: " + this.f25482g.f42165e + " y: " + this.f25482g.f42166f + " end: x: " + this.f25483h.f42165e + " y: " + this.f25483h.f42166f;
    }

    /* renamed from: u */
    public float m29083u() {
        return this.f25482g.f42166f;
    }

    /* renamed from: v */
    public View m29084v() {
        return this.f25477b;
    }

    /* renamed from: w */
    public final void m29085w(qmb qmbVar) {
        if (Collections.binarySearch(this.f25500y, qmbVar) == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath position \"");
            sb.append(qmbVar.f42164d);
            sb.append("\" outside of range");
        }
        this.f25500y.add((-r0) - 1, qmbVar);
    }

    /* renamed from: x */
    public boolean m29086x(View view, float f, long j, kc9 kc9Var) {
        ozi.C15924d c15924d;
        boolean zM42830j;
        int i;
        double d;
        float fM29070g = m29070g(f, null);
        int i2 = this.f25472I;
        if (i2 != hc9.f26654f) {
            float f2 = 1.0f / i2;
            float fFloor = ((float) Math.floor(fM29070g / f2)) * f2;
            float f3 = (fM29070g % f2) / f2;
            if (!Float.isNaN(this.f25473J)) {
                f3 = (f3 + this.f25473J) % 1.0f;
            }
            Interpolator interpolator = this.f25474K;
            fM29070g = ((interpolator != null ? interpolator.getInterpolation(f3) : ((double) f3) > 0.5d ? 1.0f : 0.0f) * f2) + fFloor;
        }
        float f4 = fM29070g;
        HashMap map = this.f25466C;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((hzi) it.next()).mo31330h(view, f4);
            }
        }
        HashMap map2 = this.f25465B;
        if (map2 != null) {
            ozi.C15924d c15924d2 = null;
            boolean zMo42826i = false;
            for (ozi oziVar : map2.values()) {
                if (oziVar instanceof ozi.C15924d) {
                    c15924d2 = (ozi.C15924d) oziVar;
                } else {
                    zMo42826i |= oziVar.mo42826i(view, f4, j, kc9Var);
                }
            }
            zM42830j = zMo42826i;
            c15924d = c15924d2;
        } else {
            c15924d = null;
            zM42830j = false;
        }
        rd4[] rd4VarArr = this.f25486k;
        if (rd4VarArr != null) {
            double d2 = f4;
            rd4VarArr[0].mo19474d(d2, this.f25494s);
            this.f25486k[0].mo19477g(d2, this.f25495t);
            rd4 rd4Var = this.f25487l;
            if (rd4Var != null) {
                double[] dArr = this.f25494s;
                if (dArr.length > 0) {
                    rd4Var.mo19474d(d2, dArr);
                    this.f25487l.mo19477g(d2, this.f25495t);
                }
            }
            if (this.f25475L) {
                d = d2;
            } else {
                d = d2;
                this.f25482g.m45675z(f4, view, this.f25493r, this.f25494s, this.f25495t, null, this.f25479d);
                this.f25479d = false;
            }
            if (this.f25470G != hc9.f26654f) {
                if (this.f25471H == null) {
                    this.f25471H = ((View) view.getParent()).findViewById(this.f25470G);
                }
                if (this.f25471H != null) {
                    float top = (r1.getTop() + this.f25471H.getBottom()) / 2.0f;
                    float left = (this.f25471H.getLeft() + this.f25471H.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap map3 = this.f25466C;
            if (map3 != null) {
                for (v0g v0gVar : map3.values()) {
                    if (v0gVar instanceof hzi.C14134d) {
                        double[] dArr2 = this.f25495t;
                        if (dArr2.length > 1) {
                            ((hzi.C14134d) v0gVar).m31334i(view, f4, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (c15924d != null) {
                double[] dArr3 = this.f25495t;
                i = 1;
                zM42830j |= c15924d.m42830j(view, kc9Var, f4, j, dArr3[0], dArr3[1]);
            } else {
                i = 1;
            }
            int i3 = i;
            while (true) {
                rd4[] rd4VarArr2 = this.f25486k;
                if (i3 >= rd4VarArr2.length) {
                    break;
                }
                rd4VarArr2[i3].mo19475e(d, this.f25499x);
                zh4.m59402b((C2004a) this.f25482g.f42156M.get(this.f25496u[i3 - 1]), view, this.f25499x);
                i3++;
            }
            fmb fmbVar = this.f25484i;
            if (fmbVar.f23661b == 0) {
                if (f4 <= 0.0f) {
                    view.setVisibility(fmbVar.f23662c);
                } else if (f4 >= 1.0f) {
                    view.setVisibility(this.f25485j.f23662c);
                } else if (this.f25485j.f23662c != fmbVar.f23662c) {
                    view.setVisibility(0);
                }
            }
            if (this.f25468E != null) {
                int i4 = 0;
                while (true) {
                    kd9[] kd9VarArr = this.f25468E;
                    if (i4 >= kd9VarArr.length) {
                        break;
                    }
                    kd9VarArr[i4].m35440y(f4, view);
                    i4++;
                }
            }
        } else {
            i = 1;
            qmb qmbVar = this.f25482g;
            float f5 = qmbVar.f42165e;
            qmb qmbVar2 = this.f25483h;
            float f6 = f5 + ((qmbVar2.f42165e - f5) * f4);
            float f7 = qmbVar.f42166f;
            float f8 = f7 + ((qmbVar2.f42166f - f7) * f4);
            float f9 = qmbVar.f42167g;
            float f10 = qmbVar2.f42167g;
            float f11 = qmbVar.f42168h;
            float f12 = qmbVar2.f42168h;
            float f13 = f6 + 0.5f;
            int i5 = (int) f13;
            float f14 = f8 + 0.5f;
            int i6 = (int) f14;
            int i7 = (int) (f13 + ((f10 - f9) * f4) + f9);
            int i8 = (int) (f14 + ((f12 - f11) * f4) + f11);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (f10 != f9 || f12 != f11 || this.f25479d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                this.f25479d = false;
            }
            view.layout(i5, i6, i7, i8);
        }
        HashMap map4 = this.f25467D;
        if (map4 != null) {
            for (uxi uxiVar : map4.values()) {
                if (uxiVar instanceof uxi.C17473d) {
                    double[] dArr4 = this.f25495t;
                    ((uxi.C17473d) uxiVar).m52122k(view, f4, dArr4[0], dArr4[i]);
                } else {
                    uxiVar.mo52121j(view, f4);
                }
            }
        }
        return zM42830j;
    }

    /* renamed from: y */
    public final void m29087y(qmb qmbVar) {
        qmbVar.m45673x((int) this.f25477b.getX(), (int) this.f25477b.getY(), this.f25477b.getWidth(), this.f25477b.getHeight());
    }

    /* renamed from: z */
    public void m29088z() {
        this.f25479d = true;
    }
}
