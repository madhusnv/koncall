package p001o;

import p001o.gjb;
import p001o.lu4;

/* loaded from: classes5.dex */
public class b4i implements gjb {

    /* renamed from: a */
    public static final b4i f15537a = new b4i();

    /* renamed from: o.b4i$a */
    public static class C12280a implements hjb {

        /* renamed from: a */
        public static final C12280a f15538a = new C12280a();

        /* renamed from: a */
        public static C12280a m18151a() {
            return f15538a;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return b4i.m18148c();
        }
    }

    /* renamed from: o.b4i$b */
    public static class C12281b implements lu4 {

        /* renamed from: a */
        public final Object f15539a;

        public C12281b(Object obj) {
            this.f15539a = obj;
        }

        @Override // p001o.lu4
        /* renamed from: a */
        public Class mo18153a() {
            return this.f15539a.getClass();
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
            interfaceC15153a.mo17836f(this.f15539a);
        }

        @Override // p001o.lu4
        /* renamed from: e */
        public ez4 mo18156e() {
            return ez4.LOCAL;
        }
    }

    /* renamed from: c */
    public static b4i m18148c() {
        return f15537a;
    }

    @Override // p001o.gjb
    /* renamed from: a */
    public boolean mo18149a(Object obj) {
        return true;
    }

    @Override // p001o.gjb
    /* renamed from: b */
    public gjb.C13758a mo18150b(Object obj, int i, int i2, rec recVar) {
        return new gjb.C13758a(new l6c(obj), new C12281b(obj));
    }
}
