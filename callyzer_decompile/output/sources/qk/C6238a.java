package qk;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4104x;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qk.a */
/* loaded from: classes.dex */
public final class C6238a extends AbstractC4103w {

    /* renamed from: b */
    public static final a f30255b = new a();

    /* renamed from: a */
    public final SimpleDateFormat f30256a;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: qk.a$a */
    public class a implements InterfaceC4104x {
        @Override // kk.InterfaceC4104x
        /* renamed from: a */
        public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new C6238a(0);
            }
            return null;
        }
    }

    public /* synthetic */ C6238a(int i10) {
        this();
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        Date date;
        if (c6564a.E0() == EnumC6565b.NULL) {
            c6564a.A0();
            return null;
        }
        String strC0 = c6564a.C0();
        synchronized (this) {
            TimeZone timeZone = this.f30256a.getTimeZone();
            try {
                try {
                    date = new Date(this.f30256a.parse(strC0).getTime());
                } catch (ParseException e2) {
                    throw new JsonSyntaxException("Failed parsing '" + strC0 + "' as SQL Date; at path " + c6564a.mo10022P(), e2);
                }
            } finally {
                this.f30256a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c6566c.mo10029J();
            return;
        }
        synchronized (this) {
            str = this.f30256a.format((java.util.Date) date);
        }
        c6566c.v0(str);
    }

    private C6238a() {
        this.f30256a = new SimpleDateFormat("MMM d, yyyy");
    }
}
