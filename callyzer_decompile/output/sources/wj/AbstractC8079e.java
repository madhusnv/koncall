package wj;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.e */
/* loaded from: classes.dex */
public abstract class AbstractC8079e {

    /* renamed from: a */
    public static final AtomicInteger f38695a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v70, types: [int] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static wj.C8083i m15217a(com.google.firebase.messaging.FirebaseMessagingService r16, v0.C7622f r17) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.AbstractC8079e.m15217a(com.google.firebase.messaging.FirebaseMessagingService, v0.f):wj.i");
    }

    /* renamed from: b */
    public static boolean m15218b(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
