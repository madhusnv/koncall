package z8;

import a9.AbstractC0067f;
import android.os.Build;
import c9.C0922q;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;
import t8.EnumC7078x;
import y8.C8596e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z8.f */
/* loaded from: classes.dex */
public final class C8903f extends AbstractC8900c {

    /* renamed from: b */
    public final int f42865b;

    static {
        AbstractC4154l.m8922e(C7077w.m13372b("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8903f(AbstractC0067f tracker) {
        super(tracker);
        AbstractC4154l.m8923f(tracker, "tracker");
        this.f42865b = 7;
    }

    @Override // z8.InterfaceC8902e
    /* renamed from: a */
    public final boolean mo15950a(C0922q workSpec) {
        AbstractC4154l.m8923f(workSpec, "workSpec");
        return workSpec.f5631j.f34129a == EnumC7078x.METERED;
    }

    @Override // z8.AbstractC8900c
    /* renamed from: d */
    public final int mo16404d() {
        return this.f42865b;
    }

    @Override // z8.AbstractC8900c
    /* renamed from: e */
    public final boolean mo16405e(Object obj) {
        C8596e value = (C8596e) obj;
        AbstractC4154l.m8923f(value, "value");
        boolean z6 = value.f41842a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z6 && value.f41844c) ? false : true;
        }
        C7077w.m13371a().getClass();
        return !z6;
    }
}
