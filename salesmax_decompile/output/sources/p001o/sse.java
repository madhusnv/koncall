package p001o;

import p001o.ja2;
import p001o.sse;

/* loaded from: classes2.dex */
public interface sse {

    /* renamed from: a */
    public static final sse f45877a = new sse() { // from class: o.rse
        @Override // p001o.sse
        /* renamed from: e */
        public final sse.C16912c mo33437e(sse.InterfaceC16911b interfaceC16911b) {
            return sse.m48881d(interfaceC16911b);
        }
    };

    /* renamed from: b */
    public static final sse f45878b = new ja2.C14480b(m48880c());

    /* renamed from: c */
    public static final sse f45879c = new ja2(m48880c());

    /* renamed from: o.sse$a */
    public static final class C16910a {

        /* renamed from: a */
        public final sse f45880a;

        /* renamed from: b */
        public long f45881b;

        public C16910a(sse sseVar) {
            this.f45880a = sseVar;
            this.f45881b = sseVar.mo33435a();
        }

        /* renamed from: a */
        public sse m48883a() {
            sse sseVar = this.f45880a;
            return sseVar instanceof use ? ((use) sseVar).mo33436b(this.f45881b) : new smh(this.f45881b, this.f45880a);
        }
    }

    /* renamed from: o.sse$b */
    public interface InterfaceC16911b {
        /* renamed from: a */
        long mo31785a();

        Throwable getCause();

        int getStatus();
    }

    /* renamed from: o.sse$c */
    public static final class C16912c {

        /* renamed from: d */
        public static final C16912c f45882d = new C16912c(false, 0);

        /* renamed from: e */
        public static final C16912c f45883e = new C16912c(true);

        /* renamed from: f */
        public static final C16912c f45884f = new C16912c(true, 100);

        /* renamed from: g */
        public static C16912c f45885g = new C16912c(false, 0, true);

        /* renamed from: a */
        public final long f45886a;

        /* renamed from: b */
        public final boolean f45887b;

        /* renamed from: c */
        public final boolean f45888c;

        public C16912c(boolean z) {
            this(z, m48884a());
        }

        /* renamed from: a */
        public static long m48884a() {
            return 500L;
        }

        /* renamed from: b */
        public long m48885b() {
            return this.f45886a;
        }

        /* renamed from: c */
        public boolean m48886c() {
            return this.f45888c;
        }

        /* renamed from: d */
        public boolean m48887d() {
            return this.f45887b;
        }

        public C16912c(boolean z, long j) {
            this(z, j, false);
        }

        public C16912c(boolean z, long j, boolean z2) {
            this.f45887b = z;
            this.f45886a = j;
            if (z2) {
                fgd.m26658b(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f45888c = z2;
        }
    }

    /* renamed from: c */
    static long m48880c() {
        return 6000L;
    }

    /* renamed from: d */
    static /* synthetic */ C16912c m48881d(InterfaceC16911b interfaceC16911b) {
        return C16912c.f45882d;
    }

    /* renamed from: a */
    default long mo33435a() {
        return 0L;
    }

    /* renamed from: e */
    C16912c mo33437e(InterfaceC16911b interfaceC16911b);
}
