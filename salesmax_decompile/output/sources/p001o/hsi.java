package p001o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001o.e0d;

/* loaded from: classes2.dex */
public class hsi extends gsi {

    /* renamed from: x */
    public static final PorterDuff.Mode f27443x = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public C14061h f27444b;

    /* renamed from: c */
    public PorterDuffColorFilter f27445c;

    /* renamed from: d */
    public ColorFilter f27446d;

    /* renamed from: e */
    public boolean f27447e;

    /* renamed from: f */
    public boolean f27448f;

    /* renamed from: g */
    public Drawable.ConstantState f27449g;

    /* renamed from: h */
    public final float[] f27450h;

    /* renamed from: q */
    public final Matrix f27451q;

    /* renamed from: s */
    public final Rect f27452s;

    /* renamed from: o.hsi$b */
    public static class C14055b extends AbstractC14059f {
        public C14055b() {
        }

        @Override // p001o.hsi.AbstractC14059f
        /* renamed from: c */
        public boolean mo31069c() {
            return true;
        }

        /* renamed from: e */
        public void m31070e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (dzh.m23981j(xmlPullParser, "pathData")) {
                TypedArray typedArrayM23982k = dzh.m23982k(resources, theme, attributeSet, mf0.f35315d);
                m31071f(typedArrayM23982k, xmlPullParser);
                typedArrayM23982k.recycle();
            }
        }

