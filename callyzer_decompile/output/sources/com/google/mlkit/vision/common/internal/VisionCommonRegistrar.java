package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import il.AbstractC3295c;
import il.C3296d;
import java.util.List;
import mm.AbstractC4801l;
import pg.pa;
import pg.ra;
import pg.ta;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C6218a c6218aM12231a = C6219b.m12231a(C3296d.class);
        c6218aM12231a.m12227a(new C6228k(2, 0, AbstractC3295c.class));
        c6218aM12231a.f30212g = C3296d.f17529b;
        Object[] objArr = {c6218aM12231a.m12228b()};
        for (int i10 = 0; i10 < 1; i10++) {
            pa paVar = ra.f29050b;
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC4801l.m9730d(i10, "at index "));
            }
        }
        pa paVar2 = ra.f29050b;
        return new ta(1, objArr);
    }
}
