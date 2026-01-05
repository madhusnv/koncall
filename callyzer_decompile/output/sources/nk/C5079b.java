package nk;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import kk.AbstractC4103w;
import kk.C4088h;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.b */
/* loaded from: classes.dex */
public final class C5079b extends AbstractC4103w {

    /* renamed from: c */
    public static final C5078a f24887c = new C5078a();

    /* renamed from: a */
    public final Class f24888a;

    /* renamed from: b */
    public final C5097t f24889b;

    public C5079b(C4088h c4088h, AbstractC4103w abstractC4103w, Class cls) {
        this.f24889b = new C5097t(c4088h, abstractC4103w, cls);
        this.f24888a = cls;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (c6564a.E0() == EnumC6565b.NULL) {
            c6564a.A0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c6564a.mo10024h();
        while (c6564a.mo10023R()) {
            arrayList.add(this.f24889b.f24983c.mo8851b(c6564a));
        }
        c6564a.mo10026w();
        int size = arrayList.size();
        Class cls = this.f24888a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            c6566c.mo10029J();
            return;
        }
        c6566c.mo10030j();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f24889b.mo8852c(c6566c, Array.get(obj, i10));
        }
        c6566c.mo10032w();
    }
}
