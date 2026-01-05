package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p001o.ppe;

/* loaded from: classes2.dex */
public class ok0 {

    /* renamed from: a */
    public final TextView f38470a;

    /* renamed from: b */
    public ymh f38471b;

    /* renamed from: c */
    public ymh f38472c;

    /* renamed from: d */
    public ymh f38473d;

    /* renamed from: e */
    public ymh f38474e;

    /* renamed from: f */
    public ymh f38475f;

    /* renamed from: g */
    public ymh f38476g;

    /* renamed from: h */
    public ymh f38477h;

    /* renamed from: i */
    public final pk0 f38478i;

    /* renamed from: j */
    public int f38479j = 0;

    /* renamed from: k */
    public int f38480k = -1;

    /* renamed from: l */
    public Typeface f38481l;

    /* renamed from: m */
    public boolean f38482m;

    /* renamed from: o.ok0$a */
    public class C15824a extends ppe.AbstractC16161e {

        /* renamed from: a */
        public final /* synthetic */ int f38483a;

        /* renamed from: b */
        public final /* synthetic */ int f38484b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f38485c;

        public C15824a(int i, int i2, WeakReference weakReference) {
            this.f38483a = i;
            this.f38484b = i2;
            this.f38485c = weakReference;
        }

        @Override // p001o.ppe.AbstractC16161e
        /* renamed from: h */
        public void m44051f(int i) {
        }

