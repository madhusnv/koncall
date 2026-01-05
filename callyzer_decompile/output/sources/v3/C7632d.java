package v3;

import u3.C7336g;
import u3.InterfaceC7335f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.d */
/* loaded from: classes.dex */
public final class C7632d implements InterfaceC7335f {

    /* renamed from: a */
    public final /* synthetic */ int f36792a;

    /* renamed from: a */
    public static final int m14535a(int i10, long j6) {
        int i11 = y1.f37076b;
        return ((int) (j6 >> (i10 * 15))) & 32767;
    }

    /* renamed from: c */
    public static long m14536c(int i10, int i11, int i12, int i13) {
        return ((i11 & 32767) << 15) | (i10 & 32767) | ((i12 & 32767) << 30) | ((i13 & 32767) << 45) | Long.MIN_VALUE;
    }

    /* renamed from: b */
    public int m14537b() {
        switch (this.f36792a) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ex.a, kotlin.jvm.internal.m] */
    @Override // u3.InterfaceC7335f
    /* renamed from: d */
    public Object mo13728d(C7336g c7336g) {
        return c7336g.f34953a.invoke();
    }
}
