package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001o.w6f;

/* loaded from: classes3.dex */
public final class hde implements w6f {

    /* renamed from: a */
    public final boolean f26689a;

    /* renamed from: b */
    public final Object f26690b;

    /* renamed from: c */
    public final t6f f26691c;

    /* renamed from: d */
    public final kg2 f26692d;

    /* renamed from: e */
    public volatile /* synthetic */ int f26693e;

    /* renamed from: f */
    public volatile /* synthetic */ int f26694f;

    /* renamed from: g */
    public volatile /* synthetic */ Object f26695g;

    /* renamed from: h */
    public volatile /* synthetic */ long f26696h;

    /* renamed from: q */
    public final c71 f26697q;

    /* renamed from: s */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26686s = AtomicIntegerFieldUpdater.newUpdater(hde.class, "e");

    /* renamed from: x */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26687x = AtomicIntegerFieldUpdater.newUpdater(hde.class, "f");

    /* renamed from: y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26688y = AtomicReferenceFieldUpdater.newUpdater(hde.class, Object.class, "g");

    /* renamed from: H */
    public static final /* synthetic */ AtomicLongFieldUpdater f26685H = AtomicLongFieldUpdater.newUpdater(hde.class, "h");

    /* renamed from: o.hde$a */
    public static final class C13919a extends o64 {

        /* renamed from: a */
        public Object f26698a;

        /* renamed from: b */
        public int f26699b;

        /* renamed from: c */
        public /* synthetic */ Object f26700c;

        /* renamed from: e */
        public int f26702e;

