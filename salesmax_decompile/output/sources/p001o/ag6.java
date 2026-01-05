package p001o;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import p001o.jg6;

/* loaded from: classes4.dex */
public final class ag6 {

    /* renamed from: d */
    public static final Logger f14652d = Logger.getLogger(ag6.class.getName());

    /* renamed from: e */
    public static final List f14653e;

    /* renamed from: f */
    public static final ag6 f14654f;

    /* renamed from: g */
    public static final ag6 f14655g;

    /* renamed from: h */
    public static final ag6 f14656h;

    /* renamed from: i */
    public static final ag6 f14657i;

    /* renamed from: j */
    public static final ag6 f14658j;

    /* renamed from: k */
    public static final ag6 f14659k;

    /* renamed from: l */
    public static final ag6 f14660l;

    /* renamed from: a */
    public jg6 f14661a;

    /* renamed from: b */
    public List f14662b = f14653e;

    /* renamed from: c */
    public boolean f14663c = true;

    static {
        if (ybg.m57488b()) {
            f14653e = m17022b(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
        } else {
            f14653e = new ArrayList();
        }
        f14654f = new ag6(new jg6.C14528a());
        f14655g = new ag6(new jg6.C14532e());
        f14656h = new ag6(new jg6.C14534g());
        f14657i = new ag6(new jg6.C14533f());
        f14658j = new ag6(new jg6.C14529b());
        f14659k = new ag6(new jg6.C14531d());
        f14660l = new ag6(new jg6.C14530c());
    }

    public ag6(jg6 jg6Var) {
        this.f14661a = jg6Var;
    }

    /* renamed from: b */
    public static List m17022b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f14652d.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public Object m17023a(String str) throws GeneralSecurityException {
        Iterator it = this.f14662b.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f14661a.mo33789a(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (this.f14663c) {
            return this.f14661a.mo33789a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
