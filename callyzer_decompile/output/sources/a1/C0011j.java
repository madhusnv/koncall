package a1;

import c9.C0921p;
import c9.C0922q;
import com.amplifyframework.storage.s3.transfer.worker.RouterWorker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4154l;
import og.ia;
import p016r.InterfaceC6409a;
import pg.l8;
import rw.AbstractC6664n;
import t8.C7059e;
import t8.C7064j;
import x4.C8299i;
import x4.InterfaceC8300j;
import yg.C8656m;
import yg.InterfaceC8649f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0011j implements InterfaceC8649f, InterfaceC6409a, InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ int f61a;

    public /* synthetic */ C0011j(int i10) {
        this.f61a = i10;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        return RouterWorker.startWork$lambda$2$lambda$1(c8299i);
    }

    @Override // p016r.InterfaceC6409a
    public Object apply(Object obj) {
        int i10;
        C7059e c7059e;
        t8.d0 d0Var;
        Iterator it;
        long j6;
        long jM10697a;
        int i11;
        boolean z6;
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        for (Iterator it2 = list.iterator(); it2.hasNext(); it2 = it) {
            C0921p c0921p = (C0921p) it2.next();
            List list2 = c0921p.f5620q;
            C7064j c7064j = !list2.isEmpty() ? (C7064j) list2.get(0) : C7064j.f34159b;
            UUID uuidFromString = UUID.fromString(c0921p.f5604a);
            AbstractC4154l.m8922e(uuidFromString, "fromString(id)");
            t8.e0 e0Var = c0921p.f5605b;
            HashSet hashSet = new HashSet(c0921p.f5619p);
            C7064j c7064j2 = c0921p.f5606c;
            int i12 = c0921p.f5611h;
            int i13 = c0921p.f5616m;
            C7059e c7059e2 = c0921p.f5610g;
            long j10 = c0921p.f5607d;
            ArrayList arrayList2 = arrayList;
            long j11 = c0921p.f5608e;
            int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i14 != 0) {
                i10 = i13;
                c7059e = c7059e2;
                d0Var = new t8.d0(j11, c0921p.f5609f);
            } else {
                i10 = i13;
                c7059e = c7059e2;
                d0Var = null;
            }
            t8.e0 e0Var2 = c0921p.f5605b;
            t8.e0 e0Var3 = t8.e0.ENQUEUED;
            if (e0Var2 == e0Var3) {
                C0011j c0011j = C0922q.f5621y;
                if (e0Var2 != e0Var3 || i12 <= 0) {
                    i11 = i14;
                    z6 = false;
                } else {
                    i11 = i14;
                    z6 = true;
                }
                it = it2;
                jM10697a = ia.m10697a(z6, i12, c0921p.f5612i, c0921p.f5613j, c0921p.f5614k, c0921p.f5615l, i11 != 0, j10, c0921p.f5609f, j11, c0921p.f5617n);
                j6 = j10;
            } else {
                it = it2;
                j6 = j10;
                jM10697a = Long.MAX_VALUE;
            }
            arrayList2.add(new t8.f0(uuidFromString, e0Var, hashSet, c7064j2, c7064j, i12, i10, c7059e, j6, d0Var, jM10697a, c0921p.f5618o));
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        switch (this.f61a) {
            case 7:
                break;
            default:
                break;
        }
        return l8.m11765f(null);
    }
}
