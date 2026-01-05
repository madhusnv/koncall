package p001o;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p001o.gjb;
import p001o.lu4;

/* loaded from: classes5.dex */
public class cq1 implements gjb {

    /* renamed from: o.cq1$a */
    public static final class C12721a implements lu4 {

        /* renamed from: a */
        public final File f18494a;

        public C12721a(File file) {
            this.f18494a = file;
        }

        @Override // p001o.lu4
        /* renamed from: a */
        public Class mo18153a() {
            return ByteBuffer.class;
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
            try {
                interfaceC15153a.mo17836f(fq1.m27327a(this.f18494a));
            } catch (IOException e) {
                interfaceC15153a.mo17835c(e);
            }
        }

        @Override // p001o.lu4
        /* renamed from: e */
        public ez4 mo18156e() {
            return ez4.LOCAL;
        }
    }

    /* renamed from: o.cq1$b */
    public static class C12722b implements hjb {
        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new cq1();
        }
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(File file, int i, int i2, rec recVar) {
        return new gjb.C13758a(new l6c(file), new C12721a(file));
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(File file) {
        return true;
    }
}
