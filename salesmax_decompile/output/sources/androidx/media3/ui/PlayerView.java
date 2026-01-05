package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import p001o.a8e;
import p001o.aae;
import p001o.bvi;
import p001o.c64;
import p001o.euh;
import p001o.h9e;
import p001o.hd4;
import p001o.jj6;
import p001o.lmh;
import p001o.mad;
import p001o.n6e;
import p001o.nbd;
import p001o.nf8;
import p001o.op0;
import p001o.q7e;
import p001o.qv;
import p001o.rbe;
import p001o.sqi;

/* loaded from: classes2.dex */
public class PlayerView extends FrameLayout {

    /* renamed from: H */
    public final FrameLayout f8832H;

    /* renamed from: L */
    public final FrameLayout f8833L;

    /* renamed from: M */
    public final Handler f8834M;

    /* renamed from: Q */
    public final Class f8835Q;

    /* renamed from: a */
    public final ViewOnLayoutChangeListenerC2287c f8836a;

    /* renamed from: b */
    public final AspectRatioFrameLayout f8837b;

    /* renamed from: c */
    public final View f8838c;

    /* renamed from: d */
    public final View f8839d;

    /* renamed from: e */
    public final boolean f8840e;

    /* renamed from: f */
    public final C2290f f8841f;

    /* renamed from: g */
    public final ImageView f8842g;

    /* renamed from: h */
    public final ImageView f8843h;
    public final Method h0;
    public final Object i0;
    public mad j0;
    public boolean k0;
    public PlayerControlView.InterfaceC2284m l0;
    public int m0;
    public int n0;
    public Drawable o0;
    public int p0;

    /* renamed from: q */
    public final SubtitleView f8844q;
    public boolean q0;
    public CharSequence r0;

    /* renamed from: s */
    public final View f8845s;
    public int s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public int w0;

    /* renamed from: x */
    public final TextView f8846x;

    /* renamed from: y */
    public final PlayerControlView f8847y;

    /* renamed from: androidx.media3.ui.PlayerView$b */
    public static class C2286b {
        /* renamed from: a */
        public static void m7822a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    /* renamed from: androidx.media3.ui.PlayerView$c */
    public final class ViewOnLayoutChangeListenerC2287c implements mad.InterfaceC15266d, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.InterfaceC2284m, PlayerControlView.InterfaceC2275d {

        /* renamed from: a */
        public final lmh.C15105b f8848a = new lmh.C15105b();

        /* renamed from: b */
        public Object f8849b;

        public ViewOnLayoutChangeListenerC2287c() {
        }

        @Override // p001o.mad.InterfaceC15266d
        /* renamed from: D */
        public void mo7823D(euh euhVar) {
            mad madVar = (mad) op0.m42515e(PlayerView.this.j0);
            lmh lmhVarMo7112A = madVar.mo31989x(17) ? madVar.mo7112A() : lmh.f34048a;
            if (lmhVarMo7112A.m37477q()) {
                this.f8849b = null;
            } else if (!madVar.mo31989x(30) || madVar.mo7145t().m25628b()) {
                Object obj = this.f8849b;
                if (obj != null) {
                    int iMo6949b = lmhVarMo7112A.mo6949b(obj);
                    if (iMo6949b != -1) {
                        if (madVar.mo7128W() == lmhVarMo7112A.m37473f(iMo6949b, this.f8848a).f34059c) {
                            return;
                        }
                    }
                    this.f8849b = null;
                }
            } else {
                this.f8849b = lmhVarMo7112A.mo6950g(madVar.mo7122N(), this.f8848a, true).f34058b;
            }
            PlayerView.this.f0(false);
        }

        @Override // androidx.media3.ui.PlayerControlView.InterfaceC2284m
        /* renamed from: E */
        public void mo7769E(int i) {
            PlayerView.this.c0();
            PlayerView.m7790p(PlayerView.this);
        }

        @Override // p001o.mad.InterfaceC15266d
        /* renamed from: F */
        public void mo734F(int i) {
            PlayerView.this.b0();
            PlayerView.this.e0();
            PlayerView.this.d0();
        }

