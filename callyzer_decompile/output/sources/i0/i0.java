package i0;

import a1.RunnableC0012k;
import a1.RunnableC0025x;
import c0.C0823p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import p020v.C7600j;
import pg.t8;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import rw.C6668r;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    public final Executor f16480a;

    /* renamed from: b */
    public final Object f16481b;

    /* renamed from: c */
    public C7600j f16482c;

    /* renamed from: d */
    public l0 f16483d;

    /* renamed from: e */
    public c0.d1 f16484e;

    /* renamed from: f */
    public final C8986c f16485f;

    /* renamed from: g */
    public volatile Object f16486g;

    /* renamed from: h */
    public final AtomicBoolean f16487h;

    /* renamed from: i */
    public final CopyOnWriteArrayList f16488i;

    /* renamed from: j */
    public final CopyOnWriteArrayList f16489j;

    /* renamed from: k */
    public final LinkedHashMap f16490k;

    public i0(Executor backgroundExecutor) {
        AbstractC4154l.m8923f(backgroundExecutor, "backgroundExecutor");
        this.f16480a = backgroundExecutor;
        this.f16481b = new Object();
        this.f16485f = new C8986c(21, this);
        this.f16486g = C6668r.f31943a;
        this.f16487h = new AtomicBoolean(false);
        this.f16488i = new CopyOnWriteArrayList();
        this.f16489j = new CopyOnWriteArrayList();
        this.f16490k = new LinkedHashMap();
    }

    /* renamed from: a */
    public final void m7342a(String str) {
        l0 l0Var = this.f16483d;
        if (l0Var == null) {
            return;
        }
        try {
            e0 e0VarMo7319q = l0Var.m7358b(str).mo7319q();
            AbstractC4154l.m8922e(e0VarMo7319q, "getCameraInfoInternal(...)");
            m7345d(e0VarMo7319q);
        } catch (IllegalArgumentException unused) {
            og.u1.m10951j("CameraPresencePrvdr");
        }
    }

    /* renamed from: b */
    public final void m7343b(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16489j;
        if (!zIsEmpty) {
            set.size();
            og.u1.m10945d("CameraPresencePrvdr");
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        set2.size();
        og.u1.m10945d("CameraPresencePrvdr");
        Iterator it2 = copyOnWriteArrayList.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: c */
    public final void m7344c(String str) {
        synchronized (this.f16481b) {
            d7.h0 h0Var = (d7.h0) this.f16490k.remove(str);
            l0 l0Var = this.f16483d;
            if (h0Var != null && l0Var != null) {
                try {
                    t8.m11875d().execute(new RunnableC0012k(19, l0Var.m7358b(str), h0Var));
                    og.u1.m10942a("CameraPresencePrvdr");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    /* renamed from: d */
    public final void m7345d(e0 e0Var) {
        String strMo7323e = e0Var.mo7323e();
        AbstractC4154l.m8922e(strMo7323e, "getCameraId(...)");
        if (this.f16487h.get()) {
            synchronized (this.f16481b) {
                if (this.f16490k.containsKey(strMo7323e)) {
                    return;
                }
                h0 h0Var = new h0(this, strMo7323e);
                t8.m11875d().execute(new RunnableC0012k(20, e0Var, h0Var));
                this.f16490k.put(strMo7323e, h0Var);
                "Registered state observer for camera: ".concat(strMo7323e);
                og.u1.m10942a("CameraPresencePrvdr");
            }
        }
    }

    /* renamed from: e */
    public final void m7346e() {
        if (!this.f16487h.getAndSet(false)) {
            og.u1.m10942a("CameraPresencePrvdr");
            return;
        }
        og.u1.m10945d("CameraPresencePrvdr");
        c0.d1 d1Var = this.f16484e;
        if (d1Var != null) {
            d1Var.mo2185c(this.f16485f);
        }
        synchronized (this.f16481b) {
            if (!this.f16490k.isEmpty()) {
                Map mapM12785m = AbstractC6674x.m12785m(this.f16490k);
                this.f16490k.clear();
                l0 l0Var = this.f16483d;
                if (l0Var != null) {
                    LinkedHashSet linkedHashSetM7359c = l0Var.m7359c();
                    ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(linkedHashSetM7359c, 10));
                    Iterator it = linkedHashSetM7359c.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((g0) it.next()).mo7319q());
                    }
                    mapM12785m.size();
                    og.u1.m10942a("CameraPresencePrvdr");
                    ArrayList arrayList2 = new ArrayList(mapM12785m.size());
                    for (Map.Entry entry : mapM12785m.entrySet()) {
                        String str = (String) entry.getKey();
                        t8.m11875d().execute(new RunnableC0025x(10, arrayList, (d7.h0) entry.getValue(), str));
                        arrayList2.add(qw.a0.f30746a);
                    }
                }
            }
        }
        this.f16488i.clear();
        this.f16489j.clear();
        this.f16486g = C6668r.f31943a;
        this.f16482c = null;
        this.f16483d = null;
    }

    /* renamed from: f */
    public final void m7347f(C7600j cameraFactory, l0 cameraRepository) {
        AbstractC4154l.m8923f(cameraFactory, "cameraFactory");
        AbstractC4154l.m8923f(cameraRepository, "cameraRepository");
        if (this.f16487h.compareAndSet(false, true)) {
            og.u1.m10945d("CameraPresencePrvdr");
            LinkedHashSet<String> linkedHashSetM14400a = cameraFactory.m14400a();
            ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(linkedHashSetM14400a, 10));
            for (String str : linkedHashSetM14400a) {
                AbstractC4154l.m8920c(str);
                arrayList.add(new C0823p(pe.m10835j(str), null));
            }
            this.f16486g = arrayList;
            this.f16482c = cameraFactory;
            this.f16483d = cameraRepository;
            c0.d1 d1Var = cameraFactory.f36604j;
            this.f16484e = d1Var;
            if (d1Var != null) {
                d1Var.mo2184a(this.f16480a, this.f16485f);
            }
        }
    }
}
