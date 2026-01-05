package h1;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 implements InterfaceC2795z {

    /* renamed from: a */
    public final float f15354a;

    /* renamed from: b */
    public final z0 f15355b;

    public b0(float f6, float f10, float f11) {
        this.f15354a = f11;
        z0 z0Var = new z0();
        z0Var.f15673a = 1.0f;
        z0Var.f15674b = Math.sqrt(50.0d);
        z0Var.f15675c = 1.0f;
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            n0.m6839a("Damping ratio must be non-negative");
        }
        z0Var.f15675c = f6;
        double d2 = z0Var.f15674b;
        if (((float) (d2 * d2)) <= DefinitionKt.NO_Float_VALUE) {
            n0.m6839a("Spring stiffness constant must be positive.");
        }
        z0Var.f15674b = Math.sqrt(f10);
        this.f15355b = z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // h1.InterfaceC2795z
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo6767b(float r33, float r34, float r35) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b0.mo6767b(float, float, float):long");
    }

    @Override // h1.InterfaceC2795z
    /* renamed from: c */
    public final float mo6768c(float f6, float f10, float f11, long j6) {
        z0 z0Var = this.f15355b;
        z0Var.f15673a = f10;
        return Float.intBitsToFloat((int) (z0Var.m6883a(f6, f11, j6 / 1000000) & 4294967295L));
    }

    @Override // h1.InterfaceC2795z
    /* renamed from: d */
    public final float mo6769d(float f6, float f10, float f11) {
        return DefinitionKt.NO_Float_VALUE;
    }

    @Override // h1.InterfaceC2795z
    /* renamed from: e */
    public final float mo6770e(float f6, float f10, float f11, long j6) {
        z0 z0Var = this.f15355b;
        z0Var.f15673a = f10;
        return Float.intBitsToFloat((int) (z0Var.m6883a(f6, f11, j6 / 1000000) >> 32));
    }
}
