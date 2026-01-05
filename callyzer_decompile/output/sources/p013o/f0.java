package p013o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.skydoves.balloon.internals.DefinitionKt;
import iz.C3378k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l4.C4367l;
import mm.AbstractC4801l;
import p009j.AbstractC3500a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public final TextView f25480a;

    /* renamed from: b */
    public C3378k f25481b;

    /* renamed from: c */
    public C3378k f25482c;

    /* renamed from: d */
    public C3378k f25483d;

    /* renamed from: e */
    public C3378k f25484e;

    /* renamed from: f */
    public C3378k f25485f;

    /* renamed from: g */
    public C3378k f25486g;

    /* renamed from: h */
    public C3378k f25487h;

    /* renamed from: i */
    public final o0 f25488i;

    /* renamed from: j */
    public int f25489j = 0;

    /* renamed from: k */
    public int f25490k = -1;

    /* renamed from: l */
    public Typeface f25491l;

    /* renamed from: m */
    public boolean f25492m;

    public f0(TextView textView) {
        this.f25480a = textView;
        this.f25488i = new o0(textView);
    }

    /* renamed from: c */
    public static C3378k m10226c(Context context, C5232r c5232r, int i10) {
        ColorStateList colorStateListM10280f;
        synchronized (c5232r) {
            colorStateListM10280f = c5232r.f25629a.m10280f(context, i10);
        }
        if (colorStateListM10280f == null) {
            return null;
        }
        C3378k c3378k = new C3378k();
        c3378k.f17914b = true;
        c3378k.f17915c = colorStateListM10280f;
        return c3378k;
    }

    /* renamed from: a */
    public final void m10227a(Drawable drawable, C3378k c3378k) {
        if (drawable == null || c3378k == null) {
            return;
        }
        C5232r.m10284d(drawable, c3378k, this.f25480a.getDrawableState());
    }

    /* renamed from: b */
    public final void m10228b() {
        C3378k c3378k = this.f25481b;
        TextView textView = this.f25480a;
        if (c3378k != null || this.f25482c != null || this.f25483d != null || this.f25484e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m10227a(compoundDrawables[0], this.f25481b);
            m10227a(compoundDrawables[1], this.f25482c);
            m10227a(compoundDrawables[2], this.f25483d);
            m10227a(compoundDrawables[3], this.f25484e);
        }
        if (this.f25485f == null && this.f25486g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m10227a(compoundDrawablesRelative[0], this.f25485f);
        m10227a(compoundDrawablesRelative[2], this.f25486g);
    }

    /* JADX WARN: Removed duplicated region for block: B:240:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10229d(android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013o.f0.m10229d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public final void m10230e(Context context, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, AbstractC3500a.f18362s);
        C4367l c4367l = new C4367l(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f25480a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, DefinitionKt.NO_Float_VALUE);
        }
        m10236k(context, c4367l);
        if (i11 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            d0.m10218d(textView, string);
        }
        c4367l.m9124I();
        Typeface typeface = this.f25491l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f25489j);
        }
    }

    /* renamed from: f */
    public final void m10231f(int i10, int i11, int i12, int i13) {
        o0 o0Var = this.f25488i;
        if (o0Var.m10272i()) {
            DisplayMetrics displayMetrics = o0Var.f25605j.getResources().getDisplayMetrics();
            o0Var.m10273j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (o0Var.m10270g()) {
                o0Var.m10266a();
            }
        }
    }

    /* renamed from: g */
    public final void m10232g(int[] iArr, int i10) {
        o0 o0Var = this.f25488i;
        if (o0Var.m10272i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = o0Var.f25605j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                o0Var.f25601f = o0.m10264b(iArrCopyOf);
                if (!o0Var.m10271h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                o0Var.f25602g = false;
            }
            if (o0Var.m10270g()) {
                o0Var.m10266a();
            }
        }
    }

    /* renamed from: h */
    public final void m10233h(int i10) {
        o0 o0Var = this.f25488i;
        if (o0Var.m10272i()) {
            if (i10 == 0) {
                o0Var.f25596a = 0;
                o0Var.f25599d = -1.0f;
                o0Var.f25600e = -1.0f;
                o0Var.f25598c = -1.0f;
                o0Var.f25601f = new int[0];
                o0Var.f25597b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = o0Var.f25605j.getResources().getDisplayMetrics();
            o0Var.m10273j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (o0Var.m10270g()) {
                o0Var.m10266a();
            }
        }
    }

    /* renamed from: i */
    public final void m10234i(ColorStateList colorStateList) {
        if (this.f25487h == null) {
            this.f25487h = new C3378k();
        }
        C3378k c3378k = this.f25487h;
        c3378k.f17915c = colorStateList;
        c3378k.f17914b = colorStateList != null;
        this.f25481b = c3378k;
        this.f25482c = c3378k;
        this.f25483d = c3378k;
        this.f25484e = c3378k;
        this.f25485f = c3378k;
        this.f25486g = c3378k;
    }

    /* renamed from: j */
    public final void m10235j(PorterDuff.Mode mode) {
        if (this.f25487h == null) {
            this.f25487h = new C3378k();
        }
        C3378k c3378k = this.f25487h;
        c3378k.f17916d = mode;
        c3378k.f17913a = mode != null;
        this.f25481b = c3378k;
        this.f25482c = c3378k;
        this.f25483d = c3378k;
        this.f25484e = c3378k;
        this.f25485f = c3378k;
        this.f25486g = c3378k;
    }

    /* renamed from: k */
    public final void m10236k(Context context, C4367l c4367l) {
        String string;
        int i10 = this.f25489j;
        TypedArray typedArray = (TypedArray) c4367l.f21922c;
        this.f25489j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f25490k = i12;
            if (i12 != -1) {
                this.f25489j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f25492m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.f25491l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f25491l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f25491l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f25491l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.f25490k;
        int i16 = this.f25489j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM9146z = c4367l.m9146z(i14, this.f25489j, new b0(this, i15, i16, new WeakReference(this.f25480a)));
                if (typefaceM9146z != null) {
                    if (i11 < 28 || this.f25490k == -1) {
                        this.f25491l = typefaceM9146z;
                    } else {
                        this.f25491l = e0.m10220a(Typeface.create(typefaceM9146z, 0), this.f25490k, (this.f25489j & 2) != 0);
                    }
                }
                this.f25492m = this.f25491l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f25491l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f25490k == -1) {
            this.f25491l = Typeface.create(string, this.f25489j);
        } else {
            this.f25491l = e0.m10220a(Typeface.create(string, 0), this.f25490k, (this.f25489j & 2) != 0);
        }
    }
}
