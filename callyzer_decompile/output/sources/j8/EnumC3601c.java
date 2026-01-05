package j8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j8.c */
/* loaded from: classes.dex */
public enum EnumC3601c {
    STRING(0),
    STRING_SET(1),
    INT(2),
    LONG(3),
    FLOAT(4),
    BOOLEAN(5);

    private final int mId;

    EnumC3601c(int i10) {
        this.mId = i10;
    }

    public static EnumC3601c fromId(int i10) {
        if (i10 == 0) {
            return STRING;
        }
        if (i10 == 1) {
            return STRING_SET;
        }
        if (i10 == 2) {
            return INT;
        }
        if (i10 == 3) {
            return LONG;
        }
        if (i10 == 4) {
            return FLOAT;
        }
        if (i10 != 5) {
            return null;
        }
        return BOOLEAN;
    }

    public int getId() {
        return this.mId;
    }
}
