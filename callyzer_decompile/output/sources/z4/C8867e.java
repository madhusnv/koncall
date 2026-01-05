package z4;

import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z4.e */
/* loaded from: classes.dex */
public final class C8867e implements Comparable {

    /* renamed from: a */
    public boolean f42670a;

    /* renamed from: e */
    public float f42674e;

    /* renamed from: j */
    public EnumC8866d f42678j;

    /* renamed from: b */
    public int f42671b = -1;

    /* renamed from: c */
    public int f42672c = -1;

    /* renamed from: d */
    public int f42673d = 0;

    /* renamed from: f */
    public boolean f42675f = false;

    /* renamed from: g */
    public final float[] f42676g = new float[9];

    /* renamed from: h */
    public final float[] f42677h = new float[9];

    /* renamed from: k */
    public C8863a[] f42679k = new C8863a[16];

    /* renamed from: l */
    public int f42680l = 0;

    /* renamed from: m */
    public int f42681m = 0;

    public C8867e(EnumC8866d enumC8866d) {
        this.f42678j = enumC8866d;
    }

    /* renamed from: a */
    public final void m16369a(C8863a c8863a) {
        int i10 = 0;
        while (true) {
            int i11 = this.f42680l;
            if (i10 >= i11) {
                C8863a[] c8863aArr = this.f42679k;
                if (i11 >= c8863aArr.length) {
                    this.f42679k = (C8863a[]) Arrays.copyOf(c8863aArr, c8863aArr.length * 2);
                }
                C8863a[] c8863aArr2 = this.f42679k;
                int i12 = this.f42680l;
                c8863aArr2[i12] = c8863a;
                this.f42680l = i12 + 1;
                return;
            }
            if (this.f42679k[i10] == c8863a) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: b */
    public final void m16370b(C8863a c8863a) {
        int i10 = this.f42680l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f42679k[i11] == c8863a) {
                while (i11 < i10 - 1) {
                    C8863a[] c8863aArr = this.f42679k;
                    int i12 = i11 + 1;
                    c8863aArr[i11] = c8863aArr[i12];
                    i11 = i12;
                }
                this.f42680l--;
                return;
            }
            i11++;
        }
    }

    /* renamed from: c */
    public final void m16371c() {
        this.f42678j = EnumC8866d.UNKNOWN;
        this.f42673d = 0;
        this.f42671b = -1;
        this.f42672c = -1;
        this.f42674e = DefinitionKt.NO_Float_VALUE;
        this.f42675f = false;
        int i10 = this.f42680l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f42679k[i11] = null;
        }
        this.f42680l = 0;
        this.f42681m = 0;
        this.f42670a = false;
        Arrays.fill(this.f42677h, DefinitionKt.NO_Float_VALUE);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f42671b - ((C8867e) obj).f42671b;
    }

    /* renamed from: d */
    public final void m16372d(C8864b c8864b, float f6) {
        this.f42674e = f6;
        this.f42675f = true;
        int i10 = this.f42680l;
        this.f42672c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f42679k[i11].m16346h(c8864b, this, false);
        }
        this.f42680l = 0;
    }

    /* renamed from: e */
    public final void m16373e(C8864b c8864b, C8863a c8863a) {
        int i10 = this.f42680l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f42679k[i11].mo16347i(c8864b, c8863a, false);
        }
        this.f42680l = 0;
    }

    public final String toString() {
        return "" + this.f42671b;
    }
}
