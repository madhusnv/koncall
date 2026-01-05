package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes2.dex */
public final class aac {

    /* renamed from: a */
    public int f14382a;

    /* renamed from: b */
    public int f14383b;

    /* renamed from: c */
    public long f14384c;

    /* renamed from: d */
    public long f14385d;

    /* renamed from: e */
    public long f14386e;

    /* renamed from: f */
    public long f14387f;

    /* renamed from: g */
    public int f14388g;

    /* renamed from: h */
    public int f14389h;

    /* renamed from: i */
    public int f14390i;

    /* renamed from: j */
    public final int[] f14391j = new int[Constants.MAX_HOST_LENGTH];

    /* renamed from: k */
    public final zwc f14392k = new zwc(Constants.MAX_HOST_LENGTH);

    /* renamed from: a */
    public boolean m16768a(uq6 uq6Var, boolean z) throws byc {
        m16769b();
        this.f14392k.m60013Q(27);
        if (!wq6.m54804b(uq6Var, this.f14392k.m60024e(), 0, 27, z) || this.f14392k.m60006J() != 1332176723) {
            return false;
        }
        int iM60004H = this.f14392k.m60004H();
        this.f14382a = iM60004H;
        if (iM60004H != 0) {
            if (z) {
                return false;
            }
            throw byc.m19924d("unsupported bit stream revision");
        }
        this.f14383b = this.f14392k.m60004H();
        this.f14384c = this.f14392k.m60041v();
        this.f14385d = this.f14392k.m60043x();
        this.f14386e = this.f14392k.m60043x();
        this.f14387f = this.f14392k.m60043x();
        int iM60004H2 = this.f14392k.m60004H();
        this.f14388g = iM60004H2;
        this.f14389h = iM60004H2 + 27;
        this.f14392k.m60013Q(iM60004H2);
        if (!wq6.m54804b(uq6Var, this.f14392k.m60024e(), 0, this.f14388g, z)) {
            return false;
        }
        for (int i = 0; i < this.f14388g; i++) {
            this.f14391j[i] = this.f14392k.m60004H();
            this.f14390i += this.f14391j[i];
        }
        return true;
    }

    /* renamed from: b */
    public void m16769b() {
        this.f14382a = 0;
        this.f14383b = 0;
        this.f14384c = 0L;
        this.f14385d = 0L;
        this.f14386e = 0L;
        this.f14387f = 0L;
        this.f14388g = 0;
        this.f14389h = 0;
        this.f14390i = 0;
    }

    /* renamed from: c */
    public boolean m16770c(uq6 uq6Var) {
        return m16771d(uq6Var, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.mo40491d(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m16771d(uq6 uq6Var, long j) {
        op0.m42511a(uq6Var.getPosition() == uq6Var.mo40493g());
        this.f14392k.m60013Q(4);
        while (true) {
            if ((j != -1 && uq6Var.getPosition() + 4 >= j) || !wq6.m54804b(uq6Var, this.f14392k.m60024e(), 0, 4, true)) {
                break;
            }
            this.f14392k.m60017U(0);
            if (this.f14392k.m60006J() == 1332176723) {
                uq6Var.mo40490c();
                return true;
            }
            uq6Var.mo40496k(1);
        }
    }
}
