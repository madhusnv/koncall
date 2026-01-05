package p001o;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import p001o.lu4;

/* loaded from: classes5.dex */
public abstract class lha implements lu4 {

    /* renamed from: a */
    public final Uri f33816a;

    /* renamed from: b */
    public final ContentResolver f33817b;

    /* renamed from: c */
    public Object f33818c;

    public lha(ContentResolver contentResolver, Uri uri) {
        this.f33817b = contentResolver;
        this.f33816a = uri;
    }

    @Override // p001o.lu4
    /* renamed from: b */
    public void mo18154b() {
        Object obj = this.f33818c;
        if (obj != null) {
            try {
                mo37219c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo37219c(Object obj);

    @Override // p001o.lu4
    public void cancel() {
    }

    @Override // p001o.lu4
    /* renamed from: d */
    public final void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
        try {
            Object objMo37220f = mo37220f(this.f33816a, this.f33817b);
            this.f33818c = objMo37220f;
            interfaceC15153a.mo17836f(objMo37220f);
        } catch (FileNotFoundException e) {
            interfaceC15153a.mo17835c(e);
        }
    }

    @Override // p001o.lu4
    /* renamed from: e */
    public ez4 mo18156e() {
        return ez4.LOCAL;
    }

    /* renamed from: f */
    public abstract Object mo37220f(Uri uri, ContentResolver contentResolver);
}
