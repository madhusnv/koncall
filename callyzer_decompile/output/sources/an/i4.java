package an;

import ex.InterfaceC2139c;
import k8.InterfaceC4024a;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5405g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f942a;

    /* renamed from: b */
    public final /* synthetic */ m4 f943b;

    /* renamed from: c */
    public final /* synthetic */ C5405g f944c;

    public /* synthetic */ i4(m4 m4Var, C5405g c5405g, int i10) {
        this.f942a = i10;
        this.f943b = m4Var;
        this.f944c = c5405g;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC4024a _connection = (InterfaceC4024a) obj;
        switch (this.f942a) {
            case 0:
                AbstractC4154l.m8923f(_connection, "_connection");
                return Long.valueOf(this.f943b.f1107b.m501d(_connection, this.f944c));
            case 1:
                AbstractC4154l.m8923f(_connection, "_connection");
                return Integer.valueOf(this.f943b.f1109d.m513b(_connection, this.f944c));
            default:
                AbstractC4154l.m8923f(_connection, "_connection");
                return Long.valueOf(this.f943b.f1107b.m501d(_connection, this.f944c));
        }
    }
}
