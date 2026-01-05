package m5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m5.k */
/* loaded from: classes.dex */
public final class C4657k {

    /* renamed from: j0, reason: collision with root package name */
    public static final SparseIntArray f44420j0;

    /* renamed from: A */
    public int f22975A;

    /* renamed from: B */
    public int f22976B;

    /* renamed from: C */
    public int f22977C;

    /* renamed from: D */
    public int f22978D;

    /* renamed from: E */
    public int f22979E;

    /* renamed from: F */
    public int f22980F;

    /* renamed from: G */
    public int f22981G;

    /* renamed from: H */
    public int f22982H;

    /* renamed from: I */
    public int f22983I;

    /* renamed from: J */
    public int f22984J;

    /* renamed from: K */
    public int f22985K;

    /* renamed from: L */
    public int f22986L;

    /* renamed from: M */
    public int f22987M;

    /* renamed from: N */
    public int f22988N;

    /* renamed from: O */
    public float f22989O;

    /* renamed from: P */
    public float f22990P;

    /* renamed from: Q */
    public int f22991Q;

    /* renamed from: R */
    public int f22992R;

    /* renamed from: S */
    public int f22993S;

    /* renamed from: T */
    public int f22994T;

    /* renamed from: U */
    public int f22995U;

    /* renamed from: V */
    public int f22996V;

    /* renamed from: W */
    public int f22997W;

    /* renamed from: X */
    public int f22998X;

    /* renamed from: Y */
    public float f22999Y;

    /* renamed from: Z */
    public float f23000Z;

    /* renamed from: a */
    public boolean f23001a;

    /* renamed from: a0, reason: collision with root package name */
    public int f44421a0;

    /* renamed from: b */
    public int f23002b;

    /* renamed from: b0, reason: collision with root package name */
    public int f44422b0;

    /* renamed from: c */
    public int f23003c;

    /* renamed from: c0, reason: collision with root package name */
    public int f44423c0;

    /* renamed from: d */
    public int f23004d;

    /* renamed from: d0, reason: collision with root package name */
    public int[] f44424d0;

    /* renamed from: e */
    public int f23005e;

    /* renamed from: e0, reason: collision with root package name */
    public String f44425e0;

    /* renamed from: f */
    public float f23006f;

    /* renamed from: f0, reason: collision with root package name */
    public String f44426f0;

    /* renamed from: g */
    public int f23007g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f44427g0;

    /* renamed from: h */
    public int f23008h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f44428h0;

    /* renamed from: i */
    public int f23009i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f44429i0;

    /* renamed from: j */
    public int f23010j;

    /* renamed from: k */
    public int f23011k;

    /* renamed from: l */
    public int f23012l;

    /* renamed from: m */
    public int f23013m;

    /* renamed from: n */
    public int f23014n;

    /* renamed from: o */
    public int f23015o;

    /* renamed from: p */
    public int f23016p;

    /* renamed from: q */
    public int f23017q;

    /* renamed from: r */
    public int f23018r;

    /* renamed from: s */
    public int f23019s;

    /* renamed from: t */
    public float f23020t;

    /* renamed from: u */
    public float f23021u;

    /* renamed from: v */
    public String f23022v;

    /* renamed from: w */
    public int f23023w;

    /* renamed from: x */
    public int f23024x;

    /* renamed from: y */
    public float f23025y;

