package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class iuh {

    /* renamed from: a */
    public final List f29247a = new ArrayList();

    /* renamed from: o.iuh$a */
    public static final class C14376a {

        /* renamed from: a */
        public final Class f29248a;

        /* renamed from: b */
        public final Class f29249b;

        /* renamed from: c */
        public final jpe f29250c;

        public C14376a(Class cls, Class cls2, jpe jpeVar) {
            this.f29248a = cls;
            this.f29249b = cls2;
            this.f29250c = jpeVar;
        }

        /* renamed from: a */
        public boolean m32856a(Class cls, Class cls2) {
            return this.f29248a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f29249b);
        }
    }

    /* renamed from: a */
    public synchronized jpe m32853a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return e4i.m24306b();
        }
        for (C14376a c14376a : this.f29247a) {
            if (c14376a.m32856a(cls, cls2)) {
                return c14376a.f29250c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized List m32854b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C14376a c14376a : this.f29247a) {
            if (c14376a.m32856a(cls, cls2) && !arrayList.contains(c14376a.f29249b)) {
                arrayList.add(c14376a.f29249b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void m32855c(Class cls, Class cls2, jpe jpeVar) {
        this.f29247a.add(new C14376a(cls, cls2, jpeVar));
    }
}
