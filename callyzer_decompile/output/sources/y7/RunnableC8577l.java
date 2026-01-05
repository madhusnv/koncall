package y7;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import b2.C0558p;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import sr.C6911b;
import x5.AbstractC8309e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.l */
/* loaded from: classes.dex */
public final class RunnableC8577l implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f41698e = new ThreadLocal();

    /* renamed from: f */
    public static final C6911b f41699f = new C6911b(10);

    /* renamed from: a */
    public ArrayList f41700a;

    /* renamed from: b */
    public long f41701b;

    /* renamed from: c */
    public long f41702c;

    /* renamed from: d */
    public ArrayList f41703d;

    /* renamed from: c */
    public static t0 m15872c(RecyclerView recyclerView, int i10, long j6) {
        int iM14013x = recyclerView.f2817e.m14013x();
        for (int i11 = 0; i11 < iM14013x; i11++) {
            t0 t0VarM1313H = RecyclerView.m1313H(recyclerView.f2817e.m14012w(i11));
            if (t0VarM1313H.f41794c == i10 && !t0VarM1313H.m15921f()) {
                return null;
            }
        }
        l0 l0Var = recyclerView.f2814b;
        try {
            recyclerView.m1331O();
            t0 t0VarM15883i = l0Var.m15883i(i10, j6);
            if (t0VarM15883i != null) {
                if (!t0VarM15883i.m15920e() || t0VarM15883i.m15921f()) {
                    l0Var.m15875a(t0VarM15883i, false);
                } else {
                    l0Var.m15880f(t0VarM15883i.f41792a);
                }
            }
            recyclerView.m1332P(false);
            return t0VarM15883i;
        } catch (Throwable th2) {
            recyclerView.m1332P(false);
            throw th2;
        }
    }

    /* renamed from: a */
    public final void m15873a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.f2828r && this.f41701b == 0) {
            this.f41701b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0558p c0558p = recyclerView.f43698h1;
        c0558p.f3795b = i10;
        c0558p.f3796c = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15874b(long r17) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.RunnableC8577l.m15874b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f41700a;
        try {
            int i10 = AbstractC8309e.f39857a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m15874b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f41702c);
                }
            }
            this.f41701b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f41701b = 0L;
            int i12 = AbstractC8309e.f39857a;
            Trace.endSection();
            throw th2;
        }
    }
}
