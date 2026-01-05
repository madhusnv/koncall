package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public abstract class x6f {
    /* renamed from: a */
    public static final w6f m55743a(boolean z, int i) {
        return new hde(z, i);
    }

    /* renamed from: b */
    public static /* synthetic */ w6f m55744b(boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            i = Opcodes.ACC_ENUM;
        }
        return m55743a(z, i);
    }

    /* renamed from: c */
    public static final y6f m55745c(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, FirebaseAnalytics.Param.CONTENT);
        return new hde(bArr, i, i2);
    }

    /* renamed from: d */
    public static /* synthetic */ y6f m55746d(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return m55745c(bArr, i, i2);
    }
}
