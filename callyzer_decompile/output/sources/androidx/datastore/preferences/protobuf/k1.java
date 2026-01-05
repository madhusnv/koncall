package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 extends m1 {

    /* renamed from: b */
    public final /* synthetic */ int f2361b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f2361b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: c */
    public final boolean mo930c(long j6, Object obj) {
        switch (this.f2361b) {
            case 0:
                if (!n1.f2385g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!n1.f2385g) {
                    break;
                } else {
                    break;
                }
        }
        return n1.m1009c(j6, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: d */
    public final double mo931d(long j6, Object obj) {
        switch (this.f2361b) {
        }
        return Double.longBitsToDouble(m1001g(j6, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: e */
    public final float mo932e(long j6, Object obj) {
        switch (this.f2361b) {
        }
        return Float.intBitsToFloat(m1000f(j6, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: j */
    public final void mo933j(Object obj, long j6, boolean z6) {
        switch (this.f2361b) {
            case 0:
                if (!n1.f2385g) {
                    n1.m1018l(obj, j6, z6 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    n1.m1017k(obj, j6, z6 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!n1.f2385g) {
                    n1.m1018l(obj, j6, z6 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    n1.m1017k(obj, j6, z6 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: k */
    public final void mo934k(Object obj, long j6, byte b10) {
        switch (this.f2361b) {
            case 0:
                if (!n1.f2385g) {
                    n1.m1018l(obj, j6, b10);
                    break;
                } else {
                    n1.m1017k(obj, j6, b10);
                    break;
                }
            default:
                if (!n1.f2385g) {
                    n1.m1018l(obj, j6, b10);
                    break;
                } else {
                    n1.m1017k(obj, j6, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: l */
    public final void mo935l(Object obj, long j6, double d2) {
        switch (this.f2361b) {
            case 0:
                m1005o(obj, j6, Double.doubleToLongBits(d2));
                break;
            default:
                m1005o(obj, j6, Double.doubleToLongBits(d2));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: m */
    public final void mo936m(Object obj, long j6, float f6) {
        switch (this.f2361b) {
            case 0:
                m1004n(Float.floatToIntBits(f6), j6, obj);
                break;
            default:
                m1004n(Float.floatToIntBits(f6), j6, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: r */
    public final boolean mo937r() {
        switch (this.f2361b) {
        }
        return false;
    }
}
