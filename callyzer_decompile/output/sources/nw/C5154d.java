package nw;

import dj.RunnableC1730c;
import jakarta.activation.MimeTypeParseException;
import jakarta.activation.UnsupportedDataTypeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.WeakHashMap;
import og.c2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nw.d */
/* loaded from: classes3.dex */
public class C5154d {

    /* renamed from: a */
    public final InterfaceC5156f f25224a;

    /* renamed from: b */
    public C5155e f25225b;

    /* renamed from: c */
    public final Object f25226c;

    /* renamed from: d */
    public final String f25227d;

    /* renamed from: e */
    public InterfaceC5153c f25228e;

    /* renamed from: f */
    public String f25229f;

    public C5154d(InterfaceC5156f interfaceC5156f) {
        this.f25225b = null;
        this.f25226c = null;
        this.f25227d = null;
        this.f25228e = null;
        this.f25229f = null;
        this.f25224a = interfaceC5156f;
    }

    /* renamed from: a */
    public final synchronized String m10061a() {
        if (this.f25229f == null) {
            String strM10063c = m10063c();
            try {
                C5160j c5160j = new C5160j(strM10063c);
                this.f25229f = c5160j.f25237a + "/" + c5160j.f25238b;
            } catch (MimeTypeParseException unused) {
                this.f25229f = strM10063c;
            }
        }
        return this.f25229f;
    }

    /* renamed from: b */
    public final Object m10062b() {
        Object obj = this.f25226c;
        if (obj != null) {
            return obj;
        }
        InterfaceC5153c interfaceC5153cM10064d = m10064d();
        InterfaceC5156f interfaceC5156f = this.f25224a;
        if (interfaceC5156f == null) {
            if (this.f25225b == null) {
                C5155e c5155e = new C5155e();
                c5155e.f25231b = this;
                this.f25225b = c5155e;
            }
            interfaceC5156f = this.f25225b;
        }
        return interfaceC5153cM10064d.getContent(interfaceC5156f);
    }

    /* renamed from: c */
    public final String m10063c() {
        InterfaceC5156f interfaceC5156f = this.f25224a;
        return interfaceC5156f != null ? interfaceC5156f.getContentType() : this.f25227d;
    }

    /* renamed from: d */
    public final synchronized InterfaceC5153c m10064d() {
        AbstractC5152b c5159i;
        AbstractC5152b c5159i2;
        InterfaceC5153c interfaceC5153c = this.f25228e;
        if (interfaceC5153c != null) {
            return interfaceC5153c;
        }
        String strM10061a = m10061a();
        if (this.f25228e == null) {
            if (this.f25224a != null) {
                synchronized (this) {
                    try {
                        WeakHashMap weakHashMap = AbstractC5152b.f25223a;
                        synchronized (AbstractC5152b.class) {
                            ClassLoader classLoaderM10571b = c2.m10571b();
                            WeakHashMap weakHashMap2 = AbstractC5152b.f25223a;
                            c5159i2 = (AbstractC5152b) weakHashMap2.get(classLoaderM10571b);
                            if (c5159i2 == null) {
                                c5159i2 = new C5159i();
                                weakHashMap2.put(classLoaderM10571b, c5159i2);
                            }
                        }
                        this.f25228e = c5159i2.mo10060a(strM10061a);
                    } finally {
                    }
                }
            } else {
                synchronized (this) {
                    try {
                        WeakHashMap weakHashMap3 = AbstractC5152b.f25223a;
                        synchronized (AbstractC5152b.class) {
                            ClassLoader classLoaderM10571b2 = c2.m10571b();
                            WeakHashMap weakHashMap4 = AbstractC5152b.f25223a;
                            c5159i = (AbstractC5152b) weakHashMap4.get(classLoaderM10571b2);
                            if (c5159i == null) {
                                c5159i = new C5159i();
                                weakHashMap4.put(classLoaderM10571b2, c5159i);
                            }
                        }
                        this.f25228e = c5159i.mo10060a(strM10061a);
                    } finally {
                    }
                }
            }
        }
        InterfaceC5156f interfaceC5156f = this.f25224a;
        if (interfaceC5156f != null) {
            InterfaceC5153c interfaceC5153c2 = this.f25228e;
            C5157g c5157g = new C5157g();
            c5157g.f25232a = interfaceC5156f;
            c5157g.f25233b = interfaceC5153c2;
            this.f25228e = c5157g;
        } else {
            InterfaceC5153c interfaceC5153c3 = this.f25228e;
            Object obj = this.f25226c;
            String str = this.f25227d;
            C5162l c5162l = new C5162l();
            c5162l.f25242a = obj;
            c5162l.f25243b = str;
            c5162l.f25244c = interfaceC5153c3;
            this.f25228e = c5162l;
        }
        return this.f25228e;
    }

    /* renamed from: e */
    public final InputStream m10065e() throws UnsupportedDataTypeException {
        InterfaceC5156f interfaceC5156f = this.f25224a;
        if (interfaceC5156f != null) {
            return interfaceC5156f.getInputStream();
        }
        InterfaceC5153c interfaceC5153cM10064d = m10064d();
        if (interfaceC5153cM10064d == null) {
            throw new UnsupportedDataTypeException("no DCH for MIME type " + m10061a());
        }
        if ((interfaceC5153cM10064d instanceof C5162l) && ((C5162l) interfaceC5153cM10064d).f25244c == null) {
            throw new UnsupportedDataTypeException("no object DCH for MIME type " + m10061a());
        }
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
        new Thread(new RunnableC1730c(1, this, interfaceC5153cM10064d, pipedOutputStream), "DataHandler.getInputStream").start();
        return pipedInputStream;
    }

    /* renamed from: f */
    public final String m10066f() {
        InterfaceC5156f interfaceC5156f = this.f25224a;
        if (interfaceC5156f != null) {
            return interfaceC5156f.getName();
        }
        return null;
    }

    /* renamed from: g */
    public final void m10067g(OutputStream outputStream) throws IOException {
        InterfaceC5156f interfaceC5156f = this.f25224a;
        if (interfaceC5156f == null) {
            m10064d().writeTo(this.f25226c, this.f25227d, outputStream);
            return;
        }
        byte[] bArr = new byte[8192];
        InputStream inputStream = interfaceC5156f.getInputStream();
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i10);
                }
            } finally {
                inputStream.close();
            }
        }
    }

    public C5154d(Object obj, String str) {
        this.f25224a = null;
        this.f25225b = null;
        this.f25228e = null;
        this.f25229f = null;
        this.f25226c = obj;
        this.f25227d = str;
    }
}
