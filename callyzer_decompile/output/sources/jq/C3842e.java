package jq;

import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4181k;
import mm.C4792c;
import om.C5401c;
import rw.AbstractC6663m;
import tq.C7189a;
import tq.C7190b;
import tq.C7191c;
import tq.C7192d;
import tq.C7193e;
import tq.C7194f;
import tq.C7195g;
import tq.C7196h;
import tq.C7197i;
import tq.C7198j;
import tq.C7199k;
import tq.C7200l;
import yv.C8791f;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jq.e */
/* loaded from: classes3.dex */
public final class C3842e {

    /* renamed from: a */
    public static final C3842e f19796a = new C3842e();

    /* renamed from: a */
    public static C4181k m8398a(C5401c callLog, boolean z6, ArrayList arrayList, List compressList, List uploadList, boolean z10, boolean z11) {
        Long l9;
        int i10;
        AbstractC4154l.m8923f(callLog, "callLog");
        AbstractC4154l.m8923f(compressList, "compressList");
        AbstractC4154l.m8923f(uploadList, "uploadList");
        int i11 = callLog.f27095a;
        C4792c c4792c = callLog.f27096b;
        String str = c4792c.f23844a;
        String str2 = c4792c.f23846c;
        int i12 = c4792c.f23847d;
        Long l10 = c4792c.f23851h;
        AbstractC4154l.m8920c(l10);
        long jLongValue = l10.longValue();
        LocalDateTime localDateTime = c4792c.f23849f;
        EnumC8994d enumC8994d = c4792c.f23848e;
        AbstractC4154l.m8920c(enumC8994d);
        Integer num = callLog.f27097c;
        String str3 = c4792c.f23850g;
        AbstractC4154l.m8920c(str3);
        boolean z12 = callLog.f27099e;
        EnumC8993c enumC8993c = callLog.f27100f;
        String str4 = callLog.f27101g;
        String str5 = callLog.f27102h;
        boolean z13 = callLog.f27103i;
        String str6 = callLog.f27098d;
        ArrayList arrayList2 = new ArrayList();
        if (z12 || !z6) {
            l9 = l10;
        } else {
            l9 = l10;
            arrayList2.add(C7189a.f34479e);
        }
        arrayList2.add(C7198j.f34488e);
        arrayList2.add(C7200l.f34490e);
        arrayList2.add(C7190b.f34480e);
        arrayList2.add(C7197i.f34487e);
        if (callLog.f27103i) {
            C8791f c8791f = C8791f.f42457a;
            boolean zM16171d = C8791f.m16171d(callLog.f27101g);
            EnumC8993c enumC8993c2 = callLog.f27100f;
            int i13 = enumC8993c2 == null ? -1 : AbstractC3840c.f19795a[enumC8993c2.ordinal()];
            C7191c c7191c = C7191c.f34481e;
            i10 = i11;
            C7196h c7196h = C7196h.f34486e;
            switch (i13) {
                case -1:
                    AbstractC4154l.m8920c(l9);
                    if (l9.longValue() > 0 && !zM16171d) {
                        arrayList2.add(c7191c);
                        break;
                    }
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    if (!zM16171d) {
                        if (!arrayList.contains(Integer.valueOf(callLog.f27095a))) {
                            if (C8791f.m16171d(callLog.f27102h)) {
                                arrayList2.add(C7193e.f34483e);
                                break;
                            }
                        } else {
                            arrayList2.add(C7194f.f34484e);
                            break;
                        }
                    } else {
                        arrayList2.add(C7195g.f34485e);
                        break;
                    }
                    break;
                case 2:
                    if (!zM16171d) {
                        arrayList2.add(c7191c);
                        break;
                    }
                    break;
                case 3:
                    if (z10) {
                        final int i14 = 0;
                        final C3838a c3838a = new C3838a(callLog, 0);
                        if (compressList.removeIf(new Predicate() { // from class: jq.b
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                switch (i14) {
                                }
                                return ((Boolean) ((C3838a) c3838a).invoke(obj)).booleanValue();
                            }
                        })) {
                            arrayList2.add(c7196h);
                            break;
                        }
                    }
                    break;
                case 4:
                    if (z11) {
                        final int i15 = 1;
                        final C3838a c3838a2 = new C3838a(callLog, 1);
                        if (uploadList.removeIf(new Predicate() { // from class: jq.b
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                switch (i15) {
                                }
                                return ((Boolean) ((C3838a) c3838a2).invoke(obj)).booleanValue();
                            }
                        })) {
                            arrayList2.add(c7196h);
                            break;
                        }
                    }
                    break;
                case 5:
                    arrayList2.add(C7192d.f34482e);
                    break;
                case 6:
                    arrayList2.add(c7191c);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
            }
        } else {
            i10 = i11;
        }
        arrayList2.add(C7199k.f34489e);
        return new C4181k(i10, str, str2, i12, enumC8994d, localDateTime, jLongValue, enumC8993c, str4, str5, z13, str6, str3, num, Boolean.valueOf(z12), z6, AbstractC6663m.m12760X(arrayList2, new C3841d()));
    }
}
