package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Xml;
import p001o.ppe;

/* loaded from: classes3.dex */
public class mgh {

    /* renamed from: a */
    public final ColorStateList f35423a;

    /* renamed from: b */
    public final ColorStateList f35424b;

    /* renamed from: c */
    public final ColorStateList f35425c;

    /* renamed from: d */
    public final String f35426d;

    /* renamed from: e */
    public String f35427e;

    /* renamed from: f */
    public final int f35428f;

    /* renamed from: g */
    public final int f35429g;

    /* renamed from: h */
    public final boolean f35430h;

    /* renamed from: i */
    public final float f35431i;

    /* renamed from: j */
    public final float f35432j;

    /* renamed from: k */
    public final float f35433k;

    /* renamed from: l */
    public final boolean f35434l;

    /* renamed from: m */
    public final float f35435m;

    /* renamed from: n */
    public ColorStateList f35436n;

    /* renamed from: o */
    public float f35437o;

    /* renamed from: p */
    public final int f35438p;

    /* renamed from: q */
    public boolean f35439q = false;

    /* renamed from: r */
    public boolean f35440r = false;

    /* renamed from: s */
    public Typeface f35441s;

    /* renamed from: o.mgh$a */
    public class C15320a extends ppe.AbstractC16161e {

        /* renamed from: a */
        public final /* synthetic */ ogh f35442a;

        public C15320a(ogh oghVar) {
            this.f35442a = oghVar;
        }

        @Override // p001o.ppe.AbstractC16161e
        /* renamed from: h */
        public void m44051f(int i) {
            mgh.this.f35439q = true;
            this.f35442a.mo14396a(i);
        }

        @Override // p001o.ppe.AbstractC16161e
        /* renamed from: i */
        public void m44052g(Typeface typeface) {
            mgh mghVar = mgh.this;
            mghVar.f35441s = Typeface.create(typeface, mghVar.f35428f);
            mgh.this.f35439q = true;
            this.f35442a.mo14397b(mgh.this.f35441s, false);
        }
    }

    /* renamed from: o.mgh$b */
    public class C15321b extends ogh {

        /* renamed from: a */
        public final /* synthetic */ Context f35444a;

        /* renamed from: b */
        public final /* synthetic */ TextPaint f35445b;

        /* renamed from: c */
        public final /* synthetic */ ogh f35446c;

        public C15321b(Context context, TextPaint textPaint, ogh oghVar) {
            this.f35444a = context;
            this.f35445b = textPaint;
            this.f35446c = oghVar;
        }

        @Override // p001o.ogh
        /* renamed from: a */
        public void mo14396a(int i) {
            this.f35446c.mo14396a(i);
        }

        @Override // p001o.ogh
        /* renamed from: b */
        public void mo14397b(Typeface typeface, boolean z) {
            mgh.this.m39035r(this.f35444a, this.f35445b, typeface);
            this.f35446c.mo14397b(typeface, z);
        }
    }

    public mgh(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bbe.TextAppearance);
        m39032o(typedArrayObtainStyledAttributes.getDimension(bbe.TextAppearance_android_textSize, 0.0f));
        m39031n(yya.m58494a(context, typedArrayObtainStyledAttributes, bbe.TextAppearance_android_textColor));
        this.f35423a = yya.m58494a(context, typedArrayObtainStyledAttributes, bbe.TextAppearance_android_textColorHint);
        this.f35424b = yya.m58494a(context, typedArrayObtainStyledAttributes, bbe.TextAppearance_android_textColorLink);
        this.f35428f = typedArrayObtainStyledAttributes.getInt(bbe.TextAppearance_android_textStyle, 0);
        this.f35429g = typedArrayObtainStyledAttributes.getInt(bbe.TextAppearance_android_typeface, 1);
        int iM58500g = yya.m58500g(typedArrayObtainStyledAttributes, bbe.TextAppearance_fontFamily, bbe.TextAppearance_android_fontFamily);
        this.f35438p = typedArrayObtainStyledAttributes.getResourceId(iM58500g, 0);
        this.f35426d = typedArrayObtainStyledAttributes.getString(iM58500g);
        this.f35430h = typedArrayObtainStyledAttributes.getBoolean(bbe.TextAppearance_textAllCaps, false);
        this.f35425c = yya.m58494a(context, typedArrayObtainStyledAttributes, bbe.TextAppearance_android_shadowColor);
        this.f35431i = typedArrayObtainStyledAttributes.getFloat(bbe.TextAppearance_android_shadowDx, 0.0f);
        this.f35432j = typedArrayObtainStyledAttributes.getFloat(bbe.TextAppearance_android_shadowDy, 0.0f);
        this.f35433k = typedArrayObtainStyledAttributes.getFloat(bbe.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, ebe.MaterialTextAppearance);
        this.f35434l = typedArrayObtainStyledAttributes2.hasValue(ebe.MaterialTextAppearance_android_letterSpacing);
        this.f35435m = typedArrayObtainStyledAttributes2.getFloat(ebe.MaterialTextAppearance_android_letterSpacing, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f35427e = typedArrayObtainStyledAttributes2.getString(yya.m58500g(typedArrayObtainStyledAttributes2, ebe.MaterialTextAppearance_fontVariationSettings, ebe.MaterialTextAppearance_android_fontVariationSettings));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* renamed from: m */
    public static String m39021m(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 0 && resources.getResourceTypeName(i).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), obe.FontFamily);
                        String string = typedArrayObtainAttributes.getString(obe.FontFamily_fontProviderSystemFontFamily);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m39022d() {
        String str;
        if (this.f35441s == null && (str = this.f35426d) != null) {
            this.f35441s = Typeface.create(str, this.f35428f);
        }
        if (this.f35441s == null) {
            int i = this.f35429g;
            if (i == 1) {
                this.f35441s = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f35441s = Typeface.SERIF;
            } else if (i != 3) {
                this.f35441s = Typeface.DEFAULT;
            } else {
                this.f35441s = Typeface.MONOSPACE;
            }
            this.f35441s = Typeface.create(this.f35441s, this.f35428f);
        }
    }

