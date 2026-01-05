package p001o;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.gjb;
import p001o.lu4;

/* loaded from: classes5.dex */
public class up1 implements gjb {

    /* renamed from: a */
    public final InterfaceC17425b f49302a;

    /* renamed from: o.up1$a */
    public static class C17424a implements hjb {

        /* renamed from: o.up1$a$a */
        public class a implements InterfaceC17425b {
            public a() {
            }

            @Override // p001o.up1.InterfaceC17425b
            /* renamed from: a */
            public Class mo51867a() {
                return ByteBuffer.class;
            }

            @Override // p001o.up1.InterfaceC17425b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo51868b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new up1(new a());
        }
    }

    /* renamed from: o.up1$b */
    public interface InterfaceC17425b {
        /* renamed from: a */
        Class mo51867a();

        /* renamed from: b */
        Object mo51868b(byte[] bArr);
    }

    /* renamed from: o.up1$c */
    public static class C17426c implements lu4 {

        /* renamed from: a */
        public final byte[] f49304a;

        /* renamed from: b */
        public final InterfaceC17425b f49305b;

        public C17426c(byte[] bArr, InterfaceC17425b interfaceC17425b) {
            this.f49304a = bArr;
            this.f49305b = interfaceC17425b;
        }

        @Override // p001o.lu4
        /* renamed from: a */
        public Class mo18153a() {
            return this.f49305b.mo51867a();
        }

        @Override // p001o.lu4
        /* renamed from: b */
        public void mo18154b() {
        }

        @Override // p001o.lu4
        public void cancel() {
        }

        @Override // p001o.lu4
        /* renamed from: d */
        public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
            interfaceC15153a.mo17836f(this.f49305b.mo51868b(this.f49304a));
        }

        @Override // p001o.lu4
        /* renamed from: e */
        public ez4 mo18156e() {
            return ez4.LOCAL;
        }
    }

    /* renamed from: o.up1$d */
    public static class C17427d implements hjb {

        /* renamed from: o.up1$d$a */
        public class a implements InterfaceC17425b {
            public a() {
            }

            @Override // p001o.up1.InterfaceC17425b
            /* renamed from: a */
            public Class mo51867a() {
                return InputStream.class;
            }

            @Override // p001o.up1.InterfaceC17425b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo51868b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new up1(new a());
        }
    }

    public up1(InterfaceC17425b interfaceC17425b) {
        this.f49302a = interfaceC17425b;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(byte[] bArr, int i, int i2, rec recVar) {
        return new gjb.C13758a(new l6c(bArr), new C17426c(bArr, this.f49302a));
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(byte[] bArr) {
        return true;
    }
}
