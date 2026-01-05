package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xv8 extends vv8 {

    /* renamed from: c */
    public static final C18250a f54353c = new C18250a(null);

    /* renamed from: d */
    public static final xv8 f54354d = new xv8(127, 0, 0, 1, null);

    /* renamed from: e */
    public static final xv8 f54355e = new xv8(0, 0, 0, 0, null);

    /* renamed from: b */
    public final byte[] f54356b;

    /* renamed from: o.xv8$a */
    public static final class C18250a {
        public C18250a() {
        }

        public /* synthetic */ C18250a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final xv8 m56863a() {
            return xv8.f54354d;
        }
    }

    public /* synthetic */ xv8(byte b, byte b2, byte b3, byte b4, id5 id5Var) {
        this(b, b2, b3, b4);
    }

    /* renamed from: d */
    public static final CharSequence m56859d(byte b) {
        return wzh.m55514g(wzh.m55511c(b));
    }

    @Override // p001o.vv8
    /* renamed from: a */
    public byte[] mo17900a() {
        return this.f54356b;
    }

    @Override // p001o.vv8
    /* renamed from: b */
    public boolean mo17901b() {
        return mo17900a()[0] == 127;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xv8.class == obj.getClass() && Arrays.equals(mo17900a(), ((xv8) obj).mo17900a());
    }

    /* renamed from: f */
    public String m56861f() {
        return gp0.q0(mo17900a(), ".", null, null, 0, null, new xk7() { // from class: o.wv8
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return xv8.m56859d(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final aw8 m56862g() {
        byte[] bArr = new byte[16];
        bArr[10] = -1;
        bArr[11] = -1;
        bArr[12] = mo17900a()[0];
        bArr[13] = mo17900a()[1];
        bArr[14] = mo17900a()[2];
        bArr[15] = mo17900a()[3];
        return new aw8(bArr, null, 2, 0 == true ? 1 : 0);
    }

    public int hashCode() {
        return Arrays.hashCode(mo17900a());
    }

    public String toString() {
        return m56861f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv8(byte[] bArr) {
        super(null);
        sq8.m48649h(bArr, "octets");
        this.f54356b = bArr;
        if (mo17900a().length == 4) {
            return;
        }
        throw new IllegalArgumentException(("Invalid IPv4 repr: " + mo17900a() + "; expected 4 bytes").toString());
    }

    public xv8(byte b, byte b2, byte b3, byte b4) {
        this(new byte[]{b, b2, b3, b4});
    }
}
