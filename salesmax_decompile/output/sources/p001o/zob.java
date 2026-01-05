package p001o;

import java.util.Map;
import p001o.wb9;

/* loaded from: classes3.dex */
public final class zob extends di6 implements wb9.InterfaceC17813a {

    /* renamed from: d */
    public final Map.Entry f57453d;

    /* renamed from: e */
    public final xk7 f57454e;

    /* renamed from: f */
    public final xk7 f57455f;

    /* renamed from: g */
    public final xk7 f57456g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zob(Map.Entry entry, xk7 xk7Var, xk7 xk7Var2, xk7 xk7Var3) {
        super(entry, xk7Var, xk7Var2);
        sq8.m48649h(entry, "src");
        sq8.m48649h(xk7Var, "kSrc2Dest");
        sq8.m48649h(xk7Var2, "vSrc2Dest");
        sq8.m48649h(xk7Var3, "vDest2Src");
        this.f57453d = entry;
        this.f57454e = xk7Var;
        this.f57455f = xk7Var2;
        this.f57456g = xk7Var3;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        return this.f57455f.invoke(this.f57453d.setValue(this.f57456g.invoke(obj)));
    }
}
