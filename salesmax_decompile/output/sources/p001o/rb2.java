package p001o;

import androidx.compose.ui.focus.InterfaceC1929c;

/* loaded from: classes2.dex */
public final class rb2 implements InterfaceC1929c {

    /* renamed from: a */
    public static final rb2 f43337a = new rb2();

    /* renamed from: b */
    public static Boolean f43338b;

    /* renamed from: b */
    public final boolean m46480b() {
        return f43338b != null;
    }

    /* renamed from: c */
    public final void m46481c() {
        f43338b = null;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: j */
    public boolean mo4900j() {
        Boolean bool = f43338b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
