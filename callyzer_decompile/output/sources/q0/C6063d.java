package q0;

import b6.InterfaceC0600a;
import e1.u0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import tb.C7105p;
import y5.AbstractC8560f;
import y5.C8559e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q0.d */
/* loaded from: classes.dex */
public final class C6063d implements InterfaceC0600a {

    /* renamed from: a */
    public final /* synthetic */ int f29575a;

    /* renamed from: b */
    public Object f29576b;

    @Override // b6.InterfaceC0600a
    public final void accept(Object obj) {
        switch (this.f29575a) {
            case 0:
                AbstractC4154l.m8921d((InterfaceC0600a) this.f29576b, "Listener is not set.");
                ((InterfaceC0600a) this.f29576b).accept(obj);
                return;
            case 1:
                C8559e c8559e = (C8559e) obj;
                if (c8559e == null) {
                    c8559e = new C8559e(-3);
                }
                ((C7105p) this.f29576b).m13388m(c8559e);
                return;
            default:
                C8559e c8559e2 = (C8559e) obj;
                synchronized (AbstractC8560f.f41552c) {
                    try {
                        u0 u0Var = AbstractC8560f.f41553d;
                        ArrayList arrayList = (ArrayList) u0Var.get((String) this.f29576b);
                        if (arrayList == null) {
                            return;
                        }
                        u0Var.remove((String) this.f29576b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((InterfaceC0600a) arrayList.get(i10)).accept(c8559e2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ C6063d(int i10, Object obj) {
        this.f29575a = i10;
        this.f29576b = obj;
    }
}
