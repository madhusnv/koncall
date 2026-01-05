package p013o;

import android.widget.TextView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d0 {
    /* renamed from: a */
    public static int m10215a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: b */
    public static void m10216b(TextView textView, int i10, int i11, int i12, int i13) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    /* renamed from: c */
    public static void m10217c(TextView textView, int[] iArr, int i10) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    /* renamed from: d */
    public static boolean m10218d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
