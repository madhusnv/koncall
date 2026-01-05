package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class wg0 extends gsi implements Animatable {

    /* renamed from: b */
    public C17841c f51914b;

    /* renamed from: c */
    public Context f51915c;

    /* renamed from: d */
    public ArgbEvaluator f51916d;

    /* renamed from: e */
    public C17842d f51917e;

    /* renamed from: f */
    public Animator.AnimatorListener f51918f;

    /* renamed from: g */
    public ArrayList f51919g;

    /* renamed from: h */
    public final Drawable.Callback f51920h;

    /* renamed from: o.wg0$a */
    public class C17839a implements Drawable.Callback {
        public C17839a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            wg0.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            wg0.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            wg0.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: o.wg0$b */
    public class C17840b extends AnimatorListenerAdapter {
        public C17840b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(wg0.this.f51919g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dg0) arrayList.get(i)).mo14364b(wg0.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(wg0.this.f51919g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dg0) arrayList.get(i)).mo14365c(wg0.this);
            }
        }
    }

    /* renamed from: o.wg0$c */
    public static class C17841c extends Drawable.ConstantState {

        /* renamed from: a */
        public int f51923a;

        /* renamed from: b */
        public hsi f51924b;

        /* renamed from: c */
        public AnimatorSet f51925c;

        /* renamed from: d */
        public ArrayList f51926d;

        /* renamed from: e */
        public vo0 f51927e;

        public C17841c(Context context, C17841c c17841c, Drawable.Callback callback, Resources resources) {
            if (c17841c != null) {
                this.f51923a = c17841c.f51923a;
                hsi hsiVar = c17841c.f51924b;
                if (hsiVar != null) {
                    Drawable.ConstantState constantState = hsiVar.getConstantState();
                    if (resources != null) {
                        this.f51924b = (hsi) constantState.newDrawable(resources);
                    } else {
                        this.f51924b = (hsi) constantState.newDrawable();
                    }
                    hsi hsiVar2 = (hsi) this.f51924b.mutate();
                    this.f51924b = hsiVar2;
                    hsiVar2.setCallback(callback);
                    this.f51924b.setBounds(c17841c.f51924b.getBounds());
                    this.f51924b.m31066g(false);
                }
                ArrayList arrayList = c17841c.f51926d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f51926d = new ArrayList(size);
                    this.f51927e = new vo0(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) c17841c.f51926d.get(i);
                        Animator animatorClone = animator.clone();
                        String str = (String) c17841c.f51927e.get(animator);
                        animatorClone.setTarget(this.f51924b.m31063c(str));
                        this.f51926d.add(animatorClone);
                        this.f51927e.put(animatorClone, str);
                    }
                    m54355a();
                }
            }
        }

        /* renamed from: a */
        public void m54355a() {
            if (this.f51925c == null) {
                this.f51925c = new AnimatorSet();
            }
            this.f51925c.playTogether(this.f51926d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f51923a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public wg0() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static wg0 m54348a(Context context, int i) {
        wg0 wg0Var = new wg0(context);
        Drawable drawableM44034e = ppe.m44034e(context.getResources(), i, context.getTheme());
        wg0Var.f25774a = drawableM44034e;
        drawableM44034e.setCallback(wg0Var.f51920h);
        wg0Var.f51917e = new C17842d(wg0Var.f25774a.getConstantState());
        return wg0Var;
    }

    /* renamed from: c */
    public static void m54349c(AnimatedVectorDrawable animatedVectorDrawable, dg0 dg0Var) {
        animatedVectorDrawable.registerAnimationCallback(dg0Var.m22996a());
    }

    /* renamed from: g */
    public static boolean m54350g(AnimatedVectorDrawable animatedVectorDrawable, dg0 dg0Var) {
        return animatedVectorDrawable.unregisterAnimationCallback(dg0Var.m22996a());
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27727a(drawable, theme);
        }
    }

    /* renamed from: b */
    public void m54351b(dg0 dg0Var) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            m54349c((AnimatedVectorDrawable) drawable, dg0Var);
            return;
        }
        if (dg0Var == null) {
            return;
        }
        if (this.f51919g == null) {
            this.f51919g = new ArrayList();
        }
        if (this.f51919g.contains(dg0Var)) {
            return;
        }
        this.f51919g.add(dg0Var);
        if (this.f51918f == null) {
            this.f51918f = new C17840b();
        }
        this.f51914b.f51925c.addListener(this.f51918f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            return fy5.m27728b(drawable);
        }
        return false;
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public final void m54352d() {
        Animator.AnimatorListener animatorListener = this.f51918f;
        if (animatorListener != null) {
            this.f51914b.f51925c.removeListener(animatorListener);
            this.f51918f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f51914b.f51924b.draw(canvas);
        if (this.f51914b.f51925c.isStarted()) {
            invalidateSelf();
        }
    }

    /* renamed from: e */
    public final void m54353e(String str, Animator animator) {
        animator.setTarget(this.f51914b.f51924b.m31063c(str));
        C17841c c17841c = this.f51914b;
        if (c17841c.f51926d == null) {
            c17841c.f51926d = new ArrayList();
            this.f51914b.f51927e = new vo0();
        }
        this.f51914b.f51926d.add(animator);
        this.f51914b.f51927e.put(animator, str);
    }

    /* renamed from: f */
    public boolean m54354f(dg0 dg0Var) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            m54350g((AnimatedVectorDrawable) drawable, dg0Var);
        }
        ArrayList arrayList = this.f51919g;
        if (arrayList == null || dg0Var == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(dg0Var);
        if (this.f51919g.size() == 0) {
            m54352d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f25774a;
        return drawable != null ? fy5.m27730d(drawable) : this.f51914b.f51924b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f51914b.f51923a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f25774a;
        return drawable != null ? fy5.m27731e(drawable) : this.f51914b.f51924b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f25774a != null) {
            return new C17842d(this.f25774a.getConstantState());
        }
        return null;
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f51914b.f51924b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f51914b.f51924b.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f51914b.f51924b.getOpacity();
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27733g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM23982k = dzh.m23982k(resources, theme, attributeSet, mf0.f35316e);
                    int resourceId = typedArrayM23982k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        hsi hsiVarM31061b = hsi.m31061b(resources, resourceId, theme);
                        hsiVarM31061b.m31066g(false);
                        hsiVarM31061b.setCallback(this.f51920h);
                        hsi hsiVar = this.f51914b.f51924b;
                        if (hsiVar != null) {
                            hsiVar.setCallback(null);
                        }
                        this.f51914b.f51924b = hsiVarM31061b;
                    }
                    typedArrayM23982k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, mf0.f35317f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f51915c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m54353e(string, kh0.m35701a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f51914b.m54355a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f25774a;
        return drawable != null ? fy5.m27734h(drawable) : this.f51914b.f51924b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f25774a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f51914b.f51925c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.isStateful() : this.f51914b.f51924b.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f51914b.f51924b.setBounds(rect);
        }
    }

    @Override // p001o.gsi, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.setLevel(i) : this.f51914b.f51924b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f25774a;
        return drawable != null ? drawable.setState(iArr) : this.f51914b.f51924b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f51914b.f51924b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27736j(drawable, z);
        } else {
            this.f51914b.f51924b.setAutoMirrored(z);
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
            this.f51914b.f51924b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27741o(drawable, colorStateList);
        } else {
            this.f51914b.f51924b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            fy5.m27742p(drawable, mode);
        } else {
            this.f51914b.f51924b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f51914b.f51924b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f51914b.f51925c.isStarted()) {
                return;
            }
            this.f51914b.f51925c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f51914b.f51925c.end();
        }
    }

    public wg0(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25774a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f51914b.f51924b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: o.wg0$d */
    public static class C17842d extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f51928a;

        public C17842d(Drawable.ConstantState constantState) {
            this.f51928a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f51928a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f51928a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            wg0 wg0Var = new wg0();
            Drawable drawableNewDrawable = this.f51928a.newDrawable();
            wg0Var.f25774a = drawableNewDrawable;
            drawableNewDrawable.setCallback(wg0Var.f51920h);
            return wg0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            wg0 wg0Var = new wg0();
            Drawable drawableNewDrawable = this.f51928a.newDrawable(resources);
            wg0Var.f25774a = drawableNewDrawable;
            drawableNewDrawable.setCallback(wg0Var.f51920h);
            return wg0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            wg0 wg0Var = new wg0();
            Drawable drawableNewDrawable = this.f51928a.newDrawable(resources, theme);
            wg0Var.f25774a = drawableNewDrawable;
            drawableNewDrawable.setCallback(wg0Var.f51920h);
            return wg0Var;
        }
    }

    public wg0(Context context, C17841c c17841c, Resources resources) {
        this.f51916d = null;
        this.f51918f = null;
        this.f51919g = null;
        C17839a c17839a = new C17839a();
        this.f51920h = c17839a;
        this.f51915c = context;
        if (c17841c != null) {
            this.f51914b = c17841c;
        } else {
            this.f51914b = new C17841c(context, c17841c, c17839a, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
