package yi;

import cj.C0979e;
import java.io.IOException;
import ug.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yi.f */
/* loaded from: classes.dex */
public final class C8677f implements InterfaceC8682k {

    /* renamed from: c */
    public static final a0 f42014c = new a0(24);

    /* renamed from: a */
    public final Object f42015a;

    /* renamed from: b */
    public Object f42016b;

    public C8677f(C0979e c0979e) {
        this.f42015a = c0979e;
        this.f42016b = f42014c;
    }

    @Override // yi.InterfaceC8682k
    /* renamed from: a */
    public void mo163a(C8681j c8681j, int i10) throws IOException {
        int[] iArr = (int[]) this.f42016b;
        try {
            c8681j.read((byte[]) this.f42015a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            c8681j.close();
        }
    }

    public C8677f(byte[] bArr, int[] iArr) {
        this.f42015a = bArr;
        this.f42016b = iArr;
    }
}
