package p001o;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p001o.mq3;

/* loaded from: classes2.dex */
public interface qd8 extends lce {

    /* renamed from: j */
    public static final mq3.AbstractC15402a f41684j = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.targetAspectRatio", lp0.class);

    /* renamed from: k */
    public static final mq3.AbstractC15402a f41685k;

    /* renamed from: l */
    public static final mq3.AbstractC15402a f41686l;

    /* renamed from: m */
    public static final mq3.AbstractC15402a f41687m;

    /* renamed from: n */
    public static final mq3.AbstractC15402a f41688n;

    /* renamed from: o */
    public static final mq3.AbstractC15402a f41689o;

    /* renamed from: p */
    public static final mq3.AbstractC15402a f41690p;

    /* renamed from: q */
    public static final mq3.AbstractC15402a f41691q;

    /* renamed from: r */
    public static final mq3.AbstractC15402a f41692r;

    /* renamed from: s */
    public static final mq3.AbstractC15402a f41693s;

    static {
        Class cls = Integer.TYPE;
        f41685k = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.targetRotation", cls);
        f41686l = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.appTargetRotation", cls);
        f41687m = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.mirrorMode", cls);
        f41688n = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.targetResolution", Size.class);
        f41689o = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.defaultResolution", Size.class);
        f41690p = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.maxResolution", Size.class);
        f41691q = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.supportedResolutions", List.class);
        f41692r = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.resolutionSelector", mne.class);
        f41693s = mq3.AbstractC15402a.m39507a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    /* renamed from: U */
    static void m45153U(qd8 qd8Var) {
        boolean zM45164w = qd8Var.m45164w();
        boolean z = qd8Var.m45158L(null) != null;
        if (zM45164w && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (qd8Var.m45156G(null) != null) {
            if (zM45164w || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    /* renamed from: D */
    default int m45154D(int i) {
        return ((Integer) mo36958d(f41685k, Integer.valueOf(i))).intValue();
    }

    /* renamed from: F */
    default List m45155F(List list) {
        List list2 = (List) mo36958d(f41693s, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    /* renamed from: G */
    default mne m45156G(mne mneVar) {
        return (mne) mo36958d(f41692r, mneVar);
    }

    /* renamed from: H */
    default Size m45157H(Size size) {
        return (Size) mo36958d(f41689o, size);
    }

    /* renamed from: L */
    default Size m45158L(Size size) {
        return (Size) mo36958d(f41688n, size);
    }

    /* renamed from: V */
    default int m45159V(int i) {
        return ((Integer) mo36958d(f41687m, Integer.valueOf(i))).intValue();
    }

    /* renamed from: i */
    default Size m45160i(Size size) {
        return (Size) mo36958d(f41690p, size);
    }

    /* renamed from: k */
    default List m45161k(List list) {
        return (List) mo36958d(f41691q, list);
    }

    /* renamed from: m */
    default mne m45162m() {
        return (mne) mo36960f(f41692r);
    }

    /* renamed from: o */
    default int m45163o(int i) {
        return ((Integer) mo36958d(f41686l, Integer.valueOf(i))).intValue();
    }

    /* renamed from: w */
    default boolean m45164w() {
        return mo36957c(f41684j);
    }

    /* renamed from: y */
    default int m45165y() {
        return ((Integer) mo36960f(f41684j)).intValue();
    }
}
