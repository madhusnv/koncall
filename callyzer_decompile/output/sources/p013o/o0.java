package p013o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: l */
    public static final RectF f25594l = new RectF();

    /* renamed from: m */
    public static final ConcurrentHashMap f25595m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f25596a = 0;

    /* renamed from: b */
    public boolean f25597b = false;

    /* renamed from: c */
    public float f25598c = -1.0f;

    /* renamed from: d */
    public float f25599d = -1.0f;

    /* renamed from: e */
    public float f25600e = -1.0f;

    /* renamed from: f */
    public int[] f25601f = new int[0];

    /* renamed from: g */
    public boolean f25602g = false;

    /* renamed from: h */
    public TextPaint f25603h;

    /* renamed from: i */
    public final TextView f25604i;

    /* renamed from: j */
    public final Context f25605j;

    /* renamed from: k */
    public final l0 f25606k;

    public o0(TextView textView) {
        this.f25604i = textView;
        this.f25605j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f25606k = new m0();
        } else {
            this.f25606k = new l0();
        }
    }

    /* renamed from: b */
    public static int[] m10264b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public static Method m10265d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f25595m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void m10266a() {
        if (m10268e()) {
            if (this.f25597b) {
                if (this.f25604i.getMeasuredHeight() <= 0 || this.f25604i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f25606k.mo10253b(this.f25604i) ? 1048576 : (this.f25604i.getMeasuredWidth() - this.f25604i.getTotalPaddingLeft()) - this.f25604i.getTotalPaddingRight();
                int height = (this.f25604i.getHeight() - this.f25604i.getCompoundPaddingBottom()) - this.f25604i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f25594l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM10267c = m10267c(rectF);
                        if (fM10267c != this.f25604i.getTextSize()) {
                            m10269f(fM10267c, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f25597b = true;
        }
    }

    /* renamed from: c */
    public final int m10267c(RectF rectF) {
        CharSequence transformation;
        int length = this.f25601f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f25601f[i13];
            TextView textView = this.f25604i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f25603h;
            if (textPaint == null) {
                this.f25603h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f25603h.set(textView.getPaint());
            this.f25603h.setTextSize(i14);
            Object objInvoke = Layout.Alignment.ALIGN_NORMAL;
            try {
                objInvoke = m10265d("getLayoutAlignment").invoke(textView, null);
            } catch (Exception unused) {
            }
            StaticLayout staticLayoutM10249a = k0.m10249a(text, (Layout.Alignment) objInvoke, Math.round(rectF.right), maxLines, textView, this.f25603h, this.f25606k);
            if ((maxLines == -1 || (staticLayoutM10249a.getLineCount() <= maxLines && staticLayoutM10249a.getLineEnd(staticLayoutM10249a.getLineCount() - 1) == text.length())) && staticLayoutM10249a.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f25601f[i11];
    }

    /* renamed from: e */
    public final boolean m10268e() {
        return m10272i() && this.f25596a != 0;
    }

    /* renamed from: f */
    public final void m10269f(float f6, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f25605j;
        float fApplyDimension = TypedValue.applyDimension(i10, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f25604i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f25597b = false;
                try {
                    Method methodM10265d = m10265d("nullLayouts");
                    if (methodM10265d != null) {
                        methodM10265d.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: g */
    public final boolean m10270g() {
        if (m10272i() && this.f25596a == 1) {
            if (!this.f25602g || this.f25601f.length == 0) {
                int iFloor = ((int) Math.floor((this.f25600e - this.f25599d) / this.f25598c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f25598c) + this.f25599d);
                }
                this.f25601f = m10264b(iArr);
            }
            this.f25597b = true;
        } else {
            this.f25597b = false;
        }
        return this.f25597b;
    }

    /* renamed from: h */
    public final boolean m10271h() {
        boolean z6 = this.f25601f.length > 0;
        this.f25602g = z6;
        if (z6) {
            this.f25596a = 1;
            this.f25599d = r0[0];
            this.f25600e = r0[r1 - 1];
            this.f25598c = -1.0f;
        }
        return z6;
    }

    /* renamed from: i */
    public final boolean m10272i() {
        return !(this.f25604i instanceof AbstractC5234t);
    }

    /* renamed from: j */
    public final void m10273j(float f6, float f10, float f11) {
        if (f6 <= DefinitionKt.NO_Float_VALUE) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f10 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f11 <= DefinitionKt.NO_Float_VALUE) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f25596a = 1;
        this.f25599d = f6;
        this.f25600e = f10;
        this.f25598c = f11;
        this.f25602g = false;
    }
}
