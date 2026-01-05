package dz;

import net.schmizz.sshj.common.EnumC5034n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dz.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1864a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8850a;

    static {
        int[] iArr = new int[EnumC5034n.values().length];
        f8850a = iArr;
        try {
            iArr[EnumC5034n.USERAUTH_BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8850a[EnumC5034n.USERAUTH_SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8850a[EnumC5034n.USERAUTH_FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
