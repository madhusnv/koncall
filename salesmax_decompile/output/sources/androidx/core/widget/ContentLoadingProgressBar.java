package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes2.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    public long f7170a;

    /* renamed from: b */
    public boolean f7171b;

    /* renamed from: c */
    public boolean f7172c;

    /* renamed from: d */
    public boolean f7173d;

    /* renamed from: e */
    public final Runnable f7174e;

    /* renamed from: f */
    public final Runnable f7175f;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m5886c() {
        this.f7171b = false;
        this.f7170a = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m5887d() {
        this.f7172c = false;
        if (this.f7173d) {
            return;
        }
        this.f7170a = System.currentTimeMillis();
        setVisibility(0);
    }

    /* renamed from: e */
    public final void m5888e() {
        removeCallbacks(this.f7174e);
        removeCallbacks(this.f7175f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m5888e();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5888e();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7170a = -1L;
        this.f7171b = false;
        this.f7172c = false;
        this.f7173d = false;
        this.f7174e = new Runnable() { // from class: o.x24
            @Override // java.lang.Runnable
            public final void run() {
                this.f53092a.m5886c();
            }
        };
        this.f7175f = new Runnable() { // from class: o.y24
            @Override // java.lang.Runnable
            public final void run() {
                this.f54740a.m5887d();
            }
        };
    }
}
