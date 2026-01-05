package androidx.camera.camera2.internal.compat.quirk;

import java.util.Iterator;
import p001o.j5e;
import p001o.l5e;

/* loaded from: classes2.dex */
public interface CaptureIntentPreviewQuirk extends j5e {
    /* renamed from: b */
    static boolean m4530b(l5e l5eVar) {
        Iterator it = l5eVar.m36595c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).mo4531a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    default boolean mo4531a() {
        return true;
    }
}
