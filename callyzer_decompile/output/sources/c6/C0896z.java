package c6;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.z */
/* loaded from: classes.dex */
public final class C0896z implements a0 {

    /* renamed from: a */
    public final ScrollFeedbackProvider f5542a;

    public C0896z(NestedScrollView nestedScrollView) {
        this.f5542a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // c6.a0
    public final void onScrollLimit(int i10, int i11, int i12, boolean z6) {
        this.f5542a.onScrollLimit(i10, i11, i12, z6);
    }

    @Override // c6.a0
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f5542a.onScrollProgress(i10, i11, i12, i13);
    }
}
