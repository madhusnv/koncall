package hz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'USR_RWX' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hz.a */
/* loaded from: classes3.dex */
public final class EnumC3062a {
    private static final /* synthetic */ EnumC3062a[] $VALUES;
    public static final EnumC3062a GRP_R;
    public static final EnumC3062a GRP_RWX;
    public static final EnumC3062a GRP_W;
    public static final EnumC3062a GRP_X;
    public static final EnumC3062a OTH_R;
    public static final EnumC3062a OTH_RWX;
    public static final EnumC3062a OTH_W;
    public static final EnumC3062a OTH_X;
    public static final EnumC3062a SGID;
    public static final EnumC3062a STICKY;
    public static final EnumC3062a SUID;
    public static final EnumC3062a USR_R;
    public static final EnumC3062a USR_RWX;
    public static final EnumC3062a USR_W;
    public static final EnumC3062a USR_X;
    private final int val;

    static {
        EnumC3062a enumC3062a = new EnumC3062a("USR_R", 0, 256);
        USR_R = enumC3062a;
        EnumC3062a enumC3062a2 = new EnumC3062a("USR_W", 1, 128);
        USR_W = enumC3062a2;
        EnumC3062a enumC3062a3 = new EnumC3062a("USR_X", 2, 64);
        USR_X = enumC3062a3;
        EnumC3062a enumC3062a4 = new EnumC3062a("GRP_R", 3, 32);
        GRP_R = enumC3062a4;
        EnumC3062a enumC3062a5 = new EnumC3062a("GRP_W", 4, 16);
        GRP_W = enumC3062a5;
        EnumC3062a enumC3062a6 = new EnumC3062a("GRP_X", 5, 8);
        GRP_X = enumC3062a6;
        EnumC3062a enumC3062a7 = new EnumC3062a("OTH_R", 6, 4);
        OTH_R = enumC3062a7;
        EnumC3062a enumC3062a8 = new EnumC3062a("OTH_W", 7, 2);
        OTH_W = enumC3062a8;
        EnumC3062a enumC3062a9 = new EnumC3062a("OTH_X", 8, 1);
        OTH_X = enumC3062a9;
        EnumC3062a enumC3062a10 = new EnumC3062a("SUID", 9, NewHope.SENDB_BYTES);
        SUID = enumC3062a10;
        EnumC3062a enumC3062a11 = new EnumC3062a("SGID", 10, 1024);
        SGID = enumC3062a11;
        EnumC3062a enumC3062a12 = new EnumC3062a("STICKY", 11, 512);
        STICKY = enumC3062a12;
        EnumC3062a enumC3062a13 = new EnumC3062a("USR_RWX", 12, enumC3062a, enumC3062a2, enumC3062a3);
        USR_RWX = enumC3062a13;
        EnumC3062a enumC3062a14 = new EnumC3062a("GRP_RWX", 13, enumC3062a4, enumC3062a5, enumC3062a6);
        GRP_RWX = enumC3062a14;
        EnumC3062a enumC3062a15 = new EnumC3062a("OTH_RWX", 14, enumC3062a7, enumC3062a8, enumC3062a9);
        OTH_RWX = enumC3062a15;
        $VALUES = new EnumC3062a[]{enumC3062a, enumC3062a2, enumC3062a3, enumC3062a4, enumC3062a5, enumC3062a6, enumC3062a7, enumC3062a8, enumC3062a9, enumC3062a10, enumC3062a11, enumC3062a12, enumC3062a13, enumC3062a14, enumC3062a15};
    }

    private EnumC3062a(String str, int i10, int i11) {
        this.val = i11;
    }

    public static Set<EnumC3062a> fromMask(int i10) {
        LinkedList linkedList = new LinkedList();
        for (EnumC3062a enumC3062a : values()) {
            if (enumC3062a.isIn(i10)) {
                linkedList.add(enumC3062a);
            }
        }
        return new HashSet(linkedList);
    }

    public static int toMask(Set<EnumC3062a> set) {
        Iterator<EnumC3062a> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().val;
        }
        return i10;
    }

    public static EnumC3062a valueOf(String str) {
        return (EnumC3062a) Enum.valueOf(EnumC3062a.class, str);
    }

    public static EnumC3062a[] values() {
        return (EnumC3062a[]) $VALUES.clone();
    }

    public boolean isIn(int i10) {
        int i11 = this.val;
        return (i10 & i11) == i11;
    }

    private EnumC3062a(String str, int i10, EnumC3062a... enumC3062aArr) {
        int i11 = 0;
        for (EnumC3062a enumC3062a : enumC3062aArr) {
            i11 |= enumC3062a.val;
        }
        this.val = i11;
    }
}
