package hr;

import aq.C0409l;
import aq.C0410m;
import ex.InterfaceC2139c;
import hq.C3012q;
import i1.C3135n;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4793d;
import nm.C5106a;
import q1.C6080h;
import q1.C6087o;
import qw.a0;
import r1.C6431p;
import s2.C6734c;
import sq.C6908y;
import vr.C7734b;
import zp.C9005e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hr.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3022a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f16319a;

    /* renamed from: b */
    public final /* synthetic */ List f16320b;

    public /* synthetic */ C3022a(List list, int i10) {
        this.f16319a = i10;
        this.f16320b = list;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f16319a) {
            case 0:
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                List list = this.f16320b;
                LazyColumn.m12099p(list.size(), null, C6087o.f29705c, new C6734c(new C3023b(list, 0), true, -1080240836));
                break;
            case 1:
                C6080h LazyColumn2 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn2, "$this$LazyColumn");
                C3012q c3012q = new C3012q(11);
                List list2 = this.f16320b;
                LazyColumn2.m12099p(list2.size(), new C3135n(17, c3012q, list2), new C0409l(list2, 15), new C6734c(new C0410m(list2, 3), true, -1091073711));
                break;
            case 2:
                C6080h LazyColumn3 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn3, "$this$LazyColumn");
                C3012q c3012q2 = new C3012q(17);
                List list3 = this.f16320b;
                LazyColumn3.m12099p(list3.size(), new C3135n(24, c3012q2, list3), new C0409l(list3, 22), new C6734c(new C0410m(list3, 4), true, -1091073711));
                break;
            case 3:
                C6080h LazyRow = (C6080h) obj;
                AbstractC4154l.m8923f(LazyRow, "$this$LazyRow");
                C7734b c7734b = new C7734b(3);
                List list4 = this.f16320b;
                LazyRow.m12099p(list4.size(), new C6431p(18, c7734b, list4), new C6908y(list4, 13), new C6734c(new C0410m(list4, 6), true, -1091073711));
                break;
            case 4:
                C6080h LazyColumn4 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn4, "$this$LazyColumn");
                List list5 = this.f16320b;
                LazyColumn4.m12099p(list5.size(), null, new C6908y(list5, 21), new C6734c(new C0410m(list5, 7), true, -632812321));
                break;
            default:
                C9005e callLog = (C9005e) obj;
                AbstractC4154l.m8923f(callLog, "callLog");
                C4793d c4793d = callLog.f43368a;
                List<C5106a> list6 = this.f16320b;
                if (list6 == null || !list6.isEmpty()) {
                    for (C5106a c5106a : list6) {
                        if (c5106a.f25008c == callLog.f43378k && AbstractC4154l.m8918a(c5106a.f25006a, callLog.f43373f) && AbstractC4154l.m8918a(c5106a.f25009d, c4793d.f23860f) && AbstractC4154l.m8918a(c5106a.f25007b, c4793d.f23864j)) {
                            z6 = true;
                        }
                    }
                    z6 = false;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
        }
        return a0.f30746a;
    }
}
