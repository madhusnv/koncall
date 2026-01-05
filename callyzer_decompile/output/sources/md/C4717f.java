package md;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import tx.v1;
import uw.AbstractC7557a;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: md.f */
/* loaded from: classes.dex */
public final class C4717f extends AbstractC7557a implements v1 {

    /* renamed from: c */
    public static final C4715d f23609c = new C4715d();

    /* renamed from: b */
    public final C4715d f23610b;

    public C4717f(C4715d c4715d) {
        super(f23609c);
        this.f23610b = c4715d;
    }

    @Override // tx.v1
    /* renamed from: H */
    public final void mo9584H(InterfaceC7564h context, Object obj) throws IOException {
        InterfaceC4716e oldState = (InterfaceC4716e) obj;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(oldState, "oldState");
        oldState.close();
    }

    @Override // tx.v1
    public final Object f0(InterfaceC7564h context) {
        AbstractC4154l.m8923f(context, "context");
        this.f23610b.getClass();
        return C4715d.f23608a;
    }
}
