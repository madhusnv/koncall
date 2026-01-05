package mx;

import ex.InterfaceC2141e;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import nx.C5170h;
import og.h1;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mx.j */
/* loaded from: classes3.dex */
public final class C4914j implements InterfaceC4911g {

    /* renamed from: a */
    public final /* synthetic */ int f24453a;

    /* renamed from: b */
    public final /* synthetic */ Object f24454b;

    public /* synthetic */ C4914j(int i10, Object obj) {
        this.f24453a = i10;
        this.f24454b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ex.e, ww.h] */
    @Override // mx.InterfaceC4911g
    public final Iterator iterator() {
        switch (this.f24453a) {
            case 0:
                return h1.m10679a((AbstractC8198h) this.f24454b);
            case 1:
                return (Iterator) this.f24454b;
            case 2:
                return new C5170h((CharSequence) this.f24454b);
            case 3:
                return AbstractC4154l.m8925h((Object[]) this.f24454b);
            default:
                return ((Iterable) this.f24454b).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4914j(InterfaceC2141e interfaceC2141e) {
        this.f24453a = 0;
        this.f24454b = (AbstractC8198h) interfaceC2141e;
    }
}
