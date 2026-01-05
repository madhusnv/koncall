package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class pk0 {

    /* renamed from: l */
    public static final RectF f40179l = new RectF();

    /* renamed from: m */
    public static ConcurrentHashMap f40180m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f40181a = 0;

    /* renamed from: b */
    public boolean f40182b = false;

    /* renamed from: c */
    public float f40183c = -1.0f;

    /* renamed from: d */
    public float f40184d = -1.0f;

    /* renamed from: e */
    public float f40185e = -1.0f;

    /* renamed from: f */
    public int[] f40186f = new int[0];

    /* renamed from: g */
    public boolean f40187g = false;

    /* renamed from: h */
    public TextPaint f40188h;

    /* renamed from: i */
    public final TextView f40189i;

    /* renamed from: j */
    public final Context f40190j;

    /* renamed from: k */
    public final C16129d f40191k;

    /* renamed from: o.pk0$a */
    public static final class C16126a {
        /* renamed from: a */
        public static StaticLayout m43795a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C16129d c16129d) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                c16129d.mo43796a(builderObtain, textView);
            } catch (ClassCastException unused) {
            }
            return builderObtain.build();
        }
    }

    /* renamed from: o.pk0$b */
    public static class C16127b extends C16129d {
        @Override // p001o.pk0.C16129d
        /* renamed from: a */
        public void mo43796a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) pk0.m43770m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: o.pk0$c */
    public static class C16128c extends C16127b {
        @Override // p001o.pk0.C16127b, p001o.pk0.C16129d
        /* renamed from: a */
        public void mo43796a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // p001o.pk0.C16129d
        /* renamed from: b */
        public boolean mo43797b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: o.pk0$d */
    public static class C16129d {
        /* renamed from: a */
        public abstract void mo43796a(StaticLayout.Builder builder, TextView textView);

        /* renamed from: b */
        public boolean mo43797b(TextView textView) {
            return ((Boolean) pk0.m43770m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public pk0(TextView textView) {
        this.f40189i = textView;
        this.f40190j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f40191k = new C16128c();
        } else {
            this.f40191k = new C16127b();
        }
    }

    /* renamed from: k */
    public static Method m43769k(String str) throws SecurityException {
        try {
            Method declaredMethod = (Method) f40180m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f40180m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            return null;
        }
    }

    /* renamed from: m */
    public static Object m43770m(Object obj, String str, Object obj2) {
        try {
            return m43769k(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            return obj2;
        }
    }

    /* renamed from: a */
    public void m43771a() {
        if (m43782n()) {
            if (this.f40182b) {
                if (this.f40189i.getMeasuredHeight() <= 0 || this.f40189i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f40191k.mo43797b(this.f40189i) ? 1048576 : (this.f40189i.getMeasuredWidth() - this.f40189i.getTotalPaddingLeft()) - this.f40189i.getTotalPaddingRight();
                int height = (this.f40189i.getHeight() - this.f40189i.getCompoundPaddingBottom()) - this.f40189i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f40179l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM43775e = m43775e(rectF);
                    if (fM43775e != this.f40189i.getTextSize()) {
                        m43788t(0, fM43775e);
                    }
                }
            }
            this.f40182b = true;
        }
    }

    /* renamed from: b */
    public final int[] m43772b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final void m43773c() {
        this.f40181a = 0;
        this.f40184d = -1.0f;
        this.f40185e = -1.0f;
        this.f40183c = -1.0f;
        this.f40186f = new int[0];
        this.f40182b = false;
    }

    /* renamed from: d */
    public StaticLayout m43774d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return C16126a.m43795a(charSequence, alignment, i, i2, this.f40189i, this.f40188h, this.f40191k);
    }

    /* renamed from: e */
    public final int m43775e(RectF rectF) {
        int length = this.f40186f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (m43792x(this.f40186f[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.f40186f[i3];
    }

    /* renamed from: f */
    public int m43776f() {
        return Math.round(this.f40185e);
    }

    /* renamed from: g */
    public int m43777g() {
        return Math.round(this.f40184d);
    }

    /* renamed from: h */
    public int m43778h() {
        return Math.round(this.f40183c);
    }

    /* renamed from: i */
    public int[] m43779i() {
        return this.f40186f;
    }

    /* renamed from: j */
    public int m43780j() {
        return this.f40181a;
    }

    /* renamed from: l */
    public void m43781l(int i) {
        TextPaint textPaint = this.f40188h;
        if (textPaint == null) {
            this.f40188h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f40188h.set(this.f40189i.getPaint());
        this.f40188h.setTextSize(i);
    }

    /* renamed from: n */
    public boolean m43782n() {
        return m43793y() && this.f40181a != 0;
    }

    /* renamed from: o */
    public void m43783o(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f40190j.obtainStyledAttributes(attributeSet, bbe.AppCompatTextView, i, 0);
        TextView textView = this.f40189i;
        wvi.k0(textView, textView.getContext(), bbe.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTextView_autoSizeTextType)) {
            this.f40181a = typedArrayObtainStyledAttributes.getInt(bbe.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(bbe.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(bbe.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(bbe.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(bbe.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m43790v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m43793y()) {
            this.f40181a = 0;
            return;
        }
        if (this.f40181a == 1) {
            if (!this.f40187g) {
                DisplayMetrics displayMetrics = this.f40190j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m43794z(dimension2, dimension3, dimension);
            }
            m43789u();
        }
    }

    /* renamed from: p */
    public void m43784p(int i, int i2, int i3, int i4) {
        if (m43793y()) {
            DisplayMetrics displayMetrics = this.f40190j.getResources().getDisplayMetrics();
            m43794z(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m43789u()) {
                m43771a();
            }
        }
    }

    /* renamed from: q */
    public void m43785q(int[] iArr, int i) {
        if (m43793y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f40190j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f40186f = m43772b(iArrCopyOf);
                if (!m43791w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f40187g = false;
            }
            if (m43789u()) {
                m43771a();
            }
        }
    }

    /* renamed from: r */
    public void m43786r(int i) {
        if (m43793y()) {
            if (i == 0) {
                m43773c();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.f40190j.getResources().getDisplayMetrics();
            m43794z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m43789u()) {
                m43771a();
            }
        }
    }

    /* renamed from: s */
    public final void m43787s(float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f != this.f40189i.getPaint().getTextSize()) {
            this.f40189i.getPaint().setTextSize(f);
            boolean zIsInLayout = this.f40189i.isInLayout();
            if (this.f40189i.getLayout() != null) {
                this.f40182b = false;
                try {
                    Method methodM43769k = m43769k("nullLayouts");
                    if (methodM43769k != null) {
                        methodM43769k.invoke(this.f40189i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    this.f40189i.forceLayout();
                } else {
                    this.f40189i.requestLayout();
                }
                this.f40189i.invalidate();
            }
        }
    }

    /* renamed from: t */
    public void m43788t(int i, float f) {
        Context context = this.f40190j;
        m43787s(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* renamed from: u */
    public final boolean m43789u() {
        if (m43793y() && this.f40181a == 1) {
            if (!this.f40187g || this.f40186f.length == 0) {
                int iFloor = ((int) Math.floor((this.f40185e - this.f40184d) / this.f40183c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.f40184d + (i * this.f40183c));
                }
                this.f40186f = m43772b(iArr);
            }
            this.f40182b = true;
        } else {
            this.f40182b = false;
        }
        return this.f40182b;
    }

    /* renamed from: v */
    public final void m43790v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f40186f = m43772b(iArr);
            m43791w();
        }
    }

    /* renamed from: w */
    public final boolean m43791w() {
        boolean z = this.f40186f.length > 0;
        this.f40187g = z;
        if (z) {
            this.f40181a = 1;
            this.f40184d = r0[0];
            this.f40185e = r0[r1 - 1];
            this.f40183c = -1.0f;
        }
        return z;
    }

    /* renamed from: x */
    public final boolean m43792x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f40189i.getText();
        TransformationMethod transformationMethod = this.f40189i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f40189i)) != null) {
            text = transformation;
        }
        int maxLines = this.f40189i.getMaxLines();
        m43781l(i);
        StaticLayout staticLayoutM43774d = m43774d(text, (Layout.Alignment) m43770m(this.f40189i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutM43774d.getLineCount() <= maxLines && staticLayoutM43774d.getLineEnd(staticLayoutM43774d.getLineCount() - 1) == text.length())) && ((float) staticLayoutM43774d.getHeight()) <= rectF.bottom;
    }

    /* renamed from: y */
    public final boolean m43793y() {
        return !(this.f40189i instanceof AppCompatEditText);
    }

    /* renamed from: z */
    public final void m43794z(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f40181a = 1;
        this.f40184d = f;
        this.f40185e = f2;
        this.f40183c = f3;
        this.f40187g = false;
    }
}
