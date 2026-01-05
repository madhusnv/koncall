package p001o;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public class osi {

    /* renamed from: a */
    public final float[] f38874a = new float[20];

    /* renamed from: b */
    public final long[] f38875b = new long[20];

    /* renamed from: c */
    public float f38876c = 0.0f;

    /* renamed from: d */
    public int f38877d = 0;

    /* renamed from: e */
    public int f38878e = 0;

    /* renamed from: f */
    public static float m42639f(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    /* renamed from: a */
    public void m42640a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f38877d != 0 && eventTime - this.f38875b[this.f38878e] > 40) {
            m42641b();
        }
        int i = (this.f38878e + 1) % 20;
        this.f38878e = i;
        int i2 = this.f38877d;
        if (i2 != 20) {
            this.f38877d = i2 + 1;
        }
        this.f38874a[i] = motionEvent.getAxisValue(26);
        this.f38875b[this.f38878e] = eventTime;
    }

    /* renamed from: b */
    public final void m42641b() {
        this.f38877d = 0;
        this.f38876c = 0.0f;
    }

    /* renamed from: c */
    public void m42642c(int i, float f) {
        float fM42644e = m42644e() * i;
        this.f38876c = fM42644e;
        if (fM42644e < (-Math.abs(f))) {
            this.f38876c = -Math.abs(f);
        } else if (this.f38876c > Math.abs(f)) {
            this.f38876c = Math.abs(f);
        }
    }

    /* renamed from: d */
    public float m42643d(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.f38876c;
    }

    /* renamed from: e */
    public final float m42644e() {
        long[] jArr;
        long j;
        int i = this.f38877d;
        if (i < 2) {
            return 0.0f;
        }
        int i2 = this.f38878e;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j2 = this.f38875b[i2];
        while (true) {
            jArr = this.f38875b;
            j = jArr[i3];
            if (j2 - j <= 100) {
                break;
            }
            this.f38877d--;
            i3 = (i3 + 1) % 20;
        }
        int i4 = this.f38877d;
        if (i4 < 2) {
            return 0.0f;
        }
        if (i4 == 2) {
            int i5 = (i3 + 1) % 20;
            if (j == jArr[i5]) {
                return 0.0f;
            }
            return this.f38874a[i5] / (r2 - j);
        }
        float fAbs = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f38877d - 1; i7++) {
            int i8 = i7 + i3;
            long[] jArr2 = this.f38875b;
            long j3 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j3) {
                i6++;
                float fM42639f = m42639f(fAbs);
                float f = this.f38874a[i9] / (this.f38875b[i9] - j3);
                fAbs += (f - fM42639f) * Math.abs(f);
                if (i6 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return m42639f(fAbs);
    }
}
