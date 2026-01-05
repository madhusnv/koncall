package r6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r6.i */
/* loaded from: classes.dex */
public enum EnumC6480i {
    BOOLEAN(1),
    FLOAT(2),
    INTEGER(3),
    LONG(4),
    STRING(5),
    STRING_SET(6),
    DOUBLE(7),
    BYTES(8),
    VALUE_NOT_SET(0);

    private final int value;

    EnumC6480i(int i10) {
        this.value = i10;
    }

    public static EnumC6480i forNumber(int i10) {
        switch (i10) {
            case 0:
                return VALUE_NOT_SET;
            case 1:
                return BOOLEAN;
            case 2:
                return FLOAT;
            case 3:
                return INTEGER;
            case 4:
                return LONG;
            case 5:
                return STRING;
            case 6:
                return STRING_SET;
            case 7:
                return DOUBLE;
            case 8:
                return BYTES;
            default:
                return null;
        }
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EnumC6480i valueOf(int i10) {
        return forNumber(i10);
    }
}
