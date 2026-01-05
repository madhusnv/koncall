package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.nio.ByteBuffer;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.ps7;

/* loaded from: classes5.dex */
public class js7 extends Drawable implements ps7.InterfaceC16174b, Animatable {

    /* renamed from: a */
    public final C14647a f31028a;

    /* renamed from: b */
    public boolean f31029b;

    /* renamed from: c */
    public boolean f31030c;

    /* renamed from: d */
    public boolean f31031d;

    /* renamed from: e */
    public boolean f31032e;

    /* renamed from: f */
    public int f31033f;

    /* renamed from: g */
    public int f31034g;

    /* renamed from: h */
    public boolean f31035h;

    /* renamed from: q */
    public Paint f31036q;

    /* renamed from: s */
    public Rect f31037s;

    /* renamed from: x */
    public List f31038x;

    /* renamed from: o.js7$a */
    public static final class C14647a extends Drawable.ConstantState {

        /* renamed from: a */
        public final ps7 f31039a;

        public C14647a(ps7 ps7Var) {
            this.f31039a = ps7Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new js7(this);
        }
    }

    public js7(Context context, is7 is7Var, xuh xuhVar, int i, int i2, Bitmap bitmap) {
        this(new C14647a(new ps7(ComponentCallbacks2C10724a.m12647c(context), is7Var, i, i2, xuhVar, bitmap)));
    }

    @Override // p001o.ps7.InterfaceC16174b
    /* renamed from: a */
    public void mo34455a() {
        if (m34456b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m34461g() == m34460f() - 1) {
            this.f31033f++;
        }
        int i = this.f31034g;
        if (i == -1 || this.f31033f < i) {
            return;
        }
        m34464j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Drawable.Callback m34456b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer m34457c() {
        return this.f31028a.f31039a.m44108b();
    }

    /* renamed from: d */
    public final Rect m34458d() {
        if (this.f31037s == null) {
            this.f31037s = new Rect();
        }
        return this.f31037s;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f31031d) {
            return;
        }
        if (this.f31035h) {
            Gravity.apply(Opcodes.DNEG, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m34458d());
            this.f31035h = false;
        }
        canvas.drawBitmap(this.f31028a.f31039a.m44109c(), (Rect) null, m34458d(), m34462h());
    }

    /* renamed from: e */
    public Bitmap m34459e() {
        return this.f31028a.f31039a.m44111e();
    }

    /* renamed from: f */
    public int m34460f() {
        return this.f31028a.f31039a.m44112f();
    }

    /* renamed from: g */
    public int m34461g() {
        return this.f31028a.f31039a.m44110d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f31028a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f31028a.f31039a.m44113h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f31028a.f31039a.m44115k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint m34462h() {
        if (this.f31036q == null) {
            this.f31036q = new Paint(2);
        }
        return this.f31036q;
    }

    /* renamed from: i */
    public int m34463i() {
        return this.f31028a.f31039a.m44114j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f31029b;
    }

    /* renamed from: j */
    public final void m34464j() {
        List list = this.f31038x;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((dg0) this.f31038x.get(i)).mo14364b(this);
            }
        }
    }

    /* renamed from: k */
    public void m34465k() {
        this.f31031d = true;
        this.f31028a.f31039a.m44107a();
    }

    /* renamed from: l */
    public final void m34466l() {
        this.f31033f = 0;
    }

    /* renamed from: m */
    public void m34467m(xuh xuhVar, Bitmap bitmap) {
        this.f31028a.f31039a.m44119o(xuhVar, bitmap);
    }

    /* renamed from: n */
    public final void m34468n() {
        bgd.m18883a(!this.f31031d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f31028a.f31039a.m44112f() == 1) {
            invalidateSelf();
        } else {
            if (this.f31029b) {
                return;
            }
            this.f31029b = true;
            this.f31028a.f31039a.m44122r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void m34469o() {
        this.f31029b = false;
        this.f31028a.f31039a.m44123s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f31035h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m34462h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m34462h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        bgd.m18883a(!this.f31031d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f31032e = z;
        if (!z) {
            m34469o();
        } else if (this.f31030c) {
            m34468n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f31030c = true;
        m34466l();
        if (this.f31032e) {
            m34468n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f31030c = false;
        m34469o();
    }

    public js7(C14647a c14647a) {
        this.f31032e = true;
        this.f31034g = -1;
        this.f31028a = (C14647a) bgd.m18886d(c14647a);
    }
}
