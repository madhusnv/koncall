package gl;

import a9.C0073l;
import al.C0178f;
import al.C0182j;
import al.EnumC0185m;
import al.RunnableC0188p;
import android.os.SystemClock;
import bk.C0675f;
import c9.C0910e;
import cl.C0982b;
import com.google.mlkit.common.MlKitException;
import d9.ExecutorC1668m;
import el.C2066a;
import hl.C2964a;
import il.C3293a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import k1.j2;
import mg.j0;
import og.ec;
import og.fc;
import og.oc;
import og.pc;
import og.w0;
import og.wg;
import og.yg;
import sf.AbstractC6840z;
import sf.C6825k;
import sf.C6828n;
import uf.C7428c;
import ug.g1;
import v0.C7622f;
import yg.C8650g;
import yg.C8656m;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gl.e */
/* loaded from: classes.dex */
public final class C2629e {

    /* renamed from: j */
    public static boolean f14209j = true;

    /* renamed from: d */
    public final C0982b f14213d;

    /* renamed from: e */
    public final InterfaceC2630f f14214e;

    /* renamed from: f */
    public final yg f14215f;

    /* renamed from: g */
    public final C0910e f14216g;

    /* renamed from: i */
    public boolean f14218i;

    /* renamed from: b */
    public final AtomicInteger f14211b = new AtomicInteger(0);

    /* renamed from: c */
    public final AtomicBoolean f14212c = new AtomicBoolean(false);

    /* renamed from: a */
    public final C0182j f14210a = new C0182j(0, false);

    /* renamed from: h */
    public final C3293a f14217h = new C3293a();

    public C2629e(C0178f c0178f, C0982b c0982b, InterfaceC2630f interfaceC2630f, yg ygVar) {
        AbstractC6840z.m13037h(c0178f, "MlKitContext can not be null");
        this.f14213d = c0982b;
        this.f14214e = interfaceC2630f;
        this.f14215f = ygVar;
        this.f14216g = new C0910e(c0178f.m406b(), 12);
    }

    /* renamed from: a */
    public final C8656m m6600a(Executor executor, Callable callable, C7622f c7622f) {
        AbstractC6840z.m13039j(this.f14211b.get() > 0);
        if (((C8656m) c7622f.f36778a).m15984k()) {
            C8656m c8656m = new C8656m();
            c8656m.m15989p();
            return c8656m;
        }
        g1 g1Var = new g1(18);
        C8650g c8650g = new C8650g((C7622f) g1Var.f35448a);
        this.f14210a.m427r(new RunnableC0188p(this, c7622f, g1Var, callable, c8650g, 0), new ExecutorC1668m(executor, c7622f, g1Var, c8650g));
        return c8650g.f41930a;
    }

    /* renamed from: b */
    public final List m6601b(C2964a c2964a) throws Throwable {
        C2629e c2629e;
        C2964a c2964a2;
        synchronized (this) {
            try {
                try {
                    C3293a c3293a = this.f14217h;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c3293a.m7638a(c2964a);
                    try {
                        ArrayList arrayListMo5889a = this.f14214e.mo5889a(c2964a);
                        c2629e = this;
                        c2964a2 = c2964a;
                        try {
                            c2629e.m6602c(ec.NO_ERROR, jElapsedRealtime, c2964a2, arrayListMo5889a);
                            f14209j = false;
                            return arrayListMo5889a;
                        } catch (MlKitException e2) {
                            e = e2;
                            MlKitException mlKitException = e;
                            c2629e.m6602c(mlKitException.f7208a == 14 ? ec.MODEL_NOT_DOWNLOADED : ec.UNKNOWN_ERROR, jElapsedRealtime, c2964a2, null);
                            throw mlKitException;
                        }
                    } catch (MlKitException e10) {
                        e = e10;
                        c2629e = this;
                        c2964a2 = c2964a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: c */
    public final void m6602c(ec ecVar, long j6, C2964a c2964a, List list) {
        j0 j0Var = new j0(1);
        j0 j0Var2 = new j0(1);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2066a c2066a = (C2066a) it.next();
                int format = c2066a.f9678a.getFormat();
                if (format > 4096 || format == 0) {
                    format = -1;
                }
                oc ocVar = (oc) AbstractC2625a.f14200a.get(format);
                if (ocVar == null) {
                    ocVar = oc.FORMAT_UNKNOWN;
                }
                j0Var.m9620a(ocVar);
                pc pcVar = (pc) AbstractC2625a.f14201b.get(c2066a.f9678a.mo5990u());
                if (pcVar == null) {
                    pcVar = pc.TYPE_UNKNOWN;
                }
                j0Var2.m9620a(pcVar);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j6;
        C0675f c0675f = new C0675f();
        c0675f.f4251b = this;
        c0675f.f4250a = jElapsedRealtime;
        c0675f.f4252c = ecVar;
        c0675f.f4253d = j0Var;
        c0675f.f4254e = j0Var2;
        c0675f.f4255f = c2964a;
        this.f14215f.m11075b(c0675f, fc.ON_DEVICE_BARCODE_DETECT);
        C0073l c0073l = new C0073l();
        c0073l.f264a = ecVar;
        c0073l.f265b = Boolean.valueOf(f14209j);
        c0073l.f266c = AbstractC2625a.m6597a(this.f14213d);
        c0073l.f267d = j0Var.m9622c();
        c0073l.f268e = j0Var2.m9622c();
        EnumC0185m.INSTANCE.execute(new wg(this.f14215f, fc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, new w0(c0073l), jElapsedRealtime, new C8986c(15, this)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z6 = this.f14218i;
        long j10 = jCurrentTimeMillis - jElapsedRealtime;
        C0910e c0910e = this.f14216g;
        int i10 = true != z6 ? 24301 : 24302;
        int iZza = ecVar.zza();
        synchronized (c0910e) {
            AtomicLong atomicLong = (AtomicLong) c0910e.f5580c;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && jElapsedRealtime2 - ((AtomicLong) c0910e.f5580c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((C7428c) c0910e.f5579b).m13822c(new C6828n(Arrays.asList(new C6825k(i10, iZza, 0, j10, jCurrentTimeMillis, null, null, 0, -1)), 0)).m15978e(new j2(1, jElapsedRealtime2, c0910e));
        }
    }
}
