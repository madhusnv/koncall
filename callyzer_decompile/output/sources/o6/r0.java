package o6;

import i1.C3135n;
import java.util.LinkedHashMap;
import ux.C7569c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements tx.o0 {

    /* renamed from: a */
    public final /* synthetic */ int f26139a;

    /* renamed from: b */
    public final /* synthetic */ Object f26140b;

    /* renamed from: c */
    public final /* synthetic */ Object f26141c;

    public /* synthetic */ r0(int i10, Object obj, Object obj2) {
        this.f26139a = i10;
        this.f26140b = obj;
        this.f26141c = obj2;
    }

    @Override // tx.o0
    public final void dispose() {
        switch (this.f26139a) {
            case 0:
                String str = (String) this.f26140b;
                C3135n c3135n = (C3135n) this.f26141c;
                synchronized (t0.f26159b) {
                    LinkedHashMap linkedHashMap = t0.f26160c;
                    t0 t0Var = (t0) linkedHashMap.get(str);
                    if (t0Var != null) {
                        t0Var.f26161a.remove(c3135n);
                        if (t0Var.f26161a.isEmpty()) {
                            linkedHashMap.remove(str);
                            t0Var.stopWatching();
                        }
                    }
                }
                return;
            default:
                C7569c c7569c = (C7569c) this.f26140b;
                c7569c.f36443c.removeCallbacks((Runnable) this.f26141c);
                return;
        }
    }
}
