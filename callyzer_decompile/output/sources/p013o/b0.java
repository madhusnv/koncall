package p013o;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import fh.RunnableC2286a;
import java.lang.ref.WeakReference;
import t5.AbstractC7044b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC7044b {

    /* renamed from: e */
    public final /* synthetic */ int f25441e;

    /* renamed from: f */
    public final /* synthetic */ int f25442f;

    /* renamed from: g */
    public final /* synthetic */ WeakReference f25443g;

    /* renamed from: h */
    public final /* synthetic */ f0 f25444h;

    public b0(f0 f0Var, int i10, int i11, WeakReference weakReference) {
        this.f25444h = f0Var;
        this.f25441e = i10;
        this.f25442f = i11;
        this.f25443g = weakReference;
    }

    @Override // t5.AbstractC7044b
    /* renamed from: h */
    public final void mo9654h(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f25441e) != -1) {
            typeface = e0.m10220a(typeface, i10, (this.f25442f & 2) != 0);
        }
        f0 f0Var = this.f25444h;
        if (f0Var.f25492m) {
            f0Var.f25491l = typeface;
            TextView textView = (TextView) this.f25443g.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC2286a(textView, typeface, f0Var.f25489j, 2));
                } else {
                    textView.setTypeface(typeface, f0Var.f25489j);
                }
            }
        }
    }

    @Override // t5.AbstractC7044b
    /* renamed from: g */
    public final void mo9653g(int i10) {
    }
}
