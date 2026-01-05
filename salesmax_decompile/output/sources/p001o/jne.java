package p001o;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes2.dex */
public final class jne extends Animation {

    /* renamed from: a */
    public View f30827a;

    /* renamed from: b */
    public final int f30828b;

    /* renamed from: c */
    public final int f30829c;

    public jne(View view, int i, int i2) {
        sq8.m48649h(view, "view");
        this.f30827a = view;
        this.f30828b = i;
        this.f30829c = i2;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        sq8.m48649h(transformation, "t");
        if (this.f30828b == 0 || this.f30829c == 0) {
            this.f30827a.getLayoutParams().height = (int) (this.f30828b + ((this.f30829c - r0) * f));
        } else {
            this.f30827a.getLayoutParams().height = (int) (this.f30828b + (this.f30829c * f));
            int i = this.f30827a.getLayoutParams().height;
            StringBuilder sb = new StringBuilder();
            sb.append("applyTransformation: height = ");
            sb.append(i);
        }
        this.f30827a.requestLayout();
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
