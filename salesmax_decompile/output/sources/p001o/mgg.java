package p001o;

import com.google.api.ClientProto;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public class mgg {

    /* renamed from: i */
    public static final mgg[] f35413i;

    /* renamed from: j */
    public static mgg[] f35414j;

    /* renamed from: a */
    public final boolean f35415a;

    /* renamed from: b */
    public final int f35416b;

    /* renamed from: c */
    public final int f35417c;

    /* renamed from: d */
    public final int f35418d;

    /* renamed from: e */
    public final int f35419e;

    /* renamed from: f */
    public final int f35420f;

    /* renamed from: g */
    public final int f35421g;

    /* renamed from: h */
    public final int f35422h;

    static {
        mgg[] mggVarArr = {new mgg(false, 3, 5, 8, 8, 1), new mgg(false, 5, 7, 10, 10, 1), new mgg(true, 5, 7, 16, 6, 1), new mgg(false, 8, 10, 12, 12, 1), new mgg(true, 10, 11, 14, 6, 2), new mgg(false, 12, 12, 14, 14, 1), new mgg(true, 16, 14, 24, 10, 1), new mgg(false, 18, 14, 16, 16, 1), new mgg(false, 22, 18, 18, 18, 1), new mgg(true, 22, 18, 16, 10, 2), new mgg(false, 30, 20, 20, 20, 1), new mgg(true, 32, 24, 16, 14, 2), new mgg(false, 36, 24, 22, 22, 1), new mgg(false, 44, 28, 24, 24, 1), new mgg(true, 49, 28, 22, 14, 2), new mgg(false, 62, 36, 14, 14, 4), new mgg(false, 86, 42, 16, 16, 4), new mgg(false, Opcodes.FREM, 48, 18, 18, 4), new mgg(false, Opcodes.D2F, 56, 20, 20, 4), new mgg(false, Opcodes.FRETURN, 68, 22, 22, 4), new mgg(false, 204, 84, 24, 24, 4, 102, 42), new mgg(false, 280, 112, 14, 14, 16, Opcodes.F2L, 56), new mgg(false, 368, Opcodes.D2F, 16, 16, 16, 92, 36), new mgg(false, 456, Opcodes.CHECKCAST, 18, 18, 16, Opcodes.FREM, 48), new mgg(false, 576, 224, 20, 20, 16, Opcodes.D2F, 56), new mgg(false, 696, 272, 22, 22, 16, Opcodes.FRETURN, 68), new mgg(false, 816, 336, 24, 24, 16, Opcodes.L2I, 56), new mgg(false, ClientProto.OAUTH_SCOPES_FIELD_NUMBER, HttpStatus.SC_REQUEST_TIMEOUT, 18, 18, 36, Opcodes.DRETURN, 68), new mgg(false, 1304, 496, 20, 20, 36, Opcodes.IF_ICMPGT, 62), new nu4()};
        f35413i = mggVarArr;
        f35414j = mggVarArr;
    }

    public mgg(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: l */
    public static mgg m39006l(int i, ngg nggVar, ft5 ft5Var, ft5 ft5Var2, boolean z) {
        for (mgg mggVar : f35414j) {
            if (!(nggVar == ngg.FORCE_SQUARE && mggVar.f35415a) && ((nggVar != ngg.FORCE_RECTANGLE || mggVar.f35415a) && i <= mggVar.f35416b)) {
                return mggVar;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
        }
        return null;
    }

    /* renamed from: a */
    public final int m39007a() {
        return this.f35416b;
    }

    /* renamed from: b */
    public int mo39008b(int i) {
        return this.f35421g;
    }

    /* renamed from: c */
    public final int m39009c() {
        return this.f35417c;
    }

    /* renamed from: d */
    public final int m39010d(int i) {
        return this.f35422h;
    }

    /* renamed from: e */
    public final int m39011e() {
        int i = this.f35420f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: f */
    public int mo39012f() {
        return this.f35416b / this.f35421g;
    }

    /* renamed from: g */
    public final int m39013g() {
        return m39017k() * this.f35419e;
    }

    /* renamed from: h */
    public final int m39014h() {
        return m39011e() * this.f35418d;
    }

    /* renamed from: i */
    public final int m39015i() {
        return m39013g() + (m39017k() << 1);
    }

    /* renamed from: j */
    public final int m39016j() {
        return m39014h() + (m39011e() << 1);
    }

    /* renamed from: k */
    public final int m39017k() {
        int i = this.f35420f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35415a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f35418d);
        sb.append('x');
        sb.append(this.f35419e);
        sb.append(", symbol size ");
        sb.append(m39016j());
        sb.append('x');
        sb.append(m39015i());
        sb.append(", symbol data size ");
        sb.append(m39014h());
        sb.append('x');
        sb.append(m39013g());
        sb.append(", codewords ");
        sb.append(this.f35416b);
        sb.append('+');
        sb.append(this.f35417c);
        return sb.toString();
    }

    public mgg(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f35415a = z;
        this.f35416b = i;
        this.f35417c = i2;
        this.f35418d = i3;
        this.f35419e = i4;
        this.f35420f = i5;
        this.f35421g = i6;
        this.f35422h = i7;
    }
}
