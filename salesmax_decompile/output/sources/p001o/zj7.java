package p001o;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class zj7 implements vc4 {

    /* renamed from: d */
    public static final boolean f57282d;

    /* renamed from: a */
    public final UUID f57283a;

    /* renamed from: b */
    public final byte[] f57284b;

    /* renamed from: c */
    public final boolean f57285c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(sqi.f45792c)) {
            String str = sqi.f45793d;
            z = "AFTM".equals(str) || "AFTB".equals(str);
        }
        f57282d = z;
    }

    public zj7(UUID uuid, byte[] bArr, boolean z) {
        this.f57283a = uuid;
        this.f57284b = bArr;
        this.f57285c = z;
    }
}