    /* renamed from: e */
    public Typeface m39023e() {
        m39022d();
        return this.f35441s;
    }

    /* renamed from: f */
    public Typeface m39024f(Context context) {
        if (this.f35439q) {
            return this.f35441s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM44036g = ppe.m44036g(context, this.f35438p);
                this.f35441s = typefaceM44036g;
                if (typefaceM44036g != null) {
                    this.f35441s = Typeface.create(typefaceM44036g, this.f35428f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f35426d);
            }
        }
        m39022d();
        this.f35439q = true;
        return this.f35441s;
    }

    /* renamed from: g */
    public void m39025g(Context context, TextPaint textPaint, ogh oghVar) {
        m39035r(context, textPaint, m39023e());
        m39026h(context, new C15321b(context, textPaint, oghVar));
    }

    /* renamed from: h */
    public void m39026h(Context context, ogh oghVar) {
        if (!m39030l(context)) {
            m39022d();
        }
        int i = this.f35438p;
        if (i == 0) {
            this.f35439q = true;
        }
        if (this.f35439q) {
            oghVar.mo14397b(this.f35441s, true);
            return;
        }
        try {
            ppe.m44038i(context, i, new C15320a(oghVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f35439q = true;
            oghVar.mo14396a(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f35426d);
            this.f35439q = true;
            oghVar.mo14396a(-3);
        }
    }

    /* renamed from: i */
    public final Typeface m39027i(Context context) {
        Typeface typefaceCreate;
        if (this.f35440r) {
            return null;
        }
        this.f35440r = true;
        String strM39021m = m39021m(context, this.f35438p);
        if (strM39021m == null || (typefaceCreate = Typeface.create(strM39021m, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f35428f);
    }

    /* renamed from: j */
    public ColorStateList m39028j() {
        return this.f35436n;
    }

    /* renamed from: k */
    public float m39029k() {
        return this.f35437o;
    }

    /* renamed from: l */
    public final boolean m39030l(Context context) {
        if (ngh.m40549a()) {
            m39024f(context);
            return true;
        }
        if (this.f35439q) {
            return true;
        }
        int i = this.f35438p;
        if (i == 0) {
            return false;
        }
        Typeface typefaceM44032c = ppe.m44032c(context, i);
        if (typefaceM44032c != null) {
            this.f35441s = typefaceM44032c;
            this.f35439q = true;
            return true;
        }
        Typeface typefaceM39027i = m39027i(context);
        if (typefaceM39027i == null) {
            return false;
        }
        this.f35441s = typefaceM39027i;
        this.f35439q = true;
        return true;
    }

    /* renamed from: n */
    public void m39031n(ColorStateList colorStateList) {
        this.f35436n = colorStateList;
    }

    /* renamed from: o */
    public void m39032o(float f) {
        this.f35437o = f;
    }

    /* renamed from: p */
    public void m39033p(Context context, TextPaint textPaint, ogh oghVar) {
        m39034q(context, textPaint, oghVar);
        ColorStateList colorStateList = this.f35436n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f35433k;
        float f2 = this.f35431i;
        float f3 = this.f35432j;
        ColorStateList colorStateList2 = this.f35425c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: q */
    public void m39034q(Context context, TextPaint textPaint, ogh oghVar) {
        Typeface typeface;
        if (m39030l(context) && this.f35439q && (typeface = this.f35441s) != null) {
            m39035r(context, textPaint, typeface);
        } else {
            m39025g(context, textPaint, oghVar);
        }
    }

    /* renamed from: r */
    public void m39035r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM50814a = tzh.m50814a(context, typeface);
        if (typefaceM50814a != null) {
            typeface = typefaceM50814a;
        }
        textPaint.setTypeface(typeface);
        int i = this.f35428f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f35437o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f35427e);
        }
        if (this.f35434l) {
            textPaint.setLetterSpacing(this.f35435m);
        }
    }
}
