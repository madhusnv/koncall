package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p001o.op0;
import p001o.p26;
import p001o.ria;
import p001o.vs7;

/* loaded from: classes2.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: d */
    public static int f8569d;

    /* renamed from: e */
    public static boolean f8570e;

    /* renamed from: a */
    public final boolean f8571a;

    /* renamed from: b */
    public final HandlerThreadC2229b f8572b;

    /* renamed from: c */
    public boolean f8573c;

    /* renamed from: androidx.media3.exoplayer.video.PlaceholderSurface$b */
    public static class HandlerThreadC2229b extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        public p26 f8574a;

        /* renamed from: b */
        public Handler f8575b;

        /* renamed from: c */
        public Error f8576c;

        /* renamed from: d */
        public RuntimeException f8577d;

        /* renamed from: e */
        public PlaceholderSurface f8578e;

        public HandlerThreadC2229b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: a */
        public PlaceholderSurface m7508a(int i) {
            boolean z;
            start();
            this.f8575b = new Handler(getLooper(), this);
            this.f8574a = new p26(this.f8575b);
            synchronized (this) {
                z = false;
                this.f8575b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f8578e == null && this.f8577d == null && this.f8576c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f8577d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f8576c;
            if (error == null) {
                return (PlaceholderSurface) op0.m42515e(this.f8578e);
            }
            throw error;
        }

        /* renamed from: b */
        public final void m7509b(int i) throws vs7.C17668a {
            op0.m42515e(this.f8574a);
            this.f8574a.m42876h(i);
            this.f8578e = new PlaceholderSurface(this, this.f8574a.m42875g(), i != 0);
        }

        /* renamed from: c */
        public void m7510c() {
            op0.m42515e(this.f8575b);
            this.f8575b.sendEmptyMessage(2);
        }

        /* renamed from: d */
        public final void m7511d() {
            op0.m42515e(this.f8574a);
            this.f8574a.m42877i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        m7511d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m7509b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    ria.m46820d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f8576c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    ria.m46820d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f8577d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (vs7.C17668a e3) {
                    ria.m46820d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f8577d = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public static int m7505a(Context context) {
        if (vs7.m53376i(context)) {
            return vs7.m53377j() ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: b */
    public static synchronized boolean m7506b(Context context) {
        if (!f8570e) {
            f8569d = m7505a(context);
            f8570e = true;
        }
        return f8569d != 0;
    }

    /* renamed from: c */
    public static PlaceholderSurface m7507c(Context context, boolean z) {
        op0.m42517g(!z || m7506b(context));
        return new HandlerThreadC2229b().m7508a(z ? f8569d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f8572b) {
            if (!this.f8573c) {
                this.f8572b.m7510c();
                this.f8573c = true;
            }
        }
    }

    public PlaceholderSurface(HandlerThreadC2229b handlerThreadC2229b, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f8572b = handlerThreadC2229b;
        this.f8571a = z;
    }
}
