package p001o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class cb extends ClickableSpan {

    /* renamed from: a */
    public final int f17660a;

    /* renamed from: b */
    public final cc f17661b;

    /* renamed from: c */
    public final int f17662c;

    public cb(int i, cc ccVar, int i2) {
        this.f17660a = i;
        this.f17661b = ccVar;
        this.f17662c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f17660a);
        this.f17661b.d0(this.f17662c, bundle);
    }
}
