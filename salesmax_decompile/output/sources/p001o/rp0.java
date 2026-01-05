package p001o;

import android.content.res.AssetManager;
import java.io.IOException;
import p001o.lu4;

/* loaded from: classes5.dex */
public abstract class rp0 implements lu4 {

    /* renamed from: a */
    public final String f43910a;

    /* renamed from: b */
    public final AssetManager f43911b;

    /* renamed from: c */
    public Object f43912c;

    public rp0(AssetManager assetManager, String str) {
        this.f43911b = assetManager;
        this.f43910a = str;
    }

    @Override // p001o.lu4
    /* renamed from: b */
    public void mo18154b() {
        Object obj = this.f43912c;
        if (obj == null) {
            return;
        }
        try {
            mo41647c(obj);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo41647c(Object obj);

    @Override // p001o.lu4
    public void cancel() {
    }

    @Override // p001o.lu4
    /* renamed from: d */
    public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
        try {
            Object objMo41648f = mo41648f(this.f43911b, this.f43910a);
            this.f43912c = objMo41648f;
            interfaceC15153a.mo17836f(objMo41648f);
        } catch (IOException e) {
            interfaceC15153a.mo17835c(e);
        }
    }

    @Override // p001o.lu4
    /* renamed from: e */
    public ez4 mo18156e() {
        return ez4.LOCAL;
    }

    /* renamed from: f */
    public abstract Object mo41648f(AssetManager assetManager, String str);
}
