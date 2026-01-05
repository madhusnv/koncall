package p001o;

import android.util.Pair;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class ngb implements cbf {

    /* renamed from: a */
    public final long[] f36821a;

    /* renamed from: b */
    public final long[] f36822b;

    /* renamed from: c */
    public final long f36823c;

    public ngb(long[] jArr, long[] jArr2, long j) {
        this.f36821a = jArr;
        this.f36822b = jArr2;
        this.f36823c = j == -9223372036854775807L ? sqi.O0(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static ngb m40542a(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.f8691e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += mlltFrame.f8689c + mlltFrame.f8691e[i3];
            j3 += mlltFrame.f8690d + mlltFrame.f8692f[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new ngb(jArr, jArr2, j2);
    }

    /* renamed from: c */
    public static Pair m40543c(long j, long[] jArr, long[] jArr2) {
        int iM48728g = sqi.m48728g(jArr, j, true, true);
        long j2 = jArr[iM48728g];
        long j3 = jArr2[iM48728g];
        int i = iM48728g + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p001o.cbf
    /* renamed from: b */
    public long mo20725b(long j) {
        return sqi.O0(((Long) m40543c(j, this.f36821a, this.f36822b).second).longValue());
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        Pair pairM40543c = m40543c(sqi.q1(sqi.m48737p(j, 0L, this.f36823c)), this.f36822b, this.f36821a);
        return new zaf.C18603a(new bbf(sqi.O0(((Long) pairM40543c.first).longValue()), ((Long) pairM40543c.second).longValue()));
    }

    @Override // p001o.cbf
    /* renamed from: g */
    public long mo20726g() {
        return -1L;
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f36823c;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return true;
    }

    @Override // p001o.cbf
    /* renamed from: j */
    public int mo20727j() {
        return -2147483647;
    }
}
