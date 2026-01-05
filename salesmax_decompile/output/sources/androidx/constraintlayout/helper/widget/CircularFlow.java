package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import p001o.mbe;

/* loaded from: classes2.dex */
public class CircularFlow extends VirtualLayout {
    public static int m0;
    public static float n0;

    /* renamed from: H */
    public int f6568H;

    /* renamed from: L */
    public float[] f6569L;

    /* renamed from: M */
    public int[] f6570M;

    /* renamed from: Q */
    public int f6571Q;
    public int h0;
    public String i0;
    public String j0;
    public Float k0;
    public Integer l0;

    /* renamed from: y */
    public ConstraintLayout f6572y;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.h0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m5307y(str.substring(i).trim());
                return;
            } else {
                m5307y(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f6571Q = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m5308z(str.substring(i).trim());
                return;
            } else {
                m5308z(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    /* renamed from: A */
    public final void m5305A() {
        this.f6572y = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f6851b; i++) {
            View viewM5613q = this.f6572y.m5613q(this.f6850a[i]);
            if (viewM5613q != null) {
                int i2 = m0;
                float f = n0;
                int[] iArr = this.f6570M;
                if (iArr == null || i >= iArr.length) {
                    Integer num = this.l0;
                    if (num == null || num.intValue() == -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Added radius to view with id: ");
                        sb.append((String) this.f6858q.get(Integer.valueOf(viewM5613q.getId())));
                    } else {
                        this.f6571Q++;
                        if (this.f6570M == null) {
                            this.f6570M = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f6570M = radius;
                        radius[this.f6571Q - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.f6569L;
                if (fArr == null || i >= fArr.length) {
                    Float f2 = this.k0;
                    if (f2 == null || f2.floatValue() == -1.0f) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Added angle to view with id: ");
                        sb2.append((String) this.f6858q.get(Integer.valueOf(viewM5613q.getId())));
                    } else {
                        this.h0++;
                        if (this.f6569L == null) {
                            this.f6569L = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f6569L = angles;
                        angles[this.h0 - 1] = f;
                    }
                } else {
                    f = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewM5613q.getLayoutParams();
                layoutParams.f6918r = f;
                layoutParams.f6916p = this.f6568H;
                layoutParams.f6917q = i2;
                viewM5613q.setLayoutParams(layoutParams);
            }
        }
        m5593h();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f6569L, this.h0);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f6570M, this.f6571Q);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo5306o(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo5306o(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f6568H = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == mbe.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.i0 = string;
                    setAngles(string);
                } else if (index == mbe.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.j0 = string2;
                    setRadius(string2);
                } else if (index == mbe.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, n0));
                    this.k0 = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == mbe.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, m0));
                    this.l0 = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.i0;
        if (str != null) {
            this.f6569L = new float[1];
            setAngles(str);
        }
        String str2 = this.j0;
        if (str2 != null) {
            this.f6570M = new int[1];
            setRadius(str2);
        }
        Float f = this.k0;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.l0;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        m5305A();
    }

    public void setDefaultAngle(float f) {
        n0 = f;
    }

    public void setDefaultRadius(int i) {
        m0 = i;
    }

    /* renamed from: y */
    public final void m5307y(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f6852c == null || (fArr = this.f6569L) == null) {
            return;
        }
        if (this.h0 + 1 > fArr.length) {
            this.f6569L = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f6569L[this.h0] = Integer.parseInt(str);
        this.h0++;
    }

    /* renamed from: z */
    public final void m5308z(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f6852c == null || (iArr = this.f6570M) == null) {
            return;
        }
        if (this.f6571Q + 1 > iArr.length) {
            this.f6570M = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f6570M[this.f6571Q] = (int) (Integer.parseInt(str) * this.f6852c.getResources().getDisplayMetrics().density);
        this.f6571Q++;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
