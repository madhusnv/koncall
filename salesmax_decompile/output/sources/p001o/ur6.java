package p001o;

import com.facebook.C10773c;
import java.util.Random;
import p001o.mt6;

/* loaded from: classes5.dex */
public class ur6 extends RuntimeException {

    /* renamed from: a */
    public static final C17435a f49397a = new C17435a(null);

    /* renamed from: o.ur6$a */
    public static final class C17435a {
        public C17435a() {
        }

        public /* synthetic */ C17435a(id5 id5Var) {
            this();
        }
    }

    public ur6() {
    }

    /* renamed from: b */
    public static final void m51950b(String str, boolean z) {
        if (z) {
            try {
                qj6.m45539g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public ur6(final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !C10773c.m12993G() || random.nextInt(100) <= 50) {
            return;
        }
        mt6.m39645a(mt6.EnumC15426c.ErrorReport, new mt6.InterfaceC15425b() { // from class: o.tr6
            @Override // p001o.mt6.InterfaceC15425b
            /* renamed from: a */
            public final void mo17402a(boolean z) {
                ur6.m51950b(str, z);
            }
        });
    }

    public ur6(String str, Throwable th) {
        super(str, th);
    }

    public ur6(Throwable th) {
        super(th);
    }
}
