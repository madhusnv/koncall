package p001o;

import java.io.InputStream;
import java.net.URL;
import p001o.lu4;

/* loaded from: classes.dex */
public class hd8 implements lu4 {

    /* renamed from: a */
    public final od8 f26678a;

    /* renamed from: b */
    public volatile boolean f26679b;

    public hd8(od8 od8Var) {
        this.f26678a = od8Var;
    }

    @Override // p001o.lu4
    /* renamed from: a */
    public Class mo18153a() {
        return InputStream.class;
    }

    @Override // p001o.lu4
    /* renamed from: b */
    public void mo18154b() {
    }

    /* renamed from: c */
    public final void m30252c(od8 od8Var, lu4.InterfaceC15153a interfaceC15153a) {
        StringBuilder sb = new StringBuilder();
        sb.append("No image retrieved for the model: ");
        sb.append(od8Var.toString());
        URL urlM29295n = gq9.m29295n(od8Var.m42072a());
        System.out.println("url is : " + urlM29295n.toString());
        new mgf().m39003a(this, urlM29295n.toString(), interfaceC15153a);
    }

    @Override // p001o.lu4
    public void cancel() {
        this.f26679b = true;
    }

    @Override // p001o.lu4
    /* renamed from: d */
    public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
        m30252c(this.f26678a, interfaceC15153a);
    }

    @Override // p001o.lu4
    /* renamed from: e */
    public ez4 mo18156e() {
        return ez4.REMOTE;
    }
}
