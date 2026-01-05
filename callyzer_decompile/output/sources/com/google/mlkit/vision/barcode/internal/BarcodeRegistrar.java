package com.google.mlkit.vision.barcode.internal;

import al.C0174b;
import al.C0176d;
import al.C0178f;
import bl.C0689a;
import com.google.firebase.components.ComponentRegistrar;
import gl.C2626b;
import gl.C2628d;
import java.util.List;
import mm.AbstractC4801l;
import og.C5384y;
import og.a0;
import og.e0;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C6218a c6218aM12231a = C6219b.m12231a(C2628d.class);
        c6218aM12231a.m12227a(C6228k.m12246a(C0178f.class));
        c6218aM12231a.f30212g = new C0174b(15);
        C6219b c6219bM12228b = c6218aM12231a.m12228b();
        C6218a c6218aM12231a2 = C6219b.m12231a(C2626b.class);
        c6218aM12231a2.m12227a(C6228k.m12246a(C2628d.class));
        c6218aM12231a2.m12227a(C6228k.m12246a(C0176d.class));
        c6218aM12231a2.m12227a(C6228k.m12246a(C0178f.class));
        c6218aM12231a2.f30212g = new C0689a(15);
        C6219b c6219bM12228b2 = c6218aM12231a2.m12228b();
        C5384y c5384y = a0.f26308b;
        Object[] objArr = {c6219bM12228b, c6219bM12228b2};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC4801l.m9730d(i10, "at index "));
            }
        }
        return new e0(2, objArr);
    }
}