        @Override // p001o.ppe.AbstractC16161e
        /* renamed from: i */
        public void m44052g(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f38483a) != -1) {
                typeface = C15828e.m42348a(typeface, i, (this.f38484b & 2) != 0);
            }
            ok0.this.m42329n(this.f38485c, typeface);
        }
    }

    /* renamed from: o.ok0$b */
    public class RunnableC15825b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ TextView f38487a;

        /* renamed from: b */
        public final /* synthetic */ Typeface f38488b;

        /* renamed from: c */
        public final /* synthetic */ int f38489c;

        public RunnableC15825b(TextView textView, Typeface typeface, int i) {
            this.f38487a = textView;
            this.f38488b = typeface;
            this.f38489c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38487a.setTypeface(this.f38488b, this.f38489c);
        }
    }

    /* renamed from: o.ok0$c */
    public static class C15826c {
        /* renamed from: a */
        public static LocaleList m42342a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        public static void m42343b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: o.ok0$d */
    public static class C15827d {
        /* renamed from: a */
        public static int m42344a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: b */
        public static void m42345b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        public static void m42346c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        public static boolean m42347d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: o.ok0$e */
    public static class C15828e {
        /* renamed from: a */
        public static Typeface m42348a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public ok0(TextView textView) {
        this.f38470a = textView;
        this.f38478i = new pk0(textView);
    }

    /* renamed from: d */
    public static ymh m42313d(Context context, ek0 ek0Var, int i) {
        ColorStateList colorStateListM25169f = ek0Var.m25169f(context, i);
        if (colorStateListM25169f == null) {
            return null;
        }
        ymh ymhVar = new ymh();
        ymhVar.f55711d = true;
        ymhVar.f55708a = colorStateListM25169f;
        return ymhVar;
    }

    /* renamed from: A */
    public void m42314A(int i, float f) {
        if (yzi.f56345c || m42327l()) {
            return;
        }
        m42315B(i, f);
    }

    /* renamed from: B */
    public final void m42315B(int i, float f) {
        this.f38478i.m43788t(i, f);
    }

    /* renamed from: C */
    public final void m42316C(Context context, anh anhVar) {
        String strM17540o;
        this.f38479j = anhVar.m17536k(bbe.TextAppearance_android_textStyle, this.f38479j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM17536k = anhVar.m17536k(bbe.TextAppearance_android_textFontWeight, -1);
            this.f38480k = iM17536k;
            if (iM17536k != -1) {
                this.f38479j = (this.f38479j & 2) | 0;
            }
        }
        if (!anhVar.m17544s(bbe.TextAppearance_android_fontFamily) && !anhVar.m17544s(bbe.TextAppearance_fontFamily)) {
            if (anhVar.m17544s(bbe.TextAppearance_android_typeface)) {
                this.f38482m = false;
                int iM17536k2 = anhVar.m17536k(bbe.TextAppearance_android_typeface, 1);
                if (iM17536k2 == 1) {
                    this.f38481l = Typeface.SANS_SERIF;
                    return;
                } else if (iM17536k2 == 2) {
                    this.f38481l = Typeface.SERIF;
                    return;
                } else {
                    if (iM17536k2 != 3) {
                        return;
                    }
                    this.f38481l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f38481l = null;
        int i2 = anhVar.m17544s(bbe.TextAppearance_fontFamily) ? bbe.TextAppearance_fontFamily : bbe.TextAppearance_android_fontFamily;
        int i3 = this.f38480k;
        int i4 = this.f38479j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM17535j = anhVar.m17535j(i2, this.f38479j, new C15824a(i3, i4, new WeakReference(this.f38470a)));
                if (typefaceM17535j != null) {
                    if (i < 28 || this.f38480k == -1) {
                        this.f38481l = typefaceM17535j;
                    } else {
                        this.f38481l = C15828e.m42348a(Typeface.create(typefaceM17535j, 0), this.f38480k, (this.f38479j & 2) != 0);
                    }
                }
                this.f38482m = this.f38481l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f38481l != null || (strM17540o = anhVar.m17540o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f38480k == -1) {
            this.f38481l = Typeface.create(strM17540o, this.f38479j);
        } else {
            this.f38481l = C15828e.m42348a(Typeface.create(strM17540o, 0), this.f38480k, (this.f38479j & 2) != 0);
        }
    }

    /* renamed from: a */
    public final void m42317a(Drawable drawable, ymh ymhVar) {
        if (drawable == null || ymhVar == null) {
            return;
        }
        ek0.m25166i(drawable, ymhVar, this.f38470a.getDrawableState());
    }

    /* renamed from: b */
    public void m42318b() {
        if (this.f38471b != null || this.f38472c != null || this.f38473d != null || this.f38474e != null) {
            Drawable[] compoundDrawables = this.f38470a.getCompoundDrawables();
            m42317a(compoundDrawables[0], this.f38471b);
            m42317a(compoundDrawables[1], this.f38472c);
            m42317a(compoundDrawables[2], this.f38473d);
            m42317a(compoundDrawables[3], this.f38474e);
        }
        if (this.f38475f == null && this.f38476g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f38470a.getCompoundDrawablesRelative();
        m42317a(compoundDrawablesRelative[0], this.f38475f);
        m42317a(compoundDrawablesRelative[2], this.f38476g);
    }

    /* renamed from: c */
    public void m42319c() {
        this.f38478i.m43771a();
    }

    /* renamed from: e */
    public int m42320e() {
        return this.f38478i.m43776f();
    }

    /* renamed from: f */
    public int m42321f() {
        return this.f38478i.m43777g();
    }

    /* renamed from: g */
    public int m42322g() {
        return this.f38478i.m43778h();
    }

    /* renamed from: h */
    public int[] m42323h() {
        return this.f38478i.m43779i();
    }

    /* renamed from: i */
    public int m42324i() {
        return this.f38478i.m43780j();
    }

    /* renamed from: j */
    public ColorStateList m42325j() {
        ymh ymhVar = this.f38477h;
        if (ymhVar != null) {
            return ymhVar.f55708a;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m42326k() {
        ymh ymhVar = this.f38477h;
        if (ymhVar != null) {
            return ymhVar.f55709b;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m42327l() {
        return this.f38478i.m43782n();
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m42328m(AttributeSet attributeSet, int i) {
        boolean zM17526a;
        boolean z;
        String strM17540o;
        String strM17540o2;
        boolean z2;
        float fM17531f;
        int iM25883a;
        Context context = this.f38470a.getContext();
        ek0 ek0VarM25163b = ek0.m25163b();
        anh anhVarM17525v = anh.m17525v(context, attributeSet, bbe.AppCompatTextHelper, i, 0);
        TextView textView = this.f38470a;
        wvi.k0(textView, textView.getContext(), bbe.AppCompatTextHelper, attributeSet, anhVarM17525v.m17543r(), i, 0);
        int iM17539n = anhVarM17525v.m17539n(bbe.AppCompatTextHelper_android_textAppearance, -1);
        if (anhVarM17525v.m17544s(bbe.AppCompatTextHelper_android_drawableLeft)) {
            this.f38471b = m42313d(context, ek0VarM25163b, anhVarM17525v.m17539n(bbe.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (anhVarM17525v.m17544s(bbe.AppCompatTextHelper_android_drawableTop)) {
            this.f38472c = m42313d(context, ek0VarM25163b, anhVarM17525v.m17539n(bbe.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (anhVarM17525v.m17544s(bbe.AppCompatTextHelper_android_drawableRight)) {
            this.f38473d = m42313d(context, ek0VarM25163b, anhVarM17525v.m17539n(bbe.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (anhVarM17525v.m17544s(bbe.AppCompatTextHelper_android_drawableBottom)) {
            this.f38474e = m42313d(context, ek0VarM25163b, anhVarM17525v.m17539n(bbe.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (anhVarM17525v.m17544s(bbe.AppCompatTextHelper_android_drawableStart)) {
            this.f38475f = m42313d(context, ek0VarM25163b, anhVarM17525v.m17539n(bbe.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (anhVarM17525v.m17544s(bbe.AppCompatTextHelper_android_drawableEnd)) {
            this.f38476g = m42313d(context, ek0VarM25163b, anhVarM17525v.m17539n(bbe.AppCompatTextHelper_android_drawableEnd, 0));
        }
        anhVarM17525v.m17546x();
        boolean z3 = this.f38470a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM17539n != -1) {
            anh anhVarM17523t = anh.m17523t(context, iM17539n, bbe.TextAppearance);
            if (z3 || !anhVarM17523t.m17544s(bbe.TextAppearance_textAllCaps)) {
                zM17526a = false;
                z = false;
            } else {
                zM17526a = anhVarM17523t.m17526a(bbe.TextAppearance_textAllCaps, false);
                z = true;
            }
            m42316C(context, anhVarM17523t);
            int i2 = Build.VERSION.SDK_INT;
            strM17540o2 = anhVarM17523t.m17544s(bbe.TextAppearance_textLocale) ? anhVarM17523t.m17540o(bbe.TextAppearance_textLocale) : null;
            strM17540o = (i2 < 26 || !anhVarM17523t.m17544s(bbe.TextAppearance_fontVariationSettings)) ? null : anhVarM17523t.m17540o(bbe.TextAppearance_fontVariationSettings);
            anhVarM17523t.m17546x();
        } else {
            zM17526a = false;
            z = false;
            strM17540o = null;
            strM17540o2 = null;
        }
        anh anhVarM17525v2 = anh.m17525v(context, attributeSet, bbe.TextAppearance, i, 0);
        if (z3 || !anhVarM17525v2.m17544s(bbe.TextAppearance_textAllCaps)) {
            z2 = z;
        } else {
            zM17526a = anhVarM17525v2.m17526a(bbe.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (anhVarM17525v2.m17544s(bbe.TextAppearance_textLocale)) {
            strM17540o2 = anhVarM17525v2.m17540o(bbe.TextAppearance_textLocale);
        }
        if (i3 >= 26 && anhVarM17525v2.m17544s(bbe.TextAppearance_fontVariationSettings)) {
            strM17540o = anhVarM17525v2.m17540o(bbe.TextAppearance_fontVariationSettings);
        }
        if (i3 >= 28 && anhVarM17525v2.m17544s(bbe.TextAppearance_android_textSize) && anhVarM17525v2.m17531f(bbe.TextAppearance_android_textSize, -1) == 0) {
            this.f38470a.setTextSize(0, 0.0f);
        }
        m42316C(context, anhVarM17525v2);
        anhVarM17525v2.m17546x();
        if (!z3 && z2) {
            m42334s(zM17526a);
        }
        Typeface typeface = this.f38481l;
        if (typeface != null) {
            if (this.f38480k == -1) {
                this.f38470a.setTypeface(typeface, this.f38479j);
            } else {
                this.f38470a.setTypeface(typeface);
            }
        }
        if (strM17540o != null) {
            C15827d.m42347d(this.f38470a, strM17540o);
        }
        if (strM17540o2 != null) {
            C15826c.m42343b(this.f38470a, C15826c.m42342a(strM17540o2));
        }
        this.f38478i.m43783o(attributeSet, i);
        if (yzi.f56345c && this.f38478i.m43780j() != 0) {
            int[] iArrM43779i = this.f38478i.m43779i();
            if (iArrM43779i.length > 0) {
                if (C15827d.m42344a(this.f38470a) != -1.0f) {
                    C15827d.m42345b(this.f38470a, this.f38478i.m43777g(), this.f38478i.m43776f(), this.f38478i.m43778h(), 0);
                } else {
                    C15827d.m42346c(this.f38470a, iArrM43779i, 0);
                }
            }
        }
        anh anhVarM17524u = anh.m17524u(context, attributeSet, bbe.AppCompatTextView);
        int iM17539n2 = anhVarM17524u.m17539n(bbe.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableM25167c = iM17539n2 != -1 ? ek0VarM25163b.m25167c(context, iM17539n2) : null;
        int iM17539n3 = anhVarM17524u.m17539n(bbe.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableM25167c2 = iM17539n3 != -1 ? ek0VarM25163b.m25167c(context, iM17539n3) : null;
        int iM17539n4 = anhVarM17524u.m17539n(bbe.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableM25167c3 = iM17539n4 != -1 ? ek0VarM25163b.m25167c(context, iM17539n4) : null;
        int iM17539n5 = anhVarM17524u.m17539n(bbe.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableM25167c4 = iM17539n5 != -1 ? ek0VarM25163b.m25167c(context, iM17539n5) : null;
        int iM17539n6 = anhVarM17524u.m17539n(bbe.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableM25167c5 = iM17539n6 != -1 ? ek0VarM25163b.m25167c(context, iM17539n6) : null;
        int iM17539n7 = anhVarM17524u.m17539n(bbe.AppCompatTextView_drawableEndCompat, -1);
        m42340y(drawableM25167c, drawableM25167c2, drawableM25167c3, drawableM25167c4, drawableM25167c5, iM17539n7 != -1 ? ek0VarM25163b.m25167c(context, iM17539n7) : null);
        if (anhVarM17524u.m17544s(bbe.AppCompatTextView_drawableTint)) {
            gjh.m28907f(this.f38470a, anhVarM17524u.m17528c(bbe.AppCompatTextView_drawableTint));
        }
        if (anhVarM17524u.m17544s(bbe.AppCompatTextView_drawableTintMode)) {
            gjh.m28908g(this.f38470a, vy5.m53599e(anhVarM17524u.m17536k(bbe.AppCompatTextView_drawableTintMode, -1), null));
        }
        int iM17531f = anhVarM17524u.m17531f(bbe.AppCompatTextView_firstBaselineToTopHeight, -1);
        int iM17531f2 = anhVarM17524u.m17531f(bbe.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if (anhVarM17524u.m17544s(bbe.AppCompatTextView_lineHeight)) {
            TypedValue typedValueM17545w = anhVarM17524u.m17545w(bbe.AppCompatTextView_lineHeight);
            if (typedValueM17545w != null && typedValueM17545w.type == 5) {
                iM25883a = ezh.m25883a(typedValueM17545w.data);
                fM17531f = TypedValue.complexToFloat(typedValueM17545w.data);
                anhVarM17524u.m17546x();
                if (iM17531f != -1) {
                    gjh.m28909h(this.f38470a, iM17531f);
                }
                if (iM17531f2 != -1) {
                    gjh.m28910i(this.f38470a, iM17531f2);
                }
                if (fM17531f == -1.0f) {
                    if (iM25883a == -1) {
                        gjh.m28911j(this.f38470a, (int) fM17531f);
                        return;
                    } else {
                        gjh.m28912k(this.f38470a, iM25883a, fM17531f);
                        return;
                    }
                }
                return;
            }
            fM17531f = anhVarM17524u.m17531f(bbe.AppCompatTextView_lineHeight, -1);
        } else {
            fM17531f = -1.0f;
        }
        iM25883a = -1;
        anhVarM17524u.m17546x();
        if (iM17531f != -1) {
        }
        if (iM17531f2 != -1) {
        }
        if (fM17531f == -1.0f) {
        }
    }

    /* renamed from: n */
    public void m42329n(WeakReference weakReference, Typeface typeface) {
        if (this.f38482m) {
            this.f38481l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC15825b(textView, typeface, this.f38479j));
                } else {
                    textView.setTypeface(typeface, this.f38479j);
                }
            }
        }
    }

    /* renamed from: o */
    public void m42330o(boolean z, int i, int i2, int i3, int i4) {
        if (yzi.f56345c) {
            return;
        }
        m42319c();
    }

    /* renamed from: p */
    public void m42331p() {
        m42318b();
    }

    /* renamed from: q */
    public void m42332q(Context context, int i) {
        String strM17540o;
        anh anhVarM17523t = anh.m17523t(context, i, bbe.TextAppearance);
        if (anhVarM17523t.m17544s(bbe.TextAppearance_textAllCaps)) {
            m42334s(anhVarM17523t.m17526a(bbe.TextAppearance_textAllCaps, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (anhVarM17523t.m17544s(bbe.TextAppearance_android_textSize) && anhVarM17523t.m17531f(bbe.TextAppearance_android_textSize, -1) == 0) {
            this.f38470a.setTextSize(0, 0.0f);
        }
        m42316C(context, anhVarM17523t);
        if (i2 >= 26 && anhVarM17523t.m17544s(bbe.TextAppearance_fontVariationSettings) && (strM17540o = anhVarM17523t.m17540o(bbe.TextAppearance_fontVariationSettings)) != null) {
            C15827d.m42347d(this.f38470a, strM17540o);
        }
        anhVarM17523t.m17546x();
        Typeface typeface = this.f38481l;
        if (typeface != null) {
            this.f38470a.setTypeface(typeface, this.f38479j);
        }
    }

    /* renamed from: r */
    public void m42333r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        i46.m31489f(editorInfo, textView.getText());
    }

    /* renamed from: s */
    public void m42334s(boolean z) {
        this.f38470a.setAllCaps(z);
    }

    /* renamed from: t */
    public void m42335t(int i, int i2, int i3, int i4) {
        this.f38478i.m43784p(i, i2, i3, i4);
    }

    /* renamed from: u */
    public void m42336u(int[] iArr, int i) {
        this.f38478i.m43785q(iArr, i);
    }

    /* renamed from: v */
    public void m42337v(int i) {
        this.f38478i.m43786r(i);
    }

    /* renamed from: w */
    public void m42338w(ColorStateList colorStateList) {
        if (this.f38477h == null) {
            this.f38477h = new ymh();
        }
        ymh ymhVar = this.f38477h;
        ymhVar.f55708a = colorStateList;
        ymhVar.f55711d = colorStateList != null;
        m42341z();
    }

    /* renamed from: x */
    public void m42339x(PorterDuff.Mode mode) {
        if (this.f38477h == null) {
            this.f38477h = new ymh();
        }
        ymh ymhVar = this.f38477h;
        ymhVar.f55709b = mode;
        ymhVar.f55710c = mode != null;
        m42341z();
    }

    /* renamed from: y */
    public final void m42340y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f38470a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f38470a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f38470a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f38470a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f38470a.getCompoundDrawables();
        TextView textView2 = this.f38470a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: z */
    public final void m42341z() {
        ymh ymhVar = this.f38477h;
        this.f38471b = ymhVar;
        this.f38472c = ymhVar;
        this.f38473d = ymhVar;
        this.f38474e = ymhVar;
        this.f38475f = ymhVar;
        this.f38476g = ymhVar;
    }
}
