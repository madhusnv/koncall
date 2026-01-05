package d6;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d6.a */
/* loaded from: classes.dex */
public final class C1611a extends ClickableSpan {

    /* renamed from: a */
    public final int f8039a;

    /* renamed from: b */
    public final C1617g f8040b;

    /* renamed from: c */
    public final int f8041c;

    public C1611a(int i10, C1617g c1617g, int i11) {
        this.f8039a = i10;
        this.f8040b = c1617g;
        this.f8041c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f8039a);
        this.f8040b.f8062a.performAction(this.f8041c, bundle);
    }
}
