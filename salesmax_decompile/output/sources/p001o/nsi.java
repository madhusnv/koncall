package p001o;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class nsi {

    /* renamed from: a */
    public static Map f37278a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: o.nsi$a */
    public static class C15666a {
        /* renamed from: a */
        public static float m41104a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        /* renamed from: b */
        public static float m41105b(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        /* renamed from: c */
        public static boolean m41106c(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }
    }

    /* renamed from: a */
    public static void m41099a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f37278a.containsKey(velocityTracker)) {
                f37278a.put(velocityTracker, new osi());
            }
            ((osi) f37278a.get(velocityTracker)).m42640a(motionEvent);
        }
    }

    /* renamed from: b */
    public static void m41100b(VelocityTracker velocityTracker, int i) {
        m41101c(velocityTracker, i, Float.MAX_VALUE);
    }

    /* renamed from: c */
    public static void m41101c(VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        osi osiVarM41103e = m41103e(velocityTracker);
        if (osiVarM41103e != null) {
            osiVarM41103e.m42642c(i, f);
        }
    }

    /* renamed from: d */
    public static float m41102d(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C15666a.m41104a(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        osi osiVarM41103e = m41103e(velocityTracker);
        if (osiVarM41103e != null) {
            return osiVarM41103e.m42643d(i);
        }
        return 0.0f;
    }

    /* renamed from: e */
    public static osi m41103e(VelocityTracker velocityTracker) {
        return (osi) f37278a.get(velocityTracker);
    }
}
