package ty;

import org.bouncycastle.asn1.x509.DisplayText;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.f */
/* loaded from: classes3.dex */
public enum EnumC7272f {
    UNKNOWN(0),
    INIT(1),
    VERSION(2),
    OPEN(3),
    CLOSE(4),
    READ(5),
    WRITE(6),
    LSTAT(7),
    FSTAT(8),
    SETSTAT(9),
    FSETSTAT(10),
    OPENDIR(11),
    READDIR(12),
    REMOVE(13),
    MKDIR(14),
    RMDIR(15),
    REALPATH(16),
    STAT(17),
    RENAME(18),
    READLINK(19),
    SYMLINK(20),
    STATUS(101),
    HANDLE(102),
    DATA(103),
    NAME(104),
    ATTRS(105),
    EXTENDED(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE),
    EXTENDED_REPLY(201);

    private static final EnumC7272f[] cache = new EnumC7272f[256];

    /* renamed from: b */
    private final byte f34718b;

    static {
        for (EnumC7272f enumC7272f : values()) {
            cache[enumC7272f.toByte() & 255] = enumC7272f;
        }
    }

    EnumC7272f(int i10) {
        this.f34718b = (byte) i10;
    }

    public static EnumC7272f fromByte(byte b10) {
        return cache[b10 & 255];
    }

    public byte toByte() {
        return this.f34718b;
    }
}
