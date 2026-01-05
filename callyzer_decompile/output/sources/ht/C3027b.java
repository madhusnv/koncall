package ht;

import aq.C0409l;
import ds.C1780d;
import ex.InterfaceC2139c;
import i1.C3135n;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4800k;
import nx.AbstractC5185w;
import q1.C6080h;
import qr.C6286j;
import qw.a0;
import r1.C6426k;
import r1.C6431p;
import rq.C6600b;
import s2.C6734c;
import sq.C6908y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ht.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3027b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f16329a;

    /* renamed from: b */
    public final /* synthetic */ List f16330b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f16331c;

    public /* synthetic */ C3027b(int i10, InterfaceC2139c interfaceC2139c, List list) {
        this.f16329a = i10;
        this.f16330b = list;
        this.f16331c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f16329a) {
            case 0:
                C6080h LazyRow = (C6080h) obj;
                AbstractC4154l.m8923f(LazyRow, "$this$LazyRow");
                List list = this.f16330b;
                LazyRow.m12099p(list.size(), null, new C0409l(list, 11), new C6734c(new C1780d(1, this.f16331c, list), true, -632812321));
                break;
            case 1:
                C6426k LazyVerticalGrid = (C6426k) obj;
                AbstractC4154l.m8923f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                List list2 = this.f16330b;
                LazyVerticalGrid.m12425n(list2.size(), new C0409l(list2, 23), new C6734c(new C1780d(2, this.f16331c, list2), true, 699646206));
                break;
            case 2:
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                C6286j c6286j = new C6286j(6);
                List list3 = this.f16330b;
                LazyColumn.m12099p(list3.size(), new C3135n(29, c6286j, list3), new C0409l(list3, 27), new C6734c(new C1780d(3, this.f16331c, list3), true, -1091073711));
                break;
            case 3:
                C6080h LazyColumn2 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn2, "$this$LazyColumn");
                C6286j c6286j2 = new C6286j(8);
                List list4 = this.f16330b;
                LazyColumn2.m12099p(list4.size(), new C6431p(2, c6286j2, list4), new C0409l(list4, 28), new C6734c(new C6600b(list4, this.f16331c, list4, 0), true, -1091073711));
                break;
            case 4:
                C6080h LazyColumn3 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn3, "$this$LazyColumn");
                C6286j c6286j3 = new C6286j(9);
                List list5 = this.f16330b;
                LazyColumn3.m12099p(list5.size(), new C6431p(3, c6286j3, list5), new C0409l(list5, 29), new C6734c(new C6600b(list5, this.f16331c, list5, 1), true, -1091073711));
                break;
            case 5:
                C6080h LazyColumn4 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn4, "$this$LazyColumn");
                List list6 = this.f16330b;
                LazyColumn4.m12099p(list6.size(), null, new C6908y(list6, 0), new C6734c(new C6600b(list6, this.f16331c, list6, 2), true, -1091073711));
                break;
            default:
                String selectedOption = (String) obj;
                AbstractC4154l.m8923f(selectedOption, "selectedOption");
                Object obj2 = null;
                boolean z6 = false;
                for (Object obj3 : this.f16330b) {
                    if (AbstractC5185w.m10125g(selectedOption, ((C4800k) obj3).f23886b)) {
                        if (z6) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        z6 = true;
                        obj2 = obj3;
                    }
                }
                if (!z6) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                this.f16331c.invoke((C4800k) obj2);
                break;
        }
        return a0.f30746a;
    }
}
