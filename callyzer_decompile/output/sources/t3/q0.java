package t3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 implements h1, InterfaceC7023j {

    /* renamed from: b */
    public static final q0 f34016b = new q0(0);

    /* renamed from: a */
    public final /* synthetic */ int f34017a;

    public /* synthetic */ q0(int i10) {
        this.f34017a = i10;
    }

    @Override // t3.InterfaceC7023j
    /* renamed from: a */
    public long mo13315a(long j6, long j10) {
        switch (this.f34017a) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j6 & 4294967295L)));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
                int i10 = a1.f33955a;
                return jFloatToRawIntBits;
            case 2:
                float fM13275d = c1.m13275d(j6, j10);
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fM13275d) << 32) | (Float.floatToRawIntBits(fM13275d) & 4294967295L);
                int i11 = a1.f33955a;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j6 >> 32)) <= Float.intBitsToFloat((int) (j10 >> 32)) && Float.intBitsToFloat((int) (j6 & 4294967295L)) <= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i12 = a1.f33955a;
                    return jFloatToRawIntBits3;
                }
                float fM13275d2 = c1.m13275d(j6, j10);
                long jFloatToRawIntBits4 = (Float.floatToRawIntBits(fM13275d2) << 32) | (Float.floatToRawIntBits(fM13275d2) & 4294967295L);
                int i13 = a1.f33955a;
                return jFloatToRawIntBits4;
        }
    }

    @Override // t3.h1
    /* renamed from: h */
    public boolean mo13308h(Object obj, Object obj2) {
        return false;
    }

    @Override // t3.h1
    /* renamed from: j */
    public void mo13309j(e1.y0 y0Var) {
        y0Var.clear();
    }

    public String toString() {
        switch (this.f34017a) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
