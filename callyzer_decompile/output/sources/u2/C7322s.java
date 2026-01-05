package u2;

import kotlin.jvm.internal.AbstractC4154l;
import n2.InterfaceC4945d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.s */
/* loaded from: classes.dex */
public final class C7322s extends a0 {

    /* renamed from: c */
    public InterfaceC4945d f34907c;

    /* renamed from: d */
    public int f34908d;

    public C7322s(long j6, InterfaceC4945d interfaceC4945d) {
        super(j6);
        this.f34907c = interfaceC4945d;
    }

    @Override // u2.a0
    /* renamed from: a */
    public final void mo8494a(a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        C7322s c7322s = (C7322s) a0Var;
        synchronized (AbstractC7321r.f34906b) {
            this.f34907c = c7322s.f34907c;
            this.f34908d = c7322s.f34908d;
        }
    }

    @Override // u2.a0
    /* renamed from: b */
    public final a0 mo8495b(long j6) {
        return new C7322s(j6, this.f34907c);
    }
}
