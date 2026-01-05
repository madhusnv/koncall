package i00;

import java.lang.reflect.Array;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.y */
/* loaded from: classes3.dex */
public final class C3120y extends w0 {

    /* renamed from: c */
    public final /* synthetic */ int f16772c;

    /* renamed from: d */
    public final /* synthetic */ w0 f16773d;

    public /* synthetic */ C3120y(w0 w0Var, int i10) {
        this.f16772c = i10;
        this.f16773d = w0Var;
    }

    @Override // i00.w0
    /* renamed from: a */
    public final void mo7438a(m0 m0Var, Object obj) {
        switch (this.f16772c) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f16773d.mo7438a(m0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i10 = 0; i10 < length; i10++) {
                        this.f16773d.mo7438a(m0Var, Array.get(obj, i10));
                    }
                    break;
                }
                break;
        }
    }
}