        /* renamed from: f */
        public final void m31071f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f27479b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f27478a = e0d.m24039d(string2);
            }
            this.f27480c = dzh.m23978g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public C14055b(C14055b c14055b) {
            super(c14055b);
        }
    }

    /* renamed from: o.hsi$e */
    public static abstract class AbstractC14058e {
        public AbstractC14058e() {
        }

        /* renamed from: a */
        public boolean mo31072a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo31073b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: o.hsi$h */
    public static class C14061h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f27499a;

        /* renamed from: b */
        public C14060g f27500b;

        /* renamed from: c */
        public ColorStateList f27501c;

        /* renamed from: d */
        public PorterDuff.Mode f27502d;

        /* renamed from: e */
        public boolean f27503e;

        /* renamed from: f */
        public Bitmap f27504f;

        /* renamed from: g */
        public ColorStateList f27505g;

        /* renamed from: h */
        public PorterDuff.Mode f27506h;

        /* renamed from: i */
        public int f27507i;

        /* renamed from: j */
        public boolean f27508j;

        /* renamed from: k */
        public boolean f27509k;

        /* renamed from: l */
        public Paint f27510l;

        public C14061h(C14061h c14061h) {
            this.f27501c = null;
            this.f27502d = hsi.f27443x;
            if (c14061h != null) {
                this.f27499a = c14061h.f27499a;
                C14060g c14060g = new C14060g(c14061h.f27500b);
                this.f27500b = c14060g;
                if (c14061h.f27500b.f27487e != null) {
                    c14060g.f27487e = new Paint(c14061h.f27500b.f27487e);
                }
                if (c14061h.f27500b.f27486d != null) {
                    this.f27500b.f27486d = new Paint(c14061h.f27500b.f27486d);
                }
                this.f27501c = c14061h.f27501c;
                this.f27502d = c14061h.f27502d;
                this.f27503e = c14061h.f27503e;
            }
        }

        /* renamed from: a */
        public boolean m31089a(int i, int i2) {
            return i == this.f27504f.getWidth() && i2 == this.f27504f.getHeight();
        }

        /* renamed from: b */
        public boolean m31090b() {
            return !this.f27509k && this.f27505g == this.f27501c && this.f27506h == this.f27502d && this.f27508j == this.f27503e && this.f27507i == this.f27500b.getRootAlpha();
        }

        /* renamed from: c */
        public void m31091c(int i, int i2) {
            if (this.f27504f == null || !m31089a(i, i2)) {
                this.f27504f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f27509k = true;
            }
        }

        /* renamed from: d */
        public void m31092d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f27504f, (Rect) null, rect, m31093e(colorFilter));
        }

        /* renamed from: e */
        public Paint m31093e(ColorFilter colorFilter) {
            if (!m31094f() && colorFilter == null) {
                return null;
            }
            if (this.f27510l == null) {
                Paint paint = new Paint();
                this.f27510l = paint;
                paint.setFilterBitmap(true);
            }
            this.f27510l.setAlpha(this.f27500b.getRootAlpha());
            this.f27510l.setColorFilter(colorFilter);
            return this.f27510l;
        }

        /* renamed from: f */
        public boolean m31094f() {
            return this.f27500b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m31095g() {
            return this.f27500b.m31087f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f27499a;
        }

        /* renamed from: h */
        public boolean m31096h(int[] iArr) {
            boolean zM31088g = this.f27500b.m31088g(iArr);
            this.f27509k |= zM31088g;
            return zM31088g;
        }

        /* renamed from: i */
        public void m31097i() {
            this.f27505g = this.f27501c;
            this.f27506h = this.f27502d;
            this.f27507i = this.f27500b.getRootAlpha();
            this.f27508j = this.f27503e;
            this.f27509k = false;
        }

        /* renamed from: j */
        public void m31098j(int i, int i2) {
            this.f27504f.eraseColor(0);
            this.f27500b.m31083b(new Canvas(this.f27504f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new hsi(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new hsi(this);
        }

        public C14061h() {
            this.f27501c = null;
            this.f27502d = hsi.f27443x;
            this.f27500b = new C14060g();
        }
    }

    public hsi() {
        this.f27448f = true;
        this.f27450h = new float[9];
        this.f27451q = new Matrix();
        this.f27452s = new Rect();
        this.f27444b = new C14061h();
    }

    /* renamed from: a */
    public static int m31060a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: b */
    public static hsi m31061b(Resources resources, int i, Resources.Theme theme) {
        hsi hsiVar = new hsi();
        hsiVar.f25774a = ppe.m44034e(resources, i, theme);
        hsiVar.f27449g = new C14062i(hsiVar.f25774a.getConstantState());
        return hsiVar;
    }

    /* renamed from: f */
    public static PorterDuff.Mode m31062f(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* renamed from: c */
    public Object m31063c(String str) {
        return this.f27444b.f27500b.f27498p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f25774a;
        if (drawable == null) {
            return false;
        }
        fy5.m27728b(drawable);
        return false;
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public final void m31064d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C14061h c14061h = this.f27444b;
        C14060g c14060g = c14061h.f27500b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c14060g.f27490h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C14057d c14057d = (C14057d) arrayDeque.peek();
                if (ClientCookie.PATH_ATTR.equals(name)) {
                    C14056c c14056c = new C14056c();
                    c14056c.m31076g(resources, attributeSet, theme, xmlPullParser);
                    c14057d.f27466b.add(c14056c);
                    if (c14056c.getPathName() != null) {
                        c14060g.f27498p.put(c14056c.getPathName(), c14056c);
                    }
                    c14061h.f27499a = c14056c.f27481d | c14061h.f27499a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C14055b c14055b = new C14055b();
                    c14055b.m31070e(resources, attributeSet, theme, xmlPullParser);
                    c14057d.f27466b.add(c14055b);
                    if (c14055b.getPathName() != null) {
                        c14060g.f27498p.put(c14055b.getPathName(), c14055b);
                    }
                    c14061h.f27499a = c14055b.f27481d | c14061h.f27499a;
                } else if ("group".equals(name)) {
                    C14057d c14057d2 = new C14057d();
                    c14057d2.m31078c(resources, attributeSet, theme, xmlPullParser);
                    c14057d.f27466b.add(c14057d2);
                    arrayDeque.push(c14057d2);
                    if (c14057d2.getGroupName() != null) {
                        c14060g.f27498p.put(c14057d2.getGroupName(), c14057d2);
                    }
                    c14061h.f27499a = c14057d2.f27475k | c14061h.f27499a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f27452s);
        if (this.f27452s.width() <= 0 || this.f27452s.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f27446d;
        if (colorFilter == null) {
            colorFilter = this.f27445c;
        }
        canvas.getMatrix(this.f27451q);
        this.f27451q.getValues(this.f27450h);
        float fAbs = Math.abs(this.f27450h[0]);
        float fAbs2 = Math.abs(this.f27450h[4]);
        float fAbs3 = Math.abs(this.f27450h[1]);
        float fAbs4 = Math.abs(this.f27450h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f27452s.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f27452s.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f27452s;
        canvas.translate(rect.left, rect.top);
        if (m31065e()) {
            canvas.translate(this.f27452s.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f27452s.offsetTo(0, 0);
        this.f27444b.m31091c(iMin, iMin2);
        if (!this.f27448f) {
            this.f27444b.m31098j(iMin, iMin2);
        } else if (!this.f27444b.m31090b()) {
            this.f27444b.m31098j(iMin, iMin2);
            this.f27444b.m31097i();
        }
        this.f27444b.m31092d(canvas, colorFilter, this.f27452s);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public final boolean m31065e() {
        return isAutoMirrored() && fy5.m27732f(this) == 1;
    }

    /* renamed from: g */
    public void m31066g(boolean z) {
        this.f27448f = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f25774a;
        return drawable != null ? fy5.m27730d(drawable) : this.f27444b.f27500b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f27444b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f25774a;
        return drawable != null ? fy5.m27731e(drawable) : this.f27446d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f25774a != null) {
            return new C14062i(this.f25774a.getConstantState());
        }
        this.f27444b.f27499a = getChangingConfigurations();
        return this.f27444b;
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f27444b.f27500b.f27492j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f27444b.f27500b.f27491i;
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public final void m31067h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C14061h c14061h = this.f27444b;
        C14060g c14060g = c14061h.f27500b;
        c14061h.f27502d = m31062f(dzh.m23978g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListM23974c = dzh.m23974c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListM23974c != null) {
            c14061h.f27501c = colorStateListM23974c;
        }
        c14061h.f27503e = dzh.m23972a(typedArray, xmlPullParser, "autoMirrored", 5, c14061h.f27503e);
        c14060g.f27493k = dzh.m23977f(typedArray, xmlPullParser, "viewportWidth", 7, c14060g.f27493k);
        float fM23977f = dzh.m23977f(typedArray, xmlPullParser, "viewportHeight", 8, c14060g.f27494l);
        c14060g.f27494l = fM23977f;
        if (c14060g.f27493k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM23977f <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c14060g.f27491i = typedArray.getDimension(3, c14060g.f27491i);
        float dimension = typedArray.getDimension(2, c14060g.f27492j);
        c14060g.f27492j = dimension;
        if (c14060g.f27491i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c14060g.setAlpha(dzh.m23977f(typedArray, xmlPullParser, "alpha", 4, c14060g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c14060g.f27496n = string;
            c14060g.f27498p.put(string, c14060g);
        }
    }

    /* renamed from: i */
    public PorterDuffColorFilter m31068i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f25774a;
        return drawable != null ? fy5.m27734h(drawable) : this.f27444b.f27503e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C14061h c14061h;
        ColorStateList colorStateList;
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c14061h = this.f27444b) != null && (c14061h.m31095g() || ((colorStateList = this.f27444b.f27501c) != null && colorStateList.isStateful())));
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f27447e && super.mutate() == this) {
            this.f27444b = new C14061h(this.f27444b);
            this.f27447e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C14061h c14061h = this.f27444b;
        ColorStateList colorStateList = c14061h.f27501c;
        if (colorStateList == null || (mode = c14061h.f27502d) == null) {
            z = false;
        } else {
            this.f27445c = m31068i(this.f27445c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c14061h.m31095g() || !c14061h.m31096h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f27444b.f27500b.getRootAlpha() != i) {
            this.f27444b.f27500b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27736j(drawable, z);
        } else {
            this.f27444b.f27503e = z;
        }
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27740n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27741o(drawable, colorStateList);
            return;
        }
        C14061h c14061h = this.f27444b;
        if (c14061h.f27501c != colorStateList) {
            c14061h.f27501c = colorStateList;
            this.f27445c = m31068i(this.f27445c, colorStateList, c14061h.f27502d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27742p(drawable, mode);
            return;
        }
        C14061h c14061h = this.f27444b;
        if (c14061h.f27502d != mode) {
            c14061h.f27502d = mode;
            this.f27445c = m31068i(this.f27445c, c14061h.f27501c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: o.hsi$i */
    public static class C14062i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f27511a;

        public C14062i(Drawable.ConstantState constantState) {
            this.f27511a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f27511a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f27511a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            hsi hsiVar = new hsi();
            hsiVar.f25774a = (VectorDrawable) this.f27511a.newDrawable();
            return hsiVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            hsi hsiVar = new hsi();
            hsiVar.f25774a = (VectorDrawable) this.f27511a.newDrawable(resources);
            return hsiVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            hsi hsiVar = new hsi();
            hsiVar.f25774a = (VectorDrawable) this.f27511a.newDrawable(resources, theme);
            return hsiVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f27446d = colorFilter;
            invalidateSelf();
        }
    }

    /* renamed from: o.hsi$f */
    public static abstract class AbstractC14059f extends AbstractC14058e {

        /* renamed from: a */
        public e0d.C13069b[] f27478a;

        /* renamed from: b */
        public String f27479b;

        /* renamed from: c */
        public int f27480c;

        /* renamed from: d */
        public int f27481d;

        public AbstractC14059f() {
            super();
            this.f27478a = null;
            this.f27480c = 0;
        }

        /* renamed from: c */
        public boolean mo31069c() {
            return false;
        }

        /* renamed from: d */
        public void m31081d(Path path) {
            path.reset();
            e0d.C13069b[] c13069bArr = this.f27478a;
            if (c13069bArr != null) {
                e0d.C13069b.m24054h(c13069bArr, path);
            }
        }

        public e0d.C13069b[] getPathData() {
            return this.f27478a;
        }

        public String getPathName() {
            return this.f27479b;
        }

        public void setPathData(e0d.C13069b[] c13069bArr) {
            if (e0d.m24037b(this.f27478a, c13069bArr)) {
                e0d.m24046k(this.f27478a, c13069bArr);
            } else {
                this.f27478a = e0d.m24041f(c13069bArr);
            }
        }

        public AbstractC14059f(AbstractC14059f abstractC14059f) {
            super();
            this.f27478a = null;
            this.f27480c = 0;
            this.f27479b = abstractC14059f.f27479b;
            this.f27481d = abstractC14059f.f27481d;
            this.f27478a = e0d.m24041f(abstractC14059f.f27478a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27733g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C14061h c14061h = this.f27444b;
        c14061h.f27500b = new C14060g();
        TypedArray typedArrayM23982k = dzh.m23982k(resources, theme, attributeSet, mf0.f35312a);
        m31067h(typedArrayM23982k, xmlPullParser, theme);
        typedArrayM23982k.recycle();
        c14061h.f27499a = getChangingConfigurations();
        c14061h.f27509k = true;
        m31064d(resources, xmlPullParser, attributeSet, theme);
        this.f27445c = m31068i(this.f27445c, c14061h.f27501c, c14061h.f27502d);
    }

    public hsi(C14061h c14061h) {
        this.f27448f = true;
        this.f27450h = new float[9];
        this.f27451q = new Matrix();
        this.f27452s = new Rect();
        this.f27444b = c14061h;
        this.f27445c = m31068i(this.f27445c, c14061h.f27501c, c14061h.f27502d);
    }

    /* renamed from: o.hsi$c */
    public static class C14056c extends AbstractC14059f {

        /* renamed from: e */
        public int[] f27453e;

        /* renamed from: f */
        public sm3 f27454f;

        /* renamed from: g */
        public float f27455g;

        /* renamed from: h */
        public sm3 f27456h;

        /* renamed from: i */
        public float f27457i;

        /* renamed from: j */
        public float f27458j;

        /* renamed from: k */
        public float f27459k;

        /* renamed from: l */
        public float f27460l;

        /* renamed from: m */
        public float f27461m;

        /* renamed from: n */
        public Paint.Cap f27462n;

        /* renamed from: o */
        public Paint.Join f27463o;

        /* renamed from: p */
        public float f27464p;

        public C14056c() {
            this.f27455g = 0.0f;
            this.f27457i = 1.0f;
            this.f27458j = 1.0f;
            this.f27459k = 0.0f;
            this.f27460l = 1.0f;
            this.f27461m = 0.0f;
            this.f27462n = Paint.Cap.BUTT;
            this.f27463o = Paint.Join.MITER;
            this.f27464p = 4.0f;
        }

        @Override // p001o.hsi.AbstractC14058e
        /* renamed from: a */
        public boolean mo31072a() {
            return this.f27456h.m48540i() || this.f27454f.m48540i();
        }

        @Override // p001o.hsi.AbstractC14058e
        /* renamed from: b */
        public boolean mo31073b(int[] iArr) {
            return this.f27454f.m48541j(iArr) | this.f27456h.m48541j(iArr);
        }

        /* renamed from: e */
        public final Paint.Cap m31074e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        public final Paint.Join m31075f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: g */
        public void m31076g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM23982k = dzh.m23982k(resources, theme, attributeSet, mf0.f35314c);
            m31077h(typedArrayM23982k, xmlPullParser, theme);
            typedArrayM23982k.recycle();
        }

        public float getFillAlpha() {
            return this.f27458j;
        }

        public int getFillColor() {
            return this.f27456h.m48537e();
        }

        public float getStrokeAlpha() {
            return this.f27457i;
        }

        public int getStrokeColor() {
            return this.f27454f.m48537e();
        }

        public float getStrokeWidth() {
            return this.f27455g;
        }

        public float getTrimPathEnd() {
            return this.f27460l;
        }

        public float getTrimPathOffset() {
            return this.f27461m;
        }

        public float getTrimPathStart() {
            return this.f27459k;
        }

        /* renamed from: h */
        public final void m31077h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f27453e = null;
            if (dzh.m23981j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f27479b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f27478a = e0d.m24039d(string2);
                }
                this.f27456h = dzh.m23976e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f27458j = dzh.m23977f(typedArray, xmlPullParser, "fillAlpha", 12, this.f27458j);
                this.f27462n = m31074e(dzh.m23978g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f27462n);
                this.f27463o = m31075f(dzh.m23978g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f27463o);
                this.f27464p = dzh.m23977f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f27464p);
                this.f27454f = dzh.m23976e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f27457i = dzh.m23977f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f27457i);
                this.f27455g = dzh.m23977f(typedArray, xmlPullParser, "strokeWidth", 4, this.f27455g);
                this.f27460l = dzh.m23977f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f27460l);
                this.f27461m = dzh.m23977f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f27461m);
                this.f27459k = dzh.m23977f(typedArray, xmlPullParser, "trimPathStart", 5, this.f27459k);
                this.f27480c = dzh.m23978g(typedArray, xmlPullParser, "fillType", 13, this.f27480c);
            }
        }

        public void setFillAlpha(float f) {
            this.f27458j = f;
        }

        public void setFillColor(int i) {
            this.f27456h.m48542k(i);
        }

        public void setStrokeAlpha(float f) {
            this.f27457i = f;
        }

        public void setStrokeColor(int i) {
            this.f27454f.m48542k(i);
        }

        public void setStrokeWidth(float f) {
            this.f27455g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f27460l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f27461m = f;
        }

        public void setTrimPathStart(float f) {
            this.f27459k = f;
        }

        public C14056c(C14056c c14056c) {
            super(c14056c);
            this.f27455g = 0.0f;
            this.f27457i = 1.0f;
            this.f27458j = 1.0f;
            this.f27459k = 0.0f;
            this.f27460l = 1.0f;
            this.f27461m = 0.0f;
            this.f27462n = Paint.Cap.BUTT;
            this.f27463o = Paint.Join.MITER;
            this.f27464p = 4.0f;
            this.f27453e = c14056c.f27453e;
            this.f27454f = c14056c.f27454f;
            this.f27455g = c14056c.f27455g;
            this.f27457i = c14056c.f27457i;
            this.f27456h = c14056c.f27456h;
            this.f27480c = c14056c.f27480c;
            this.f27458j = c14056c.f27458j;
            this.f27459k = c14056c.f27459k;
            this.f27460l = c14056c.f27460l;
            this.f27461m = c14056c.f27461m;
            this.f27462n = c14056c.f27462n;
            this.f27463o = c14056c.f27463o;
            this.f27464p = c14056c.f27464p;
        }
    }

    /* renamed from: o.hsi$g */
    public static class C14060g {

        /* renamed from: q */
        public static final Matrix f27482q = new Matrix();

        /* renamed from: a */
        public final Path f27483a;

        /* renamed from: b */
        public final Path f27484b;

        /* renamed from: c */
        public final Matrix f27485c;

        /* renamed from: d */
        public Paint f27486d;

        /* renamed from: e */
        public Paint f27487e;

        /* renamed from: f */
        public PathMeasure f27488f;

        /* renamed from: g */
        public int f27489g;

        /* renamed from: h */
        public final C14057d f27490h;

        /* renamed from: i */
        public float f27491i;

        /* renamed from: j */
        public float f27492j;

        /* renamed from: k */
        public float f27493k;

        /* renamed from: l */
        public float f27494l;

        /* renamed from: m */
        public int f27495m;

        /* renamed from: n */
        public String f27496n;

        /* renamed from: o */
        public Boolean f27497o;

        /* renamed from: p */
        public final vo0 f27498p;

        public C14060g() {
            this.f27485c = new Matrix();
            this.f27491i = 0.0f;
            this.f27492j = 0.0f;
            this.f27493k = 0.0f;
            this.f27494l = 0.0f;
            this.f27495m = Constants.MAX_HOST_LENGTH;
            this.f27496n = null;
            this.f27497o = null;
            this.f27498p = new vo0();
            this.f27490h = new C14057d();
            this.f27483a = new Path();
            this.f27484b = new Path();
        }

        /* renamed from: a */
        public static float m31082a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: b */
        public void m31083b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m31084c(this.f27490h, f27482q, canvas, i, i2, colorFilter);
        }

        /* renamed from: c */
        public final void m31084c(C14057d c14057d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c14057d.f27465a.set(matrix);
            c14057d.f27465a.preConcat(c14057d.f27474j);
            canvas.save();
            for (int i3 = 0; i3 < c14057d.f27466b.size(); i3++) {
                AbstractC14058e abstractC14058e = (AbstractC14058e) c14057d.f27466b.get(i3);
                if (abstractC14058e instanceof C14057d) {
                    m31084c((C14057d) abstractC14058e, c14057d.f27465a, canvas, i, i2, colorFilter);
                } else if (abstractC14058e instanceof AbstractC14059f) {
                    m31085d(c14057d, (AbstractC14059f) abstractC14058e, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void m31085d(C14057d c14057d, AbstractC14059f abstractC14059f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f27493k;
            float f2 = i2 / this.f27494l;
            float fMin = Math.min(f, f2);
            Matrix matrix = c14057d.f27465a;
            this.f27485c.set(matrix);
            this.f27485c.postScale(f, f2);
            float fM31086e = m31086e(matrix);
            if (fM31086e == 0.0f) {
                return;
            }
            abstractC14059f.m31081d(this.f27483a);
            Path path = this.f27483a;
            this.f27484b.reset();
            if (abstractC14059f.mo31069c()) {
                this.f27484b.setFillType(abstractC14059f.f27480c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f27484b.addPath(path, this.f27485c);
                canvas.clipPath(this.f27484b);
                return;
            }
            C14056c c14056c = (C14056c) abstractC14059f;
            float f3 = c14056c.f27459k;
            if (f3 != 0.0f || c14056c.f27460l != 1.0f) {
                float f4 = c14056c.f27461m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c14056c.f27460l + f4) % 1.0f;
                if (this.f27488f == null) {
                    this.f27488f = new PathMeasure();
                }
                this.f27488f.setPath(this.f27483a, false);
                float length = this.f27488f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f27488f.getSegment(f7, length, path, true);
                    this.f27488f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f27488f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f27484b.addPath(path, this.f27485c);
            if (c14056c.f27456h.m48543l()) {
                sm3 sm3Var = c14056c.f27456h;
                if (this.f27487e == null) {
                    Paint paint = new Paint(1);
                    this.f27487e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f27487e;
                if (sm3Var.m48539h()) {
                    Shader shaderM48538f = sm3Var.m48538f();
                    shaderM48538f.setLocalMatrix(this.f27485c);
                    paint2.setShader(shaderM48538f);
                    paint2.setAlpha(Math.round(c14056c.f27458j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(Constants.MAX_HOST_LENGTH);
                    paint2.setColor(hsi.m31060a(sm3Var.m48537e(), c14056c.f27458j));
                }
                paint2.setColorFilter(colorFilter);
                this.f27484b.setFillType(c14056c.f27480c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f27484b, paint2);
            }
            if (c14056c.f27454f.m48543l()) {
                sm3 sm3Var2 = c14056c.f27454f;
                if (this.f27486d == null) {
                    Paint paint3 = new Paint(1);
                    this.f27486d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f27486d;
                Paint.Join join = c14056c.f27463o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c14056c.f27462n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c14056c.f27464p);
                if (sm3Var2.m48539h()) {
                    Shader shaderM48538f2 = sm3Var2.m48538f();
                    shaderM48538f2.setLocalMatrix(this.f27485c);
                    paint4.setShader(shaderM48538f2);
                    paint4.setAlpha(Math.round(c14056c.f27457i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(Constants.MAX_HOST_LENGTH);
                    paint4.setColor(hsi.m31060a(sm3Var2.m48537e(), c14056c.f27457i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c14056c.f27455g * fMin * fM31086e);
                canvas.drawPath(this.f27484b, paint4);
            }
        }

        /* renamed from: e */
        public final float m31086e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM31082a = m31082a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM31082a) / fMax;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public boolean m31087f() {
            if (this.f27497o == null) {
                this.f27497o = Boolean.valueOf(this.f27490h.mo31072a());
            }
            return this.f27497o.booleanValue();
        }

        /* renamed from: g */
        public boolean m31088g(int[] iArr) {
            return this.f27490h.mo31073b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f27495m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f27495m = i;
        }

        public C14060g(C14060g c14060g) {
            this.f27485c = new Matrix();
            this.f27491i = 0.0f;
            this.f27492j = 0.0f;
            this.f27493k = 0.0f;
            this.f27494l = 0.0f;
            this.f27495m = Constants.MAX_HOST_LENGTH;
            this.f27496n = null;
            this.f27497o = null;
            vo0 vo0Var = new vo0();
            this.f27498p = vo0Var;
            this.f27490h = new C14057d(c14060g.f27490h, vo0Var);
            this.f27483a = new Path(c14060g.f27483a);
            this.f27484b = new Path(c14060g.f27484b);
            this.f27491i = c14060g.f27491i;
            this.f27492j = c14060g.f27492j;
            this.f27493k = c14060g.f27493k;
            this.f27494l = c14060g.f27494l;
            this.f27489g = c14060g.f27489g;
            this.f27495m = c14060g.f27495m;
            this.f27496n = c14060g.f27496n;
            String str = c14060g.f27496n;
            if (str != null) {
                vo0Var.put(str, this);
            }
            this.f27497o = c14060g.f27497o;
        }
    }

    /* renamed from: o.hsi$d */
    public static class C14057d extends AbstractC14058e {

        /* renamed from: a */
        public final Matrix f27465a;

        /* renamed from: b */
        public final ArrayList f27466b;

        /* renamed from: c */
        public float f27467c;

        /* renamed from: d */
        public float f27468d;

        /* renamed from: e */
        public float f27469e;

        /* renamed from: f */
        public float f27470f;

        /* renamed from: g */
        public float f27471g;

        /* renamed from: h */
        public float f27472h;

        /* renamed from: i */
        public float f27473i;

        /* renamed from: j */
        public final Matrix f27474j;

        /* renamed from: k */
        public int f27475k;

        /* renamed from: l */
        public int[] f27476l;

        /* renamed from: m */
        public String f27477m;

        public C14057d(C14057d c14057d, vo0 vo0Var) {
            AbstractC14059f c14055b;
            super();
            this.f27465a = new Matrix();
            this.f27466b = new ArrayList();
            this.f27467c = 0.0f;
            this.f27468d = 0.0f;
            this.f27469e = 0.0f;
            this.f27470f = 1.0f;
            this.f27471g = 1.0f;
            this.f27472h = 0.0f;
            this.f27473i = 0.0f;
            Matrix matrix = new Matrix();
            this.f27474j = matrix;
            this.f27477m = null;
            this.f27467c = c14057d.f27467c;
            this.f27468d = c14057d.f27468d;
            this.f27469e = c14057d.f27469e;
            this.f27470f = c14057d.f27470f;
            this.f27471g = c14057d.f27471g;
            this.f27472h = c14057d.f27472h;
            this.f27473i = c14057d.f27473i;
            this.f27476l = c14057d.f27476l;
            String str = c14057d.f27477m;
            this.f27477m = str;
            this.f27475k = c14057d.f27475k;
            if (str != null) {
                vo0Var.put(str, this);
            }
            matrix.set(c14057d.f27474j);
            ArrayList arrayList = c14057d.f27466b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C14057d) {
                    this.f27466b.add(new C14057d((C14057d) obj, vo0Var));
                } else {
                    if (obj instanceof C14056c) {
                        c14055b = new C14056c((C14056c) obj);
                    } else {
                        if (!(obj instanceof C14055b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        c14055b = new C14055b((C14055b) obj);
                    }
                    this.f27466b.add(c14055b);
                    Object obj2 = c14055b.f27479b;
                    if (obj2 != null) {
                        vo0Var.put(obj2, c14055b);
                    }
                }
            }
        }

        @Override // p001o.hsi.AbstractC14058e
        /* renamed from: a */
        public boolean mo31072a() {
            for (int i = 0; i < this.f27466b.size(); i++) {
                if (((AbstractC14058e) this.f27466b.get(i)).mo31072a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p001o.hsi.AbstractC14058e
        /* renamed from: b */
        public boolean mo31073b(int[] iArr) {
            boolean zMo31073b = false;
            for (int i = 0; i < this.f27466b.size(); i++) {
                zMo31073b |= ((AbstractC14058e) this.f27466b.get(i)).mo31073b(iArr);
            }
            return zMo31073b;
        }

        /* renamed from: c */
        public void m31078c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM23982k = dzh.m23982k(resources, theme, attributeSet, mf0.f35313b);
            m31080e(typedArrayM23982k, xmlPullParser);
            typedArrayM23982k.recycle();
        }

        /* renamed from: d */
        public final void m31079d() {
            this.f27474j.reset();
            this.f27474j.postTranslate(-this.f27468d, -this.f27469e);
            this.f27474j.postScale(this.f27470f, this.f27471g);
            this.f27474j.postRotate(this.f27467c, 0.0f, 0.0f);
            this.f27474j.postTranslate(this.f27472h + this.f27468d, this.f27473i + this.f27469e);
        }

        /* renamed from: e */
        public final void m31080e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f27476l = null;
            this.f27467c = dzh.m23977f(typedArray, xmlPullParser, "rotation", 5, this.f27467c);
            this.f27468d = typedArray.getFloat(1, this.f27468d);
            this.f27469e = typedArray.getFloat(2, this.f27469e);
            this.f27470f = dzh.m23977f(typedArray, xmlPullParser, "scaleX", 3, this.f27470f);
            this.f27471g = dzh.m23977f(typedArray, xmlPullParser, "scaleY", 4, this.f27471g);
            this.f27472h = dzh.m23977f(typedArray, xmlPullParser, "translateX", 6, this.f27472h);
            this.f27473i = dzh.m23977f(typedArray, xmlPullParser, "translateY", 7, this.f27473i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f27477m = string;
            }
            m31079d();
        }

        public String getGroupName() {
            return this.f27477m;
        }

        public Matrix getLocalMatrix() {
            return this.f27474j;
        }

        public float getPivotX() {
            return this.f27468d;
        }

        public float getPivotY() {
            return this.f27469e;
        }

        public float getRotation() {
            return this.f27467c;
        }

        public float getScaleX() {
            return this.f27470f;
        }

        public float getScaleY() {
            return this.f27471g;
        }

        public float getTranslateX() {
            return this.f27472h;
        }

        public float getTranslateY() {
            return this.f27473i;
        }

        public void setPivotX(float f) {
            if (f != this.f27468d) {
                this.f27468d = f;
                m31079d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f27469e) {
                this.f27469e = f;
                m31079d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f27467c) {
                this.f27467c = f;
                m31079d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f27470f) {
                this.f27470f = f;
                m31079d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f27471g) {
                this.f27471g = f;
                m31079d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f27472h) {
                this.f27472h = f;
                m31079d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f27473i) {
                this.f27473i = f;
                m31079d();
            }
        }

        public C14057d() {
            super();
            this.f27465a = new Matrix();
            this.f27466b = new ArrayList();
            this.f27467c = 0.0f;
            this.f27468d = 0.0f;
            this.f27469e = 0.0f;
            this.f27470f = 1.0f;
            this.f27471g = 1.0f;
            this.f27472h = 0.0f;
            this.f27473i = 0.0f;
            this.f27474j = new Matrix();
            this.f27477m = null;
        }
    }
}