        public C13919a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26700c = obj;
            this.f26702e |= Integer.MIN_VALUE;
            return hde.this.m30274o(0, this);
        }
    }

    /* renamed from: o.hde$b */
    public static final class C13920b extends o64 {

        /* renamed from: a */
        public Object f26703a;

        /* renamed from: b */
        public int f26704b;

        /* renamed from: c */
        public /* synthetic */ Object f26705c;

        /* renamed from: e */
        public int f26707e;

        public C13920b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26705c = obj;
            this.f26707e |= Integer.MIN_VALUE;
            return hde.this.m30275s(0, this);
        }
    }

    /* renamed from: o.hde$c */
    public static final class C13921c extends o64 {

        /* renamed from: a */
        public Object f26708a;

        /* renamed from: b */
        public /* synthetic */ Object f26709b;

        /* renamed from: d */
        public int f26711d;

        public C13921c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26709b = obj;
            this.f26711d |= Integer.MIN_VALUE;
            return hde.this.m30276u(this);
        }
    }

    /* renamed from: o.hde$d */
    public static final class C13922d extends o64 {

        /* renamed from: a */
        public Object f26712a;

        /* renamed from: b */
        public Object f26713b;

        /* renamed from: c */
        public Object f26714c;

        /* renamed from: d */
        public long f26715d;

        /* renamed from: e */
        public /* synthetic */ Object f26716e;

        /* renamed from: g */
        public int f26718g;

        public C13922d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26716e = obj;
            this.f26718g |= Integer.MIN_VALUE;
            return hde.this.read(null, 0L, this);
        }
    }

    /* renamed from: o.hde$e */
    public static final class C13923e extends o64 {

        /* renamed from: a */
        public Object f26719a;

        /* renamed from: b */
        public Object f26720b;

        /* renamed from: c */
        public Object f26721c;

        /* renamed from: d */
        public Object f26722d;

        /* renamed from: e */
        public /* synthetic */ Object f26723e;

        /* renamed from: g */
        public int f26725g;

        public C13923e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26723e = obj;
            this.f26725g |= Integer.MIN_VALUE;
            return hde.this.Y0(null, 0L, this);
        }
    }

    public hde(boolean z, int i) {
        this.f26689a = z;
        this.f26690b = new Object();
        this.f26691c = new t6f();
        this.f26692d = new kg2(i);
        this.f26693e = 0;
        this.f26694f = 0;
        this.f26695g = null;
        this.f26696h = 0L;
        this.f26697q = new c71();
    }

    /* renamed from: r */
    public static final boolean m30265r(hde hdeVar, int i) {
        return hdeVar.getAvailableForRead() < i && !hdeVar.isClosedForRead();
    }

    /* renamed from: t */
    public static final boolean m30266t(hde hdeVar, int i) {
        return hdeVar.m30270J() < i && !hdeVar.isClosedForWrite();
    }

    /* renamed from: C */
    public final void m30267C() throws Throwable {
        if (isClosedForWrite()) {
            Throwable closedCause = getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            throw new bc3("Channel " + this + " is already closed");
        }
    }

    /* renamed from: D */
    public final void m30268D() throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    /* renamed from: H */
    public boolean m30269H() {
        return this.f26689a;
    }

    /* renamed from: J */
    public int m30270J() {
        return this.f26692d.f32167c;
    }

    /* renamed from: K */
    public final boolean m30271K() {
        if (this.f26692d.f32168d == 0) {
            this.f26697q.m20359c();
            return false;
        }
        this.f26692d.m35643c();
        this.f26697q.m20359c();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #1 {all -> 0x0045, blocks: (B:12:0x0041, B:25:0x006d, B:27:0x0075, B:29:0x007b, B:46:0x00c9, B:47:0x00d4), top: B:54:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008c -> B:33:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0097 -> B:56:0x009b). Please report as a decompilation issue!!! */
    @Override // p001o.a7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Y0(t6f t6fVar, long j, n64 n64Var) throws Throwable {
        C13923e c13923e;
        hde hdeVar;
        fge fgeVar;
        t6f t6fVar2;
        hde hdeVar2;
        Object obj;
        C13923e c13923e2;
        fge fgeVar2;
        hde hdeVar3;
        if (n64Var instanceof C13923e) {
            c13923e = (C13923e) n64Var;
            int i = c13923e.f26725g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13923e.f26725g = i - Integer.MIN_VALUE;
                hdeVar = this;
            } else {
                hdeVar = this;
                c13923e = hdeVar.new C13923e(n64Var);
            }
        }
        Object obj2 = c13923e.f26723e;
        Object objM51918f = uq8.m51918f();
        int i2 = c13923e.f26725g;
        if (i2 == 0) {
            wre.m54934b(obj2);
            m30267C();
            if (j == 0) {
                return y3i.f54824a;
            }
            fgeVar = new fge();
            fgeVar.f23302a = j;
            t6fVar2 = t6fVar;
            hdeVar2 = hdeVar;
            if (fgeVar.f23302a <= 0) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hdeVar2 = (hde) c13923e.f26722d;
            fge fgeVar3 = (fge) c13923e.f26721c;
            t6f t6fVar3 = (t6f) c13923e.f26720b;
            hde hdeVar4 = (hde) c13923e.f26719a;
            try {
                wre.m54934b(obj2);
                hdeVar3 = hdeVar2;
                hdeVar2 = hdeVar4;
                C13923e c13923e3 = c13923e;
                fgeVar2 = fgeVar3;
                t6fVar2 = t6fVar3;
                obj = objM51918f;
                c13923e2 = c13923e3;
            } catch (Throwable th) {
                th = th;
                f26687x.compareAndSet(hdeVar2, 1, 0);
                throw th;
            }
            try {
                long jMin = Math.min(hdeVar2.m30270J(), fgeVar2.f23302a);
                synchronized (hdeVar2.f26690b) {
                    hdeVar2.f26691c.N1(t6fVar2, jMin);
                    y3i y3iVar = y3i.f54824a;
                }
                fgeVar2.f23302a -= jMin;
                hdeVar3.m30273k((int) jMin);
                f26687x.compareAndSet(hdeVar3, 1, 0);
                fgeVar = fgeVar2;
                c13923e = c13923e2;
                objM51918f = obj;
                if (fgeVar.f23302a <= 0) {
                    return y3i.f54824a;
                }
                if (!f26687x.compareAndSet(hdeVar2, 0, 1)) {
                    throw new IllegalStateException("Write operation already in progress".toString());
                }
                if (hdeVar2.m30270J() == 0) {
                    c13923e.f26719a = hdeVar2;
                    c13923e.f26720b = t6fVar2;
                    c13923e.f26721c = fgeVar;
                    c13923e.f26722d = hdeVar2;
                    c13923e.f26725g = 1;
                    if (hdeVar2.m30276u(c13923e) == objM51918f) {
                        return objM51918f;
                    }
                    t6fVar3 = t6fVar2;
                    hdeVar4 = hdeVar2;
                    fgeVar3 = fgeVar;
                    hdeVar3 = hdeVar2;
                    hdeVar2 = hdeVar4;
                    C13923e c13923e32 = c13923e;
                    fgeVar2 = fgeVar3;
                    t6fVar2 = t6fVar3;
                    obj = objM51918f;
                    c13923e2 = c13923e32;
                    long jMin2 = Math.min(hdeVar2.m30270J(), fgeVar2.f23302a);
                    synchronized (hdeVar2.f26690b) {
                    }
                } else {
                    obj = objM51918f;
                    c13923e2 = c13923e;
                    fgeVar2 = fgeVar;
                    hdeVar3 = hdeVar2;
                    long jMin22 = Math.min(hdeVar2.m30270J(), fgeVar2.f23302a);
                    synchronized (hdeVar2.f26690b) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                hdeVar2 = hdeVar3;
                f26687x.compareAndSet(hdeVar2, 1, 0);
                throw th;
            }
        }
    }

    @Override // p001o.y6f
    public boolean cancel(Throwable th) {
        if (isClosedForWrite()) {
            return false;
        }
        if (th == null) {
            th = new CancellationException("Channel cancelled");
        }
        return mo16561q(th);
    }

    @Override // p001o.w6f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w6f.C17785a.m54005a(this);
    }

    public void flush() {
        m30271K();
    }

    @Override // p001o.y6f
    public int getAvailableForRead() {
        return this.f26692d.f32166b;
    }

    @Override // p001o.y6f
    public Throwable getClosedCause() {
        ac3 ac3Var = (ac3) this.f26695g;
        if (ac3Var != null) {
            return ac3Var.m16847a();
        }
        return null;
    }

    /* renamed from: h */
    public final void m30272h(int i) {
        this.f26692d.m35641a(i);
        this.f26697q.m20359c();
    }

    @Override // p001o.y6f
    public boolean isClosedForRead() {
        return getClosedCause() != null || (isClosedForWrite() && getAvailableForRead() == 0);
    }

    @Override // p001o.y6f
    public boolean isClosedForWrite() {
        return this.f26695g != null;
    }

    /* renamed from: k */
    public final void m30273k(int i) {
        this.f26692d.m35642b(i);
        f26685H.getAndAdd(this, i);
        if (m30269H() || m30270J() == 0) {
            flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30274o(final int i, n64 n64Var) {
        C13919a c13919a;
        final hde hdeVar;
        if (n64Var instanceof C13919a) {
            c13919a = (C13919a) n64Var;
            int i2 = c13919a.f26702e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13919a.f26702e = i2 - Integer.MIN_VALUE;
            } else {
                c13919a = new C13919a(n64Var);
            }
        }
        Object obj = c13919a.f26700c;
        Object objM51918f = uq8.m51918f();
        int i3 = c13919a.f26702e;
        if (i3 == 0) {
            wre.m54934b(obj);
            hdeVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c13919a.f26699b;
            hdeVar = (hde) c13919a.f26698a;
            wre.m54934b(obj);
        }
        while (hdeVar.getAvailableForRead() < i && !hdeVar.isClosedForRead()) {
            c71 c71Var = hdeVar.f26697q;
            uk7 uk7Var = new uk7() { // from class: o.gde
                @Override // p001o.uk7
                public final Object invoke() {
                    return Boolean.valueOf(hde.m30265r(this.f25024a, i));
                }
            };
            c13919a.f26698a = hdeVar;
            c13919a.f26699b = i;
            c13919a.f26702e = 1;
            if (c71Var.m20360d(uk7Var, c13919a) == objM51918f) {
                return objM51918f;
            }
        }
        return y3i.f54824a;
    }

    @Override // p001o.a7f
    /* renamed from: q */
    public boolean mo16561q(Throwable th) {
        if (isClosedForWrite()) {
            return false;
        }
        if (!j9.m33417a(f26688y, this, null, th == null ? ide.f28498a : new ac3(th))) {
            return false;
        }
        if (th == null) {
            flush();
            return true;
        }
        this.f26697q.m20358b(th);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #2 {all -> 0x009f, blocks: (B:38:0x008c, B:40:0x0095, B:46:0x00a4, B:47:0x00af, B:49:0x00b7, B:52:0x00bc, B:56:0x00cb, B:57:0x00cc, B:48:0x00b0), top: B:69:0x008c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.y6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object read(t6f t6fVar, long j, n64 n64Var) throws Throwable {
        C13922d c13922d;
        hde hdeVar;
        hde hdeVar2;
        hde hdeVar3;
        if (n64Var instanceof C13922d) {
            c13922d = (C13922d) n64Var;
            int i = c13922d.f26718g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13922d.f26718g = i - Integer.MIN_VALUE;
            } else {
                c13922d = new C13922d(n64Var);
            }
        }
        Object obj = c13922d.f26716e;
        Object objM51918f = uq8.m51918f();
        int i2 = c13922d.f26718g;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("Read limit must be >= 0, was " + j).toString());
            }
            m30268D();
            if (isClosedForRead()) {
                return ml1.m39305e(-1L);
            }
            if (j == 0) {
                return ml1.m39305e(0L);
            }
            try {
                if (!f26686s.compareAndSet(this, 0, 1)) {
                    throw new IllegalStateException("Read operation already in progress".toString());
                }
                if (getAvailableForRead() == 0) {
                    c13922d.f26712a = this;
                    c13922d.f26713b = t6fVar;
                    c13922d.f26714c = this;
                    c13922d.f26715d = j;
                    c13922d.f26718g = 1;
                    if (m30274o(1, c13922d) == objM51918f) {
                        return objM51918f;
                    }
                    hdeVar2 = this;
                    hdeVar3 = hdeVar2;
                    hdeVar3.m30268D();
                    if (hdeVar3.isClosedForRead()) {
                    }
                } else {
                    hdeVar2 = this;
                    hdeVar3 = hdeVar2;
                }
            } catch (Throwable th) {
                th = th;
                hdeVar = this;
                f26686s.compareAndSet(hdeVar, 1, 0);
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = c13922d.f26715d;
            hdeVar = (hde) c13922d.f26714c;
            t6f t6fVar2 = (t6f) c13922d.f26713b;
            hdeVar3 = (hde) c13922d.f26712a;
            try {
                wre.m54934b(obj);
                hdeVar2 = hdeVar;
                j = j2;
                t6fVar = t6fVar2;
                try {
                    hdeVar3.m30268D();
                    if (hdeVar3.isClosedForRead()) {
                        Long lM39305e = ml1.m39305e(-1L);
                        f26686s.compareAndSet(hdeVar2, 1, 0);
                        return lM39305e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    hdeVar = hdeVar2;
                    f26686s.compareAndSet(hdeVar, 1, 0);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                f26686s.compareAndSet(hdeVar, 1, 0);
                throw th;
            }
        }
        long jMin = Math.min(hdeVar3.getAvailableForRead(), j);
        synchronized (hdeVar3.f26690b) {
            t6fVar.N1(hdeVar3.f26691c, jMin);
            y3i y3iVar = y3i.f54824a;
        }
        if (jMin >= 0) {
            hdeVar2.m30272h((int) jMin);
        }
        f26686s.compareAndSet(hdeVar2, 1, 0);
        return ml1.m39305e(jMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30275s(final int i, n64 n64Var) {
        C13920b c13920b;
        final hde hdeVar;
        if (n64Var instanceof C13920b) {
            c13920b = (C13920b) n64Var;
            int i2 = c13920b.f26707e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13920b.f26707e = i2 - Integer.MIN_VALUE;
            } else {
                c13920b = new C13920b(n64Var);
            }
        }
        Object obj = c13920b.f26705c;
        Object objM51918f = uq8.m51918f();
        int i3 = c13920b.f26707e;
        if (i3 == 0) {
            wre.m54934b(obj);
            hdeVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c13920b.f26704b;
            hdeVar = (hde) c13920b.f26703a;
            wre.m54934b(obj);
        }
        while (hdeVar.m30270J() < i && !hdeVar.isClosedForWrite()) {
            if (!hdeVar.m30271K()) {
                c71 c71Var = hdeVar.f26697q;
                uk7 uk7Var = new uk7() { // from class: o.fde
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return Boolean.valueOf(hde.m30266t(this.f23160a, i));
                    }
                };
                c13920b.f26703a = hdeVar;
                c13920b.f26704b = i;
                c13920b.f26707e = 1;
                if (c71Var.m20360d(uk7Var, c13920b) == objM51918f) {
                    return objM51918f;
                }
            }
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30276u(n64 n64Var) throws Throwable {
        C13921c c13921c;
        hde hdeVar;
        if (n64Var instanceof C13921c) {
            c13921c = (C13921c) n64Var;
            int i = c13921c.f26711d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13921c.f26711d = i - Integer.MIN_VALUE;
            } else {
                c13921c = new C13921c(n64Var);
            }
        }
        Object obj = c13921c.f26709b;
        Object objM51918f = uq8.m51918f();
        int i2 = c13921c.f26711d;
        if (i2 == 0) {
            wre.m54934b(obj);
            flush();
            c13921c.f26708a = this;
            c13921c.f26711d = 1;
            if (m30275s(1, c13921c) == objM51918f) {
                return objM51918f;
            }
            hdeVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hdeVar = (hde) c13921c.f26708a;
            wre.m54934b(obj);
        }
        hdeVar.m30267C();
        return y3i.f54824a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hde(byte[] bArr, int i, int i2) {
        this(true, i2);
        sq8.m48649h(bArr, FirebaseAnalytics.Param.CONTENT);
        if (i2 <= m30270J()) {
            this.f26691c.write(bArr, i, i2);
            m30273k(i2);
            close();
            return;
        }
        throw new IllegalArgumentException("Initial contents overflow maximum channel capacity".toString());
    }
}