        @Override // androidx.media3.ui.PlayerControlView.InterfaceC2275d
        /* renamed from: G */
        public void mo7743G(boolean z) {
            PlayerView.m7791q(PlayerView.this);
        }

        @Override // p001o.mad.InterfaceC15266d
        /* renamed from: J */
        public void mo7824J(mad.C15267e c15267e, mad.C15267e c15267e2, int i) {
            if (PlayerView.this.m7810M() && PlayerView.this.u0) {
                PlayerView.this.m7806I();
            }
        }

        @Override // p001o.mad.InterfaceC15266d
        /* renamed from: S */
        public void mo7825S() {
            if (PlayerView.this.f8838c != null) {
                PlayerView.this.f8838c.setVisibility(4);
                if (PlayerView.this.m7802E()) {
                    PlayerView.this.m7807J();
                } else {
                    PlayerView.this.m7804G();
                }
            }
        }

        @Override // p001o.mad.InterfaceC15266d
        /* renamed from: V */
        public void mo7826V(int i, int i2) {
            if (sqi.f45790a == 34 && (PlayerView.this.f8839d instanceof SurfaceView)) {
                C2290f c2290f = (C2290f) op0.m42515e(PlayerView.this.f8841f);
                Handler handler = PlayerView.this.f8834M;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.f8839d;
                final PlayerView playerView = PlayerView.this;
                c2290f.m7834f(handler, surfaceView, new Runnable() { // from class: o.mbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        playerView.invalidate();
                    }
                });
            }
        }

        @Override // p001o.mad.InterfaceC15266d
        /* renamed from: c */
        public void mo7827c(bvi bviVar) {
            if (bviVar.equals(bvi.f16878e) || PlayerView.this.j0 == null || PlayerView.this.j0.mo7134c() == 1) {
                return;
            }
            PlayerView.this.a0();
        }

        @Override // p001o.mad.InterfaceC15266d
        public void o0(boolean z, int i) {
            PlayerView.this.b0();
            PlayerView.this.d0();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.m7820Z();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m7799y((TextureView) view, PlayerView.this.w0);
        }

        @Override // p001o.mad.InterfaceC15266d
        /* renamed from: u */
        public void mo7828u(hd4 hd4Var) {
            if (PlayerView.this.f8844q != null) {
                PlayerView.this.f8844q.setCues(hd4Var.f26674a);
            }
        }
    }

    /* renamed from: androidx.media3.ui.PlayerView$d */
    public interface InterfaceC2288d {
    }

    /* renamed from: androidx.media3.ui.PlayerView$e */
    public interface InterfaceC2289e {
    }

    /* renamed from: androidx.media3.ui.PlayerView$f */
    public static final class C2290f {

        /* renamed from: a */
        public SurfaceSyncGroup f8851a;

        public C2290f() {
        }

