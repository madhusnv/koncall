package ef;

import android.content.Context;
import pw.InterfaceC6043a;
import ze.InterfaceC8945b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ef.e */
/* loaded from: classes.dex */
public final class C2045e implements InterfaceC8945b {

    /* renamed from: a */
    public final /* synthetic */ int f9616a;

    /* renamed from: b */
    public final InterfaceC6043a f9617b;

    public /* synthetic */ C2045e(InterfaceC6043a interfaceC6043a, int i10) {
        this.f9616a = i10;
        this.f9617b = interfaceC6043a;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f9616a) {
            case 0:
                String packageName = ((Context) this.f9617b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new C2052l(Integer.valueOf(C2052l.f9633d).intValue(), (Context) this.f9617b.get(), "com.google.android.datatransport.events");
        }
    }
}
