package ty;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.c */
/* loaded from: classes3.dex */
public enum EnumC7269c {
    BLOCK_SPECIAL(24576),
    CHAR_SPECIAL(8192),
    FIFO_SPECIAL(4096),
    SOCKET_SPECIAL(49152),
    REGULAR(32768),
    DIRECTORY(16384),
    SYMLINK(40960),
    UNKNOWN(0);

    private final int val;

    EnumC7269c(int i10) {
        this.val = i10;
    }

    public static EnumC7269c fromMask(int i10) {
        for (EnumC7269c enumC7269c : values()) {
            if (enumC7269c.val == i10) {
                return enumC7269c;
            }
        }
        return UNKNOWN;
    }

    public int toMask() {
        return this.val;
    }
}
