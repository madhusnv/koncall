package j5;

import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j5.i */
/* loaded from: classes.dex */
public final class C3592i {

    /* renamed from: a */
    public boolean f19191a;

    /* renamed from: e */
    public float f19195e;

    /* renamed from: i */
    public EnumC3591h f19199i;

    /* renamed from: b */
    public int f19192b = -1;

    /* renamed from: c */
    public int f19193c = -1;

    /* renamed from: d */
    public int f19194d = 0;

    /* renamed from: f */
    public boolean f19196f = false;

    /* renamed from: g */
    public final float[] f19197g = new float[9];

    /* renamed from: h */
    public final float[] f19198h = new float[9];

    /* renamed from: j */
    public C3586c[] f19200j = new C3586c[16];

    /* renamed from: k */
    public int f19201k = 0;

    /* renamed from: l */
    public int f19202l = 0;

    public C3592i(EnumC3591h enumC3591h) {
        this.f19199i = enumC3591h;
    }

    /* renamed from: a */
    public final void m8151a(C3586c c3586c) {
        int i10 = 0;
        while (true) {
            int i11 = this.f19201k;
            if (i10 >= i11) {
                C3586c[] c3586cArr = this.f19200j;
                if (i11 >= c3586cArr.length) {
                    this.f19200j = (C3586c[]) Arrays.copyOf(c3586cArr, c3586cArr.length * 2);
                }
                C3586c[] c3586cArr2 = this.f19200j;
                int i12 = this.f19201k;
                c3586cArr2[i12] = c3586c;
                this.f19201k = i12 + 1;
                return;
            }
            if (this.f19200j[i10] == c3586c) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: b */
    public final void m8152b(C3586c c3586c) {
        int i10 = this.f19201k;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f19200j[i11] == c3586c) {
                while (i11 < i10 - 1) {
                    C3586c[] c3586cArr = this.f19200j;
                    int i12 = i11 + 1;
                    c3586cArr[i11] = c3586cArr[i12];
                    i11 = i12;
                }
                this.f19201k--;
                return;
            }
            i11++;
        }
    }

    /* renamed from: c */
    public final void m8153c() {
        this.f19199i = EnumC3591h.UNKNOWN;
        this.f19194d = 0;
        this.f19192b = -1;
        this.f19193c = -1;
        this.f19195e = DefinitionKt.NO_Float_VALUE;
        this.f19196f = false;
        int i10 = this.f19201k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19200j[i11] = null;
        }
        this.f19201k = 0;
        this.f19202l = 0;
        this.f19191a = false;
        Arrays.fill(this.f19198h, DefinitionKt.NO_Float_VALUE);
    }

    /* renamed from: d */
    public final void m8154d(C3586c c3586c) {
        int i10 = this.f19201k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19200j[i11].mo8130h(c3586c, false);
        }
        this.f19201k = 0;
    }

    public final String toString() {
        return "" + this.f19192b;
    }
}
