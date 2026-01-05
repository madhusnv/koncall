package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p001o.dkh;
import p001o.jk0;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a */
    public final jk0 f5824a;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapM33887b = this.f5824a.m33887b();
        if (bitmapM33887b != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM33887b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dkh.m23377a(this, getContext());
        jk0 jk0Var = new jk0(this);
        this.f5824a = jk0Var;
        jk0Var.mo33888c(attributeSet, i);
    }
}
