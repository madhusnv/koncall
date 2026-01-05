package i0;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i2 implements Runnable {

    /* renamed from: h */
    public static final Object f16491h = new Object();

    /* renamed from: a */
    public final Executor f16492a;

    /* renamed from: b */
    public final m1 f16493b;

    /* renamed from: d */
    public final AtomicReference f16495d;

    /* renamed from: c */
    public final AtomicBoolean f16494c = new AtomicBoolean(true);

    /* renamed from: e */
    public Object f16496e = f16491h;

    /* renamed from: f */
    public int f16497f = -1;

    /* renamed from: g */
    public boolean f16498g = false;

    public i2(AtomicReference atomicReference, Executor executor, m1 m1Var) {
        this.f16495d = atomicReference;
        this.f16492a = executor;
        this.f16493b = m1Var;
    }

    /* renamed from: a */
    public final void m7348a(int i10) {
        synchronized (this) {
            try {
                if (this.f16494c.get()) {
                    if (i10 <= this.f16497f) {
                        return;
                    }
                    this.f16497f = i10;
                    if (this.f16498g) {
                        return;
                    }
                    this.f16498g = true;
                    try {
                        this.f16492a.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.f16498g = false;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f16494c.get()) {
                    this.f16498g = false;
                    return;
                }
                Object obj = this.f16495d.get();
                int i10 = this.f16497f;
                while (true) {
                    if (!Objects.equals(this.f16496e, obj)) {
                        this.f16496e = obj;
                        if (obj instanceof AbstractC3081l) {
                            this.f16493b.onError(null);
                        } else {
                            this.f16493b.mo88q(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i10 == this.f16497f || !this.f16494c.get()) {
                                break;
                            }
                            obj = this.f16495d.get();
                            i10 = this.f16497f;
                        } finally {
                        }
                    }
                }
                this.f16498g = false;
            } finally {
            }
        }
    }
}
