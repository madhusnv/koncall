package y7;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class g0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public t0 f41639a;

    /* renamed from: b */
    public final Rect f41640b;

    /* renamed from: c */
    public boolean f41641c;

    /* renamed from: d */
    public boolean f41642d;

    public g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41640b = new Rect();
        this.f41641c = true;
        this.f41642d = false;
    }

    public g0(int i10, int i11) {
        super(i10, i11);
        this.f41640b = new Rect();
        this.f41641c = true;
        this.f41642d = false;
    }

    public g0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f41640b = new Rect();
        this.f41641c = true;
        this.f41642d = false;
    }

    public g0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f41640b = new Rect();
        this.f41641c = true;
        this.f41642d = false;
    }

    public g0(g0 g0Var) {
        super((ViewGroup.LayoutParams) g0Var);
        this.f41640b = new Rect();
        this.f41641c = true;
        this.f41642d = false;
    }
}
