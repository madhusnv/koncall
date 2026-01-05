package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g5 implements z5 {

    /* renamed from: b */
    public static final g5 f6213b = new g5(0);

    /* renamed from: a */
    public final /* synthetic */ int f6214a;

    public /* synthetic */ g5(int i10) {
        this.f6214a = i10;
    }

    /* renamed from: c */
    public static final x5 m3294c(Object obj, Object obj2) {
        x5 x5VarM3774b = (x5) obj;
        x5 x5Var = (x5) obj2;
        if (!x5Var.isEmpty()) {
            if (!x5VarM3774b.f6447a) {
                x5VarM3774b = x5VarM3774b.m3774b();
            }
            x5VarM3774b.m3775f();
            if (!x5Var.isEmpty()) {
                x5VarM3774b.putAll(x5Var);
            }
        }
        return x5VarM3774b;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    /* renamed from: a */
    public boolean mo3295a(Class cls) {
        switch (this.f6214a) {
            case 0:
                return i5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    /* renamed from: b */
    public h6 mo3296b(Class cls) {
        switch (this.f6214a) {
            case 0:
                if (!i5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (h6) i5.m3331l(cls.asSubclass(i5.class)).mo3102o(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
