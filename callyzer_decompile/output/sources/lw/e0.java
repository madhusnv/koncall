package lw;

import c3.C0847b;
import fb.AbstractC2228b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import t3.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a */
    public final List f22573a;

    /* renamed from: b */
    public final float f22574b;

    /* renamed from: c */
    public final C4537b f22575c;

    public e0(List pieSliceData, float f6, C4537b c4537b) {
        AbstractC4154l.m8923f(pieSliceData, "pieSliceData");
        this.f22573a = pieSliceData;
        this.f22574b = f6;
        this.f22575c = c4537b;
    }

    /* renamed from: a */
    public final long m9398a(ArrayList arrayList, ArrayList arrayList2, float f6) {
        float fMax = f6 / 2.0f;
        int size = arrayList.size();
        float fMin = (-f6) / 2.0f;
        int i10 = 0;
        int i11 = 0;
        float fMax2 = fMax;
        float fMin2 = fMin;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            w0 w0Var = (w0) obj;
            C0847b c0847bM5937a = AbstractC2228b.m5937a((InterfaceC4544i) arrayList2.get(i10));
            if (c0847bM5937a != null) {
                long j6 = c0847bM5937a.f5352a;
                int i13 = (int) (j6 >> 32);
                fMin2 = Math.min(fMin2, Float.intBitsToFloat(i13));
                fMax = Math.max(fMax, Float.intBitsToFloat(i13) + w0Var.f34030a);
                int i14 = (int) (j6 & 4294967295L);
                fMin = Math.min(fMin, Float.intBitsToFloat(i14));
                fMax2 = Math.max(fMax2, Float.intBitsToFloat(i14) + w0Var.f34031b);
            }
            i10 = i12;
        }
        return (Float.floatToRawIntBits(fMax2 - fMin) & 4294967295L) | (Float.floatToRawIntBits(fMax - fMin2) << 32);
    }
}
