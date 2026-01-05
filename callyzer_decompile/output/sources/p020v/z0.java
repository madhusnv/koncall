package p020v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import i0.C3076g;
import i0.j1;
import i0.p2;
import i0.s0;
import i0.w2;
import i0.y2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.qe;
import p019u.C7286a;
import p021w.C7843i;
import pg.f6;
import rw.AbstractC6662l;
import sw.C6962f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a */
    public static final C3076g f36763a;

    /* renamed from: b */
    public static final C6962f f36764b;

    /* renamed from: c */
    public static final C6962f f36765c;

    static {
        Class cls = Long.TYPE;
        AbstractC4154l.m8920c(cls);
        f36763a = new C3076g("camera2.streamSpec.streamUseCase", cls, null);
        C6962f c6962f = new C6962f();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            y2 y2Var = y2.PREVIEW;
            y2 y2Var2 = y2.METERING_REPEATING;
            y2 y2Var3 = y2.IMAGE_ANALYSIS;
            c6962f.put(4L, AbstractC6662l.m12710M(new y2[]{y2Var, y2Var2, y2Var3}));
            c6962f.put(1L, AbstractC6662l.m12710M(new y2[]{y2Var, y2Var2, y2Var3}));
            c6962f.put(2L, qe.m10862h(y2.IMAGE_CAPTURE));
            c6962f.put(3L, qe.m10862h(y2.VIDEO_CAPTURE));
        }
        f36764b = c6962f.m13230d();
        C6962f c6962f2 = new C6962f();
        if (i10 >= 33) {
            y2 y2Var4 = y2.PREVIEW;
            y2 y2Var5 = y2.IMAGE_CAPTURE;
            y2 y2Var6 = y2.VIDEO_CAPTURE;
            c6962f2.put(4L, AbstractC6662l.m12710M(new y2[]{y2Var4, y2Var5, y2Var6}));
            c6962f2.put(3L, AbstractC6662l.m12710M(new y2[]{y2Var4, y2Var6}));
        }
        f36765c = c6962f2.m13230d();
    }

    /* renamed from: a */
    public static final boolean m14496a(C7843i characteristicsCompat, List list) {
        long[] jArr;
        AbstractC4154l.m8923f(characteristicsCompat, "characteristicsCompat");
        if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) characteristicsCompat.m14823a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j6 : jArr) {
                hashSet.add(Long.valueOf(j6));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!hashSet.contains(Long.valueOf(((p2) it.next()).f16560c.getValue()))) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C7286a m14497b(s0 s0Var, Long l9) {
        C3076g c3076g = f36763a;
        if (s0Var.mo7404i(c3076g) && AbstractC4154l.m8918a(s0Var.mo7406k(c3076g), l9)) {
            return null;
        }
        j1 j1VarM7350g = j1.m7350g(s0Var);
        j1VarM7350g.m7352n(c3076g, l9);
        return new C7286a(3, j1VarM7350g);
    }

    /* renamed from: c */
    public static boolean m14498c(y2 y2Var, long j6, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (y2Var != y2.STREAM_SHARING) {
            Long lValueOf = Long.valueOf(j6);
            C6962f c6962f = f36764b;
            if (!c6962f.containsKey(lValueOf)) {
                return false;
            }
            Object obj = c6962f.get(Long.valueOf(j6));
            AbstractC4154l.m8920c(obj);
            return ((Set) obj).contains(y2Var);
        }
        Long lValueOf2 = Long.valueOf(j6);
        C6962f c6962f2 = f36765c;
        if (!c6962f2.containsKey(lValueOf2)) {
            return false;
        }
        Object obj2 = c6962f2.get(Long.valueOf(j6));
        AbstractC4154l.m8920c(obj2);
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((y2) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m14499d(C7843i characteristicsCompat) {
        long[] jArr;
        AbstractC4154l.m8923f(characteristicsCompat, "characteristicsCompat");
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.m14823a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    /* renamed from: e */
    public static boolean m14500e(s0 s0Var, y2 y2Var) {
        Object objMo7401e = s0Var.mo7401e(w2.A0, Boolean.FALSE);
        AbstractC4154l.m8920c(objMo7401e);
        if (((Boolean) objMo7401e).booleanValue()) {
            return false;
        }
        C3076g c3076g = i0.z0.f16622b;
        if (!s0Var.mo7404i(c3076g)) {
            return false;
        }
        Object objMo7406k = s0Var.mo7406k(c3076g);
        AbstractC4154l.m8920c(objMo7406k);
        return f6.m11619b(y2Var, ((Number) objMo7406k).intValue()) == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m14501f(p021w.C7843i r17, java.util.ArrayList r18, java.util.HashMap r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.z0.m14501f(w.i, java.util.ArrayList, java.util.HashMap, java.util.HashMap):boolean");
    }
}
