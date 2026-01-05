package c0;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends d0 {

    /* renamed from: d */
    public final a1[] f5293d;

    /* renamed from: e */
    public final int f5294e;

    /* renamed from: f */
    public final int f5295f;

    public z0(b1 b1Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11) {
        super(b1Var);
        this.f5293d = new a1[]{new y0(i10, byteBuffer), new y0(byteBuffer2, i10), new y0(byteBuffer3, i10)};
        this.f5294e = i10;
        this.f5295f = i11;
    }

    @Override // c0.d0, c0.b1
    /* renamed from: b */
    public final int mo2136b() {
        return this.f5294e;
    }

    @Override // c0.d0, c0.b1
    public final int getHeight() {
        return this.f5295f;
    }

    @Override // c0.d0, c0.b1
    /* renamed from: l */
    public final a1[] mo2137l() {
        return this.f5293d;
    }
}
