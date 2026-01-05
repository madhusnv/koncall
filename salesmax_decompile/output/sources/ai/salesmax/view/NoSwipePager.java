package ai.salesmax.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class NoSwipePager extends ViewPager {
    public boolean Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSwipePager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
    }

    public final boolean getPagingEnabled() {
        return this.Y0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        sq8.m48649h(motionEvent, "event");
        if (this.Y0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        sq8.m48649h(motionEvent, "event");
        if (this.Y0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setPagingEnabled(boolean z) {
        this.Y0 = z;
    }
}
