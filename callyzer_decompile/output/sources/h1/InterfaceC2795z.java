package h1;

import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.z */
/* loaded from: classes.dex */
public interface InterfaceC2795z extends InterfaceC2779j {
    @Override // h1.InterfaceC2779j
    /* renamed from: a */
    default z1 mo6766a(x1 x1Var) {
        return new C8090p(this);
    }

    /* renamed from: b */
    long mo6767b(float f6, float f10, float f11);

    /* renamed from: c */
    float mo6768c(float f6, float f10, float f11, long j6);

    /* renamed from: d */
    default float mo6769d(float f6, float f10, float f11) {
        return mo6768c(f6, f10, f11, mo6767b(f6, f10, f11));
    }

    /* renamed from: e */
    float mo6770e(float f6, float f10, float f11, long j6);
}