    /* renamed from: z */
    public int f23026z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f44420j0 = sparseIntArray;
        sparseIntArray.append(38, 24);
        sparseIntArray.append(39, 25);
        sparseIntArray.append(41, 28);
        sparseIntArray.append(42, 29);
        sparseIntArray.append(47, 35);
        sparseIntArray.append(46, 34);
        sparseIntArray.append(20, 4);
        sparseIntArray.append(19, 3);
        sparseIntArray.append(17, 1);
        sparseIntArray.append(55, 6);
        sparseIntArray.append(56, 7);
        sparseIntArray.append(27, 17);
        sparseIntArray.append(28, 18);
        sparseIntArray.append(29, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(43, 31);
        sparseIntArray.append(44, 32);
        sparseIntArray.append(26, 10);
        sparseIntArray.append(25, 9);
        sparseIntArray.append(59, 13);
        sparseIntArray.append(62, 16);
        sparseIntArray.append(60, 14);
        sparseIntArray.append(57, 11);
        sparseIntArray.append(61, 15);
        sparseIntArray.append(58, 12);
        sparseIntArray.append(50, 38);
        sparseIntArray.append(36, 37);
        sparseIntArray.append(35, 39);
        sparseIntArray.append(49, 40);
        sparseIntArray.append(34, 20);
        sparseIntArray.append(48, 36);
        sparseIntArray.append(24, 5);
        sparseIntArray.append(37, 76);
        sparseIntArray.append(45, 76);
        sparseIntArray.append(40, 76);
        sparseIntArray.append(18, 76);
        sparseIntArray.append(16, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(21, 61);
        sparseIntArray.append(23, 62);
        sparseIntArray.append(22, 63);
        sparseIntArray.append(54, 69);
        sparseIntArray.append(33, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    /* renamed from: a */
    public final void m9536a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4664r.f23057d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray = f44420j0;
            int i11 = sparseIntArray.get(index);
            if (i11 == 80) {
                this.f44427g0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f44427g0);
            } else if (i11 != 81) {
                switch (i11) {
                    case 1:
                        this.f23015o = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23015o);
                        break;
                    case 2:
                        this.f22980F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22980F);
                        break;
                    case 3:
                        this.f23014n = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23014n);
                        break;
                    case 4:
                        this.f23013m = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23013m);
                        break;
                    case 5:
                        this.f23022v = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f23026z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23026z);
                        break;
                    case 7:
                        this.f22975A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22975A);
                        break;
                    case 8:
                        this.f22981G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22981G);
                        break;
                    case 9:
                        this.f23019s = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23019s);
                        break;
                    case 10:
                        this.f23018r = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23018r);
                        break;
                    case 11:
                        this.f22986L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22986L);
                        break;
                    case 12:
                        this.f22987M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22987M);
                        break;
                    case 13:
                        this.f22983I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22983I);
                        break;
                    case 14:
                        this.f22985K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22985K);
                        break;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        this.f22988N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22988N);
                        break;
                    case 16:
                        this.f22984J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22984J);
                        break;
                    case 17:
                        this.f23004d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23004d);
                        break;
                    case 18:
                        this.f23005e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23005e);
                        break;
                    case 19:
                        this.f23006f = typedArrayObtainStyledAttributes.getFloat(index, this.f23006f);
                        break;
                    case 20:
                        this.f23020t = typedArrayObtainStyledAttributes.getFloat(index, this.f23020t);
                        break;
                    case 21:
                        this.f23003c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f23003c);
                        break;
                    case 22:
                        this.f23002b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f23002b);
                        break;
                    case 23:
                        this.f22977C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22977C);
                        break;
                    case 24:
                        this.f23007g = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23007g);
                        break;
                    case 25:
                        this.f23008h = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23008h);
                        break;
                    case 26:
                        this.f22976B = typedArrayObtainStyledAttributes.getInt(index, this.f22976B);
                        break;
                    case 27:
                        this.f22978D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22978D);
                        break;
                    case 28:
                        this.f23009i = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23009i);
                        break;
                    case 29:
                        this.f23010j = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23010j);
                        break;
                    case 30:
                        this.f22982H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22982H);
                        break;
                    case BERTags.DATE /* 31 */:
                        this.f23016p = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23016p);
                        break;
                    case 32:
                        this.f23017q = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23017q);
                        break;
                    case BERTags.DATE_TIME /* 33 */:
                        this.f22979E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22979E);
                        break;
                    case BERTags.DURATION /* 34 */:
                        this.f23012l = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23012l);
                        break;
                    case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                        this.f23011k = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23011k);
                        break;
                    case BERTags.RELATIVE_OID_IRI /* 36 */:
                        this.f23021u = typedArrayObtainStyledAttributes.getFloat(index, this.f23021u);
                        break;
                    case 37:
                        this.f22990P = typedArrayObtainStyledAttributes.getFloat(index, this.f22990P);
                        break;
                    case 38:
                        this.f22989O = typedArrayObtainStyledAttributes.getFloat(index, this.f22989O);
                        break;
                    case 39:
                        this.f22991Q = typedArrayObtainStyledAttributes.getInt(index, this.f22991Q);
                        break;
                    case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                        this.f22992R = typedArrayObtainStyledAttributes.getInt(index, this.f22992R);
                        break;
                    default:
                        switch (i11) {
                            case 54:
                                this.f22993S = typedArrayObtainStyledAttributes.getInt(index, this.f22993S);
                                break;
                            case 55:
                                this.f22994T = typedArrayObtainStyledAttributes.getInt(index, this.f22994T);
                                break;
                            case 56:
                                this.f22995U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22995U);
                                break;
                            case 57:
                                this.f22996V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22996V);
                                break;
                            case 58:
                                this.f22997W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22997W);
                                break;
                            case 59:
                                this.f22998X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22998X);
                                break;
                            default:
                                switch (i11) {
                                    case 61:
                                        this.f23023w = C4661o.m9542f(typedArrayObtainStyledAttributes, index, this.f23023w);
                                        break;
                                    case 62:
                                        this.f23024x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23024x);
                                        break;
                                    case 63:
                                        this.f23025y = typedArrayObtainStyledAttributes.getFloat(index, this.f23025y);
                                        break;
                                    default:
                                        switch (i11) {
                                            case 69:
                                                this.f22999Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case JPAKEParticipant.STATE_ROUND_3_VALIDATED /* 70 */:
                                                this.f23000Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                break;
                                            case 72:
                                                this.f44421a0 = typedArrayObtainStyledAttributes.getInt(index, this.f44421a0);
                                                break;
                                            case 73:
                                                this.f44422b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44422b0);
                                                break;
                                            case 74:
                                                this.f44425e0 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.f44429i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f44429i0);
                                                break;
                                            case 76:
                                                Integer.toHexString(index);
                                                sparseIntArray.get(index);
                                                break;
                                            case 77:
                                                this.f44426f0 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                Integer.toHexString(index);
                                                sparseIntArray.get(index);
                                                break;
                                        }
                                }
                        }
                }
            } else {
                this.f44428h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f44428h0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
