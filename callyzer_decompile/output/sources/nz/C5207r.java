package nz;

import com.sun.mail.util.AbstractC1452a;
import iz.C3377j;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kz.AbstractC4299e;
import mz.C4918b;
import mz.C4919c;
import mz.C4920d;
import p020v.a1;
import rw.C6669s;
import tz.AbstractC7285d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.r */
/* loaded from: classes3.dex */
public final class C5207r {

    /* renamed from: a */
    public final int f25396a;

    /* renamed from: b */
    public final C5194e f25397b;

    /* renamed from: c */
    public final long f25398c;

    /* renamed from: e */
    public final C4919c f25400e;

    /* renamed from: d */
    public volatile Map f25399d = C6669s.f31944a;

    /* renamed from: f */
    public final C4918b f25401f = new C4918b(this, AbstractC1452a.m4564k(new StringBuilder(), AbstractC4299e.f21708b, " ConnectionPool connection closer"));

    /* renamed from: g */
    public final ConcurrentLinkedQueue f25402g = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(C5207r.class, Map.class, "d");
    }

    public C5207r(C4920d c4920d, int i10, long j6, TimeUnit timeUnit, C5194e c5194e, C3377j c3377j) {
        this.f25396a = i10;
        this.f25397b = c5194e;
        this.f25398c = timeUnit.toNanos(j6);
        this.f25400e = c4920d.m9824d();
        if (j6 <= 0) {
            throw new IllegalArgumentException(a1.m14330j("keepAliveDuration <= 0: ", j6).toString());
        }
    }

    /* renamed from: a */
    public final int m10203a(C5206q c5206q, long j6) {
        TimeZone timeZone = AbstractC4299e.f21707a;
        ArrayList arrayList = c5206q.f25394t;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + c5206q.f25378d.f17969a.f17780h + " was leaked. Did you forget to close a response body?";
                AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
                AbstractC7285d.f34750a.mo13612i(((C5203n) reference).f25357a, str);
                arrayList.remove(i10);
                if (arrayList.isEmpty()) {
                    c5206q.f25395u = j6 - this.f25398c;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
