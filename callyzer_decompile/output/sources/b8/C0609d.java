package b8;

import android.database.SQLException;
import ex.InterfaceC2137a;
import pg.a9;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0609d implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4001a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f4002b;

    /* renamed from: c */
    public final /* synthetic */ Object f4003c;

    public /* synthetic */ C0609d(C0611f c0611f, boolean z6) {
        this.f4003c = c0611f;
        this.f4002b = z6;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4001a) {
            case 0:
                C0611f c0611f = (C0611f) this.f4003c;
                String str = this.f4002b ? "reader" : "writer";
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Timed out attempting to acquire a " + str + " connection.");
                sb2.append("\n\nWriter pool:\n");
                c0611f.f4015b.m1774d(sb2);
                sb2.append("Reader pool:");
                sb2.append('\n');
                c0611f.f4014a.m1774d(sb2);
                try {
                    a9.m11540c(5, sb2.toString());
                    throw null;
                } catch (SQLException e2) {
                    e2.printStackTrace();
                    return a0.f30746a;
                }
            default:
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f4003c;
                if (!this.f4002b) {
                    interfaceC2137a.invoke();
                }
                return a0.f30746a;
        }
    }

    public /* synthetic */ C0609d(boolean z6, InterfaceC2137a interfaceC2137a) {
        this.f4002b = z6;
        this.f4003c = interfaceC2137a;
    }
}
