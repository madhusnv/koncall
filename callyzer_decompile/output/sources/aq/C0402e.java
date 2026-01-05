package aq;

import cq.AbstractC1478a;
import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import q1.C6080h;
import qp.C6274k;
import qw.a0;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aq.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0402e implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3103a;

    /* renamed from: b */
    public final /* synthetic */ C6274k f3104b;

    public /* synthetic */ C0402e(C6274k c6274k, int i10) {
        this.f3103a = i10;
        this.f3104b = c6274k;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C6080h LazyColumn = (C6080h) obj;
        switch (this.f3103a) {
            case 0:
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                C6274k c6274k = this.f3104b;
                List list = c6274k.f30466a;
                LazyColumn.m12099p(list.size(), new C0408k(0, new C0400c(0), list), new C0409l(list, 0), new C6734c(new C0410m(list, 0), true, -1091073711));
                if (c6274k.f30475j) {
                    LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC0399b.f3099b);
                }
                break;
            default:
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                C6274k c6274k2 = this.f3104b;
                List list2 = c6274k2.f30466a;
                LazyColumn.m12099p(list2.size(), new C0408k(2, new C0400c(12), list2), new C0409l(list2, 3), new C6734c(new C0410m(list2, 1), true, -1091073711));
                if (c6274k2.f30475j) {
                    LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC1478a.f7539b);
                }
                break;
        }
        return a0.f30746a;
    }
}
