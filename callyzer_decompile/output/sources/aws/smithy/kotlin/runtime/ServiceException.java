package aws.smithy.kotlin.runtime;

import java.util.Iterator;
import java.util.List;
import og.pe;
import pg.b8;
import qb.C6152a;
import qb.C6153b;
import qb.InterfaceC6154c;
import rw.AbstractC6663m;
import rw.C6668r;
import sw.C6959c;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ServiceException extends SdkBaseException {

    /* renamed from: b */
    public final C0489b f3499b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: aws.smithy.kotlin.runtime.ServiceException$a */
    public static final class EnumC0487a {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
        private static final /* synthetic */ EnumC0487a[] $VALUES;
        public static final EnumC0487a Client = new EnumC0487a("Client", 0);
        public static final EnumC0487a Server = new EnumC0487a("Server", 1);
        public static final EnumC0487a Unknown = new EnumC0487a("Unknown", 2);

        private static final /* synthetic */ EnumC0487a[] $values() {
            return new EnumC0487a[]{Client, Server, Unknown};
        }

        static {
            EnumC0487a[] enumC0487aArr$values = $values();
            $VALUES = enumC0487aArr$values;
            $ENTRIES = b8.m11548b(enumC0487aArr$values);
        }

        private EnumC0487a(String str, int i10) {
        }

        public static InterfaceC8493a getEntries() {
            return $ENTRIES;
        }

        public static EnumC0487a valueOf(String str) {
            return (EnumC0487a) Enum.valueOf(EnumC0487a.class, str);
        }

        public static EnumC0487a[] values() {
            return (EnumC0487a[]) $VALUES.clone();
        }
    }

    public ServiceException() {
        this.f3499b = new C0489b();
    }

    @Override // aws.smithy.kotlin.runtime.SdkBaseException
    /* renamed from: b */
    public C0489b mo1480b() {
        return this.f3499b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        C6959c c6959cM10829d = pe.m10829d();
        String message = super.getMessage();
        if (message == null) {
            message = (String) mo1480b().f3503a.mo1864e(C0489b.f3505f);
        }
        if (message == null) {
            String str = (String) mo1480b().f3503a.mo1864e(C0489b.f3504e);
            if (str != null) {
                c6959cM10829d.add("Service returned error code ".concat(str));
            }
            StringBuilder sb2 = new StringBuilder("Error type: ");
            EnumC0487a enumC0487a = (EnumC0487a) mo1480b().f3503a.mo1864e(C0489b.f3506g);
            if (enumC0487a == null) {
                enumC0487a = EnumC0487a.Unknown;
            }
            sb2.append(enumC0487a);
            c6959cM10829d.add(sb2.toString());
            StringBuilder sb3 = new StringBuilder("Protocol response: ");
            InterfaceC6154c interfaceC6154c = (InterfaceC6154c) mo1480b().f3503a.mo1864e(C0489b.f3507h);
            if (interfaceC6154c == null) {
                interfaceC6154c = C6153b.f29997a;
            }
            sb3.append(interfaceC6154c.mo12193a());
            c6959cM10829d.add(sb3.toString());
        } else {
            c6959cM10829d.add(message);
        }
        String str2 = (String) mo1480b().f3503a.mo1864e(C0489b.f3508i);
        if (str2 != null) {
            c6959cM10829d.add("Request ID: ".concat(str2));
        }
        Iterable iterable = (List) mo1480b().f3503a.mo1864e(C0488a.f3500b);
        if (iterable == null) {
            iterable = C6668r.f31943a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c6959cM10829d.add(((C6152a) it.next()).f29996c);
        }
        return AbstractC6663m.m12748L(pe.m10828c(c6959cM10829d), null, null, null, null, 63);
    }

    public ServiceException(String str) {
        super(str);
        this.f3499b = new C0489b();
    }

    public ServiceException(String str, Exception exc) {
        super(str, exc);
        this.f3499b = new C0489b();
    }
}
