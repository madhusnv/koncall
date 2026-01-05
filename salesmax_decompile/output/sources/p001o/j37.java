package p001o;

import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class j37 {
    /* renamed from: a */
    public static final float m33171a(i37 i37Var, i37 i37Var2, float f) {
        sq8.m48649h(i37Var, "xValues");
        sq8.m48649h(i37Var2, "yValues");
        if (!(0.0f <= f && f <= 1.0f)) {
            throw new IllegalArgumentException(("Invalid progress: " + f).toString());
        }
        Iterator it = bce.m18616s(0, i37Var.f27982b).iterator();
        while (it.hasNext()) {
            int iMo23412a = ((dl8) it).mo23412a();
            int i = iMo23412a + 1;
            if (m33172b(f, i37Var.m31461b(iMo23412a), i37Var.m31461b(i % i37Var.m31462c()))) {
                int iM31462c = i % i37Var.m31462c();
                float fM29423j = gri.m29423j(i37Var.m31461b(iM31462c) - i37Var.m31461b(iMo23412a), 1.0f);
                return gri.m29423j(i37Var2.m31461b(iMo23412a) + (gri.m29423j(i37Var2.m31461b(iM31462c) - i37Var2.m31461b(iMo23412a), 1.0f) * (fM29423j < 0.001f ? 0.5f : gri.m29423j(f - i37Var.m31461b(iMo23412a), 1.0f) / fM29423j)), 1.0f);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: b */
    public static final boolean m33172b(float f, float f2, float f3) {
        if (f3 >= f2) {
            if (f2 <= f && f <= f3) {
                return true;
            }
        } else if (f >= f2 || f <= f3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m33173c(i37 i37Var) {
        int i;
        sq8.m48649h(i37Var, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = i37Var.f27981a;
        int i2 = i37Var.f27982b;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= i2) {
                break;
            }
            float f = fArr[i3];
            if (boolValueOf.booleanValue()) {
                if (0.0f <= f && f <= 1.0f) {
                }
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
            i3++;
        }
        if (!boolValueOf.booleanValue()) {
            throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + i37.m31459f(i37Var, null, null, null, 0, null, 31, null)).toString());
        }
        Iterable iterableM18616s = bce.m18616s(1, i37Var.m31462c());
        if ((iterableM18616s instanceof Collection) && ((Collection) iterableM18616s).isEmpty()) {
            i = 0;
        } else {
            Iterator it = iterableM18616s.iterator();
            i = 0;
            while (it.hasNext()) {
                int iMo23412a = ((dl8) it).mo23412a();
                if ((i37Var.m31461b(iMo23412a) < i37Var.m31461b(iMo23412a - 1)) && (i = i + 1) < 0) {
                    ch3.m21255t();
                }
            }
        }
        if (i <= 1) {
            return;
        }
        throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + i37.m31459f(i37Var, null, null, null, 0, null, 31, null)).toString());
    }
}
