package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.perf.util.Constants;
import p001o.mbe;

/* loaded from: classes2.dex */
public class MockView extends View {

    /* renamed from: a */
    public Paint f6806a;

    /* renamed from: b */
    public Paint f6807b;

    /* renamed from: c */
    public Paint f6808c;

    /* renamed from: d */
    public boolean f6809d;

    /* renamed from: e */
    public boolean f6810e;

    /* renamed from: f */
    public String f6811f;

    /* renamed from: g */
    public Rect f6812g;

    /* renamed from: h */
    public int f6813h;

    /* renamed from: q */
    public int f6814q;

    /* renamed from: s */
    public int f6815s;

    /* renamed from: x */
    public int f6816x;

    public MockView(Context context) {
        super(context);
        this.f6806a = new Paint();
        this.f6807b = new Paint();
        this.f6808c = new Paint();
        this.f6809d = true;
        this.f6810e = true;
        this.f6811f = null;
        this.f6812g = new Rect();
        this.f6813h = Color.argb(Constants.MAX_HOST_LENGTH, 0, 0, 0);
        this.f6814q = Color.argb(Constants.MAX_HOST_LENGTH, 200, 200, 200);
        this.f6815s = Color.argb(Constants.MAX_HOST_LENGTH, 50, 50, 50);
        this.f6816x = 4;
        m5573a(context, null);
    }

    /* renamed from: a */
    public final void m5573a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.MockView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.MockView_mock_label) {
                    this.f6811f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == mbe.MockView_mock_showDiagonals) {
                    this.f6809d = typedArrayObtainStyledAttributes.getBoolean(index, this.f6809d);
                } else if (index == mbe.MockView_mock_diagonalsColor) {
                    this.f6813h = typedArrayObtainStyledAttributes.getColor(index, this.f6813h);
                } else if (index == mbe.MockView_mock_labelBackgroundColor) {
                    this.f6815s = typedArrayObtainStyledAttributes.getColor(index, this.f6815s);
                } else if (index == mbe.MockView_mock_labelColor) {
                    this.f6814q = typedArrayObtainStyledAttributes.getColor(index, this.f6814q);
                } else if (index == mbe.MockView_mock_showLabel) {
                    this.f6810e = typedArrayObtainStyledAttributes.getBoolean(index, this.f6810e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f6811f == null) {
            try {
                this.f6811f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f6806a.setColor(this.f6813h);
        this.f6806a.setAntiAlias(true);
        this.f6807b.setColor(this.f6814q);
        this.f6807b.setAntiAlias(true);
        this.f6808c.setColor(this.f6815s);
        this.f6816x = Math.round(this.f6816x * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f6809d) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f6806a);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f6806a);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f6806a);
            canvas.drawLine(f, 0.0f, f, f2, this.f6806a);
            canvas.drawLine(f, f2, 0.0f, f2, this.f6806a);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f6806a);
        }
        String str = this.f6811f;
        if (str == null || !this.f6810e) {
            return;
        }
        this.f6807b.getTextBounds(str, 0, str.length(), this.f6812g);
        float fWidth = (width - this.f6812g.width()) / 2.0f;
        float fHeight = ((height - this.f6812g.height()) / 2.0f) + this.f6812g.height();
        this.f6812g.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f6812g;
        int i = rect.left;
        int i2 = this.f6816x;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(this.f6812g, this.f6808c);
        canvas.drawText(this.f6811f, fWidth, fHeight, this.f6807b);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6806a = new Paint();
        this.f6807b = new Paint();
        this.f6808c = new Paint();
        this.f6809d = true;
        this.f6810e = true;
        this.f6811f = null;
        this.f6812g = new Rect();
        this.f6813h = Color.argb(Constants.MAX_HOST_LENGTH, 0, 0, 0);
        this.f6814q = Color.argb(Constants.MAX_HOST_LENGTH, 200, 200, 200);
        this.f6815s = Color.argb(Constants.MAX_HOST_LENGTH, 50, 50, 50);
        this.f6816x = 4;
        m5573a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6806a = new Paint();
        this.f6807b = new Paint();
        this.f6808c = new Paint();
        this.f6809d = true;
        this.f6810e = true;
        this.f6811f = null;
        this.f6812g = new Rect();
        this.f6813h = Color.argb(Constants.MAX_HOST_LENGTH, 0, 0, 0);
        this.f6814q = Color.argb(Constants.MAX_HOST_LENGTH, 200, 200, 200);
        this.f6815s = Color.argb(Constants.MAX_HOST_LENGTH, 50, 50, 50);
        this.f6816x = 4;
        m5573a(context, attributeSet);
    }
}
