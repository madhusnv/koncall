package p001o;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes3.dex */
public abstract class je1 {

    /* renamed from: a */
    public int f30233a;

    /* renamed from: b */
    public int f30234b;

    /* renamed from: c */
    public float f30235c;

    /* renamed from: d */
    public boolean f30236d;

    /* renamed from: e */
    public int[] f30237e = new int[0];

    /* renamed from: f */
    public int f30238f;

    /* renamed from: g */
    public int f30239g;

    /* renamed from: h */
    public int f30240h;

    /* renamed from: i */
    public int f30241i;

    /* renamed from: j */
    public int f30242j;

    /* renamed from: k */
    public int f30243k;

    /* renamed from: l */
    public int f30244l;

    /* renamed from: m */
    public int f30245m;

    /* renamed from: n */
    public float f30246n;

    public je1(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(x6e.mtrl_progress_track_thickness);
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.BaseProgressIndicator, i, i2, new int[0]);
        this.f30233a = yya.m58497d(context, typedArrayM19305i, ebe.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayM19305i.peekValue(ebe.BaseProgressIndicator_trackCornerRadius);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                this.f30234b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayM19305i.getResources().getDisplayMetrics()), this.f30233a / 2);
                this.f30236d = false;
            } else if (i3 == 6) {
                this.f30235c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f30236d = true;
            }
        }
        this.f30239g = typedArrayM19305i.getInt(ebe.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f30240h = typedArrayM19305i.getInt(ebe.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.f30241i = typedArrayM19305i.getDimensionPixelSize(ebe.BaseProgressIndicator_indicatorTrackGapSize, 0);
        int iAbs = Math.abs(typedArrayM19305i.getDimensionPixelSize(ebe.BaseProgressIndicator_wavelength, 0));
        this.f30242j = Math.abs(typedArrayM19305i.getDimensionPixelSize(ebe.BaseProgressIndicator_wavelengthDeterminate, iAbs));
        this.f30243k = Math.abs(typedArrayM19305i.getDimensionPixelSize(ebe.BaseProgressIndicator_wavelengthIndeterminate, iAbs));
        this.f30244l = Math.abs(typedArrayM19305i.getDimensionPixelSize(ebe.BaseProgressIndicator_waveAmplitude, 0));
        this.f30245m = typedArrayM19305i.getDimensionPixelSize(ebe.BaseProgressIndicator_waveSpeed, 0);
        this.f30246n = typedArrayM19305i.getFloat(ebe.BaseProgressIndicator_indeterminateAnimatorDurationScale, 1.0f);
        m33611e(context, typedArrayM19305i);
        m33612f(context, typedArrayM19305i);
        typedArrayM19305i.recycle();
    }

    /* renamed from: a */
    public int m33607a() {
        return this.f30236d ? (int) (this.f30233a * this.f30235c) : this.f30234b;
    }

    /* renamed from: b */
    public boolean m33608b(boolean z) {
        return this.f30244l > 0 && ((!z && this.f30243k > 0) || (z && this.f30242j > 0));
    }

    /* renamed from: c */
    public boolean m33609c() {
        return this.f30240h != 0;
    }

    /* renamed from: d */
    public boolean m33610d() {
        return this.f30239g != 0;
    }

    /* renamed from: e */
    public final void m33611e(Context context, TypedArray typedArray) throws Resources.NotFoundException {
        if (!typedArray.hasValue(ebe.BaseProgressIndicator_indicatorColor)) {
            this.f30237e = new int[]{gua.m29503b(context, z5e.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(ebe.BaseProgressIndicator_indicatorColor).type != 1) {
            this.f30237e = new int[]{typedArray.getColor(ebe.BaseProgressIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(ebe.BaseProgressIndicator_indicatorColor, -1));
        this.f30237e = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    /* renamed from: f */
    public final void m33612f(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(ebe.BaseProgressIndicator_trackColor)) {
            this.f30238f = typedArray.getColor(ebe.BaseProgressIndicator_trackColor, -1);
            return;
        }
        this.f30238f = this.f30237e[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f30238f = gua.m29502a(this.f30238f, (int) (f * 255.0f));
    }

    /* renamed from: g */
    public boolean mo14911g() {
        return this.f30236d && this.f30235c == 0.5f;
    }

    /* renamed from: h */
    public void mo14912h() {
        if (this.f30241i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
