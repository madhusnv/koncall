package pc;

import bk.C0678i;
import iz.AbstractC3386s;
import iz.C3378k;
import iz.C3379l;
import iz.C3382o;
import iz.c0;
import iz.d0;
import iz.q0;
import j$.time.Duration;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.C4001v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import l1.C4327p;
import mm.AbstractC4801l;
import mz.C4920d;
import nc.AbstractC4995f;
import nc.AbstractC4996g;
import nf.C5047i;
import nz.C5206q;
import nz.C5207r;
import oc.C5335b;
import og.pe;
import ox.C5770a;
import ox.EnumC5772c;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import tw.C7240a;
import zc.EnumC8936m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.o */
/* loaded from: classes.dex */
public final class C5887o extends AbstractC4995f {

    /* renamed from: g */
    public static final /* synthetic */ int f28703g = 0;

    /* renamed from: d */
    public final C5889q f28704d;

    /* renamed from: e */
    public final C5335b f28705e;

    /* renamed from: f */
    public final d0 f28706f;

    public C5887o(C5889q config) {
        q0 q0Var;
        AbstractC4154l.m8923f(config, "config");
        this.f28704d = config;
        C5335b c5335b = new C5335b(config.f24749i);
        this.f28705e = c5335b;
        AbstractC3386s[] abstractC3386sArr = {null};
        c0 c0Var = new c0();
        c0Var.f17817i = false;
        c0Var.f17818j = false;
        EnumC8936m enumC8936m = config.f24748h.f24763a;
        enumC8936m = enumC8936m == null ? EnumC8936m.TLS_1_2 : enumC8936m;
        EnumC8936m[] enumC8936mArrValues = EnumC8936m.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC8936m enumC8936m2 : enumC8936mArrValues) {
            if (enumC8936m2.compareTo(enumC8936m) >= 0) {
                arrayList.add(enumC8936m2);
            }
        }
        List listM12760X = AbstractC6663m.m12760X(arrayList, C7240a.f34591c);
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(listM12760X, 10));
        Iterator it = listM12760X.iterator();
        while (it.hasNext()) {
            int i10 = AbstractC5890r.f28718a[((EnumC8936m) it.next()).ordinal()];
            if (i10 == 1) {
                q0Var = q0.TLS_1_0;
            } else if (i10 == 2) {
                q0Var = q0.TLS_1_1;
            } else if (i10 == 3) {
                q0Var = q0.TLS_1_2;
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                q0Var = q0.TLS_1_3;
            }
            arrayList2.add(q0Var);
        }
        q0[] q0VarArr = (q0[]) arrayList2.toArray(new q0[0]);
        C3378k c3378k = new C3378k(C3379l.f17933e);
        c3378k.m7737e((q0[]) Arrays.copyOf(q0VarArr, q0VarArr.length));
        List listM10834i = pe.m10834i(c3378k.m7733a(), C3379l.f17934f);
        listM10834i.equals(c0Var.f17824p);
        c0Var.f17824p = AbstractC4299e.m9021j(listM10834i);
        c0Var.f17814f = false;
        long j6 = config.f24743c;
        int i11 = C5770a.f28335d;
        EnumC5772c enumC5772c = EnumC5772c.SECONDS;
        Duration durationOfSeconds = Duration.ofSeconds(C5770a.m11302m(j6, enumC5772c), C5770a.m11295f(j6));
        AbstractC4154l.m8922e(durationOfSeconds, "toComponents-impl(...)");
        long millis = durationOfSeconds.toMillis();
        TimeUnit unit = TimeUnit.MILLISECONDS;
        AbstractC4154l.m8923f(unit, "unit");
        c0Var.f17828t = AbstractC4299e.m9013b(millis, unit);
        Duration durationOfSeconds2 = Duration.ofSeconds(C5770a.m11302m(config.f24741a, enumC5772c), C5770a.m11295f(r2));
        AbstractC4154l.m8922e(durationOfSeconds2, "toComponents-impl(...)");
        c0Var.f17829u = AbstractC4299e.m9013b(durationOfSeconds2.toMillis(), unit);
        Duration durationOfSeconds3 = Duration.ofSeconds(C5770a.m11302m(config.f24742b, enumC5772c), C5770a.m11295f(r2));
        AbstractC4154l.m8922e(durationOfSeconds3, "toComponents-impl(...)");
        c0Var.f17830v = AbstractC4299e.m9013b(durationOfSeconds3.toMillis(), unit);
        C5047i c5047i = new C5047i(C5770a.m11293d(config.f24744d), C4920d.f24472l, 0, 0, 0, 0, false, false, null, 8160);
        c0Var.f17810b = c5047i;
        C3382o c3382o = new C3382o();
        int i12 = config.f24745e;
        if (i12 < 1) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i12, "max < 1: ").toString());
        }
        synchronized (c3382o) {
            c3382o.f17963a = i12;
        }
        c3382o.m7754h();
        int i13 = config.f28717j;
        if (i13 < 1) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i13, "max < 1: ").toString());
        }
        synchronized (c3382o) {
            c3382o.f17964b = i13;
        }
        c3382o.m7754h();
        c0Var.f17809a = c3382o;
        c0Var.f17813e = new C0678i(c5047i, config, c3382o, c5335b, abstractC3386sArr);
        config.f24748h.getClass();
        c0Var.f17821m = new C5892t(config.f24746f);
        c0Var.f17822n = new C4327p(config.f24746f);
        c0Var.f17820l = new C4001v(config.f24747g);
        c0Var.f17811c.add(C5883k.f28689a);
        this.f28706f = new d0(c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    @Override // nc.InterfaceC4991b
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo9898G(bd.C0645a r19, tc.C7123h r20, uw.InterfaceC7559c r21) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.C5887o.mo9898G(bd.a, tc.h, uw.c):java.lang.Object");
    }

    @Override // nc.InterfaceC4991b
    /* renamed from: d */
    public final AbstractC4996g mo9899d() {
        return this.f28704d;
    }

    @Override // nc.AbstractC4995f
    /* renamed from: h */
    public final void mo9904h() throws Throwable {
        Socket socket;
        C5207r c5207r = (C5207r) this.f28706f.f17833A.f24823b;
        Iterator it = c5207r.f25402g.iterator();
        AbstractC4154l.m8922e(it, "iterator(...)");
        while (it.hasNext()) {
            C5206q c5206q = (C5206q) it.next();
            AbstractC4154l.m8920c(c5206q);
            synchronized (c5206q) {
                if (c5206q.f25394t.isEmpty()) {
                    it.remove();
                    c5206q.f25388n = true;
                    socket = c5206q.f25380f;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                AbstractC4299e.m9014c(socket);
            }
        }
        if (c5207r.f25402g.isEmpty()) {
            c5207r.f25400e.m9816a();
        }
        Iterator it2 = c5207r.f25399d.values().iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        ((ThreadPoolExecutor) this.f28706f.f17834a.m7748b()).shutdown();
        this.f28705e.close();
    }
}
