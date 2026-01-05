package ky;

import a6.C0058f;
import al.C0174b;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import ee.C2039g;
import fy.InterfaceC2401a;
import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;
import ly.C4579c;
import ly.C4595s;
import ly.C4597u;
import ly.C4599w;
import ly.EnumC4601y;
import my.AbstractC4916a;
import rw.AbstractC6651a;
import rw.C6661k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4271c {

    /* renamed from: d */
    public static final C4270b f21666d = new C4270b(new C4278j(false, true, "    ", TransferTable.COLUMN_TYPE, true, null, EnumC4269a.POLYMORPHIC), AbstractC4916a.f24458a);

    /* renamed from: a */
    public final C4278j f21667a;

    /* renamed from: b */
    public final C0174b f21668b;

    /* renamed from: c */
    public final C4327p f21669c = new C4327p(3);

    public AbstractC4271c(C4278j c4278j, C0174b c0174b) {
        this.f21667a = c4278j;
        this.f21668b = c0174b;
    }

    /* renamed from: a */
    public final Object m8987a(InterfaceC2401a deserializer, String string) {
        AbstractC4154l.m8923f(deserializer, "deserializer");
        AbstractC4154l.m8923f(string, "string");
        C4599w c4599w = new C4599w(string);
        Object objMo7708v = new C4595s(this, EnumC4601y.OBJ, c4599w, deserializer.getDescriptor(), null).mo7708v(deserializer);
        if (c4599w.m9454f() == 10) {
            return objMo7708v;
        }
        C4599w.m9446n(c4599w, "Expected EOF after parsing, but had " + string.charAt(c4599w.f22763b - 1) + " instead", 0, null, 6);
        throw null;
    }

    /* renamed from: b */
    public final String m8988b(InterfaceC2401a serializer, Object obj) {
        char[] cArr;
        AbstractC4154l.m8923f(serializer, "serializer");
        C2039g c2039g = new C2039g(4, (char) 0);
        C4579c c4579c = C4579c.f22707c;
        synchronized (c4579c) {
            C6661k c6661k = (C6661k) c4579c.f2355b;
            cArr = null;
            char[] cArr2 = (char[]) (c6661k.isEmpty() ? null : c6661k.removeLast());
            if (cArr2 != null) {
                c4579c.f2354a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c2039g.f9606c = cArr;
        try {
            EnumC4601y mode = EnumC4601y.OBJ;
            C4597u[] c4597uArr = new C4597u[((AbstractC6651a) EnumC4601y.getEntries()).mo1628b()];
            AbstractC4154l.m8923f(mode, "mode");
            new C4597u(new C0058f(c2039g), this, mode, c4597uArr).mo7721o(serializer, obj);
            return c2039g.toString();
        } finally {
            c2039g.m5765o();
        }
    }
}
