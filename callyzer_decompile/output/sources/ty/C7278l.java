package ty;

import com.sun.mail.util.AbstractC1452a;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import hz.AbstractC3063b;
import java.io.Closeable;
import java.util.EnumSet;
import java.util.LinkedList;
import net.schmizz.sshj.common.SSHException;
import net.schmizz.sshj.sftp.SFTPException;
import py.C6046b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.l */
/* loaded from: classes3.dex */
public final class C7278l implements Closeable {

    /* renamed from: a */
    public final InterfaceC2173b f34732a;

    /* renamed from: b */
    public final C7279m f34733b;

    public C7278l(C6046b c6046b) throws SSHException {
        C7279m c7279m = new C7279m(c6046b);
        this.f34733b = c7279m;
        C7281o c7281o = new C7281o(EnumC7272f.INIT);
        c7281o.m9918m(3);
        c7279m.m13602w(c7281o);
        C7271e c7271e = c7279m.f34739f;
        C7281o c7281oM13582c = c7271e.m13582c();
        EnumC7272f enumC7272fM13605B = c7281oM13582c.m13605B();
        if (enumC7272fM13605B != EnumC7272f.VERSION) {
            throw new SFTPException("Expected INIT packet, received: " + enumC7272fM13605B);
        }
        int iM9930y = (int) c7281oM13582c.m9930y();
        c7279m.f34742j = iM9930y;
        c7279m.f34735b.mo5849y(Integer.valueOf(iM9930y), "Server version {}");
        if (3 < c7279m.f34742j) {
            throw new SFTPException("Server reported incompatible protocol version: " + c7279m.f34742j);
        }
        while (c7281oM13582c.m9907a() > 0) {
            c7279m.f34743k.put(c7281oM13582c.m9929x(), c7281oM13582c.m9929x());
        }
        c7271e.start();
        this.f34733b.f34734a.getClass();
        this.f34732a = AbstractC2175d.m5852b(C7278l.class);
        this.f34733b.f34734a.getClass();
        AbstractC2175d.m5852b(AbstractC7280n.class);
        AbstractC2175d.m5852b(AbstractC3063b.class);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34733b.close();
    }

    /* renamed from: h */
    public final void m13596h(String str) {
        C7268b c7268bM13601u;
        LinkedList linkedList = new LinkedList();
        C7279m c7279m = this.f34733b;
        C7273g c7273gM2702i = c7279m.f34736c.m2702i(str);
        while (true) {
            String str2 = c7273gM2702i.f34721c;
            try {
                c7268bM13601u = c7279m.m13601u(str2);
            } catch (SFTPException e2) {
                EnumC7276j enumC7276j = e2.f24793c;
                if (enumC7276j == null) {
                    enumC7276j = EnumC7276j.UNKNOWN;
                }
                if (enumC7276j != EnumC7276j.NO_SUCH_FILE) {
                    throw e2;
                }
                c7268bM13601u = null;
            }
            if (c7268bM13601u != null) {
                if (((EnumC7269c) c7268bM13601u.f34704a.f9606c) != EnumC7269c.DIRECTORY) {
                    throw new SFTPException(AbstractC1452a.m4561h(str2, " exists but is not a directory"));
                }
                while (!linkedList.isEmpty()) {
                    String str3 = (String) linkedList.pop();
                    C7268b c7268b = C7268b.f34703i;
                    C7275i c7275iM13599j = c7279m.m13599j(EnumC7272f.MKDIR);
                    c7275iM13599j.m9917l(str3, c7279m.f34738e.f33733h);
                    c7275iM13599j.m13604A(c7268b);
                    c7279m.m13598h(c7275iM13599j).m13594D();
                }
                return;
            }
            linkedList.push(str2);
            c7273gM2702i = c7279m.f34736c.m2702i(c7273gM2702i.f34719a);
        }
    }

    /* renamed from: j */
    public final C7274h m13597j(String str, EnumSet enumSet) {
        C7268b c7268b = C7268b.f34703i;
        this.f34732a.mo5849y(str, "Opening `{}`");
        C7279m c7279m = this.f34733b;
        c7279m.getClass();
        C7275i c7275iM13599j = c7279m.m13599j(EnumC7272f.OPEN);
        c7275iM13599j.m9917l(str, c7279m.f34738e.f33733h);
        c7275iM13599j.m9918m(EnumC7270d.toMask(enumSet));
        c7275iM13599j.m13604A(c7268b);
        C7277k c7277kM13598h = c7279m.m13598h(c7275iM13599j);
        c7277kM13598h.m13593C(EnumC7272f.HANDLE);
        return new C7274h(c7279m, str, c7277kM13598h.m9925t());
    }
}
