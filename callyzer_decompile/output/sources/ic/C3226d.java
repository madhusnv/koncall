package ic;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ic.d */
/* loaded from: classes.dex */
public final class C3226d extends AbstractC3225c {

    /* renamed from: a */
    public final C3223a f17392a;

    public C3226d() {
        C3223a c3223a = new C3223a();
        c3223a.f17390a = -1;
        this.f17392a = c3223a;
    }

    @Override // ic.AbstractC3225c
    /* renamed from: c */
    public final int mo7577c() {
        return ~this.f17392a.f17390a;
    }

    @Override // ic.InterfaceC3227e
    public final void reset() {
        this.f17392a.f17390a = -1;
    }

    @Override // ic.InterfaceC3227e
    public final void update(byte[] input, int i10, int i11) {
        AbstractC4154l.m8923f(input, "input");
        C3223a c3223a = this.f17392a;
        c3223a.getClass();
        List list = C3223a.f17389b;
        int iLongValue = c3223a.f17390a;
        while (i11 > 7) {
            int i12 = (input[i10] ^ iLongValue) & 255;
            int iLongValue2 = (int) (((((Number) list.get((((iLongValue >>> 8) ^ input[i10 + 1]) & 255) + 1536)).longValue() ^ ((Number) list.get(i12 + 1792)).longValue()) ^ ((Number) list.get((((iLongValue >>> 16) ^ input[i10 + 2]) & 255) + 1280)).longValue()) ^ ((Number) list.get((((iLongValue >>> 24) ^ input[i10 + 3]) & 255) + 1024)).longValue());
            int i13 = input[i10 + 4] & 255;
            iLongValue = iLongValue2 ^ ((int) (((((Number) list.get((input[i10 + 5] & 255) + 512)).longValue() ^ ((Number) list.get(i13 + 768)).longValue()) ^ ((Number) list.get((input[i10 + 6] & 255) + 256)).longValue()) ^ ((Number) list.get(input[i10 + 7] & 255)).longValue()));
            i10 += 8;
            i11 -= 8;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            iLongValue = ((int) ((Number) list.get((iLongValue ^ input[i10]) & 255)).longValue()) ^ (iLongValue >>> 8);
            i10++;
        }
        c3223a.f17390a = iLongValue;
    }
}
