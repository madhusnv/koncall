package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o1 extends q1 {

    /* renamed from: b */
    public final /* synthetic */ int f7083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f7083b = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    /* renamed from: c */
    public final boolean mo4355c(long j6, Object obj) {
        switch (this.f7083b) {
            case 0:
                if (r1.f7099h) {
                    if (r1.m4384g(j6, obj) == 0) {
                    }
                } else if (r1.m4385h(j6, obj) == 0) {
                }
                break;
            default:
                if (r1.f7099h) {
                    if (r1.m4384g(j6, obj) == 0) {
                    }
                } else if (r1.m4385h(j6, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    /* renamed from: d */
    public final byte mo4356d(long j6, Object obj) {
        switch (this.f7083b) {
            case 0:
                if (!r1.f7099h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!r1.f7099h) {
                    break;
                } else {
                    break;
                }
        }
        return r1.m4385h(j6, obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    /* renamed from: e */
    public final double mo4357e(long j6, Object obj) {
        switch (this.f7083b) {
        }
        return Double.longBitsToDouble(m4372h(j6, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    /* renamed from: f */
    public final float mo4358f(long j6, Object obj) {
        switch (this.f7083b) {
        }
        return Float.intBitsToFloat(m4371g(j6, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    /* renamed from: k */
    public final void mo4359k(Object obj, long j6, boolean z6) {
        switch (this.f7083b) {
            case 0:
                if (!r1.f7099h) {
                    r1.m4389l(obj, j6, z6 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    r1.m4388k(obj, j6, z6 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!r1.f7099h) {
                    r1.m4389l(obj, j6, z6 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    r1.m4388k(obj, j6, z6 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    /* renamed from: l */
    public final void mo4360l(Object obj, long j6, byte b10) {
        switch (this.f7083b) {
            case 0:
                if (!r1.f7099h) {
                    r1.m4389l(obj, j6, b10);
                    break;
                } else {
                    r1.m4388k(obj, j6, b10);
                    break;
                }
            default:
                if (!r1.f7099h) {
                    r1.m4389l(obj, j6, b10);
                    break;
                } else {
                    r1.m4388k(obj, j6, b10);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    /* renamed from: m */
    public final void mo4361m(Object obj, long j6, double d2) {
        switch (this.f7083b) {
            case 0:
                m4376p(obj, j6, Double.doubleToLongBits(d2));
                break;
            default:
                m4376p(obj, j6, Double.doubleToLongBits(d2));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    /* renamed from: n */
    public final void mo4362n(Object obj, long j6, float f6) {
        switch (this.f7083b) {
            case 0:
                m4375o(Float.floatToIntBits(f6), j6, obj);
                break;
            default:
                m4375o(Float.floatToIntBits(f6), j6, obj);
                break;
        }
    }
}
