package com.skydoves.balloon.compose;

import com.skydoves.balloon.internals.DefinitionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import rw.AbstractC6664n;
import rw.C6669s;
import s4.C6745a;
import t3.InterfaceC7028o;
import t3.i0;
import t3.j0;
import t3.k0;
import t3.l0;
import t3.v0;
import t3.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonKt$BalloonLayout$1$1 implements j0 {
    public static final BalloonKt$BalloonLayout$1$1 INSTANCE = new BalloonKt$BalloonLayout$1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 measure_3p2s80s$lambda$4(List list, v0 layout) {
        AbstractC4154l.m8923f(layout, "$this$layout");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            layout.m13324d((w0) it.next(), 0, 0, DefinitionKt.NO_Float_VALUE);
        }
        return a0.f30746a;
    }

    @Override // t3.j0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return super.maxIntrinsicHeight(interfaceC7028o, list, i10);
    }

    @Override // t3.j0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return super.maxIntrinsicWidth(interfaceC7028o, list, i10);
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final k0 mo16554measure3p2s80s(l0 Layout, List<? extends i0> measurables, long j6) {
        AbstractC4154l.m8923f(Layout, "$this$Layout");
        AbstractC4154l.m8923f(measurables, "measurables");
        long jM12911b = C6745a.m12911b(j6, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(measurables, 10));
        Iterator<T> it = measurables.iterator();
        while (it.hasNext()) {
            arrayList.add(((i0) it.next()).mo13314z(jM12911b));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = ((w0) it2.next()).f34030a;
        while (it2.hasNext()) {
            int i11 = ((w0) it2.next()).f34030a;
            if (i10 < i11) {
                i10 = i11;
            }
        }
        int iMax = Integer.max(i10, C6745a.m12920k(j6));
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = ((w0) it3.next()).f34031b;
        while (it3.hasNext()) {
            int i13 = ((w0) it3.next()).f34031b;
            if (i12 < i13) {
                i12 = i13;
            }
        }
        return Layout.g0(iMax, Integer.max(i12, C6745a.m12919j(j6)), C6669s.f31944a, new C1422c(2, arrayList));
    }

    @Override // t3.j0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return super.minIntrinsicHeight(interfaceC7028o, list, i10);
    }

    @Override // t3.j0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return super.minIntrinsicWidth(interfaceC7028o, list, i10);
    }
}
