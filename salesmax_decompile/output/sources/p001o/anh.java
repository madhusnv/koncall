package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p001o.ppe;

/* loaded from: classes2.dex */
public class anh {

    /* renamed from: a */
    public final Context f15053a;

    /* renamed from: b */
    public final TypedArray f15054b;

    /* renamed from: c */
    public TypedValue f15055c;

    public anh(Context context, TypedArray typedArray) {
        this.f15053a = context;
        this.f15054b = typedArray;
    }

    /* renamed from: t */
    public static anh m17523t(Context context, int i, int[] iArr) {
        return new anh(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static anh m17524u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new anh(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static anh m17525v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new anh(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m17526a(int i, boolean z) {
        return this.f15054b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m17527b(int i, int i2) {
        return this.f15054b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m17528c(int i) {
        int resourceId;
        ColorStateList colorStateListM37352a;
        return (!this.f15054b.hasValue(i) || (resourceId = this.f15054b.getResourceId(i, 0)) == 0 || (colorStateListM37352a = lk0.m37352a(this.f15053a, resourceId)) == null) ? this.f15054b.getColorStateList(i) : colorStateListM37352a;
    }

    /* renamed from: d */
    public float m17529d(int i, float f) {
        return this.f15054b.getDimension(i, f);
    }

    /* renamed from: e */
    public int m17530e(int i, int i2) {
        return this.f15054b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m17531f(int i, int i2) {
        return this.f15054b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m17532g(int i) {
        int resourceId;
        return (!this.f15054b.hasValue(i) || (resourceId = this.f15054b.getResourceId(i, 0)) == 0) ? this.f15054b.getDrawable(i) : lk0.m37353b(this.f15053a, resourceId);
    }

    /* renamed from: h */
    public Drawable m17533h(int i) {
        int resourceId;
        if (!this.f15054b.hasValue(i) || (resourceId = this.f15054b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return ek0.m25163b().m25168d(this.f15053a, resourceId, true);
    }

    /* renamed from: i */
    public float m17534i(int i, float f) {
        return this.f15054b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface m17535j(int i, int i2, ppe.AbstractC16161e abstractC16161e) {
        int resourceId = this.f15054b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f15055c == null) {
            this.f15055c = new TypedValue();
        }
        return ppe.m44037h(this.f15053a, resourceId, this.f15055c, i2, abstractC16161e);
    }

    /* renamed from: k */
    public int m17536k(int i, int i2) {
        return this.f15054b.getInt(i, i2);
    }

    /* renamed from: l */
    public int m17537l(int i, int i2) {
        return this.f15054b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int m17538m(int i, int i2) {
        return this.f15054b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int m17539n(int i, int i2) {
        return this.f15054b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String m17540o(int i) {
        return this.f15054b.getString(i);
    }

    /* renamed from: p */
    public CharSequence m17541p(int i) {
        return this.f15054b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] m17542q(int i) {
        return this.f15054b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray m17543r() {
        return this.f15054b;
    }

    /* renamed from: s */
    public boolean m17544s(int i) {
        return this.f15054b.hasValue(i);
    }

    /* renamed from: w */
    public TypedValue m17545w(int i) {
        return this.f15054b.peekValue(i);
    }

    /* renamed from: x */
    public void m17546x() {
        this.f15054b.recycle();
    }
}
