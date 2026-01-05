package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.perf.util.Constants;
import p001o.mbe;
import p001o.zt3;

/* loaded from: classes2.dex */
public class Placeholder extends View {

    /* renamed from: a */
    public int f6939a;

    /* renamed from: b */
    public View f6940b;

    /* renamed from: c */
    public int f6941c;

    public Placeholder(Context context) {
        super(context);
        this.f6939a = -1;
        this.f6940b = null;
        this.f6941c = 4;
        m5632a(null);
    }

    /* renamed from: a */
    public final void m5632a(AttributeSet attributeSet) {
        super.setVisibility(this.f6941c);
        this.f6939a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ConstraintLayout_placeholder_content) {
                    this.f6939a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6939a);
                } else if (index == mbe.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f6941c = typedArrayObtainStyledAttributes.getInt(index, this.f6941c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void m5633b(ConstraintLayout constraintLayout) {
        if (this.f6940b == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f6940b.getLayoutParams();
        layoutParams2.v0.o1(0);
        zt3.EnumC18702b enumC18702bM59825C = layoutParams.v0.m59825C();
        zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.FIXED;
        if (enumC18702bM59825C != enumC18702b) {
            layoutParams.v0.p1(layoutParams2.v0.m59846Y());
        }
        if (layoutParams.v0.m59843V() != enumC18702b) {
            layoutParams.v0.Q0(layoutParams2.v0.m59866z());
        }
        layoutParams2.v0.o1(8);
    }

    /* renamed from: c */
    public void m5634c(ConstraintLayout constraintLayout) {
        if (this.f6939a == -1 && !isInEditMode()) {
            setVisibility(this.f6941c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f6939a);
        this.f6940b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).j0 = true;
            this.f6940b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f6940b;
    }

    public int getEmptyVisibility() {
        return this.f6941c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(Constants.MAX_HOST_LENGTH, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f6939a == i) {
            return;
        }
        View view = this.f6940b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f6940b.getLayoutParams()).j0 = false;
            this.f6940b = null;
        }
        this.f6939a = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f6941c = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6939a = -1;
        this.f6940b = null;
        this.f6941c = 4;
        m5632a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6939a = -1;
        this.f6940b = null;
        this.f6941c = 4;
        m5632a(attributeSet);
    }
}
