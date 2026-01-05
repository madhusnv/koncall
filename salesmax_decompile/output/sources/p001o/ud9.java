package p001o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.lang.ref.WeakReference;
import p001o.ka9;

/* loaded from: classes3.dex */
public abstract class ud9 {

    /* renamed from: b */
    public static d0g f48740b;

    /* renamed from: a */
    public static final Interpolator f48739a = new LinearInterpolator();

    /* renamed from: c */
    public static ka9.C14756a f48741c = ka9.C14756a.m35230a("t", "s", "e", NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST, "i", "h", "to", "ti");

    /* renamed from: d */
    public static ka9.C14756a f48742d = ka9.C14756a.m35230a("x", "y");

    /* renamed from: a */
    public static WeakReference m51375a(int i) {
        WeakReference weakReference;
        synchronized (ud9.class) {
            weakReference = (WeakReference) m51381g().m22184f(i);
        }
        return weakReference;
    }

    /* renamed from: b */
    public static Interpolator m51376b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorM16309a;
        pointF.x = zeb.m59348c(pointF.x, -1.0f, 1.0f);
        pointF.y = zeb.m59348c(pointF.y, -100.0f, 100.0f);
        pointF2.x = zeb.m59348c(pointF2.x, -1.0f, 1.0f);
        float fM59348c = zeb.m59348c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fM59348c;
        int iM31029i = hri.m31029i(pointF.x, pointF.y, pointF2.x, fM59348c);
        WeakReference weakReferenceM51375a = m51375a(iM31029i);
        Interpolator interpolator = weakReferenceM51375a != null ? (Interpolator) weakReferenceM51375a.get() : null;
        if (weakReferenceM51375a == null || interpolator == null) {
            try {
                interpolatorM16309a = a0d.m16309a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolatorM16309a = "The Path cannot loop back on itself.".equals(e.getMessage()) ? a0d.m16309a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorM16309a;
            try {
                m51382h(iM31029i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* renamed from: c */
    public static sd9 m51377c(ka9 ka9Var, ama amaVar, float f, wri wriVar, boolean z, boolean z2) {
        return (z && z2) ? m51379e(amaVar, ka9Var, f, wriVar) : z ? m51378d(amaVar, ka9Var, f, wriVar) : m51380f(ka9Var, f, wriVar);
    }

    /* renamed from: d */
    public static sd9 m51378d(ama amaVar, ka9 ka9Var, float f, wri wriVar) {
        Interpolator interpolatorM51376b;
        Object obj;
        ka9Var.mo22732d();
        PointF pointFM24698e = null;
        Object objMo23422a = null;
        Object objMo23422a2 = null;
        PointF pointFM24698e2 = null;
        PointF pointFM24698e3 = null;
        float fMo22737o = 0.0f;
        boolean z = false;
        PointF pointFM24698e4 = null;
        while (ka9Var.mo22735h()) {
            switch (ka9Var.mo22724H(f48741c)) {
                case 0:
                    fMo22737o = (float) ka9Var.mo22737o();
                    break;
                case 1:
                    objMo23422a2 = wriVar.mo23422a(ka9Var, f);
                    break;
                case 2:
                    objMo23422a = wriVar.mo23422a(ka9Var, f);
                    break;
                case 3:
                    pointFM24698e = eb9.m24698e(ka9Var, 1.0f);
                    break;
                case 4:
                    pointFM24698e4 = eb9.m24698e(ka9Var, 1.0f);
                    break;
                case 5:
                    if (ka9Var.mo22738r() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointFM24698e2 = eb9.m24698e(ka9Var, f);
                    break;
                case 7:
                    pointFM24698e3 = eb9.m24698e(ka9Var, f);
                    break;
                default:
                    ka9Var.mo22726K();
                    break;
            }
        }
        ka9Var.mo22734g();
        if (z) {
            interpolatorM51376b = f48739a;
            obj = objMo23422a2;
        } else {
            interpolatorM51376b = (pointFM24698e == null || pointFM24698e4 == null) ? f48739a : m51376b(pointFM24698e, pointFM24698e4);
            obj = objMo23422a;
        }
        sd9 sd9Var = new sd9(amaVar, objMo23422a2, obj, interpolatorM51376b, fMo22737o, null);
        sd9Var.f45256o = pointFM24698e2;
        sd9Var.f45257p = pointFM24698e3;
        return sd9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sd9 m51379e(ama amaVar, ka9 ka9Var, float f, wri wriVar) {
        Interpolator interpolatorM51376b;
        Interpolator interpolatorM51376b2;
        Interpolator interpolatorM51376b3;
        Object obj;
        PointF pointF;
        sd9 sd9Var;
        PointF pointF2;
        float f2;
        PointF pointF3;
        ka9Var.mo22732d();
        PointF pointFM24698e = null;
        boolean z = false;
        PointF pointFM24698e2 = null;
        PointF pointFM24698e3 = null;
        PointF pointF4 = null;
        Object objMo23422a = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        float fMo22737o = 0.0f;
        PointF pointFM24698e4 = null;
        Object objMo23422a2 = null;
        while (ka9Var.mo22735h()) {
            switch (ka9Var.mo22724H(f48741c)) {
                case 0:
                    pointF2 = pointFM24698e;
                    fMo22737o = (float) ka9Var.mo22737o();
                    pointFM24698e = pointF2;
                    break;
                case 1:
                    pointF2 = pointFM24698e;
                    objMo23422a = wriVar.mo23422a(ka9Var, f);
                    pointFM24698e = pointF2;
                    break;
                case 2:
                    pointF2 = pointFM24698e;
                    objMo23422a2 = wriVar.mo23422a(ka9Var, f);
                    pointFM24698e = pointF2;
                    break;
                case 3:
                    pointF2 = pointFM24698e;
                    f2 = fMo22737o;
                    PointF pointF8 = pointFM24698e4;
                    if (ka9Var.mo22723C() == ka9.EnumC14757b.BEGIN_OBJECT) {
                        ka9Var.mo22732d();
                        float fMo22737o2 = 0.0f;
                        float fMo22737o3 = 0.0f;
                        float fMo22737o4 = 0.0f;
                        float fMo22737o5 = 0.0f;
                        while (ka9Var.mo22735h()) {
                            int iMo22724H = ka9Var.mo22724H(f48742d);
                            if (iMo22724H == 0) {
                                ka9.EnumC14757b enumC14757bMo22723C = ka9Var.mo22723C();
                                ka9.EnumC14757b enumC14757b = ka9.EnumC14757b.NUMBER;
                                if (enumC14757bMo22723C == enumC14757b) {
                                    fMo22737o4 = (float) ka9Var.mo22737o();
                                    fMo22737o2 = fMo22737o4;
                                } else {
                                    ka9Var.mo22731c();
                                    fMo22737o2 = (float) ka9Var.mo22737o();
                                    fMo22737o4 = ka9Var.mo22723C() == enumC14757b ? (float) ka9Var.mo22737o() : fMo22737o2;
                                    ka9Var.mo22733f();
                                }
                            } else if (iMo22724H != 1) {
                                ka9Var.mo22726K();
                            } else {
                                ka9.EnumC14757b enumC14757bMo22723C2 = ka9Var.mo22723C();
                                ka9.EnumC14757b enumC14757b2 = ka9.EnumC14757b.NUMBER;
                                if (enumC14757bMo22723C2 == enumC14757b2) {
                                    fMo22737o5 = (float) ka9Var.mo22737o();
                                    fMo22737o3 = fMo22737o5;
                                } else {
                                    ka9Var.mo22731c();
                                    fMo22737o3 = (float) ka9Var.mo22737o();
                                    fMo22737o5 = ka9Var.mo22723C() == enumC14757b2 ? (float) ka9Var.mo22737o() : fMo22737o3;
                                    ka9Var.mo22733f();
                                }
                            }
                        }
                        PointF pointF9 = new PointF(fMo22737o2, fMo22737o3);
                        PointF pointF10 = new PointF(fMo22737o4, fMo22737o5);
                        ka9Var.mo22734g();
                        pointF5 = pointF10;
                        pointF4 = pointF9;
                        pointFM24698e4 = pointF8;
                        fMo22737o = f2;
                        pointFM24698e = pointF2;
                        break;
                    } else {
                        pointFM24698e2 = eb9.m24698e(ka9Var, f);
                        fMo22737o = f2;
                        pointFM24698e4 = pointF8;
                        pointFM24698e = pointF2;
                    }
                case 4:
                    if (ka9Var.mo22723C() == ka9.EnumC14757b.BEGIN_OBJECT) {
                        ka9Var.mo22732d();
                        float fMo22737o6 = 0.0f;
                        float f3 = 0.0f;
                        float fMo22737o7 = 0.0f;
                        float fMo22737o8 = 0.0f;
                        while (ka9Var.mo22735h()) {
                            PointF pointF11 = pointFM24698e4;
                            int iMo22724H2 = ka9Var.mo22724H(f48742d);
                            if (iMo22724H2 != 0) {
                                pointF3 = pointFM24698e;
                                if (iMo22724H2 != 1) {
                                    ka9Var.mo22726K();
                                } else {
                                    ka9.EnumC14757b enumC14757bMo22723C3 = ka9Var.mo22723C();
                                    ka9.EnumC14757b enumC14757b3 = ka9.EnumC14757b.NUMBER;
                                    if (enumC14757bMo22723C3 == enumC14757b3) {
                                        fMo22737o8 = (float) ka9Var.mo22737o();
                                        fMo22737o = fMo22737o;
                                        f3 = fMo22737o8;
                                    } else {
                                        float f4 = fMo22737o;
                                        ka9Var.mo22731c();
                                        float fMo22737o9 = (float) ka9Var.mo22737o();
                                        float fMo22737o10 = ka9Var.mo22723C() == enumC14757b3 ? (float) ka9Var.mo22737o() : fMo22737o9;
                                        ka9Var.mo22733f();
                                        fMo22737o = f4;
                                        pointFM24698e4 = pointF11;
                                        pointFM24698e = pointF3;
                                        fMo22737o8 = fMo22737o10;
                                        f3 = fMo22737o9;
                                    }
                                }
                            } else {
                                pointF3 = pointFM24698e;
                                float f5 = fMo22737o;
                                ka9.EnumC14757b enumC14757bMo22723C4 = ka9Var.mo22723C();
                                ka9.EnumC14757b enumC14757b4 = ka9.EnumC14757b.NUMBER;
                                if (enumC14757bMo22723C4 == enumC14757b4) {
                                    fMo22737o7 = (float) ka9Var.mo22737o();
                                    fMo22737o = f5;
                                    fMo22737o6 = fMo22737o7;
                                } else {
                                    ka9Var.mo22731c();
                                    fMo22737o6 = (float) ka9Var.mo22737o();
                                    fMo22737o7 = ka9Var.mo22723C() == enumC14757b4 ? (float) ka9Var.mo22737o() : fMo22737o6;
                                    ka9Var.mo22733f();
                                    fMo22737o = f5;
                                }
                            }
                            pointFM24698e4 = pointF11;
                            pointFM24698e = pointF3;
                        }
                        pointF2 = pointFM24698e;
                        f2 = fMo22737o;
                        PointF pointF12 = new PointF(fMo22737o6, f3);
                        PointF pointF13 = new PointF(fMo22737o7, fMo22737o8);
                        ka9Var.mo22734g();
                        pointF7 = pointF13;
                        pointF6 = pointF12;
                        fMo22737o = f2;
                        pointFM24698e = pointF2;
                        break;
                    } else {
                        pointF2 = pointFM24698e;
                        pointFM24698e3 = eb9.m24698e(ka9Var, f);
                        pointFM24698e = pointF2;
                    }
                case 5:
                    if (ka9Var.mo22738r() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointFM24698e4 = eb9.m24698e(ka9Var, f);
                    break;
                case 7:
                    pointFM24698e = eb9.m24698e(ka9Var, f);
                    break;
                default:
                    pointF2 = pointFM24698e;
                    ka9Var.mo22726K();
                    pointFM24698e = pointF2;
                    break;
            }
        }
        PointF pointF14 = pointFM24698e;
        float f6 = fMo22737o;
        PointF pointF15 = pointFM24698e4;
        ka9Var.mo22734g();
        if (z) {
            interpolatorM51376b = f48739a;
            obj = objMo23422a;
        } else {
            if (pointFM24698e2 != null && pointFM24698e3 != null) {
                interpolatorM51376b = m51376b(pointFM24698e2, pointFM24698e3);
            } else {
                if (pointF4 != null && pointF5 != null && pointF6 != null && pointF7 != null) {
                    interpolatorM51376b2 = m51376b(pointF4, pointF6);
                    interpolatorM51376b3 = m51376b(pointF5, pointF7);
                    obj = objMo23422a2;
                    interpolatorM51376b = null;
                    if (interpolatorM51376b2 != null || interpolatorM51376b3 == null) {
                        pointF = pointF15;
                        sd9Var = new sd9(amaVar, objMo23422a, obj, interpolatorM51376b, f6, null);
                    } else {
                        pointF = pointF15;
                        sd9Var = new sd9(amaVar, objMo23422a, obj, interpolatorM51376b2, interpolatorM51376b3, f6, null);
                    }
                    sd9Var.f45256o = pointF;
                    sd9Var.f45257p = pointF14;
                    return sd9Var;
                }
                interpolatorM51376b = f48739a;
            }
            obj = objMo23422a2;
        }
        interpolatorM51376b2 = null;
        interpolatorM51376b3 = null;
        if (interpolatorM51376b2 != null) {
            pointF = pointF15;
            sd9Var = new sd9(amaVar, objMo23422a, obj, interpolatorM51376b, f6, null);
        }
        sd9Var.f45256o = pointF;
        sd9Var.f45257p = pointF14;
        return sd9Var;
    }

    /* renamed from: f */
    public static sd9 m51380f(ka9 ka9Var, float f, wri wriVar) {
        return new sd9(wriVar.mo23422a(ka9Var, f));
    }

    /* renamed from: g */
    public static d0g m51381g() {
        if (f48740b == null) {
            f48740b = new d0g();
        }
        return f48740b;
    }

    /* renamed from: h */
    public static void m51382h(int i, WeakReference weakReference) {
        synchronized (ud9.class) {
            f48740b.m22190l(i, weakReference);
        }
    }
}
