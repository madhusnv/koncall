package u2;

import cp.C1475f;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k2.AbstractC3967p;
import k2.j1;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4367l;
import m2.C4640e;
import rw.AbstractC6663m;
import s1.C6725t;
import s2.AbstractC6740i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.v */
/* loaded from: classes.dex */
public final class C7325v {

    /* renamed from: a */
    public final AbstractC4155m f34925a;

    /* renamed from: c */
    public boolean f34927c;

    /* renamed from: h */
    public a1.c0 f34932h;

    /* renamed from: i */
    public C7324u f34933i;

    /* renamed from: b */
    public final AtomicReference f34926b = new AtomicReference(null);

    /* renamed from: d */
    public final C1475f f34928d = new C1475f(21, this);

    /* renamed from: e */
    public final C6725t f34929e = new C6725t(6, this);

    /* renamed from: f */
    public final C4640e f34930f = new C4640e(new C7324u[16]);

    /* renamed from: g */
    public final Object f34931g = new Object();

    /* renamed from: j */
    public long f34934j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public C7325v(InterfaceC2139c interfaceC2139c) {
        this.f34925a = (AbstractC4155m) interfaceC2139c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final boolean m13718a(C7325v c7325v) {
        boolean z6;
        Set set;
        Set set2;
        synchronized (c7325v.f34931g) {
            z6 = c7325v.f34927c;
        }
        if (z6) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            AtomicReference atomicReference = c7325v.f34926b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List listSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC3967p.m8637d("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list2 = (List) obj;
                    Set set3 = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        listSubList = list2.get(1);
                    } else if (list2.size() > 2) {
                        listSubList = list2.subList(1, list2.size());
                    }
                    set2 = set3;
                    list = listSubList;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z10;
            }
            synchronized (c7325v.f34931g) {
                C4640e c4640e = c7325v.f34930f;
                Object[] objArr = c4640e.f22884a;
                int i10 = c4640e.f22886c;
                for (int i11 = 0; i11 < i10; i11++) {
                    z10 = ((C7324u) objArr[i11]).m13714b(set) || z10;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m13719b() {
        synchronized (this.f34931g) {
            C4640e c4640e = this.f34930f;
            Object[] objArr = c4640e.f22884a;
            int i10 = c4640e.f22886c;
            for (int i11 = 0; i11 < i10; i11++) {
                C7324u c7324u = (C7324u) objArr[i11];
                c7324u.f34917e.m5568a();
                c7324u.f34918f.m5568a();
                c7324u.f34923k.m5568a();
                c7324u.f34924l.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13720c(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Object r2 = r1.f34931g
            monitor-enter(r2)
            m2.e r3 = r1.f34930f     // Catch: java.lang.Throwable -> L93
            int r4 = r3.f22886c     // Catch: java.lang.Throwable -> L93
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L9b
            java.lang.Object[] r8 = r3.f22884a     // Catch: java.lang.Throwable -> L93
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L93
            u2.u r8 = (u2.C7324u) r8     // Catch: java.lang.Throwable -> L93
            e1.j0 r9 = r8.f34918f     // Catch: java.lang.Throwable -> L93
            java.lang.Object r9 = r9.m5577j(r0)     // Catch: java.lang.Throwable -> L93
            e1.d0 r9 = (e1.d0) r9     // Catch: java.lang.Throwable -> L93
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.f8948b     // Catch: java.lang.Throwable -> L93
            int[] r11 = r9.f8949c     // Catch: java.lang.Throwable -> L93
            long[] r9 = r9.f8947a     // Catch: java.lang.Throwable -> L93
            int r12 = r9.length     // Catch: java.lang.Throwable -> L93
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L93
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L93
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L93
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r17 = r6
            r6 = 0
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L93
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L93
            r8.m13716d(r0, r1)     // Catch: java.lang.Throwable -> L93
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r22
            goto L4f
        L6d:
            r1 = r17
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L7a:
            e1.j0 r1 = r8.f34918f     // Catch: java.lang.Throwable -> L93
            int r1 = r1.f9002e     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L82
            r1 = 1
            goto L83
        L82:
            r1 = 0
        L83:
            if (r1 != 0) goto L88
            int r7 = r7 + 1
            goto L95
        L88:
            if (r7 <= 0) goto L95
            java.lang.Object[] r1 = r3.f22884a     // Catch: java.lang.Throwable -> L93
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L93
            r1[r6] = r5     // Catch: java.lang.Throwable -> L93
            goto L95
        L93:
            r0 = move-exception
            goto La7
        L95:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L9b:
            java.lang.Object[] r0 = r3.f22884a     // Catch: java.lang.Throwable -> L93
            int r1 = r4 - r7
            r5 = 0
            java.util.Arrays.fill(r0, r1, r4, r5)     // Catch: java.lang.Throwable -> L93
            r3.f22886c = r1     // Catch: java.lang.Throwable -> L93
            monitor-exit(r2)
            return
        La7:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C7325v.m13720c(java.lang.Object):void");
    }

    /* renamed from: d */
    public final void m13721d(Object obj, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a) {
        Object obj2;
        C7324u c7324u;
        synchronized (this.f34931g) {
            C4640e c4640e = this.f34930f;
            Object[] objArr = c4640e.f22884a;
            int i10 = c4640e.f22886c;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i11];
                if (((C7324u) obj2).f34913a == interfaceC2139c) {
                    break;
                } else {
                    i11++;
                }
            }
            c7324u = (C7324u) obj2;
            if (c7324u == null) {
                AbstractC4154l.m8921d(interfaceC2139c, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                kotlin.jvm.internal.d0.m8907d(1, interfaceC2139c);
                c7324u = new C7324u(interfaceC2139c);
                c4640e.m9506b(c7324u);
            }
        }
        C7324u c7324u2 = this.f34933i;
        long j6 = this.f34934j;
        if (j6 != -1 && j6 != AbstractC6740i.m12900b()) {
            j1.m8542a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j6 + "), currentThread={id=" + AbstractC6740i.m12900b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f34933i = c7324u;
            this.f34934j = AbstractC6740i.m12900b();
            c7324u.m13713a(obj, this.f34929e, interfaceC2137a);
        } finally {
            this.f34933i = c7324u2;
            this.f34934j = j6;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* renamed from: e */
    public final void m13722e() {
        C1475f c1475f = this.f34928d;
        C4367l c4367l = AbstractC7316m.f34889a;
        AbstractC7316m.m13681f(C7304a.f34836c);
        synchronized (AbstractC7316m.f34890b) {
            AbstractC7316m.f34895g = AbstractC6663m.m12753Q(c1475f, AbstractC7316m.f34895g);
        }
        this.f34932h = new a1.c0(26, c1475f);
    }
}
