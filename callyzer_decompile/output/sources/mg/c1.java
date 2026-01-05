package mg;

import a2.AbstractC0030c;
import com.google.android.gms.internal.fido.zzho;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import ty.C7274h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c1 implements Comparable {
    /* renamed from: d */
    public static int m9616d(byte b10) {
        return (b10 >> 5) & 7;
    }

    /* renamed from: e */
    public static c1 m9617e(byte... bArr) {
        bArr.getClass();
        C7274h c7274h = new C7274h(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return AbstractC4723b.m9609k(c7274h);
        } finally {
            try {
                c7274h.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public abstract int mo9597a();

    /* renamed from: b */
    public int mo9598b() {
        return 0;
    }

    /* renamed from: c */
    public final c1 m9618c(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (c1) cls.cast(this);
        }
        throw new zzho(AbstractC0030c.m121l("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
