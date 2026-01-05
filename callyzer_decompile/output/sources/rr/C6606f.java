package rr;

import cp.C1472c;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kp.C4170b;
import q1.C6080h;
import q1.C6087o;
import qw.a0;
import s2.C6734c;
import sq.C6908y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rr.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6606f implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f31735a;

    /* renamed from: b */
    public final /* synthetic */ List f31736b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2141e f31737c;

    public /* synthetic */ C6606f(int i10, InterfaceC2141e interfaceC2141e, List list) {
        this.f31735a = i10;
        this.f31736b = list;
        this.f31737c = interfaceC2141e;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C6080h LazyColumn = (C6080h) obj;
        switch (this.f31735a) {
            case 0:
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                List list = this.f31736b;
                LazyColumn.m12099p(list.size(), null, C6087o.f29705c, new C6734c(new C1472c(3, list, this.f31737c), true, 961018036));
                break;
            default:
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                List list2 = this.f31736b;
                LazyColumn.m12099p(list2.size(), null, new C6908y(list2, 5), new C6734c(new C4170b(2, list2, this.f31737c), true, -632812321));
                break;
        }
        return a0.f30746a;
    }
}
