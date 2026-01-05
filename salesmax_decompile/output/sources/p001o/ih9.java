package p001o;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import p001o.gh9;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class ih9 {

    /* renamed from: a */
    public static final ka9.C14756a f28671a = ka9.C14756a.m35230a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    public static final ka9.C14756a f28672b = ka9.C14756a.m35230a("d", "a");

    /* renamed from: c */
    public static final ka9.C14756a f28673c = ka9.C14756a.m35230a("ty", "nm");

    /* renamed from: o.ih9$a */
    public static /* synthetic */ class C14293a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28674a;

        static {
            int[] iArr = new int[gh9.EnumC13716b.values().length];
            f28674a = iArr;
            try {
                iArr[gh9.EnumC13716b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28674a[gh9.EnumC13716b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public static gh9 m32140a(ka9 ka9Var, ama amaVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        gh9.EnumC13716b enumC13716b = gh9.EnumC13716b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ka9Var.mo22732d();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        gh9.EnumC13716b enumC13716b2 = enumC13716b;
        gh9.EnumC13715a enumC13715a = null;
        String strMo22740t = null;
        rg0 rg0VarM48303g = null;
        og0 og0VarM51553d = null;
        pg0 pg0VarM45370a = null;
        fg0 fg0VarM51555f = null;
        yj1 yj1VarM59505b = null;
        tz5 tz5VarM52176b = null;
        long jMo22738r = 0;
        int iMo22738r = 0;
        int iMo22738r2 = 0;
        int color = 0;
        int iMo22738r3 = 0;
        int iMo22738r4 = 0;
        boolean zMo22736k = false;
        float fMo22737o = 1.0f;
        long jMo22738r2 = -1;
        float fMo22737o2 = 0.0f;
        float fMo22737o3 = 0.0f;
        float fM17442f = 0.0f;
        String strMo22740t2 = "UNSET";
        String strMo22740t3 = null;
        while (ka9Var.mo22735h()) {
            switch (ka9Var.mo22724H(f28671a)) {
                case 0:
                    strMo22740t2 = ka9Var.mo22740t();
                    break;
                case 1:
                    jMo22738r = ka9Var.mo22738r();
                    break;
                case 2:
                    strMo22740t = ka9Var.mo22740t();
                    break;
                case 3:
                    int iMo22738r5 = ka9Var.mo22738r();
                    enumC13715a = gh9.EnumC13715a.UNKNOWN;
                    if (iMo22738r5 >= enumC13715a.ordinal()) {
                        break;
                    } else {
                        enumC13715a = gh9.EnumC13715a.values()[iMo22738r5];
                        break;
                    }
                case 4:
                    jMo22738r2 = ka9Var.mo22738r();
                    break;
                case 5:
                    iMo22738r = (int) (ka9Var.mo22738r() * hri.m31025e());
                    break;
                case 6:
                    iMo22738r2 = (int) (ka9Var.mo22738r() * hri.m31025e());
                    break;
                case 7:
                    color = Color.parseColor(ka9Var.mo22740t());
                    break;
                case 8:
                    rg0VarM48303g = sg0.m48303g(ka9Var, amaVar);
                    break;
                case 9:
                    int iMo22738r6 = ka9Var.mo22738r();
                    if (iMo22738r6 < gh9.EnumC13716b.values().length) {
                        enumC13716b2 = gh9.EnumC13716b.values()[iMo22738r6];
                        int i = C14293a.f28674a[enumC13716b2.ordinal()];
                        if (i == 1) {
                            amaVar.m17437a("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            amaVar.m17437a("Unsupported matte type: Luma Inverted");
                        }
                        amaVar.m17454r(1);
                        break;
                    } else {
                        amaVar.m17437a("Unsupported matte type: " + iMo22738r6);
                        break;
                    }
                case 10:
                    ka9Var.mo22731c();
                    while (ka9Var.mo22735h()) {
                        arrayList3.add(wsa.m54952a(ka9Var, amaVar));
                    }
                    amaVar.m17454r(arrayList3.size());
                    ka9Var.mo22733f();
                    break;
                case 11:
                    ka9Var.mo22731c();
                    while (ka9Var.mo22735h()) {
                        z24 z24VarM16370a = a34.m16370a(ka9Var, amaVar);
                        if (z24VarM16370a != null) {
                            arrayList4.add(z24VarM16370a);
                        }
                    }
                    ka9Var.mo22733f();
                    break;
                case 12:
                    ka9Var.mo22732d();
                    while (ka9Var.mo22735h()) {
                        int iMo22724H = ka9Var.mo22724H(f28672b);
                        if (iMo22724H == 0) {
                            og0VarM51553d = ug0.m51553d(ka9Var, amaVar);
                        } else if (iMo22724H != 1) {
                            ka9Var.mo22725J();
                            ka9Var.mo22726K();
                        } else {
                            ka9Var.mo22731c();
                            if (ka9Var.mo22735h()) {
                                pg0VarM45370a = qg0.m45370a(ka9Var, amaVar);
                            }
                            while (ka9Var.mo22735h()) {
                                ka9Var.mo22726K();
                            }
                            ka9Var.mo22733f();
                        }
                    }
                    ka9Var.mo22734g();
                    break;
                case 13:
                    ka9Var.mo22731c();
                    ArrayList arrayList5 = new ArrayList();
                    while (ka9Var.mo22735h()) {
                        ka9Var.mo22732d();
                        while (ka9Var.mo22735h()) {
                            int iMo22724H2 = ka9Var.mo22724H(f28673c);
                            if (iMo22724H2 == 0) {
                                int iMo22738r7 = ka9Var.mo22738r();
                                if (iMo22738r7 == 29) {
                                    yj1VarM59505b = zj1.m59505b(ka9Var, amaVar);
                                } else if (iMo22738r7 == 25) {
                                    tz5VarM52176b = new uz5().m52176b(ka9Var, amaVar);
                                }
                            } else if (iMo22724H2 != 1) {
                                ka9Var.mo22725J();
                                ka9Var.mo22726K();
                            } else {
                                arrayList5.add(ka9Var.mo22740t());
                            }
                        }
                        ka9Var.mo22734g();
                    }
                    ka9Var.mo22733f();
                    amaVar.m17437a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    fMo22737o = (float) ka9Var.mo22737o();
                    break;
                case 15:
                    fMo22737o3 = (float) ka9Var.mo22737o();
                    break;
                case 16:
                    iMo22738r3 = (int) (ka9Var.mo22738r() * hri.m31025e());
                    break;
                case 17:
                    iMo22738r4 = (int) (ka9Var.mo22738r() * hri.m31025e());
                    break;
                case 18:
                    fMo22737o2 = (float) ka9Var.mo22737o();
                    break;
                case 19:
                    fM17442f = (float) ka9Var.mo22737o();
                    break;
                case 20:
                    fg0VarM51555f = ug0.m51555f(ka9Var, amaVar, false);
                    break;
                case 21:
                    strMo22740t3 = ka9Var.mo22740t();
                    break;
                case 22:
                    zMo22736k = ka9Var.mo22736k();
                    break;
                default:
                    ka9Var.mo22725J();
                    ka9Var.mo22726K();
                    break;
            }
        }
        ka9Var.mo22734g();
        ArrayList arrayList6 = new ArrayList();
        if (fMo22737o2 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new sd9(amaVar, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(fMo22737o2)));
            f = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (fM17442f <= f) {
            fM17442f = amaVar.m17442f();
        }
        arrayList2.add(new sd9(amaVar, fValueOf, fValueOf, null, fMo22737o2, Float.valueOf(fM17442f)));
        arrayList2.add(new sd9(amaVar, fValueOf2, fValueOf2, null, fM17442f, Float.valueOf(Float.MAX_VALUE)));
        if (strMo22740t2.endsWith(".ai") || "ai".equals(strMo22740t3)) {
            amaVar.m17437a("Convert your Illustrator layers to shape layers.");
        }
        return new gh9(arrayList4, amaVar, strMo22740t2, jMo22738r, enumC13715a, jMo22738r2, strMo22740t, arrayList, rg0VarM48303g, iMo22738r, iMo22738r2, color, fMo22737o, fMo22737o3, iMo22738r3, iMo22738r4, og0VarM51553d, pg0VarM45370a, arrayList2, enumC13716b2, fg0VarM51555f, zMo22736k, yj1VarM59505b, tz5VarM52176b);
    }

    /* renamed from: b */
    public static gh9 m32141b(ama amaVar) {
        Rect rectM17438b = amaVar.m17438b();
        return new gh9(Collections.emptyList(), amaVar, "__container", -1L, gh9.EnumC13715a.PRE_COMP, -1L, null, Collections.emptyList(), new rg0(), 0, 0, 0, 0.0f, 0.0f, rectM17438b.width(), rectM17438b.height(), null, null, Collections.emptyList(), gh9.EnumC13716b.NONE, null, false, null, null);
    }
}
