package p001o;

import android.os.Handler;
import androidx.camera.core.impl.C1896a;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import p001o.d9i;
import p001o.m92;
import p001o.mq3;
import p001o.q92;

/* loaded from: classes2.dex */
public final class fb2 implements sjg {

    /* renamed from: I */
    public static final mq3.AbstractC15402a f23066I = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.cameraFactoryProvider", q92.InterfaceC16325a.class);

    /* renamed from: J */
    public static final mq3.AbstractC15402a f23067J = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.deviceSurfaceManagerProvider", m92.InterfaceC15254a.class);

    /* renamed from: K */
    public static final mq3.AbstractC15402a f23068K = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.useCaseConfigFactoryProvider", d9i.InterfaceC12849c.class);

    /* renamed from: L */
    public static final mq3.AbstractC15402a f23069L = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: M */
    public static final mq3.AbstractC15402a f23070M = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: N */
    public static final mq3.AbstractC15402a f23071N = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: O */
    public static final mq3.AbstractC15402a f23072O = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.availableCamerasLimiter", oa2.class);

    /* renamed from: P */
    public static final mq3.AbstractC15402a f23073P = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);

    /* renamed from: Q */
    public static final mq3.AbstractC15402a f23074Q = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.cameraProviderInitRetryPolicy", sse.class);

    /* renamed from: R */
    public static final mq3.AbstractC15402a f23075R = mq3.AbstractC15402a.m39507a("camerax.core.appConfig.quirksSettings", C1896a.class);

    /* renamed from: H */
    public final tec f23076H;

    /* renamed from: o.fb2$a */
    public static final class C13379a {

        /* renamed from: a */
        public final qpb f23077a;

        public C13379a() {
            this(qpb.a0());
        }

        /* renamed from: a */
        public fb2 m26358a() {
            return new fb2(tec.m49792Y(this.f23077a));
        }

        /* renamed from: b */
        public final vob m26359b() {
            return this.f23077a;
        }

        /* renamed from: c */
        public C13379a m26360c(q92.InterfaceC16325a interfaceC16325a) {
            m26359b().mo45760N(fb2.f23066I, interfaceC16325a);
            return this;
        }

        /* renamed from: d */
        public C13379a m26361d(m92.InterfaceC15254a interfaceC15254a) {
            m26359b().mo45760N(fb2.f23067J, interfaceC15254a);
            return this;
        }

        /* renamed from: e */
        public C13379a m26362e(Class cls) {
            m26359b().mo45760N(sjg.f45490v, cls);
            if (m26359b().mo36958d(sjg.f45489u, null) == null) {
                m26363f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: f */
        public C13379a m26363f(String str) {
            m26359b().mo45760N(sjg.f45489u, str);
            return this;
        }

        /* renamed from: g */
        public C13379a m26364g(d9i.InterfaceC12849c interfaceC12849c) {
            m26359b().mo45760N(fb2.f23068K, interfaceC12849c);
            return this;
        }

        public C13379a(qpb qpbVar) {
            this.f23077a = qpbVar;
            Class cls = (Class) qpbVar.mo36958d(sjg.f45490v, null);
            if (cls == null || cls.equals(eb2.class)) {
                m26362e(eb2.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: o.fb2$b */
    public interface InterfaceC13380b {
        fb2 getCameraXConfig();
    }

    public fb2(tec tecVar) {
        this.f23076H = tecVar;
    }

    /* renamed from: W */
    public oa2 m26354W(oa2 oa2Var) {
        return (oa2) this.f23076H.mo36958d(f23072O, oa2Var);
    }

    /* renamed from: X */
    public Executor m26355X(Executor executor) {
        return (Executor) this.f23076H.mo36958d(f23069L, executor);
    }

    /* renamed from: Y */
    public q92.InterfaceC16325a m26356Y(q92.InterfaceC16325a interfaceC16325a) {
        return (q92.InterfaceC16325a) this.f23076H.mo36958d(f23066I, interfaceC16325a);
    }

    /* renamed from: Z */
    public long m26357Z() {
        return ((Long) this.f23076H.mo36958d(f23073P, -1L)).longValue();
    }

    public sse a0() {
        sse sseVar = (sse) this.f23076H.mo36958d(f23074Q, sse.f45878b);
        Objects.requireNonNull(sseVar);
        return sseVar;
    }

    public m92.InterfaceC15254a b0(m92.InterfaceC15254a interfaceC15254a) {
        return (m92.InterfaceC15254a) this.f23076H.mo36958d(f23067J, interfaceC15254a);
    }

    public C1896a c0() {
        return (C1896a) this.f23076H.mo36958d(f23075R, null);
    }

    public Handler d0(Handler handler) {
        return (Handler) this.f23076H.mo36958d(f23070M, handler);
    }

    public d9i.InterfaceC12849c e0(d9i.InterfaceC12849c interfaceC12849c) {
        return (d9i.InterfaceC12849c) this.f23076H.mo36958d(f23068K, interfaceC12849c);
    }

    @Override // p001o.lce
    public mq3 getConfig() {
        return this.f23076H;
    }
}
