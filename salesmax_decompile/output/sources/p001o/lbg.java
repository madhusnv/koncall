package p001o;

import androidx.media3.common.C2181a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001o.qbg;

/* loaded from: classes2.dex */
public class lbg implements tq6 {

    /* renamed from: a */
    public final qbg f33567a;

    /* renamed from: c */
    public final C2181a f33569c;

    /* renamed from: g */
    public uth f33573g;

    /* renamed from: h */
    public int f33574h;

    /* renamed from: b */
    public final gd4 f33568b = new gd4();

    /* renamed from: f */
    public byte[] f33572f = sqi.f45795f;

    /* renamed from: e */
    public final zwc f33571e = new zwc();

    /* renamed from: d */
    public final List f33570d = new ArrayList();

    /* renamed from: i */
    public int f33575i = 0;

    /* renamed from: j */
    public long[] f33576j = sqi.f45796g;

    /* renamed from: k */
    public long f33577k = -9223372036854775807L;

    /* renamed from: o.lbg$b */
    public static class C15054b implements Comparable {

        /* renamed from: a */
        public final long f33578a;

        /* renamed from: b */
        public final byte[] f33579b;

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15054b c15054b) {
            return Long.compare(this.f33578a, c15054b.f33578a);
        }

        public C15054b(long j, byte[] bArr) {
            this.f33578a = j;
            this.f33579b = bArr;
        }
    }

    public lbg(qbg qbgVar, C2181a c2181a) {
        this.f33567a = qbgVar;
        this.f33569c = c2181a.m6707a().o0("application/x-media3-cues").m6752O(c2181a.f7943n).m6756S(qbgVar.mo29159c()).m6748K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m36868e(jd4 jd4Var) {
        C15054b c15054b = new C15054b(jd4Var.f30187b, this.f33568b.m28471a(jd4Var.f30186a, jd4Var.f30188c));
        this.f33570d.add(c15054b);
        long j = this.f33577k;
        if (j == -9223372036854775807L || jd4Var.f30187b >= j) {
            m36873m(c15054b);
        }
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        int i = this.f33575i;
        op0.m42517g((i == 0 || i == 5) ? false : true);
        this.f33577k = j2;
        if (this.f33575i == 2) {
            this.f33575i = 1;
        }
        if (this.f33575i == 4) {
            this.f33575i = 3;
        }
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        return true;
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        op0.m42517g(this.f33575i == 0);
        uth uthVarMo32487f = vq6Var.mo32487f(0, 3);
        this.f33573g = uthVarMo32487f;
        uthVarMo32487f.mo7072b(this.f33569c);
        vq6Var.mo32489p();
        vq6Var.mo32490r(new wh8(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f33575i = 1;
    }

    /* renamed from: g */
    public final void m36869g() throws byc {
        try {
            long j = this.f33577k;
            this.f33567a.mo29158a(this.f33572f, 0, this.f33574h, j != -9223372036854775807L ? qbg.C16330b.m45067c(j) : qbg.C16330b.m45066b(), new fu3() { // from class: o.kbg
                @Override // p001o.fu3
                public final void accept(Object obj) {
                    this.f31894a.m36868e((jd4) obj);
                }
            });
            Collections.sort(this.f33570d);
            this.f33576j = new long[this.f33570d.size()];
            for (int i = 0; i < this.f33570d.size(); i++) {
                this.f33576j[i] = ((C15054b) this.f33570d.get(i)).f33578a;
            }
            this.f33572f = sqi.f45795f;
        } catch (RuntimeException e) {
            throw byc.m19921a("SubtitleParser failed.", e);
        }
    }

    /* renamed from: h */
    public final boolean m36870h(uq6 uq6Var) {
        byte[] bArr = this.f33572f;
        if (bArr.length == this.f33574h) {
            this.f33572f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f33572f;
        int i = this.f33574h;
        int i2 = uq6Var.read(bArr2, i, bArr2.length - i);
        if (i2 != -1) {
            this.f33574h += i2;
        }
        long length = uq6Var.getLength();
        return (length != -1 && ((long) this.f33574h) == length) || i2 == -1;
    }

    /* renamed from: j */
    public final boolean m36871j(uq6 uq6Var) {
        return uq6Var.mo40491d((uq6Var.getLength() > (-1L) ? 1 : (uq6Var.getLength() == (-1L) ? 0 : -1)) != 0 ? br8.m19637d(uq6Var.getLength()) : 1024) == -1;
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        int i = this.f33575i;
        op0.m42517g((i == 0 || i == 5) ? false : true);
        if (this.f33575i == 1) {
            int iM19637d = uq6Var.getLength() != -1 ? br8.m19637d(uq6Var.getLength()) : 1024;
            if (iM19637d > this.f33572f.length) {
                this.f33572f = new byte[iM19637d];
            }
            this.f33574h = 0;
            this.f33575i = 2;
        }
        if (this.f33575i == 2 && m36870h(uq6Var)) {
            m36869g();
            this.f33575i = 4;
        }
        if (this.f33575i == 3 && m36871j(uq6Var)) {
            m36872l();
            this.f33575i = 4;
        }
        return this.f33575i == 4 ? -1 : 0;
    }

    /* renamed from: l */
    public final void m36872l() {
        long j = this.f33577k;
        for (int iM48728g = j == -9223372036854775807L ? 0 : sqi.m48728g(this.f33576j, j, true, true); iM48728g < this.f33570d.size(); iM48728g++) {
            m36873m((C15054b) this.f33570d.get(iM48728g));
        }
    }

    /* renamed from: m */
    public final void m36873m(C15054b c15054b) {
        op0.m42519i(this.f33573g);
        int length = c15054b.f33579b.length;
        this.f33571e.m60014R(c15054b.f33579b);
        this.f33573g.m52027e(this.f33571e, length);
        this.f33573g.mo7071a(c15054b.f33578a, 1, length, 0, null);
    }

    @Override // p001o.tq6
    public void release() {
        if (this.f33575i == 5) {
            return;
        }
        this.f33567a.reset();
        this.f33575i = 5;
    }
}
