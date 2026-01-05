package og;

import com.skydoves.balloon.internals.DefinitionKt;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class pd {
    /* renamed from: a */
    public static final int m10823a(float[] fArr) {
        int i10 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i11 = (fArr[0] == 1.0f && fArr[1] == DefinitionKt.NO_Float_VALUE && fArr[2] == DefinitionKt.NO_Float_VALUE && fArr[4] == DefinitionKt.NO_Float_VALUE && fArr[5] == 1.0f && fArr[6] == DefinitionKt.NO_Float_VALUE && fArr[8] == DefinitionKt.NO_Float_VALUE && fArr[9] == DefinitionKt.NO_Float_VALUE && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == DefinitionKt.NO_Float_VALUE && fArr[13] == DefinitionKt.NO_Float_VALUE && fArr[14] == DefinitionKt.NO_Float_VALUE && fArr[15] == 1.0f) {
            i10 = 1;
        }
        return (i11 << 1) | i10;
    }

    /* renamed from: b */
    public static final double m10824b(long j6) {
        return ((j6 >>> 11) * NewHope.SENDB_BYTES) + (j6 & 2047);
    }

    /* renamed from: c */
    public static final String m10825c(int i10, long j6) {
        if (j6 >= 0) {
            d2.m10599b(i10);
            String string = Long.toString(j6, i10);
            AbstractC4154l.m8922e(string, "toString(...)");
            return string;
        }
        long j10 = i10;
        long j11 = ((j6 >>> 1) / j10) << 1;
        long j12 = j6 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        d2.m10599b(i10);
        String string2 = Long.toString(j11, i10);
        AbstractC4154l.m8922e(string2, "toString(...)");
        d2.m10599b(i10);
        String string3 = Long.toString(j12, i10);
        AbstractC4154l.m8922e(string3, "toString(...)");
        return string2.concat(string3);
    }
}
