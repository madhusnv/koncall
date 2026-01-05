package og;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class xa {

    /* renamed from: a */
    public static final /* synthetic */ int f26944a = 0;

    /* renamed from: a */
    public static String m11038a(com.google.android.gms.internal.measurement.z4 z4Var) {
        StringBuilder sb2 = new StringBuilder(z4Var.mo3794c());
        for (int i10 = 0; i10 < z4Var.mo3794c(); i10++) {
            byte bMo3792a = z4Var.mo3792a(i10);
            if (bMo3792a == 34) {
                sb2.append("\\\"");
            } else if (bMo3792a == 39) {
                sb2.append("\\'");
            } else if (bMo3792a != 92) {
                switch (bMo3792a) {
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
                        if (bMo3792a < 32 || bMo3792a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo3792a >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo3792a >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo3792a & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bMo3792a);
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
