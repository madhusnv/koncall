package nk;

import com.google.gson.reflect.TypeToken;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4091k;
import kk.InterfaceC4096p;
import kk.InterfaceC4104x;
import mk.AbstractC4770i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 implements InterfaceC4104x {

    /* renamed from: a */
    public final TypeToken f24917a;

    /* renamed from: b */
    public final boolean f24918b;

    /* renamed from: c */
    public final InterfaceC4096p f24919c;

    /* renamed from: d */
    public final InterfaceC4091k f24920d;

    public g0(Object obj, TypeToken typeToken, boolean z6) {
        InterfaceC4096p interfaceC4096p = obj instanceof InterfaceC4096p ? (InterfaceC4096p) obj : null;
        this.f24919c = interfaceC4096p;
        InterfaceC4091k interfaceC4091k = obj instanceof InterfaceC4091k ? (InterfaceC4091k) obj : null;
        this.f24920d = interfaceC4091k;
        AbstractC4770i.m9689b((interfaceC4096p == null && interfaceC4091k == null) ? false : true);
        this.f24917a = typeToken;
        this.f24918b = z6;
    }

    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        TypeToken typeToken2 = this.f24917a;
        if (typeToken2 == null) {
            typeToken.getRawType();
            throw null;
        }
        if (!typeToken2.equals(typeToken) && (!this.f24918b || typeToken2.getType() != typeToken.getRawType())) {
            return null;
        }
        return new h0(this.f24919c, this.f24920d, c4088h, typeToken, this, true);
    }
}
