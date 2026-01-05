package s1;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a */
    public static final b0 f32168a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        f32168a = lowerCase.equals("robolectric") ? new b0() : null;
    }
}
