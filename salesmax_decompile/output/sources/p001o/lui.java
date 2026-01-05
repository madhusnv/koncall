package p001o;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class lui {

    /* renamed from: a */
    public final w17 f34380a = new w17();

    /* renamed from: b */
    public final C15155b f34381b;

    /* renamed from: c */
    public final ChoreographerFrameCallbackC15156c f34382c;

    /* renamed from: d */
    public boolean f34383d;

    /* renamed from: e */
    public Surface f34384e;

    /* renamed from: f */
    public float f34385f;

    /* renamed from: g */
    public float f34386g;

    /* renamed from: h */
    public float f34387h;

    /* renamed from: i */
    public float f34388i;

    /* renamed from: j */
    public int f34389j;

    /* renamed from: k */
    public long f34390k;

    /* renamed from: l */
    public long f34391l;

    /* renamed from: m */
    public long f34392m;

    /* renamed from: n */
    public long f34393n;

    /* renamed from: o */
    public long f34394o;

    /* renamed from: p */
    public long f34395p;

    /* renamed from: q */
    public long f34396q;

    /* renamed from: o.lui$a */
    public static final class C15154a {
        /* renamed from: a */
        public static void m37917a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                ria.m46820d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* renamed from: o.lui$b */
    public final class C15155b implements DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f34397a;

        public C15155b(DisplayManager displayManager) {
            this.f34397a = displayManager;
        }

        /* renamed from: a */
        public final Display m37918a() {
            return this.f34397a.getDisplay(0);
        }

        /* renamed from: b */
        public void m37919b() {
            this.f34397a.registerDisplayListener(this, sqi.m48747z());
            lui.this.m37914p(m37918a());
        }

        /* renamed from: c */
        public void m37920c() {
            this.f34397a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                lui.this.m37914p(m37918a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: o.lui$c */
    public static final class ChoreographerFrameCallbackC15156c implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        public static final ChoreographerFrameCallbackC15156c f34399f = new ChoreographerFrameCallbackC15156c();

        /* renamed from: a */
        public volatile long f34400a = -9223372036854775807L;

        /* renamed from: b */
        public final Handler f34401b;

        /* renamed from: c */
        public final HandlerThread f34402c;

        /* renamed from: d */
        public Choreographer f34403d;

        /* renamed from: e */
        public int f34404e;

        public ChoreographerFrameCallbackC15156c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f34402c = handlerThread;
            handlerThread.start();
            Handler handlerM48746y = sqi.m48746y(handlerThread.getLooper(), this);
            this.f34401b = handlerM48746y;
            handlerM48746y.sendEmptyMessage(1);
        }

        /* renamed from: d */
        public static ChoreographerFrameCallbackC15156c m37921d() {
            return f34399f;
        }

        /* renamed from: a */
        public void m37922a() {
            this.f34401b.sendEmptyMessage(2);
        }

        /* renamed from: b */
        public final void m37923b() {
            Choreographer choreographer = this.f34403d;
            if (choreographer != null) {
                int i = this.f34404e + 1;
                this.f34404e = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* renamed from: c */
        public final void m37924c() {
            try {
                this.f34403d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                ria.m46825i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f34400a = j;
            ((Choreographer) op0.m42515e(this.f34403d)).postFrameCallbackDelayed(this, 500L);
        }

        /* renamed from: e */
        public void m37925e() {
            this.f34401b.sendEmptyMessage(3);
        }

        /* renamed from: f */
        public final void m37926f() {
            Choreographer choreographer = this.f34403d;
            if (choreographer != null) {
                int i = this.f34404e - 1;
                this.f34404e = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f34400a = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                m37924c();
                return true;
            }
            if (i == 2) {
                m37923b();
                return true;
            }
            if (i != 3) {
                return false;
            }
            m37926f();
            return true;
        }
    }

    public lui(Context context) {
        C15155b c15155bM37904f = m37904f(context);
        this.f34381b = c15155bM37904f;
        this.f34382c = c15155bM37904f != null ? ChoreographerFrameCallbackC15156c.m37921d() : null;
        this.f34390k = -9223372036854775807L;
        this.f34391l = -9223372036854775807L;
        this.f34385f = -1.0f;
        this.f34388i = 1.0f;
        this.f34389j = 0;
    }

    /* renamed from: c */
    public static boolean m37900c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    /* renamed from: e */
    public static long m37901e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* renamed from: b */
    public long m37902b(long j) {
        long j2;
        if (this.f34395p == -1 || !this.f34380a.m53783e()) {
            j2 = j;
        } else {
            long jM53779a = this.f34396q + ((long) ((this.f34380a.m53779a() * (this.f34392m - this.f34395p)) / this.f34388i));
            if (m37900c(j, jM53779a)) {
                j2 = jM53779a;
            } else {
                m37912n();
                j2 = j;
            }
        }
        this.f34393n = this.f34392m;
        this.f34394o = j2;
        ChoreographerFrameCallbackC15156c choreographerFrameCallbackC15156c = this.f34382c;
        if (choreographerFrameCallbackC15156c == null || this.f34390k == -9223372036854775807L) {
            return j2;
        }
        long j3 = choreographerFrameCallbackC15156c.f34400a;
        return j3 == -9223372036854775807L ? j2 : m37901e(j2, j3, this.f34390k) - this.f34391l;
    }

    /* renamed from: d */
    public final void m37903d() {
        Surface surface;
        if (sqi.f45790a < 30 || (surface = this.f34384e) == null || this.f34389j == Integer.MIN_VALUE || this.f34387h == 0.0f) {
            return;
        }
        this.f34387h = 0.0f;
        C15154a.m37917a(surface, 0.0f);
    }

    /* renamed from: f */
    public final C15155b m37904f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) == null) {
            return null;
        }
        return new C15155b(displayManager);
    }

    /* renamed from: g */
    public void m37905g(float f) {
        this.f34385f = f;
        this.f34380a.m53785g();
        m37915q();
    }

    /* renamed from: h */
    public void m37906h(long j) {
        long j2 = this.f34393n;
        if (j2 != -1) {
            this.f34395p = j2;
            this.f34396q = this.f34394o;
        }
        this.f34392m++;
        this.f34380a.m53784f(j * 1000);
        m37915q();
    }

    /* renamed from: i */
    public void m37907i(float f) {
        this.f34388i = f;
        m37912n();
        m37916r(false);
    }

    /* renamed from: j */
    public void m37908j() {
        m37912n();
    }

    /* renamed from: k */
    public void m37909k() {
        this.f34383d = true;
        m37912n();
        if (this.f34381b != null) {
            ((ChoreographerFrameCallbackC15156c) op0.m42515e(this.f34382c)).m37922a();
            this.f34381b.m37919b();
        }
        m37916r(false);
    }

    /* renamed from: l */
    public void m37910l() {
        this.f34383d = false;
        C15155b c15155b = this.f34381b;
        if (c15155b != null) {
            c15155b.m37920c();
            ((ChoreographerFrameCallbackC15156c) op0.m42515e(this.f34382c)).m37925e();
        }
        m37903d();
    }

    /* renamed from: m */
    public void m37911m(Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f34384e == surface) {
            return;
        }
        m37903d();
        this.f34384e = surface;
        m37916r(true);
    }

    /* renamed from: n */
    public final void m37912n() {
        this.f34392m = 0L;
        this.f34395p = -1L;
        this.f34393n = -1L;
    }

    /* renamed from: o */
    public void m37913o(int i) {
        if (this.f34389j == i) {
            return;
        }
        this.f34389j = i;
        m37916r(true);
    }

    /* renamed from: p */
    public final void m37914p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f34390k = refreshRate;
            this.f34391l = (refreshRate * 80) / 100;
        } else {
            ria.m46824h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f34390k = -9223372036854775807L;
            this.f34391l = -9223372036854775807L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m37915q() {
        if (sqi.f45790a < 30 || this.f34384e == null) {
            return;
        }
        float fM53780b = this.f34380a.m53783e() ? this.f34380a.m53780b() : this.f34385f;
        float f = this.f34386g;
        if (fM53780b == f) {
            return;
        }
        boolean z = true;
        if (fM53780b != -1.0f && f != -1.0f) {
            if (Math.abs(fM53780b - this.f34386g) < (this.f34380a.m53783e() && (this.f34380a.m53782d() > 5000000000L ? 1 : (this.f34380a.m53782d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) {
            }
        } else if (fM53780b == -1.0f && this.f34380a.m53781c() < 30) {
            z = false;
        }
        if (z) {
            this.f34386g = fM53780b;
            m37916r(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m37916r(boolean z) {
        Surface surface;
        float f;
        if (sqi.f45790a < 30 || (surface = this.f34384e) == null || this.f34389j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f34383d) {
            float f2 = this.f34386g;
            f = f2 != -1.0f ? f2 * this.f34388i : 0.0f;
        }
        if (z || this.f34387h != f) {
            this.f34387h = f;
            C15154a.m37917a(surface, f);
        }
    }
}
