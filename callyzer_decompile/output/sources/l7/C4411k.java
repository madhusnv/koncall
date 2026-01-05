package l7;

import ex.InterfaceC2137a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6674x;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C4411k implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f22056a = 0;

    /* renamed from: b */
    public final /* synthetic */ C4412l f22057b;

    /* renamed from: c */
    public final /* synthetic */ C4409i f22058c;

    public /* synthetic */ C4411k(C4412l c4412l, C4409i c4409i) {
        this.f22057b = c4412l;
        this.f22058c = c4409i;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f22056a) {
            case 0:
                C4412l c4412l = this.f22057b;
                C4409i entry = this.f22058c;
                AbstractC4154l.m8923f(entry, "entry");
                m1 m1Var = c4412l.f22078c;
                Set set = (Set) m1Var.getValue();
                AbstractC4154l.m8923f(set, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC6674x.m12776d(set.size()));
                boolean z6 = false;
                for (Object obj : set) {
                    boolean z10 = true;
                    if (!z6 && AbstractC4154l.m8918a(obj, entry)) {
                        z6 = true;
                        z10 = false;
                    }
                    if (z10) {
                        linkedHashSet.add(obj);
                    }
                }
                m1Var.m15399k(null, linkedHashSet);
                break;
            default:
                C4412l c4412l2 = this.f22057b;
                C4409i c4409i = this.f22058c;
                synchronized (c4412l2.f22076a) {
                    try {
                        m1 m1Var2 = c4412l2.f22077b;
                        Iterable iterable = (Iterable) m1Var2.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (AbstractC4154l.m8918a((C4409i) obj2, c4409i)) {
                                m1Var2.getClass();
                                m1Var2.m15399k(null, arrayList);
                                break;
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        m1Var2.getClass();
                        m1Var2.m15399k(null, arrayList);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C4411k(C4412l c4412l, C4409i c4409i, boolean z6) {
        this.f22057b = c4412l;
        this.f22058c = c4409i;
    }
}
