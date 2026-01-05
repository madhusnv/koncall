package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001o.j5e;

/* loaded from: classes2.dex */
public class CrashWhenTakingPhotoWithAutoFlashAEModeQuirk implements j5e {

    /* renamed from: a */
    public static final List f6061a = Arrays.asList("SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X");

    /* renamed from: c */
    public static boolean m4537c() {
        return f6061a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
