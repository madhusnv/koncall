package pg;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6662l;
import rw.C6668r;
import wc.InterfaceC7971e;
import yc.C8612a;
import yc.InterfaceC8613b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i8 {
    /* renamed from: a */
    public static final InterfaceC7971e m11698a(InterfaceC7971e handler, InterfaceC8613b... middleware) {
        List listM10833h;
        AbstractC4154l.m8923f(handler, "handler");
        AbstractC4154l.m8923f(middleware, "middleware");
        if (middleware.length == 0) {
            return handler;
        }
        int length = middleware.length - 1;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            listM10833h = C6668r.f31943a;
        } else if (length >= middleware.length) {
            listM10833h = AbstractC6662l.m12708K(middleware);
        } else if (length == 1) {
            listM10833h = pe.m10833h(middleware[0]);
        } else {
            ArrayList arrayList = new ArrayList(length);
            int i10 = 0;
            for (InterfaceC8613b interfaceC8613b : middleware) {
                arrayList.add(interfaceC8613b);
                i10++;
                if (i10 == length) {
                    break;
                }
            }
            listM10833h = arrayList;
        }
        C8612a c8612a = new C8612a(handler, (InterfaceC8613b) AbstractC6662l.m12703F(middleware));
        if (!listM10833h.isEmpty()) {
            ListIterator listIterator = listM10833h.listIterator(listM10833h.size());
            while (listIterator.hasPrevious()) {
                c8612a = new C8612a(c8612a, (InterfaceC8613b) listIterator.previous());
            }
        }
        return c8612a;
    }

    /* renamed from: b */
    public abstract int mo8278b();
}