        /* renamed from: c */
        public static /* synthetic */ void m7831c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m7832d(SurfaceView surfaceView, Runnable runnable) {
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            this.f8851a = surfaceSyncGroup;
            op0.m42517g(surfaceSyncGroup.add(rootSurfaceControl, new Runnable() { // from class: o.rbd
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.C2290f.m7831c();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(nbd.m40289a());
        }

        /* renamed from: e */
        public void m7833e() {
            SurfaceSyncGroup surfaceSyncGroup = this.f8851a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f8851a = null;
            }
        }

        /* renamed from: f */
        public void m7834f(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: o.qbd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41593a.m7832d(surfaceView, runnable);
                }
            });
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    /* renamed from: B */
    public static void m7770B(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(sqi.m48719X(context, resources, q7e.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(n6e.exo_edit_mode_background_color));
    }

    /* renamed from: C */
    public static void m7771C(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(sqi.m48719X(context, resources, q7e.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(n6e.exo_edit_mode_background_color, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ Object m7772N(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        m7813R((Bitmap) objArr[1]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m7773O(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        if (m7803F()) {
            return;
        }
        m7819Y();
        m7800A();
    }

    /* renamed from: U */
    public static void m7774U(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* renamed from: p */
    public static /* synthetic */ InterfaceC2288d m7790p(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    /* renamed from: q */
    public static /* synthetic */ InterfaceC2289e m7791q(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f8842g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        g0();
    }

    private void setImageOutput(mad madVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f8835Q;
        if (cls == null || !cls.isAssignableFrom(madVar.getClass())) {
            return;
        }
        try {
            ((Method) op0.m42515e(this.h0)).invoke(madVar, op0.m42515e(this.i0));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: y */
    public static void m7799y(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: A */
    public final void m7800A() {
        View view = this.f8838c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: D */
    public boolean m7801D(KeyEvent keyEvent) {
        return i0() && this.f8847y.m7732U(keyEvent);
    }

    /* renamed from: E */
    public final boolean m7802E() {
        mad madVar = this.j0;
        return madVar != null && this.i0 != null && madVar.mo31989x(30) && madVar.mo7145t().m25629c(4);
    }

    /* renamed from: F */
    public final boolean m7803F() {
        mad madVar = this.j0;
        return madVar != null && madVar.mo31989x(30) && madVar.mo7145t().m25629c(2);
    }

    /* renamed from: G */
    public final void m7804G() {
        m7807J();
        ImageView imageView = this.f8842g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    /* renamed from: H */
    public final void m7805H() {
        ImageView imageView = this.f8843h;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f8843h.setVisibility(4);
        }
    }

    /* renamed from: I */
    public void m7806I() {
        PlayerControlView playerControlView = this.f8847y;
        if (playerControlView != null) {
            playerControlView.m7735Y();
        }
    }

    /* renamed from: J */
    public final void m7807J() {
        ImageView imageView = this.f8842g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    /* renamed from: K */
    public final boolean m7808K(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* renamed from: L */
    public final boolean m7809L() {
        Drawable drawable;
        ImageView imageView = this.f8842g;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* renamed from: M */
    public final boolean m7810M() {
        mad madVar = this.j0;
        return madVar != null && madVar.mo31989x(16) && this.j0.mo7133b() && this.j0.mo7119J();
    }

    /* renamed from: P */
    public final void m7811P(boolean z) {
        if (!(m7810M() && this.u0) && i0()) {
            boolean z2 = this.f8847y.c0() && this.f8847y.getShowTimeoutMs() <= 0;
            boolean zM7816V = m7816V();
            if (z || z2 || zM7816V) {
                m7818X(zM7816V);
            }
        }
    }

    /* renamed from: Q */
    public void m7812Q(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* renamed from: R */
    public final void m7813R(final Bitmap bitmap) {
        this.f8834M.post(new Runnable() { // from class: o.lbd
            @Override // java.lang.Runnable
            public final void run() {
                this.f33560a.m7773O(bitmap);
            }
        });
    }

    /* renamed from: S */
    public final boolean m7814S(mad madVar) {
        byte[] bArr;
        if (madVar == null || !madVar.mo31989x(18) || (bArr = madVar.d0().f8026i) == null) {
            return false;
        }
        return m7815T(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    /* renamed from: T */
    public final boolean m7815T(Drawable drawable) {
        if (this.f8843h != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.m0 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                m7812Q(this.f8837b, width);
                this.f8843h.setScaleType(scaleType);
                this.f8843h.setImageDrawable(drawable);
                this.f8843h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    public final boolean m7816V() {
        mad madVar = this.j0;
        if (madVar == null) {
            return true;
        }
        int iMo7134c = madVar.mo7134c();
        return this.t0 && !(this.j0.mo31989x(17) && this.j0.mo7112A().m37477q()) && (iMo7134c == 1 || iMo7134c == 4 || !((mad) op0.m42515e(this.j0)).mo7119J());
    }

    /* renamed from: W */
    public void m7817W() {
        m7818X(m7816V());
    }

    /* renamed from: X */
    public final void m7818X(boolean z) {
        if (i0()) {
            this.f8847y.setShowTimeoutMs(z ? 0 : this.s0);
            this.f8847y.n0();
        }
    }

    /* renamed from: Y */
    public final void m7819Y() {
        ImageView imageView = this.f8842g;
        if (imageView != null) {
            imageView.setVisibility(0);
            g0();
        }
    }

    /* renamed from: Z */
    public final void m7820Z() {
        if (!i0() || this.j0 == null) {
            return;
        }
        if (!this.f8847y.c0()) {
            m7811P(true);
        } else if (this.v0) {
            this.f8847y.m7735Y();
        }
    }

    public final void a0() {
        mad madVar = this.j0;
        bvi bviVarMo7124P = madVar != null ? madVar.mo7124P() : bvi.f16878e;
        int i = bviVarMo7124P.f16883a;
        int i2 = bviVarMo7124P.f16884b;
        int i3 = bviVarMo7124P.f16885c;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * bviVarMo7124P.f16886d) / i2;
        View view = this.f8839d;
        if (view instanceof TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.w0 != 0) {
                view.removeOnLayoutChangeListener(this.f8836a);
            }
            this.w0 = i3;
            if (i3 != 0) {
                this.f8839d.addOnLayoutChangeListener(this.f8836a);
            }
            m7799y((TextureView) this.f8839d, this.w0);
        }
        m7812Q(this.f8837b, this.f8840e ? 0.0f : f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() {
        boolean z;
        if (this.f8845s != null) {
            mad madVar = this.j0;
            if (madVar == null || madVar.mo7134c() != 2) {
                z = false;
            } else {
                int i = this.p0;
                z = true;
                if (i != 2 && (i != 1 || !this.j0.mo7119J())) {
                }
            }
            this.f8845s.setVisibility(z ? 0 : 8);
        }
    }

    public final void c0() {
        PlayerControlView playerControlView = this.f8847y;
        if (playerControlView == null || !this.k0) {
            setContentDescription(null);
        } else if (playerControlView.c0()) {
            setContentDescription(this.v0 ? getResources().getString(aae.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(aae.exo_controls_show));
        }
    }

    public final void d0() {
        if (m7810M() && this.u0) {
            m7806I();
        } else {
            m7811P(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C2290f c2290f;
        super.dispatchDraw(canvas);
        if (sqi.f45790a != 34 || (c2290f = this.f8841f) == null) {
            return;
        }
        c2290f.m7833e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        mad madVar = this.j0;
        if (madVar != null && madVar.mo31989x(16) && this.j0.mo7133b()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zM7808K = m7808K(keyEvent.getKeyCode());
        if (zM7808K && i0() && !this.f8847y.c0()) {
            m7811P(true);
            return true;
        }
        if (m7801D(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            m7811P(true);
            return true;
        }
        if (zM7808K && i0()) {
            m7811P(true);
        }
        return false;
    }

    public final void e0() {
        TextView textView = this.f8846x;
        if (textView != null) {
            CharSequence charSequence = this.r0;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f8846x.setVisibility(0);
            } else {
                mad madVar = this.j0;
                if (madVar != null) {
                    madVar.mo7143r();
                }
                this.f8846x.setVisibility(8);
            }
        }
    }

    public final void f0(boolean z) {
        mad madVar = this.j0;
        boolean z2 = (madVar == null || !madVar.mo31989x(30) || madVar.mo7145t().m25628b()) ? false : true;
        if (!this.q0 && (!z2 || z)) {
            m7805H();
            m7800A();
            m7804G();
        }
        if (z2) {
            boolean zM7803F = m7803F();
            boolean zM7802E = m7802E();
            if (!zM7803F && !zM7802E) {
                m7800A();
                m7804G();
            }
            View view = this.f8838c;
            boolean z3 = view != null && view.getVisibility() == 4 && m7809L();
            if (zM7802E && !zM7803F && z3) {
                m7800A();
                m7819Y();
            } else if (zM7803F && !zM7802E && z3) {
                m7804G();
            }
            if (((zM7803F || zM7802E || !h0()) ? false : true) && (m7814S(madVar) || m7815T(this.o0))) {
                return;
            }
            m7805H();
        }
    }

    public final void g0() {
        Drawable drawable;
        ImageView imageView = this.f8842g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.n0 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f8842g.getVisibility() == 0) {
            m7812Q(this.f8837b, width);
        }
        this.f8842g.setScaleType(scaleType);
    }

    public List<qv> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f8833L;
        if (frameLayout != null) {
            arrayList.add(new qv.C16465a(frameLayout, 4).m45863b("Transparent overlay does not impact viewability").m45862a());
        }
        PlayerControlView playerControlView = this.f8847y;
        if (playerControlView != null) {
            arrayList.add(new qv.C16465a(playerControlView, 1).m45862a());
        }
        return nf8.m40511y(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) op0.m42520j(this.f8832H, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.m0;
    }

    public boolean getControllerAutoShow() {
        return this.t0;
    }

    public boolean getControllerHideOnTouch() {
        return this.v0;
    }

    public int getControllerShowTimeoutMs() {
        return this.s0;
    }

    public Drawable getDefaultArtwork() {
        return this.o0;
    }

    public int getImageDisplayMode() {
        return this.n0;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f8833L;
    }

    public mad getPlayer() {
        return this.j0;
    }

    public int getResizeMode() {
        op0.m42519i(this.f8837b);
        return this.f8837b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f8844q;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.m0 != 0;
    }

    public boolean getUseController() {
        return this.k0;
    }

    public View getVideoSurfaceView() {
        return this.f8839d;
    }

    public final boolean h0() {
        if (this.m0 == 0) {
            return false;
        }
        op0.m42519i(this.f8843h);
        return true;
    }

    public final boolean i0() {
        if (!this.k0) {
            return false;
        }
        op0.m42519i(this.f8847y);
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!i0() || this.j0 == null) {
            return false;
        }
        m7811P(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        m7820Z();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        op0.m42517g(i == 0 || this.f8843h != null);
        if (this.m0 != i) {
            this.m0 = i;
            f0(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.InterfaceC2266b interfaceC2266b) {
        op0.m42519i(this.f8837b);
        this.f8837b.setAspectRatioListener(interfaceC2266b);
    }

    public void setControllerAnimationEnabled(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.t0 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.u0 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        op0.m42519i(this.f8847y);
        this.v0 = z;
        c0();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(PlayerControlView.InterfaceC2275d interfaceC2275d) {
        op0.m42519i(this.f8847y);
        this.f8847y.setOnFullScreenModeChangedListener(interfaceC2275d);
    }

    public void setControllerShowTimeoutMs(int i) {
        op0.m42519i(this.f8847y);
        this.s0 = i;
        if (this.f8847y.c0()) {
            m7817W();
        }
    }

    public void setControllerVisibilityListener(InterfaceC2288d interfaceC2288d) {
        if (interfaceC2288d != null) {
            setControllerVisibilityListener((PlayerControlView.InterfaceC2284m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        op0.m42517g(this.f8846x != null);
        this.r0 = charSequence;
        e0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.o0 != drawable) {
            this.o0 = drawable;
            f0(false);
        }
    }

    public void setErrorMessageProvider(jj6 jj6Var) {
        if (jj6Var != null) {
            e0();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        op0.m42519i(this.f8847y);
        this.f8847y.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(InterfaceC2289e interfaceC2289e) {
        op0.m42519i(this.f8847y);
        this.f8847y.setOnFullScreenModeChangedListener(this.f8836a);
    }

    public void setImageDisplayMode(int i) {
        op0.m42517g(this.f8842g != null);
        if (this.n0 != i) {
            this.n0 = i;
            g0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.q0 != z) {
            this.q0 = z;
            f0(false);
        }
    }

    public void setPlayer(mad madVar) {
        op0.m42517g(Looper.myLooper() == Looper.getMainLooper());
        op0.m42511a(madVar == null || madVar.mo7114C() == Looper.getMainLooper());
        mad madVar2 = this.j0;
        if (madVar2 == madVar) {
            return;
        }
        if (madVar2 != null) {
            madVar2.mo7113B(this.f8836a);
            if (madVar2.mo31989x(27)) {
                View view = this.f8839d;
                if (view instanceof TextureView) {
                    madVar2.mo7123O((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    madVar2.mo7129X((SurfaceView) view);
                }
            }
            m7821z(madVar2);
        }
        SubtitleView subtitleView = this.f8844q;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.j0 = madVar;
        if (i0()) {
            this.f8847y.setPlayer(madVar);
        }
        b0();
        e0();
        f0(true);
        if (madVar == null) {
            m7806I();
            return;
        }
        if (madVar.mo31989x(27)) {
            View view2 = this.f8839d;
            if (view2 instanceof TextureView) {
                madVar.mo7116F((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                madVar.mo7142o((SurfaceView) view2);
            }
            if (!madVar.mo31989x(30) || madVar.mo7145t().m25630d(2)) {
                a0();
            }
        }
        if (this.f8844q != null && madVar.mo31989x(28)) {
            this.f8844q.setCues(madVar.mo7146v().f26674a);
        }
        madVar.mo7117G(this.f8836a);
        setImageOutput(madVar);
        m7811P(false);
    }

    public void setRepeatToggleModes(int i) {
        op0.m42519i(this.f8847y);
        this.f8847y.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        op0.m42519i(this.f8837b);
        this.f8837b.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.p0 != i) {
            this.p0 = i;
            b0();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        op0.m42519i(this.f8847y);
        this.f8847y.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f8838c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        op0.m42517g((z && this.f8847y == null) ? false : true);
        setClickable(z || hasOnClickListeners());
        if (this.k0 == z) {
            return;
        }
        this.k0 = z;
        if (i0()) {
            this.f8847y.setPlayer(this.j0);
        } else {
            PlayerControlView playerControlView = this.f8847y;
            if (playerControlView != null) {
                playerControlView.m7735Y();
                this.f8847y.setPlayer(null);
            }
        }
        c0();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f8839d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* renamed from: z */
    public final void m7821z(mad madVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f8835Q;
        if (cls == null || !cls.isAssignableFrom(madVar.getClass())) {
            return;
        }
        try {
            ((Method) op0.m42515e(this.h0)).invoke(madVar, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setControllerVisibilityListener(PlayerControlView.InterfaceC2284m interfaceC2284m) {
        op0.m42519i(this.f8847y);
        PlayerControlView.InterfaceC2284m interfaceC2284m2 = this.l0;
        if (interfaceC2284m2 == interfaceC2284m) {
            return;
        }
        if (interfaceC2284m2 != null) {
            this.f8847y.j0(interfaceC2284m2);
        }
        this.l0 = interfaceC2284m;
        if (interfaceC2284m != null) {
            this.f8847y.m7731S(interfaceC2284m);
            setControllerVisibilityListener((InterfaceC2288d) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException, IllegalArgumentException {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        boolean z6;
        C2285a c2285a;
        boolean z7;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i11;
        super(context, attributeSet, i);
        ViewOnLayoutChangeListenerC2287c viewOnLayoutChangeListenerC2287c = new ViewOnLayoutChangeListenerC2287c();
        this.f8836a = viewOnLayoutChangeListenerC2287c;
        this.f8834M = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f8837b = null;
            this.f8838c = null;
            this.f8839d = null;
            this.f8840e = false;
            this.f8841f = null;
            this.f8842g = null;
            this.f8843h = null;
            this.f8844q = null;
            this.f8845s = null;
            this.f8846x = null;
            this.f8847y = null;
            this.f8832H = null;
            this.f8833L = null;
            this.f8835Q = null;
            this.h0 = null;
            this.i0 = null;
            ImageView imageView = new ImageView(context);
            if (sqi.f45790a >= 23) {
                m7771C(context, getResources(), imageView);
            } else {
                m7770B(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i12 = h9e.exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rbe.PlayerView, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(rbe.PlayerView_shutter_background_color);
                int color = typedArrayObtainStyledAttributes.getColor(rbe.PlayerView_shutter_background_color, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerView_player_layout_id, i12);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerView_use_artwork, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(rbe.PlayerView_artwork_display_mode, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(rbe.PlayerView_default_artwork, 0);
                int i14 = typedArrayObtainStyledAttributes.getInt(rbe.PlayerView_image_display_mode, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerView_use_controller, true);
                int i15 = typedArrayObtainStyledAttributes.getInt(rbe.PlayerView_surface_type, 1);
                int i16 = typedArrayObtainStyledAttributes.getInt(rbe.PlayerView_resize_mode, 0);
                i2 = typedArrayObtainStyledAttributes.getInt(rbe.PlayerView_show_timeout, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerView_hide_on_touch, true);
                z6 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(rbe.PlayerView_show_buffering, 0);
                this.q0 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerView_keep_content_on_player_reset, this.q0);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(rbe.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                i6 = resourceId2;
                z2 = z10;
                z5 = z11;
                z4 = z8;
                i3 = resourceId;
                z = z9;
                z3 = zHasValue;
                i7 = i16;
                i4 = i14;
                i10 = i13;
                i9 = color;
                i8 = i15;
                i5 = integer;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = i12;
            z = true;
            z2 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 1;
            z3 = false;
            i9 = 0;
            z4 = true;
            i10 = 1;
            z5 = true;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(a8e.exo_content_frame);
        this.f8837b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            m7774U(aspectRatioFrameLayout, i7);
        }
        View viewFindViewById = findViewById(a8e.exo_shutter);
        this.f8838c = viewFindViewById;
        if (viewFindViewById != null && z3) {
            viewFindViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout != null && i8 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i8 == 2) {
                this.f8839d = new TextureView(context);
            } else if (i8 == 3) {
                try {
                    int i17 = SphericalGLSurfaceView.f8595H;
                    this.f8839d = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.f8839d.setLayoutParams(layoutParams);
                    this.f8839d.setOnClickListener(viewOnLayoutChangeListenerC2287c);
                    this.f8839d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f8839d, 0);
                    c2285a = null;
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i8 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (sqi.f45790a >= 34) {
                    C2286b.m7822a(surfaceView);
                }
                this.f8839d = surfaceView;
            } else {
                try {
                    int i18 = VideoDecoderGLSurfaceView.f8579b;
                    this.f8839d = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            z7 = false;
            this.f8839d.setLayoutParams(layoutParams);
            this.f8839d.setOnClickListener(viewOnLayoutChangeListenerC2287c);
            this.f8839d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f8839d, 0);
            c2285a = null;
        } else {
            c2285a = null;
            this.f8839d = null;
            z7 = false;
        }
        this.f8840e = z7;
        this.f8841f = sqi.f45790a == 34 ? new C2290f() : null;
        this.f8832H = (FrameLayout) findViewById(a8e.exo_ad_overlay);
        this.f8833L = (FrameLayout) findViewById(a8e.exo_overlay);
        this.f8842g = (ImageView) findViewById(a8e.exo_image);
        this.n0 = i4;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f8420a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: o.kbd
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return this.f31893a.m7772N(obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f8835Q = cls;
        this.h0 = method;
        this.i0 = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(a8e.exo_artwork);
        this.f8843h = imageView2;
        this.m0 = z4 && i10 != 0 && imageView2 != null ? i10 : 0;
        if (i6 != 0) {
            this.o0 = c64.getDrawable(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(a8e.exo_subtitles);
        this.f8844q = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(a8e.exo_buffering);
        this.f8845s = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.p0 = i5;
        TextView textView = (TextView) findViewById(a8e.exo_error_message);
        this.f8846x = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(a8e.exo_controller);
        View viewFindViewById3 = findViewById(a8e.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f8847y = playerControlView;
            i11 = 0;
        } else if (viewFindViewById3 != null) {
            i11 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f8847y = playerControlView2;
            playerControlView2.setId(a8e.exo_controller);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i11 = 0;
            this.f8847y = null;
        }
        PlayerControlView playerControlView3 = this.f8847y;
        this.s0 = playerControlView3 != null ? i2 : i11;
        this.v0 = z2;
        this.t0 = z6;
        this.u0 = z5;
        this.k0 = (!z || playerControlView3 == null) ? i11 : 1;
        if (playerControlView3 != null) {
            playerControlView3.m7736Z();
            this.f8847y.m7731S(this.f8836a);
        }
        if (z) {
            setClickable(true);
        }
        c0();
    }
}
