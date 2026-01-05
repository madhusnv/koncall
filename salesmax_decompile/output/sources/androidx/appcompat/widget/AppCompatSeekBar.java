package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p001o.dkh;
import p001o.mk0;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a */
    public final mk0 f5825a;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f5825a.m39253h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f5825a.m39254i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5825a.m39252g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dkh.m23377a(this, getContext());
        mk0 mk0Var = new mk0(this);
        this.f5825a = mk0Var;
        mk0Var.mo33888c(attributeSet, i);
    }
}
