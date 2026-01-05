package nk;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import mk.InterfaceC4777p;
import pk.AbstractC5973c;
import rk.C6564a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends a0 {

    /* renamed from: b */
    public final InterfaceC4777p f24890b;

    public b0(InterfaceC4777p interfaceC4777p, c0 c0Var) {
        super(c0Var);
        this.f24890b = interfaceC4777p;
    }

    @Override // nk.a0
    /* renamed from: d */
    public final Object mo10009d() {
        return this.f24890b.mo28i();
    }

    @Override // nk.a0
    /* renamed from: f */
    public final void mo10011f(Object obj, C6564a c6564a, C5103z c5103z) throws IllegalAccessException, IllegalArgumentException {
        Field field = c5103z.f24995b;
        Object objMo8851b = c5103z.f25000g.mo8851b(c6564a);
        if (objMo8851b == null && c5103z.f25001h) {
            return;
        }
        if (c5103z.f24997d) {
            e0.m10012b(obj, field);
        } else if (c5103z.f25002i) {
            throw new JsonIOException(i0.m0.m7378k("Cannot set value of 'static final' ", AbstractC5973c.m12007d(field, false)));
        }
        field.set(obj, objMo8851b);
    }

    @Override // nk.a0
    /* renamed from: e */
    public final Object mo10010e(Object obj) {
        return obj;
    }
}
