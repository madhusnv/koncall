package h4;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2826c {
    /* renamed from: a */
    public static /* synthetic */ BoringLayout m6929a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z6, TextUtils.TruncateAt truncateAt, int i11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, 1.0f, DefinitionKt.NO_Float_VALUE, metrics, z6, truncateAt, i11, true);
    }
}
