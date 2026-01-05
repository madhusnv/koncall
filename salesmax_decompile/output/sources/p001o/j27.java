package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import com.google.android.gms.cast.MediaStatus;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class j27 {

    /* renamed from: a */
    public final int f29614a;

    /* renamed from: b */
    public final int f29615b;

    /* renamed from: c */
    public final int f29616c;

    /* renamed from: d */
    public final int f29617d;

    /* renamed from: e */
    public final int f29618e;

    /* renamed from: f */
    public final int f29619f;

    /* renamed from: g */
    public final int f29620g;

    /* renamed from: h */
    public final int f29621h;

    /* renamed from: i */
    public final int f29622i;

    /* renamed from: j */
    public final long f29623j;

    /* renamed from: k */
    public final C14432a f29624k;

    /* renamed from: l */
    public final Metadata f29625l;

    /* renamed from: o.j27$a */
    public static class C14432a {

        /* renamed from: a */
        public final long[] f29626a;

        /* renamed from: b */
        public final long[] f29627b;

        public C14432a(long[] jArr, long[] jArr2) {
            this.f29626a = jArr;
            this.f29627b = jArr2;
        }
    }

    public j27(byte[] bArr, int i) {
        ywc ywcVar = new ywc(bArr);
        ywcVar.m58452p(i * 8);
        this.f29614a = ywcVar.m58444h(16);
        this.f29615b = ywcVar.m58444h(16);
        this.f29616c = ywcVar.m58444h(24);
        this.f29617d = ywcVar.m58444h(24);
        int iM58444h = ywcVar.m58444h(20);
        this.f29618e = iM58444h;
        this.f29619f = m33088j(iM58444h);
        this.f29620g = ywcVar.m58444h(3) + 1;
        int iM58444h2 = ywcVar.m58444h(5) + 1;
        this.f29621h = iM58444h2;
        this.f29622i = m33087e(iM58444h2);
        this.f29623j = ywcVar.m58446j(36);
        this.f29624k = null;
        this.f29625l = null;
    }

    /* renamed from: e */
    public static int m33087e(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: j */
    public static int m33088j(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public j27 m33089a(List list) {
        return new j27(this.f29614a, this.f29615b, this.f29616c, this.f29617d, this.f29618e, this.f29620g, this.f29621h, this.f29623j, this.f29624k, m33095h(new Metadata(list)));
    }

    /* renamed from: b */
    public j27 m33090b(C14432a c14432a) {
        return new j27(this.f29614a, this.f29615b, this.f29616c, this.f29617d, this.f29618e, this.f29620g, this.f29621h, this.f29623j, c14432a, this.f29625l);
    }

    /* renamed from: c */
    public j27 m33091c(List list) {
        return new j27(this.f29614a, this.f29615b, this.f29616c, this.f29617d, this.f29618e, this.f29620g, this.f29621h, this.f29623j, this.f29624k, m33095h(p2j.m42925d(list)));
    }

    /* renamed from: d */
    public long m33092d() {
        long j;
        long j2;
        int i = this.f29617d;
        if (i > 0) {
            j = (i + this.f29616c) / 2;
            j2 = 1;
        } else {
            int i2 = this.f29614a;
            j = ((((i2 != this.f29615b || i2 <= 0) ? MediaStatus.COMMAND_EDIT_TRACKS : i2) * this.f29620g) * this.f29621h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    /* renamed from: f */
    public long m33093f() {
        long j = this.f29623j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f29618e;
    }

    /* renamed from: g */
    public C2181a m33094g(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i = this.f29617d;
        if (i <= 0) {
            i = -1;
        }
        return new C2181a.b().o0("audio/flac").f0(i).m6751N(this.f29620g).p0(this.f29618e).i0(sqi.g0(this.f29621h)).b0(Collections.singletonList(bArr)).h0(m33095h(metadata)).m6748K();
    }

    /* renamed from: h */
    public Metadata m33095h(Metadata metadata) {
        Metadata metadata2 = this.f29625l;
        return metadata2 == null ? metadata : metadata2.m6694b(metadata);
    }

    /* renamed from: i */
    public long m33096i(long j) {
        return sqi.m48737p((j * this.f29618e) / 1000000, 0L, this.f29623j - 1);
    }

    public j27(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C14432a c14432a, Metadata metadata) {
        this.f29614a = i;
        this.f29615b = i2;
        this.f29616c = i3;
        this.f29617d = i4;
        this.f29618e = i5;
        this.f29619f = m33088j(i5);
        this.f29620g = i6;
        this.f29621h = i7;
        this.f29622i = m33087e(i7);
        this.f29623j = j;
        this.f29624k = c14432a;
        this.f29625l = metadata;
    }
}
