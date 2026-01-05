package q5;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q5.j */
/* loaded from: classes.dex */
public abstract class AbstractC6117j {
    /* renamed from: a */
    public static AudioAttributes m12146a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    /* renamed from: b */
    public static AudioAttributes.Builder m12147b() {
        return new AudioAttributes.Builder();
    }

    /* renamed from: c */
    public static AudioAttributes.Builder m12148c(AudioAttributes.Builder builder, int i10) {
        return builder.setContentType(i10);
    }

    /* renamed from: d */
    public static AudioAttributes.Builder m12149d(AudioAttributes.Builder builder, int i10) {
        return builder.setUsage(i10);
    }
}
