package jakarta.mail.internet;

import jakarta.mail.C3680l;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.f */
/* loaded from: classes3.dex */
public final class C3657f implements Enumeration {

    /* renamed from: a */
    public final Iterator f19351a;

    /* renamed from: b */
    public final String[] f19352b;

    /* renamed from: c */
    public final boolean f19353c;

    /* renamed from: d */
    public final boolean f19354d;

    /* renamed from: e */
    public C3656e f19355e = null;

    /* renamed from: f */
    public final /* synthetic */ int f19356f;

    public C3657f(ArrayList arrayList, String[] strArr, boolean z6, boolean z10, int i10) {
        this.f19356f = i10;
        this.f19351a = arrayList.iterator();
        this.f19352b = strArr;
        this.f19353c = z6;
        this.f19354d = z10;
    }

    /* renamed from: a */
    public final Object m8213a() {
        if (this.f19355e == null) {
            this.f19355e = m8214b();
        }
        C3656e c3656e = this.f19355e;
        if (c3656e == null) {
            throw new NoSuchElementException("No more headers");
        }
        this.f19355e = null;
        return this.f19354d ? c3656e.f19350c : new C3680l(c3656e.f19405a, c3656e.mo8212a());
    }

    /* renamed from: b */
    public final C3656e m8214b() {
        C3656e c3656e;
        while (true) {
            Iterator it = this.f19351a;
            if (!it.hasNext()) {
                return null;
            }
            c3656e = (C3656e) it.next();
            if (c3656e.f19350c != null) {
                String[] strArr = this.f19352b;
                boolean z6 = this.f19353c;
                if (strArr != null) {
                    for (String str : strArr) {
                        if (str.equalsIgnoreCase(c3656e.f19405a)) {
                            if (z6) {
                                break;
                            }
                        }
                    }
                    if (!z6) {
                        break;
                    }
                } else if (z6) {
                    return null;
                }
            }
        }
        return c3656e;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        if (this.f19355e == null) {
            this.f19355e = m8214b();
        }
        return this.f19355e != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f19356f) {
            case 0:
                return (C3680l) m8213a();
            default:
                return (String) m8213a();
        }
    }
}
