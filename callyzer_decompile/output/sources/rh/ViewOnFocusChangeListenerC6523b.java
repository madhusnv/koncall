package rh;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.b */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC6523b implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f31297a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6536o f31298b;

    public /* synthetic */ ViewOnFocusChangeListenerC6523b(AbstractC6536o abstractC6536o, int i10) {
        this.f31297a = i10;
        this.f31298b = abstractC6536o;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z6) {
        switch (this.f31297a) {
            case 0:
                ((C6528g) this.f31298b).m12553d(!TextUtils.isEmpty(((EditText) view).getText()) && z6);
                break;
            default:
                C6535n c6535n = (C6535n) this.f31298b;
                c6535n.f31336a.setEndIconActivated(z6);
                if (!z6) {
                    c6535n.m12559g(false);
                    c6535n.f31328i = false;
                    break;
                }
                break;
        }
    }
}
