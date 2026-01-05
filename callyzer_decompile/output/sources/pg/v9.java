package pg;

import ud.InterfaceC7397a;
import zb.InterfaceC8920n;
import zb.InterfaceC8921o;
import zb.InterfaceC8922p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v9 implements InterfaceC7397a {

    /* renamed from: a */
    public static final /* synthetic */ int f29091a = 0;

    /* renamed from: a */
    public abstract InterfaceC8921o mo8825a();

    /* renamed from: b */
    public abstract InterfaceC8920n mo8826b(InterfaceC8922p interfaceC8922p);

    @Override // ud.InterfaceC7397a
    public Object build() {
        return mo8826b((InterfaceC8922p) mo8825a().build());
    }
}
