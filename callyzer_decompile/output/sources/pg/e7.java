package pg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum e7 implements InterfaceC5921b {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    private final int zzh;

    e7(int i10) {
        this.zzh = i10;
    }

    @Override // pg.InterfaceC5921b
    public final int zza() {
        return this.zzh;
    }
}
