package xf;

import java.util.Comparator;
import pf.C5904d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xf.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C8367b implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C8367b f40028a = new C8367b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C5904d c5904d = (C5904d) obj;
        C5904d c5904d2 = (C5904d) obj2;
        return !c5904d.f28742a.equals(c5904d2.f28742a) ? c5904d.f28742a.compareTo(c5904d2.f28742a) : (c5904d.m11508b() > c5904d2.m11508b() ? 1 : (c5904d.m11508b() == c5904d2.m11508b() ? 0 : -1));
    }
}
