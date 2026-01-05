package c6;

import android.view.ContentInfo;
import android.view.View;
import c4.C0861k;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t0 {
    /* renamed from: a */
    public static String[] m2515a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* renamed from: b */
    public static C0877g m2516b(View view, C0877g c0877g) {
        ContentInfo contentInfoMo2307e = c0877g.f5450a.mo2307e();
        Objects.requireNonNull(contentInfoMo2307e);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo2307e);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo2307e ? c0877g : new C0877g(new C0861k(contentInfoPerformReceiveContent));
    }
}
