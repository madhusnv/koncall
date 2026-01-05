package mj;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.encoders.EncodingException;
import com.skydoves.balloon.internals.DefinitionKt;
import ee.C2039g;
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
import lj.C4478a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mj.g */
/* loaded from: classes.dex */
public final class C4759g implements InterfaceC3779d {

    /* renamed from: f */
    public static final Charset f23752f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C3777b f23753g;

    /* renamed from: h */
    public static final C3777b f23754h;

    /* renamed from: i */
    public static final C4478a f23755i;

    /* renamed from: a */
    public OutputStream f23756a;

    /* renamed from: b */
    public final HashMap f23757b;

    /* renamed from: c */
    public final HashMap f23758c;

    /* renamed from: d */
    public final InterfaceC3778c f23759d;

    /* renamed from: e */
    public final C4761i f23760e = new C4761i(this, 0);

    static {
        C2039g c2039gM5753g = C2039g.m5753g();
        c2039gM5753g.f9605b = 1;
        f23753g = new C3777b(TransferTable.COLUMN_KEY, a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g.m5758f())));
        C2039g c2039gM5753g2 = C2039g.m5753g();
        c2039gM5753g2.f9605b = 2;
        f23754h = new C3777b("value", a1.m14341u(a1.m14340t(InterfaceC4757e.class, c2039gM5753g2.m5758f())));
        f23755i = new C4478a(1);
    }

    public C4759g(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, InterfaceC3778c interfaceC3778c) {
        this.f23756a = byteArrayOutputStream;
        this.f23757b = map;
        this.f23758c = map2;
        this.f23759d = interfaceC3778c;
    }

    /* renamed from: k */
    public static int m9675k(C3777b c3777b) {
        InterfaceC4757e interfaceC4757e = (InterfaceC4757e) c3777b.m8301b(InterfaceC4757e.class);
        if (interfaceC4757e != null) {
            return ((C4753a) interfaceC4757e).f23747a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: a */
    public final InterfaceC3779d mo8302a(C3777b c3777b, Object obj) {
        m9679i(c3777b, obj, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: b */
    public final InterfaceC3779d mo8303b(C3777b c3777b, boolean z6) {
        m9677g(c3777b, z6 ? 1 : 0, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: c */
    public final InterfaceC3779d mo8304c(C3777b c3777b, double d2) throws IOException {
        m9676f(c3777b, d2, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: d */
    public final InterfaceC3779d mo8305d(C3777b c3777b, long j6) throws IOException {
        m9678h(c3777b, j6, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: e */
    public final InterfaceC3779d mo8306e(C3777b c3777b, int i10) {
        m9677g(c3777b, i10, true);
        return this;
    }

    /* renamed from: f */
    public final void m9676f(C3777b c3777b, double d2, boolean z6) throws IOException {
        if (z6 && d2 == 0.0d) {
            return;
        }
        m9681l((m9675k(c3777b) << 3) | 1);
        this.f23756a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d2).array());
    }

    /* renamed from: g */
    public final void m9677g(C3777b c3777b, int i10, boolean z6) {
        if (z6 && i10 == 0) {
            return;
        }
        InterfaceC4757e interfaceC4757e = (InterfaceC4757e) c3777b.m8301b(InterfaceC4757e.class);
        if (interfaceC4757e == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int[] iArr = AbstractC4758f.f23751a;
        C4753a c4753a = (C4753a) interfaceC4757e;
        int i11 = c4753a.f23747a;
        int i12 = iArr[c4753a.f23748b.ordinal()];
        if (i12 == 1) {
            m9681l(i11 << 3);
            m9681l(i10);
        } else if (i12 == 2) {
            m9681l(i11 << 3);
            m9681l((i10 << 1) ^ (i10 >> 31));
        } else {
            if (i12 != 3) {
                return;
            }
            m9681l((i11 << 3) | 5);
            this.f23756a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    /* renamed from: h */
    public final void m9678h(C3777b c3777b, long j6, boolean z6) throws IOException {
        if (z6 && j6 == 0) {
            return;
        }
        InterfaceC4757e interfaceC4757e = (InterfaceC4757e) c3777b.m8301b(InterfaceC4757e.class);
        if (interfaceC4757e == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int[] iArr = AbstractC4758f.f23751a;
        C4753a c4753a = (C4753a) interfaceC4757e;
        int i10 = c4753a.f23747a;
        int i11 = iArr[c4753a.f23748b.ordinal()];
        if (i11 == 1) {
            m9681l(i10 << 3);
            m9682m(j6);
        } else if (i11 == 2) {
            m9681l(i10 << 3);
            m9682m((j6 >> 63) ^ (j6 << 1));
        } else {
            if (i11 != 3) {
                return;
            }
            m9681l((i10 << 3) | 1);
            this.f23756a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j6).array());
        }
    }

    /* renamed from: i */
    public final void m9679i(C3777b c3777b, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            m9681l((m9675k(c3777b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f23752f);
            m9681l(bytes.length);
            this.f23756a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m9679i(c3777b, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m9680j(f23755i, c3777b, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m9676f(c3777b, ((Double) obj).doubleValue(), z6);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == DefinitionKt.NO_Float_VALUE) {
                return;
            }
            m9681l((m9675k(c3777b) << 3) | 5);
            this.f23756a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m9678h(c3777b, ((Number) obj).longValue(), z6);
            return;
        }
        if (obj instanceof Boolean) {
            m9677g(c3777b, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            m9681l((m9675k(c3777b) << 3) | 2);
            m9681l(bArr.length);
            this.f23756a.write(bArr);
            return;
        }
        InterfaceC3778c interfaceC3778c = (InterfaceC3778c) this.f23757b.get(obj.getClass());
        if (interfaceC3778c != null) {
            m9680j(interfaceC3778c, c3777b, obj, z6);
            return;
        }
        InterfaceC3780e interfaceC3780e = (InterfaceC3780e) this.f23758c.get(obj.getClass());
        if (interfaceC3780e != null) {
            C4761i c4761i = this.f23760e;
            c4761i.f23763b = false;
            c4761i.f23765d = c3777b;
            c4761i.f23764c = z6;
            interfaceC3780e.mo5788a(obj, c4761i);
            return;
        }
        if (obj instanceof InterfaceC4755c) {
            m9677g(c3777b, ((InterfaceC4755c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            m9677g(c3777b, ((Enum) obj).ordinal(), true);
        } else {
            m9680j(this.f23759d, c3777b, obj, z6);
        }
    }

    /* renamed from: j */
    public final void m9680j(InterfaceC3778c interfaceC3778c, C3777b c3777b, Object obj, boolean z6) throws IOException {
        C4754b c4754b = new C4754b(0);
        c4754b.f23750b = 0L;
        try {
            OutputStream outputStream = this.f23756a;
            this.f23756a = c4754b;
            try {
                interfaceC3778c.mo5788a(obj, this);
                this.f23756a = outputStream;
                long j6 = c4754b.f23750b;
                c4754b.close();
                if (z6 && j6 == 0) {
                    return;
                }
                m9681l((m9675k(c3777b) << 3) | 2);
                m9682m(j6);
                interfaceC3778c.mo5788a(obj, this);
            } catch (Throwable th2) {
                this.f23756a = outputStream;
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
    public final void m9681l(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f23756a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f23756a.write(i10 & 127);
    }

    /* renamed from: m */
    public final void m9682m(long j6) throws IOException {
        while (((-128) & j6) != 0) {
            this.f23756a.write((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        this.f23756a.write(((int) j6) & 127);
    }
}
