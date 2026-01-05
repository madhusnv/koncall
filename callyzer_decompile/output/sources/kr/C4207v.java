package kr;

import aq.C0409l;
import bp.C0720d;
import d7.EnumC1644p;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;
import ex.InterfaceC2139c;
import hq.C3012q;
import i1.C3135n;
import java.util.List;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import q1.C6080h;
import s2.C6734c;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.v */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4207v implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f21320a;

    /* renamed from: b */
    public final /* synthetic */ boolean f21321b;

    /* renamed from: c */
    public final /* synthetic */ Object f21322c;

    /* renamed from: d */
    public final /* synthetic */ Object f21323d;

    public /* synthetic */ C4207v(int i10, Object obj, Object obj2, boolean z6) {
        this.f21320a = i10;
        this.f21322c = obj;
        this.f21321b = z6;
        this.f21323d = obj2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f21320a) {
            case 0:
                C7320q c7320q = (C7320q) this.f21322c;
                w0 w0Var = (w0) this.f21323d;
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                LazyColumn.m12099p(c7320q.size(), new C3135n(15, new C3012q(5), c7320q), new C0409l(c7320q, 13), new C6734c(new C4210y(c7320q, this.f21321b, c7320q, w0Var), true, -1091073711));
                return qw.a0.f30746a;
            default:
                final C4409i c4409i = (C4409i) this.f21322c;
                final List list = (List) this.f21323d;
                final boolean z6 = this.f21321b;
                InterfaceC1647s interfaceC1647s = new InterfaceC1647s() { // from class: n7.k
                    @Override // d7.InterfaceC1647s
                    /* renamed from: u */
                    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
                        boolean z10 = z6;
                        List list2 = list;
                        C4409i c4409i2 = c4409i;
                        if (z10 && !list2.contains(c4409i2)) {
                            list2.add(c4409i2);
                        }
                        if (enumC1644p == EnumC1644p.ON_START && !list2.contains(c4409i2)) {
                            list2.add(c4409i2);
                        }
                        if (enumC1644p == EnumC1644p.ON_STOP) {
                            list2.remove(c4409i2);
                        }
                    }
                };
                c4409i.f22052h.f29901j.mo5343a(interfaceC1647s);
                return new C0720d(8, c4409i, interfaceC1647s);
        }
    }
}
