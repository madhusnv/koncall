package p001o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes3.dex */
public class vxi implements wxi {

    /* renamed from: a */
    public final ViewOverlay f51012a;

    public vxi(View view) {
        this.f51012a = view.getOverlay();
    }

    @Override // p001o.wxi
    /* renamed from: a */
    public void mo53593a(Drawable drawable) {
        this.f51012a.add(drawable);
    }

    @Override // p001o.wxi
    /* renamed from: b */
    public void mo53594b(Drawable drawable) {
        this.f51012a.remove(drawable);
    }
}
