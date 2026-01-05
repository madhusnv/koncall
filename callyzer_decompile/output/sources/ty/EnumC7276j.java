package ty;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.j */
/* loaded from: classes3.dex */
public enum EnumC7276j {
    UNKNOWN(-1),
    OK(0),
    EOF(1),
    NO_SUCH_FILE(2),
    PERMISSION_DENIED(3),
    FAILURE(4),
    BAD_MESSAGE(5),
    NO_CONNECTION(6),
    CONNECITON_LOST(7),
    OP_UNSUPPORTED(8),
    INVALID_HANDLE(9),
    NO_SUCH_PATH(10),
    FILE_ALREADY_EXISTS(11),
    WRITE_PROTECT(12),
    NO_MEDIA(13),
    NO_SPACE_ON_FILESYSTEM(14),
    QUOTA_EXCEEDED(15),
    UNKNOWN_PRINCIPAL(16),
    LOCK_CONFLICT(17),
    DIR_NOT_EMPTY(18),
    NOT_A_DIRECTORY(19),
    INVALID_FILENAME(20),
    LINK_LOOP(21),
    CANNOT_DELETE(22),
    INVALID_PARAMETER(23),
    FILE_IS_A_DIRECTORY(24),
    BYTE_RANGE_LOCK_CONFLICT(25),
    BYTE_RANGE_LOCK_REFUSED(26),
    DELETE_PENDING(27),
    FILE_CORRUPT(28),
    OWNER_INVALID(29),
    GROUP_INVALID(30),
    NO_MATCHING_BYTE_RANGE_LOCK(31);

    private final int code;

    EnumC7276j(int i10) {
        this.code = i10;
    }

    public static EnumC7276j fromInt(int i10) {
        for (EnumC7276j enumC7276j : values()) {
            if (enumC7276j.code == i10) {
                return enumC7276j;
            }
        }
        return UNKNOWN;
    }

    public int getCode() {
        return this.code;
    }
}
