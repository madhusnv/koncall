package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import java.util.List;
import p001o.a7g;

/* loaded from: classes2.dex */
public final class uec extends a7g {

    /* renamed from: o */
    public static final byte[] f48769o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    public static final byte[] f48770p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    public boolean f48771n;

    /* renamed from: n */
    public static boolean m51401n(zwc zwcVar, byte[] bArr) {
        if (zwcVar.m60020a() < bArr.length) {
            return false;
        }
        int iM60025f = zwcVar.m60025f();
        byte[] bArr2 = new byte[bArr.length];
        zwcVar.m60031l(bArr2, 0, bArr.length);
        zwcVar.m60017U(iM60025f);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: o */
    public static boolean m51402o(zwc zwcVar) {
        return m51401n(zwcVar, f48769o);
    }

    @Override // p001o.a7g
    /* renamed from: f */
    public long mo16568f(zwc zwcVar) {
        return m16565c(vec.m52668e(zwcVar.m60024e()));
    }

    @Override // p001o.a7g
    /* renamed from: i */
    public boolean mo16571i(zwc zwcVar, long j, a7g.C12107b c12107b) {
        if (m51401n(zwcVar, f48769o)) {
            byte[] bArrCopyOf = Arrays.copyOf(zwcVar.m60024e(), zwcVar.m60026g());
            int iM52666c = vec.m52666c(bArrCopyOf);
            List listM52664a = vec.m52664a(bArrCopyOf);
            if (c12107b.f14257a != null) {
                return true;
            }
            c12107b.f14257a = new C2181a.b().o0("audio/opus").m6751N(iM52666c).p0(48000).b0(listM52664a).m6748K();
            return true;
        }
        byte[] bArr = f48770p;
        if (!m51401n(zwcVar, bArr)) {
            op0.m42519i(c12107b.f14257a);
            return false;
        }
        op0.m42519i(c12107b.f14257a);
        if (this.f48771n) {
            return true;
        }
        this.f48771n = true;
        zwcVar.m60018V(bArr.length);
        Metadata metadataM42925d = p2j.m42925d(nf8.m40512z(p2j.m42932k(zwcVar, false, false).f39256b));
        if (metadataM42925d == null) {
            return true;
        }
        c12107b.f14257a = c12107b.f14257a.m6707a().h0(metadataM42925d.m6694b(c12107b.f14257a.f7940k)).m6748K();
        return true;
    }

    @Override // p001o.a7g
    /* renamed from: l */
    public void mo16574l(boolean z) {
        super.mo16574l(z);
        if (z) {
            this.f48771n = false;
        }
    }
}
