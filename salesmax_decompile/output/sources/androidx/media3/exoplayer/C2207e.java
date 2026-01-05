package androidx.media3.exoplayer;

import androidx.media3.exoplayer.InterfaceC2211i;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.http.entity.ContentLengthStrategy;
import org.objectweb.asm.Opcodes;
import p001o.jbd;
import p001o.k85;
import p001o.ko6;
import p001o.lmh;
import p001o.ob0;
import p001o.op0;
import p001o.ria;
import p001o.sqi;
import p001o.sth;
import p001o.x8b;

/* renamed from: androidx.media3.exoplayer.e */
/* loaded from: classes2.dex */
public class C2207e implements InterfaceC2211i {

    /* renamed from: a */
    public final k85 f8290a;

    /* renamed from: b */
    public final long f8291b;

    /* renamed from: c */
    public final long f8292c;

    /* renamed from: d */
    public final long f8293d;

    /* renamed from: e */
    public final long f8294e;

    /* renamed from: f */
    public final int f8295f;

    /* renamed from: g */
    public final boolean f8296g;

    /* renamed from: h */
    public final long f8297h;

    /* renamed from: i */
    public final boolean f8298i;

    /* renamed from: j */
    public final HashMap f8299j;

    /* renamed from: k */
    public long f8300k;

    /* renamed from: androidx.media3.exoplayer.e$b */
    public static class b {

        /* renamed from: a */
        public boolean f8301a;

        /* renamed from: b */
        public int f8302b;

        public b() {
        }
    }

    public C2207e() {
        this(new k85(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* renamed from: j */
    public static void m7083j(int i, int i2, String str, String str2) {
        op0.m42512b(i >= i2, str + " cannot be less than " + str2);
    }

    /* renamed from: m */
    public static int m7084m(int i) {
        switch (i) {
            case ContentLengthStrategy.CHUNKED /* -2 */:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return Opcodes.ACC_DEPRECATED;
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2211i
    /* renamed from: a */
    public boolean mo7085a(InterfaceC2211i.a aVar) {
        long jJ0 = sqi.j0(aVar.f8415e, aVar.f8416f);
        long jMin = aVar.f8418h ? this.f8294e : this.f8293d;
        long j = aVar.f8419i;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jJ0 >= jMin || (!this.f8296g && this.f8290a.m35164f() >= m7095l());
    }

    @Override // androidx.media3.exoplayer.InterfaceC2211i
    /* renamed from: b */
    public void mo7086b(jbd jbdVar) {
        long id = Thread.currentThread().getId();
        long j = this.f8300k;
        op0.m42518h(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f8300k = id;
        if (!this.f8299j.containsKey(jbdVar)) {
            this.f8299j.put(jbdVar, new b());
        }
        m7097o(jbdVar);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2211i
    /* renamed from: c */
    public boolean mo7087c(jbd jbdVar) {
        return this.f8298i;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2211i
    /* renamed from: d */
    public void mo7088d(jbd jbdVar, lmh lmhVar, x8b.C18076b c18076b, InterfaceC2218o[] interfaceC2218oArr, sth sthVar, ko6[] ko6VarArr) {
        b bVar = (b) op0.m42515e((b) this.f8299j.get(jbdVar));
        int iM7094k = this.f8295f;
        if (iM7094k == -1) {
            iM7094k = m7094k(interfaceC2218oArr, ko6VarArr);
        }
        bVar.f8302b = iM7094k;
        m7098p();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2211i
    /* renamed from: e */
    public ob0 mo7089e() {
        return this.f8290a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2211i
    /* renamed from: f */
    public void mo7090f(jbd jbdVar) {
        m7096n(jbdVar);
        if (this.f8299j.isEmpty()) {
            this.f8300k = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2211i
    /* renamed from: g */
    public boolean mo7091g(InterfaceC2211i.a aVar) {
        b bVar = (b) op0.m42515e((b) this.f8299j.get(aVar.f8411a));
        boolean z = true;
        boolean z2 = this.f8290a.m35164f() >= m7095l();
        long jMin = this.f8291b;
        float f = aVar.f8416f;
        if (f > 1.0f) {
            jMin = Math.min(sqi.e0(jMin, f), this.f8292c);
        }
        long jMax = Math.max(jMin, 500000L);
        long j = aVar.f8415e;
        if (j < jMax) {
            if (!this.f8296g && z2) {
                z = false;
            }
            bVar.f8301a = z;
            if (!z && j < 500000) {
                ria.m46824h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.f8292c || z2) {
            bVar.f8301a = false;
        }
        return bVar.f8301a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2211i
    /* renamed from: h */
    public long mo7092h(jbd jbdVar) {
        return this.f8297h;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2211i
    /* renamed from: i */
    public void mo7093i(jbd jbdVar) {
        m7096n(jbdVar);
    }

    /* renamed from: k */
    public int m7094k(InterfaceC2218o[] interfaceC2218oArr, ko6[] ko6VarArr) {
        int iM7084m = 0;
        for (int i = 0; i < interfaceC2218oArr.length; i++) {
            if (ko6VarArr[i] != null) {
                iM7084m += m7084m(interfaceC2218oArr[i].mo6888f());
            }
        }
        return Math.max(13107200, iM7084m);
    }

    /* renamed from: l */
    public int m7095l() {
        Iterator it = this.f8299j.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((b) it.next()).f8302b;
        }
        return i;
    }

    /* renamed from: n */
    public final void m7096n(jbd jbdVar) {
        if (this.f8299j.remove(jbdVar) != null) {
            m7098p();
        }
    }

    /* renamed from: o */
    public final void m7097o(jbd jbdVar) {
        b bVar = (b) op0.m42515e((b) this.f8299j.get(jbdVar));
        int i = this.f8295f;
        if (i == -1) {
            i = 13107200;
        }
        bVar.f8302b = i;
        bVar.f8301a = false;
    }

    /* renamed from: p */
    public final void m7098p() {
        if (this.f8299j.isEmpty()) {
            this.f8290a.m35165g();
        } else {
            this.f8290a.m35166h(m7095l());
        }
    }

    public C2207e(k85 k85Var, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m7083j(i3, 0, "bufferForPlaybackMs", "0");
        m7083j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m7083j(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m7083j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m7083j(i2, i, "maxBufferMs", "minBufferMs");
        m7083j(i6, 0, "backBufferDurationMs", "0");
        this.f8290a = k85Var;
        this.f8291b = sqi.O0(i);
        this.f8292c = sqi.O0(i2);
        this.f8293d = sqi.O0(i3);
        this.f8294e = sqi.O0(i4);
        this.f8295f = i5;
        this.f8296g = z;
        this.f8297h = sqi.O0(i6);
        this.f8298i = z2;
        this.f8299j = new HashMap();
        this.f8300k = -1L;
    }
}
