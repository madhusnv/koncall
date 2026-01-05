package og;

import kotlin.jvm.internal.AbstractC4154l;
import ox.EnumC5772c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class cb {
    /* renamed from: a */
    public static final double m10573a(double d2, EnumC5772c sourceUnit, EnumC5772c targetUnit) {
        AbstractC4154l.m8923f(sourceUnit, "sourceUnit");
        AbstractC4154l.m8923f(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d2 * jConvert : d2 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    /* renamed from: b */
    public static final long m10574b(long j6, EnumC5772c sourceUnit, EnumC5772c targetUnit) {
        AbstractC4154l.m8923f(sourceUnit, "sourceUnit");
        AbstractC4154l.m8923f(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j6, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    /* renamed from: c */
    public static final long m10575c(long j6, EnumC5772c sourceUnit, EnumC5772c targetUnit) {
        AbstractC4154l.m8923f(sourceUnit, "sourceUnit");
        AbstractC4154l.m8923f(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j6, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    /* renamed from: d */
    public static String m10576d(com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0 r0Var) {
        StringBuilder sb2 = new StringBuilder(r0Var.mo3818e());
        for (int i10 = 0; i10 < r0Var.mo3818e(); i10++) {
            byte bMo3816a = r0Var.mo3816a(i10);
            if (bMo3816a == 34) {
                sb2.append("\\\"");
            } else if (bMo3816a == 39) {
                sb2.append("\\'");
            } else if (bMo3816a != 92) {
                switch (bMo3816a) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo3816a < 32 || bMo3816a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo3816a >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo3816a >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo3816a & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bMo3816a);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
