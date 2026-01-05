package n7;

import d7.n0;
import d7.w0;
import java.lang.ref.WeakReference;
import java.util.UUID;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import t2.InterfaceC7003b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n7.a */
/* loaded from: classes.dex */
public final class C4956a extends w0 {

    /* renamed from: b */
    public final String f24644b;

    /* renamed from: c */
    public C4001v f24645c;

    public C4956a(n0 n0Var) {
        String string = (String) n0Var.m5330a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            n0Var.m5331b("SaveableStateHolder_BackStackEntryKey", string);
        }
        this.f24644b = string;
    }

    @Override // d7.w0
    /* renamed from: d */
    public final void mo1209d() {
        C4001v c4001v = this.f24645c;
        if (c4001v == null) {
            AbstractC4154l.m8928k("saveableStateHolderRef");
            throw null;
        }
        InterfaceC7003b interfaceC7003b = (InterfaceC7003b) ((WeakReference) c4001v.f20704b).get();
        if (interfaceC7003b != null) {
            interfaceC7003b.mo12860f(this.f24644b);
        }
        C4001v c4001v2 = this.f24645c;
        if (c4001v2 != null) {
            ((WeakReference) c4001v2.f20704b).clear();
        } else {
            AbstractC4154l.m8928k("saveableStateHolderRef");
            throw null;
        }
    }
}
