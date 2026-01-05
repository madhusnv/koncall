package og;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.encoders.EncodingException;
import com.skydoves.balloon.internals.DefinitionKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jj.C3777b;
import jj.InterfaceC3778c;
import jj.InterfaceC3779d;
import jj.InterfaceC3780e;
import mj.C4754b;
import mj.C4761i;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 implements InterfaceC3779d {

    /* renamed from: f */
    public static final Charset f26715f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C3777b f26716g;

    /* renamed from: h */
    public static final C3777b f26717h;

    /* renamed from: i */
    public static final o0 f26718i;

    /* renamed from: a */
    public OutputStream f26719a;

    /* renamed from: b */
    public final HashMap f26720b;

    /* renamed from: c */
    public final HashMap f26721c;

    /* renamed from: d */
    public final InterfaceC3778c f26722d;

    /* renamed from: e */
    public final C4761i f26723e = new C4761i(this, 1);

    static {
        m0 m0Var = m0.DEFAULT;
        f26716g = new C3777b(TransferTable.COLUMN_KEY, p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(1, m0Var))));
        f26717h = new C3777b("value", p020v.a1.m14341u(AbstractC4801l.m9743q(n0.class, new k0(2, m0Var))));
        f26718i = new o0(0);
    }

    public p0(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, InterfaceC3778c interfaceC3778c) {
        this.f26719a = byteArrayOutputStream;
        this.f26720b = map;
        this.f26721c = map2;
        this.f26722d = interfaceC3778c;
    }

    /* renamed from: j */
    public static int m10803j(C3777b c3777b) {
        n0 n0Var = (n0) c3777b.m8301b(n0.class);
        if (n0Var != null) {
            return ((k0) n0Var).f26570a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: a */
    public final InterfaceC3779d mo8302a(C3777b c3777b, Object obj) {
        m10805g(c3777b, obj, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: b */
    public final /* synthetic */ InterfaceC3779d mo8303b(C3777b c3777b, boolean z6) {
        m10806h(c3777b, z6 ? 1 : 0, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: c */
    public final InterfaceC3779d mo8304c(C3777b c3777b, double d2) throws IOException {
        m10804f(c3777b, d2, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: d */
    public final /* synthetic */ InterfaceC3779d mo8305d(C3777b c3777b, long j6) throws IOException {
        m10807i(c3777b, j6, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: e */
    public final /* synthetic */ InterfaceC3779d mo8306e(C3777b c3777b, int i10) {
        m10806h(c3777b, i10, true);
        return this;
    }

    /* renamed from: f */
    public final void m10804f(C3777b c3777b, double d2, boolean z6) throws IOException {
        if (z6 && d2 == 0.0d) {
            return;
        }
        m10809l((m10803j(c3777b) << 3) | 1);
        this.f26719a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d2).array());
    }

    /* renamed from: g */
    public final void m10805g(C3777b c3777b, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            m10809l((m10803j(c3777b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f26715f);
            m10809l(bytes.length);
            this.f26719a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m10805g(c3777b, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m10808k(f26718i, c3777b, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m10804f(c3777b, ((Double) obj).doubleValue(), z6);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == DefinitionKt.NO_Float_VALUE) {
                return;
            }
            m10809l((m10803j(c3777b) << 3) | 5);
            this.f26719a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m10807i(c3777b, ((Number) obj).longValue(), z6);
            return;
        }
        if (obj instanceof Boolean) {
            m10806h(c3777b, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            m10809l((m10803j(c3777b) << 3) | 2);
            m10809l(bArr.length);
            this.f26719a.write(bArr);
            return;
        }
        InterfaceC3778c interfaceC3778c = (InterfaceC3778c) this.f26720b.get(obj.getClass());
        if (interfaceC3778c != null) {
            m10808k(interfaceC3778c, c3777b, obj, z6);
            return;
        }
        InterfaceC3780e interfaceC3780e = (InterfaceC3780e) this.f26721c.get(obj.getClass());
        if (interfaceC3780e != null) {
            C4761i c4761i = this.f26723e;
            c4761i.f23763b = false;
            c4761i.f23765d = c3777b;
            c4761i.f23764c = z6;
            interfaceC3780e.mo5788a(obj, c4761i);
            return;
        }
        if (obj instanceof l0) {
            m10806h(c3777b, ((l0) obj).zza(), true);
        } else if (obj instanceof Enum) {
            m10806h(c3777b, ((Enum) obj).ordinal(), true);
        } else {
            m10808k(this.f26722d, c3777b, obj, z6);
        }
    }

    /* renamed from: h */
    public final void m10806h(C3777b c3777b, int i10, boolean z6) {
        if (z6 && i10 == 0) {
            return;
        }
        n0 n0Var = (n0) c3777b.m8301b(n0.class);
        if (n0Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        k0 k0Var = (k0) n0Var;
        int i11 = k0Var.f26570a;
        int iOrdinal = k0Var.f26571b.ordinal();
        if (iOrdinal == 0) {
            m10809l(i11 << 3);
            m10809l(i10);
        } else if (iOrdinal == 1) {
            m10809l(i11 << 3);
            m10809l((i10 + i10) ^ (i10 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m10809l((i11 << 3) | 5);
            this.f26719a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    /* renamed from: i */
    public final void m10807i(C3777b c3777b, long j6, boolean z6) throws IOException {
        if (z6 && j6 == 0) {
            return;
        }
        n0 n0Var = (n0) c3777b.m8301b(n0.class);
        if (n0Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        k0 k0Var = (k0) n0Var;
        int i10 = k0Var.f26570a;
        int iOrdinal = k0Var.f26571b.ordinal();
        if (iOrdinal == 0) {
            m10809l(i10 << 3);
            m10810m(j6);
        } else if (iOrdinal == 1) {
            m10809l(i10 << 3);
            m10810m((j6 >> 63) ^ (j6 + j6));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m10809l((i10 << 3) | 1);
            this.f26719a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j6).array());
        }
    }

    /* renamed from: k */
    public final void m10808k(InterfaceC3778c interfaceC3778c, C3777b c3777b, Object obj, boolean z6) throws IOException {
        C4754b c4754b = new C4754b(1);
        c4754b.f23750b = 0L;
        try {
            OutputStream outputStream = this.f26719a;
            this.f26719a = c4754b;
            try {
                interfaceC3778c.mo5788a(obj, this);
                this.f26719a = outputStream;
                long j6 = c4754b.f23750b;
                c4754b.close();
                if (z6 && j6 == 0) {
                    return;
                }
                m10809l((m10803j(c3777b) << 3) | 2);
                m10810m(j6);
                interfaceC3778c.mo5788a(obj, this);
            } catch (Throwable th2) {
                this.f26719a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c4754b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: l */
    public final void m10809l(int i10) throws IOException {
        while (true) {
            int i11 = i10 & 127;
            if ((i10 & (-128)) == 0) {
                this.f26719a.write(i11);
                return;
            } else {
                this.f26719a.write(i11 | 128);
                i10 >>>= 7;
            }
        }
    }

    /* renamed from: m */
    public final void m10810m(long j6) throws IOException {
        while (true) {
            int i10 = ((int) j6) & 127;
            if (((-128) & j6) == 0) {
                this.f26719a.write(i10);
                return;
            } else {
                this.f26719a.write(i10 | 128);
                j6 >>>= 7;
            }
        }
    }
}
