package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class poe {

    /* renamed from: i */
    public static poe f40338i;

    /* renamed from: a */
    public WeakHashMap f40340a;

    /* renamed from: b */
    public ktf f40341b;

    /* renamed from: c */
    public d0g f40342c;

    /* renamed from: d */
    public final WeakHashMap f40343d = new WeakHashMap(0);

    /* renamed from: e */
    public TypedValue f40344e;

    /* renamed from: f */
    public boolean f40345f;

    /* renamed from: g */
    public InterfaceC16150c f40346g;

    /* renamed from: h */
    public static final PorterDuff.Mode f40337h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final C16148a f40339j = new C16148a(6);

    /* renamed from: o.poe$a */
    public static class C16148a extends xma {
        public C16148a(int i) {
            super(i);
        }

        /* renamed from: b */
        public static int m43989b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: c */
        public PorterDuffColorFilter m43990c(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(m43989b(i, mode)));
        }

        /* renamed from: d */
        public PorterDuffColorFilter m43991d(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(m43989b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: o.poe$b */
    public interface InterfaceC16149b {
        /* renamed from: a */
        Drawable m43992a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: o.poe$c */
    public interface InterfaceC16150c {
        /* renamed from: a */
        Drawable mo25171a(poe poeVar, Context context, int i);

        /* renamed from: b */
        ColorStateList mo25172b(Context context, int i);

        /* renamed from: c */
        boolean mo25173c(Context context, int i, Drawable drawable);

        /* renamed from: d */
        PorterDuff.Mode mo25174d(int i);

        /* renamed from: e */
        boolean mo25175e(Context context, int i, Drawable drawable);
    }

    /* renamed from: d */
    public static long m43966d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    public static PorterDuffColorFilter m43967f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m43969k(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: g */
    public static synchronized poe m43968g() {
        if (f40338i == null) {
            poe poeVar = new poe();
            f40338i = poeVar;
            m43970o(poeVar);
        }
        return f40338i;
    }

    /* renamed from: k */
    public static synchronized PorterDuffColorFilter m43969k(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM43990c;
        C16148a c16148a = f40339j;
        porterDuffColorFilterM43990c = c16148a.m43990c(i, mode);
        if (porterDuffColorFilterM43990c == null) {
            porterDuffColorFilterM43990c = new PorterDuffColorFilter(i, mode);
            c16148a.m43991d(i, mode, porterDuffColorFilterM43990c);
        }
        return porterDuffColorFilterM43990c;
    }

    /* renamed from: o */
    public static void m43970o(poe poeVar) {
    }

    /* renamed from: p */
    public static boolean m43971p(Drawable drawable) {
        return (drawable instanceof hsi) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: v */
    public static void m43972v(Drawable drawable, ymh ymhVar, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = ymhVar.f55711d;
            if (z || ymhVar.f55710c) {
                drawable.setColorFilter(m43967f(z ? ymhVar.f55708a : null, ymhVar.f55710c ? ymhVar.f55709b : f40337h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean m43973a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        rla rlaVar = (rla) this.f40343d.get(context);
        if (rlaVar == null) {
            rlaVar = new rla();
            this.f40343d.put(context, rlaVar);
        }
        rlaVar.m46936i(j, new WeakReference(constantState));
        return true;
    }

    /* renamed from: b */
    public final void m43974b(Context context, int i, ColorStateList colorStateList) {
        if (this.f40340a == null) {
            this.f40340a = new WeakHashMap();
        }
        d0g d0gVar = (d0g) this.f40340a.get(context);
        if (d0gVar == null) {
            d0gVar = new d0g();
            this.f40340a.put(context, d0gVar);
        }
        d0gVar.m22181a(i, colorStateList);
    }

    /* renamed from: c */
    public final void m43975c(Context context) {
        if (this.f40345f) {
            return;
        }
        this.f40345f = true;
        Drawable drawableM43978i = m43978i(context, o7e.abc_vector_test);
        if (drawableM43978i == null || !m43971p(drawableM43978i)) {
            this.f40345f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: e */
    public final Drawable m43976e(Context context, int i) throws Resources.NotFoundException {
        if (this.f40344e == null) {
            this.f40344e = new TypedValue();
        }
        TypedValue typedValue = this.f40344e;
        context.getResources().getValue(i, typedValue, true);
        long jM43966d = m43966d(typedValue);
        Drawable drawableM43977h = m43977h(context, jM43966d);
        if (drawableM43977h != null) {
            return drawableM43977h;
        }
        InterfaceC16150c interfaceC16150c = this.f40346g;
        Drawable drawableMo25171a = interfaceC16150c == null ? null : interfaceC16150c.mo25171a(this, context, i);
        if (drawableMo25171a != null) {
            drawableMo25171a.setChangingConfigurations(typedValue.changingConfigurations);
            m43973a(context, jM43966d, drawableMo25171a);
        }
        return drawableMo25171a;
    }

    /* renamed from: h */
    public final synchronized Drawable m43977h(Context context, long j) {
        rla rlaVar = (rla) this.f40343d.get(context);
        if (rlaVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) rlaVar.m46932c(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            rlaVar.m46938k(j);
        }
        return null;
    }

    /* renamed from: i */
    public synchronized Drawable m43978i(Context context, int i) {
        return m43979j(context, i, false);
    }

    /* renamed from: j */
    public synchronized Drawable m43979j(Context context, int i, boolean z) {
        Drawable drawableM43983q;
        m43975c(context);
        drawableM43983q = m43983q(context, i);
        if (drawableM43983q == null) {
            drawableM43983q = m43976e(context, i);
        }
        if (drawableM43983q == null) {
            drawableM43983q = c64.getDrawable(context, i);
        }
        if (drawableM43983q != null) {
            drawableM43983q = m43987u(context, i, z, drawableM43983q);
        }
        if (drawableM43983q != null) {
            vy5.m53596b(drawableM43983q);
        }
        return drawableM43983q;
    }

    /* renamed from: l */
    public synchronized ColorStateList m43980l(Context context, int i) {
        ColorStateList colorStateListM43981m;
        colorStateListM43981m = m43981m(context, i);
        if (colorStateListM43981m == null) {
            InterfaceC16150c interfaceC16150c = this.f40346g;
            colorStateListM43981m = interfaceC16150c == null ? null : interfaceC16150c.mo25172b(context, i);
            if (colorStateListM43981m != null) {
                m43974b(context, i, colorStateListM43981m);
            }
        }
        return colorStateListM43981m;
    }

    /* renamed from: m */
    public final ColorStateList m43981m(Context context, int i) {
        d0g d0gVar;
        WeakHashMap weakHashMap = this.f40340a;
        if (weakHashMap == null || (d0gVar = (d0g) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) d0gVar.m22184f(i);
    }

    /* renamed from: n */
    public PorterDuff.Mode m43982n(int i) {
        InterfaceC16150c interfaceC16150c = this.f40346g;
        if (interfaceC16150c == null) {
            return null;
        }
        return interfaceC16150c.mo25174d(i);
    }

    /* renamed from: q */
    public final Drawable m43983q(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        ktf ktfVar = this.f40341b;
        if (ktfVar == null || ktfVar.isEmpty()) {
            return null;
        }
        d0g d0gVar = this.f40342c;
        if (d0gVar != null) {
            String str = (String) d0gVar.m22184f(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f40341b.get(str) == null)) {
                return null;
            }
        } else {
            this.f40342c = new d0g();
        }
        if (this.f40344e == null) {
            this.f40344e = new TypedValue();
        }
        TypedValue typedValue = this.f40344e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jM43966d = m43966d(typedValue);
        Drawable drawableM43977h = m43977h(context, jM43966d);
        if (drawableM43977h != null) {
            return drawableM43977h;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f40342c.m22181a(i, name);
                InterfaceC16149b interfaceC16149b = (InterfaceC16149b) this.f40341b.get(name);
                if (interfaceC16149b != null) {
                    drawableM43977h = interfaceC16149b.m43992a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM43977h != null) {
                    drawableM43977h.setChangingConfigurations(typedValue.changingConfigurations);
                    m43973a(context, jM43966d, drawableM43977h);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableM43977h == null) {
            this.f40342c.m22181a(i, "appcompat_skip_skip");
        }
        return drawableM43977h;
    }

    /* renamed from: r */
    public synchronized void m43984r(Context context) {
        rla rlaVar = (rla) this.f40343d.get(context);
        if (rlaVar != null) {
            rlaVar.clear();
        }
    }

    /* renamed from: s */
    public synchronized Drawable m43985s(Context context, isi isiVar, int i) {
        Drawable drawableM43983q = m43983q(context, i);
        if (drawableM43983q == null) {
            drawableM43983q = isiVar.m47073a(i);
        }
        if (drawableM43983q == null) {
            return null;
        }
        return m43987u(context, i, false, drawableM43983q);
    }

    /* renamed from: t */
    public synchronized void m43986t(InterfaceC16150c interfaceC16150c) {
        this.f40346g = interfaceC16150c;
    }

    /* renamed from: u */
    public final Drawable m43987u(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList colorStateListM43980l = m43980l(context, i);
        if (colorStateListM43980l != null) {
            Drawable drawableM27744r = fy5.m27744r(drawable.mutate());
            fy5.m27741o(drawableM27744r, colorStateListM43980l);
            PorterDuff.Mode modeM43982n = m43982n(i);
            if (modeM43982n == null) {
                return drawableM27744r;
            }
            fy5.m27742p(drawableM27744r, modeM43982n);
            return drawableM27744r;
        }
        InterfaceC16150c interfaceC16150c = this.f40346g;
        if ((interfaceC16150c == null || !interfaceC16150c.mo25175e(context, i, drawable)) && !m43988w(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    public boolean m43988w(Context context, int i, Drawable drawable) {
        InterfaceC16150c interfaceC16150c = this.f40346g;
        return interfaceC16150c != null && interfaceC16150c.mo25173c(context, i, drawable);
    }
}
