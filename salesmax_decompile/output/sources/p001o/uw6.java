package p001o;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p001o.gjb;
import p001o.lu4;

/* loaded from: classes5.dex */
public class uw6 implements gjb {

    /* renamed from: a */
    public final InterfaceC17463d f49567a;

    /* renamed from: o.uw6$a */
    public static class C17460a implements hjb {

        /* renamed from: a */
        public final InterfaceC17463d f49568a;

        public C17460a(InterfaceC17463d interfaceC17463d) {
            this.f49568a = interfaceC17463d;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public final gjb mo18152b(eob eobVar) {
            return new uw6(this.f49568a);
        }
    }

    /* renamed from: o.uw6$b */
    public static class C17461b extends C17460a {

        /* renamed from: o.uw6$b$a */
        public class a implements InterfaceC17463d {
            @Override // p001o.uw6.InterfaceC17463d
            /* renamed from: a */
            public Class mo52065a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p001o.uw6.InterfaceC17463d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo52066b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p001o.uw6.InterfaceC17463d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo52067c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C17461b() {
            super(new a());
        }
    }

    /* renamed from: o.uw6$c */
    public static final class C17462c implements lu4 {

        /* renamed from: a */
        public final File f49569a;

        /* renamed from: b */
        public final InterfaceC17463d f49570b;

        /* renamed from: c */
        public Object f49571c;

        public C17462c(File file, InterfaceC17463d interfaceC17463d) {
            this.f49569a = file;
            this.f49570b = interfaceC17463d;
        }

        @Override // p001o.lu4
        /* renamed from: a */
        public Class mo18153a() {
            return this.f49570b.mo52065a();
        }

        @Override // p001o.lu4
        /* renamed from: b */
        public void mo18154b() {
            Object obj = this.f49571c;
            if (obj != null) {
                try {
                    this.f49570b.mo52066b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // p001o.lu4
        public void cancel() {
        }

        @Override // p001o.lu4
        /* renamed from: d */
        public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
            try {
                Object objMo52067c = this.f49570b.mo52067c(this.f49569a);
                this.f49571c = objMo52067c;
                interfaceC15153a.mo17836f(objMo52067c);
            } catch (FileNotFoundException e) {
                interfaceC15153a.mo17835c(e);
            }
        }

        @Override // p001o.lu4
        /* renamed from: e */
        public ez4 mo18156e() {
            return ez4.LOCAL;
        }
    }

    /* renamed from: o.uw6$d */
    public interface InterfaceC17463d {
        /* renamed from: a */
        Class mo52065a();

        /* renamed from: b */
        void mo52066b(Object obj);

        /* renamed from: c */
        Object mo52067c(File file);
    }

    /* renamed from: o.uw6$e */
    public static class C17464e extends C17460a {

        /* renamed from: o.uw6$e$a */
        public class a implements InterfaceC17463d {
            @Override // p001o.uw6.InterfaceC17463d
            /* renamed from: a */
            public Class mo52065a() {
                return InputStream.class;
            }

            @Override // p001o.uw6.InterfaceC17463d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo52066b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p001o.uw6.InterfaceC17463d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo52067c(File file) {
                return new FileInputStream(file);
            }
        }

        public C17464e() {
            super(new a());
        }
    }

    public uw6(InterfaceC17463d interfaceC17463d) {
        this.f49567a = interfaceC17463d;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(File file, int i, int i2, rec recVar) {
        return new gjb.C13758a(new l6c(file), new C17462c(file, this.f49567a));
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(File file) {
        return true;
    }
}
