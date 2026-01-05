package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import p001o.g32;
import p001o.yj5;

/* loaded from: classes2.dex */
public abstract class bk5 {

    /* renamed from: o.bk5$a */
    public class C12448a implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ boolean f16456a;

        /* renamed from: b */
        public final /* synthetic */ g32.C13614a f16457b;

        public C12448a(boolean z, g32.C13614a c13614a) {
            this.f16456a = z;
            this.f16457b = c13614a;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            if (th instanceof TimeoutException) {
                this.f16457b.m28008f(th);
            } else {
                this.f16457b.m28005c(Collections.emptyList());
            }
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List list) {
            fgd.m26663g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f16456a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f16457b.m28005c(arrayList);
        }
    }

    /* renamed from: c */
    public static void m19279c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((yj5) it.next()).m57867e();
        }
    }

    /* renamed from: d */
    public static void m19280d(List list) throws yj5.C18418a {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((yj5) list.get(i)).m57874l();
                i++;
            } catch (yj5.C18418a e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ((yj5) list.get(i2)).m57867e();
                }
                throw e;
            }
        } while (i < list.size());
    }

    /* renamed from: f */
    public static /* synthetic */ Object m19282f(final zfa zfaVar, Executor executor, boolean z, Collection collection, g32.C13614a c13614a) {
        c13614a.m28003a(new Runnable() { // from class: o.ak5
            @Override // java.lang.Runnable
            public final void run() {
                zfaVar.cancel(true);
            }
        }, executor);
        bn7.m19424j(zfaVar, new C12448a(z, c13614a), executor);
        return "surfaceList[" + collection + "]";
    }

    /* renamed from: g */
    public static zfa m19283g(final Collection collection, final boolean z, long j, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(bn7.m19407B(((yj5) it.next()).m57872j()));
        }
        final zfa zfaVarM19406A = bn7.m19406A(j, scheduledExecutorService, bn7.m19411F(arrayList));
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.zj5
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return bk5.m19282f(zfaVarM19406A, executor, z, collection, c13614a);
            }
        });
    }
}
