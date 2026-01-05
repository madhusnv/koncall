package c0;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 implements a1 {

    /* renamed from: a */
    public final /* synthetic */ int f5285a = 0;

    /* renamed from: b */
    public final ByteBuffer f5286b;

    /* renamed from: c */
    public final int f5287c;

    public y0(int i10, ByteBuffer byteBuffer) {
        this.f5287c = i10;
        this.f5286b = byteBuffer;
    }

    @Override // c0.a1
    /* renamed from: J */
    public final int mo2140J() {
        switch (this.f5285a) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    @Override // c0.a1
    /* renamed from: a */
    public final ByteBuffer mo2141a() {
        switch (this.f5285a) {
        }
        return this.f5286b;
    }

    @Override // c0.a1
    /* renamed from: p */
    public final int mo2142p() {
        switch (this.f5285a) {
        }
        return this.f5287c;
    }

    public y0(ByteBuffer byteBuffer, int i10) {
        this.f5286b = byteBuffer;
        this.f5287c = i10;
    }
}
