package p001o;

import android.os.SystemClock;
import androidx.media3.common.C2181a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class df1 implements ko6 {

    /* renamed from: a */
    public final qth f19721a;

    /* renamed from: b */
    public final int f19722b;

    /* renamed from: c */
    public final int[] f19723c;

    /* renamed from: d */
    public final int f19724d;

    /* renamed from: e */
    public final C2181a[] f19725e;

    /* renamed from: f */
    public final long[] f19726f;

    /* renamed from: g */
    public int f19727g;

    public df1(qth qthVar, int[] iArr, int i) {
        int i2 = 0;
        op0.m42517g(iArr.length > 0);
        this.f19724d = i;
        this.f19721a = (qth) op0.m42515e(qthVar);
        int length = iArr.length;
        this.f19722b = length;
        this.f19725e = new C2181a[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f19725e[i3] = qthVar.m45839a(iArr[i3]);
        }
        Arrays.sort(this.f19725e, new Comparator() { // from class: o.cf1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return df1.m22946u((C2181a) obj, (C2181a) obj2);
            }
        });
        this.f19723c = new int[this.f19722b];
        while (true) {
            int i4 = this.f19722b;
            if (i2 >= i4) {
                this.f19726f = new long[i4];
                return;
            } else {
                this.f19723c[i2] = qthVar.m45840b(this.f19725e[i2]);
                i2++;
            }
        }
    }

    /* renamed from: u */
    public static /* synthetic */ int m22946u(C2181a c2181a, C2181a c2181a2) {
        return c2181a2.f7938i - c2181a.f7938i;
    }

    @Override // p001o.ko6
    /* renamed from: a */
    public boolean mo22947a(int i, long j) {
        return this.f19726f[i] > j;
    }

    @Override // p001o.wth
    /* renamed from: b */
    public final int mo22948b(C2181a c2181a) {
        for (int i = 0; i < this.f19722b; i++) {
            if (this.f19725e[i] == c2181a) {
                return i;
            }
        }
        return -1;
    }

    @Override // p001o.ko6
    public void disable() {
    }

    @Override // p001o.wth
    /* renamed from: e */
    public final C2181a mo22949e(int i) {
        return this.f19725e[i];
    }

    @Override // p001o.ko6
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        df1 df1Var = (df1) obj;
        return this.f19721a.equals(df1Var.f19721a) && Arrays.equals(this.f19723c, df1Var.f19723c);
    }

    @Override // p001o.wth
    /* renamed from: f */
    public final int mo22950f(int i) {
        return this.f19723c[i];
    }

    @Override // p001o.ko6
    /* renamed from: g */
    public boolean mo22951g(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo22947a = mo22947a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f19722b && !zMo22947a) {
            zMo22947a = (i2 == i || mo22947a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo22947a) {
            return false;
        }
        long[] jArr = this.f19726f;
        jArr[i] = Math.max(jArr[i], sqi.m48723b(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // p001o.ko6
    /* renamed from: h */
    public void mo19891h(float f) {
    }

    public int hashCode() {
        if (this.f19727g == 0) {
            this.f19727g = (System.identityHashCode(this.f19721a) * 31) + Arrays.hashCode(this.f19723c);
        }
        return this.f19727g;
    }

    @Override // p001o.wth
    /* renamed from: l */
    public final int mo22952l(int i) {
        for (int i2 = 0; i2 < this.f19722b; i2++) {
            if (this.f19723c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p001o.wth
    public final int length() {
        return this.f19723c.length;
    }

    @Override // p001o.wth
    /* renamed from: m */
    public final qth mo22953m() {
        return this.f19721a;
    }

    @Override // p001o.ko6
    /* renamed from: o */
    public int mo19892o(long j, List list) {
        return list.size();
    }

    @Override // p001o.ko6
    /* renamed from: p */
    public final int mo22954p() {
        return this.f19723c[mo16357d()];
    }

    @Override // p001o.ko6
    /* renamed from: q */
    public final C2181a mo22955q() {
        return this.f19725e[mo16357d()];
    }
}
