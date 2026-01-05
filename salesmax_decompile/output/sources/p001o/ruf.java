package p001o;

import androidx.media3.common.C2181a;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class ruf extends yd1 {

    /* renamed from: o */
    public final int f44084o;

    /* renamed from: p */
    public final C2181a f44085p;

    /* renamed from: q */
    public long f44086q;

    /* renamed from: r */
    public boolean f44087r;

    public ruf(dz4 dz4Var, iz4 iz4Var, C2181a c2181a, int i, Object obj, long j, long j2, long j3, int i2, C2181a c2181a2) {
        super(dz4Var, iz4Var, c2181a, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f44084o = i2;
        this.f44085p = c2181a2;
    }

    @Override // p001o.xga.InterfaceC18153e
    /* renamed from: b */
    public void mo22073b() {
    }

    @Override // p001o.j1b
    /* renamed from: f */
    public boolean mo31353f() {
        return this.f44087r;
    }

    @Override // p001o.xga.InterfaceC18153e
    public void load() {
        ae1 ae1VarM57615h = m57615h();
        ae1VarM57615h.m16939b(0L);
        uth uthVarMo16940f = ae1VarM57615h.mo16940f(0, this.f44084o);
        uthVarMo16940f.mo7072b(this.f44085p);
        try {
            long jMo23960e = this.f31667i.mo23960e(this.f31660b.m32922e(this.f44086q));
            if (jMo23960e != -1) {
                jMo23960e += this.f44086q;
            }
            yd5 yd5Var = new yd5(this.f31667i, this.f44086q, jMo23960e);
            for (int iM52026c = 0; iM52026c != -1; iM52026c = uthVarMo16940f.m52026c(yd5Var, Api.BaseClientBuilder.API_PRIORITY_OTHER, true)) {
                this.f44086q += iM52026c;
            }
            uthVarMo16940f.mo7071a(this.f31665g, 1, (int) this.f44086q, 0, null);
            hz4.m31298a(this.f31667i);
            this.f44087r = true;
        } catch (Throwable th) {
            hz4.m31298a(this.f31667i);
            throw th;
        }
    }
}
