package hy;

import e1.x0;
import fx.InterfaceC2395a;
import java.util.Iterator;
import jy.C3883t;
import kotlin.jvm.internal.AbstractC4154l;
import mx.C4906b;
import nx.C5164b;
import nx.C5165c;
import qc.C6158d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hy.h */
/* loaded from: classes3.dex */
public final class C3057h implements Iterable, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f16409a;

    /* renamed from: b */
    public final Object f16410b;

    public /* synthetic */ C3057h(int i10, Object obj) {
        this.f16409a = i10;
        this.f16410b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f16409a) {
            case 0:
                return new x0((C3883t) this.f16410b);
            case 1:
                return new C5164b((C5165c) this.f16410b);
            case 2:
                return AbstractC4154l.m8925h((Object[]) this.f16410b);
            default:
                return new C4906b(AbstractC4154l.m8925h((Object[]) ((C6158d) this.f16410b).f30016b));
        }
    }
}
