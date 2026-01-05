package androidx.camera.core.internal.compat.quirk;

import c0.b2;
import c0.k1;
import c0.v0;
import i0.s1;
import i0.w2;
import i0.y2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements s1 {

    /* renamed from: a */
    public static final HashSet f1855a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    /* renamed from: b */
    public static boolean m613b(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z6 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (it.hasNext()) {
                b2 b2Var = (b2) it.next();
                if (b2Var instanceof k1) {
                    z6 = true;
                } else if (b2Var instanceof v0) {
                    z11 = true;
                } else if (b2Var.f5052g.mo7404i(w2.C0)) {
                    z10 = b2Var.f5052g.mo7421E() == y2.VIDEO_CAPTURE;
                }
            }
            if (z6 && z10 && z11) {
                return true;
            }
        }
        return false;
    }
}
