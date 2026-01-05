package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public final class xnb implements ddj {

    /* renamed from: o.xnb$a */
    public static /* synthetic */ class C18197a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53963a;

        static {
            int[] iArr = new int[va1.values().length];
            f53963a = iArr;
            try {
                iArr[va1.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53963a[va1.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53963a[va1.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53963a[va1.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53963a[va1.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53963a[va1.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53963a[va1.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53963a[va1.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f53963a[va1.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f53963a[va1.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f53963a[va1.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f53963a[va1.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f53963a[va1.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        ddj n26Var;
        switch (C18197a.f53963a[va1Var.ordinal()]) {
            case 1:
                n26Var = new n26();
                break;
            case 2:
                n26Var = new a1i();
                break;
            case 3:
                n26Var = new m26();
                break;
            case 4:
                n26Var = new w0i();
                break;
            case 5:
                n26Var = new y3e();
                break;
            case 6:
                n26Var = new ve3();
                break;
            case 7:
                n26Var = new xe3();
                break;
            case 8:
                n26Var = new te3();
                break;
            case 9:
                n26Var = new ka8();
                break;
            case 10:
                n26Var = new cic();
                break;
            case 11:
                n26Var = new re3();
                break;
            case 12:
                n26Var = new ou4();
                break;
            case 13:
                n26Var = new k91();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(va1Var)));
        }
        return n26Var.mo16332a(str, va1Var, i, i2, map);
    }
}
