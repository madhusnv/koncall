package v3;

import b3.InterfaceC0586r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.g */
/* loaded from: classes.dex */
public final class C7635g implements InterfaceC0586r {

    /* renamed from: a */
    public static final C7635g f36822a = new C7635g();

    /* renamed from: b */
    public static Boolean f36823b;

    @Override // b3.InterfaceC0586r
    /* renamed from: b */
    public final boolean mo1751b() {
        Boolean bool = f36823b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw p020v.a1.m14342v("canFocus is read before it is written");
    }

    @Override // b3.InterfaceC0586r
    /* renamed from: d */
    public final void mo1753d(boolean z6) {
        f36823b = Boolean.valueOf(z6);
    }
}
