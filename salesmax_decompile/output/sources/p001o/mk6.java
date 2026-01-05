package p001o;

import androidx.media3.common.C2181a;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class mk6 implements t0f {

    /* renamed from: a */
    public final C2181a f35592a;

    /* renamed from: c */
    public long[] f35594c;

    /* renamed from: d */
    public boolean f35595d;

    /* renamed from: e */
    public uk6 f35596e;

    /* renamed from: f */
    public boolean f35597f;

    /* renamed from: g */
    public int f35598g;

    /* renamed from: b */
    public final kk6 f35593b = new kk6();

    /* renamed from: h */
    public long f35599h = -9223372036854775807L;

    public mk6(uk6 uk6Var, C2181a c2181a, boolean z) {
        this.f35592a = c2181a;
        this.f35596e = uk6Var;
        this.f35594c = uk6Var.f49012b;
        m39272d(uk6Var, z);
    }

    @Override // p001o.t0f
    /* renamed from: a */
    public void mo26371a() {
    }

    /* renamed from: b */
    public String m39270b() {
        return this.f35596e.m51680a();
    }

    /* renamed from: c */
    public void m39271c(long j) {
        int iM48725d = sqi.m48725d(this.f35594c, j, true, false);
        this.f35598g = iM48725d;
        if (!(this.f35595d && iM48725d == this.f35594c.length)) {
            j = -9223372036854775807L;
        }
        this.f35599h = j;
    }

    /* renamed from: d */
    public void m39272d(uk6 uk6Var, boolean z) {
        int i = this.f35598g;
        long j = i == 0 ? -9223372036854775807L : this.f35594c[i - 1];
        this.f35595d = z;
        this.f35596e = uk6Var;
        long[] jArr = uk6Var.f49012b;
        this.f35594c = jArr;
        long j2 = this.f35599h;
        if (j2 != -9223372036854775807L) {
            m39271c(j2);
        } else if (j != -9223372036854775807L) {
            this.f35598g = sqi.m48725d(jArr, j, false, false);
        }
    }

    @Override // p001o.t0f
    /* renamed from: f */
    public int mo26373f(if7 if7Var, a85 a85Var, int i) throws IOException {
        int i2 = this.f35598g;
        boolean z = i2 == this.f35594c.length;
        if (z && !this.f35595d) {
            a85Var.m50154t(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f35597f) {
            if7Var.f28594b = this.f35592a;
            this.f35597f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f35598g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrM35802a = this.f35593b.m35802a(this.f35596e.f49011a[i2]);
            a85Var.m16676v(bArrM35802a.length);
            a85Var.f14282d.put(bArrM35802a);
        }
        a85Var.f14284f = this.f35594c[i2];
        a85Var.m50154t(1);
        return -4;
    }

    @Override // p001o.t0f
    public boolean isReady() {
        return true;
    }

    @Override // p001o.t0f
    /* renamed from: p */
    public int mo26374p(long j) {
        int iMax = Math.max(this.f35598g, sqi.m48725d(this.f35594c, j, true, false));
        int i = iMax - this.f35598g;
        this.f35598g = iMax;
        return i;
    }
}
