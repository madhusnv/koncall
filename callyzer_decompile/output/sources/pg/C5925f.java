package pg;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.encoders.EncodingException;
import com.skydoves.balloon.internals.DefinitionKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
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

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.f */
/* loaded from: classes.dex */
public final class C5925f implements InterfaceC3779d {

    /* renamed from: f */
    public static final Charset f28829f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C3777b f28830g;

    /* renamed from: h */
    public static final C3777b f28831h;

    /* renamed from: i */
    public static final C5924e f28832i;

    /* renamed from: a */
    public OutputStream f28833a;

    /* renamed from: b */
    public final HashMap f28834b;

    /* renamed from: c */
    public final HashMap f28835c;

    /* renamed from: d */
    public final InterfaceC3778c f28836d;

    /* renamed from: e */
    public final C4761i f28837e = new C4761i(this, 2);

    static {
        EnumC5922c enumC5922c = EnumC5922c.DEFAULT;
        C5920a c5920a = new C5920a(1, enumC5922c);
        HashMap map = new HashMap();
        map.put(InterfaceC5923d.class, c5920a);
        f28830g = new C3777b(TransferTable.COLUMN_KEY, p020v.a1.m14341u(map));
        C5920a c5920a2 = new C5920a(2, enumC5922c);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC5923d.class, c5920a2);
        f28831h = new C3777b("value", p020v.a1.m14341u(map2));
        f28832i = C5924e.f28820b;
    }

    public C5925f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, InterfaceC3778c interfaceC3778c) {
        this.f28833a = byteArrayOutputStream;
        this.f28834b = map;
        this.f28835c = map2;
        this.f28836d = interfaceC3778c;
    }

    /* renamed from: j */
    public static int m11609j(C3777b c3777b) {
        InterfaceC5923d interfaceC5923d = (InterfaceC5923d) c3777b.m8301b(InterfaceC5923d.class);
        if (interfaceC5923d != null) {
            return ((C5920a) interfaceC5923d).f28784a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: a */
    public final InterfaceC3779d mo8302a(C3777b c3777b, Object obj) {
        m11611g(c3777b, obj, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: b */
    public final /* synthetic */ InterfaceC3779d mo8303b(C3777b c3777b, boolean z6) {
        m11612h(c3777b, z6 ? 1 : 0, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: c */
    public final InterfaceC3779d mo8304c(C3777b c3777b, double d2) throws IOException {
        m11610f(c3777b, d2, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: d */
    public final /* synthetic */ InterfaceC3779d mo8305d(C3777b c3777b, long j6) throws IOException {
        m11613i(c3777b, j6, true);
        return this;
    }

    @Override // jj.InterfaceC3779d
    /* renamed from: e */
    public final /* synthetic */ InterfaceC3779d mo8306e(C3777b c3777b, int i10) {
        m11612h(c3777b, i10, true);
        return this;
    }

    /* renamed from: f */
    public final void m11610f(C3777b c3777b, double d2, boolean z6) throws IOException {
        if (z6 && d2 == 0.0d) {
            return;
        }
        m11615l((m11609j(c3777b) << 3) | 1);
        this.f28833a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d2).array());
    }

    /* renamed from: g */
    public final void m11611g(C3777b c3777b, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            m11615l((m11609j(c3777b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f28829f);
            m11615l(bytes.length);
            this.f28833a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m11611g(c3777b, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m11614k(f28832i, c3777b, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m11610f(c3777b, ((Double) obj).doubleValue(), z6);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == DefinitionKt.NO_Float_VALUE) {
                return;
            }
            m11615l((m11609j(c3777b) << 3) | 5);
            this.f28833a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m11613i(c3777b, ((Number) obj).longValue(), z6);
            return;
        }
        if (obj instanceof Boolean) {
            m11612h(c3777b, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            m11615l((m11609j(c3777b) << 3) | 2);
            m11615l(bArr.length);
            this.f28833a.write(bArr);
            return;
        }
        InterfaceC3778c interfaceC3778c = (InterfaceC3778c) this.f28834b.get(obj.getClass());
        if (interfaceC3778c != null) {
            m11614k(interfaceC3778c, c3777b, obj, z6);
            return;
        }
        InterfaceC3780e interfaceC3780e = (InterfaceC3780e) this.f28835c.get(obj.getClass());
        if (interfaceC3780e != null) {
            C4761i c4761i = this.f28837e;
            c4761i.f23763b = false;
            c4761i.f23765d = c3777b;
            c4761i.f23764c = z6;
            interfaceC3780e.mo5788a(obj, c4761i);
            return;
        }
        if (obj instanceof InterfaceC5921b) {
            m11612h(c3777b, ((InterfaceC5921b) obj).zza(), true);
        } else if (obj instanceof Enum) {
            m11612h(c3777b, ((Enum) obj).ordinal(), true);
        } else {
            m11614k(this.f28836d, c3777b, obj, z6);
        }
    }

    /* renamed from: h */
    public final void m11612h(C3777b c3777b, int i10, boolean z6) {
        if (z6 && i10 == 0) {
            return;
        }
        InterfaceC5923d interfaceC5923d = (InterfaceC5923d) c3777b.m8301b(InterfaceC5923d.class);
        if (interfaceC5923d == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        EnumC5922c enumC5922c = EnumC5922c.DEFAULT;
        C5920a c5920a = (C5920a) interfaceC5923d;
        int i11 = c5920a.f28784a;
        int iOrdinal = c5920a.f28785b.ordinal();
        if (iOrdinal == 0) {
            m11615l(i11 << 3);
            m11615l(i10);
        } else if (iOrdinal == 1) {
            m11615l(i11 << 3);
            m11615l((i10 + i10) ^ (i10 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m11615l((i11 << 3) | 5);
            this.f28833a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    /* renamed from: i */
    public final void m11613i(C3777b c3777b, long j6, boolean z6) throws IOException {
        if (z6 && j6 == 0) {
            return;
        }
        InterfaceC5923d interfaceC5923d = (InterfaceC5923d) c3777b.m8301b(InterfaceC5923d.class);
        if (interfaceC5923d == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        EnumC5922c enumC5922c = EnumC5922c.DEFAULT;
        C5920a c5920a = (C5920a) interfaceC5923d;
        int i10 = c5920a.f28784a;
        int iOrdinal = c5920a.f28785b.ordinal();
        if (iOrdinal == 0) {
            m11615l(i10 << 3);
            m11616m(j6);
        } else if (iOrdinal == 1) {
            m11615l(i10 << 3);
            m11616m((j6 >> 63) ^ (j6 + j6));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m11615l((i10 << 3) | 1);
            this.f28833a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j6).array());
        }
    }

    /* renamed from: k */
    public final void m11614k(InterfaceC3778c interfaceC3778c, C3777b c3777b, Object obj, boolean z6) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C4754b c4754b = new C4754b(2);
        c4754b.f23750b = 0L;
        try {
            OutputStream outputStream = this.f28833a;
            this.f28833a = c4754b;
            try {
                interfaceC3778c.mo5788a(obj, this);
                this.f28833a = outputStream;
                long j6 = c4754b.f23750b;
                c4754b.close();
                if (z6 && j6 == 0) {
                    return;
                }
                m11615l((m11609j(c3777b) << 3) | 2);
                m11616m(j6);
                interfaceC3778c.mo5788a(obj, this);
            } catch (Throwable th2) {
                this.f28833a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c4754b.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    /* renamed from: l */
    public final void m11615l(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f28833a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f28833a.write(i10 & 127);
    }

    /* renamed from: m */
    public final void m11616m(long j6) throws IOException {
        while (((-128) & j6) != 0) {
            this.f28833a.write((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        this.f28833a.write(((int) j6) & 127);
    }
}
