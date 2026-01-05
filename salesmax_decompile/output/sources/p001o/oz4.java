package p001o;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p001o.gjb;
import p001o.lu4;

/* loaded from: classes5.dex */
public final class oz4 implements gjb {

    /* renamed from: a */
    public final InterfaceC15915a f39092a;

    /* renamed from: o.oz4$a */
    public interface InterfaceC15915a {
        /* renamed from: a */
        Class mo42798a();

        /* renamed from: b */
        void mo42799b(Object obj);

        Object decode(String str);
    }

    /* renamed from: o.oz4$b */
    public static final class C15916b implements lu4 {

        /* renamed from: a */
        public final String f39093a;

        /* renamed from: b */
        public final InterfaceC15915a f39094b;

        /* renamed from: c */
        public Object f39095c;

        public C15916b(String str, InterfaceC15915a interfaceC15915a) {
            this.f39093a = str;
            this.f39094b = interfaceC15915a;
        }

        @Override // p001o.lu4
        /* renamed from: a */
        public Class mo18153a() {
            return this.f39094b.mo42798a();
        }

        @Override // p001o.lu4
        /* renamed from: b */
        public void mo18154b() {
            try {
                this.f39094b.mo42799b(this.f39095c);
            } catch (IOException unused) {
            }
        }

        @Override // p001o.lu4
        public void cancel() {
        }

        @Override // p001o.lu4
        /* renamed from: d */
        public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
            try {
                Object objDecode = this.f39094b.decode(this.f39093a);
                this.f39095c = objDecode;
                interfaceC15153a.mo17836f(objDecode);
            } catch (IllegalArgumentException e) {
                interfaceC15153a.mo17835c(e);
            }
        }

        @Override // p001o.lu4
        /* renamed from: e */
        public ez4 mo18156e() {
            return ez4.LOCAL;
        }
    }

    /* renamed from: o.oz4$c */
    public static final class C15917c implements hjb {

        /* renamed from: a */
        public final InterfaceC15915a f39096a = new a();

        /* renamed from: o.oz4$c$a */
        public class a implements InterfaceC15915a {
            public a() {
            }

            @Override // p001o.oz4.InterfaceC15915a
            /* renamed from: a */
            public Class mo42798a() {
                return InputStream.class;
            }

            @Override // p001o.oz4.InterfaceC15915a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo42799b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p001o.oz4.InterfaceC15915a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream decode(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new oz4(this.f39096a);
        }
    }

    public oz4(InterfaceC15915a interfaceC15915a) {
        this.f39092a = interfaceC15915a;
    }

    @Override // p001o.gjb
    /* renamed from: a */
    public boolean mo18149a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // p001o.gjb
    /* renamed from: b */
    public gjb.C13758a mo18150b(Object obj, int i, int i2, rec recVar) {
        return new gjb.C13758a(new l6c(obj), new C15916b(obj.toString(), this.f39092a));
    }
}
