package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001o.s82;

/* loaded from: classes2.dex */
public final class JpegHalCorruptImageQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* renamed from: a */
    public static final Set f6081a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    /* renamed from: c */
    public static boolean m4603c(s82 s82Var) {
        return f6081a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
